package Vista;

import Modelo.Asigna_ejecuta;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarAsignaciones extends javax.swing.JFrame {

    private Usuario usuario;

    // Default Constructor for IDE preview
    public MostrarAsignaciones() {
        initComponents();
        setTitle("Mostrar Asignaciones de Programas");
    }

    public MostrarAsignaciones(Usuario usuario) {
        this.usuario=usuario;
        initComponents();
        setTitle("Mostrar Asignaciones de Programas");
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
        DefaultTableModel model = (DefaultTableModel) Tbl_Asignaciones.getModel();
        model.setRowCount(0); // Clear existing data

        Asigna_ejecuta modeloAsignaciones = new Asigna_ejecuta();
        try {
            ResultSet rs;
            switch (this.usuario.getRol()) {
                case "Paciente":
                    //Método para mostrar solo programas asignados al paciente
                    rs = modeloAsignaciones.Mostrar_paciente(this.usuario.getIdusuario());
                    break;
                case "Entrenador":
                    //Método para mostrar solo asignaciones hechas por el entrenador
                    rs = modeloAsignaciones.Mostrar_entrenador(this.usuario.getIdusuario());
                    break;
                default:
                    //Mostrar todos los campos de la tabla
                    rs = modeloAsignaciones.Mostrar_admin();
                    break;
            }
            while (rs.next()) {
                int idprograma = rs.getInt("programas_cognitivos_idprogramas_cognitivos");
                int idpaciente = rs.getInt("pacientes_usuario_idusuario");
                int identrenador = rs.getInt("entrenadores_usuario_idusuario");
                String fecha_pago = rs.getString("fecha_pago");
                String monto_pago = rs.getString("monto_pago");
                String metodo_pago = rs.getString("metodo_pago");
                String estatus_pago = rs.getString("estatus_pago");
                String folio = rs.getString("folio");
                String observaciones = rs.getString("observaciones");
                String fecha_inicio = rs.getString("fecha_inicio");
                String fecha_fin = rs.getString("fecha_fin");
                String estatus = ("estatus");

                model.addRow(new Object[] { idprograma, idpaciente, identrenador, fecha_pago, monto_pago, metodo_pago, estatus_pago, folio, observaciones, fecha_inicio, fecha_fin, estatus });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar asignaciones de programas: " + ex.getMessage());
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
        Tbl_Asignaciones = new javax.swing.JTable();
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
        jLabel1.setText("Mostrar Asignaciones De Programas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 360, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 390, 50));

        Tbl_Asignaciones.setBackground(new java.awt.Color(204, 204, 204));
        Tbl_Asignaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tbl_Asignaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tbl_Asignaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Programa", "Id Paciente", "Id Entrenador", "Fecha pago", "Monto pago", "Metodo pago ", "Estatus pago", "Folio", "Observaciones", "Fecha inicio", "Fecha fin", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        Tbl_Asignaciones.setRowHeight(30);
        Tbl_Asignaciones.setSelectionBackground(new java.awt.Color(102, 102, 255));
        javax.swing.table.DefaultTableCellRenderer headerRenderer =
        new javax.swing.table.DefaultTableCellRenderer();

        headerRenderer.setFont(new java.awt.Font("Roboto", java.awt.Font.BOLD, 14));
        headerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (int i = 0; i < Tbl_Asignaciones.getColumnModel().getColumnCount(); i++) {
            Tbl_Asignaciones.getColumnModel()
            .getColumn(i)
            .setHeaderRenderer(headerRenderer);
        }
        jScrollPane1.setViewportView(Tbl_Asignaciones);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1100, 350));

        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTable Tbl_Asignaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
