package Vista;

import Modelo.Usuario;
import java.awt.Color;
import java.sql.SQLException;

public class Menu extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    private Usuario usuario;
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    public Menu(Usuario usuario) {
        this.usuario = usuario;
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
        Btn_Continuar1.setOpaque(true);
        Cmb_Crear.setFocusable(false);
        initCustomDialogs(); // Inicializa dialogos
        initListeners();
        configurarRoleAccess();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    private void configurarRoleAccess() {
        if (usuario == null)
            return;

        String role = usuario.getRol();
        if (role == null)
            role = "";

        // Reset para configurar por rol
        Cmb_Crear.removeAllItems();
        Cmb_Consulta.removeAllItems();

        if ("Administrador".equalsIgnoreCase(role)) {
            // Admin tiene acceso a todooo
            populateCombo(Cmb_Crear, "Entrenador", "Paciente", "Programa cognitivo", "Asignar programa",
                    "Añadir paciente");
            populateCombo(Cmb_Consulta, "Buscar usuario", "Buscar paciente", "Buscar entrenador", "Buscar programa cognitivo", "Buscar asignación de programa",
                    "Mostrar usuarios", "Mostrar entrenadores", "Mostrar pacientes", "Mostrar programas cognitivos",
                    "Mostrar asignaciones de programa");
            if (Cmb_Actualizar != null) {
                Cmb_Actualizar.removeAllItems();
                populateCombo(Cmb_Actualizar, "Entrenador", "Paciente", "Programa cognitivo", "Asignación de programa");
            }
            if (Cmb_Borrar != null) {
                Cmb_Borrar.removeAllItems();
                populateCombo(Cmb_Borrar, "Usuario", "Entrenador", "Paciente", "Programa cognitivo",
                        "Asignación de programa");
            }
        } else if ("Entrenador".equalsIgnoreCase(role)) {
            populateCombo(Cmb_Crear, "Programa cognitivo", "Asignar programa", "Añadir paciente");
            populateCombo(Cmb_Consulta, "Buscar programa cognitivo", "Buscar paciente", "Buscar asignación de programa",
                    "Mostrar pacientes", "Mostrar programas cognitivos", "Mostrar asignaciones de programa");
            if (Cmb_Actualizar != null) {
                Cmb_Actualizar.removeAllItems();
                populateCombo(Cmb_Actualizar, "Entrenador", "Programa cognitivo", "Asignación de programa");
            }
            if (Cmb_Borrar != null) {
                Cmb_Borrar.removeAllItems();
                populateCombo(Cmb_Borrar, "Programa cognitivo", "Asignación de programa");
            }
        } else if ("Paciente".equalsIgnoreCase(role)) {
            Btn_Crear.setEnabled(false); // Paciente no crea ni maiz
            populateCombo(Cmb_Consulta, "Buscar asignación de programa", "Mostrar entrenador",
                    "Mostrar programas asignados");
            if (Cmb_Actualizar != null) {
                Cmb_Actualizar.removeAllItems();
                populateCombo(Cmb_Actualizar, "Paciente");
            }
            if (Cmb_Borrar != null) {
                Cmb_Borrar.removeAllItems();
                populateCombo(Cmb_Borrar, "Paciente");
            }
        }
    }

    private void populateCombo(javax.swing.JComboBox<String> cmb, String... items) {
        for (String item : items) {
            cmb.addItem(item);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
                        .addComponent(Lbl_VolverCrear, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lbl_VolverCrear, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

        jPanel11.setBackground(new java.awt.Color(41, 51, 92));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE));
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 310));

        jPanel12.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 370, Short.MAX_VALUE));
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 370, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 51, 92));
        jLabel3.setText("Seleccione una opción:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Cmb_Crear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cmb_Crear.setForeground(new java.awt.Color(156, 156, 156));
        Cmb_Crear.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Entrenador", "Paciente", "Programa cognitivo", "Asignar programa" }));
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
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        Dlg_CrearLayout.setVerticalGroup(
                Dlg_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Dlg_CrearLayout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        Dlg_Consulta.setTitle("Consultas");

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(41, 51, 92));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE));
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE));

        jPanel7.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 310));

        jPanel14.setBackground(new java.awt.Color(177, 157, 104));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 370, Short.MAX_VALUE));
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE));

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
                        .addComponent(Lbl_VolverCrear1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lbl_VolverCrear1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE));

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Seleccione una opción:");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Cmb_Consulta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cmb_Consulta.setForeground(new java.awt.Color(156, 156, 156));
        Cmb_Consulta.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar usuario", "Buscar programa cognitivo",
                        "Buscar asignación de programa", "Mostrar usuarios", "Mostrar entrenadores",
                        "Mostrar pacientes", "Mostrar programas cognitivos", "Mostrar asignaciones de programa" }));
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
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        Dlg_ConsultaLayout.setVerticalGroup(
                Dlg_ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

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
                        .addGap(0, 140, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE));

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
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(113, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        Btn_Crear.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Crear.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Crear.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Crear.setText("CREAR");
        Btn_Crear.setBorder(null);
        Btn_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        Btn_Consulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        Btn_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        Btn_Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                                                .addComponent(Btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout
                                                .createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addGroup(jPanel4Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Btn_Consulta,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 158,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel4Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Btn_Borrar,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 158,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Btn_Actualizar,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 158,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(56, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(55, Short.MAX_VALUE)));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 300));

        jPanel5.setToolTipText("");

        Lbl_Salir.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_Salir.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Salir.setText("SALIR");
        Lbl_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lbl_Salir, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lbl_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, 460, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CrearMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_CrearMouseEntered
        Btn_Crear.setBackground(hover);
    }// GEN-LAST:event_Btn_CrearMouseEntered

    private void Btn_CrearMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_CrearMouseExited
        Btn_Crear.setBackground(azul);
    }// GEN-LAST:event_Btn_CrearMouseExited

    private void Btn_ConsultaMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_ConsultaMouseEntered
        Btn_Consulta.setBackground(hover);
    }// GEN-LAST:event_Btn_ConsultaMouseEntered

    private void Btn_ConsultaMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_ConsultaMouseExited
        Btn_Consulta.setBackground(azul);
    }// GEN-LAST:event_Btn_ConsultaMouseExited

    private void Btn_ActualizarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_ActualizarMouseEntered
        Btn_Actualizar.setBackground(hover);
    }// GEN-LAST:event_Btn_ActualizarMouseEntered

    private void Btn_ActualizarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_ActualizarMouseExited
        Btn_Actualizar.setBackground(azul);
    }// GEN-LAST:event_Btn_ActualizarMouseExited

    private void Btn_BorrarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_BorrarMouseEntered
        Btn_Borrar.setBackground(hover);
    }// GEN-LAST:event_Btn_BorrarMouseEntered

    private void Btn_BorrarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_BorrarMouseExited
        Btn_Borrar.setBackground(azul);
    }// GEN-LAST:event_Btn_BorrarMouseExited

    private void Lbl_SalirMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Lbl_SalirMouseClicked
        System.exit(0);
    }// GEN-LAST:event_Lbl_SalirMouseClicked

    private void Lbl_VolverCrearMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Lbl_VolverCrearMouseClicked
        Dlg_Crear.dispose();
    }// GEN-LAST:event_Lbl_VolverCrearMouseClicked

    private void Btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_CrearActionPerformed
        Dlg_Crear.pack();
        Dlg_Crear.setLocationRelativeTo(this);
        Dlg_Crear.setVisible(true);
    }// GEN-LAST:event_Btn_CrearActionPerformed

    private void Lbl_VolverCrear1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Lbl_VolverCrear1MouseClicked
        Dlg_Consulta.dispose();
    }// GEN-LAST:event_Lbl_VolverCrear1MouseClicked

    private void Btn_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_ConsultaActionPerformed
        Dlg_Consulta.pack();
        Dlg_Consulta.setLocationRelativeTo(this);
        Dlg_Consulta.setVisible(true);
    }// GEN-LAST:event_Btn_ConsultaActionPerformed

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
    // Custom Dialogs para Actualizar y Borrar
    private javax.swing.JDialog Dlg_Actualizar;
    private javax.swing.JComboBox<String> Cmb_Actualizar;
    private javax.swing.JButton Btn_Continuar3;

    private javax.swing.JDialog Dlg_Borrar_Dialog;
    private javax.swing.JComboBox<String> Cmb_Borrar;
    private javax.swing.JButton Btn_Continuar4;

    private void initCustomDialogs() {
        // Dlg_Actualizar
        Dlg_Actualizar = new javax.swing.JDialog();
        Dlg_Actualizar.setTitle("Actualizar Datos");
        Cmb_Actualizar = new javax.swing.JComboBox<>();
        Btn_Continuar3 = new javax.swing.JButton("CONTINUAR");
        setupDialog(Dlg_Actualizar, Cmb_Actualizar, Btn_Continuar3);

        // Dlg_Borrar
        Dlg_Borrar_Dialog = new javax.swing.JDialog();
        Dlg_Borrar_Dialog.setTitle("Borrar Datos");
        Cmb_Borrar = new javax.swing.JComboBox<>();
        Btn_Continuar4 = new javax.swing.JButton("CONTINUAR");
        setupDialog(Dlg_Borrar_Dialog, Cmb_Borrar, Btn_Continuar4);

        // Listeners para abrir dialogos
        Btn_Actualizar.addActionListener(e -> {
            Dlg_Actualizar.pack();
            Dlg_Actualizar.setLocationRelativeTo(this);
            Dlg_Actualizar.setVisible(true);
        });

        Btn_Borrar.addActionListener(e -> {
            Dlg_Borrar_Dialog.pack();
            Dlg_Borrar_Dialog.setLocationRelativeTo(this);
            Dlg_Borrar_Dialog.setVisible(true);
        });

        // Listeners para "Continuar" en los dialogos
        Btn_Continuar3.addActionListener(e -> {
            try {
                Btn_Continuar3ActionPerformed(e);
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        Btn_Continuar4.addActionListener(this::Btn_Continuar4ActionPerformed);
    }

    private void setupDialog(javax.swing.JDialog dialog, javax.swing.JComboBox box, javax.swing.JButton btn) {
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(250, 250, 250));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Header
        javax.swing.JPanel header = new javax.swing.JPanel();
        header.setBackground(new java.awt.Color(41, 51, 92));
        panel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 310));

        javax.swing.JPanel top = new javax.swing.JPanel();
        top.setBackground(new java.awt.Color(177, 157, 104));
        panel.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 370, 30));

        // Contenido
        javax.swing.JPanel content = new javax.swing.JPanel();
        content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.JLabel lbl = new javax.swing.JLabel("Seleccione una opción:");
        lbl.setFont(new java.awt.Font("Roboto Condensed", 0, 14));
        lbl.setForeground(new java.awt.Color(41, 51, 92));
        content.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        box.setFont(new java.awt.Font("Roboto", 0, 12));
        box.setForeground(new java.awt.Color(156, 156, 156));
        content.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 180, 30));

        panel.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 270, 110));

        // Button
        btn.setBackground(new java.awt.Color(41, 51, 92));
        btn.setFont(new java.awt.Font("Roboto Condensed", 0, 14));
        btn.setForeground(new java.awt.Color(250, 250, 250));
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, 40));

        // Footer (Volver)
        javax.swing.JLabel lblVolver = new javax.swing.JLabel("VOLVER", javax.swing.SwingConstants.CENTER);
        lblVolver.setFont(new java.awt.Font("Roboto Condensed", 0, 14));
        lblVolver.setForeground(new java.awt.Color(41, 51, 92));
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dialog.dispose();
            }
        });

        javax.swing.JPanel footer = new javax.swing.JPanel(); // Just a container
        footer.setLayout(new java.awt.BorderLayout());
        footer.add(lblVolver, java.awt.BorderLayout.CENTER);
        panel.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

        dialog.add(panel);
        dialog.pack();
    }

    // botones
    private void Btn_Continuar3ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        String seleccion = (String) Cmb_Actualizar.getSelectedItem();
        if (seleccion == null)
            return;

        if ("Entrenador".equals(seleccion)) {
            // If user is editing themselves
            if (usuario.getRol().equalsIgnoreCase("Entrenador")) {
                ActEntrenador v = new ActEntrenador(usuario);
                v.setVisible(true);
            } else {
                String idStr = javax.swing.JOptionPane
                        .showInputDialog("Ingrese ID del " + seleccion + " a actualizar:");
                if (idStr != null && !idStr.isEmpty()) {
                    ActEntrenador v = new ActEntrenador(usuario, Integer.parseInt(idStr));
                    v.setVisible(true);
                }

            }
            Dlg_Actualizar.dispose();
        } else if ("Programa cognitivo".equals(seleccion)) {
            String idStr = javax.swing.JOptionPane.showInputDialog("Ingrese ID del Programa a actualizar:");
            if (idStr != null && !idStr.isEmpty()) {
                try {
                    int id = Integer.parseInt(idStr);
                    Modelo.Programa p = new Modelo.Programa();
                    p.setIdprogramas_cognitivos(id);
                    if (p.Buscar()) {
                        CrearPrograma v = new CrearPrograma(usuario, p);
                        v.setVisible(true);
                        Dlg_Actualizar.dispose();
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Programa no encontrado.");
                    }
                } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "ID inválido.");
                } catch (java.sql.SQLException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage());
                }
            }
        } else if ("Asignación de programa".equals(seleccion)) {
            String idStr = javax.swing.JOptionPane
                    .showInputDialog("Ingrese ID del paciente asociado a la Asignación a actualizar:");
            if (usuario.getRol().equalsIgnoreCase("Entrenador")) {
                if (idStr != null && !idStr.isEmpty()) {
                    try {
                        int id = Integer.parseInt(idStr);
                        AsignarPrograma v = new AsignarPrograma(usuario, id);
                        v.setVisible(true);
                        Dlg_Actualizar.dispose();
                    } catch (NumberFormatException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "ID inválido.");
                    }
                }
            } else {
                String idStr2 = javax.swing.JOptionPane
                        .showInputDialog("Ingrese ID del Entrenador asociado a la Asignación a actualizar:");
                if (idStr2 != null && !idStr2.isEmpty() && idStr != null && !idStr.isEmpty()) {
                    try {
                        int id = Integer.parseInt(idStr);
                        int id2 = Integer.parseInt(idStr2);
                        Usuario e = new Usuario();
                        e.setIdusuario(id2);
                        e.Buscar();
                        AsignarPrograma v = new AsignarPrograma(e, id);
                        v.setVisible(true);
                        Dlg_Actualizar.dispose();
                    } catch (NumberFormatException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "ID inválido.");
                    }
                }
            }
        } else if ("Paciente".equals(seleccion)) {
            // autoedicion
            if (usuario.getRol().equalsIgnoreCase("Paciente")) {
                ActPaciente v = new ActPaciente(usuario);
                v.setVisible(true);
            } else {
                String idStr = javax.swing.JOptionPane
                        .showInputDialog("Ingrese ID del " + seleccion + " a actualizar:");
                if (idStr != null && !idStr.isEmpty()) {
                    ActPaciente v = new ActPaciente(usuario, Integer.parseInt(idStr));
                    v.setVisible(true);
                }
            }
            Dlg_Actualizar.dispose();
        }
    }

    private void Btn_Continuar4ActionPerformed(java.awt.event.ActionEvent evt) {
        String seleccion = (String) Cmb_Borrar.getSelectedItem();
        if (seleccion == null)
            return;

        if ("Programa cognitivo".equals(seleccion)) {
            BorrarPrograma borrarPrograma = new BorrarPrograma();
            borrarPrograma.setMenu(this);
            borrarPrograma.setVisible(true);
            this.setVisible(false);
        } else if ("Usuario".equals(seleccion)) {
            BorrarUsuario borrarUsuario = new BorrarUsuario();
            borrarUsuario.setMenu(this);
            borrarUsuario.setVisible(true);
            this.setVisible(false);
        } else if ("Paciente".equals(seleccion)) {
            BorrarPaciente borrarPaciente = new BorrarPaciente();
            borrarPaciente.setMenu(this);
            borrarPaciente.setVisible(true);
            this.setVisible(false);
        } else if ("Entrenador".equals(seleccion)) {
            BorrarEntrenador borrarEntrenador = new BorrarEntrenador();
            borrarEntrenador.setMenu(this);
            borrarEntrenador.setVisible(true);
            this.setVisible(false);
        } else if ("Asignación de programa".equals(seleccion)) {
            BorrarAsigna borrarAsigna = new BorrarAsigna();
            borrarAsigna.setMenu(this);
            borrarAsigna.setVisible(true);
            this.setVisible(false);
        }

        Dlg_Borrar_Dialog.dispose();
    }

    private void initListeners() {
        Btn_Continuar1.addActionListener(this::Btn_Continuar1ActionPerformed);
        Btn_Continuar2.addActionListener(this::Btn_Continuar2ActionPerformed);
    }

    private void Btn_Continuar1ActionPerformed(java.awt.event.ActionEvent evt) {
        String seleccion = (String) Cmb_Crear.getSelectedItem();
        if (seleccion == null)
            return;

        if ("Añadir paciente".equals(seleccion)) {

            AnadirPaciente v = new AnadirPaciente(usuario);
            v.setVisible(true);
        } else if ("Programa cognitivo".equals(seleccion)) {
            CrearPrograma v = new CrearPrograma(usuario);
            v.setVisible(true);
        } else if ("Asignar programa".equals(seleccion)) {
            AsignarPrograma v = new AsignarPrograma(usuario);
            v.setVisible(true);
        } else if ("Paciente".equals(seleccion)) {
            CrearPaciente v = new CrearPaciente();
            v.setVisible(true);
        } else if ("Entrenador".equals(seleccion)) {
            CrearEntrenador v = new CrearEntrenador();
            v.setVisible(true);
        }
        Dlg_Crear.dispose();
    }

    private void Btn_Continuar2ActionPerformed(java.awt.event.ActionEvent evt) {
        String seleccion = (String) Cmb_Consulta.getSelectedItem();
        if (seleccion == null)
            return;

        switch (seleccion) {
            case "Mostrar pacientes" -> {
                MostrarPacientes v = new MostrarPacientes(usuario);
                v.setVisible(true);
            }
            case "Mostrar entrenadores" -> {
                MostrarEntrenadores v = new MostrarEntrenadores(usuario);
                v.setVisible(true);
            }
            case "Mostrar entrenador" -> {
                MostrarEntrenadores v = new MostrarEntrenadores(usuario);
                v.setVisible(true);
            }
            case "Mostrar asignaciones de programa" -> {
                MostrarAsignaciones v = new MostrarAsignaciones(usuario);
                v.setVisible(true);
            }

            case "Mostrar programas asignados" -> {
                MostrarAsignaciones v = new MostrarAsignaciones(usuario);
                v.setVisible(true);
            }
            case "Mostrar programas cognitivos" -> {
                MostrarProgramasCognitivos v = new MostrarProgramasCognitivos(usuario);
                v.setVisible(true);

            }
            case "Mostrar usuarios" -> {
                MostrarUsuarios v = new MostrarUsuarios(usuario);
                v.setVisible(true);
            }
            case "Buscar programa cognitivo" -> {
                BuscarPrograma buscarPrograma = new BuscarPrograma();
                buscarPrograma.setMenu(this);
                buscarPrograma.setVisible(true);
                this.setVisible(false);
            }
            case "Buscar usuario" -> {
                BuscarUsuario buscarUsuario = new BuscarUsuario();
                buscarUsuario.setMenu(this);
                buscarUsuario.setVisible(true);
                this.setVisible(false);
            }
            case "Buscar paciente" -> {
                BuscarPaciente buscarPaciente = new BuscarPaciente();
                buscarPaciente.setMenu(this);
                buscarPaciente.setVisible(true);
                this.setVisible(false);
            }
            case "Buscar entrenador" -> {
                BuscarEntrenador buscarEntrenador = new BuscarEntrenador();
                buscarEntrenador.setMenu(this);
                buscarEntrenador.setVisible(true);
                this.setVisible(false);
            }
            case "Buscar asignación de programa" -> {
                BuscarAsigna buscarAsigna = new BuscarAsigna();
                buscarAsigna.setMenu(this);
                buscarAsigna.setVisible(true);
                this.setVisible(false);
            }
            default -> {
            }
        }// Anadir otros casos

        Dlg_Consulta.dispose();
    }
}
