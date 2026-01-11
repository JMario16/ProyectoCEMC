package Vista;

import Modelo.Programa;
import Modelo.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class BorrarPrograma extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BorrarPrograma.class.getName());
    private Menu menu;
    
    Color azul = new Color(41, 51, 92);
    Color hover = new Color(49, 69, 168);
    
    public BorrarPrograma() {
        initComponents();
        Btn_MasInfo.setFocusPainted(false);
        Btn_MasInfo.setBorderPainted(false);
        Btn_MasInfo.setOpaque(true);
        Btn_Buscar.setFocusPainted(false);
        Btn_Buscar.setBorderPainted(false);
        Btn_Buscar.setOpaque(true);
        Btn_Limpiar.setFocusPainted(false);
        Btn_Limpiar.setBorderPainted(false);
        Btn_Limpiar.setOpaque(true);
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
        
        if(this.menu.getUsuario().getRol().equals("Administrador")) {
            Btn_MasInfo.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dlg_MasInfo = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Lbl_VolverTratamientos = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Txt_NombreEntrenador = new javax.swing.JTextField();
        Txt_UsuarioEntrenador = new javax.swing.JTextField();
        Txt_IdEntrenador = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl_Volver = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_Nivel = new javax.swing.JTextField();
        Txt_Tipo = new javax.swing.JTextField();
        Txt_Descripcion = new javax.swing.JTextField();
        Txt_Duracion = new javax.swing.JTextField();
        Txt_NumSesiones = new javax.swing.JTextField();
        Txt_Costo = new javax.swing.JTextField();
        Txt_Objetivos = new javax.swing.JTextField();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_MasInfo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Txt_IdPrograma = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Version = new javax.swing.JTextField();
        Txt_FechaActualizacion = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Borrar = new javax.swing.JButton();

        Dlg_MasInfo.setTitle("Información");

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_VolverTratamientos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Lbl_VolverTratamientos.setForeground(new java.awt.Color(41, 51, 92));
        Lbl_VolverTratamientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_VolverTratamientos.setText("VOLVER");
        Lbl_VolverTratamientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lbl_VolverTratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_VolverTratamientosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverTratamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_VolverTratamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 40));

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
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 370, 30));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 51, 92));
        jLabel6.setText("Creado por");

        Txt_NombreEntrenador.setBackground(new java.awt.Color(250, 250, 250));
        Txt_NombreEntrenador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_NombreEntrenador.setForeground(new java.awt.Color(156, 156, 156));
        Txt_NombreEntrenador.setText("Nombre");
        Txt_NombreEntrenador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_NombreEntrenador.setEnabled(false);

        Txt_UsuarioEntrenador.setBackground(new java.awt.Color(250, 250, 250));
        Txt_UsuarioEntrenador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_UsuarioEntrenador.setForeground(new java.awt.Color(156, 156, 156));
        Txt_UsuarioEntrenador.setText("Usuario");
        Txt_UsuarioEntrenador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_UsuarioEntrenador.setEnabled(false);

        Txt_IdEntrenador.setBackground(new java.awt.Color(250, 250, 250));
        Txt_IdEntrenador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_IdEntrenador.setForeground(new java.awt.Color(156, 156, 156));
        Txt_IdEntrenador.setText("ID");
        Txt_IdEntrenador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_IdEntrenador.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_IdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_NombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_UsuarioEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_NombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_UsuarioEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_IdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 170));

        javax.swing.GroupLayout Dlg_MasInfoLayout = new javax.swing.GroupLayout(Dlg_MasInfo.getContentPane());
        Dlg_MasInfo.getContentPane().setLayout(Dlg_MasInfoLayout);
        Dlg_MasInfoLayout.setHorizontalGroup(
            Dlg_MasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Dlg_MasInfoLayout.setVerticalGroup(
            Dlg_MasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Borrar programa");

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 51, 92));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Borrar Programa");

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

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 51, 92));
        jLabel2.setText("Datos del programa");

        Txt_Nombre.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Nombre.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Nombre.setText("Nombre");
        Txt_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Nombre.setEnabled(false);

        Txt_Nivel.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Nivel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Nivel.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Nivel.setText("Nivel");
        Txt_Nivel.setToolTipText("");
        Txt_Nivel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Nivel.setEnabled(false);

        Txt_Tipo.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Tipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Tipo.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Tipo.setText("Tipo");
        Txt_Tipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Tipo.setEnabled(false);

        Txt_Descripcion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Descripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Descripcion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Descripcion.setText("Descripción");
        Txt_Descripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Descripcion.setEnabled(false);

        Txt_Duracion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Duracion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Duracion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Duracion.setText("Duración semanas");
        Txt_Duracion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Duracion.setEnabled(false);

        Txt_NumSesiones.setBackground(new java.awt.Color(250, 250, 250));
        Txt_NumSesiones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_NumSesiones.setForeground(new java.awt.Color(156, 156, 156));
        Txt_NumSesiones.setText("Número de sesiones");
        Txt_NumSesiones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_NumSesiones.setEnabled(false);

        Txt_Costo.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Costo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Costo.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Costo.setText("Costo");
        Txt_Costo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Costo.setEnabled(false);

        Txt_Objetivos.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Objetivos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Objetivos.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Objetivos.setText("Objetivos");
        Txt_Objetivos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Objetivos.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(Txt_Descripcion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Duracion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(Txt_NumSesiones))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 537, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Objetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_NumSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Objetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

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
        jPanel2.add(Btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 110, 40));

        Btn_MasInfo.setBackground(new java.awt.Color(41, 51, 92));
        Btn_MasInfo.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Btn_MasInfo.setForeground(new java.awt.Color(250, 250, 250));
        Btn_MasInfo.setText("MAS INFORMACIÓN");
        Btn_MasInfo.setBorder(null);
        Btn_MasInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_MasInfo.setEnabled(false);
        Btn_MasInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_MasInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_MasInfoMouseExited(evt);
            }
        });
        Btn_MasInfo.addActionListener(this::Btn_MasInfoActionPerformed);
        jPanel2.add(Btn_MasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 160, 40));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 51, 92));
        jLabel4.setText("Programa a borrar");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Txt_IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Txt_IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 240, 90));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 51, 92));
        jLabel5.setText("Versión del programa");

        Txt_Version.setBackground(new java.awt.Color(250, 250, 250));
        Txt_Version.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_Version.setForeground(new java.awt.Color(156, 156, 156));
        Txt_Version.setText("Versión");
        Txt_Version.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_Version.setEnabled(false);

        Txt_FechaActualizacion.setBackground(new java.awt.Color(250, 250, 250));
        Txt_FechaActualizacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_FechaActualizacion.setForeground(new java.awt.Color(156, 156, 156));
        Txt_FechaActualizacion.setText("Fecha actualización");
        Txt_FechaActualizacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        Txt_FechaActualizacion.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Txt_Version, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_FechaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Version, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_FechaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 400, 90));

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
        jPanel2.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 110, 40));

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
        jPanel2.add(Btn_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 110, 40));

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
        Txt_Nombre.setText("Nombre");
        Txt_Nivel.setText("Nivel");
        Txt_Tipo.setText("Tipo");
        Txt_Descripcion.setText("Descripción");
        Txt_Duracion.setText("Duración");
        Txt_NumSesiones.setText("Número de sesiones");
        Txt_Costo.setText("Costo");
        Txt_Objetivos.setText("Objetivos");

        Txt_Version.setText("Versión");
        Txt_FechaActualizacion.setText("Fecha actualización");

        Txt_IdPrograma.setText("Ingrese el ID del programa");
        
        Btn_Borrar.setEnabled(false);

        Btn_MasInfo.setEnabled(false);
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_MasInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MasInfoMouseEntered
        Btn_MasInfo.setBackground(hover);
    }//GEN-LAST:event_Btn_MasInfoMouseEntered

    private void Btn_MasInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MasInfoMouseExited
        Btn_MasInfo.setBackground(azul);
    }//GEN-LAST:event_Btn_MasInfoMouseExited

    private void Btn_MasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MasInfoActionPerformed
        Dlg_MasInfo.pack();
        Dlg_MasInfo.setLocationRelativeTo(this);
        Dlg_MasInfo.setVisible(true);
    }//GEN-LAST:event_Btn_MasInfoActionPerformed

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
        try {
            if(Txt_IdPrograma.getText().isEmpty() && Txt_IdPrograma.getText().equals("Ingrese el ID del programa")) {
                JOptionPane.showMessageDialog(this, "Falta datos por ingresar.");
            }else {
                Programa programa = new Programa();
                programa.setIdprogramas_cognitivos(Integer.parseInt(Txt_IdPrograma.getText()));
                boolean resultado1 = programa.Buscar();
                
                Usuario usuario = new Usuario();
                usuario.setIdusuario(programa.getEntrenadores_usuario_idusuario());
                boolean resultado2 = usuario.Buscar_id();
                
                if(resultado2==true) {
                    Btn_MasInfo.setEnabled(true);
                }

                if(resultado1==true) {
                    Txt_Nombre.setText(programa.getNombre());
                    Txt_Nivel.setText(programa.getNivel());
                    Txt_Tipo.setText(programa.getTipo());
                    Txt_Descripcion.setText(programa.getDescripcion());
                    Txt_Duracion.setText(String.valueOf(programa.getDuracion_semanas()));
                    Txt_NumSesiones.setText(String.valueOf(programa.getNumero_sesiones()));
                    Txt_Costo.setText(String.valueOf(programa.getCosto()));
                    Txt_Objetivos.setText(programa.getObjetivos());
                    
                    Txt_Version.setText(String.valueOf(programa.getVersion()));
                    Txt_FechaActualizacion.setText(String.valueOf(programa.getFecha_actualizacion()));
                    
                    Txt_IdPrograma.setText(String.valueOf(programa.getIdprogramas_cognitivos()));
                    
                    Txt_NombreEntrenador.setText(usuario.getNombre());
                    Txt_UsuarioEntrenador.setText(usuario.getUsuario());
                    Txt_IdEntrenador.setText(String.valueOf(usuario.getIdusuario()));

                    JOptionPane.showMessageDialog(this, "Se encontro el programa.");
                }else {
                    JOptionPane.showMessageDialog(this, "No se encontro el programa.");
                }
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_BorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseEntered
        Btn_Borrar.setBackground(hover);
    }//GEN-LAST:event_Btn_BorrarMouseEntered

    private void Btn_BorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BorrarMouseExited
        Btn_Borrar.setBackground(azul);
    }//GEN-LAST:event_Btn_BorrarMouseExited

    private void Btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarActionPerformed
        Programa programa = new Programa();
        programa.setIdprogramas_cognitivos(Integer.parseInt(Txt_IdPrograma.getText()));
        
        try {
            boolean resultado = programa.Buscar();
            
            if(resultado==true) {
                programa.setVersion("Eliminada");
                programa.Actualizar();
                
                JOptionPane.showMessageDialog(this, "Se ha borrado al usuario correctamente.");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
        
        Btn_Borrar.setEnabled(false);
    }//GEN-LAST:event_Btn_BorrarActionPerformed

    private void Lbl_VolverTratamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_VolverTratamientosMouseClicked
        Dlg_MasInfo.dispose();
    }//GEN-LAST:event_Lbl_VolverTratamientosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_MasInfo;
    private javax.swing.JDialog Dlg_MasInfo;
    private javax.swing.JLabel Lbl_Volver;
    private javax.swing.JLabel Lbl_VolverTratamientos;
    private javax.swing.JTextField Txt_Costo;
    private javax.swing.JTextField Txt_Descripcion;
    private javax.swing.JTextField Txt_Duracion;
    private javax.swing.JTextField Txt_FechaActualizacion;
    private javax.swing.JTextField Txt_IdEntrenador;
    private javax.swing.JTextField Txt_IdPrograma;
    private javax.swing.JTextField Txt_Nivel;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_NombreEntrenador;
    private javax.swing.JTextField Txt_NumSesiones;
    private javax.swing.JTextField Txt_Objetivos;
    private javax.swing.JTextField Txt_Tipo;
    private javax.swing.JTextField Txt_UsuarioEntrenador;
    private javax.swing.JTextField Txt_Version;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
