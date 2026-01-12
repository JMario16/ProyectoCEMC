package Vista;

import Modelo.Certificaciones;
import Modelo.Entrenadores;
import Modelo.Usuario;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BorrarEntrenador extends javax.swing.JFrame {  
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BorrarEntrenador.class.getName());
    private Menu menu;
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);
    
    public BorrarEntrenador() {
        initComponents();
        Btn_Certificaciones.setFocusPainted(false);
        Btn_Certificaciones.setBorderPainted(false);
        Btn_Certificaciones.setOpaque(true);
        Btn_Buscar.setFocusPainted(false);
        Btn_Buscar.setBorderPainted(false);
        Btn_Buscar.setOpaque(true);
        Btn_Limpiar.setFocusPainted(false);
        Btn_Limpiar.setBorderPainted(false);
        Btn_Limpiar.setOpaque(true);
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dlg_Certificaciones = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Certificaciones = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Lbl_VolverCrear = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Telefono = new javax.swing.JTextField();
        Txt_Direccion = new javax.swing.JTextField();
        Btn_Certificaciones = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JTextField();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Borrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_ApePaterno = new javax.swing.JTextField();
        Txt_ApeMaterno = new javax.swing.JTextField();
        Txt_Especialidad = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Contrasena = new javax.swing.JTextField();
        Txt_RespRecuperacion = new javax.swing.JTextField();
        Txt_IdUsuario = new javax.swing.JTextField();

        Dlg_Certificaciones.setTitle("Certificaciones");
        Dlg_Certificaciones.setResizable(false);

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(250, 250, 250));

        Tbl_Certificaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tbl_Certificaciones.setForeground(new java.awt.Color(41, 51, 92));
        Tbl_Certificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Certificacion"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Certificaciones);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 360, 220));

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
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 420, 30));

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
            .addComponent(Lbl_VolverCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 450, 40));

        javax.swing.GroupLayout Dlg_CertificacionesLayout = new javax.swing.GroupLayout(Dlg_Certificaciones.getContentPane());
        Dlg_Certificaciones.getContentPane().setLayout(Dlg_CertificacionesLayout);
        Dlg_CertificacionesLayout.setHorizontalGroup(
            Dlg_CertificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(Dlg_CertificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dlg_CertificacionesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Dlg_CertificacionesLayout.setVerticalGroup(
            Dlg_CertificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(Dlg_CertificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dlg_CertificacionesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Borrar entrenador");

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Borrar Entrenador");

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 40));

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

        Btn_Certificaciones.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Certificaciones.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Certificaciones.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Certificaciones.setText("MOSTRAR CERTIFICACIONES");
        Btn_Certificaciones.setToolTipText("");
        Btn_Certificaciones.setBorder(null);
        Btn_Certificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Certificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_CertificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_CertificacionesMouseExited(evt);
            }
        });
        Btn_Certificaciones.addActionListener(this::Btn_CertificacionesActionPerformed);
        jPanel2.add(Btn_Certificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 190, 40));

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
        jPanel2.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 110, 40));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Entrenador a borrar");

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
        jPanel2.add(Btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 110, 40));

        Btn_Borrar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Borrar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Borrar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Borrar.setText("BORRAR");
        Btn_Borrar.setBorder(null);
        Btn_Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Borrar.setEnabled(false);
        Btn_Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_BorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_BorrarMouseExited(evt);
            }
        });
        Btn_Borrar.addActionListener(this::Btn_BorrarActionPerformed);
        jPanel2.add(Btn_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 110, 40));

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

        Txt_Especialidad.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Especialidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Especialidad.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Especialidad.setText("Especialidad");
        Txt_Especialidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Especialidad.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_ApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_ApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Txt_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(Txt_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 530, 130));

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
        Txt_IdUsuario.setText("ID del entrenador");
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
                        .addComponent(Txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
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

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 530, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Btn_CertificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CertificacionesMouseEntered
        Btn_Certificaciones.setBackground(hover);
    }//GEN-LAST:event_Btn_CertificacionesMouseEntered

    private void Btn_CertificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CertificacionesMouseExited
        Btn_Certificaciones.setBackground(azul);
    }//GEN-LAST:event_Btn_CertificacionesMouseExited

    private void Btn_CertificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CertificacionesActionPerformed
        Dlg_Certificaciones.pack();
        Dlg_Certificaciones.setLocationRelativeTo(this);
        Dlg_Certificaciones.setVisible(true);
    }//GEN-LAST:event_Btn_CertificacionesActionPerformed

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
                boolean resultado1 = usuario.BuscarPorUsuario();

                Entrenadores entrenador = new Entrenadores();
                entrenador.setUsuario_idusuario(usuario.getIdusuario());
                boolean resultado2 = entrenador.Buscar_entrenador();

                cargarTabla(entrenador);
                
                if(resultado1==true && resultado2==true) {
                    Txt_Nombre.setText(usuario.getNombre());
                    Txt_ApePaterno.setText(usuario.getAp_paterno());
                    Txt_ApeMaterno.setText(usuario.getAp_materno());
                    Txt_Especialidad.setText(entrenador.getEspecialidad());

                    Txt_Correo.setText(usuario.getCorreo());
                    Txt_Telefono.setText(usuario.getTelefono());
                    Txt_Direccion.setText(usuario.getDireccion());

                    Txt_Contrasena.setText(usuario.getContrasena());
                    Txt_RespRecuperacion.setText(usuario.getRespuesta_recuperacion());
                    Txt_IdUsuario.setText(String.valueOf(usuario.getIdusuario()));
                    
                    Btn_Borrar.setEnabled(true);

                    Txt_Usuario.setText(usuario.getUsuario());
                    
                    JOptionPane.showMessageDialog(this, "Se encontro el entrenador.");
                }else {
                    JOptionPane.showMessageDialog(this, "No se encontro el entrenador.");
                }
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_UsuarioMousePressed
        Txt_Usuario.setText("");
    }//GEN-LAST:event_Txt_UsuarioMousePressed

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
        Txt_Especialidad.setText("Especialidad");

        Txt_Correo.setText("Correo");
        Txt_Telefono.setText("Teléfono");
        Txt_Direccion.setText("Dirección");

        Txt_Contrasena.setText("Contraseña");
        Txt_RespRecuperacion.setText("Respuesta de recuperación");
        Txt_IdUsuario.setText(String.valueOf("ID del usuario"));
        
        Btn_Borrar.setEnabled(false);
        
        DefaultTableModel model = (DefaultTableModel) Tbl_Certificaciones.getModel();
        model.setRowCount(0);

        Txt_Usuario.setText("Ingrese el usuario");
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_BorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseEntered
        Btn_Borrar.setBackground(hover);
    }//GEN-LAST:event_Btn_BorrarMouseEntered

    private void Btn_BorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseExited
        Btn_Borrar.setBackground(azul);
    }//GEN-LAST:event_Btn_BorrarMouseExited

    private void Btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarActionPerformed
        Usuario usuario = new Usuario();
        usuario.setUsuario(Txt_Usuario.getText());
        
        try {
            boolean resultado = usuario.Buscar();
            
            if(resultado==true) {
                usuario.setEstatus("Eliminada");
                usuario.Actualizar();
                
                JOptionPane.showMessageDialog(this, "Se ha borrado al entrenador correctamente.");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
        
        Btn_Borrar.setEnabled(false);
    }//GEN-LAST:event_Btn_BorrarActionPerformed

    private void Lbl_VolverCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverCrearMouseClicked
        Dlg_Certificaciones.dispose();
    }//GEN-LAST:event_Lbl_VolverCrearMouseClicked

    private void cargarTabla(Entrenadores entrenador) {
        DefaultTableModel model = (DefaultTableModel) Tbl_Certificaciones.getModel();
        model.setRowCount(0);
        
        Certificaciones certificacion = new Certificaciones();
        certificacion.setEntrenadores_usuario_idusuario(entrenador.getUsuario_idusuario());
        
        try {
            ResultSet rs = certificacion.Mostrar_entrenador();
            while (rs.next()) {
                int idcertificaciones = rs.getInt("idcertificaciones");
                String certificaciones = rs.getString("certificaciones");

                model.addRow(new Object[] { idcertificaciones, certificaciones });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar certificaciones: " + ex.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Certificaciones;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JDialog Dlg_Certificaciones;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JLabel Lbl_VolverCrear;
    private javax.swing.JTable Tbl_Certificaciones;
    private javax.swing.JTextField Txt_ApeMaterno;
    private javax.swing.JTextField Txt_ApePaterno;
    private javax.swing.JTextField Txt_Contrasena;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Direccion;
    private javax.swing.JTextField Txt_Especialidad;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
