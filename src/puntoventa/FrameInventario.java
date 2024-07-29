package puntoventa;
import Calculadora.FrameCalculadora;
import ClasesGlobales.Agregar;
import ClasesGlobales.Atajos;
import ClasesGlobales.Buscar;
import ClasesGlobales.BuscarCajero;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Clientes.FrameClientes;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

import Opciones.FrameOpciones;
import Clientes.FrameCreditos;
import Cortes.FrameCorte;
import Emails.FrameCorreo;
import Inventario.FrameInventarioTienda;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameDecision;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import Opciones.FrameCreacionHorarios;
import OpcionesBarra.FrameAsignarCliente;
import OpcionesBarra.FrameCompras2;
import OpcionesBarra.FrameDevolucion;
import OpcionesBarra.FrameEliminarProducto;
import OpcionesBarra.FrameEntradas;
import OpcionesBarra.FramePagosTarjeta;
import OpcionesBarra.FrameSalida;
import OpcionesBarra.FrameVentasHoy;
import OpcionesInventario.FrameBuscarProducto;
import Productos.FrameProductos;
import Productos.FrameTablaProductos;
import Reportes.FrameEscojerFechaReporte;
import Reportes.FrameReporte;
import Ventas.FrameVentas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//librerias para tener la fecha
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javaswingdev.message.MessageDialog;
import javaswingdev.swing.Glass;
import javaswingdev.swing.table.Table;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class FrameInventario extends javax.swing.JFrame implements Runnable{
    Connection con;
    private ActualizarTablaCarrito obj;
    
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    Buscar search;
    BuscarCarrito searchCard;
    BuscarCajero buscarCajero;
    float TotalC;
    
    int numCarrito=0;
    ArrayList<Integer> indexCarritos =new ArrayList<Integer>();
    //hora 
    Thread h1;    
    
    //detector de teclas 
    Atajos teclado=new Atajos();
    
    String cajeroActual;
    
    //colores 
    Color colorBtnFondo=new Color(57,78,194);
    Color colorBtnFondoHover=new Color(255,255,255);
    
    boolean inventarioApagado=false;
    Color black=new Color(0,0,0,132); //132
    Color trans=new Color(0,0,0,0);
    
    //esto es para el fecto oscuro de la pantalla cuando abres otra interfaz
    private Animator animator;
    private Glass glass;
    private boolean show;
    
    private int idCliente=-1;
    
    public FrameInventario(Connection con,String cajeroActual){
        this.con=con;
        this.cajeroActual=cajeroActual;
        buscarCajero=new BuscarCajero(con,this);
        
        actualizarClases();
        initComponents();
        actualizarPantalla();
        setIconImage(getIcono());
        
        obj=new ActualizarTablaCarrito(con,numCarrito);
        borrarTextoCodigo();
        actualizarTablaCarrito();
        //borrarTabla();
        
        TableCarrito.setCellSelectionEnabled(false);
        indexCarritos.add(0);
        //nodo de hora 
        h1=new Thread(this);
        h1.start();
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setSize(1370, 748);
        //wallpaper.setBackground(black);
        //wallpaper.setVisible(false);
        apagarWallpaper();
        adaptarPantalla();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int anchoPantalla = (int) screenSize.getWidth();
        int altoPantalla = (int) screenSize.getHeight();

        // Establecer el tamaño del marco
        //(anchoPantalla, altoPantalla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        btnReporte1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnBorrarTABLA = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelFecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumCarrito = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnSalidas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelTotal = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        PanelBtns = new javax.swing.JPanel();
        btnVentas = new javax.swing.JPanel();
        labelV = new javax.swing.JLabel();
        btnCreditos = new javax.swing.JPanel();
        labelV1 = new javax.swing.JLabel();
        bntClientes = new javax.swing.JPanel();
        labelV2 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JPanel();
        labelV4 = new javax.swing.JLabel();
        btnCompras = new javax.swing.JPanel();
        labelV5 = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JPanel();
        labelV6 = new javax.swing.JLabel();
        btnCorte = new javax.swing.JPanel();
        labelV7 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JPanel();
        labelV8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        labelV9 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        labelV3 = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        btnCorreos = new javax.swing.JButton();
        labelImg = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        btnRecuperarCarrito = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardarCarrito = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelCantCarrito = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCarrito = new javaswingdev.swing.table.Table();
        textCodigo = new textfield.TextField();
        jLabel3 = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        labelNombreCliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        background = new javaswingdev.message.Background();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 35, 105));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 78, 194));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        btnReporte1.setBackground(new java.awt.Color(22, 35, 105));
        btnReporte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporte1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporte1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReporte1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnReporte1Layout = new javax.swing.GroupLayout(btnReporte1);
        btnReporte1.setLayout(btnReporte1Layout);
        btnReporte1Layout.setHorizontalGroup(
            btnReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        btnReporte1Layout.setVerticalGroup(
            btnReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Sin título.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 711, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(btnReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 80));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 110, -1));

        btnBorrarTABLA.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrarTABLA.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarTABLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnBorrarTABLA.setText("Vaciar carrito");
        btnBorrarTABLA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarTABLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTABLAActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarTABLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jPanel3.setBackground(new java.awt.Color(57, 78, 194));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton2.setBackground(new java.awt.Color(57, 78, 194));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/documento-firmado.png"))); // NOI18N
        jButton2.setText("Ventas y devoluciones del dia");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(57, 78, 194));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculadora.png"))); // NOI18N
        jButton3.setText("Ventas con tarjeta de Credito");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("05/07/2022");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero del carrito");

        txtNumCarrito.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        txtNumCarrito.setForeground(new java.awt.Color(255, 255, 255));
        txtNumCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito.png"))); // NOI18N
        txtNumCarrito.setText("0");

        jButton4.setBackground(new java.awt.Color(57, 78, 194));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuarios.png"))); // NOI18N
        jButton4.setText("Cliente asignado a la compra");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumCarrito, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(labelFecha))
                .addGap(103, 103, 103))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton2)
                        .addComponent(jButton4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFecha)
                    .addComponent(txtNumCarrito))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, -1, 80));

        btnDevolucion.setBackground(new java.awt.Color(255, 255, 255));
        btnDevolucion.setForeground(new java.awt.Color(0, 0, 0));
        btnDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnDevolucion.setText("F5 Devolucion");
        btnDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });
        getContentPane().add(btnDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        btnEntradas.setBackground(new java.awt.Color(255, 255, 255));
        btnEntradas.setForeground(new java.awt.Color(0, 0, 0));
        btnEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/donar.png"))); // NOI18N
        btnEntradas.setText("F7 Entradas");
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        btnSalidas.setBackground(new java.awt.Color(255, 255, 255));
        btnSalidas.setForeground(new java.awt.Color(0, 0, 0));
        btnSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usd-circulo.png"))); // NOI18N
        btnSalidas.setText("F8 Salidas");
        btnSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTotal.setFont(new java.awt.Font("Microsoft JhengHei", 0, 48)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(51, 51, 255));
        labelTotal.setText("$0.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(labelTotal)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(labelTotal))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 240, 70));

        btnComprar.setBackground(new java.awt.Color(57, 78, 194));
        btnComprar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/comprobacion-del-carrito-de-la-compra.png"))); // NOI18N
        btnComprar.setText("F-12 COMPRAR");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 550, 160, 70));

        PanelBtns.setBackground(new java.awt.Color(57, 78, 194));

        btnVentas.setBackground(new java.awt.Color(57, 78, 194));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVentasMousePressed(evt);
            }
        });

        labelV.setForeground(new java.awt.Color(255, 255, 255));
        labelV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras.png"))); // NOI18N
        labelV.setText("Ventas");

        javax.swing.GroupLayout btnVentasLayout = new javax.swing.GroupLayout(btnVentas);
        btnVentas.setLayout(btnVentasLayout);
        btnVentasLayout.setHorizontalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelV)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        btnVentasLayout.setVerticalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCreditos.setBackground(new java.awt.Color(57, 78, 194));
        btnCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreditosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCreditosMousePressed(evt);
            }
        });

        labelV1.setForeground(new java.awt.Color(255, 255, 255));
        labelV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuarios.png"))); // NOI18N
        labelV1.setText("F2 Creditos");

        javax.swing.GroupLayout btnCreditosLayout = new javax.swing.GroupLayout(btnCreditos);
        btnCreditos.setLayout(btnCreditosLayout);
        btnCreditosLayout.setHorizontalGroup(
            btnCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCreditosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelV1)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnCreditosLayout.setVerticalGroup(
            btnCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCreditosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bntClientes.setBackground(new java.awt.Color(57, 78, 194));
        bntClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bntClientesMousePressed(evt);
            }
        });

        labelV2.setForeground(new java.awt.Color(255, 255, 255));
        labelV2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuarios-alt.png"))); // NOI18N
        labelV2.setText("Clientes");

        javax.swing.GroupLayout bntClientesLayout = new javax.swing.GroupLayout(bntClientes);
        bntClientes.setLayout(bntClientesLayout);
        bntClientesLayout.setHorizontalGroup(
            bntClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bntClientesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelV2)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        bntClientesLayout.setVerticalGroup(
            bntClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bntClientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInventario.setBackground(new java.awt.Color(57, 78, 194));
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInventarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInventarioMousePressed(evt);
            }
        });

        labelV4.setForeground(new java.awt.Color(255, 255, 255));
        labelV4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/movimiento-de-camiones.png"))); // NOI18N
        labelV4.setText("Inventario");

        javax.swing.GroupLayout btnInventarioLayout = new javax.swing.GroupLayout(btnInventario);
        btnInventario.setLayout(btnInventarioLayout);
        btnInventarioLayout.setHorizontalGroup(
            btnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInventarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelV4)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnInventarioLayout.setVerticalGroup(
            btnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInventarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCompras.setBackground(new java.awt.Color(57, 78, 194));
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnComprasMousePressed(evt);
            }
        });

        labelV5.setForeground(new java.awt.Color(255, 255, 255));
        labelV5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/documento-firmado.png"))); // NOI18N
        labelV5.setText("Compras");

        javax.swing.GroupLayout btnComprasLayout = new javax.swing.GroupLayout(btnCompras);
        btnCompras.setLayout(btnComprasLayout);
        btnComprasLayout.setHorizontalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelV5)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnComprasLayout.setVerticalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfiguracion.setBackground(new java.awt.Color(57, 78, 194));
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfiguracionMousePressed(evt);
            }
        });

        labelV6.setForeground(new java.awt.Color(255, 255, 255));
        labelV6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ajustes.png"))); // NOI18N
        labelV6.setText("Configuracion");

        javax.swing.GroupLayout btnConfiguracionLayout = new javax.swing.GroupLayout(btnConfiguracion);
        btnConfiguracion.setLayout(btnConfiguracionLayout);
        btnConfiguracionLayout.setHorizontalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfiguracionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelV6)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnConfiguracionLayout.setVerticalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfiguracionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCorte.setBackground(new java.awt.Color(57, 78, 194));
        btnCorte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCorteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCorteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCorteMousePressed(evt);
            }
        });

        labelV7.setForeground(new java.awt.Color(255, 255, 255));
        labelV7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tijeras.png"))); // NOI18N
        labelV7.setText("Corte");

        javax.swing.GroupLayout btnCorteLayout = new javax.swing.GroupLayout(btnCorte);
        btnCorte.setLayout(btnCorteLayout);
        btnCorteLayout.setHorizontalGroup(
            btnCorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCorteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelV7)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        btnCorteLayout.setVerticalGroup(
            btnCorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCorteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReporte.setBackground(new java.awt.Color(57, 78, 194));
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReporteMousePressed(evt);
            }
        });

        labelV8.setForeground(new java.awt.Color(255, 255, 255));
        labelV8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/grafico-histograma.png"))); // NOI18N
        labelV8.setText("Reporte");

        javax.swing.GroupLayout btnReporteLayout = new javax.swing.GroupLayout(btnReporte);
        btnReporte.setLayout(btnReporteLayout);
        btnReporteLayout.setHorizontalGroup(
            btnReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelV8)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnReporteLayout.setVerticalGroup(
            btnReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalir.setBackground(new java.awt.Color(57, 78, 194));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        labelV9.setForeground(new java.awt.Color(255, 255, 255));
        labelV9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/desconectar.png"))); // NOI18N
        labelV9.setText("Cerrar ");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelV9)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelV9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProductos.setBackground(new java.awt.Color(57, 78, 194));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductosMousePressed(evt);
            }
        });

        labelV3.setForeground(new java.awt.Color(255, 255, 255));
        labelV3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/copiar-alt.png"))); // NOI18N
        labelV3.setText("Productos");

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelV3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(labelV3)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout PanelBtnsLayout = new javax.swing.GroupLayout(PanelBtns);
        PanelBtns.setLayout(PanelBtnsLayout);
        PanelBtnsLayout.setHorizontalGroup(
            PanelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBtnsLayout.createSequentialGroup()
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBtnsLayout.createSequentialGroup()
                    .addContainerGap(402, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(826, Short.MAX_VALUE)))
        );
        PanelBtnsLayout.setVerticalGroup(
            PanelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCorte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1360, -1));

        btnEliminarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar producto ");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        btnCorreos.setBackground(new java.awt.Color(255, 255, 255));
        btnCorreos.setForeground(new java.awt.Color(0, 0, 0));
        btnCorreos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/correo.png"))); // NOI18N
        btnCorreos.setText("Enviar un correo electronico");
        btnCorreos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorreos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCorreos, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, -1, -1));

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgP.png"))); // NOI18N
        getContentPane().add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btnRecuperarCarrito.setBackground(new java.awt.Color(57, 78, 194));
        btnRecuperarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecuperarCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRecuperarCarritoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRecuperarCarritoMousePressed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/espera.png"))); // NOI18N
        jLabel7.setText("Recuperar carrito");

        javax.swing.GroupLayout btnRecuperarCarritoLayout = new javax.swing.GroupLayout(btnRecuperarCarrito);
        btnRecuperarCarrito.setLayout(btnRecuperarCarritoLayout);
        btnRecuperarCarritoLayout.setHorizontalGroup(
            btnRecuperarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRecuperarCarritoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );
        btnRecuperarCarritoLayout.setVerticalGroup(
            btnRecuperarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRecuperarCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGuardarCarrito.setBackground(new java.awt.Color(57, 78, 194));
        btnGuardarCarrito.setForeground(new java.awt.Color(22, 35, 105));
        btnGuardarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarCarritoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarCarritoMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar-carro.png"))); // NOI18N
        jLabel2.setText("Agregar carrito");

        javax.swing.GroupLayout btnGuardarCarritoLayout = new javax.swing.GroupLayout(btnGuardarCarrito);
        btnGuardarCarrito.setLayout(btnGuardarCarritoLayout);
        btnGuardarCarritoLayout.setHorizontalGroup(
            btnGuardarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarCarritoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnGuardarCarritoLayout.setVerticalGroup(
            btnGuardarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        labelCantCarrito.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        labelCantCarrito.setForeground(new java.awt.Color(51, 51, 255));
        labelCantCarrito.setText("0");

        TableCarrito.setBackground(new java.awt.Color(255, 255, 255));
        TableCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCarritoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCarrito);

        textCodigo.setLabelText("Ingresa o busca un Codigo de Barras");
        textCodigo.setLineColor(new java.awt.Color(22, 35, 105));
        textCodigo.setSelectionColor(new java.awt.Color(22, 35, 105));
        textCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCodigoMouseClicked(evt);
            }
        });
        textCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCodigoKeyPressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/etiqueta.png"))); // NOI18N

        btnEnter.setBackground(new java.awt.Color(255, 255, 255));
        btnEnter.setForeground(new java.awt.Color(0, 0, 0));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnEnter.setText("ENTER-Agregar producto");
        btnEnter.setBorder(null);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Productos en el carrito:");

        labelNombreCliente.setText("Publico en General");

        jLabel8.setBackground(new java.awt.Color(57, 78, 194));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 78, 194));
        jLabel8.setText("Cliente de venta");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnter))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCantCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnGuardarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRecuperarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(labelNombreCliente))
                .addGap(120, 120, 120))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCantCarrito)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecuperarCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(128, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(128, Short.MAX_VALUE)))
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1494, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1034, Short.MAX_VALUE)
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -170, 1500, 1040));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void adaptarPantalla(){
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        //configurarmos el frame para que ocupe todo el ancho de la pantalla
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Ajustar el tamaño del JFrame para que quepa todos los componentes
        //this.pack();
    }
    
    //el metodo para actualizar el reloj
    public void run(){
        Thread ct=Thread.currentThread();
        while(h1==ct){
            //obtenemos la hora y la actualizamos
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
            labelFecha.setText(dtf.format(LocalDateTime.now())+"");
            
            //saber los atajos del teclado
            if(teclado.getPresionar()){
                textCodigo.addKeyListener(teclado);
                abrirAtajos(teclado.getAtajo());
            }
            else{
                teclado.alarmaTecla(); //esto es para que no se abran muchas ventanas a la vez
            }
            
            
            try{
                Thread.sleep(500); //el tiempo que va esperar para repetirse
            }catch(InterruptedException e){
                System.out.println("Error en el nudo");
                System.out.println(e);
                
            }
        }
    }   
    
    public void apagarWallpaper(){
        //wallpaper.setBackground(black);
        inventarioApagado=true;
        boolean interuptor=true;
        btnBuscar.setEnabled(interuptor);
        btnBorrarTABLA.setEnabled(interuptor);
        btnEnter.setEnabled(interuptor);
        btnDevolucion.setEnabled(interuptor);
        btnEntradas.setEnabled(interuptor);
        btnSalidas.setEnabled(interuptor);
        btnComprar.setEnabled(interuptor);
        btnEliminarProducto.setEnabled(interuptor);
        btnCorreos.setEnabled(interuptor);
        textCodigo.setEnabled(interuptor);
        
        jButton2.setEnabled(interuptor);
        jButton3.setEnabled(interuptor);
                
        btnVentas.setEnabled(interuptor);
        btnCreditos.setEnabled(interuptor);
        bntClientes.setEnabled(interuptor);
        btnGuardarCarrito.setEnabled(interuptor);
        btnRecuperarCarrito.setEnabled(interuptor);
        btnProductos.setEnabled(interuptor);
        btnInventario.setEnabled(interuptor);
        btnCompras.setEnabled(interuptor);
        btnConfiguracion.setEnabled(interuptor);
        btnCorte.setEnabled(interuptor);
        btnReporte.setEnabled(interuptor);
        btnSalir.setEnabled(interuptor);
        
        labelFecha.setEnabled(interuptor);
        this.TableCarrito.setEnabled(interuptor); 
        background.setVisible(false);
        //actualizar colores de los btn 
        //textCodigo.setBackground(new Color(255,255,255));
        //wallpaper.setVisible(false);
        //startAnimator(false);
    }
    
    
    private void startAnimator(boolean show) {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
        this.show = show;
        animator.start();
    }
    
    public void encenderWallpaper(){
        //wallpaper.setBackground(black);       
        inventarioApagado=false;
        boolean interuptor=false;
        btnBuscar.setEnabled(interuptor);
        btnBorrarTABLA.setEnabled(interuptor);
        btnEnter.setEnabled(interuptor);
        btnDevolucion.setEnabled(interuptor);
        btnEntradas.setEnabled(interuptor);
        btnSalidas.setEnabled(interuptor);
        btnComprar.setEnabled(interuptor);
        btnEliminarProducto.setEnabled(interuptor);
        btnCorreos.setEnabled(interuptor);
        textCodigo.setEnabled(interuptor);
        
        jButton2.setEnabled(interuptor);
        jButton3.setEnabled(interuptor);
        
        btnVentas.setEnabled(interuptor);
        btnCreditos.setEnabled(interuptor);
        bntClientes.setEnabled(interuptor);
        btnGuardarCarrito.setEnabled(interuptor);
        btnRecuperarCarrito.setEnabled(interuptor);
        btnProductos.setEnabled(interuptor);
        btnInventario.setEnabled(interuptor);
        btnCompras.setEnabled(interuptor);
        btnConfiguracion.setEnabled(interuptor);
        btnCorte.setEnabled(interuptor);
        btnReporte.setEnabled(interuptor);
        btnSalir.setEnabled(interuptor);
        
        labelFecha.setEnabled(interuptor);
        this.TableCarrito.setEnabled(interuptor);
        //textCodigo.setBackground(new Color(123,123,123));
        //wallpaper.setVisible(true);
        background.setVisible(true);
        background.setSize(3500, 2500);
        getContentPane().setComponentZOrder(background, 0); // Moverlo al índice 0 lo trae al frente
        background.setBackground(new Color(0, 0, 0,200)); //el fondo del mensaje
    }
    
    public void abrirAtajos(int atajo){
        if(inventarioApagado){
            switch(atajo){
                case 10:{ //ENTER
                    registrarPorductoCarrito();
                    teclado.PresionarFalse();
                    break;
                }
                case 27:{ //ESCAPE
                    cerrarSecion();
                    teclado.PresionarFalse();
                    break;
                }
                case 112:{ //F1
                    if(buscarCajero.permiso3()==1){
                        new FrameVentas(con,this).setVisible(true); //F1
                    } 
                    teclado.PresionarFalse();
                    break;
                }
                case 113:{ //F2
                    new FrameCreditos(con,this).setVisible(true); //F12
                    teclado.PresionarFalse();
                    break;
                }
                case 118:{ //F7
                    if(buscarCajero.permiso4()==1){
                        new FrameEntradas(con,this).setVisible(true); //F7
                    }
                    teclado.PresionarFalse();
                    break;
                }
                case 119:{ //F8
                    if(buscarCajero.permiso5()==1){
                        new FrameSalida(con,this).setVisible(true); //F8
                    }
                    teclado.PresionarFalse();
                    break;
                }
                case 123:{ //F 12
                    new FrameCobranza(con,this).setVisible(true); 
                    teclado.PresionarFalse();
                    break;
                }
                default:{
                }
            }
        }
    }
        
    private void actualizarClases(){
        this.add=new Agregar(con,this,this);
        this.delete=new Eliminar(con);
        this.search=new Buscar(con);
        this.searchCard=new BuscarCarrito(con);
    }
    
    private void actualizarPantalla(){
        this.setSize(1370,748); //727
        this.setResizable(false);
        this.setTitle("BestPoint");
        //actualizarLogo();
    }
    
    private void borrarImgProducto(){
        String rutaProyecto=System.getProperty("user.dir");
        Image img=new ImageIcon(rutaProyecto+"\\src\\Img\\imgP.png").getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);    
    }
    
    public void borrarTabla(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from carritocompras WHERE numcarrito="+numCarrito);
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String strID=rs.getString("id");
                int ID=conver.convertirStringInt(strID);
                delete.eliminarDatoCarrito(ID);
            }
            eliminarIndexCarrito();
            actualizarTablaCarrito();
            borrarImgProducto();
        }catch (SQLException ex) {
            System.out.println("borrarTabla");
            System.out.println(ex.getNextException());
        }
        
        labelTotal.setText("$0.00");
        labelCantCarrito.setText("0"); //eliminar la cant del carrito
        TotalC=0;
    }
    
    private void eliminarIndexCarrito(){
        int size=indexCarritos.size();
        if (size>1 && numCarrito!=indexCarritos.get(0)){
            for (int i=0;i<size;i++){
                if(indexCarritos.get(i)==numCarrito){
                    numCarrito=indexCarritos.get(i-1);
                    indexCarritos.remove(i);
                }
            }
        }
    }
    
    private void actualizarLogo(){
        labelLogo.setText("");
        labelLogo.setIcon(new ImageIcon("logo.png"));
    }
    
    private Image getIcono(){
        Image icono=Toolkit.getDefaultToolkit().getImage("icono.png");
        return icono;
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(inventarioApagado){
            new FrameBuscarProducto(this,con).setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        if(inventarioApagado){
            if(buscarCajero.permiso4()==1){
                new FrameEntradas(con,this).setVisible(true); //F7
            }
        }
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
        if(inventarioApagado){
            if(buscarCajero.permiso5()==1){
                new FrameSalida(con,this).setVisible(true); //F8
            }
        }
    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        if(inventarioApagado){
            if(buscarCajero.permiso6()==1){
                new FrameDevolucion(con,this).setVisible(true);
            } 
        }
    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
       registrarPorductoCarrito();
    }//GEN-LAST:event_btnEnterActionPerformed
    
    private void registrarPorductoCarrito(){
       if(!textCodigo.getText().equals("Ingresa o busca un Codigo de Barras") && !textCodigo.getText().equals("")){
           agregarProductoTablaCarrito();
           borrarTextoCodigo();
       }
       else{
           new FrameError(this,"Necesito un codigo para buscar el producto").setVisible(true);
           borrarTextoCodigo();
       }
    }
    
    private void agregarProductoTablaCarrito(){
       //ver si el producto ya esta registrado en el carrito
       String codigoBarras=textCodigo.getText();
       if(comporbarSiExisteElArticulo(codigoBarras)){
            search.buscar(codigoBarras);
            if (existeProductoInventario()){
                actualizarProductoCarro(codigoBarras);
            }
            actualizarTablaCarrito();
            buscarImgProducto();
       }
       else{
           registrarNuevoProductoCarrito(codigoBarras);
       }
    }
    
     private void buscarImgProducto(){
        //obtenemos la direcion de su imagen y cargamos la ruta 
        String rutaImg=search.rutaImg();
        File archivo = new File(rutaImg);

        //si no existe el archivo cargamos la imagen de muestra
        if (!archivo.exists()){
            String rutaProyecto=System.getProperty("user.dir");
            rutaImg=rutaProyecto+"\\src\\Img\\imgP.png";
        }

        actualizarImgProducto(rutaImg);                 
    }
     
    private void actualizarImgProducto(String rutaImg){
        Image img=new ImageIcon(rutaImg).getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);        
    }
    
    public void agregarProductoDesdeTerceros(String codigoBarras){
       if(comporbarSiExisteElArticulo(codigoBarras)){
            search.buscar(codigoBarras);
            if (existeProductoInventario()){
                actualizarProductoCarro(codigoBarras);
            }
       }
       else{
           registrarNuevoProductoCarrito(codigoBarras);
       }    
    }
    
    private void btnBorrarTABLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTABLAActionPerformed
        if(inventarioApagado){
            //preguntar si quiere eliminar el carrito
            MessageDialog ms=new MessageDialog(this);
            ms.showMessage("Eliminar productos del carrito","¿Quiere eliminar todos los datos del carrito?");
            if(ms.getMessageType()==MessageDialog.MessageType.OK){
                borrarTabla();
                new MessageCorrect(this,"El carrito fue baseado con exito",this);
            }
        }
    }//GEN-LAST:event_btnBorrarTABLAActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if(inventarioApagado){
            FrameCobranza frameCobranza=new FrameCobranza(con,this); 
            //obtenemos los datos del cliente para esta venta y se lo pasamos a la interfaz de cobro
            frameCobranza.cambiarCliente(idCliente,labelNombreCliente.getText());
            frameCobranza.setVisible(true);
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if(inventarioApagado){
            if(buscarCajero.permiso7()==1){
                new FrameEliminarProducto(this,con).setVisible(true);
            }  
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(inventarioApagado){
            new FrameVentasHoy(con,this).setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(inventarioApagado){
           new FramePagosTarjeta(con,this).setVisible(true);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        if(inventarioApagado){
            btnVentas.setBackground(colorBtnFondoHover);
            labelV.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        if(inventarioApagado){
            btnVentas.setBackground(colorBtnFondo);
            labelV.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMousePressed
        if(inventarioApagado){
            if(buscarCajero.permiso3()==1){
                new FrameVentas(con,this).setVisible(true); //F1
            }
        }
    }//GEN-LAST:event_btnVentasMousePressed

    private void btnCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreditosMouseEntered
        if(inventarioApagado){
            btnCreditos.setBackground(colorBtnFondoHover);
            labelV1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnCreditosMouseEntered

    private void btnCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreditosMouseExited
        if(inventarioApagado){
            btnCreditos.setBackground(colorBtnFondo);
            labelV1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnCreditosMouseExited

    private void btnCreditosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreditosMousePressed
        if(inventarioApagado){
            new FrameCreditos(con,this).setVisible(true); //F12
        }
    }//GEN-LAST:event_btnCreditosMousePressed

    private void bntClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntClientesMouseEntered
        if(inventarioApagado){
            bntClientes.setBackground(colorBtnFondoHover);
            labelV2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_bntClientesMouseEntered

    private void bntClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntClientesMouseExited
        if(inventarioApagado){
            bntClientes.setBackground(colorBtnFondo);
            labelV2.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_bntClientesMouseExited

    private void bntClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntClientesMousePressed
        if(inventarioApagado){
            if(buscarCajero.permiso8()==1){
                new FrameClientes(con,this).setVisible(true);
            } 
        }
    }//GEN-LAST:event_bntClientesMousePressed

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        if(inventarioApagado){
            btnProductos.setBackground(colorBtnFondoHover);
            labelV3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        if(inventarioApagado){
            btnProductos.setBackground(colorBtnFondo);
            labelV3.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMousePressed
        if(inventarioApagado){
            new FrameTablaProductos(con,this).setVisible(true);
            //new FrameProductos(con,this).setVisible(true);
        }
    }//GEN-LAST:event_btnProductosMousePressed

    private void btnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseEntered
        if(inventarioApagado){
            btnInventario.setBackground(colorBtnFondoHover);
            labelV4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnInventarioMouseEntered

    private void btnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseExited
        if(inventarioApagado){
            btnInventario.setBackground(colorBtnFondo);
            labelV4.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnInventarioMouseExited

    private void btnInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMousePressed
        if(inventarioApagado){
            new FrameInventarioTienda(con,this).setVisible(true);
        }
    }//GEN-LAST:event_btnInventarioMousePressed

    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        if(inventarioApagado){
            btnCompras.setBackground(colorBtnFondoHover);
            labelV5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        if(inventarioApagado){
            btnCompras.setBackground(colorBtnFondo);
            labelV5.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnComprasMouseExited

    private void btnComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMousePressed
        if(inventarioApagado){
            if(buscarCajero.permiso3()==1){
                new FrameCompras2(con,this).setVisible(true); //F1
            }
        }
    }//GEN-LAST:event_btnComprasMousePressed

    private void btnConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseEntered
        if(inventarioApagado){
            btnConfiguracion.setBackground(colorBtnFondoHover);
            labelV6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnConfiguracionMouseEntered

    private void btnConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseExited
        if(inventarioApagado){
            btnConfiguracion.setBackground(colorBtnFondo);
            labelV6.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnConfiguracionMouseExited

    private void btnConfiguracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMousePressed
        if(inventarioApagado){
            if(buscarCajero.permiso19()==1){
                new FrameOpciones(con,this).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnConfiguracionMousePressed

    private void btnCorteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseEntered
        if(inventarioApagado){
            btnCorte.setBackground(colorBtnFondoHover);
            labelV7.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnCorteMouseEntered

    private void btnCorteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseExited
        if(inventarioApagado){
            btnCorte.setBackground(colorBtnFondo);
            labelV7.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnCorteMouseExited

    private void btnCorteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMousePressed
        if(inventarioApagado){
            new FrameCorte(con,this).setVisible(true);
        }
    }//GEN-LAST:event_btnCorteMousePressed

    private void btnReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseEntered
        if(inventarioApagado){
            btnReporte.setBackground(colorBtnFondoHover);
            labelV8.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnReporteMouseEntered

    private void btnReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseExited
        if(inventarioApagado){
            btnReporte.setBackground(colorBtnFondo);
            labelV8.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnReporteMouseExited

    private void btnReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMousePressed
        if(inventarioApagado){
            new FrameEscojerFechaReporte(con,this).setVisible(true);
        }
    }//GEN-LAST:event_btnReporteMousePressed

    private void btnReporte1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporte1MouseEntered

    private void btnReporte1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporte1MouseExited

    private void btnReporte1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte1MousePressed

    }//GEN-LAST:event_btnReporte1MousePressed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        if(inventarioApagado){
            btnSalir.setBackground(colorBtnFondoHover);
            labelV9.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        if(inventarioApagado){
            btnSalir.setBackground(colorBtnFondo);
            labelV9.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        if(inventarioApagado){
            //int i=JOptionPane.showConfirmDialog(this, "¿Quieres cerrar tu secion?");
            MessageDialog ms=new MessageDialog(this);
            ms.showMessage("¿Quieres cerrar tu secion?","Todos los datos que no se hayan guardado se eliminaran");
            if(ms.getMessageType()==MessageDialog.MessageType.OK){
                borrarCajero();
                cerrarSecion();
            }
        }
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnCorreosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreosActionPerformed
        if(inventarioApagado){
            new FrameCorreo(con,this).setVisible(true);
        }
    }//GEN-LAST:event_btnCorreosActionPerformed

    private void btnRecuperarCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarCarritoMouseEntered
        if(inventarioApagado){
            btnRecuperarCarrito.setBackground(new Color(46,69,209));
            jLabel7.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnRecuperarCarritoMouseEntered

    private void btnGuardarCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCarritoMouseEntered
        if(inventarioApagado){
            btnGuardarCarrito.setBackground(new Color(46,69,209));
            jLabel2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnGuardarCarritoMouseEntered

    private void btnGuardarCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCarritoMouseExited
        if(inventarioApagado){
            btnGuardarCarrito.setBackground(colorBtnFondo);
            jLabel2.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnGuardarCarritoMouseExited

    private void btnGuardarCarritoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCarritoMousePressed
        if(inventarioApagado){
            numCarrito=calcularIndiceNuevoCarrito();
            txtNumCarrito.setText(numCarrito+"");
            actualizarTablaCarrito();
        }
    }//GEN-LAST:event_btnGuardarCarritoMousePressed
    
    private int calcularIndiceNuevoCarrito(){
        boolean bandera=true;
        int indice=0;     
        if (indexCarritos.size()>0){
            while(bandera){
                for(int i=0;i<indexCarritos.size();i++){
                    if(indice==indexCarritos.get(i)){
                        indice++;
                        bandera=true;
                        break;
                    }
                    else{
                        bandera=false;
                    }
                }
            }
        }
        indexCarritos.add(indice);
        return indice;
    }
    
    private void btnRecuperarCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarCarritoMouseExited
        if(inventarioApagado){
            btnRecuperarCarrito.setBackground(colorBtnFondo);
            jLabel7.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_btnRecuperarCarritoMouseExited

    private void btnRecuperarCarritoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarCarritoMousePressed
        if(inventarioApagado){
            numCarrito=calcularIndiceDeRecuperacion();
            txtNumCarrito.setText(numCarrito+"");
            actualizarTablaCarrito();
        }
    }//GEN-LAST:event_btnRecuperarCarritoMousePressed

    private void textCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodigoKeyPressed
       if(textCodigo.getText().equals("")){
            textCodigo.showing(true);
       }
    }//GEN-LAST:event_textCodigoKeyPressed

    private void textCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCodigoMouseClicked

    }//GEN-LAST:event_textCodigoMouseClicked

    private void TableCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCarritoMouseClicked
        modificarTable();
    }//GEN-LAST:event_TableCarritoMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new FrameAsignarCliente(con,this).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void modificarTable(){
        //obtenemos el valor de la columna y fila seleccionada
        int column=TableCarrito.getSelectedColumn();
        int row=TableCarrito.getSelectedRow();
        
        //obtenemos el dato seleccionado 
        String valor=String.valueOf(TableCarrito.getValueAt(row, column));
        
        //comprobamos si es descuento o cantidad 
        if(column==4){ //modificar cantidad
            abrirFrameAgregarProducto(column,row);
        }
        else if(column==5){ //cambiar precio de los 3 que tienes
            
        }    
        else if(column==6){ //modificar descuento
            new FrameAgregarDescuento(con,this,column,row).setVisible(true);
        }    
    }
    
    private void abrirFrameAgregarProducto(int column,int row){
        //obtenemos el codigo de barras del producto 
        String codigoBarras=String.valueOf(TableCarrito.getValueAt(row, 0));
        search.buscarProducto(codigoBarras);
        
        //vemos que frame vamos abrir
        if(SeVendeAGranel()){
            new FrameGranel(con,search.getRs(),this).setVisible(true);
        }
        else{
            new FrameAnadirCantidad(con,this,column,row).setVisible(true);   
        }
    }
    
    private boolean SeVendeAGranel(){
        try{
            return (search.SeVendePor().equals("A granal"));
        }
        catch(SQLException ex){
        }
        return false;
    }
    
    private int calcularIndiceDeRecuperacion(){
        int indice=numCarrito;
        for(int i=0;i<indexCarritos.size()-1;i++){
            if(indice==indexCarritos.get(i)){
                return indexCarritos.get(i+1);
            }
        }
        
        return indexCarritos.get(0);
    }
    
    public void cerrarSecion(){
        this.setVisible(false);
        new FrameInisiarSecion(con).setVisible(true);
    }
    
    public void registrarCompraTarjtea(String referencia){
        float dineroRecibido=TotalC;
        add.agregarPagoTarjeta(referencia, dineroRecibido);
    }
    
    public void registrarCompras(String tipoPago){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from carritocompras");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                //obtenemos el id del producto
                int idProducto=rs.getInt("idproducto");
                search.buscarProductoId(idProducto);
                
                //obtener sus datos
                String codigoBarras=search.CodigoBarra();
                int cantidadEnCarrito=rs.getInt("cantidad");
                int nuevaCantidad=obtenerProductosRestantes(cantidadEnCarrito,codigoBarras); 
                actualizarInventario(codigoBarras,nuevaCantidad);
                
                
                String producto=search.Nombre();
                float precio=rs.getFloat("total");
                add.agregarVentas(cajeroActual, producto, cantidadEnCarrito,precio, labelFecha.getText(),tipoPago,idProducto);
            }
            
            //añadir el dinero a la caja 
        }catch(SQLException ex){
            
        }        
    }
   
    public void actualizarDineroCaja(float nuevoDineroCaja){
        try{
            Statement sts=con.createStatement();
            String actualizar="update caja set dinerocaja = '"+nuevoDineroCaja+"' where id = "+0;
            sts.executeUpdate(actualizar);    
        }catch(SQLException ex){
            System.out.println("No se pudo actualizar inventario");
        }
    }    
    
    private int generarIdVenta(){
        int id=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                id=rs.getInt("id");
            }
            
            //aumentarle un valor a ese ultimo dato y retornar
            id++;
            return id;
        }catch(SQLException ex){
            return id;
        }
    }
    
    public void asignarClienteALaVenta(int idCliente,String nombreCliente){
        this.idCliente=idCliente;
        labelNombreCliente.setText(nombreCliente);
    }
    
    public void borrarClienteALaVenta(){
        this.idCliente=-1;
        labelNombreCliente.setText("Publico en General");
    }
    
    private int obtenerProductosRestantes(int cantidadEnCarrito,String codigoBarras){
        try{
            search.buscar(codigoBarras);
            int cantidad=search.Cantidad();
            int cantidadCarrito=calcularProductoEnCarrito(); 
            int nuevaCantidad=cantidad-cantidadCarrito;
            return nuevaCantidad;
        }
        catch(SQLException ex){
            return 0;
        }  
    }
    
    private void actualizarInventario(String codigoBarras,int nuevaCantidad){
        try{
            Statement sts=con.createStatement();
            String actualizar="update productos set cantidad = '"+nuevaCantidad+"' where codigobarras ='"+codigoBarras+"'";
            sts.executeUpdate(actualizar);    
        }catch(SQLException ex){
            System.out.println(ex);
            System.out.println("actualizarInventario");
        }
    }
    
    public void borrarTextoCodigo(){
        //textCodigo.setText("Ingresa o busca un Codigo de Barras");
        textCodigo.setText("");
        //textCodigo.setForeground(Color.gray);
    }
    
    private void agregarTextoCodigo(){
        if(textCodigo.getText().equals("Ingresa o busca un Codigo de Barras")){
            //borrar los datos 
            textCodigo.setText("");
            textCodigo.setForeground(Color.black);
        }
    }
    
    private void registrarNuevoProductoCarrito(String codigoBarras){
       if(search.buscarProducto(codigoBarras))//encontrar el producto 
       {
           //ver si hay suficiente
           if (existeProductoInventario()){
               //search.buscar(codigoBarras);
               //saber como se vende este producto
               //search.buscar(codigoBarras);
               String seVendePor="";
               try {
                   seVendePor = search.SeVendePor();
               } catch (SQLException ex) {
               }
               
               //saber si es a granel o no
               if (seVendePor.equals("A granal")){
                   new FrameGranel(con,search.getRs(),this).setVisible(true);
               }
               else{
                    agregarCarrito(codigoBarras);
               }
           }
 
            actualizarTablaCarrito();
            buscarImgProducto();
       }
       else{
           new FrameError(this,"El codigo regristrado no existe").setVisible(true);
       }
    }
    
    private boolean existeProductoInventario(){
        try{
            int cantidad=search.Cantidad();
            int cantidadCarrito=calcularProductoEnCarrito(); 
            if(cantidad-cantidadCarrito>0){
                return true;
            }
            else{
                new FrameError(this,"Ya no hay producto en el inventario").setVisible(true);
                return false;
            }
        }catch(SQLException ex){
            return false;
        }
    }
    
    private int calcularProductoEnCarrito(){
        int exixtencia=0;
        try{
            int idProducto=search.Id();
            
            Statement sts=con.createStatement();
            sts.execute("Select * from carritocompras");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                //obtenemos el id del producto
                int id=rs.getInt("idproducto");
                if(idProducto==id){
                    exixtencia=rs.getInt("cantidad");
                    return exixtencia;
                }
            }
            
            //aumentarle un valor a ese ultimo dato y retornar
            return exixtencia;
        }catch(SQLException ex){
            return exixtencia;
        }
    } 
    
    private void agregarCarrito(String codigoBarras){
        try{
            search.buscarProducto(codigoBarras);
            //obtener todos los datos del producto 
            int idProducto=search.Id();
            //String IVA=obtenerIva();
            int cantidad=1;
            float total=search.Precio();
            
            //agregar al carrito
            add.carritoCompras( idProducto, cantidad, total,numCarrito);
        } catch (SQLException ex) {
            System.out.println("agregarCarrito");
            Logger.getLogger(FrameInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean comporbarSiExisteElArticulo(String codigoBarra){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from carritocompras where numcarrito="+numCarrito);
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                //obtenemos el id del producto
                int idProducto=rsBusqueda.getInt("idproducto");
                search.buscarProductoId(idProducto);
                
                if(search.CodigoBarra().equals(codigoBarra)){
                    return true;
                }
            }
        }
        catch(SQLException e){
            System.out.println("comporbarSiExisteElArticulo");
            System.out.println("Error "+e);
        }  
        
        return false;
    }
    
    private String obtenerIva(){
        return "IVA";
    }
    
    
    public void actualizarProductoCarro(String codigoBarras){
        //buscar el producto
        searchCard.buscarProducto(codigoBarras,numCarrito);
        
        //actualizarla 
        try{
            //saber como se vende este producto
            String seVendePor="";
            seVendePor = search.SeVendePor();

            //saber si es a granel o no
            if (seVendePor.equals("A granal")){
                new FrameGranel(con,search.getRs(),this).setVisible(true);
            }
            else{
                 int id=searchCard.Id();
                 float precio=searchCard.search.Precio();
                 int cantidad=searchCard.Cantidad();
                 cantidad++;
                 float total=precio*cantidad;
                 BigDecimal totalRounded = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
                 Statement sts=con.createStatement();
                 String actualizar="update carritocompras set cantidad = '"+cantidad+"', total = '"+totalRounded+"' WHERE id = "+id;
                 sts.executeUpdate(actualizar);
            }
        }
        catch(SQLException e){
            System.out.println("actualizarProductoCarro");
            System.out.println("Error "+e);
        }          
        //add.carritoCompras( id, nombre, descripcion, codigoBarras, IVA, precio, cantidad, total);
    }
    
    public void eliminarProductoCarro(String codigoBarras,int cantidadEliminar){
        //buscar el producto
        searchCard.buscarProducto(codigoBarras,numCarrito);
        
        //actualizarla 
        try{
            int id=searchCard.Id();
            float precio=searchCard.Precio();
            int cantidad=searchCard.Cantidad()-cantidadEliminar;
            String producto=searchCard.Nombre();
            
            if(cantidad>0){
                actualizarEliminacion(id,cantidad,precio);
                new FrameCorrecto(this,"Se elimaron "+cantidadEliminar+" pedidos del producto '"+producto+"' correctamente").setVisible(true);
            }
            else if(cantidad==0){
                borrarProductoTabla(id);
                new FrameCorrecto(this,"Se elimino el producto '"+producto+"' correctamente").setVisible(true);
            }
            else{
                new FrameError(this,"No hay suficientes productos en el carrito para eliminar").setVisible(true);
            }
            
            //actualizar pantalla 
            TotalC=calcularTotal();
            labelTotal.setText("$"+TotalC+"");
        }
        catch(SQLException e){
            System.out.println("eliminarProductoCarro");
            System.out.println("Error "+e);
        }          
        //add.carritoCompras( id, nombre, descripcion, codigoBarras, IVA, precio, cantidad, total);
    }    
    
    public void borrarProductoTabla(int ID){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from carritocompras where numcarrito="+numCarrito);
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String strID=rs.getString("id");
                if(ID==conver.convertirStringInt(strID)){
                    delete.eliminarDatoCarrito(ID);
                }
            }
            actualizarTablaCarrito();
        }catch (SQLException ex) {
            System.out.println("borrarProductoTabla");
            System.out.println(ex.getNextException());
        }
    }
    
    private void actualizarEliminacion(int id,int cantidad,float precio){
        try{
            //cantidad--;
            float total=precio*cantidad;
            BigDecimal totalRounded = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            Statement sts=con.createStatement();
            //"UPDATE `carritocompras` SET `cantidad` = '2', `total` = '2' WHERE `carritocompras`.`id` = 0";
            String actualizar="update carritocompras set cantidad = '"+cantidad+"', total = '"+totalRounded+"' where id = "+id;
            sts.executeUpdate(actualizar);
        }catch(SQLException e){
            System.out.println("actualizarEliminacion ");
            System.out.println("Error "+e);
        }
    }
    
    private float calcularTotal(){
        float total=0;
        int numerosCarrito=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from carritocompras where numcarrito="+numCarrito);
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                total=total+conver.convertirStringFloat(rs.getString("total"));
                numerosCarrito=numerosCarrito+conver.convertirStringInt(rs.getString("cantidad"));
            }
            //actualizar el numero de los productos 
            labelCantCarrito.setText(numerosCarrito+"");
            
            //aumentarle un valor a ese ultimo dato y retornar
            //BigDecimal totalRounded = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            return total;
        }catch(SQLException ex){
            return total;
        }
    }    
    
    public void borrarCajero(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String strID=rs.getString("id");
                int id=conver.convertirStringInt(strID);
                delete.eliminarCaja(id);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }    
    
    //actualizar tablas
    public void actualizarTablaCarrito(){
        obj=new ActualizarTablaCarrito(con,numCarrito);      
        this.TableCarrito.setModel(obj.getModelo());
        this.TableCarrito.fixTable(jScrollPane2);
        //this.TableCarrito.setEnabled(false);
        
        this.TableCarrito.setShowVerticalLines(false);
        //this.TableCarrito.setShowHorizontalLines(false);
        this.TableCarrito.setBackground(colorBtnFondoHover);
        this.TableCarrito.setForeground(black);
        
        this.TableCarrito.getTableHeader().setBackground(colorBtnFondoHover);
        this.TableCarrito.getTableHeader().setResizingAllowed(false);
        this.TableCarrito.getTableHeader().setEnabled(false);
        this.TableCarrito.getTableHeader().setForeground(black);
        
        //hacer chico la columna de la reseta
        this.TableCarrito.getColumnModel().getColumn(3).setMaxWidth(18);
        this.TableCarrito.getColumnModel().getColumn(3).setMinWidth(16);
        this.TableCarrito.getColumnModel().getColumn(3).setPreferredWidth(18); //18
         this.TableCarrito.getColumnModel().getColumn(3).setCellRenderer(new RenderPintarTablaNormal());
         
         //hacer chico la columna de descuentos 
        this.TableCarrito.getColumnModel().getColumn(6).setMaxWidth(80);
        this.TableCarrito.getColumnModel().getColumn(6).setMinWidth(16);
        this.TableCarrito.getColumnModel().getColumn(6).setPreferredWidth(50); //18
         
        //poner los colores de la tabla
        this.TableCarrito.getColumnModel().getColumn(0).setCellRenderer(new RenderPintarCodigo());
        this.TableCarrito.getColumnModel().getColumn(4).setCellRenderer(new RenderPintarTabla());
        
        
       //actualizar datos de pantalla
       TotalC=calcularTotal();
       //veremos si existe un total y sino existe lo haremos 0. Esto es para que no tenga bugs
        if (Double.isNaN(TotalC)) {
           TotalC = 0;
       }
       
       BigDecimal totalRounded = new BigDecimal(TotalC).setScale(2, RoundingMode.HALF_UP);
       labelTotal.setText("$"+totalRounded+""); 
       txtNumCarrito.setText(numCarrito+"");       
    }

    public Table getTableCarrito() {
        return TableCarrito;
    }
    
    public String getTotalCarrito(){
        return labelTotal.getText();
    }
    
    public float getTotalCarritoNum(){
        return TotalC;
    }
    
    public int getNumCarrito(){
        return numCarrito;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBtns;
    private javaswingdev.swing.table.Table TableCarrito;
    private javaswingdev.message.Background background;
    private javax.swing.JPanel bntClientes;
    private javax.swing.JButton btnBorrarTABLA;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JPanel btnCompras;
    private javax.swing.JPanel btnConfiguracion;
    private javax.swing.JButton btnCorreos;
    private javax.swing.JPanel btnCorte;
    private javax.swing.JPanel btnCreditos;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JPanel btnGuardarCarrito;
    private javax.swing.JPanel btnInventario;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnRecuperarCarrito;
    private javax.swing.JPanel btnReporte;
    private javax.swing.JPanel btnReporte1;
    private javax.swing.JButton btnSalidas;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnVentas;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCantCarrito;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNombreCliente;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelV;
    private javax.swing.JLabel labelV1;
    private javax.swing.JLabel labelV2;
    private javax.swing.JLabel labelV3;
    private javax.swing.JLabel labelV4;
    private javax.swing.JLabel labelV5;
    private javax.swing.JLabel labelV6;
    private javax.swing.JLabel labelV7;
    private javax.swing.JLabel labelV8;
    private javax.swing.JLabel labelV9;
    private javax.swing.JPanel panelPrincipal;
    private textfield.TextField textCodigo;
    private javax.swing.JLabel txtNumCarrito;
    // End of variables declaration//GEN-END:variables

}
