package Vista;

import Modelo.Programa;
import Modelo.Usuario;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class CrearPrograma extends javax.swing.JFrame {
    private Usuario usuario;
    private Programa programaEdicion;

    public CrearPrograma(Usuario usuario) {
        this(usuario, null);
    }

    public CrearPrograma(Usuario usuario, Programa programaEdicion) {
        this.usuario = usuario;
        this.programaEdicion = programaEdicion; // Usar la misma vista al editar programa
        initComponents();
        setupFields(); // Configurar títulos y placeholders
        if (programaEdicion != null) {
            cargarDatos();
        }
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverMouseClicked(evt);
            }
        });
    }

    private void setupFields() {
        configureField(Txt_Nombre, "Nombre", "Nombre del Programa");
        configureField(Txt_Tipo, "Tipo", "Tipo");
        configureField(Txt_Nivel, "Nivel", "Nivel");
        configureField(Txt_Version, "Versión", "Versión");
        configureField(Txt_Objetivos, "Objetivos", "Objetivos");
        configureField(Txt_Descripcion, "Descripción", "Descripción");
        configureField(Txt_Duracion, "Duración", "Semanas");
        configureField(Txt_Sesiones, "Sesiones", "No. Sesiones");
        configureField(Txt_Costo, "Costo", "0.00");
    }

    private void configureField(JTextField field, String title, String placeholder) {
        // Título pequeño sobre el recuadro con un poco de margen interno para que no se
        // corte el texto
        TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(156, 156, 156)),
                title,
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new java.awt.Font("Roboto", 0, 10),
                new Color(41, 51, 92));

       // field.setBorder(new CompoundBorder(titledBorder, new EmptyBorder(0,0,5,0)));

        // Placeholder logic
        if (programaEdicion == null) {
            field.setText(placeholder);
            field.setForeground(new Color(156, 156, 156));
        } else {
            field.setForeground(Color.BLACK);
        }

        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setText(placeholder);
                    field.setForeground(new Color(156, 156, 156));
                }
            }
        });
    }

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    // esto es para usar la misma vista desde actualizar programa, trucha
    private void cargarDatos() {
        jLabel1.setText("Actualizar Programa");
        setTitle("Actualizar Programa");
        Btn_Guardar.setText("ACTUALIZAR PROGRAMA");

        Txt_Nombre.setText(programaEdicion.getNombre());
        Txt_Tipo.setText(programaEdicion.getTipo());
        Txt_Nivel.setText(programaEdicion.getNivel());
        Txt_Version.setText(programaEdicion.getVersion());
        Txt_Objetivos.setText(programaEdicion.getObjetivos());
        Txt_Descripcion.setText(programaEdicion.getDescripcion());
        Txt_Duracion.setText(String.valueOf(programaEdicion.getDuracion_semanas()));
        Txt_Sesiones.setText(String.valueOf(programaEdicion.getNumero_sesiones()));
        Txt_Costo.setText(String.valueOf(programaEdicion.getCosto()));
    }

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {
        try {

            String nombre = getCleanText(Txt_Nombre, "Nombre del Programa");
            String tipo = getCleanText(Txt_Tipo, "Tipo");
            String nivel = getCleanText(Txt_Nivel, "Nivel");
            String version = getCleanText(Txt_Version, "Versión");
            String objetivos = getCleanText(Txt_Objetivos, "Objetivos");
            String descripcion = getCleanText(Txt_Descripcion, "Descripción");

            if (nombre.isEmpty() || tipo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre y tipo son obligatorios.");
                return;
            }

            int duracion = 0;
            int sesiones = 0;
            double costo = 0.0;

            try {
                String dStr = getCleanText(Txt_Duracion, "Semanas");
                String sStr = getCleanText(Txt_Sesiones, "No. Sesiones");
                String cStr = getCleanText(Txt_Costo, "0.00");

                duracion = dStr.isEmpty() ? 0 : Integer.parseInt(dStr);
                sesiones = sStr.isEmpty() ? 0 : Integer.parseInt(sStr);
                costo = cStr.isEmpty() ? 0.0 : Double.parseDouble(cStr);
            } catch (NumberFormatException e) {

            }

            if (programaEdicion != null) {
                // para actualizar en la misma vista, OJO
                programaEdicion.setNombre(nombre);
                programaEdicion.setTipo(tipo);
                programaEdicion.setNivel(nivel);
                programaEdicion.setVersion(version);
                programaEdicion.setObjetivos(objetivos);
                programaEdicion.setDescripcion(descripcion);
                programaEdicion.setDuracion_semanas(duracion);
                programaEdicion.setNumero_sesiones(sesiones);
                programaEdicion.setCosto(costo);
                programaEdicion.setFecha_actualizacion(Date.valueOf(LocalDate.now()));
                // El entrenador se mantiene???? No lo modifica el admin??
                // El admin sabe SQL, que lo modifique en la base de datos

                programaEdicion.Actualizar();
                JOptionPane.showMessageDialog(this, "Programa actualizado exitosamente.");
            } else {
                // Crear
                Programa prog = new Programa();
                prog.setNombre(nombre);
                prog.setTipo(tipo);
                prog.setNivel(nivel);
                prog.setVersion(version);
                prog.setObjetivos(objetivos);
                prog.setDescripcion(descripcion);
                prog.setDuracion_semanas(duracion);
                prog.setNumero_sesiones(sesiones);
                prog.setCosto(costo);
                prog.setFecha_actualizacion(Date.valueOf(LocalDate.now()));
                prog.setEntrenadores_usuario_idusuario(this.usuario.getIdusuario());
                prog.Guardar();
                JOptionPane.showMessageDialog(this, "Programa creado exitosamente.");
            }
            this.dispose();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de base de datos: " + ex.getMessage());
        }
    }

    private String getCleanText(JTextField field, String placeholder) {
        String text = field.getText();
        if (text.equals(placeholder)) {
            return "";
        }
        return text;
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Tipo = new javax.swing.JTextField();
        Txt_Nivel = new javax.swing.JTextField();
        Txt_Version = new javax.swing.JTextField();
        Txt_Objetivos = new javax.swing.JTextField();
        Txt_Descripcion = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Txt_Duracion = new javax.swing.JTextField();
        Txt_Sesiones = new javax.swing.JTextField();
        Txt_Costo = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        Lbl_Volver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Programa");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Crear Programa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 200, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 270, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        Txt_Nombre.setText("Nombre del Programa");
        Txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombreActionPerformed(evt);
            }
        });
        jPanel5.add(Txt_Nombre);

        Txt_Tipo.setText("Tipo");
        jPanel5.add(Txt_Tipo);

        Txt_Nivel.setText("Nivel");
        jPanel5.add(Txt_Nivel);

        Txt_Version.setText("Versión");
        jPanel5.add(Txt_Version);

        Txt_Objetivos.setText("Objetivos");
        jPanel5.add(Txt_Objetivos);

        Txt_Descripcion.setText("Descripción");
        Txt_Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DescripcionActionPerformed(evt);
            }
        });
        jPanel5.add(Txt_Descripcion);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 740, 150));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 3, 10, 10));

        Txt_Duracion.setText("Duración (Semanas)");
        jPanel6.add(Txt_Duracion);

        Txt_Sesiones.setText("No. Sesiones");
        jPanel6.add(Txt_Sesiones);

        Txt_Costo.setText("Costo");
        jPanel6.add(Txt_Costo);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 740, 100));

        Btn_Guardar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Guardar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Guardar.setText("GUARDAR PROGRAMA");
        jPanel2.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 200, 40));

        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 800, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_DescripcionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt_DescripcionActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt_DescripcionActionPerformed

    private void Txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt_NombreActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt_NombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTextField Txt_Costo;
    private javax.swing.JTextField Txt_Descripcion;
    private javax.swing.JTextField Txt_Duracion;
    private javax.swing.JTextField Txt_Nivel;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Objetivos;
    private javax.swing.JTextField Txt_Sesiones;
    private javax.swing.JTextField Txt_Tipo;
    private javax.swing.JTextField Txt_Version;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
