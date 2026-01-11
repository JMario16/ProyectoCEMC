package Vista;

import Modelo.Programa;
import Modelo.Usuario;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    // esto es para usar la misma vista desde actualizar programa, trucha
    private void cargarDatos() {
        jLabel1.setText("Actualizar Programa");
        setTitle("Actualizar Programa");
        Btn_Guardar.setText("ACTUALIZAR PROGRAMA");

        Txt_Nombre.setText("Nombre: " + programaEdicion.getNombre());
        Txt_Tipo.setText("Tipo: " + programaEdicion.getTipo());
        Txt_Nivel.setText("Nivel: " + programaEdicion.getNivel());
        Txt_Version.setText("Version: " + programaEdicion.getVersion());
        Txt_Objetivos.setText("Objetivos: " + programaEdicion.getObjetivos());
        Txt_Descripcion.setText("Descripcion: " + programaEdicion.getDescripcion());
        Txt_Duracion.setText("Duracion: " + String.valueOf(programaEdicion.getDuracion_semanas()));
        Txt_Sesiones.setText("Sesiones: " + String.valueOf(programaEdicion.getNumero_sesiones()));
        Txt_Costo.setText("Costo: " + String.valueOf(programaEdicion.getCosto()));
    }

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {
        try {

            String nombre = Txt_Nombre.getText();
            String tipo = Txt_Tipo.getText();
            String nivel = Txt_Nivel.getText();
            String version = Txt_Version.getText();
            String objetivos = Txt_Objetivos.getText();
            String descripcion = Txt_Descripcion.getText();

            if (nombre.isEmpty() || tipo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre y tipo son obligatorios.");
                return;
            }

            int duracion = 0;
            int sesiones = 0;
            double costo = 0.0;

            try {
                duracion = Integer.parseInt(Txt_Duracion.getText());
                sesiones = Integer.parseInt(Txt_Sesiones.getText());
                costo = Double.parseDouble(Txt_Costo.getText());
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

    @SuppressWarnings("unchecked")

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
