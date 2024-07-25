package puntoventa;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.ConvertirUnidad;
import ClasesGlobales.convertir;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaswingdev.swing.Glass;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;


public class FrameGranel extends javax.swing.JFrame{
    convertir conver=new convertir();
    int x,y,mouseX,mouseY;
    float valueProduct, totalGrams;
    ResultSet rs;
    String unidadP;
    ConvertirUnidad converU=new ConvertirUnidad();
    
    Agregar add;
    Connection con;
    FrameInventario JF;
    Buscar search;
    
    private final JFrame fram;
    private Animator animator;
    private Glass glass;
    private boolean show;
    
    public FrameGranel(Connection con, ResultSet rs,FrameInventario JF) {
        this.rs=rs;
        this.con=con;
        this.JF=JF; 
        this.search=new Buscar(con);
        initComponents();
        setIconImage(getIcono());
        add=new Agregar(con,this,JF);
        getNameProduct();
        valueProduct=getValueProduct();
        totalGrams=getValueGrams();
        txtPrecio.setText(valueProduct+"");
        unidadP=getUnidad();
        totalGrams=convertirUnidad(unidadP,totalGrams);
        unidadtxt.setText(getValueGrams()+" "+unidadP);
        llenarComboBoxUnidad();
        centrarPanel();
        
        this.fram=JF;
        init();
    }
    
    
    
