package Vista;

import Modelo.Pacientes;
import Modelo.Usuario;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AnadirPaciente extends javax.swing.JFrame {

    private Usuario usuario;
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    // Default Constructor for IDE preview
    public AnadirPaciente() {
        initComponents();
        setTitle("Añadir paciente");
    }

    public AnadirPaciente(Usuario usuario) {
        this.usuario = usuario;
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
        DefaultTableModel model = (DefaultTableModel) Tbl_Pacientes.getModel();
        model.setRowCount(0); // Clear existing data

        Pacientes modeloPacientes = new Pacientes();
        try {
            ResultSet rs = modeloPacientes.Mostrar_entrenador(this.usuario.getIdusuario());
            while (rs.next()) {
                int id = rs.getInt("idusuario");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("ap_paterno") + " " + rs.getString("ap_materno");

                model.addRow(new Object[] { id, nombre, apellidos });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar pacientes: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Pacientes = new javax.swing.JTable();
        Lbl_Volver = new javax.swing.JLabel();
        Btn_AnadirPaciente = new javax.swing.JButton();
        Txt_Idpaciente = new javax.swing.JTextField();

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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Añadir Paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 270, 50));

        Tbl_Pacientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tbl_Pacientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "Nombre", "Apellidos"
                }) {
            Class[] types = new Class[] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        javax.swing.table.DefaultTableCellRenderer headerRenderer = new javax.swing.table.DefaultTableCellRenderer();

        headerRenderer.setFont(new java.awt.Font("Roboto", java.awt.Font.BOLD, 14));
        headerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (int i = 0; i < Tbl_Pacientes.getColumnModel().getColumnCount(); i++) {
            Tbl_Pacientes.getColumnModel()
                    .getColumn(i)
                    .setHeaderRenderer(headerRenderer);
        }
        jScrollPane1.setViewportView(Tbl_Pacientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 320));

        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 30));

        Btn_AnadirPaciente.setBackground(new java.awt.Color(41, 51, 92));
        Btn_AnadirPaciente.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_AnadirPaciente.setForeground(new java.awt.Color(250, 250, 250));
        Btn_AnadirPaciente.setText("AÑADIR PACIENTE");
        Btn_AnadirPaciente.setBorder(null);
        Btn_AnadirPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_AnadirPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_AnadirPacienteMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_AnadirPacienteMouseExited(evt);
            }
        });
        Btn_AnadirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AnadirPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_AnadirPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 540, 40));

        Txt_Idpaciente.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Idpaciente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Txt_Idpaciente.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Idpaciente.setText("Ingrese el ID del Paciente ");
        Txt_Idpaciente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Idpaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_IdpacienteMousePressed(evt);
            }
        });
        Txt_Idpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdpacienteActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Idpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 397, 200, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AnadirPacienteMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_AnadirPacienteMouseEntered
        Btn_AnadirPaciente.setBackground(hover);
    }// GEN-LAST:event_Btn_AnadirPacienteMouseEntered

    private void Btn_AnadirPacienteMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_AnadirPacienteMouseExited
        Btn_AnadirPaciente.setBackground(azul);
    }// GEN-LAST:event_Btn_AnadirPacienteMouseExited

    private void Btn_AnadirPacienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Btn_AnadirPacienteActionPerformed
        String idStr = Txt_Idpaciente.getText().trim();
        if (idStr.isEmpty() || idStr.equals("Ingrese el ID del Paciente")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un ID de paciente válido.");
            return;
        }

        try {
            int idPaciente = Integer.parseInt(idStr);
            Pacientes p = new Pacientes();
            p.setIdusuario(idPaciente);

            if (p.Buscar()) {
                // Verificar si ya tiene ese mismo entrenador o ya tiene uno
                if (p.getEntrenadores_usuario_idusuario() == this.usuario.getIdusuario()) {
                    JOptionPane.showMessageDialog(this, "Este paciente ya está asignado a usted.");
                    return;
                }

                p.AsignarEntrenador(this.usuario.getIdusuario());
                JOptionPane.showMessageDialog(this, "Paciente añadido exitosamente.");
                cargarTabla();
                Txt_Idpaciente.setText("Ingrese el ID del Paciente ");
            } else {
                JOptionPane.showMessageDialog(this, "Paciente no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Por favor ingrese un número.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage());
        }
    }// GEN-LAST:event_Btn_AnadirPacienteActionPerformed

    private void Txt_IdpacienteMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Txt_IdpacienteMousePressed
        Txt_Idpaciente.setText("");
    }// GEN-LAST:event_Txt_IdpacienteMousePressed

    private void Txt_IdpacienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Txt_IdpacienteActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Txt_IdpacienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AnadirPaciente;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTable Tbl_Pacientes;
    private javax.swing.JTextField Txt_Idpaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
