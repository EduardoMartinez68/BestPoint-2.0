package Productos;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.BuscarCajero;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import Notificaciones.MessageError;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaswingdev.message.MessageDialog;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;
import puntoventa.FrameInventario;


public class FrameActualizarProductos extends javax.swing.JFrame {
    Connection con;
    
    private ImpuestosDatos impuestos;
    private ActualizarTablaIVA tablaIva;
    
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    Buscar search;
    BuscarCajero buscarCajero;
    String rutaImg="";
    
    int mouseX,mouseY;
    FrameInventario JF;
    public FrameActualizarProductos(Connection con, FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        buscarCajero=new BuscarCajero(con,this);
        initComponents();
        
        setIconImage(getIcono());
        
        borrarBuscador();
        actualizarVariables();
        borrarTablaImpuestos();        
        actualizarTablaImpuestos();
        actualizarcomboxTipoImpuesto();
        actualizarComboxDepartamentos();
        ActualizarComboBoxProductosBuscar();
        this.setSize(690, 670);
        this.setResizable(false);
        this.setTitle("Editar Productos");
        centrarPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RButonGranel = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        labelCant = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sprineGanancia = new javax.swing.JSpinner();
        RButonUnidad = new javax.swing.JRadioButton();
        RButonPaquete = new javax.swing.JRadioButton();
        txtPrecioFinal = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAgregarImpuesto = new javax.swing.JButton();
        txtPrecioFinalIva = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();
        btnSubirImg = new javax.swing.JButton();
        btnEliminarImg = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtPrecioPeso = new javax.swing.JTextField();
        txtNombreProducto = new textfield.TextField();
        txtCodigoBarras = new textfield.TextField();
        txtDescripcion = new textfield.TextField();
        checkInventario = new checkbox.JCheckBoxCustom();
        ComboBoxPeso = new combobox.Combobox();
        comboxDepartamentos = new combobox.Combobox();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaImpuestos = new javaswingdev.swing.table.Table();
        comboxTipoImpuesto = new combobox.Combobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        RButonGranel.setBackground(new java.awt.Color(255, 255, 255));
        RButonGranel.setText("A granel (Usa decimales)");
        RButonGranel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonGranelActionPerformed(evt);
            }
        });

        jLabel7.setText("Ganancia");

        jLabel8.setText("%");

        jLabel15.setText("Precio de ganancia");

        labelCant.setText("en este momento");

        jLabel10.setText("Hay");

        jLabel6.setText("Se vende");

        jLabel9.setText("Precio Costo $");

        sprineGanancia.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sprineGananciaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                sprineGananciaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        sprineGanancia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sprineGananciaStateChanged(evt);
            }
        });
        sprineGanancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sprineGananciaMouseClicked(evt);
            }
        });

        RButonUnidad.setBackground(new java.awt.Color(255, 255, 255));
        RButonUnidad.setText("Por unidad/pieza");
        RButonUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        RButonUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonUnidadActionPerformed(evt);
            }
        });

        RButonPaquete.setBackground(new java.awt.Color(255, 255, 255));
        RButonPaquete.setText("Como paquete (kit)");
        RButonPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonPaqueteActionPerformed(evt);
            }
        });

        txtPrecioFinal.setEditable(false);
        txtPrecioFinal.setText("0");

        txtCosto.setForeground(new java.awt.Color(57, 78, 194));
        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostoKeyReleased(evt);
            }
        });

        jLabel13.setText("Este producto maneja estos impuestos");

        btnAgregarImpuesto.setBackground(new java.awt.Color(57, 78, 194));
        btnAgregarImpuesto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarImpuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarImpuesto.setText("Agregar impuesto");
        btnAgregarImpuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarImpuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarImpuestoMousePressed(evt);
            }
        });
        btnAgregarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImpuestoActionPerformed(evt);
            }
        });

        txtPrecioFinalIva.setEditable(false);
        txtPrecioFinalIva.setText("0");

        jLabel16.setText("Precio final con iva");

        jPanel6.setBackground(new java.awt.Color(57, 78, 194));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Editar Productos");

        panelBtnExit.setBackground(new java.awt.Color(57, 78, 194));

        labelExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelExit.setForeground(new java.awt.Color(0, 0, 0));
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtnExitLayout = new javax.swing.GroupLayout(panelBtnExit);
        panelBtnExit.setLayout(panelBtnExitLayout);
        panelBtnExitLayout.setHorizontalGroup(
            panelBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnExitLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBtnExitLayout.setVerticalGroup(
            panelBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnExitLayout.createSequentialGroup()
                .addComponent(labelExit)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgP.png"))); // NOI18N

        btnSubirImg.setBackground(new java.awt.Color(57, 78, 194));
        btnSubirImg.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/subir.png"))); // NOI18N
        btnSubirImg.setText("Subir");
        btnSubirImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubirImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirImgActionPerformed(evt);
            }
        });

        btnEliminarImg.setBackground(new java.awt.Color(57, 78, 194));
        btnEliminarImg.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminarImg.setText("Borrar");
        btnEliminarImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnSubirImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarImg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelImg)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubirImg)
                    .addComponent(btnEliminarImg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setText("Precio por peso");

        txtPrecioPeso.setEditable(false);
        txtPrecioPeso.setText("0");

        txtNombreProducto.setLabelText("Nombre del Producto *");
        txtNombreProducto.setLineColor(new java.awt.Color(22, 35, 105));
        txtNombreProducto.setSelectionColor(new java.awt.Color(22, 35, 105));

        txtCodigoBarras.setLabelText("Codigo de Barras *");
        txtCodigoBarras.setLineColor(new java.awt.Color(22, 35, 105));
        txtCodigoBarras.setSelectionColor(new java.awt.Color(22, 35, 105));

        txtDescripcion.setLabelText("Descripcion");
        txtDescripcion.setLineColor(new java.awt.Color(22, 35, 105));
        txtDescripcion.setSelectionColor(new java.awt.Color(22, 35, 105));

        checkInventario.setBackground(new java.awt.Color(57, 78, 194));
        checkInventario.setText("Este producto SI utiliza inventario");
        checkInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInventarioActionPerformed(evt);
            }
        });

        ComboBoxPeso.setLabeText("Unidades");
        ComboBoxPeso.setLineColor(new java.awt.Color(22, 35, 105));

        comboxDepartamentos.setLabeText("Departamento");
        comboxDepartamentos.setLineColor(new java.awt.Color(22, 35, 105));

        btnActualizar.setBackground(new java.awt.Color(57, 78, 194));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(57, 78, 194));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaImpuestos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaImpuestos);

        comboxTipoImpuesto.setLabeText("Tipos de impuestos");
        comboxTipoImpuesto.setLineColor(new java.awt.Color(22, 35, 105));
        comboxTipoImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxTipoImpuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(checkInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RButonUnidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RButonGranel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sprineGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))))
                            .addComponent(comboxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCant)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(RButonPaquete)
                            .addComponent(txtPrecioFinalIva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAgregarImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboxTipoImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RButonUnidad)
                    .addComponent(RButonGranel)
                    .addComponent(RButonPaquete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sprineGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCant))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioFinalIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(4, 4, 4)
                                .addComponent(txtPrecioPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(checkInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboxTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnAgregarImpuesto))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 820));

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
    
    private Image getIcono(){
        Image icono=Toolkit.getDefaultToolkit().getImage("icono.png");
        return icono;
    }
    
    private void actualizarComboxPeso(){
        ComboBoxPeso.removeAllItems();
        //peso
        ComboBoxPeso.addItem("g"); //gramnos
        ComboBoxPeso.addItem("kg"); //kilogramos
        ComboBoxPeso.addItem("lb"); //libra
        ComboBoxPeso.addItem("mg"); //libra
        //distancia
        ComboBoxPeso.addItem("m"); //metros
        ComboBoxPeso.addItem("cm"); //metros
        ComboBoxPeso.addItem("mm"); //metros
        
        //agua
        ComboBoxPeso.addItem("L"); //litos
        ComboBoxPeso.addItem("mL"); //litos
    }
    
    private void actualizarVariables(){
        add=new Agregar(con,this,JF);
        delete=new Eliminar(con);
        search=new Buscar(con);
        impuestos=new ImpuestosDatos(con);
        
        this.setTitle("Actualizar Productos");
        //this.setSize(1200, 820); //552,820
        this.setResizable(false);
        actualizarComboxPeso();
    }
    
    private void RButonGranelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonGranelActionPerformed
        actualizarSelecion(1);
    }//GEN-LAST:event_RButonGranelActionPerformed

    private void sprineGananciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sprineGananciaAncestorAdded
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaAncestorAdded

    private void sprineGananciaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sprineGananciaAncestorMoved
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaAncestorMoved

    private void sprineGananciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sprineGananciaStateChanged
        calcularGananciaFinalComprobacion();
        actualizarPrecioIva();
    }//GEN-LAST:event_sprineGananciaStateChanged

    private void sprineGananciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sprineGananciaMouseClicked
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaMouseClicked

    private void RButonUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonUnidadActionPerformed
        actualizarSelecion(3);
    }//GEN-LAST:event_RButonUnidadActionPerformed

    private void RButonPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonPaqueteActionPerformed
        actualizarSelecion(2);
    }//GEN-LAST:event_RButonPaqueteActionPerformed

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed
        //calcularGnanciaFinal();
    }//GEN-LAST:event_txtCostoKeyPressed

    private void txtCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyReleased
        calcularGnanciaFinal();
    }//GEN-LAST:event_txtCostoKeyReleased

    private void btnAgregarImpuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarImpuestoMousePressed

    }//GEN-LAST:event_btnAgregarImpuestoMousePressed
   
    private void actualizarComboxDepartamentos(){
        comboxDepartamentos.removeAllItems();
        llenarComboxDepartamentos();
    }

    private boolean ActualizarComboBoxProductosBuscar(){
        return true;
    }
    
    private void llenarComboxDepartamentos(){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from departamento");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                comboxDepartamentos.addItem(rs.getString("nombre"));
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }         
    }
    
    private boolean verificarImpuestoExistente(String iva){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from tablasproductoiva");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                if (rs.getString("nombre").equals(iva)){
                    return true;
                }
            }
            
            return false;
        }catch(SQLException ex){
            return true;
        } 
    }
    
    private void agregarImpuesto(){
        //obtener los datos del impuesto
        String nombreImpuesto=comboxTipoImpuesto.getSelectedItem().toString();
        impuestos.encontrarImpuesto(nombreImpuesto);
        int id=impuestos.idImpuesto();
        float precio=impuestos.precioImpuesto();
        add.tablaImpuestos(id,nombreImpuesto,precio);
    }
    
    private void actualizarcomboxTipoImpuesto(){
        comboxTipoImpuesto.removeAllItems(); //eliminar los impuestos 
        
        //pasar por todos los impuestos existentes y llenarlo
        llenarComboxTipoImpuestos();
    }
    
    private void actualizarPrecioIva(){
        tablaImpuestos.setCellSelectionEnabled(false);
        
        float precio=conver.convertirStringFloat(txtPrecioFinal.getText());
        float precioIva=0;
        //recorrer toda la tabla
        for(int i=0;i<tablaImpuestos.getRowCount();i++){
            String l=tablaImpuestos.getValueAt(i, 2)+"";     
            float iva=conver.convertirStringFloat(l);
            precioIva+=actualizarPrecio(precio,iva);
        }
        
        txtPrecioFinalIva.setText((precioIva+precio)+"");
    }
    
    private float actualizarPrecio(float precio,float iva){ 
        float precioIva=((precio*iva)/100);
        return precioIva;
    }
        
    
    private void llenarComboxTipoImpuestos(){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from iva");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                comboxTipoImpuesto.addItem(rs.getString("nombre"));
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } 
    }
    
    private void btnAgregarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImpuestoActionPerformed
        if(!verificarImpuestoExistente(comboxTipoImpuesto.getSelectedItem().toString())){
            agregarImpuesto();
            actualizarTablaImpuestos();
        }
        else{
            new MessageError(this,"Este producto ya incluye este impuesto");
            //new FrameError(JF,"Este producto ya incluye este impuesto").setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarImpuestoActionPerformed
    
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(buscarCajero.permiso11()==1){
            preguntarEliminacion();
        }         
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(buscarCajero.permiso10()==1){
            if(sePuedeActualizar()){
                actualizarProducto();
                actualizarImpuestosProducto();
                ActualizarComboBoxProductosBuscar();
                borrarPantalla();
                this.dispose();
                JF.apagarWallpaper();
            }
        }         
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        JF.apagarWallpaper();
        this.dispose();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        panelBtnExit.setBackground(Color.RED);
        labelExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        panelBtnExit.setBackground(new Color(57,78,194));
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged

    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void btnSubirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirImgActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        fileChooser.setFileFilter(imgFilter);
        int result = fileChooser.showOpenDialog(this);
        
        if(result==JFileChooser.APPROVE_OPTION){
            rutaImg=fileChooser.getSelectedFile().getPath();
            actualizarImgProducto();
        }
    }//GEN-LAST:event_btnSubirImgActionPerformed

    private void btnEliminarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarImgActionPerformed
        String rutaProyecto=System.getProperty("user.dir");
        rutaImg=rutaProyecto+"\\src\\Img\\imgP.png";
        actualizarImgProducto();
    }//GEN-LAST:event_btnEliminarImgActionPerformed

    private void checkInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInventarioActionPerformed

    private void comboxTipoImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxTipoImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxTipoImpuestoActionPerformed
    
    private void actualizarImgProducto(){
        Image img=new ImageIcon(rutaImg).getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);        
    }
    
    private void buscarImgProducto(){   
        //obtenemos la direcion de su imagen y cargamos la ruta 
        rutaImg=search.rutaImg();
        File archivo = new File(rutaImg);      
        //si no existe el archivo cargamos la imagen de muestra
        if (!archivo.exists()) {
            String rutaProyecto=System.getProperty("user.dir");
            rutaImg=rutaProyecto+"\\src\\Img\\imgP.png";
        }
        
        actualizarImgProducto();
    }
    
    private boolean sePuedeActualizar(){
        float cantidad=conver.convertirStringFloat(txtCantidad.getText());
        float precio=conver.convertirStringFloat(txtPrecioFinal.getText());
        if(!txtNombreProducto.getText().equals("") && !txtCodigoBarras.getText().equals("") && cantidad>0 && precio>0){
            return true;
        }
        
        return false;
    }
    
    private void preguntarEliminacion(){
        try{
            String nombre=search.Nombre();
            //preguntar si quiere eliminar el producto
            MessageDialog ms=new MessageDialog(this);
            ms.showMessage("Eliminar producto","¿Quiere eleminar el producto '"+nombre+"' ?");
            if(ms.getMessageType()==MessageDialog.MessageType.OK){
                delete.eliminarProducto(search.Id());
                borrarPantalla();
                ActualizarComboBoxProductosBuscar();
                //JOptionPane.showMessageDialog(this, "El producto '"+nombre+"' fue eliminado con exito");
                new MessageCorrect(this,"El producto '"+nombre+"' fue eliminado con exito",null);
                this.dispose();
                JF.apagarWallpaper();
            }
        }catch(SQLException ex){
            new MessageError(this,"El producto no pudo ser eliminado");
            //JOptionPane.showMessageDialog(this,"El producto no pudo ser eliminado");
            System.out.println(ex);
        }
    }
    
    public boolean buscarProducto(String codigoBarrasString){
        borrarTablaImpuestos();
        String codigoBarras=codigoBarrasString;
        if(search.buscarProducto(codigoBarras)){
            buscarImgProducto();
            BuscarImpuestosProducto();
            guardarDatosProductoEncontrado();
            buscarImgProducto();
            return true;
        }
        else{
            return false;
            
            //showMessageDialog(this,"El producto no fue encontrado");
        }
        
        //borrarBuscador();
    }
    
    private void BuscarImpuestosProducto(){
        try {
            String productoBuscar=search.Nombre(); //ver que es lo que voy a buscar
            Statement sts = con.createStatement();
            sts.execute("Select * from productosivas");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){
                String producto=rs.getString("productoiva");
                if(productoBuscar.equals(producto)){
                    int id=rs.getInt("id");
                    String nombreImpuesto=rs.getString("nombre");
                    float precio=rs.getFloat("precio");
                    add.tablaImpuestos(id,nombreImpuesto,precio);
                }
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        actualizarTablaImpuestos();
    }
    
    private void actualizarProducto(){
        try{
            Statement sts=con.createStatement();
            String usaInventario=getUsaInventario();
            
            
            String actualizar="update productos set cantidad = '"+conver.convertirStringInt(txtCantidad.getText())+"', nombre = '"+txtNombreProducto.getText()+"', codigobarras = '"+txtCodigoBarras.getText()+"', descripcion = '"+txtDescripcion.getText()+"', precio = '"+conver.convertirStringFloat(txtPrecioFinalIva.getText())+"', costo = '"+conver.convertirStringFloat(txtCosto.getText())+"', ganancia = '"+conver.convertirStringFloat(sprineGanancia.getValue().toString())+"', usainventario = '"+usaInventario+"', ubicacion = '"+comboxDepartamentos.getSelectedItem()+"', sevendepor = '"+getSeVendePor()+"', rutimg='"+rutaImg+"' where id = '"+search.Id()+"'";
            sts.executeUpdate(actualizar);   
            new MessageCorrect(this,"El producto se actualizo correctamente",null);
            //new FrameCorrecto(null,"El producto se actualizo correctamente").setVisible(true);
        }catch(SQLException ex){
            System.out.println(ex);
            System.out.println("No se pudo actualizar inventario");
        }
    }    
    
    private void actualizarImpuestosProducto(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from tablasproductoiva");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){
                int id=rs.getInt("id");
                String nombreImpuesto=rs.getString("nombre");
                float precio=rs.getFloat("precio");
                
                add.productosYsusIvas(id,search.Nombre(),nombreImpuesto,precio);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    private void borrarBuscador(){
    }
    
    private void borrarImgProducto(){
        rutaImg="";
        String rutaProyecto=System.getProperty("user.dir");
        Image img=new ImageIcon(rutaProyecto+"\\src\\Img\\imgP.png").getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);    
    }
    
    private void borrarPantalla(){
        borrarBuscador();
        txtNombreProducto.setText("");
        txtCantidad.setText("");
        txtDescripcion.setText("");
        txtCodigoBarras.setText("");
        txtPrecioFinal.setText("");
        txtCosto.setText("");
        checkInventario.setSelected(false);
        comboxDepartamentos.setSelectedIndex(0);
        comboxTipoImpuesto.setSelectedIndex(0);
        
        //borrar la tabla 
        borrarTablaImpuestos();
        borrarImgProducto();
    }
    
    private void guardarDatosProductoEncontrado(){
        try{
            txtNombreProducto.setText(search.Nombre());
            txtCantidad.setText(search.Cantidad()+"");
            txtDescripcion.setText(search.Descripcion());
            txtCodigoBarras.setText(search.CodigoBarra()+"");
            txtPrecioFinal.setText(search.Precio()+"");
            txtCosto.setText(search.Costo()+"");
            sprineGanancia.setValue(search.Ganancias());
            
            if(search.UsaInventario().equals("Si")){
                checkInventario.setSelected(true);
            }       
            else{
                checkInventario.setSelected(false);
            }
            actualizarSeVendePor(search.SeVendePor());
            
            actualizarTablaImpuestos();    
            
            String departamento=search.Ubicacion();
            actualizarComboxDepartamentosSearch(departamento);
            
            BuscarImpuestosProducto();
            float pp=search.Precioporpeso();
            txtPrecioPeso.setText(pp+"");
        }catch(SQLException ex){
            //new FrameError(JF,"Sucedio un error al buscar el producto").setVisible(true);
            new MessageError(this,"Sucedio un error al buscar el producto");
            System.out.println(ex);
        }
    }
    
    private void actualizarSeVendePor(String seVendePor){
        int i=0;
        if(seVendePor.equals("Como paquete(kit)")){
            RButonPaquete.setSelected(true);
            i=2;
        }
        else if(seVendePor.equals("Por unidad/pieza")){
            RButonUnidad.setSelected(true);
            i=3;
        }
        else{
            RButonGranel.setSelected(true);
            i=1;
            //actualizar el comboxTipoImpuesto a su unidad de medida
            //actualizarUnidadBusqueda();
        }
        
        actualizarSelecion(i);
    }
    
    private void actualizarUnidadBusqueda(){
        String unidases[]={"g","kg","lb","mg","m","cm","mm","L","mL"};
        for(int i=0;i<unidases.length;i++){
            if (search.Unidad().equals(unidases[i])){
                comboxTipoImpuesto.setSelectedIndex(i);
                break;
            }           
        }
    }
    
    private void actualizarComboxDepartamentosSearch(String departamentoSearch){
        int num=comboxDepartamentos.getItemCount();
        for(int i=0;i<num;i++){
            String departamento=(String) comboxDepartamentos.getItemAt(i);
            if(departamentoSearch.equals(departamento)){
                comboxDepartamentos.setSelectedIndex(i);
            }
        }
    }
    
    private void calcularGananciaFinalComprobacion(){        
        //comprobar si no hay error en los datos necesarios 
        if (!txtCosto.getText().equals("") && !sprineGanancia.getValue().toString().equals("")){
            calcularGnanciaFinal();
        }
        else{
            sprineGanancia.setValue(0);
            new FrameError(JF,"Faltan datos por llenar").setVisible(true);
        }
    }
    
    private void calcularGnanciaFinal(){
        //obtenemos sus valores
        float costo=conver.convertirStringFloat(txtCosto.getText().toString());
        float porcentajeGanancia=conver.convertirStringFloat(sprineGanancia.getValue().toString());
        porcentajeGanancia=porcentajeGanancia+100;
        
        //hacemos una regla de 3 
        float precio=(costo*porcentajeGanancia)/100;
        txtPrecioFinal.setText(precio+"");
        
        actualizarPrecioIva();    
    }
    
    private String getSeVendePor(){
        if(RButonGranel.isSelected()){
            return "A granal";
        }
        else if(RButonPaquete.isSelected()){
            return "Como paquete(kit)";
        }
        else if(RButonUnidad.isSelected()){
            return "Por unidad/pieza";
        }
        else{
            return "";
        }
    }
    
    private void actualizarSelecion(int index){
        if(index==1){
            RButonPaquete.setSelected(false);
            RButonUnidad.setSelected(false);
        }
        else if(index==2){
            RButonGranel.setSelected(false);
            RButonUnidad.setSelected(false);
        }
        else if(index==3){
            RButonPaquete.setSelected(false);
            RButonGranel.setSelected(false);
        }      
        
        //bloquear caja de precio por peso
        if(index!=1){
            txtPrecioPeso.setText("");
            txtPrecioPeso.setEditable(false);
            labelCant.setText("en este momento");
        }
        else{
            System.out.println("Entro");
            labelCant.setText("g/kg/m/lt/lb/...");
            txtPrecioPeso.setEditable(true);
        }
    }
    
    private String getUsaInventario(){
        if(checkInventario.isSelected()){
            return "Si";
        }
        return "No";
    }
    
    //actualizar tablas
    private void actualizarTablaImpuestos(){
        tablaIva=new ActualizarTablaIVA(con);
        this.tablaImpuestos.setModel(tablaIva.getModelo());
        
        actualizarPrecioIva();
    }
    
    private void borrarTablaImpuestos(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from tablasproductoiva");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String strID=rs.getString("id");
                int ID=conver.convertirStringInt(strID);
                delete.eliminarTablaImpuesto(ID);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        actualizarTablaImpuestos();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combobox.Combobox ComboBoxPeso;
    private javax.swing.JRadioButton RButonGranel;
    private javax.swing.JRadioButton RButonPaquete;
    private javax.swing.JRadioButton RButonUnidad;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarImpuesto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarImg;
    private javax.swing.JButton btnSubirImg;
    private javax.swing.ButtonGroup buttonGroup1;
    private checkbox.JCheckBoxCustom checkInventario;
    private combobox.Combobox comboxDepartamentos;
    private combobox.Combobox comboxTipoImpuesto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCant;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelImg;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JSpinner sprineGanancia;
    private javaswingdev.swing.table.Table tablaImpuestos;
    private javax.swing.JTextField txtCantidad;
    private textfield.TextField txtCodigoBarras;
    private javax.swing.JTextField txtCosto;
    private textfield.TextField txtDescripcion;
    private textfield.TextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioFinal;
    private javax.swing.JTextField txtPrecioFinalIva;
    private javax.swing.JTextField txtPrecioPeso;
    // End of variables declaration//GEN-END:variables
}
