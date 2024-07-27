package OpcionesBarra;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import Notificaciones.MessageError;
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

        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        materialTabbed1 = new tabbed.MaterialTabbed();
        jPanel6 = new javax.swing.JPanel();
        txtCodigo = new textfield.TextField();
        txtCantidad = new textfield.TextField();
        btnDevolver1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        txtCantidad2 = new textfield.TextField();
        ComboBoxProducto = new javax.swing.JComboBox<>();
        btnDevolver2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
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
        jLabel17.setText("Devolucion de producto");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 571, Short.MAX_VALUE)
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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel6.setBackground(new java.awt.Color(238, 238, 238));

        txtCodigo.setBackground(new java.awt.Color(238, 238, 238));
        txtCodigo.setLabelText("Ingresar Codigo de Barras");
        txtCodigo.setLineColor(new java.awt.Color(22, 35, 105));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(238, 238, 238));
        txtCantidad.setLabelText("Cantidad de productos a devolver");
        txtCantidad.setLineColor(new java.awt.Color(22, 35, 105));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnDevolver1.setBackground(new java.awt.Color(57, 78, 194));
        btnDevolver1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDevolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnDevolver1.setText("Devolver");
        btnDevolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Devolver con codigo de barra", jPanel6);

        jPanel7.setBackground(new java.awt.Color(238, 238, 238));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtCantidad2.setBackground(new java.awt.Color(238, 238, 238));
        txtCantidad2.setLabelText("Cantidad de productos a devolver");
        txtCantidad2.setLineColor(new java.awt.Color(22, 35, 105));
        txtCantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad2ActionPerformed(evt);
            }
        });
        jPanel7.add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, -1));

        ComboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(ComboBoxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 34));

        btnDevolver2.setBackground(new java.awt.Color(57, 78, 194));
        btnDevolver2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDevolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnDevolver2.setText("Devolver");
        btnDevolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolver2ActionPerformed(evt);
            }
        });
        jPanel7.add(btnDevolver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 192, 40));

        materialTabbed1.addTab("Devolucion en busqueda", jPanel7);

        getContentPane().add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 60, -1, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/devolver.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiarPantalla(){
        txtCantidad.setText("");
        txtCantidad2.setText("");
        txtCodigo.setText("");
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
        }else{
            new MessageError(this,"Este producto no existe en la base de datos");
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
                new MessageError(this,"Solo se pueden agregar productos mayores a 0");
            }
        }catch(SQLException e){
        }
    }
    
    private void actualizarInventario(int id,int nuevaCantidad,String producto){
        try{
            Statement sts=con.createStatement();
            String actualizar="UPDATE productos SET cantidad = '"+nuevaCantidad+"' WHERE id = "+id;
            sts.executeUpdate(actualizar);
            new MessageCorrect(this,"El producto '"+producto+"' fue actualizado",null);
            
            //agregar devolucion
            float precio=search.Precio();
            String fecha=getFecha();
            add.agregarDevoluciones(producto,precio,fecha);
            
        }catch(SQLException ex){
            System.out.println(ex);
            new MessageError(this,"El producto '"+producto+"' NO SE FUE actualizar");
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
                new MessageError(this,"Solo se pueden agregar productos mayores a 0");
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

    private void txtCantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidad2ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxProducto;
    private javax.swing.JButton btnDevolver1;
    private javax.swing.JButton btnDevolver2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelExit;
    private tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JPanel panelBtnExit;
    private textfield.TextField txtCantidad;
    private textfield.TextField txtCantidad2;
    private textfield.TextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
