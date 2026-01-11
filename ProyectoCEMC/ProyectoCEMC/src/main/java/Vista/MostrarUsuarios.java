package Vista;

import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarUsuarios extends javax.swing.JFrame {

    private Usuario usuario;

    // Default Constructor for IDE preview
    public MostrarUsuarios() {
        initComponents();
        setTitle("Mostrar Usuarios");
    }

    public MostrarUsuarios(Usuario usuario) {
        this.usuario=usuario;
        initComponents();
        cargarTabla();

        Lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverMouseClicked(evt);
            }
        });
    }

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    private void cargarTabla() {
        DefaultTableModel model = (DefaultTableModel) Tbl_Usuarios.getModel();
        model.setRowCount(0); // Clear existing data

        Usuario modeloUsuario = new Usuario();
        try {
            ResultSet rs = modeloUsuario.Mostrar();
            while (rs.next()) {
                int id = rs.getInt("idusuario");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("ap_paterno") + " " + rs.getString("ap_materno");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String usuario1 = rs.getString("usuario");
                String pregunta_recuperacion = rs.getString("pregunta_recuperacion");
                String respuesta_recuperacion = rs.getString("respuesta_recuperacion");
                String rol = rs.getString("rol");
                String estatus = rs.getString("estatus");
                String fecha_registro = rs.getString("fecha_registro");
                String ultimo_acceso = rs.getString("ultimo_acceso");

                model.addRow(new Object[] { id, nombre, apellidos, correo, telefono, direccion, usuario1, pregunta_recuperacion, respuesta_recuperacion, rol, estatus, fecha_registro, ultimo_acceso });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar usuarios: " + ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Usuarios = new javax.swing.JTable();
        Lbl_Volver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mis Pacientes");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Mostrar usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 360, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 390, 50));

        Tbl_Usuarios.setBackground(new java.awt.Color(204, 204, 204));
        Tbl_Usuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tbl_Usuarios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tbl_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Correo", "Telefono", "Direccion", "Usuario", "Preg. Recuperacion", "Resp. Recuperacion", "Rol", "Estatus", "Fecha reg.", "Ultimo acceso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Usuarios.setRowHeight(30);
        Tbl_Usuarios.setSelectionBackground(new java.awt.Color(153, 153, 255));
        javax.swing.table.DefaultTableCellRenderer headerRenderer =
        new javax.swing.table.DefaultTableCellRenderer();

        headerRenderer.setFont(new java.awt.Font("Roboto", java.awt.Font.BOLD, 14));
        headerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (int i = 0; i < Tbl_Usuarios.getColumnModel().getColumnCount(); i++) {
            Tbl_Usuarios.getColumnModel()
            .getColumn(i)
            .setHeaderRenderer(headerRenderer);
        }
        jScrollPane1.setViewportView(Tbl_Usuarios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1110, 350));

        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1080, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTable Tbl_Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
