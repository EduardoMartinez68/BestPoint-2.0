package OpcionesInventario;
import ClasesGlobales.Buscar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import puntoventa.FrameInventario;

public class FrameBuscarProducto extends javax.swing.JFrame {
    Buscar search;
    convertir conver=new convertir();
    Connection con;
    FrameInventario FI;
    int mouseX;
    int mouseY;
    String rutaImg="";
    
    public FrameBuscarProducto(FrameInventario FI,Connection con) {
        this.con=con;
        this.search=new Buscar(con);
        this.FI=FI;
        initComponents();
        setIconImage(getIcono());
        borrarTextoCodigo();
        
        this.setResizable(false);
        this.setTitle("Buscar productos");
        centrarPanel();
    }
    
    private void centrarPanel(){
        int w=FI.getWidth()/2;
        int h=FI.getHeight()/2;
        int x=FI.getX();
        int y=FI.getY();
        
        int myW=this.getWidth()/2;
        int myH=this.getHeight()/2;
        this.setLocation(x+w-myW,y+h-myH);
        FI.encenderWallpaper();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigoIngresado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigoBarras = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtGanancia = new javax.swing.JTextField();
        txtSeVendePor = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtUsaInventario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAgregarCarrito = new javax.swing.JButton();
        labelImg = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoIngresado.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoIngresado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoIngresado.setText("Ingresa o busca un Codigo de Barras");
        txtCodigoIngresado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCodigoIngresado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoIngresadoMousePressed(evt);
            }
        });
        txtCodigoIngresado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoIngresadoKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodigoIngresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 290, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 730, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel5.setText("Descripcion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel6.setText("Codigo de barras");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 35, 105));
        jLabel7.setText("$");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel8.setText("Ganancia");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel9.setText("Se vende por");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setText("Ubicacion");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel11.setText("Cantidad");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel12.setText("Usa inventario");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setText("id");
        txtId.setBorder(null);
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(57, 78, 194));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 180, -1));

        txtCodigoBarras.setEditable(false);
        jPanel2.add(txtCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, -1));

        txtCosto.setEditable(false);
        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtCosto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(22, 35, 105));
        txtCosto.setText("0.0");
        txtCosto.setBorder(null);
        jPanel2.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, -1));

        txtGanancia.setEditable(false);
        jPanel2.add(txtGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 180, -1));

        txtSeVendePor.setEditable(false);
        jPanel2.add(txtSeVendePor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        txtUbicacion.setEditable(false);
        jPanel2.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, -1));

        txtCantidad.setEditable(false);
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 180, -1));

        txtUsaInventario.setEditable(false);
        jPanel2.add(txtUsaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 180, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(238, 238, 238));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        btnAgregarCarrito.setBackground(new java.awt.Color(22, 35, 105));
        btnAgregarCarrito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarCarrito.setText("Agregar a carrito");
        btnAgregarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgP.png"))); // NOI18N
        jPanel2.add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 700, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 730, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 35, 105));
        jLabel3.setText("Codigo del producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(22, 35, 105));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Busqueda de productos");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        jButton1.setBackground(new java.awt.Color(22, 35, 105));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private Image getIcono(){
        Image icono=Toolkit.getDefaultToolkit().getImage("icono.png");
        return icono;
    }
    
    private void txtCodigoIngresadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoIngresadoMousePressed
        agregarTextoCodigo();
    }//GEN-LAST:event_txtCodigoIngresadoMousePressed
    
    private void buscarCodigo(){
        String codigoBarra=txtCodigoIngresado.getText();
        if (search.buscarProducto(codigoBarra)){
            buscarImgProducto();
            llenarDatoPantalla();
        }
        else{
            borrarPantalla();
        }
    }
    
    private void llenarDatoPantalla(){
        try{
            txtId.setText(search.Id()+"");
            txtCantidad.setText(search.Cantidad()+"");
            txtCodigoBarras.setText(search.CodigoBarra()+"");
            txtCosto.setText(search.Precio()+"");
            txtDescripcion.setText(search.Descripcion()+"");
            txtGanancia.setText(search.Ganancias()+""); //
            txtNombre.setText(search.Nombre()+"");
            txtSeVendePor.setText(search.SeVendePor()+"");
            txtUbicacion.setText(search.Ubicacion()+"");
            txtUsaInventario.setText(search.UsaInventario()+"");
        }
        catch(SQLException ex){
        }
    }
    
    private void borrarPantalla(){
        txtId.setText("");
        txtCantidad.setText("");
        txtCodigoBarras.setText("");
        txtCosto.setText("0.0");
        txtDescripcion.setText("");
        txtGanancia.setText(""); //
        txtNombre.setText("");
        txtSeVendePor.setText("");
        txtUbicacion.setText("");
        txtUsaInventario.setText("");    
        
        //reiniciar imagen del producto si no buscaste nada
        String rutaProyecto=System.getProperty("user.dir");
        rutaImg=rutaProyecto+"\\src\\Img\\imgP.png";
        actualizarImgProducto();
    }
    
    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        String codigoBarra=txtCodigoIngresado.getText();
        if (search.buscarProducto(codigoBarra)){
            agregarProductoCarrito(codigoBarra);
            borrarPantalla();
            borrarTextoCodigo();
            this.dispose();
            new FrameCorrecto(FI,"Producto agregado con exito").setVisible(true);
        }
        else{
            new FrameError(null,"Necesito un codigo valido").setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarCarritoActionPerformed
    
    private void txtCodigoIngresadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoIngresadoKeyReleased
        
    }//GEN-LAST:event_txtCodigoIngresadoKeyReleased

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        FI.apagarWallpaper();
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

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged

    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarCodigo();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void agregarProductoCarrito(String codigoBarra){
        FI.agregarProductoDesdeTerceros(codigoBarra);
        FI.borrarTextoCodigo();
        FI.actualizarTablaCarrito();    
    }
    
    private void borrarTextoCodigo(){
        txtCodigoIngresado.setText("Ingresa o busca un Codigo de Barras");
        txtCodigoIngresado.setForeground(Color.gray);
    }
    
    private void agregarTextoCodigo(){
        if(txtCodigoIngresado.getText().equals("Ingresa o busca un Codigo de Barras")){
            //borrar los datos 
            txtCodigoIngresado.setText("");
            txtCodigoIngresado.setForeground(Color.black);
        }
    }
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelImg;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtCodigoIngresado;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtGanancia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSeVendePor;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtUsaInventario;
    // End of variables declaration//GEN-END:variables
}
