package Vista;

import Modelo.Pacientes;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarPacientes extends javax.swing.JFrame {

    private Usuario usuario;

    // Default Constructor for IDE preview
    public MostrarPacientes() {
        initComponents();
        setTitle("Mostrar Pacientes");
    }

    public MostrarPacientes(Usuario usuario) {
        this.usuario=usuario;
        initComponents();
        setTitle("Mostrar Pacientes");
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
        DefaultTableModel model = (DefaultTableModel) Tbl_Pacientes.getModel();
        model.setRowCount(0); // Clear existing data

        Pacientes modeloPacientes = new Pacientes();
        try {
            ResultSet rs;
            if (this.usuario.getRol().equals("Entrenador")){
                rs = modeloPacientes.Mostrar_entrenador(this.usuario.getIdusuario());
            } else {
                rs = modeloPacientes.Mostrar_admin();
            }
            while (rs.next()) {
                int id = rs.getInt("idusuario");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("ap_paterno") + " " + rs.getString("ap_materno");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String usuario1 = rs.getString("usuario");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String escolaridad = rs.getString("escolaridad");
                String ocupacion = rs.getString("ocupacion");
                String fecha_ingreso = rs.getString("fecha_ingreso");

                model.addRow(new Object[] { id, nombre, apellidos, correo, telefono, direccion, usuario1, edad, genero, escolaridad, ocupacion, fecha_ingreso });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar pacientes: " + ex.getMessage());
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
        Tbl_Pacientes = new javax.swing.JTable();
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
        jLabel1.setText("Mostrar Pacientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 200, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 420, 50));

        Tbl_Pacientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tbl_Pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Correo", "Telefono", "Direccion", "Usuario", "Edad", "Genero", "Escolaridad", "Ocupacion", "Fecha ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        javax.swing.table.DefaultTableCellRenderer headerRenderer =
        new javax.swing.table.DefaultTableCellRenderer();

        headerRenderer.setFont(new java.awt.Font("Roboto", java.awt.Font.BOLD, 14));
        headerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (int i = 0; i < Tbl_Pacientes.getColumnModel().getColumnCount(); i++) {
            Tbl_Pacientes.getColumnModel()
            .getColumn(i)
            .setHeaderRenderer(headerRenderer);
        }
        jScrollPane1.setViewportView(Tbl_Pacientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1030, 350));

        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1070, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTable Tbl_Pacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
