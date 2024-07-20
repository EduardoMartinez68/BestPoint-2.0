package puestosEmpleados;

import ClasesGlobales.Agregar;
import ClasesGlobales.Eliminar;
import ClasesGlobales.TableEdit;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import Opciones.FrameOpcionesCajeros;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import puntoventa.FrameInventario;

public class FramePuestos extends javax.swing.JFrame {
    private ActualizarTablaPuestos obj;
    FrameOpcionesCajeros FC;
    Connection con;
    FrameInventario JF;
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    int idPuesto=-1;
    String nombrePuestoEdit="";
    
    public FramePuestos(Connection con,FrameInventario JF,FrameOpcionesCajeros FC) {
        this.FC=FC;
        this.JF=JF;
        this.con=con;
        this.add=new Agregar(con,JF,null);
        this.delete=new Eliminar(con);
        initComponents();
        llenarCheckComboBox();
        actualizarTablaCarrito();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        centrarPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelBtnExit1 = new javax.swing.JPanel();
        labelExit1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTipoSalario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtComisiones = new javax.swing.JTextField();
        CheckBoxHora = new checkbox.JCheckBoxCustom();
        CheckBoxDia = new checkbox.JCheckBoxCustom();
        CheckBoxQuincena = new checkbox.JCheckBoxCustom();
        txtNombre = new textfield.TextField();
        txtDescripcion = new textfield.TextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTipoSalarioEdit = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtSalarioEdit = new javax.swing.JTextField();
        txtDescuentoEdit = new javax.swing.JTextField();
        txtComisionEdit = new javax.swing.JTextField();
        txtNombreEdit = new textfield.TextField();
        txtDescripcionPuesto = new textfield.TextField();
        CheckBoxQuincenaEdit = new checkbox.JCheckBoxCustom();
        jLabel7 = new javax.swing.JLabel();
        CheckBoxHoraEdit = new checkbox.JCheckBoxCustom();
        CheckBoxDiaEdit = new checkbox.JCheckBoxCustom();
        jLabel17 = new javax.swing.JLabel();
        txtBusqueda = new combo_suggestion.ComboBoxSuggestion();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javaswingdev.swing.table.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(22, 35, 105));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel11MouseDragged(evt);
            }
        });
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Puestos de trabajo");

        panelBtnExit1.setBackground(new java.awt.Color(22, 35, 105));

        labelExit1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelExit1.setForeground(new java.awt.Color(0, 0, 0));
        labelExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit1.setText("X");
        labelExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelExit1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtnExit1Layout = new javax.swing.GroupLayout(panelBtnExit1);
        panelBtnExit1.setLayout(panelBtnExit1Layout);
        panelBtnExit1Layout.setHorizontalGroup(
            panelBtnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnExit1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(labelExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBtnExit1Layout.setVerticalGroup(
            panelBtnExit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnExit1Layout.createSequentialGroup()
                .addComponent(labelExit1)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 900, Short.MAX_VALUE)
                .addComponent(panelBtnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(panelBtnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Comisiones");

        jLabel4.setText("%");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("El calculo de salario sera por");

        jLabel6.setText("Salario");

        labelTipoSalario.setText("Por hora");

        jLabel8.setText("Descuento por compras");

        jLabel9.setText("%");

        btnGuardar.setBackground(new java.awt.Color(22, 35, 105));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disco.png"))); // NOI18N
        btnGuardar.setText("Guardar puesto");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        CheckBoxHora.setBackground(new java.awt.Color(22, 35, 105));
        CheckBoxHora.setText("Pago por Hora");
        CheckBoxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxHoraActionPerformed(evt);
            }
        });

        CheckBoxDia.setBackground(new java.awt.Color(22, 35, 105));
        CheckBoxDia.setText("Pago por Dia");
        CheckBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxDiaActionPerformed(evt);
            }
        });

        CheckBoxQuincena.setBackground(new java.awt.Color(22, 35, 105));
        CheckBoxQuincena.setText("Pago por Quincena ");
        CheckBoxQuincena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxQuincenaActionPerformed(evt);
            }
        });

        txtNombre.setLabelText("Nombre del puesto");
        txtNombre.setLineColor(new java.awt.Color(22, 35, 105));

        txtDescripcion.setLabelText("Descripcion del puesto");
        txtDescripcion.setLineColor(new java.awt.Color(22, 35, 105));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(btnGuardar))
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CheckBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTipoSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelTipoSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtComisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar pusto", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Salario");

        jLabel12.setText("Comisiones");

        labelTipoSalarioEdit.setText("Por hora");

        jLabel14.setText("Descuento por compras");

        jLabel15.setText("%");

        jLabel19.setText("%");

        btnEliminar.setBackground(new java.awt.Color(255, 23, 68));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(22, 35, 105));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar puesto");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtNombreEdit.setLabelText("Nombre del puesto");
        txtNombreEdit.setLineColor(new java.awt.Color(22, 35, 105));

        txtDescripcionPuesto.setLabelText("Descripcion del puesto");
        txtDescripcionPuesto.setLineColor(new java.awt.Color(22, 35, 105));

        CheckBoxQuincenaEdit.setBackground(new java.awt.Color(22, 35, 105));
        CheckBoxQuincenaEdit.setText("Pago por Quincena ");
        CheckBoxQuincenaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxQuincenaEditActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("El calculo de salario sera por");

        CheckBoxHoraEdit.setBackground(new java.awt.Color(22, 35, 105));
        CheckBoxHoraEdit.setText("Pago por Hora");
        CheckBoxHoraEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxHoraEditActionPerformed(evt);
            }
        });

        CheckBoxDiaEdit.setBackground(new java.awt.Color(22, 35, 105));
        CheckBoxDiaEdit.setText("Pago por Dia");
        CheckBoxDiaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxDiaEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDescripcionPuesto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComisionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSalarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelTipoSalarioEdit)
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescuentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnActualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CheckBoxHoraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxDiaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxQuincenaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescripcionPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxHoraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxDiaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxQuincenaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtSalarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTipoSalarioEdit))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDescuentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtComisionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Editar puesto", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 630, 370));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 20, 30));
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 400, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void centrarPanel(){
        int w=JF.getWidth()/2;
        int h=JF.getHeight()/2;
        int x=JF.getX();
        int y=JF.getY();
        
        int myW=this.getWidth()/2;
        int myH=this.getHeight()/2;
        this.setLocation(x+w-myW,y+h-myH);
        JF.encenderWallpaper();
    }
    
    
    private void labelExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExit1MouseClicked
        this.dispose();
        if(FC==null){
            JF.apagarWallpaper();
        }
    }//GEN-LAST:event_labelExit1MouseClicked

    private void labelExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExit1MouseEntered
        panelBtnExit1.setBackground(Color.RED);
        labelExit1.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelExit1MouseEntered

    private void labelExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExit1MouseExited
        panelBtnExit1.setBackground(new Color(22,35,105));
        labelExit1.setForeground(Color.black);
    }//GEN-LAST:event_labelExit1MouseExited

    private void jPanel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseDragged

    }//GEN-LAST:event_jPanel11MouseDragged

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed

    }//GEN-LAST:event_jPanel11MousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre=txtNombre.getText();
        if(nombreValido(nombre)){
            guardarPuesto();
            actualizarTablaCarrito();
            borrarPantalla();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre=txtNombreEdit.getText();
        if(nombreValido(nombre)){
            actualizarPuesto();
            actualizarTablaCarrito();
            borrarPantalla();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(idPuesto>=0){
            preguntarEliminar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void preguntarEliminar(){
            int i=JOptionPane.showConfirmDialog(this, "¿Quiere eleminar el Puesto '"+nombrePuestoEdit+"' ?");
            if(i==0){
                delete.eliminarPuesto(idPuesto);
                actualizarTablaCarrito();
                borrarPantalla();
                new FrameCorrecto(null,"El puesto '"+nombrePuestoEdit+"' fue eliminado con exito").setVisible(true);
                idPuesto=-1;
                nombrePuestoEdit="";
            }
    }
    
    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        buscarPuesto();
    }//GEN-LAST:event_jLabel17MousePressed

    private void CheckBoxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxHoraActionPerformed
        actualizarCheckBox(0);
    }//GEN-LAST:event_CheckBoxHoraActionPerformed

    private void CheckBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxDiaActionPerformed
        actualizarCheckBox(1);
    }//GEN-LAST:event_CheckBoxDiaActionPerformed

    private void CheckBoxQuincenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxQuincenaActionPerformed
        actualizarCheckBox(2);
    }//GEN-LAST:event_CheckBoxQuincenaActionPerformed

    private void CheckBoxQuincenaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxQuincenaEditActionPerformed
        actualizarCheckBoxEdit(2);
    }//GEN-LAST:event_CheckBoxQuincenaEditActionPerformed

    private void CheckBoxHoraEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxHoraEditActionPerformed
        actualizarCheckBoxEdit(0);
    }//GEN-LAST:event_CheckBoxHoraEditActionPerformed

    private void CheckBoxDiaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxDiaEditActionPerformed
        actualizarCheckBoxEdit(1);
    }//GEN-LAST:event_CheckBoxDiaEditActionPerformed
    
    private void buscarPuesto(){
        String nombre=txtBusqueda.getSelectedItem().toString();
        if(nombre.equals("")){
            new FrameError(null,"Necesita ingresar un nombre valido").setVisible(true);
        }
        else{         
            if(llenarDatosEdit(nombre)){
                
            }
            else{
                new FrameError(null,"Este puesto no existe").setVisible(true);
            }
        }
    }
    
    private boolean llenarDatosEdit(String nombre){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from puestos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los puestos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("nombre").equals(nombre)){
                    //obtener sus datos 
                    idPuesto=rsBusqueda.getInt("id");
                    txtNombreEdit.setText(nombre);
                    txtDescripcionPuesto.setText(rsBusqueda.getString("descripcion"));
                    txtSalarioEdit.setText(rsBusqueda.getString("salario"));
                    txtDescuentoEdit.setText(rsBusqueda.getString("descuento"));
                    txtComisionEdit.setText(rsBusqueda.getString("comision"));
                    setTipoPagoEdit(rsBusqueda.getString("tiposalario"));
                    nombrePuestoEdit=nombre;
                    //mensaje
                    new FrameCorrecto(null,"Puesto encontrado").setVisible(true);
                    return true;
                }
            }
            return false;
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }   
        return false;
    }
    
    private void setTipoPagoEdit(String tipo){
        if(tipo.equals("Hora")){
            actualizarCheckBoxEdit(0);
        }
        else if(tipo.equals("Dia")){
            actualizarCheckBoxEdit(1);
        }
        else{
            actualizarCheckBoxEdit(2);
        }
    }
    
    private boolean nombreValido(String nombre){
        if(nombre.equals("")){
            new FrameError(null,"Necesita ingresar un nombre valido").setVisible(true);
            return false;
        }
        else{
            return !verSiSeRepiteElNombre(nombre);
        }
    }
    
    private boolean verSiSeRepiteElNombre(String nombre){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from puestos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los puestos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("nombre").equals(nombre)){
                    if (idPuesto==rsBusqueda.getInt("id")){
                        System.out.println("Localizado");
                        return false;
                    }
                    else{
                        new FrameError(null,"Este nombre ya existe").setVisible(true);
                        return true;
                    }
                }
            }
            return false;
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }       
        return false;
    }
    
    private void actualizarPuesto(){
        //obtener los datos
        String nombre=txtNombreEdit.getText();
        String descripcion=txtDescripcionPuesto.getText();
        String tipoSalario=getTipoSalarioEdit();
        float salario=conver.convertirStringFloat(txtSalarioEdit.getText());
        float descuento=conver.convertirStringFloat(txtDescuentoEdit.getText());
        float comisiones=conver.convertirStringFloat(txtComisionEdit.getText());
        
        try{
            Statement sts=con.createStatement();
            String actualizar="update puestos set nombre = '"+nombre+"', descripcion = '"+descripcion+"' "
                    + ", tiposalario = '"+tipoSalario+"', salario = '"+salario+"', descuento = '"+descuento+"'"
                    + ", comision = '"+comisiones+"' where id = '"+idPuesto+"'";
            sts.executeUpdate(actualizar);    
            actualizarTablaCarrito();
            new FrameCorrecto(null,"El puesto se actualizo").setVisible(true);
        }catch(SQLException ex){
            System.out.println(ex);
            System.out.println("No se pudo actualizar el puesto");
        }
    }
    
    private void guardarPuesto(){
        //obtener los datos
        String nombre=txtNombre.getText();
        String descripcion=txtDescripcion.getText();
        String tipoSalario=getTipoSalario();
        float salario=conver.convertirStringFloat(txtSalario.getText());
        float descuento=conver.convertirStringFloat(txtDescuento.getText());
        float comisiones=conver.convertirStringFloat(txtComisiones.getText());
        
        //guardar
        add.agregarPuestoEmpleados(nombre,descripcion,tipoSalario,salario,descuento,comisiones);
    }
    
    
    private String getTipoSalario(){
        if (CheckBoxHora.isSelected()){
            return "Hora";
        }
        else if (CheckBoxHora.isSelected()){
            return "Dia";
        }
        else{
            return "Quincena";
        }
    }
    
    private String getTipoSalarioEdit(){
        if (CheckBoxHoraEdit.isSelected()){
            return "Hora";
        }
        else if (CheckBoxHoraEdit.isSelected()){
            return "Dia";
        }
        else{
            return "Quincena";
        }
    }
    
    private void actualizarCheckBox(int i){
        switch(i){
            case 0:{
                CheckBoxHora.setSelected(true);
                CheckBoxDia.setSelected(false);
                CheckBoxQuincena.setSelected(false);
                labelTipoSalario.setText("Por Hora");
                break;
            }
            case 1:{
                CheckBoxHora.setSelected(false);
                CheckBoxDia.setSelected(true);
                CheckBoxQuincena.setSelected(false);
                labelTipoSalario.setText("Por Dia");
                break;               
            }
            case 2:{
                CheckBoxHora.setSelected(false);
                CheckBoxDia.setSelected(false);
                CheckBoxQuincena.setSelected(true);
                labelTipoSalario.setText("Por Quincena");
                break;
            }
        }
    }
    
    private void actualizarCheckBoxEdit(int i){
        switch(i){
            case 0:{
                CheckBoxHoraEdit.setSelected(true);
                CheckBoxDiaEdit.setSelected(false);
                CheckBoxQuincenaEdit.setSelected(false);
                labelTipoSalarioEdit.setText("Por Hora");
                break;
            }
            case 1:{
                CheckBoxHoraEdit.setSelected(false);
                CheckBoxDiaEdit.setSelected(true);
                CheckBoxQuincenaEdit.setSelected(false);
                labelTipoSalarioEdit.setText("Por Dia");
                break;               
            }
            case 2:{
                CheckBoxHoraEdit.setSelected(false);
                CheckBoxDiaEdit.setSelected(false);
                CheckBoxQuincenaEdit.setSelected(true);
                labelTipoSalarioEdit.setText("Por Quincena");
                break;
            }
        }
    }   
    
    private void llenarCheckComboBox(){
        CheckBoxHora.setSelected(true);
        CheckBoxHoraEdit.setSelected(true);
        
        CheckBoxDia.setSelected(false);
        CheckBoxQuincena.setSelected(false);
        CheckBoxDiaEdit.setSelected(false);
        CheckBoxQuincenaEdit.setSelected(false);
    }
    
    private void borrarPantalla(){
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtSalario.setText("");
        txtDescuento.setText("");
        txtComisiones.setText("");
        actualizarCheckBox(0);
        
        txtNombreEdit.setText("");
        txtDescripcionPuesto.setText("");
        txtSalarioEdit.setText("");
        txtDescuentoEdit.setText("");
        txtComisionEdit.setText("");
        actualizarCheckBoxEdit(0);
        
        txtBusqueda.setSelectedIndex(0);
    }
    
    
    public void actualizarTablaCarrito(){
        obj=new ActualizarTablaPuestos(con);       
        this.tabla.setModel(obj.getModelo());
        this.tabla.fixTable(jScrollPane2);
        TableEdit tab=new TableEdit(this.tabla);
        //comprobar si hay otra interfaz 
        if(FC!=null){
            FC.llenarComboBoxPuestos();
        }
        
        actualizarCoboBox();
    }
    
    private void actualizarCoboBox(){
        txtBusqueda.removeAllItems();
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from puestos");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                txtBusqueda.addItem(rs.getString("nombre"));
            }
        }catch(SQLException ex){
            System.out.println("error al llenar el combobox de puestos");
            System.out.println(ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private checkbox.JCheckBoxCustom CheckBoxDia;
    private checkbox.JCheckBoxCustom CheckBoxDiaEdit;
    private checkbox.JCheckBoxCustom CheckBoxHora;
    private checkbox.JCheckBoxCustom CheckBoxHoraEdit;
    private checkbox.JCheckBoxCustom CheckBoxQuincena;
    private checkbox.JCheckBoxCustom CheckBoxQuincenaEdit;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelExit1;
    private javax.swing.JLabel labelTipoSalario;
    private javax.swing.JLabel labelTipoSalarioEdit;
    private javax.swing.JPanel panelBtnExit1;
    private javaswingdev.swing.table.Table tabla;
    private combo_suggestion.ComboBoxSuggestion txtBusqueda;
    private javax.swing.JTextField txtComisionEdit;
    private javax.swing.JTextField txtComisiones;
    private textfield.TextField txtDescripcion;
    private textfield.TextField txtDescripcionPuesto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDescuentoEdit;
    private textfield.TextField txtNombre;
    private textfield.TextField txtNombreEdit;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSalarioEdit;
    // End of variables declaration//GEN-END:variables
}
