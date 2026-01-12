package Vista;

import Modelo.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class BuscarUsuario extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BuscarUsuario.class.getName());
    private Menu menu;
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);
    
    public BuscarUsuario() {
        initComponents();
        Btn_Limpiar.setFocusPainted(false);
        Btn_Limpiar.setBorderPainted(false);
        Btn_Limpiar.setOpaque(true);
        Btn_Buscar.setFocusPainted(false);
        Btn_Buscar.setBorderPainted(false);
        Btn_Buscar.setOpaque(true);
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Telefono = new javax.swing.JTextField();
        Txt_Direccion = new javax.swing.JTextField();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Contrasena = new javax.swing.JTextField();
        Txt_RespRecuperacion = new javax.swing.JTextField();
        Txt_IdUsuario = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar usuario");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Buscar Usuario");

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
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 800, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("Datos personales");

        Txt_Nombre.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Nombre.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Nombre.setText("Nombre");
        Txt_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Nombre.setEnabled(false);

        Txt_ApePaterno.setBackground(new java.awt.Color(250, 250, 250));
        Txt_ApePaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_ApePaterno.setForeground(new java.awt.Color(156, 156, 156));
        Txt_ApePaterno.setText("Primer apellido");
        Txt_ApePaterno.setToolTipText("");
        Txt_ApePaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_ApePaterno.setEnabled(false);

        Txt_ApeMaterno.setBackground(new java.awt.Color(250, 250, 250));
        Txt_ApeMaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_ApeMaterno.setForeground(new java.awt.Color(156, 156, 156));
        Txt_ApeMaterno.setText("Segundo apellido");
        Txt_ApeMaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_ApeMaterno.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_ApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_ApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 530, 90));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 51, 92));
        jLabel3.setText("Información de contacto");

        Txt_Correo.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Correo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Correo.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Correo.setText("Correo");
        Txt_Correo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Correo.setEnabled(false);

        Txt_Telefono.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Telefono.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Telefono.setText("Teléfono");
        Txt_Telefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Telefono.setEnabled(false);

        Txt_Direccion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Direccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Direccion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Direccion.setText("Dirección");
        Txt_Direccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Direccion.setEnabled(false);

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

        Btn_Limpiar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Limpiar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Limpiar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Limpiar.setText("LIMPIAR");
        Btn_Limpiar.setToolTipText("");
        Btn_Limpiar.setBorder(null);
        Btn_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_LimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_LimpiarMouseExited(evt);
            }
        });
        Btn_Limpiar.addActionListener(this::Btn_LimpiarActionPerformed);
        jPanel2.add(Btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 110, 40));

        Btn_Buscar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Buscar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Buscar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Buscar.setText("BUSCAR");
        Btn_Buscar.setBorder(null);
        Btn_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_BuscarMouseExited(evt);
            }
        });
        Btn_Buscar.addActionListener(this::Btn_BuscarActionPerformed);
        jPanel2.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 110, 40));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 51, 92));
        jLabel5.setText("Datos de cuenta");

        Txt_Contrasena.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Contrasena.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Contrasena.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Contrasena.setText("Contraseña");
        Txt_Contrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Contrasena.setEnabled(false);

        Txt_RespRecuperacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_RespRecuperacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_RespRecuperacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_RespRecuperacion.setText("Respuesta de recuperación");
        Txt_RespRecuperacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_RespRecuperacion.setEnabled(false);

        Txt_IdUsuario.setBackground(new java.awt.Color(250, 250, 250));
        Txt_IdUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_IdUsuario.setForeground(new java.awt.Color(156, 156, 156));
        Txt_IdUsuario.setText("ID del usuario");
        Txt_IdUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_IdUsuario.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 530, 90));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Usuario a buscar");

        Txt_Usuario.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Usuario.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Usuario.setText("Ingrese el usuario");
        Txt_Usuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_UsuarioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 210, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Btn_LimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LimpiarMouseEntered
        Btn_Limpiar.setBackground(hover);
    }//GEN-LAST:event_Btn_LimpiarMouseEntered

    private void Btn_LimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LimpiarMouseExited
        Btn_Limpiar.setBackground(azul);
    }//GEN-LAST:event_Btn_LimpiarMouseExited

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        Txt_Nombre.setText("Nombre");
        Txt_ApePaterno.setText("Primer apellido");
        Txt_ApeMaterno.setText("Segundo apellido");

        Txt_Correo.setText("Correo");
        Txt_Telefono.setText("Teléfono");
        Txt_Direccion.setText("Dirección");

        Txt_Contrasena.setText("Contraseña");
        Txt_RespRecuperacion.setText("Respuesta de recuperación");
        Txt_IdUsuario.setText(String.valueOf("ID del usuario"));

        Txt_Usuario.setText("Ingrese el usuario");
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarMouseEntered
        Btn_Buscar.setBackground(hover);
    }//GEN-LAST:event_Btn_BuscarMouseEntered

    private void Btn_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarMouseExited
        Btn_Buscar.setBackground(azul);
    }//GEN-LAST:event_Btn_BuscarMouseExited

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        try {
            if(Txt_Usuario.getText().isEmpty() && Txt_Usuario.getText().equals("Ingrese el usuario")) {
                JOptionPane.showMessageDialog(this, "Falta datos por ingresar.");
            }else {
                Usuario usuario = new Usuario();
                usuario.setUsuario(Txt_Usuario.getText());
                boolean resultado = usuario.BuscarPorUsuario();
                
                if(resultado==true) {
                    Txt_Nombre.setText(usuario.getNombre());
                    Txt_ApePaterno.setText(usuario.getAp_paterno());
                    Txt_ApeMaterno.setText(usuario.getAp_materno());

                    Txt_Correo.setText(usuario.getCorreo());
                    Txt_Telefono.setText(usuario.getTelefono());
                    Txt_Direccion.setText(usuario.getDireccion());

                    Txt_Contrasena.setText(usuario.getContrasena());
                    Txt_RespRecuperacion.setText(usuario.getRespuesta_recuperacion());
                    Txt_IdUsuario.setText(String.valueOf(usuario.getIdusuario()));

                    Txt_Usuario.setText(usuario.getUsuario());
                    
                    JOptionPane.showMessageDialog(this, "Se encontro el usuario.");
                }else {
                    JOptionPane.showMessageDialog(this, "No se encontro el usuario.");
                }
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }        
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_UsuarioMousePressed
        Txt_Usuario.setText("");
    }//GEN-LAST:event_Txt_UsuarioMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTextField Txt_ApeMaterno;
    private javax.swing.JTextField Txt_ApePaterno;
    private javax.swing.JTextField Txt_Contrasena;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Direccion;
    private javax.swing.JTextField Txt_IdUsuario;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_RespRecuperacion;
    private javax.swing.JTextField Txt_Telefono;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}