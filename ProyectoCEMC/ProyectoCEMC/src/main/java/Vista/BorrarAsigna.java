package Vista;

import Modelo.Asigna_ejecuta;
import java.awt.Color;
import javax.swing.JOptionPane;

public class BorrarAsigna extends javax.swing.JFrame {   
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BorrarAsigna.class.getName());
    private Menu menu;
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);
    
    public BorrarAsigna() {
        initComponents();
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Observaciones = new javax.swing.JTextField();
        Txt_FechaInicio = new javax.swing.JTextField();
        Txt_FechaFin = new javax.swing.JTextField();
        Txt_EstatusPago = new javax.swing.JTextField();
        Txt_MetodoPago = new javax.swing.JTextField();
        Txt_MontoPago = new javax.swing.JTextField();
        Txt_FechaPago = new javax.swing.JTextField();
        Txt_Estatus = new javax.swing.JTextField();
        Txt_Folio = new javax.swing.JTextField();
        Btn_Limpiar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_IdPaciente = new javax.swing.JTextField();
        Txt_IdEntrenador = new javax.swing.JTextField();
        Txt_IdPrograma = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Borrar asignación");

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Borrar Asignación");

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
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 700, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("Datos de la asignación");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 7, -1, -1));

        Txt_Observaciones.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Observaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Observaciones.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Observaciones.setText("Observaciones");
        Txt_Observaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Observaciones.setEnabled(false);
        jPanel5.add(Txt_Observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 36, 240, 29));

        Txt_FechaInicio.setBackground(new java.awt.Color(250, 250, 250));
        Txt_FechaInicio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_FechaInicio.setForeground(new java.awt.Color(156, 156, 156));
        Txt_FechaInicio.setText("Fecha inicio");
        Txt_FechaInicio.setToolTipText("");
        Txt_FechaInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_FechaInicio.setEnabled(false);
        jPanel5.add(Txt_FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 36, 190, 29));

        Txt_FechaFin.setBackground(new java.awt.Color(250, 250, 250));
        Txt_FechaFin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_FechaFin.setForeground(new java.awt.Color(156, 156, 156));
        Txt_FechaFin.setText("Fecha fin");
        Txt_FechaFin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_FechaFin.setEnabled(false);
        jPanel5.add(Txt_FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 36, 173, 29));

        Txt_EstatusPago.setBackground(new java.awt.Color(250, 250, 250));
        Txt_EstatusPago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_EstatusPago.setForeground(new java.awt.Color(156, 156, 156));
        Txt_EstatusPago.setText("Estatus del pago");
        Txt_EstatusPago.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_EstatusPago.setEnabled(false);
        jPanel5.add(Txt_EstatusPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 77, 240, 29));

        Txt_MetodoPago.setBackground(new java.awt.Color(250, 250, 250));
        Txt_MetodoPago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_MetodoPago.setForeground(new java.awt.Color(156, 156, 156));
        Txt_MetodoPago.setText("Método de pago");
        Txt_MetodoPago.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_MetodoPago.setEnabled(false);
        jPanel5.add(Txt_MetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 77, 190, 29));

        Txt_MontoPago.setBackground(new java.awt.Color(250, 250, 250));
        Txt_MontoPago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_MontoPago.setForeground(new java.awt.Color(156, 156, 156));
        Txt_MontoPago.setText("Monto del pago");
        Txt_MontoPago.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_MontoPago.setEnabled(false);
        jPanel5.add(Txt_MontoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 77, 173, 29));

        Txt_FechaPago.setBackground(new java.awt.Color(250, 250, 250));
        Txt_FechaPago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_FechaPago.setForeground(new java.awt.Color(156, 156, 156));
        Txt_FechaPago.setText("Fecha del pago");
        Txt_FechaPago.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_FechaPago.setEnabled(false);
        jPanel5.add(Txt_FechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 118, 188, 29));

        Txt_Estatus.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Estatus.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Estatus.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Estatus.setText("Estatus");
        Txt_Estatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Estatus.setEnabled(false);
        jPanel5.add(Txt_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 120, 190, 29));

        Txt_Folio.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Folio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Folio.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Folio.setText("Folio");
        Txt_Folio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Folio.setEnabled(false);
        jPanel5.add(Txt_Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 118, 172, 29));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 170));

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
        jPanel2.add(Btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 110, 40));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 51, 92));
        jLabel5.setText("Participan");

        Txt_IdPaciente.setBackground(new java.awt.Color(250, 250, 250));
        Txt_IdPaciente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_IdPaciente.setForeground(new java.awt.Color(156, 156, 156));
        Txt_IdPaciente.setText("Ingrese el ID del paciente");
        Txt_IdPaciente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_IdPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_IdPacienteMousePressed(evt);
            }
        });

        Txt_IdEntrenador.setBackground(new java.awt.Color(250, 250, 250));
        Txt_IdEntrenador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_IdEntrenador.setForeground(new java.awt.Color(156, 156, 156));
        Txt_IdEntrenador.setText("Ingrese el ID del entrenador");
        Txt_IdEntrenador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_IdEntrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_IdEntrenadorMousePressed(evt);
            }
        });

        Txt_IdPrograma.setBackground(new java.awt.Color(250, 250, 250));
        Txt_IdPrograma.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_IdPrograma.setForeground(new java.awt.Color(156, 156, 156));
        Txt_IdPrograma.setText("Ingrese el ID del programa");
        Txt_IdPrograma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_IdPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_IdProgramaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Txt_IdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_IdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_IdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 660, 90));

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
        jPanel2.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 110, 40));

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
        jPanel2.add(Btn_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Btn_LimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LimpiarMouseEntered
        Btn_Limpiar.setBackground(hover);
    }//GEN-LAST:event_Btn_LimpiarMouseEntered

    private void Btn_LimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LimpiarMouseExited
        Btn_Limpiar.setBackground(azul);
    }//GEN-LAST:event_Btn_LimpiarMouseExited

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        Txt_Observaciones.setText("Observaciones");
        Txt_FechaInicio.setText("Fecha inicio");
        Txt_FechaFin.setText("Fecha fin");
        Txt_EstatusPago.setText("Estatus del pago");
        Txt_MetodoPago.setText("Método de pago");
        Txt_MontoPago.setText("Monto del pago");
        Txt_FechaPago.setText("Fecha del pago");
        Txt_Folio.setText("Folio");
        Txt_Estatus.setText("Estatus");
        
        Txt_IdPaciente.setEnabled(true);
        Txt_IdEntrenador.setEnabled(true);
        
        Btn_Borrar.setEnabled(false);

        Txt_IdPaciente.setText("Ingrese el ID del paciente");
        Txt_IdEntrenador.setText("Ingrese el ID del entrenador");
        Txt_IdPrograma.setText("Ingrese el ID del programa");
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Txt_IdPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IdPacienteMousePressed
        Txt_IdPaciente.setText("");
    }//GEN-LAST:event_Txt_IdPacienteMousePressed

    private void Txt_IdEntrenadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IdEntrenadorMousePressed
        Txt_IdEntrenador.setText("");
    }//GEN-LAST:event_Txt_IdEntrenadorMousePressed

    private void Txt_IdProgramaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IdProgramaMousePressed
        Txt_IdPrograma.setText("");
    }//GEN-LAST:event_Txt_IdProgramaMousePressed

    private void Btn_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarMouseEntered
        Btn_Buscar.setBackground(hover);
    }//GEN-LAST:event_Btn_BuscarMouseEntered

    private void Btn_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuscarMouseExited
        Btn_Buscar.setBackground(azul);
    }//GEN-LAST:event_Btn_BuscarMouseExited

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        if(menu.getUsuario().getRol().equals("Entrenador")) {
            Txt_IdEntrenador.setEnabled(false);
            Txt_IdEntrenador.setText(String.valueOf(menu.getUsuario().getIdusuario()));
            buscar();
        }else{
            buscar();
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_BorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseEntered
        Btn_Borrar.setBackground(hover);
    }//GEN-LAST:event_Btn_BorrarMouseEntered

    private void Btn_BorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseExited
        Btn_Borrar.setBackground(azul);
    }//GEN-LAST:event_Btn_BorrarMouseExited

    private void Btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarActionPerformed
        Asigna_ejecuta asigna_ejecuta = new Asigna_ejecuta();
        
        asigna_ejecuta.setProgramas_cognitivos_idprogramas_cognitivos(Integer.parseInt(Txt_IdPrograma.getText()));
        asigna_ejecuta.setEntrenadores_usuario_idusuario(Integer.parseInt(Txt_IdEntrenador.getText()));
        asigna_ejecuta.setPacientes_usuario_idusuario(Integer.parseInt(Txt_IdPaciente.getText()));
        
        
        try {
            boolean resultado = asigna_ejecuta.Buscar();
            
            if(resultado==true) {
                asigna_ejecuta.setEstatus("Eliminada");
                asigna_ejecuta.Actualizar();
                
                JOptionPane.showMessageDialog(this, "Se ha borrado al usuario correctamente.");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
        
        Btn_Borrar.setEnabled(false);
    }//GEN-LAST:event_Btn_BorrarActionPerformed

    public void buscar() {
        try {
            if(Txt_IdPaciente.getText().isEmpty() && Txt_IdPaciente.getText().equals("Ingrese el ID del paciente") 
                    && Txt_IdEntrenador.getText().isEmpty() && Txt_IdEntrenador.getText().equals("Ingrese el ID del entrenador")
                    && Txt_IdPrograma.getText().isEmpty() && Txt_IdPrograma.getText().equals("Ingrese el ID del programa")) {
                JOptionPane.showMessageDialog(this, "Falta datos por ingresar.");
            }else {
                Asigna_ejecuta asigna = new Asigna_ejecuta();
                asigna.setProgramas_cognitivos_idprogramas_cognitivos(Integer.parseInt(Txt_IdPrograma.getText()));
                asigna.setEntrenadores_usuario_idusuario(Integer.parseInt(Txt_IdEntrenador.getText()));
                asigna.setPacientes_usuario_idusuario(Integer.parseInt(Txt_IdPaciente.getText()));
                boolean resultado = asigna.Buscar();
                
                if(resultado==true) {
                    Txt_Observaciones.setText(asigna.getObservaciones());
                    Txt_FechaInicio.setText(String.valueOf(asigna.getFecha_inicio()));
                    Txt_FechaFin.setText(String.valueOf(asigna.getFecha_fin()));
                    Txt_EstatusPago.setText(asigna.getEstatus_pago());
                    Txt_MetodoPago.setText(asigna.getMetodo_pago());
                    Txt_MontoPago.setText(String.valueOf(asigna.getMonto_pago()));
                    Txt_FechaPago.setText(String.valueOf(asigna.getFecha_pago()));
                    Txt_Folio.setText(asigna.getFolio());
                    Txt_Estatus.setText(asigna.getEstatus());
                    
                    Btn_Borrar.setEnabled(true);
                    
                    Txt_IdPaciente.setText(String.valueOf(asigna.getPacientes_usuario_idusuario()));
                    Txt_IdEntrenador.setText(String.valueOf(asigna.getEntrenadores_usuario_idusuario()));
                    Txt_IdPrograma.setText(String.valueOf(asigna.getProgramas_cognitivos_idprogramas_cognitivos()));
                    
                    JOptionPane.showMessageDialog(this, "Se encontro la asignacion.");
                }else {
                    JOptionPane.showMessageDialog(this, "No se encontro la asignacion.");
                }
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JTextField Txt_Estatus;
    private javax.swing.JTextField Txt_EstatusPago;
    private javax.swing.JTextField Txt_FechaFin;
    private javax.swing.JTextField Txt_FechaInicio;
    private javax.swing.JTextField Txt_FechaPago;
    private javax.swing.JTextField Txt_Folio;
    private javax.swing.JTextField Txt_IdEntrenador;
    private javax.swing.JTextField Txt_IdPaciente;
    private javax.swing.JTextField Txt_IdPrograma;
    private javax.swing.JTextField Txt_MetodoPago;
    private javax.swing.JTextField Txt_MontoPago;
    private javax.swing.JTextField Txt_Observaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}