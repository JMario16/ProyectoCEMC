package Vista;

import Modelo.Pacientes;
import Modelo.Tratamientos;
import Modelo.Usuario;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarPaciente extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BuscarPaciente.class.getName());
    private Menu menu;
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);

    public BuscarPaciente() {
        initComponents();
        Btn_Tratamientos.setFocusPainted(false);
        Btn_Tratamientos.setBorderPainted(false);
        Btn_Tratamientos.setOpaque(true);
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

        Dlg_Tratamientos = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Tratamientos = new javax.swing.JTable();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_ApePaterno = new javax.swing.JTextField();
        Txt_ApeMaterno = new javax.swing.JTextField();
        Txt_Edad = new javax.swing.JTextField();
        Txt_Genero = new javax.swing.JTextField();
        Txt_Escolaridad = new javax.swing.JTextField();
        Txt_Ocupacion = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Telefono = new javax.swing.JTextField();
        Txt_Direccion = new javax.swing.JTextField();
        Btn_Tratamientos = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Contrasena = new javax.swing.JTextField();
        Txt_RespRecuperacion = new javax.swing.JTextField();
        Txt_IdUsuario = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JTextField();
        Btn_Limpiar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Txt_AntecedentesMedicos = new javax.swing.JTextField();
        Txt_Observaciones = new javax.swing.JTextField();
        Txt_Alergias = new javax.swing.JTextField();
        Txt_EstadoTratamiento = new javax.swing.JTextField();

        Dlg_Tratamientos.setTitle("Tratamientos");
        Dlg_Tratamientos.setLocationByPlatform(true);
        Dlg_Tratamientos.setResizable(false);
        Dlg_Tratamientos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(250, 250, 250));

        Tbl_Tratamientos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tbl_Tratamientos.setForeground(new java.awt.Color(41, 51, 92));
        Tbl_Tratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tratamiento", "Medicación", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Tratamientos);

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

        Dlg_Tratamientos.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar paciente");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Buscar Paciente");

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
            .addComponent(Lbl_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 800, 40));

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

        Txt_Edad.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Edad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Edad.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Edad.setText("Edad");
        Txt_Edad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Edad.setEnabled(false);

        Txt_Genero.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Genero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Genero.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Genero.setText("Género");
        Txt_Genero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Genero.setEnabled(false);

        Txt_Escolaridad.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Escolaridad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Escolaridad.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Escolaridad.setText("Escolaridad");
        Txt_Escolaridad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Escolaridad.setEnabled(false);

        Txt_Ocupacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Ocupacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Ocupacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Ocupacion.setText("Ocupación");
        Txt_Ocupacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Ocupacion.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_Ocupacion, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Txt_Nombre)
                            .addComponent(Txt_Edad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_Escolaridad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_ApePaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_ApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10))))
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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Escolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 530, 170));

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

        Btn_Tratamientos.setBackground(new java.awt.Color(41, 51, 92));
        Btn_Tratamientos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_Tratamientos.setForeground(new java.awt.Color(250, 250, 250));
        Btn_Tratamientos.setText("MOSTRAR TRATAMIENTOS");
        Btn_Tratamientos.setToolTipText("");
        Btn_Tratamientos.setBorder(null);
        Btn_Tratamientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Tratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_TratamientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_TratamientosMouseExited(evt);
            }
        });
        Btn_Tratamientos.addActionListener(this::Btn_TratamientosActionPerformed);
        jPanel2.add(Btn_Tratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 190, 40));

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
        jPanel2.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 110, 40));

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
        Txt_IdUsuario.setText("ID del paciente");
        Txt_IdUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_IdUsuario.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Txt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(Txt_RespRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 350, 130));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Paciente a buscar");

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
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 760, 60));

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
        jPanel2.add(Btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 110, 40));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 51, 92));
        jLabel6.setText("Datos médicos");

        Txt_AntecedentesMedicos.setBackground(new java.awt.Color(250, 250, 250));
        Txt_AntecedentesMedicos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_AntecedentesMedicos.setForeground(new java.awt.Color(156, 156, 156));
        Txt_AntecedentesMedicos.setText("Antecedentes");
        Txt_AntecedentesMedicos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_AntecedentesMedicos.setEnabled(false);

        Txt_Observaciones.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Observaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Observaciones.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Observaciones.setText("Observaciones");
        Txt_Observaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Observaciones.setEnabled(false);

        Txt_Alergias.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Alergias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Alergias.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Alergias.setText("Alergias");
        Txt_Alergias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Alergias.setEnabled(false);

        Txt_EstadoTratamiento.setBackground(new java.awt.Color(250, 250, 250));
        Txt_EstadoTratamiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_EstadoTratamiento.setForeground(new java.awt.Color(156, 156, 156));
        Txt_EstadoTratamiento.setText("Tratamiento");
        Txt_EstadoTratamiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_EstadoTratamiento.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_AntecedentesMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_EstadoTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(Txt_Observaciones))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_AntecedentesMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_EstadoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 390, 130));

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverMouseClicked
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_VolverMouseClicked

    private void Btn_TratamientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TratamientosMouseEntered
        Btn_Tratamientos.setBackground(hover);
    }//GEN-LAST:event_Btn_TratamientosMouseEntered

    private void Btn_TratamientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TratamientosMouseExited
        Btn_Tratamientos.setBackground(azul);
    }//GEN-LAST:event_Btn_TratamientosMouseExited

    private void Btn_TratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TratamientosActionPerformed
        Dlg_Tratamientos.pack();
        Dlg_Tratamientos.setLocationRelativeTo(this);
        Dlg_Tratamientos.setVisible(true);
    }//GEN-LAST:event_Btn_TratamientosActionPerformed

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

                Pacientes paciente = new Pacientes();
                paciente.setUsuario_idusuario(usuario.getIdusuario());
                boolean resultado2;
                
                if(menu.getUsuario().getRol().equals("Entrenador")){
                    paciente.setEntrenadores_usuario_idusuario(menu.getUsuario().getIdusuario());
                    resultado2 = paciente.Buscar_paciente_entrenador();
                }else {
                    resultado2 = paciente.Buscar_paciente();
                }

                cargarTabla(paciente);
                
                if(resultado1==true && resultado2==true) {
                    Txt_Nombre.setText(usuario.getNombre());
                    Txt_ApePaterno.setText(usuario.getAp_paterno());
                    Txt_ApeMaterno.setText(usuario.getAp_materno());
                    Txt_Edad.setText(String.valueOf(paciente.getEdad()));
                    Txt_Genero.setText(paciente.getGenero());
                    Txt_Escolaridad.setText(paciente.getEscolaridad());
                    Txt_Ocupacion.setText(paciente.getOcupacion());

                    Txt_Correo.setText(usuario.getCorreo());
                    Txt_Telefono.setText(usuario.getTelefono());
                    Txt_Direccion.setText(usuario.getDireccion());
                    
                    Txt_AntecedentesMedicos.setText(paciente.getAntecedentes_medicos());
                    Txt_Observaciones.setText(paciente.getObservaciones());
                    Txt_Alergias.setText(paciente.getAlergias());
                    Txt_EstadoTratamiento.setText(paciente.getEstado_tratamiento());
                    
                    if(menu.getUsuario().getRol().equals("Entrenador")){
                        Txt_Contrasena.setText(" - - - ");
                        Txt_RespRecuperacion.setText(" - - - ");
                        Txt_IdUsuario.setText(" - - - ");
                    }else {
                        Txt_Contrasena.setText(usuario.getContrasena());
                        Txt_RespRecuperacion.setText(usuario.getRespuesta_recuperacion());
                        Txt_IdUsuario.setText(String.valueOf(usuario.getIdusuario()));
                    }
                    

                    Txt_Usuario.setText(usuario.getUsuario());
                    
                    JOptionPane.showMessageDialog(this, "Se encontro el paciente.");
                }else {
                    JOptionPane.showMessageDialog(this, "No se encontro el paciente.");
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
        Txt_Edad.setText("Edad");
        Txt_Genero.setText("Género");
        Txt_Escolaridad.setText("Escolaridad");
        Txt_Ocupacion.setText("Ocupación");

        Txt_Correo.setText("Correo");
        Txt_Telefono.setText("Teléfono");
        Txt_Direccion.setText("Dirección");
        
        Txt_AntecedentesMedicos.setText("Antecedentes");
        Txt_Observaciones.setText("Observaciones");
        Txt_Alergias.setText("Alergias");
        Txt_EstadoTratamiento.setText("Tratamiento");

        Txt_Contrasena.setText("Contraseña");
        Txt_RespRecuperacion.setText("Respuesta de recuperación");
        Txt_IdUsuario.setText(String.valueOf("ID del paciente"));
        
        DefaultTableModel model = (DefaultTableModel) Tbl_Tratamientos.getModel();
        model.setRowCount(0);

        Txt_Usuario.setText("Ingrese el usuario");
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Lbl_VolverCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverCrearMouseClicked
        Dlg_Tratamientos.dispose();
    }//GEN-LAST:event_Lbl_VolverCrearMouseClicked

    private void cargarTabla(Pacientes paciente) {
        DefaultTableModel model = (DefaultTableModel) Tbl_Tratamientos.getModel();
        model.setRowCount(0);
        
        Tratamientos tratamientos = new Tratamientos();
        tratamientos.setPacientes_usuario_idusuario(paciente.getUsuario_idusuario());
        
        try {
            ResultSet rs = tratamientos.Mostrar_paciente();
            while (rs.next()) {
                int idtratamientos = rs.getInt("idtratamientos");
                String medicacion = rs.getString("medicacion");
                String descripcion = rs.getString("descripcion");

                model.addRow(new Object[] { idtratamientos, medicacion, descripcion });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar pacientes: " + ex.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Tratamientos;
    private javax.swing.JDialog Dlg_Tratamientos;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JLabel Lbl_VolverCrear;
    private javax.swing.JTable Tbl_Tratamientos;
    private javax.swing.JTextField Txt_Alergias;
    private javax.swing.JTextField Txt_AntecedentesMedicos;
    private javax.swing.JTextField Txt_ApeMaterno;
    private javax.swing.JTextField Txt_ApePaterno;
    private javax.swing.JTextField Txt_Contrasena;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Direccion;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_Escolaridad;
    private javax.swing.JTextField Txt_EstadoTratamiento;
    private javax.swing.JTextField Txt_Genero;
    private javax.swing.JTextField Txt_IdUsuario;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Observaciones;
    private javax.swing.JTextField Txt_Ocupacion;
    private javax.swing.JTextField Txt_RespRecuperacion;
    private javax.swing.JTextField Txt_Telefono;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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