    private void init() { 
        JF.encenderWallpaper();
        setBackground(new Color(0, 0, 0, 0)); //el fondo del mensaje
        SimpleAttributeSet center = new SimpleAttributeSet(); //centrar el frame 
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        
        //esto es para saber si cierro la ventana o no 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrarVentana();
            }
        });
        
        //hacer la animacion de encender o apagar la ventana
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;
                glass.setAlpha(f - f * 0.3f);
                setOpacity(f);
            }

            @Override
            public void end() {
                if (show == false) {
                    dispose();
                    glass.setVisible(false);
                }
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        glass = new Glass();
        activar(); //activar el fondo negro
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

    public void activar() {
        fram.setGlassPane(glass);
        glass.setVisible(true);
        setLocationRelativeTo(fram);
        startAnimator(true);
        setVisible(true);
    }

    public void cerrarVentana() {
        startAnimator(false);
        this.dispose();
        JF.apagarWallpaper();
    }
    
    ////////////////////////////////////////////////////////////////////////////
    private Image getIcono(){
        Image icono=Toolkit.getDefaultToolkit().getImage("icono.png");
        return icono;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        ComboBoxUnidad = new combobox.Combobox();
        txtProductQuantity = new spinner.Spinner();
        txtCurrentAmount = new spinner.Spinner();
        background1 = new javaswingdev.message.Background();
        txtName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        unidadtxt = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 78, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bascula");

        panelBtnExit.setBackground(new java.awt.Color(57, 78, 194));
        panelBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBtnExitMousePressed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/balanza.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnCancel.setBackground(new java.awt.Color(245, 71, 71));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 180, 57));

        btnBuy.setBackground(new java.awt.Color(57, 78, 194));
        btnBuy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setText("Aceptar");
        btnBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 180, 57));

        ComboBoxUnidad.setLabeText("Unidad");
        ComboBoxUnidad.setLineColor(new java.awt.Color(22, 35, 105));
        ComboBoxUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxUnidadActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 110, -1));

        txtProductQuantity.setLabelText("Cantidad del Producto.");
        txtProductQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtProductQuantityStateChanged(evt);
            }
        });
        jPanel1.add(txtProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, -1));

        txtCurrentAmount.setLabelText("Importe actual");
        txtCurrentAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtCurrentAmountStateChanged(evt);
            }
        });
        jPanel1.add(txtCurrentAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 190, -1));

        background1.setBackground(new java.awt.Color(255, 255, 255));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(57, 78, 194));
        txtName.setText("Producto");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Peso");

        unidadtxt.setForeground(new java.awt.Color(0, 0, 0));
        unidadtxt.setText("100 g");

        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setText("10");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio");

        jLabel1.setText("Agrega o elimina esta cantidad del carrito");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(unidadtxt))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(txtPrecio)))
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(txtName)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(unidadtxt))
                        .addGap(14, 14, 14)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio)))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName)))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jPanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void llenarComboBoxUnidad(){
        ComboBoxUnidad.removeAllItems();
        //peso
        ComboBoxUnidad.addItem("g"); //gramnos
        ComboBoxUnidad.addItem("kg"); //kilogramos
        ComboBoxUnidad.addItem("lb"); //libra
        ComboBoxUnidad.addItem("mg"); //miligramos
        
        //distancia
        ComboBoxUnidad.addItem("m"); //metros
        ComboBoxUnidad.addItem("cm"); //centimetros
        ComboBoxUnidad.addItem("mm"); //milimetros
        
        //agua
        ComboBoxUnidad.addItem("L"); //litos
        ComboBoxUnidad.addItem("mL"); //mililitros
    }
    
    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        cerrarVentana();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        panelBtnExit.setBackground(Color.RED);
        labelExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        panelBtnExit.setBackground(new Color(22,35,105));
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed
    
    public static float redondear(float valor, int cifrasDecimales) {
        BigDecimal bd = new BigDecimal(Float.toString(valor));
        bd = bd.setScale(cifrasDecimales, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

    private void cambiarPrecioConPeso(){
        float gramos = conver.convertirStringFloat(txtProductQuantity.getValue().toString());
        String unidad = ComboBoxUnidad.getSelectedItem().toString();
        float respuesta = convertirUnidad(unidad, gramos);
        float r = respuesta * valueProduct / totalGrams;
        r = redondear(r, 2); // Redondear a 2 cifras decimales
        txtCurrentAmount.setValue(r);
    }
        
    private void cambiarPesoConPrecio(){
        // Dentro de tu código
        float gramos = calculateProductQuantity();
        String unidad = ComboBoxUnidad.getSelectedItem().toString();
        float respuesta = convertirUnidad2(unidad, gramos);
        respuesta = redondear(respuesta, 2); // Redondear a 2 cifras decimales
        txtProductQuantity.setValue(respuesta);      
    }
    
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        try {
            agregarProductoTablaCarrito();
        } catch (SQLException ex) {
            new FrameError(null,"Sucedio un error al conectarme con los datos").setVisible(true);
        }
    }//GEN-LAST:event_btnBuyActionPerformed
    
    private void agregarProductoTablaCarrito() throws SQLException{
       //ver si el producto ya esta registrado
       String codigoBarras=rs.getString("codigobarras");
       if(comporbarSiExisteElArticulo(codigoBarras)){
            search.buscar(codigoBarras);
            if (existeProductoInventario(codigoBarras)){
                actualizarProductoCarro(codigoBarras);
                JF.actualizarTablaCarrito();
                cerrarVentana();
            }
       }
       else{
           agregarCarrito();
           JF.actualizarTablaCarrito();
           cerrarVentana();
       }
    }
    
    private void actualizarProductoCarro(String codigoBarras){
        //buscar el producto
        JF.searchCard.buscarProducto(codigoBarras,JF.getNumCarrito());
        
        //actualizarla 
        try{
            //obtener datos en pantalla
            float peso=conver.convertirStringFloat(txtProductQuantity.getValue().toString());
            float cantidadGramos=convertirUnidad(ComboBoxUnidad.getSelectedItem().toString(),peso);
            float cantidadProducto=convertirUnidad2(unidadP,cantidadGramos);
            
            //actualizar inventario 
            int id=JF.searchCard.Id(); //JF.getNumCarrito();
            float precio=JF.searchCard.search.Precio();           
            float cantidad=JF.searchCard.Cantidad()+cantidadProducto;
            float total=JF.searchCard.Total()+conver.convertirStringFloat(txtCurrentAmount.getValue().toString());
            Statement sts=con.createStatement();
            String actualizar="update carritocompras set cantidad = '"+cantidad+"', total = '"+total+"' WHERE id = "+id;
            sts.executeUpdate(actualizar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }          
    }
    
    private boolean existeProductoInventario(String codigoBarras){
        try{
            int cantidad=search.Cantidad();
            int cantidadCarrito=calcularProductoEnCarrito(codigoBarras); 
            if(cantidad-cantidadCarrito>0){
                return true;
            }
            else{
                new FrameError(null,"Este producto ya se termino").setVisible(true);
                return false;
            }
        }catch(SQLException ex){
            return false;
        }
    }
    
    private int calcularProductoEnCarrito(String codigoBarras){
        int exixtencia=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from carritocompras");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                //obtenemos el id del producto
                int idProducto=rs.getInt("idproducto");
                search.buscarProductoId(idProducto);
                
                if(search.CodigoBarra().equals(codigoBarras)){
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
    
    private boolean comporbarSiExisteElArticulo(String codigoBarra){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from carritocompras where numcarrito="+JF.getNumCarrito());
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
            System.out.println("Error "+e);
        }  
        
        return false;
    }
    
    private void agregarCarrito(){
        //obtener todos los datos del producto
        int idProducto=getId();
        float peso=conver.convertirStringFloat(txtProductQuantity.getValue().toString());
        float cantidadGramos=convertirUnidad(ComboBoxUnidad.getSelectedItem().toString(),peso);
        
        float cantidadProducto=convertirUnidad2(unidadP,cantidadGramos);
        float total=conver.convertirStringFloat(txtCurrentAmount.getValue().toString());
        //agregar al carrito
        add.carritoCompras( idProducto, cantidadProducto, total,JF.getNumCarrito());
    }
    
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void panelBtnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMousePressed
        cerrarVentana();
    }//GEN-LAST:event_panelBtnExitMousePressed

    private void ComboBoxUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxUnidadActionPerformed
        cambiarPrecioConPeso();
    }//GEN-LAST:event_ComboBoxUnidadActionPerformed

    private void txtProductQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtProductQuantityStateChanged
        cambiarPrecioConPeso();
    }//GEN-LAST:event_txtProductQuantityStateChanged

    private void txtCurrentAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtCurrentAmountStateChanged
        cambiarPesoConPrecio();
    }//GEN-LAST:event_txtCurrentAmountStateChanged
    
    private void calcularTransformacionUnidad(){
        //obtenemos los datos en pantalla
        float cantProducto=conver.convertirStringFloat(txtProductQuantity.getValue().toString());
        String unidad=ComboBoxUnidad.getSelectedItem().toString();
        
        //convertimos los datos a gramos
        float converU=convertirUnidad(unidad,cantProducto);
        
        //hacemos una regla de 3 para saber el precio 
        float resultado=(converU*valueProduct)/totalGrams;
        txtCurrentAmount.setValue(resultado);
    }
    
    private float convertirUnidad(String unidad,float cantProducto){
        switch(unidad){
            case "g":
                return cantProducto;
            case "kg":
                return converU.g_Kg(cantProducto);
            case "lb":
                return converU.g_libra(cantProducto);  
            case "mg":
                return converU.g_Mg(cantProducto);
        }
        
        return 0;
    }
    
    private float convertirUnidad2(String unidad,float cantProducto){
        switch(unidad){
            case "g":
                return cantProducto;
            case "kg":
                return converU.Kg_g(cantProducto);
            case "lb":
                return converU.lb_g(cantProducto);  
            case "mg":
                return converU.Mg_g(cantProducto);
        }
        
        return 0;
    }
    
    private int getId(){
        try{
            return rs.getInt("id");
        }
        catch(SQLException e){
            return 0;
        }       
    }
    
    private void getNameProduct(){
        String name;
        try{
            name= rs.getString("nombre");
        }
        catch(SQLException e){
            name="";
        }
        
        txtName.setText(name);
    }
    
    
    private float getValueProduct(){
        try{
            return rs.getFloat("precio");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }     
    }
    
    private float getValueGrams(){
        try{
            return rs.getFloat("precioporpeso");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        } 
    }
    
    private String getUnidad(){
        try{
            return rs.getString("unidad");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }        
    }
    
    private float calculateCurrentAmount(){
        //obtenemos el peso que esta en pantalla 
        float currentAmount=conver.convertirStringFloat(txtProductQuantity.getValue().toString());
        //(currentAmount*totalGrams)/valueProduct;
        return calculateRuleOfThree(currentAmount,totalGrams,valueProduct);       
    }
            
    private float calculateProductQuantity(){
        //obtienes el precio que esta en pantalla 
        float precio=conver.convertirStringFloat(txtCurrentAmount.getValue().toString());
        
        //(currentAmount*valueProduct)/totalGrams;
        return calculateRuleOfThree(precio,valueProduct,totalGrams);
    }
    
    private float calculateRuleOfThree(float dat1,float dat2,float dat3){
        //we will make a rule of 3
        if(totalGrams!=0){
            return (dat1*dat3)/dat2;
        } 
        return 0;
    }
    
    /*
        valueProduct==totalGrams
        txtProductQuantity==txtCurrentAmount
    */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combobox.Combobox ComboBoxUnidad;
    private javaswingdev.message.Background background1;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private spinner.Spinner txtCurrentAmount;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPrecio;
    private spinner.Spinner txtProductQuantity;
    private javax.swing.JLabel unidadtxt;
    // End of variables declaration//GEN-END:variables
}
