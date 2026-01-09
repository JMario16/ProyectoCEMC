package Vista;

import java.awt.Color;

// Cambiar Menu dependiendo tipo de usuario

public class Menu extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());

    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);
        
    public Menu() {
        initComponents();
        Btn_Crear.setFocusPainted(false);
        Btn_Crear.setBorderPainted(false);
        Btn_Crear.setOpaque(true);
        Btn_Consulta.setFocusPainted(false);
        Btn_Consulta.setBorderPainted(false);
        Btn_Consulta.setOpaque(true);
        Btn_Actualizar.setFocusPainted(false);
        Btn_Actualizar.setBorderPainted(false);
        Btn_Actualizar.setOpaque(true);
        Btn_Borrar.setFocusPainted(false);
        Btn_Borrar.setBorderPainted(false);
        Btn_Borrar.setOpaque(true);
        Btn_Continuar1.setFocusPainted(false);
        Btn_Continuar1.setBorderPainted(false);
        Btn_Continuar1.setOpaque(true);
        Cmb_Crear.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dlg_Crear = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Lbl_VolverCrear = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Cmb_Crear = new javax.swing.JComboBox<>();
        Btn_Continuar1 = new javax.swing.JButton();
        Dlg_Consulta = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        Lbl_VolverCrear1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Cmb_Consulta = new javax.swing.JComboBox<>();
        Btn_Continuar2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Btn_Crear = new javax.swing.JButton();
        Btn_Consulta = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        Btn_Borrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Lbl_Salir = new javax.swing.JLabel();

        Dlg_Crear.setTitle("Crear");

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_VolverCrear.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_VolverCrear.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_VolverCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_VolverCrear.setText("VOLVER");
        Lbl_VolverCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_VolverCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 51, 92));
        jLabel3.setText("Seleccione una opción:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Cmb_Crear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cmb_Crear.setForeground(new java.awt.Color(156, 156, 156));
        Cmb_Crear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrenador", "Paciente", "Programa cognitivo", "Asignar programa" }));
        Cmb_Crear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel6.add(Cmb_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 180, 30));

        jPanel9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 270, 110));

        Btn_Continuar1.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Continuar1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Continuar1.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Continuar1.setText("CONTINUAR");
        Btn_Continuar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(Btn_Continuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, 40));

        javax.swing.GroupLayout Dlg_CrearLayout = new javax.swing.GroupLayout(Dlg_Crear.getContentPane());
        Dlg_Crear.getContentPane().setLayout(Dlg_CrearLayout);
        Dlg_CrearLayout.setHorizontalGroup(
            Dlg_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Dlg_CrearLayout.setVerticalGroup(
            Dlg_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dlg_CrearLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Dlg_Consulta.setTitle("Consultas");

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(41, 51, 92));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 310));

        jPanel14.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 370, 30));

        Lbl_VolverCrear1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_VolverCrear1.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_VolverCrear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_VolverCrear1.setText("VOLVER");
        Lbl_VolverCrear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_VolverCrear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverCrear1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverCrear1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverCrear1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Seleccione una opción:");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Cmb_Consulta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cmb_Consulta.setForeground(new java.awt.Color(156, 156, 156));
        Cmb_Consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar usuario", "Buscar programa cognitivo", "Buscar asignación de programa", "Mostrar usuarios", "Mostrar entrenadores", "Mostrar pacientes", "Mostrar programas cognitivos", "Mostrar asignaciones de programa" }));
        Cmb_Consulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel8.add(Cmb_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 180, 30));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 270, 110));

        Btn_Continuar2.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Continuar2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Continuar2.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Continuar2.setText("CONTINUAR");
        Btn_Continuar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(Btn_Continuar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, 40));

        javax.swing.GroupLayout Dlg_ConsultaLayout = new javax.swing.GroupLayout(Dlg_Consulta.getContentPane());
        Dlg_Consulta.getContentPane().setLayout(Dlg_ConsultaLayout);
        Dlg_ConsultaLayout.setHorizontalGroup(
            Dlg_ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Dlg_ConsultaLayout.setVerticalGroup(
            Dlg_ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 140, 50));

        jPanel2.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Menú - CEMC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        Btn_Crear.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Crear.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Crear.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Crear.setText("CREAR USUARIO");
        Btn_Crear.setBorder(null);
        Btn_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_CrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_CrearMouseExited(evt);
            }
        });
        Btn_Crear.addActionListener(this::Btn_CrearActionPerformed);

        Btn_Consulta.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Consulta.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Consulta.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Consulta.setText("CONSULTA");
        Btn_Consulta.setBorder(null);
        Btn_Consulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ConsultaMouseExited(evt);
            }
        });
        Btn_Consulta.addActionListener(this::Btn_ConsultaActionPerformed);

        Btn_Actualizar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Actualizar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Actualizar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Actualizar.setText("ACTUALIZAR DATOS");
        Btn_Actualizar.setBorder(null);
        Btn_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ActualizarMouseExited(evt);
            }
        });

        Btn_Borrar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Borrar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Borrar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Borrar.setText("BORRAR");
        Btn_Borrar.setBorder(null);
        Btn_Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_BorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_BorrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 300));

        jPanel5.setToolTipText("");

        Lbl_Salir.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_Salir.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Salir.setText("SALIR");
        Lbl_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, 460, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CrearMouseEntered
        Btn_Crear.setBackground(hover);
    }//GEN-LAST:event_Btn_CrearMouseEntered

    private void Btn_CrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CrearMouseExited
        Btn_Crear.setBackground(azul);
    }//GEN-LAST:event_Btn_CrearMouseExited

    private void Btn_ConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ConsultaMouseEntered
        Btn_Consulta.setBackground(hover);
    }//GEN-LAST:event_Btn_ConsultaMouseEntered

    private void Btn_ConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ConsultaMouseExited
        Btn_Consulta.setBackground(azul);
    }//GEN-LAST:event_Btn_ConsultaMouseExited

    private void Btn_ActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ActualizarMouseEntered
        Btn_Actualizar.setBackground(hover);
    }//GEN-LAST:event_Btn_ActualizarMouseEntered

    private void Btn_ActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ActualizarMouseExited
        Btn_Actualizar.setBackground(azul);
    }//GEN-LAST:event_Btn_ActualizarMouseExited

    private void Btn_BorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseEntered
        Btn_Borrar.setBackground(hover);
    }//GEN-LAST:event_Btn_BorrarMouseEntered

    private void Btn_BorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseExited
        Btn_Borrar.setBackground(azul);
    }//GEN-LAST:event_Btn_BorrarMouseExited

    private void Lbl_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Lbl_SalirMouseClicked

    private void Lbl_VolverCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverCrearMouseClicked
        Dlg_Crear.dispose();
    }//GEN-LAST:event_Lbl_VolverCrearMouseClicked

    private void Btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CrearActionPerformed
        Dlg_Crear.pack();
        Dlg_Crear.setLocationRelativeTo(this);
        Dlg_Crear.setVisible(true);
    }//GEN-LAST:event_Btn_CrearActionPerformed

    private void Lbl_VolverCrear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverCrear1MouseClicked
        Dlg_Consulta.dispose();
    }//GEN-LAST:event_Lbl_VolverCrear1MouseClicked

    private void Btn_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConsultaActionPerformed
        Dlg_Consulta.pack();
        Dlg_Consulta.setLocationRelativeTo(this);
        Dlg_Consulta.setVisible(true);
    }//GEN-LAST:event_Btn_ConsultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Consulta;
    private javax.swing.JButton Btn_Continuar1;
    private javax.swing.JButton Btn_Continuar2;
    private javax.swing.JButton Btn_Crear;
    private javax.swing.JComboBox<String> Cmb_Consulta;
    private javax.swing.JComboBox<String> Cmb_Crear;
    private javax.swing.JDialog Dlg_Consulta;
    private javax.swing.JDialog Dlg_Crear;
    private javax.swing.JLabel Lbl_Salir;
    private javax.swing.JLabel Lbl_VolverCrear;
    private javax.swing.JLabel Lbl_VolverCrear1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
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