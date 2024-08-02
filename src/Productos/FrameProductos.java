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
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;
import puntoventa.FrameInventario;


public class FrameProductos extends javax.swing.JFrame {

    Connection con;
    private ImpuestosDatos impuestos;
    private ActualizarTablaIVA tablaIva;
    
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    Buscar search;
    BuscarCajero buscarCajero;
    String rutaImg="";
    
    int mouseX;
    int mouseY;
    
    Color colorBtnHover=new Color(46,69,209);
    Color ColorBtn=new Color(57,78,194);
    
    Color colorBtnFondo=new Color(57,78,194);
    Color colorBtnFondoHover=new Color(238,238,238);
    FrameInventario JF;
    Random random = new Random();
    public FrameProductos(Connection con, FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        this.buscarCajero=new BuscarCajero(con,this);
        impuestos=new ImpuestosDatos(con);
        
        actualizarFunciones();
        initComponents();
        borrarTablaImpuestos();        
        actualizarTablaImpuestos();
        actualizarcomboxTipoImpuesto();
        actualizarComboxDepartamentos();
        actualizarComboxPeso();
        
        txtCosto.setForeground(Color.gray);
        txtDescripcion.setForeground(Color.gray);
        txtCodigo.setForeground(Color.gray);
        
        setIconImage(getIcono());
        //this.setSize(597,716);
        this.setTitle("Productos");
        this.setResizable(false);
        this.setSize(620, 620);
        centrarPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        materialTabbed1 = new tabbed.MaterialTabbed();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sprineGanancia = new javax.swing.JSpinner();
        RButonGranel = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RButonUnidad = new javax.swing.JRadioButton();
        RButonPaquete = new javax.swing.JRadioButton();
        txtPrecioFinal = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtPrecioFinalIva = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        labelImg = new javax.swing.JLabel();
        btnSubirImg = new javax.swing.JButton();
        btnBorrarImg = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtPrecioPeso = new javax.swing.JTextField();
        btnGenerarCodigo = new javax.swing.JButton();
        ComboBoxPeso = new combobox.Combobox();
        comboxDepartamentos = new combobox.Combobox();
        txtCosto = new textfield.TextField();
        txtCodigo = new textfield.TextField();
        txtDescripcion = new textfield.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new textfield.TextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtMaximo = new textfield.TextField();
        txtMinimo = new textfield.TextField();
        labelCant1 = new javax.swing.JLabel();
        labelCant2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jCheckBoxCustom3 = new checkbox.JCheckBoxCustom();
        txtCantidad = new textfield.TextField();
        labelCant = new javax.swing.JLabel();
        checkInventario = new checkbox.JCheckBoxCustom();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnAgregarImpuesto = new javax.swing.JButton();
        comboxTipoImpuesto = new combobox.Combobox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaImpuestos = new javaswingdev.swing.table.Table();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(57, 78, 194));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Agregar un Nuevo Producto");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Precio de ganancia");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel5.setText("* Se vende");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

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
        jPanel2.add(sprineGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 73, -1));

        RButonGranel.setBackground(new java.awt.Color(255, 255, 255));
        RButonGranel.setForeground(new java.awt.Color(0, 0, 0));
        RButonGranel.setText("A granel (Usa decimales)");
        RButonGranel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonGranelActionPerformed(evt);
            }
        });
        jPanel2.add(RButonGranel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel7.setText("Porcentaje de ganancia");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel8.setText("%");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        RButonUnidad.setBackground(new java.awt.Color(255, 255, 255));
        RButonUnidad.setForeground(new java.awt.Color(0, 0, 0));
        RButonUnidad.setText("Por unidad/pieza");
        RButonUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        RButonUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonUnidadActionPerformed(evt);
            }
        });
        jPanel2.add(RButonUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        RButonPaquete.setBackground(new java.awt.Color(255, 255, 255));
        RButonPaquete.setForeground(new java.awt.Color(0, 0, 0));
        RButonPaquete.setText("Como paquete (kit)");
        RButonPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonPaqueteActionPerformed(evt);
            }
        });
        jPanel2.add(RButonPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        txtPrecioFinal.setEditable(false);
        txtPrecioFinal.setText("0");
        jPanel2.add(txtPrecioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 122, -1));

        btnGuardarProducto.setBackground(new java.awt.Color(57, 78, 194));
        btnGuardarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnGuardarProducto.setText("Guardar productos");
        btnGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarProductoMouseExited(evt);
            }
        });
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 250, 47));

        jLabel16.setText("Precio final con iva *");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txtPrecioFinalIva.setEditable(false);
        txtPrecioFinalIva.setText("0");
        jPanel2.add(txtPrecioFinalIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 122, -1));

        jLabel19.setText("Imagen");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 6, -1, -1));

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgP.png"))); // NOI18N
        jPanel2.add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        btnSubirImg.setBackground(new java.awt.Color(57, 78, 194));
        btnSubirImg.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/subir.png"))); // NOI18N
        btnSubirImg.setText("Subir");
        btnSubirImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubirImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubirImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubirImgMouseExited(evt);
            }
        });
        btnSubirImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirImgActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubirImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, 110, -1));

        btnBorrarImg.setBackground(new java.awt.Color(245, 71, 71));
        btnBorrarImg.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnBorrarImg.setText("Borrar");
        btnBorrarImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarImgActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 95, -1));

        jLabel20.setText("* Precio por peso");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        txtPrecioPeso.setEditable(false);
        txtPrecioPeso.setText("0");
        jPanel2.add(txtPrecioPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 122, -1));

        btnGenerarCodigo.setBackground(new java.awt.Color(57, 78, 194));
        btnGenerarCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/alinear-justificar.png"))); // NOI18N
        btnGenerarCodigo.setText("Generar");
        btnGenerarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 95, -1, 30));

        ComboBoxPeso.setLabeText("Unidades");
        ComboBoxPeso.setLineColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(ComboBoxPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 115, -1));

        comboxDepartamentos.setLabeText("Departamento");
        comboxDepartamentos.setLineColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(comboxDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 250, -1));

        txtCosto.setLabelText("Precio de Compra *");
        txtCosto.setLineColor(new java.awt.Color(22, 35, 105));
        txtCosto.setSelectionColor(new java.awt.Color(22, 35, 105));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostoKeyReleased(evt);
            }
        });
        jPanel2.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 240, -1));

        txtCodigo.setLabelText("Codigo de Barras *");
        txtCodigo.setLineColor(new java.awt.Color(22, 35, 105));
        txtCodigo.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 79, 279, -1));

        txtDescripcion.setLabelText("Descripcion");
        txtDescripcion.setLineColor(new java.awt.Color(22, 35, 105));
        txtDescripcion.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 132, 279, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 580, 20));

        txtNombre.setLabelText("Nombre del Producto *");
        txtNombre.setLineColor(new java.awt.Color(22, 35, 105));
        txtNombre.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 16, 279, -1));

        materialTabbed1.addTab("Datos generales", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMaximo.setLabelText("Maximo");
        txtMaximo.setLineColor(new java.awt.Color(22, 35, 105));
        txtMaximo.setSelectionColor(new java.awt.Color(22, 35, 105));

        txtMinimo.setLabelText("Minimo");
        txtMinimo.setLineColor(new java.awt.Color(22, 35, 105));
        txtMinimo.setSelectionColor(new java.awt.Color(22, 35, 105));

        labelCant1.setText("Unidad");

        labelCant2.setText("Unidad");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCant1)
                    .addComponent(labelCant2))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCant1)
                    .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCant2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel36.setText("Recordatorio del inventario");

        jCheckBoxCustom3.setBackground(new java.awt.Color(57, 78, 194));
        jCheckBoxCustom3.setText("Este producto requiere receta ");
        jCheckBoxCustom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCustom3ActionPerformed(evt);
            }
        });

        txtCantidad.setLabelText("Existencia *");
        txtCantidad.setLineColor(new java.awt.Color(22, 35, 105));
        txtCantidad.setSelectionColor(new java.awt.Color(22, 35, 105));

        labelCant.setText("Unidad");

        checkInventario.setBackground(new java.awt.Color(57, 78, 194));
        checkInventario.setText("Este producto SI utiliza inventario");
        checkInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCant)))
                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(checkInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCant)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Inventario", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Este producto maneja estos impuestos");

        btnAgregarImpuesto.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarImpuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarImpuesto.setText("Agregar");
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

        comboxTipoImpuesto.setLabeText("Impuestos");
        comboxTipoImpuesto.setLineColor(new java.awt.Color(22, 35, 105));

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
        jScrollPane2.setViewportView(tablaImpuestos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboxTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarImpuesto))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(554, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboxTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarImpuesto))
                .addContainerGap(329, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Impuestos", jPanel3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 620, -1));

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
    
    private void actualizarFunciones(){
        this.add=new Agregar(con,this,JF);
        this.delete=new Eliminar(con);
        this.search=new Buscar(con);
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
    
    private void actualizarPrecioIva(){
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
    
    private void actualizarcomboxTipoImpuesto(){
        comboxTipoImpuesto.removeAllItems(); //eliminar los impuestos 
        
        //pasar por todos los impuestos existentes y llenarlo
        llenarComboxTipoImpuestos();
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
    
    private void actualizarComboxDepartamentos(){
        comboxDepartamentos.removeAllItems();
        llenarComboxDepartamentos();
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

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged

    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jCheckBoxCustom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCustom3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCustom3ActionPerformed

    private void btnAgregarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImpuestoActionPerformed
        if(!verificarImpuestoExistente(comboxTipoImpuesto.getSelectedItem().toString())){
            agregarImpuesto();
            actualizarTablaImpuestos();
        }
        else{
            new MessageError(this,"Este impuesto ya existe en este producto");
            //new FrameError(null,"Este impuesto ya existe en este producto").setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarImpuestoActionPerformed

    private void btnAgregarImpuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarImpuestoMousePressed
        //new FrameDepartamento(con,JF).setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnAgregarImpuestoMousePressed

    private void checkInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInventarioActionPerformed

    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        generarCodigoBarrasAleatorio();
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed

    private void btnBorrarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarImgActionPerformed
        borrarImgProducto();
    }//GEN-LAST:event_btnBorrarImgActionPerformed

//GEN-FIRST:event_btnSubirImgActionPerformed
 
//GEN-LAST:event_btnSubirImgActionPerformed

    private void btnSubirImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirImgMouseExited
        btnSubirImg.setBackground(ColorBtn);
    }//GEN-LAST:event_btnSubirImgMouseExited

    private void btnSubirImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirImgMouseEntered
        btnSubirImg.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnSubirImgMouseEntered

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        if(buscarCajero.permiso9()==1){
            guardarProducto();
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnGuardarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProductoMouseExited
        btnGuardarProducto.setBackground(ColorBtn);
    }//GEN-LAST:event_btnGuardarProductoMouseExited

    private void btnGuardarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProductoMouseEntered
        btnGuardarProducto.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnGuardarProductoMouseEntered

    private void RButonPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonPaqueteActionPerformed
        actualizarSelecion(2);
    }//GEN-LAST:event_RButonPaqueteActionPerformed

    private void RButonUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonUnidadActionPerformed
        actualizarSelecion(3);
    }//GEN-LAST:event_RButonUnidadActionPerformed

    private void RButonGranelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonGranelActionPerformed
        actualizarSelecion(1);
    }//GEN-LAST:event_RButonGranelActionPerformed

    private void sprineGananciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sprineGananciaMouseClicked
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaMouseClicked

    private void sprineGananciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sprineGananciaStateChanged
        calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaStateChanged

    private void sprineGananciaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sprineGananciaAncestorMoved
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaAncestorMoved

    private void sprineGananciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sprineGananciaAncestorAdded
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaAncestorAdded

    private void txtCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyReleased
        calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_txtCostoKeyReleased

   
    private void btnSubirImgActionPerformed(java.awt.event.ActionEvent evt) {                                            
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        fileChooser.setFileFilter(imgFilter);
        int result = fileChooser.showOpenDialog(this);

        if(result == JFileChooser.APPROVE_OPTION) {
            rutaImg = fileChooser.getSelectedFile().getPath();
            Image img = new ImageIcon(rutaImg).getImage();

            // Espera a que el labelImg tenga un tamaño válido
            if (labelImg.getWidth() > 0 && labelImg.getHeight() > 0) {
                ImageIcon icono = new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(), Image.SCALE_SMOOTH));
                labelImg.setIcon(icono);
            } else {
                System.out.println("El labelImg aún no tiene un tamaño válido.");
                //borrarImgProducto();
            }
        }
    }    
    private void generarCodigoBarrasAleatorio(){
        String codigo;
        do{
            codigo="";
            codigo=combinar();
        }while(comprobarSiExisteCodigoBarrasRandom(codigo));
        txtCodigo.setText(codigo);
        txtCodigo.setForeground(Color.black);
    }
    
    private String combinar(){
        String codigo="";
        for(int i=0;i<7;i++){
            int num=random.nextInt(2);
            if(num==0){
                codigo+=generarLetra();
            }
            else{
                codigo+=generarNum();
            }
        }     
        return codigo;
    }
    
    private String generarLetra(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomLetter = alphabet.charAt(random.nextInt(alphabet.length()));
        return randomLetter+"";
    }
    
    private String generarNum(){
        int randomInt = random.nextInt(10);
        return randomInt+"";
    }
    
    private boolean comprobarSiExisteCodigoBarrasRandom(String codigo){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from productos");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                //agregar el iva a los productos
                if(rs.getString("codigobarras").equals(codigo)){
                    return true;
                }
            }
            return false;
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }      
        return false;
    }
    
    private void borrarImgProducto(){
        rutaImg="";
        String rutaProyecto=System.getProperty("user.dir");
        Image img=new ImageIcon(rutaProyecto+"\\src\\Img\\imgP.png").getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);    
    }
    
    private void calcularGananciaFinalComprobacion(){        
        //comprobar si no hay error en los datos necesarios 
        if (!txtCosto.getText().equals("") && !sprineGanancia.getValue().toString().equals("")){
            calcularGnanciaFinal();
            actualizarPrecioIva();
        }
        else{
            sprineGanancia.setValue(0);
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
        
    }
    
    private void guardarProducto(){
        //obtener datos necesarios 
        float precio=conver.convertirStringFloat(txtPrecioFinalIva.getText().toString());
        float cantidad=conver.convertirStringFloat(txtCantidad.getText().toString());
        if (!txtNombre.getText().equals("") && !txtCosto.getText().equals("") && !txtCodigo.getText().equals("") && precio>0 && cantidad>0){
            guardarDatoProductos();
            guardarImpuestoProducto();
            new MessageCorrect(this,"El producto '"+txtNombre.getText()+"'"
                    + "\nfue añadido con exito",null);
            limpiarPantalla();
        }
        else{
            new MessageError(this,"Faltan datos por llenar.\n "
                    + "Revisa el nombre del producto,codigo de barras \n, "
                    + "el precio y la cantidad en existencia");
        }
    }
    
    private void guardarImpuestoProducto(){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from tablasproductoiva");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                //agregar el iva a los productos
                int id=crearIdImpuestoProducto();
                String productoIva=txtCosto.getText();
                String nombre=rs.getString("nombre");
                float precio=conver.convertirStringFloat(rs.getString("cantidad"));
                
                add.productosYsusIvas(id,productoIva,nombre,precio);
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
    }    
    
    private int crearIdImpuestoProducto(){
        int id=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from productosivas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                //agregar el iva a los productos
                id=conver.convertirStringInt(rs.getString("id"));
            }
            id++;
            return id;
        }catch(SQLException ex){
            return id;
        }        
    }
    
    private void guardarDatoProductos(){
        //obtener datos necesarios 
        String nombre=txtNombre.getText();
        String descripcion=txtDescripcion.getText();
        String codigoBarras=txtCodigo.getText().toString();
        float costo=conver.convertirStringFloat(txtCosto.getText().toString());
        float ganancia=conver.convertirStringFloat(sprineGanancia.getValue().toString());
        float precio=conver.convertirStringFloat(txtPrecioFinal.getText());
        String seVendePor=getSeVendePor();
        String ubicacion=comboxDepartamentos.getSelectedItem().toString();
        int cantidad=conver.convertirStringInt(txtCantidad.getText());
        String usaInventario=getUsaInventario();
        float precioPeso=conver.convertirStringFloat(txtPrecioPeso.getText());
        String unidad=ComboBoxPeso.getSelectedItem().toString();
        float minimo=conver.convertirStringFloat(txtMinimo.getText().toString());
        float maximo=conver.convertirStringFloat(txtMaximo.getText().toString());
        
        add.productos(nombre,descripcion,codigoBarras,costo,ganancia,precio,
                seVendePor,ubicacion,cantidad,usaInventario,rutaImg,precioPeso,unidad,minimo,maximo);
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
            labelCant1.setText("en este momento");
            labelCant2.setText("en este momento");
        }
        else{
            labelCant.setText("g/kg/m/lt/lb/...");
            labelCant1.setText("g/kg/m/lt/lb/...");
            labelCant2.setText("g/kg/m/lt/lb/...");
            txtPrecioPeso.setEditable(true);
        }
    }
    
    private void limpiarPantalla(){
        txtNombre.setText("");
        txtCosto.setText("");
        txtDescripcion.setText("");
        txtCodigo.setText("");
        txtCosto.setText("");
        txtCantidad.setText("");
        txtPrecioFinal.setText("");
        txtPrecioFinalIva.setText("");
        sprineGanancia.setValue(0);
        
        RButonPaquete.setSelected(false);
        RButonGranel.setSelected(false);
        RButonUnidad.setSelected(false);
        checkInventario.setSelected(false);
        
        borrarImgProducto();
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
        this.tablaImpuestos.fixTable(jScrollPane2);
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
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combobox.Combobox ComboBoxPeso;
    private javax.swing.JRadioButton RButonGranel;
    private javax.swing.JRadioButton RButonPaquete;
    private javax.swing.JRadioButton RButonUnidad;
    private javax.swing.JButton btnAgregarImpuesto;
    private javax.swing.JButton btnBorrarImg;
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnSubirImg;
    private checkbox.JCheckBoxCustom checkInventario;
    private combobox.Combobox comboxDepartamentos;
    private combobox.Combobox comboxTipoImpuesto;
    private checkbox.JCheckBoxCustom jCheckBoxCustom3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelCant;
    private javax.swing.JLabel labelCant1;
    private javax.swing.JLabel labelCant2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelImg;
    private tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JSpinner sprineGanancia;
    private javaswingdev.swing.table.Table tablaImpuestos;
    private textfield.TextField txtCantidad;
    private textfield.TextField txtCodigo;
    private textfield.TextField txtCosto;
    private textfield.TextField txtDescripcion;
    private textfield.TextField txtMaximo;
    private textfield.TextField txtMinimo;
    private textfield.TextField txtNombre;
    private javax.swing.JTextField txtPrecioFinal;
    private javax.swing.JTextField txtPrecioFinalIva;
    private javax.swing.JTextField txtPrecioPeso;
    // End of variables declaration//GEN-END:variables
}
