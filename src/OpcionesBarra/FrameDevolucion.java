package OpcionesBarra;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import puntoventa.FrameInventario;

public class FrameDevolucion extends javax.swing.JFrame {
    
    Connection con;
    convertir conver=new convertir();
    Buscar search;
    Agregar add;
    int mouseX,mouseY;
    FrameInventario JF;
    public FrameDevolucion(Connection con,FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        this.add=new Agregar(con,this,JF);
        initComponents();
        this.search=new Buscar(con);
        txtCantidad.setForeground(Color.gray);
        txtCantidad2.setForeground(Color.gray);
        txtCodigo.setForeground(Color.gray);
        actualizarComboBoxProducto();
        limpiarPantalla();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setTitle("Devoluciones");
        centrarPanel();
    }
    
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnDevolver1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JTextField();
        btnDevolver2 = new javax.swing.JButton();
        ComboBoxProducto = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBackground(new java.awt.Color(238, 238, 238));
        txtCodigo.setText("Ingresar codigo de barras");
        txtCodigo.setBorder(null);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Codigo de barras");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad de productos a devolver");

        txtCantidad.setBackground(new java.awt.Color(238, 238, 238));
        txtCantidad.setText("Cantidad de productos a devolver");
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });

        btnDevolver1.setBackground(new java.awt.Color(22, 35, 105));
        btnDevolver1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDevolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnDevolver1.setText("Devolver");
        btnDevolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Devolver con codigo de barra", jPanel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Producto");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad de productos a devolver");

        txtCantidad2.setBackground(new java.awt.Color(238, 238, 238));
        txtCantidad2.setText("Cantidad de productos a devolver");
        txtCantidad2.setBorder(null);
        txtCantidad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidad2MousePressed(evt);
            }
        });

        btnDevolver2.setBackground(new java.awt.Color(22, 35, 105));
        btnDevolver2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDevolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnDevolver2.setText("Devolver");
        btnDevolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolver2ActionPerformed(evt);
            }
        });

        ComboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ComboBoxProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCantidad2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnDevolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Devolucion en busqueda", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, 290));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 390, 320));

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
        jLabel17.setText("Devolucion de producto");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiarPantalla(){
        txtCantidad.setText("Cantidad de productos a devolver");
        txtCantidad2.setText("Cantidad de productos a devolver");
        txtCodigo.setText("Ingresar codigo de barras");
    }
    
    private void actualizarComboBoxProducto(){
        ComboBoxProducto.removeAllItems(); //eliminar todos los items
        agregarProductosCombox();
    }
    
    private void agregarProductosCombox(){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from productos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos y agregarlos al combox
            while (rsBusqueda.next()){
                String item=rsBusqueda.getString("nombre");
                ComboBoxProducto.addItem(item);
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    private void btnDevolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolver1ActionPerformed
        obtenerProducto();
        limpiarPantalla();
    }//GEN-LAST:event_btnDevolver1ActionPerformed
    
    private void obtenerProducto(){
        String codigoBarras=txtCodigo.getText();
        if (search.buscarProducto(codigoBarras)){
            actualizarProductos(codigoBarras);
        }
    }
    
    private void actualizarProductos(String codigoBarras){
        try{
            int viejaCantidad=search.Cantidad();
            int cantidadRembolsar=conver.convertirStringInt(txtCantidad.getText());
            String producto=search.Nombre();
            
            //comprobar que estoy metiendo un numero mayor a 0 para no restarle
            if(cantidadRembolsar>0){
                int nuevaCantidad=viejaCantidad+cantidadRembolsar;
                actualizarInventario(search.Id(),nuevaCantidad,producto);
            }
            else{
                new FrameError(JF,"Solo se pueden agregar productos mayores a 0").setVisible(true);
            }
        }catch(SQLException e){
        }
    }
    
    private void actualizarInventario(int id,int nuevaCantidad,String producto){
        try{
            Statement sts=con.createStatement();
            String actualizar="UPDATE productos SET cantidad = '"+nuevaCantidad+"' WHERE id = "+id;
            sts.executeUpdate(actualizar);
            new FrameCorrecto(JF,"El producto '"+producto+"' fue actualizado").setVisible(true);
            
            //agregar devolucion
            float precio=search.Precio();
            String fecha=getFecha();
            add.agregarDevoluciones(producto,precio,fecha);
            
        }catch(SQLException ex){
            System.out.println(ex);
            new FrameError(JF,"El producto '"+producto+"' NO SE FUE actualizar").setVisible(true);
        }
    } 
    
    private void btnDevolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolver2ActionPerformed
        obtenerDatosPestanaDos();
        limpiarPantalla();
    }//GEN-LAST:event_btnDevolver2ActionPerformed
    
    private void obtenerDatosPestanaDos(){
        String producto=(String) ComboBoxProducto.getSelectedItem();
        String codigoBarras=obtenerCodigoBarrasNombre(producto);
        actualizarProductos2(codigoBarras);
    }

    private void actualizarProductos2(String codigoBarras){
        try{
            search.buscar(codigoBarras);
            int viejaCantidad=search.Cantidad();
            int cantidadRembolsar=conver.convertirStringInt(txtCantidad2.getText());
            String producto=search.Nombre();
            
            //comprobar que estoy metiendo un numero mayor a 0 para no restarle
            if(cantidadRembolsar>0){
                int nuevaCantidad=viejaCantidad+cantidadRembolsar;
                actualizarInventario(search.Id(),nuevaCantidad,producto);
            }
            else{
                new FrameError(JF,"Solo se pueden agregar productos mayores a 0").setVisible(true);
            }
            
            //agregar devolucion
            add.agregarDevoluciones(search.Nombre()+"",search.Precio(), getFecha());
        }catch(SQLException e){
        }    
        
    }
    
    private String getFecha(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now())+"";    
    }
    
    private String obtenerCodigoBarrasNombre(String producto){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from productos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("nombre").equals(producto)){
                    return rsBusqueda.getString("codigoBarras");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        
        return "";
    }
    
    private void txtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMousePressed
        if(txtCodigo.getText().equals("Ingresar codigo de barras")){
            txtCodigo.setText("");
            txtCodigo.setForeground(Color.black);
        }
        
        if(txtCantidad.getText().equals("Cantidad de productos a devolver") || txtCantidad.getText().equals("")){
           txtCantidad.setText("Cantidad de productos a devolver");
           txtCantidad.setForeground(Color.gray);
        }
        
        if(txtCantidad2.getText().equals("Cantidad de productos a devolver") || txtCantidad2.getText().equals("")){
           txtCantidad2.setText("Cantidad de productos a devolver");
           txtCantidad2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCodigoMousePressed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        if(txtCantidad.getText().equals("Cantidad de productos a devolver")){
            txtCantidad.setText("");
            txtCantidad.setForeground(Color.black);
        }
        
        if(txtCodigo.getText().equals("Ingresar codigo de barras") || txtCodigo.getText().equals("")){
           txtCodigo.setText("Ingresar codigo de barras");
           txtCodigo.setForeground(Color.gray);
        }
        
        if(txtCantidad2.getText().equals("Cantidad de productos a devolver") || txtCantidad2.getText().equals("")){
           txtCantidad2.setText("Cantidad de productos a devolver");
           txtCantidad2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtCantidad2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidad2MousePressed
        if(txtCantidad2.getText().equals("Cantidad de productos a devolver")){
            txtCantidad2.setText("");
            txtCantidad2.setForeground(Color.black);
        }
        
        if(txtCodigo.getText().equals("Ingresar codigo de barras") || txtCodigo.getText().equals("")){
           txtCodigo.setText("Ingresar codigo de barras");
           txtCodigo.setForeground(Color.gray);
        }
        
        if(txtCantidad.getText().equals("Cantidad de productos a devolver") || txtCantidad.getText().equals("")){
           txtCantidad.setText("Cantidad de productos a devolver");
           txtCantidad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCantidad2MousePressed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxProducto;
    private javax.swing.JButton btnDevolver1;
    private javax.swing.JButton btnDevolver2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidad2;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
