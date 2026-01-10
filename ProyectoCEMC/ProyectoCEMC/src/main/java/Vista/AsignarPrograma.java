package Vista;

import Modelo.Asigna_ejecuta;
import Modelo.Pacientes;
import Modelo.Programa;
import Modelo.Usuario;
import java.awt.Color;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AsignarPrograma extends javax.swing.JFrame {
    private Usuario usuario;
    private ArrayList<Integer> pacienteIds = new ArrayList<>();
    private ArrayList<Integer> programaIds = new ArrayList<>();
    private int idEntrenador;
    private Integer idPaciente;
    private Integer idPrograma;
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    public AsignarPrograma(Usuario usuario) {
        this(usuario, null);
    }

    public AsignarPrograma(Usuario usuario, Integer idPaciente) {
        this.usuario = usuario;
        this.idEntrenador = usuario.getIdusuario();
        this.idPaciente = idPaciente;
        initComponents();
        if (idPaciente == null) {
            cargarPacientes();
            cargarProgramas();
        } else {
            cargarPaciente(idPaciente);
            cargarProgramasPaciente(idPaciente, idEntrenador);
        }
        Btn_Asignar.setFocusPainted(false);
        Btn_Asignar.setBorderPainted(false);
        Btn_Asignar.setOpaque(true);
        Cmb_Pacientes.setFocusable(false);
        Cmb_Programas.setFocusable(false);

        Btn_Asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AsignarActionPerformed(evt);
            }
        });

        Lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverMouseClicked(evt);
            }
        });
    }

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    private void cargarPacientes() {
        Pacientes modeloPacientes = new Pacientes();
        try {
            ResultSet rs = modeloPacientes.MostrarPorEntrenador(this.usuario.getIdusuario());
            Cmb_Pacientes.removeAllItems();
            pacienteIds.clear();

            Cmb_Pacientes.addItem("Seleccionar Paciente...");
            pacienteIds.add(-1); // Dummy ID for index 0

            while (rs.next()) {
                Integer id = rs.getInt("idusuario");
                String nombre = rs.getString("nombre") + " " + rs.getString("ap_paterno");
                Cmb_Pacientes.addItem(nombre);
                pacienteIds.add(id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar pacientes: " + ex.getMessage());
        }
    }

    private void cargarProgramas() {
        Programa modeloPrograma = new Programa();
        try {
            ResultSet rs = modeloPrograma.Mostrar();
            Cmb_Programas.removeAllItems();
            programaIds.clear();

            Cmb_Programas.addItem("Seleccionar Programa...");
            programaIds.add(-1);

            while (rs.next()) {
                int id = rs.getInt("idprogramas_cognitivos");
                String nombre = rs.getString("nombre");
                Cmb_Programas.addItem(nombre);
                programaIds.add(id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar programas: " + ex.getMessage());
        }
    }

    private void cargarPaciente(Integer idPaciente) {
        Pacientes modeloPacientes = new Pacientes();
        try {
            modeloPacientes.setUsuario_idusuario(idPaciente);
            modeloPacientes.Buscar_paciente();
            ResultSet rs = modeloPacientes.Mostrar_paciente();
            Cmb_Pacientes.removeAllItems();
            pacienteIds.clear();

            Cmb_Pacientes.addItem(rs.getString("nombre") + " " + rs.getString("ap_paterno"));
            pacienteIds.add(rs.getInt("idusuario"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar pacientes: " + ex.getMessage());
        }
    }

    private void cargarProgramasPaciente(Integer idPaciente, Integer idEntrenador) {
        Asigna_ejecuta modeloAsigna_ejecuta = new Asigna_ejecuta();
        try {
            modeloAsigna_ejecuta.setPacientes_usuario_idusuario(idPaciente);
            modeloAsigna_ejecuta.setEntrenadores_usuario_idusuario(idEntrenador);
            ResultSet rs = modeloAsigna_ejecuta.Buscar_paciente_entrenador();
            Cmb_Programas.removeAllItems();
            programaIds.clear();

            Cmb_Programas.addItem("Seleccionar Programa...");
            programaIds.add(-1);

            while (rs.next()) {
                int id = rs.getInt("idprogramas_cognitivos");
                String nombre = rs.getString("nombre");
                String version = rs.getString("version");
                Cmb_Programas.addItem(nombre + " - " + version);
                programaIds.add(id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar programas: " + ex.getMessage());
        }
    }

    private void Btn_AsignarActionPerformed(java.awt.event.ActionEvent evt) {
        int indexPaciente = Cmb_Pacientes.getSelectedIndex();
        int indexPrograma = Cmb_Programas.getSelectedIndex();

        if (indexPaciente <= 0 || indexPrograma <= 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un paciente y un programa.");
            return;
        }

        try {

            if (idPaciente != null) {
                Asigna_ejecuta asignacion = new Asigna_ejecuta();
                asignacion.setPacientes_usuario_idusuario(idPaciente);
                asignacion.setProgramas_cognitivos_idprogramas_cognitivos(programaIds.get(indexPrograma));
                asignacion.setEntrenadores_usuario_idusuario(this.usuario.getIdusuario());
                asignacion.Buscar();

                Txt_FechaInicio.setText(asignacion.getFecha_inicio().toString());
                Txt_FechaFin.setText(asignacion.getFecha_fin().toString());
                Txt_Observaciones.setText(asignacion.getObservaciones());
                Txt_Estatus.setText(asignacion.getEstatus());

                String fechaInicioStr = Txt_FechaInicio.getText();
                String fechaFinStr = Txt_FechaFin.getText();
                String observaciones = Txt_Observaciones.getText();
                String estatus = Txt_Estatus.getText();

                Date fechaInicio = Date
                        .valueOf(fechaInicioStr.equals("Fecha Inicio (YYYY-MM-DD)")
                                ? java.time.LocalDate.now().toString()
                                : fechaInicioStr);
                Date fechaFin = Date.valueOf(
                        fechaFinStr.equals("Fecha Fin (YYYY-MM-DD)")
                                ? java.time.LocalDate.now().plusMonths(1).toString()
                                : fechaFinStr);

                asignacion.setPacientes_usuario_idusuario(idPaciente);
                asignacion.setProgramas_cognitivos_idprogramas_cognitivos(idPrograma);
                asignacion.setEntrenadores_usuario_idusuario(this.usuario.getIdusuario());
                asignacion.setFecha_inicio(fechaInicio);
                asignacion.setFecha_fin(fechaFin);
                asignacion.setObservaciones(observaciones.equals("Observaciones") ? "" : observaciones);
                asignacion.setEstatus(estatus.equals("Estatus (Activo/Pendiente)") ? "Asignado" : estatus);

                asignacion.setFecha_pago(Date.valueOf(java.time.LocalDate.now()));
                asignacion.setMonto_pago(0.0);
                asignacion.setMetodo_pago("Pendiente");
                asignacion.setEstatus_pago("Pendiente");
                asignacion.setFolio("N/A");

                asignacion.Guardar();
                JOptionPane.showMessageDialog(this, "Programa actualizado exitosamente.");
                this.dispose();
            } else {
                int idPaciente = pacienteIds.get(indexPaciente);
                int idPrograma = programaIds.get(indexPrograma);

                String fechaInicioStr = Txt_FechaInicio.getText();
                String fechaFinStr = Txt_FechaFin.getText();
                String observaciones = Txt_Observaciones.getText();
                String estatus = Txt_Estatus.getText();

                Date fechaInicio = Date
                        .valueOf(fechaInicioStr.equals("Fecha Inicio (YYYY-MM-DD)")
                                ? java.time.LocalDate.now().toString()
                                : fechaInicioStr);
                Date fechaFin = Date.valueOf(
                        fechaFinStr.equals("Fecha Fin (YYYY-MM-DD)")
                                ? java.time.LocalDate.now().plusMonths(1).toString()
                                : fechaFinStr);

                Asigna_ejecuta asignacion = new Asigna_ejecuta();
                asignacion.setPacientes_usuario_idusuario(idPaciente);
                asignacion.setProgramas_cognitivos_idprogramas_cognitivos(idPrograma);
                asignacion.setEntrenadores_usuario_idusuario(this.usuario.getIdusuario());
                asignacion.setFecha_inicio(fechaInicio);
                asignacion.setFecha_fin(fechaFin);
                asignacion.setObservaciones(observaciones.equals("Observaciones") ? "" : observaciones);
                asignacion.setEstatus(estatus.equals("Estatus (Activo/Pendiente)") ? "Asignado" : estatus);

                asignacion.setFecha_pago(Date.valueOf(java.time.LocalDate.now()));
                asignacion.setMonto_pago(0.0);
                asignacion.setMetodo_pago("Pendiente");
                asignacion.setEstatus_pago("Pendiente");
                asignacion.setFolio("N/A");

                asignacion.Guardar();
                JOptionPane.showMessageDialog(this, "Programa asignado exitosamente.");
                this.dispose();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al asignar (Verifique fechas YYYY-MM-DD): " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Cmb_Pacientes = new javax.swing.JComboBox<>();
        Cmb_Programas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Txt_FechaInicio = new javax.swing.JTextField();
        Txt_FechaFin = new javax.swing.JTextField();
        Txt_Estatus = new javax.swing.JTextField();
        Txt_Observaciones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Btn_Asignar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asignar Programa");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Asignar Programa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 200, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 50));

        jPanel3.setBackground(new java.awt.Color(177, 157, 104));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 170, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cmb_Pacientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cmb_Pacientes.setForeground(new java.awt.Color(156, 156, 156));
        Cmb_Pacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Paciente..." }));
        Cmb_Pacientes.setBorder(null);
        jPanel5.add(Cmb_Pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 30));

        Cmb_Programas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cmb_Programas.setForeground(new java.awt.Color(156, 156, 156));
        Cmb_Programas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Programa..." }));
        Cmb_Programas.setBorder(null);
        jPanel5.add(Cmb_Programas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 180, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("Paciente y programa");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 100));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_FechaInicio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_FechaInicio.setForeground(new java.awt.Color(156, 156, 156));
        Txt_FechaInicio.setText("Fecha Inicio (YYYY-MM-DD)");
        Txt_FechaInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_FechaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_FechaInicioMouseClicked(evt);
            }
        });
        jPanel6.add(Txt_FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 30));

        Txt_FechaFin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_FechaFin.setForeground(new java.awt.Color(156, 156, 156));
        Txt_FechaFin.setText("Fecha Fin (YYYY-MM-DD)");
        Txt_FechaFin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_FechaFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_FechaFinMouseClicked(evt);
            }
        });
        jPanel6.add(Txt_FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 39, 190, 30));

        Txt_Estatus.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Estatus.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Estatus.setText("Estatus (Activo/Pendiente)");
        Txt_Estatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Estatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_EstatusMouseClicked(evt);
            }
        });
        jPanel6.add(Txt_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 30));

        Txt_Observaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Observaciones.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Observaciones.setText("Observaciones");
        Txt_Observaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Observaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_ObservacionesMouseClicked(evt);
            }
        });
        jPanel6.add(Txt_Observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 51, 92));
        jLabel3.setText("Especificaciones");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 460, 140));

        Btn_Asignar.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Asignar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Asignar.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Asignar.setText("ASIGNAR PROGRAMA");
        Btn_Asignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Asignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_AsignarMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_AsignarMouseExited(evt);
            }
        });
        jPanel2.add(Btn_Asignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 200, 40));

        Lbl_Volver.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_Volver.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Volver.setText("VOLVER");
        Lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 500,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Lbl_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 500, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AsignarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_AsignarMouseEntered
        Btn_Asignar.setBackground(hover);
    }// GEN-LAST:event_Btn_AsignarMouseEntered

    private void Btn_AsignarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Btn_AsignarMouseExited
        Btn_Asignar.setBackground(azul);
    }// GEN-LAST:event_Btn_AsignarMouseExited

    private void Txt_FechaInicioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Txt_FechaInicioMouseClicked
        Txt_FechaInicio.setText("");
    }// GEN-LAST:event_Txt_FechaInicioMouseClicked

    private void Txt_FechaFinMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Txt_FechaFinMouseClicked
        Txt_FechaFin.setText("");
    }// GEN-LAST:event_Txt_FechaFinMouseClicked

    private void Txt_EstatusMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Txt_EstatusMouseClicked
        Txt_Estatus.setText("");
    }// GEN-LAST:event_Txt_EstatusMouseClicked

    private void Txt_ObservacionesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Txt_ObservacionesMouseClicked
        Txt_Observaciones.setText("");
    }// GEN-LAST:event_Txt_ObservacionesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Asignar;
    private javax.swing.JComboBox<String> Cmb_Pacientes;
    private javax.swing.JComboBox<String> Cmb_Programas;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTextField Txt_Estatus;
    private javax.swing.JTextField Txt_FechaFin;
    private javax.swing.JTextField Txt_FechaInicio;
    private javax.swing.JTextField Txt_Observaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
