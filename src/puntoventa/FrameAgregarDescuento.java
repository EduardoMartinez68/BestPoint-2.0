package puntoventa;

import ClasesGlobales.Buscar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FrameAgregarDescuento extends javax.swing.JFrame {
    convertir conver=new convertir();
    Connection con;
    FrameInventario JF;
    int row;
    int column;
    int id;
    BuscarCarrito searchCard;
    Buscar search;
    
    public FrameAgregarDescuento(Connection con,FrameInventario JF,int column,int row) {
        this.con=con;
        this.JF=JF;
        this.column=column;
        this.row=row;
        searchCard=new BuscarCarrito(con);
        search=new Buscar(con);
        initComponents();
        obtenerDescuento();
        centrarPanel();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
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

        jPanel1 = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setText("0.00");
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TOTAL");

        txtDescuento.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuento.setText("0.00");
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DESCUENTO");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio Total");

        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setText("0.00");

        btnGuardar.setBackground(new java.awt.Color(22, 35, 105));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnGuardar.setText("Aceptar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(207, 204, 205));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circulo-cruzado.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/descuento.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel1))
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jLabel2))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        actualizarDatosEnCarrito();
        JF.apagarWallpaper();
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JF.apagarWallpaper();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
        //calcularDescuento();
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtDescuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyPressed
        calcularTotal();
    }//GEN-LAST:event_txtDescuentoKeyPressed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        //calcularDescuento();
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        //calcularDescuento();
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
       calcularDescuento();
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyReleased
        calcularTotal();
    }//GEN-LAST:event_txtDescuentoKeyReleased
    
    private void obtenerDescuento(){
        String descuento=String.valueOf(JF.getTableCarrito().getValueAt(row, 6));
        String total=String.valueOf(JF.getTableCarrito().getValueAt(row, 7));
        
        if(descuento.equals("null")){
            descuento="0";
        }
        
        String codigoBarras=String.valueOf(JF.getTableCarrito().getValueAt(row, 0));
        search.buscarProducto(codigoBarras);
        
        float totalProducto=0;
        String cantidadS=String.valueOf(JF.getTableCarrito().getValueAt(row, 4));
        float cantidad=conver.convertirStringFloat(cantidadS);
        
        try{
            totalProducto=search.Precio()*cantidad;
        }catch(SQLException e){
            System.out.println("Error "+e);
        }    

        txtTotal.setText(totalProducto+"");
        txtDescuento.setText(descuento);
        txtPrecio.setText(total);
    }
    
    private void calcularDescuento(){
        float precio=conver.convertirStringFloat(txtPrecio.getText());
        float total=conver.convertirStringFloat(txtTotal.getText());
        
        float descuento=100-((precio*100)/total);
        
        //redondeamos el descuento por si tiene resultados negativos o mayores a 100%
        descuento= (descuento<0) ? 0 : descuento;
        descuento= (descuento>100) ? 100: descuento;
        
        txtDescuento.setText(descuento+"");
    }
    
    private void calcularTotal(){
        float descuento=conver.convertirStringFloat(txtDescuento.getText());
        float total=conver.convertirStringFloat(txtTotal.getText());
        
        float precio=total-((descuento*total)/100);
        //redondeamos el descuento por si tiene resultados negativos o mayores a 100%
        precio= (precio<0) ? 0 : precio;
        precio= (precio>total) ? total: precio;
        txtPrecio.setText(precio+"");
    }
    
    
    private void actualizarDatosEnCarrito(){
        int cantidad=1;
        buscarDatos();
        //si la cantidad es 0 eliminarlo del carrito 
        if (cantidad<=0){
            eliminarProducto();
        }
        else{
            calcularDescuento();
            calcularTotal();
            actualizarDescuentoCarrito();
        }
    }
    
    private void actualizarDescuentoCarrito(){
        try{
            Statement sts=con.createStatement();
            String actualizar="update carritocompras set descuento = '"+txtDescuento.getText()+"', total = '"+txtPrecio.getText()+"' where id = "+id;
            sts.executeUpdate(actualizar);
            JF.actualizarTablaCarrito();
        }catch(SQLException e){
            System.out.println("Error "+e);
        }            
    }
    
     private void buscarDatos(){
        try{
            String codigoBarras=String.valueOf(JF.getTableCarrito().getValueAt(row, 0));
            searchCard.buscarProducto(codigoBarras,JF.getNumCarrito());
            id=searchCard.Id();
        }catch(Exception ex){
            
        }
    }
    
    private void eliminarProducto(){
        try{
            String producto=searchCard.Nombre();
            JF.borrarProductoTabla(id);
            new FrameCorrecto(JF,"Se elimino el producto '"+producto+"' correctamente").setVisible(true);
        }catch(SQLException e){
            System.out.println("Error "+e);
        }    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
