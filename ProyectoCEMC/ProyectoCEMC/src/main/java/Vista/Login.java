package Vista;

import java.awt.Color;

public class Login extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    private IniciarSesion sesion = new IniciarSesion();
    private CrearPaciente crearUsr = new CrearPaciente();
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    public Login() {
        initComponents();
        Btn_CrearUsuario.setFocusPainted(false);
        Btn_CrearUsuario.setBorderPainted(false);
        Btn_CrearUsuario.setOpaque(true);
        Btn_IniciarSesion.setFocusPainted(false);
        Btn_IniciarSesion.setBorderPainted(false);
        Btn_IniciarSesion.setOpaque(true);
    }
    
    public void setSesion(IniciarSesion sesion) {
        this.sesion = sesion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Lbl_Salir = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Btn_CrearUsuario = new javax.swing.JButton();
        Btn_IniciarSesion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEMC");

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Centro de Entrenamiento Mental y Cognitivo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jPanel3.setToolTipText("");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lbl_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, -1, -1));

        Btn_CrearUsuario.setBackground(new java.awt.Color(41, 51, 92));
        Btn_CrearUsuario.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_CrearUsuario.setForeground(new java.awt.Color(250, 250, 250));
        Btn_CrearUsuario.setText("CREAR USUARIO");
        Btn_CrearUsuario.setBorder(null);
        Btn_CrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_CrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_CrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_CrearUsuarioMouseExited(evt);
            }
        });
        Btn_CrearUsuario.addActionListener(this::Btn_CrearUsuarioActionPerformed);

        Btn_IniciarSesion.setBackground(new java.awt.Color(41, 51, 92));
        Btn_IniciarSesion.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_IniciarSesion.setForeground(new java.awt.Color(250, 250, 250));
        Btn_IniciarSesion.setText("INICIAR SESIÓN");
        Btn_IniciarSesion.setBorder(null);
        Btn_IniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_IniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_IniciarSesionMouseExited(evt);
            }
        });
        Btn_IniciarSesion.addActionListener(this::Btn_IniciarSesionActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_CrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Btn_CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Btn_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jPanel5.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Lbl_SalirMouseClicked

    private void Btn_CrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CrearUsuarioMouseEntered
        Btn_CrearUsuario.setBackground(hover);
    }//GEN-LAST:event_Btn_CrearUsuarioMouseEntered

    private void Btn_CrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CrearUsuarioMouseExited
        Btn_CrearUsuario.setBackground(azul);
    }//GEN-LAST:event_Btn_CrearUsuarioMouseExited

    private void Btn_IniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_IniciarSesionMouseEntered
        Btn_IniciarSesion.setBackground(hover);
    }//GEN-LAST:event_Btn_IniciarSesionMouseEntered

    private void Btn_IniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_IniciarSesionMouseExited
        Btn_IniciarSesion.setBackground(azul);
    }//GEN-LAST:event_Btn_IniciarSesionMouseExited

    private void Btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IniciarSesionActionPerformed
        sesion.setLogin(this);
        sesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_IniciarSesionActionPerformed

    private void Btn_CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CrearUsuarioActionPerformed
        crearUsr.setLogin(this);
        crearUsr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_CrearUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CrearUsuario;
    private javax.swing.JButton Btn_IniciarSesion;
    private javax.swing.JLabel Lbl_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}