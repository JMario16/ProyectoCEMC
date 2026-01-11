package Vista;

import Modelo.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CrearPaciente extends javax.swing.JFrame {
    private Usuario usuario;
    private Menu Menu;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CrearPaciente.class.getName());
    private ArrayList<Tratamientos> tratamientos = new ArrayList<>();
    
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);
    
    public CrearPaciente() {
        
        initComponents();
        Btn_Guardar.setFocusPainted(false);
        Btn_Guardar.setBorderPainted(false);
        Btn_Guardar.setOpaque(true);
        Btn_Tratamientos.setFocusPainted(false);
        Btn_Tratamientos.setBorderPainted(false);
        Btn_Tratamientos.setOpaque(true);
        Btn_OtroTratamiento.setFocusPainted(false);
        Btn_OtroTratamiento.setBorderPainted(false);
        Btn_OtroTratamiento.setOpaque(true);
        setTitle("Crear Paciente");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dlg_Tratamientos = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Lbl_VolverTratamientos = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Txt_TratamientosMedicacion = new javax.swing.JTextField();
        Txt_TratamientosDescripcion = new javax.swing.JTextField();
        Btn_OtroTratamiento = new javax.swing.JButton();
        Btn_GuardarTratamientos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_ApePaterno = new javax.swing.JTextField();
        Txt_ApeMaterno = new javax.swing.JTextField();
        Txt_Edad = new javax.swing.JTextField();
        Txt_Genero = new javax.swing.JTextField();
        Txt_Escolaridad = new javax.swing.JTextField();
        Txt_Ocupacion = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Telefono = new javax.swing.JTextField();
        Txt_Direccion = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Txt_AntecedentesMedicos = new javax.swing.JTextField();
        Txt_Observaciones = new javax.swing.JTextField();
        Txt_Alergias = new javax.swing.JTextField();
        Txt_EstadoTratamiento = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JTextField();
        Txt_Contrasena = new javax.swing.JTextField();
        Txt_PregRecuperacion = new javax.swing.JTextField();
        Txt_RespRecuperacion = new javax.swing.JTextField();
        Btn_Tratamientos = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();

        Dlg_Tratamientos.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Dlg_Tratamientos.setTitle("Tratamientos");
        Dlg_Tratamientos.setModal(true);
        Dlg_Tratamientos.setResizable(false);

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setPreferredSize(new java.awt.Dimension(400, 350));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_VolverTratamientos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_VolverTratamientos.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_VolverTratamientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_VolverTratamientos.setText("VOLVER");
        Lbl_VolverTratamientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_VolverTratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverTratamientosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverTratamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverTratamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

        jPanel11.setBackground(new java.awt.Color(41, 51, 92));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 310));

        jPanel12.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 370, 30));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 51, 92));
        jLabel6.setText("Tratamientos");

        Txt_TratamientosMedicacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_TratamientosMedicacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_TratamientosMedicacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_TratamientosMedicacion.setText("Ingrese la medicación");
        Txt_TratamientosMedicacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_TratamientosMedicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_TratamientosMedicacionMousePressed(evt);
            }
        });

        Txt_TratamientosDescripcion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_TratamientosDescripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_TratamientosDescripcion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_TratamientosDescripcion.setText("Ingrese una descripción");
        Txt_TratamientosDescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_TratamientosDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_TratamientosDescripcionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Txt_TratamientosMedicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_TratamientosDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_TratamientosMedicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_TratamientosDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 210, 130));

        Btn_OtroTratamiento.setBackground(new java.awt.Color(41, 51, 92));
        Btn_OtroTratamiento.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_OtroTratamiento.setForeground(new java.awt.Color(250, 250, 250));
        Btn_OtroTratamiento.setText("OTRO");
        Btn_OtroTratamiento.setBorder(null);
        Btn_OtroTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_OtroTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_OtroTratamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_OtroTratamientoMouseExited(evt);
            }
        });
        Btn_OtroTratamiento.addActionListener(this::Btn_OtroTratamientoActionPerformed);
        jPanel9.add(Btn_OtroTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 100, 40));

        Btn_GuardarTratamientos.setBackground(new java.awt.Color(41, 51, 92));
        Btn_GuardarTratamientos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_GuardarTratamientos.setForeground(new java.awt.Color(250, 250, 250));
        Btn_GuardarTratamientos.setText("GUARDAR");
        Btn_GuardarTratamientos.setBorder(null);
        Btn_GuardarTratamientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_GuardarTratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_GuardarTratamientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_GuardarTratamientosMouseExited(evt);
            }
        });
        Btn_GuardarTratamientos.addActionListener(this::Btn_GuardarTratamientosActionPerformed);
        jPanel9.add(Btn_GuardarTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 110, 40));

        javax.swing.GroupLayout Dlg_TratamientosLayout = new javax.swing.GroupLayout(Dlg_Tratamientos.getContentPane());
        Dlg_Tratamientos.getContentPane().setLayout(Dlg_TratamientosLayout);
        Dlg_TratamientosLayout.setHorizontalGroup(
            Dlg_TratamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Dlg_TratamientosLayout.setVerticalGroup(
            Dlg_TratamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Usuario");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Crear Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 270, 50));

        Lbl_Volver.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 800, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("Datos personales");

        Txt_Nombre.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Nombre.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Nombre.setText("Ingrese su nombre");
        Txt_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_NombreMousePressed(evt);
            }
        });

        Txt_ApePaterno.setBackground(new java.awt.Color(250, 250, 250));
        Txt_ApePaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_ApePaterno.setForeground(new java.awt.Color(156, 156, 156));
        Txt_ApePaterno.setText("Ingrese su primer apellido");
        Txt_ApePaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_ApePaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ApePaternoMousePressed(evt);
            }
        });

        Txt_ApeMaterno.setBackground(new java.awt.Color(250, 250, 250));
        Txt_ApeMaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_ApeMaterno.setForeground(new java.awt.Color(156, 156, 156));
        Txt_ApeMaterno.setText("Ingrese su segundo apellido");
        Txt_ApeMaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_ApeMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ApeMaternoMousePressed(evt);
            }
        });

        Txt_Edad.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Edad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Edad.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Edad.setText("Ingrese su edad");
        Txt_Edad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_EdadMousePressed(evt);
            }
        });

        Txt_Genero.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Genero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Genero.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Genero.setText("Ingrese su género");
        Txt_Genero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_GeneroMousePressed(evt);
            }
        });

        Txt_Escolaridad.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Escolaridad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Escolaridad.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Escolaridad.setText("Ingrese su escolaridad");
        Txt_Escolaridad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Escolaridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_EscolaridadMousePressed(evt);
            }
        });

        Txt_Ocupacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Ocupacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Ocupacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Ocupacion.setText("Ingrese su ocupación");
        Txt_Ocupacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Ocupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_OcupacionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_Ocupacion, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Txt_Nombre)
                            .addComponent(Txt_Edad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_Escolaridad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_ApePaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_ApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Escolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 530, 170));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 51, 92));
        jLabel3.setText("Información de contacto");

        Txt_Correo.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Correo.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Correo.setText("Ingrese su correo");
        Txt_Correo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_CorreoMousePressed(evt);
            }
        });

        Txt_Telefono.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Telefono.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Telefono.setText("Ingrese su teléfono");
        Txt_Telefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_TelefonoMousePressed(evt);
            }
        });

        Txt_Direccion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Direccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Direccion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Direccion.setText("Ingrese su dirección");
        Txt_Direccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_DireccionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 210, 170));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Datos médicos");

        Txt_AntecedentesMedicos.setBackground(new java.awt.Color(250, 250, 250));
        Txt_AntecedentesMedicos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_AntecedentesMedicos.setForeground(new java.awt.Color(156, 156, 156));
        Txt_AntecedentesMedicos.setText("Ingrese sus antecedentes");
        Txt_AntecedentesMedicos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_AntecedentesMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_AntecedentesMedicosMousePressed(evt);
            }
        });

        Txt_Observaciones.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Observaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Observaciones.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Observaciones.setText("Observaciones");
        Txt_Observaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Observaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ObservacionesMousePressed(evt);
            }
        });

        Txt_Alergias.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Alergias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Alergias.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Alergias.setText("Ingrese sus alergias");
        Txt_Alergias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Alergias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_AlergiasMousePressed(evt);
            }
        });

        Txt_EstadoTratamiento.setBackground(new java.awt.Color(250, 250, 250));
        Txt_EstadoTratamiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_EstadoTratamiento.setForeground(new java.awt.Color(156, 156, 156));
        Txt_EstadoTratamiento.setText("Estado de su tratamiento");
        Txt_EstadoTratamiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_EstadoTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_EstadoTratamientoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_AntecedentesMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_EstadoTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(Txt_Observaciones))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_AntecedentesMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_EstadoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 390, 130));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 51, 92));
        jLabel5.setText("Datos de cuenta");

        Txt_Usuario.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Usuario.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Usuario.setText("Cree un usuario");
        Txt_Usuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_UsuarioMousePressed(evt);
            }
        });

        Txt_Contrasena.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Contrasena.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Contrasena.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Contrasena.setText("Cree una contraseña");
        Txt_Contrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ContrasenaMousePressed(evt);
            }
        });

        Txt_PregRecuperacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_PregRecuperacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_PregRecuperacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_PregRecuperacion.setText("Pregunta de recuperación");
        Txt_PregRecuperacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_PregRecuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_PregRecuperacionMousePressed(evt);
            }
        });

        Txt_RespRecuperacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_RespRecuperacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_RespRecuperacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_RespRecuperacion.setText("Respuesta de recuperación");
        Txt_RespRecuperacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_RespRecuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_RespRecuperacionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(Txt_Usuario)
                    .addComponent(Txt_Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_PregRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PregRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 350, 130));

        Btn_Tratamientos.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Tratamientos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Tratamientos.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Tratamientos.setText("AÑADIR TRATAMIENTO");
        Btn_Tratamientos.setBorder(null);
        Btn_Tratamientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Tratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_TratamientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_TratamientosMouseExited(evt);
            }
        });
        Btn_Tratamientos.addActionListener(this::Btn_TratamientosActionPerformed);
        jPanel2.add(Btn_Tratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 190, 30));

        Btn_Guardar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Guardar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Guardar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Guardar.setText("GUARDAR");
        Btn_Guardar.setBorder(null);
        Btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_GuardarMouseExited(evt);
            }
        });
        Btn_Guardar.addActionListener(this::Btn_GuardarActionPerformed);
        jPanel2.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        this.dispose();
        Menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Txt_NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NombreMousePressed
        Txt_Nombre.setText("");
    }//GEN-LAST:event_Txt_NombreMousePressed

    private void Btn_TratamientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TratamientosMouseEntered
        Btn_Tratamientos.setBackground(hover);
    }//GEN-LAST:event_Btn_TratamientosMouseEntered

    private void Btn_GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarMouseEntered
        Btn_Guardar.setBackground(hover);
    }//GEN-LAST:event_Btn_GuardarMouseEntered

    private void Btn_TratamientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TratamientosMouseExited
        Btn_Tratamientos.setBackground(azul);
    }//GEN-LAST:event_Btn_TratamientosMouseExited

    private void Btn_GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarMouseExited
        Btn_Guardar.setBackground(azul);
    }//GEN-LAST:event_Btn_GuardarMouseExited

    private void Txt_ApePaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ApePaternoMousePressed
        Txt_ApePaterno.setText("");
    }//GEN-LAST:event_Txt_ApePaternoMousePressed

    private void Txt_ApeMaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ApeMaternoMousePressed
        Txt_ApeMaterno.setText("");
    }//GEN-LAST:event_Txt_ApeMaternoMousePressed

    private void Txt_EdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EdadMousePressed
        Txt_Edad.setText("");
    }//GEN-LAST:event_Txt_EdadMousePressed

    private void Txt_GeneroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_GeneroMousePressed
        Txt_Genero.setText("");
    }//GEN-LAST:event_Txt_GeneroMousePressed

    private void Txt_OcupacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_OcupacionMousePressed
        Txt_Ocupacion.setText("");
    }//GEN-LAST:event_Txt_OcupacionMousePressed

    private void Txt_EscolaridadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EscolaridadMousePressed
        Txt_Escolaridad.setText("");
    }//GEN-LAST:event_Txt_EscolaridadMousePressed

    private void Txt_CorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CorreoMousePressed
        Txt_Correo.setText("");
    }//GEN-LAST:event_Txt_CorreoMousePressed

    private void Txt_TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TelefonoMousePressed
        Txt_Telefono.setText("");
    }//GEN-LAST:event_Txt_TelefonoMousePressed

    private void Txt_DireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_DireccionMousePressed
        Txt_Direccion.setText("");
    }//GEN-LAST:event_Txt_DireccionMousePressed

    private void Txt_AntecedentesMedicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_AntecedentesMedicosMousePressed
        Txt_AntecedentesMedicos.setText("");
    }//GEN-LAST:event_Txt_AntecedentesMedicosMousePressed

    private void Txt_ObservacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ObservacionesMousePressed
        Txt_Observaciones.setText("");
    }//GEN-LAST:event_Txt_ObservacionesMousePressed

    private void Txt_AlergiasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_AlergiasMousePressed
        Txt_Alergias.setText("");
    }//GEN-LAST:event_Txt_AlergiasMousePressed

    private void Txt_EstadoTratamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EstadoTratamientoMousePressed
        Txt_EstadoTratamiento.setText("");
    }//GEN-LAST:event_Txt_EstadoTratamientoMousePressed

    private void Txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_UsuarioMousePressed
        Txt_Usuario.setText("");
    }//GEN-LAST:event_Txt_UsuarioMousePressed

    private void Txt_ContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ContrasenaMousePressed
        Txt_Contrasena.setText("");
    }//GEN-LAST:event_Txt_ContrasenaMousePressed

    private void Txt_PregRecuperacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_PregRecuperacionMousePressed
        Txt_PregRecuperacion.setText("");
    }//GEN-LAST:event_Txt_PregRecuperacionMousePressed

    private void Txt_RespRecuperacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_RespRecuperacionMousePressed
        Txt_RespRecuperacion.setText("");
    }//GEN-LAST:event_Txt_RespRecuperacionMousePressed

    private void Btn_TratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TratamientosActionPerformed
        Dlg_Tratamientos.pack();
        Dlg_Tratamientos.setLocationRelativeTo(this);
        Dlg_Tratamientos.setVisible(true);
    }//GEN-LAST:event_Btn_TratamientosActionPerformed

    private void Lbl_VolverTratamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverTratamientosMouseClicked
        Dlg_Tratamientos.dispose();
    }//GEN-LAST:event_Lbl_VolverTratamientosMouseClicked

    private void Txt_TratamientosMedicacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TratamientosMedicacionMousePressed
        Txt_TratamientosMedicacion.setText("");
    }//GEN-LAST:event_Txt_TratamientosMedicacionMousePressed

    private void Txt_TratamientosDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TratamientosDescripcionMousePressed
        Txt_TratamientosDescripcion.setText("");
    }//GEN-LAST:event_Txt_TratamientosDescripcionMousePressed

    private void Btn_OtroTratamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_OtroTratamientoMouseEntered
        Btn_OtroTratamiento.setBackground(hover);
    }//GEN-LAST:event_Btn_OtroTratamientoMouseEntered

    private void Btn_OtroTratamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_OtroTratamientoMouseExited
        Btn_OtroTratamiento.setBackground(azul);
    }//GEN-LAST:event_Btn_OtroTratamientoMouseExited

    private void Btn_GuardarTratamientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarTratamientosMouseEntered
        Btn_GuardarTratamientos.setBackground(hover);
    }//GEN-LAST:event_Btn_GuardarTratamientosMouseEntered

    private void Btn_GuardarTratamientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarTratamientosMouseExited
        Btn_GuardarTratamientos.setBackground(azul);
    }//GEN-LAST:event_Btn_GuardarTratamientosMouseExited

    private void Btn_OtroTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OtroTratamientoActionPerformed
        if(!(Txt_TratamientosMedicacion.getText().equals("Ingrese la medicación")) && !(Txt_TratamientosDescripcion.getText().equals("Ingrese una descripción"))) {
            tratamientos.add(new Tratamientos(Txt_TratamientosMedicacion.getText(),Txt_TratamientosDescripcion.getText()));
        } else {
            JOptionPane.showMessageDialog(this,"Por favor, ingrese los campos");
        }
        Txt_TratamientosMedicacion.setText("Ingrese la medicación");
        Txt_TratamientosDescripcion.setText("Ingrese una descripción");
    }//GEN-LAST:event_Btn_OtroTratamientoActionPerformed

    private void Btn_GuardarTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarTratamientosActionPerformed
        if(!(Txt_TratamientosMedicacion.getText().equals("Ingrese la medicación")) && !(Txt_TratamientosDescripcion.getText().equals("Ingrese una descripción"))) {
            tratamientos.add(new Tratamientos(Txt_TratamientosMedicacion.getText(),Txt_TratamientosDescripcion.getText()));
            JOptionPane.showMessageDialog(this,"Tratamientos guardados exitosamente");
        } else {
            JOptionPane.showMessageDialog(this,"Por favor, ingrese los campos");
        }
                
        Dlg_Tratamientos.dispose();
    }//GEN-LAST:event_Btn_GuardarTratamientosActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        try {
            if (!Txt_Usuario.getText().isEmpty() && !Txt_ApeMaterno.getText().isEmpty() 
                && !Txt_ApePaterno.getText().isEmpty() && !Txt_Contrasena.getText().isEmpty() && !Txt_Correo.getText().isEmpty()
                && !Txt_Direccion.getText().isEmpty() && !Txt_Edad.getText().isEmpty() && !Txt_Escolaridad.getText().isEmpty() && !Txt_EstadoTratamiento.getText().isEmpty()
                && !Txt_Genero.getText().isEmpty() && !Txt_Nombre.getText().isEmpty() && !Txt_Ocupacion.getText().isEmpty()
                && !Txt_PregRecuperacion.getText().isEmpty() && !Txt_RespRecuperacion.getText().isEmpty() && !Txt_Telefono.getText().isEmpty()){
                String Alergias = Txt_Alergias.getText().trim();
                String AntecedentesMedicos = Txt_AntecedentesMedicos.getText().trim();
                String ApePaterno = Txt_ApePaterno.getText().trim();
                String ApeMaterno = Txt_ApeMaterno.getText().trim();
                String Contrasena = Txt_Contrasena.getText().trim();
                String Correo = Txt_Correo.getText().trim();
                String Direccion = Txt_Direccion.getText().trim();
                int Edad = Integer.parseInt(Txt_Edad.getText().trim());
                String Escolaridad = Txt_Escolaridad.getText().trim();
                String EstadoTratamiento = Txt_EstadoTratamiento.getText().trim();
                String Gen = null;
                String Nombre = Txt_Nombre.getText().trim();
                String Observaciones = Txt_Observaciones.getText().trim();
                String Ocupacion = Txt_Ocupacion.getText().trim();
                String PregRecuperacion = Txt_PregRecuperacion.getText().trim();
                String RespRecuperacion = Txt_RespRecuperacion.getText().trim();
                String Telefono = Txt_Telefono.getText().trim();
                String Usuario = Txt_Usuario.getText().trim();
                boolean encontrado = false;
                for (Genero g : Genero.values()){
                    if (g.name().equals(Txt_Genero.getText()) || Txt_Genero.getText().equalsIgnoreCase("Hombre") || Txt_Genero.getText().equalsIgnoreCase("Mujer")){
                        Gen = g.toString();
                        encontrado = true;
                    }
                }
                if (encontrado == false){
                    JOptionPane.showMessageDialog(this,"Ingrese un genero valido");
                } else {
                    //Instanciar usuario
                    Usuario usuario = new Usuario(Nombre,ApePaterno,ApeMaterno,Correo,Telefono,Direccion,Usuario,Contrasena,PregRecuperacion,RespRecuperacion,"Paciente");
                    Pacientes paciente = new Pacientes(Edad,Gen,Escolaridad,Ocupacion,AntecedentesMedicos,Alergias,Observaciones,EstadoTratamiento,-1,Nombre,ApePaterno,ApeMaterno,Correo,Telefono,Direccion,Usuario,Contrasena,PregRecuperacion,RespRecuperacion,"Paciente");
                    // Guardar usuario
                    int aux = usuario.Guardar();
                    //Añadir claves foraneas
                    paciente.setUsuario_idusuario(aux);
                    //Guardar paciente
                    paciente.Guardar_paciente();
                    //Guardar tratamientos del paciente
                    for (int i=0; i<tratamientos.size(); i++){
                        tratamientos.get(i).setPacientes_usuario_idusuario(aux);
                        tratamientos.get(i).Guardar();
                    }
                    JOptionPane.showMessageDialog(this,"GUARDADO EXITOSAMENTE");
                }          
            } else {
                JOptionPane.showMessageDialog(this,"Por favor, ingrese todos los campos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.toString());
        } 
        
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_GuardarTratamientos;
    private javax.swing.JButton Btn_OtroTratamiento;
    private javax.swing.JButton Btn_Tratamientos;
    private javax.swing.JDialog Dlg_Tratamientos;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JLabel Lbl_VolverTratamientos;
    private javax.swing.JTextField Txt_Alergias;
    private javax.swing.JTextField Txt_AntecedentesMedicos;
    private javax.swing.JTextField Txt_ApeMaterno;
    private javax.swing.JTextField Txt_ApePaterno;
    private javax.swing.JTextField Txt_Contrasena;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Direccion;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_Escolaridad;
    private javax.swing.JTextField Txt_EstadoTratamiento;
    private javax.swing.JTextField Txt_Genero;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Observaciones;
    private javax.swing.JTextField Txt_Ocupacion;
    private javax.swing.JTextField Txt_PregRecuperacion;
    private javax.swing.JTextField Txt_RespRecuperacion;
    private javax.swing.JTextField Txt_Telefono;
    private javax.swing.JTextField Txt_TratamientosDescripcion;
    private javax.swing.JTextField Txt_TratamientosMedicacion;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}