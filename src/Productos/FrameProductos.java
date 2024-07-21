package Productos;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.BuscarCajero;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
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
    Color ColorBtn=new Color(22,35,105);
    
    Color colorBtnFondo=new Color(22,35,105);
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
        
        txtNombre.setForeground(Color.gray);
        txtDescripcion.setForeground(Color.gray);
        txtCodigo.setForeground(Color.gray);
        
        setIconImage(getIcono());
        //this.setSize(597,716);
        this.setTitle("Productos");
        this.setResizable(false);
        this.setSize(620, 685);
        centrarPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        labelCant = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sprineGanancia = new javax.swing.JSpinner();
        RButonGranel = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RButonUnidad = new javax.swing.JRadioButton();
        RButonPaquete = new javax.swing.JRadioButton();
        txtPrecioFinal = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
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
        txtNombre = new textfield.TextField();
        txtCodigo = new textfield.TextField();
        txtDescripcion = new textfield.TextField();
        checkInventario = new checkbox.JCheckBoxCustom();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnAgregarImpuesto = new javax.swing.JButton();
        comboxTipoImpuesto = new combobox.Combobox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaImpuestos = new javaswingdev.swing.table.Table();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        textField2 = new textfield.TextField();
        textField3 = new textfield.TextField();
        jLabel36 = new javax.swing.JLabel();
        jCheckBoxCustom2 = new checkbox.JCheckBoxCustom();
        jCheckBoxCustom3 = new checkbox.JCheckBoxCustom();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBoxCustom1 = new checkbox.JCheckBoxCustom();
        textField4 = new textfield.TextField();
        textField5 = new textfield.TextField();
        textField6 = new textfield.TextField();
        jPanel8 = new javax.swing.JPanel();
        textField7 = new textfield.TextField();
        textField8 = new textfield.TextField();
        textField9 = new textfield.TextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        jLabel29 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        textField10 = new textfield.TextField();
        textField11 = new textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDepartamentos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Precio de ganancia");

        labelCant.setText("en este momento");

        jLabel10.setText("Hay");

        jLabel5.setText("Se vende");

        jLabel6.setText("Precio Costo $");

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

        RButonGranel.setBackground(new java.awt.Color(255, 255, 255));
        RButonGranel.setForeground(new java.awt.Color(0, 0, 0));
        RButonGranel.setText("A granel (Usa decimales)");
        RButonGranel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonGranelActionPerformed(evt);
            }
        });

        jLabel7.setText("Ganancia");

        jLabel8.setText("%");

        RButonUnidad.setBackground(new java.awt.Color(255, 255, 255));
        RButonUnidad.setForeground(new java.awt.Color(0, 0, 0));
        RButonUnidad.setText("Por unidad/pieza");
        RButonUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        RButonUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonUnidadActionPerformed(evt);
            }
        });

        RButonPaquete.setBackground(new java.awt.Color(255, 255, 255));
        RButonPaquete.setForeground(new java.awt.Color(0, 0, 0));
        RButonPaquete.setText("Como paquete (kit)");
        RButonPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButonPaqueteActionPerformed(evt);
            }
        });

        txtPrecioFinal.setEditable(false);
        txtPrecioFinal.setText("0");

        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostoKeyReleased(evt);
            }
        });

        btnGuardarProducto.setBackground(new java.awt.Color(22, 35, 105));
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

        jLabel16.setText("Precio final con iva");

        txtPrecioFinalIva.setEditable(false);
        txtPrecioFinalIva.setText("0");

        jLabel19.setText("Imagen");

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgP.png"))); // NOI18N

        btnSubirImg.setBackground(new java.awt.Color(22, 35, 105));
        btnSubirImg.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/subir.png"))); // NOI18N
        btnSubirImg.setText("Subir");
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

        btnBorrarImg.setBackground(new java.awt.Color(22, 35, 105));
        btnBorrarImg.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnBorrarImg.setText("Borrar");
        btnBorrarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarImgActionPerformed(evt);
            }
        });

        jLabel20.setText("Precio por peso");

        txtPrecioPeso.setEditable(false);
        txtPrecioPeso.setText("0");

        btnGenerarCodigo.setBackground(new java.awt.Color(22, 35, 105));
        btnGenerarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/alinear-justificar.png"))); // NOI18N
        btnGenerarCodigo.setText("Generar");
        btnGenerarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });

        ComboBoxPeso.setLabeText("Unidades");
        ComboBoxPeso.setLineColor(new java.awt.Color(22, 35, 105));

        comboxDepartamentos.setLabeText("Departamento");
        comboxDepartamentos.setLineColor(new java.awt.Color(22, 35, 105));

        txtNombre.setLabelText("Nombre del Producto");
        txtNombre.setLineColor(new java.awt.Color(22, 35, 105));
        txtNombre.setSelectionColor(new java.awt.Color(22, 35, 105));

        txtCodigo.setLabelText("Codigo de Barras");
        txtCodigo.setLineColor(new java.awt.Color(22, 35, 105));
        txtCodigo.setSelectionColor(new java.awt.Color(22, 35, 105));

        txtDescripcion.setLabelText("Descripcion");
        txtDescripcion.setLineColor(new java.awt.Color(22, 35, 105));
        txtDescripcion.setSelectionColor(new java.awt.Color(22, 35, 105));

        checkInventario.setBackground(new java.awt.Color(22, 35, 105));
        checkInventario.setText("Este producto SI utiliza inventario");
        checkInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerarCodigo))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImg)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(jLabel19))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(btnSubirImg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnBorrarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(RButonUnidad)
                                .addGap(6, 6, 6)
                                .addComponent(RButonGranel)
                                .addGap(6, 6, 6)
                                .addComponent(RButonPaquete))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(labelCant))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sprineGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel8))
                                    .addComponent(comboxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtPrecioFinalIva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecioPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(checkInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnGuardarProducto)))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addGap(6, 6, 6)
                        .addComponent(labelImg)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubirImg)
                            .addComponent(btnBorrarImg)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerarCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(RButonUnidad))
                    .addComponent(RButonGranel)
                    .addComponent(RButonPaquete))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(txtPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sprineGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel8))))))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPrecioFinalIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(labelCant))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Este producto maneja estos impuestos");

        btnAgregarImpuesto.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarImpuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarImpuesto.setText("Agregar");
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
                .addContainerGap(162, Short.MAX_VALUE))
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
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Impuestos", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textField2.setLabelText("Maximo");
        textField2.setLineColor(new java.awt.Color(22, 35, 105));
        textField2.setSelectionColor(new java.awt.Color(22, 35, 105));

        textField3.setLabelText("Minimo");
        textField3.setLineColor(new java.awt.Color(22, 35, 105));
        textField3.setSelectionColor(new java.awt.Color(22, 35, 105));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel36.setText("Recordatorio del inventario");

        jCheckBoxCustom2.setBackground(new java.awt.Color(22, 35, 105));
        jCheckBoxCustom2.setText("Este producto se vendera como servicio");
        jCheckBoxCustom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCustom2ActionPerformed(evt);
            }
        });

        jCheckBoxCustom3.setBackground(new java.awt.Color(22, 35, 105));
        jCheckBoxCustom3.setText("Este producto requiere receta ");
        jCheckBoxCustom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCustom3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Opciones del producto", jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Categorias");

        jCheckBoxCustom1.setBackground(new java.awt.Color(22, 35, 105));
        jCheckBoxCustom1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxCustom1.setText("Este producto es una suscripcion/membresia");
        jCheckBoxCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCustom1ActionPerformed(evt);
            }
        });

        textField4.setLabelText("Precio 1");
        textField4.setLineColor(new java.awt.Color(22, 35, 105));
        textField4.setSelectionColor(new java.awt.Color(22, 35, 105));

        textField5.setLabelText("Precio 2");
        textField5.setLineColor(new java.awt.Color(22, 35, 105));
        textField5.setSelectionColor(new java.awt.Color(22, 35, 105));

        textField6.setLabelText("Precio 3");
        textField6.setLineColor(new java.awt.Color(22, 35, 105));
        textField6.setSelectionColor(new java.awt.Color(22, 35, 105));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jCheckBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Suscripcion", jPanel6);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        textField7.setLabelText("Localizacion");
        textField7.setLineColor(new java.awt.Color(22, 35, 105));
        textField7.setSelectionColor(new java.awt.Color(22, 35, 105));

        textField8.setLabelText("Clave SAT");
        textField8.setLineColor(new java.awt.Color(22, 35, 105));
        textField8.setSelectionColor(new java.awt.Color(22, 35, 105));

        textField9.setLabelText("Cuenta Predial");
        textField9.setLineColor(new java.awt.Color(22, 35, 105));
        textField9.setSelectionColor(new java.awt.Color(22, 35, 105));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textField9, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(306, 306, 306))
        );

        jTabbedPane1.addTab("Adicionales", jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setText("Fecha del Doc. Aduanera");

        dateChooser1.setForeground(new java.awt.Color(22, 35, 105));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 23, 68));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circulo-cruzado.png"))); // NOI18N
        jButton2.setText("Eliminar datos Aduaneros");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textField10.setLabelText("Nombre de la aduana");
        textField10.setLineColor(new java.awt.Color(22, 35, 105));
        textField10.setSelectionColor(new java.awt.Color(22, 35, 105));

        textField11.setLabelText("Pedimento");
        textField11.setLineColor(new java.awt.Color(22, 35, 105));
        textField11.setSelectionColor(new java.awt.Color(22, 35, 105));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField8)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField11, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(textField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(textField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(152, 152, 152))
        );

        jTabbedPane1.addTab("Aduanas", jPanel10);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 620, 530));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NUEVO PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 127, -1, -1));

        jPanel5.setBackground(new java.awt.Color(22, 35, 105));
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
        jLabel17.setText("Productos");

        panelBtnExit.setBackground(new java.awt.Color(22, 35, 105));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
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

        jPanel4.setBackground(new java.awt.Color(22, 35, 105));

        btnEliminar.setBackground(new java.awt.Color(22, 35, 105));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/documento-firmado.png"))); // NOI18N
        jLabel2.setText("Actualizar productos");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDepartamentos.setBackground(new java.awt.Color(22, 35, 105));
        btnDepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepartamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepartamentosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDepartamentosMousePressed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lineas-de-calendario.png"))); // NOI18N
        jLabel18.setText("Departamentos");

        javax.swing.GroupLayout btnDepartamentosLayout = new javax.swing.GroupLayout(btnDepartamentos);
        btnDepartamentos.setLayout(btnDepartamentosLayout);
        btnDepartamentosLayout.setHorizontalGroup(
            btnDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDepartamentosLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(73, 73, 73))
        );
        btnDepartamentosLayout.setVerticalGroup(
            btnDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDepartamentosLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDepartamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 620, 70));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 620, -1));

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
    
    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        if(buscarCajero.permiso9()==1){
            guardarProducto();
        }          
    }//GEN-LAST:event_btnGuardarProductoActionPerformed
    
    
    private void sprineGananciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sprineGananciaAncestorAdded
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaAncestorAdded

    private void sprineGananciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sprineGananciaMouseClicked
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaMouseClicked

    private void sprineGananciaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sprineGananciaAncestorMoved
        //calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaAncestorMoved

    private void sprineGananciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sprineGananciaStateChanged
        calcularGananciaFinalComprobacion();
    }//GEN-LAST:event_sprineGananciaStateChanged

    private void RButonUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonUnidadActionPerformed
        actualizarSelecion(3);
    }//GEN-LAST:event_RButonUnidadActionPerformed

    private void RButonGranelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonGranelActionPerformed
        actualizarSelecion(1);
    }//GEN-LAST:event_RButonGranelActionPerformed

    private void RButonPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButonPaqueteActionPerformed
        actualizarSelecion(2);
    }//GEN-LAST:event_RButonPaqueteActionPerformed

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed
        //calcularGnanciaFinal();
    }//GEN-LAST:event_txtCostoKeyPressed

    private void btnAgregarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImpuestoActionPerformed
        if(!verificarImpuestoExistente(comboxTipoImpuesto.getSelectedItem().toString())){
            agregarImpuesto();
            actualizarTablaImpuestos();
        }
        else{
            new FrameError(null,"Este impuesto ya existe en este producto").setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarImpuestoActionPerformed

    private void txtCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyReleased
       calcularGnanciaFinal();
       actualizarPrecioIva();
    }//GEN-LAST:event_txtCostoKeyReleased
    
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
    
    private void btnAgregarImpuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarImpuestoMousePressed
        //new FrameDepartamento(con,JF).setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnAgregarImpuestoMousePressed

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        JF.apagarWallpaper();
        this.dispose();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        panelBtnExit.setBackground(Color.RED);
        labelExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        panelBtnExit.setBackground(new Color(22,35,105));
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged

    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        this.dispose();
        new FrameActualizarProductos(con,JF).setVisible(true);
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(colorBtnFondoHover);
        jLabel2.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(colorBtnFondo);
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnDepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentosMouseEntered
        btnDepartamentos.setBackground(colorBtnFondoHover);
        jLabel18.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnDepartamentosMouseEntered

    private void btnDepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentosMouseExited
        btnDepartamentos.setBackground(colorBtnFondo);
        jLabel18.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnDepartamentosMouseExited

    private void btnDepartamentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentosMousePressed
        new FrameDepartamento(con,JF).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDepartamentosMousePressed

    private void btnGuardarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProductoMouseEntered
        btnGuardarProducto.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnGuardarProductoMouseEntered

    private void btnGuardarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProductoMouseExited
        btnGuardarProducto.setBackground(ColorBtn);
    }//GEN-LAST:event_btnGuardarProductoMouseExited

    private void btnSubirImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirImgMouseEntered
        btnSubirImg.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnSubirImgMouseEntered

    private void btnSubirImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirImgMouseExited
        btnSubirImg.setBackground(ColorBtn);
    }//GEN-LAST:event_btnSubirImgMouseExited
    /*
    private void btnSubirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirImgActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        fileChooser.setFileFilter(imgFilter);
        int result = fileChooser.showOpenDialog(this);
        
        if(result==JFileChooser.APPROVE_OPTION){
            rutaImg=fileChooser.getSelectedFile().getPath();
            Image img=new ImageIcon(rutaImg).getImage();
            ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
            labelImg.setIcon(icono);
        }
    }//GEN-LAST:event_btnSubirImgActionPerformed
    */
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
    private void btnBorrarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarImgActionPerformed
        borrarImgProducto();
    }//GEN-LAST:event_btnBorrarImgActionPerformed

    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        generarCodigoBarrasAleatorio();
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed

    private void jCheckBoxCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCustom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCustom1ActionPerformed

    private void jCheckBoxCustom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCustom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCustom2ActionPerformed

    private void jCheckBoxCustom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCustom3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCustom3ActionPerformed

    private void checkInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInventarioActionPerformed
    
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
        
        if (!txtNombre.getText().equals("") && !txtCodigo.getText().equals("") && precio>0 && cantidad>0){
            guardarDatoProductos();
            guardarImpuestoProducto();
            new FrameCorrecto(null,"El producto '"+txtNombre.getText()+"'"
                    + "\nfue añadido con exito").setVisible(true);
            limpiarPantalla();
        }
        else{
            new FrameError(null,"Faltan datos por llenar.").setVisible(true);           
            /*
            new FrameError("Faltan datos por llenar.\n "
                    + "Revisa el nombre del producto,codigo de barras \n, "
                    + "el precio y la cantidad en existencia").setVisible(true);*/
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
                String productoIva=txtNombre.getText();
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
        add.productos(nombre,descripcion,codigoBarras,costo,ganancia,precio,
                seVendePor,ubicacion,cantidad,usaInventario,rutaImg,precioPeso,unidad);
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
            labelCant.setText("g/kg/m/lt/lb/...");
            txtPrecioPeso.setEditable(true);
        }
    }
    
    private void limpiarPantalla(){
        txtNombre.setText("Nombre del producto");
        txtDescripcion.setText("Descripcion del producto...");
        txtCodigo.setText("Codigo de barras");
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
    private javax.swing.JPanel btnDepartamentos;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnSubirImg;
    private checkbox.JCheckBoxCustom checkInventario;
    private combobox.Combobox comboxDepartamentos;
    private combobox.Combobox comboxTipoImpuesto;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton jButton2;
    private checkbox.JCheckBoxCustom jCheckBoxCustom1;
    private checkbox.JCheckBoxCustom jCheckBoxCustom2;
    private checkbox.JCheckBoxCustom jCheckBoxCustom3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel labelCant;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelImg;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JSpinner sprineGanancia;
    private javaswingdev.swing.table.Table tablaImpuestos;
    private textfield.TextField textField10;
    private textfield.TextField textField11;
    private textfield.TextField textField2;
    private textfield.TextField textField3;
    private textfield.TextField textField4;
    private textfield.TextField textField5;
    private textfield.TextField textField6;
    private textfield.TextField textField7;
    private textfield.TextField textField8;
    private textfield.TextField textField9;
    private javax.swing.JTextField txtCantidad;
    private textfield.TextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private textfield.TextField txtDescripcion;
    private textfield.TextField txtNombre;
    private javax.swing.JTextField txtPrecioFinal;
    private javax.swing.JTextField txtPrecioFinalIva;
    private javax.swing.JTextField txtPrecioPeso;
    // End of variables declaration//GEN-END:variables
}
