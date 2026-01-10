package Vista;

import Modelo.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(IniciarSesion.class.getName());
    private Login login;
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    public IniciarSesion() {
        initComponents();
        Btn_Sesion.setFocusPainted(false);
        Btn_Sesion.setBorderPainted(false);
        Btn_Sesion.setOpaque(true);
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Txt_Usuario = new javax.swing.JTextField();
        Btn_Sesion = new javax.swing.JButton();
        Txt_Contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Inicio de Sesión");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 0, 130, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("CONTRASEÑA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 51, 92));
        jLabel3.setText("USUARIO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

        jSeparator1.setBackground(new java.awt.Color(41, 51, 92));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, 10));

        jSeparator2.setBackground(new java.awt.Color(41, 51, 92));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 320, 10));

        Txt_Usuario.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Usuario.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Usuario.setText("Ingrese su Usuario");
        Txt_Usuario.setBorder(null);
        Txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_UsuarioMousePressed(evt);
            }
        });
        Txt_Usuario.addActionListener(this::Txt_UsuarioActionPerformed);
        jPanel1.add(Txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 320, 30));

        Btn_Sesion.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Sesion.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Sesion.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Sesion.setText("INICIAR SESIÓN");
        Btn_Sesion.setBorder(null);
        Btn_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_SesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_SesionMouseExited(evt);
            }
        });
        Btn_Sesion.addActionListener(this::Btn_SesionActionPerformed);
        jPanel1.add(Btn_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, 40));

        Txt_Contrasena.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Contrasena.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Contrasena.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Contrasena.setText("***********");
        Txt_Contrasena.setBorder(null);
        Txt_Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ContrasenaMousePressed(evt);
            }
        });
        Txt_Contrasena.addActionListener(this::Txt_ContrasenaActionPerformed);
        jPanel1.add(Txt_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Btn_SesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SesionMouseEntered
        Btn_Sesion.setBackground(hover);
    }//GEN-LAST:event_Btn_SesionMouseEntered

    private void Btn_SesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SesionMouseExited
        Btn_Sesion.setBackground(azul);
    }//GEN-LAST:event_Btn_SesionMouseExited

    private void Txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_UsuarioMousePressed
        if(Txt_Usuario.getText().equals("Ingrese su Usuario")) {
            Txt_Usuario.setText("");
        }
        
        if(String.valueOf(Txt_Contrasena.getPassword()).isEmpty()) {
            Txt_Contrasena.setText("***********");
        }
    }//GEN-LAST:event_Txt_UsuarioMousePressed

    private void Txt_ContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ContrasenaMousePressed
        if(Txt_Usuario.getText().isEmpty()) {
            Txt_Usuario.setText("Ingrese su Usuario");
        }
        
        if(String.valueOf(Txt_Contrasena.getPassword()).equals("***********")) {
            Txt_Contrasena.setText("");
        }
    }//GEN-LAST:event_Txt_ContrasenaMousePressed

    private void Btn_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SesionActionPerformed
        try {
            if(!(Txt_Usuario.getText().isEmpty()) && !(String.valueOf(Txt_Contrasena.getPassword()).isEmpty())) {
                Usuario usuario = new Usuario();
                usuario.setUsuario(String.valueOf(Txt_Usuario.getText()));
                boolean resultado = usuario.Buscar();
                int intentos = 0;
                
                if(resultado==true) {
                    if(String.valueOf(Txt_Contrasena.getPassword()).equals(usuario.getContrasena())) {
                        Menu menu = new Menu(usuario);
                        menu.setVisible(true);
                        usuario.ActualizarUltimoAcceso();
                        this.dispose();
                    }else {
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta.");
                        
                        intentos++;
                        usuario.setIntentos_fallidos(intentos);
                        
                        // Lógica para intentos fallidos
                    }
                }else {
                    JOptionPane.showMessageDialog(this, "No se encontro el usuario.");
                }
            }else {
                JOptionPane.showMessageDialog(this, "Faltan datos por ingresar.");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_Btn_SesionActionPerformed

    private void Txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_UsuarioActionPerformed
        // TODO add your handling code here:
        Txt_Usuario.setText("");
    }//GEN-LAST:event_Txt_UsuarioActionPerformed

    private void Txt_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ContrasenaActionPerformed
        // TODO add your handling code here:
        Txt_Contrasena.setText("");
    }//GEN-LAST:event_Txt_ContrasenaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Sesion;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JPasswordField Txt_Contrasena;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}