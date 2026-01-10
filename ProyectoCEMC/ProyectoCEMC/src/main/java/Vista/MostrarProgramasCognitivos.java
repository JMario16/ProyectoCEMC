package Vista;

import Modelo.Entrenadores;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarProgramasCognitivos extends javax.swing.JFrame {

    private Usuario usuario;

    // Default Constructor for IDE preview
    public MostrarProgramasCognitivos() {
        initComponents();
        setTitle("Mostrar Programas Cognitivos");
    }

    public MostrarProgramasCognitivos(Usuario usuario) {
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
        DefaultTableModel model = (DefaultTableModel) Tbl_ProgramasCongnitivos.getModel();
        model.setRowCount(0); // Clear existing data

        Entrenadores modeloEntrenadores = new Entrenadores();
        try {
            ResultSet rs = modeloEntrenadores.Mostrar_entrenadores();
            while (rs.next()) {
                int id = rs.getInt("idprogramas_cognitivos");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String tipo = rs.getString("tipo");
                String nivel = rs.getString("Nivel");
                String duracion_semanas = rs.getString("duracion_semanas");
                String numero_sesiones = rs.getString("numero_sesiones");
                String costo = rs.getString("costo");
                String objetivos = rs.getString("objetivos");
                String version = rs.getString("version");
                String fecha_actualizacion = rs.getString("fecha_actualizacion");
                int id_entrenadores = rs.getInt("entrenadores_usuario_idusuario");

                model.addRow(new Object[] { id, nombre, descripcion, tipo, nivel, duracion_semanas, numero_sesiones, costo, objetivos, version, fecha_actualizacion,id_entrenadores });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar programas cognitivos: " + ex.getMessage());
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
        Tbl_ProgramasCongnitivos = new javax.swing.JTable();
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
        jLabel1.setText("Mostrar Programas Cognitivos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 360, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 370, 50));

        Tbl_ProgramasCongnitivos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tbl_ProgramasCongnitivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Tipo", "Nivel", "Duracion", "No. sesiones", "Costo", "Objetivos", "Version", "Actualizacion", "Creador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        for (int i = 0; i < Tbl_ProgramasCongnitivos.getColumnModel().getColumnCount(); i++) {
            Tbl_ProgramasCongnitivos.getColumnModel()
            .getColumn(i)
            .setHeaderRenderer(headerRenderer);
        }
        jScrollPane1.setViewportView(Tbl_ProgramasCongnitivos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1040, 350));

        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1080, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTable Tbl_ProgramasCongnitivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
