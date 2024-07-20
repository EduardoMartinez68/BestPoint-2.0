package OpcionesBarra;

import ClasesGlobales.Buscar;
import ClasesGlobales.convertir;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import puntoventa.BuscarCarrito;
import puntoventa.FrameInventario;


public class FrameEliminarProducto extends javax.swing.JFrame {

    Buscar search;
    BuscarCarrito searchCard;
    convertir conver=new convertir();
    Connection con;
    FrameInventario FI;
    int mouseX,mouseY;
    public FrameEliminarProducto(FrameInventario FI,Connection con) {
        this.con=con;
        this.search=new Buscar(con);
        this.searchCard=new BuscarCarrito(con);
        this.FI=FI;
        initComponents();
        
        txtCantidad.setForeground(Color.gray);
        txtCantidad2.setForeground(Color.gray);
        txtCodigo.setForeground(Color.gray);
        actualizarComboBoxProducto();
        limpiarPantalla();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setTitle("Eliminar algun producto");
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
    
    private void limpiarPantalla(){
        txtCantidad.setText("Cantidad de productos a eliminar");
        txtCantidad2.setText("Cantidad de productos a eliminar");
        txtCodigo.setText("Ingresar codigo de barras");
    }
    
    private void actualizarComboBoxProducto(){
        ComboBoxProducto.removeAllItems(); //eliminar todos los items
        agregarProductosCombox();
    }
    
    private void agregarProductosCombox(){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from carritocompras");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos y agregarlos al combox
            while (rsBusqueda.next()){
                int idProducto=rsBusqueda.getInt("idproducto");
                search.buscarProductoId(idProducto);
                String item=search.Nombre();
                ComboBoxProducto.addItem(item);
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        jLabel3.setText("Cantidad de productos a eliminar");

        txtCantidad.setBackground(new java.awt.Color(238, 238, 238));
        txtCantidad.setText("Cantidad de productos a eliminar");
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });

        btnDevolver1.setBackground(new java.awt.Color(22, 35, 105));
        btnDevolver1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDevolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnDevolver1.setText("Eliminar");
        btnDevolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 366, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
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
                .addComponent(btnDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Elimina con codigo de barra", jPanel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Producto");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad de productos a eliminar");

        txtCantidad2.setBackground(new java.awt.Color(238, 238, 238));
        txtCantidad2.setText("Cantidad de productos a eliminar");
        txtCantidad2.setBorder(null);
        txtCantidad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidad2MousePressed(evt);
            }
        });

        btnDevolver2.setBackground(new java.awt.Color(22, 35, 105));
        btnDevolver2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDevolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnDevolver2.setText("Eliminar");
        btnDevolver2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxProducto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 366, Short.MAX_VALUE))
                    .addComponent(txtCantidad2)
                    .addComponent(jSeparator3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
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
                .addComponent(btnDevolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Eliminar en busqueda", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

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
        jLabel17.setText("Eliminar producto del carrito");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMousePressed
        if(txtCodigo.getText().equals("Ingresar codigo de barras")){
            txtCodigo.setText("");
            txtCodigo.setForeground(Color.black);
        }

        if(txtCantidad.getText().equals("Cantidad de productos a eliminar") || txtCantidad.getText().equals("")){
            txtCantidad.setText("Cantidad de productos a eliminar");
            txtCantidad.setForeground(Color.gray);
        }

        if(txtCantidad2.getText().equals("Cantidad de productos a eliminar") || txtCantidad2.getText().equals("")){
            txtCantidad2.setText("Cantidad de productos a eliminar");
            txtCantidad2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCodigoMousePressed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        if(txtCantidad.getText().equals("Cantidad de productos a eliminar")){
            txtCantidad.setText("");
            txtCantidad.setForeground(Color.black);
        }

        if(txtCodigo.getText().equals("Ingresar codigo de barras") || txtCodigo.getText().equals("")){
            txtCodigo.setText("Ingresar codigo de barras");
            txtCodigo.setForeground(Color.gray);
        }

        if(txtCantidad2.getText().equals("Cantidad de productos a eliminar") || txtCantidad2.getText().equals("")){
            txtCantidad2.setText("Cantidad de productos a eliminar");
            txtCantidad2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCantidadMousePressed

    private void obtenerProducto(){
        String codigoBarras=txtCodigo.getText();
        int cantidadEliminar=conver.convertirStringInt(txtCantidad.getText());
        if (search.buscarProducto(codigoBarras)){
            actualizarProductos(codigoBarras,cantidadEliminar);
        }
    }
    
    private void actualizarProductos(String codigoBarras,int cantidadEliminar){
        if(searchCard.buscarProductoExistente(codigoBarras,FI.getNumCarrito())){
            search.buscar(codigoBarras);
            //comprobar que estoy metiendo un numero mayor a 0 para no restarle
            agregarProductoCarrito(codigoBarras,cantidadEliminar);
        }
        else{
            new FrameError(null,"No existe el producto en el carrito").setVisible(true);
        }
    }   
    
    private void agregarProductoCarrito(String codigoBarra,int cantidadEliminar){
        this.setVisible(false);
        FI.eliminarProductoCarro(codigoBarra,cantidadEliminar);
        FI.borrarTextoCodigo();
        FI.actualizarTablaCarrito();
    }
    
    private void btnDevolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolver1ActionPerformed
        obtenerProducto();
    }//GEN-LAST:event_btnDevolver1ActionPerformed

    private void txtCantidad2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidad2MousePressed
        if(txtCantidad2.getText().equals("Cantidad de productos a eliminar")){
            txtCantidad2.setText("");
            txtCantidad2.setForeground(Color.black);
        }

        if(txtCodigo.getText().equals("Ingresar codigo de barras") || txtCodigo.getText().equals("")){
            txtCodigo.setText("Ingresar codigo de barras");
            txtCodigo.setForeground(Color.gray);
        }

        if(txtCantidad.getText().equals("Cantidad de productos a eliminar") || txtCantidad.getText().equals("")){
            txtCantidad.setText("Cantidad de productos a eliminar");
            txtCantidad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCantidad2MousePressed

    private void btnDevolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolver2ActionPerformed
        obtenerDatosPestanaDos();
        limpiarPantalla();
    }//GEN-LAST:event_btnDevolver2ActionPerformed

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

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged

    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed
    
    private String obtenerCodigoBarrasNombre(String producto){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from productos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("nombre").equals(producto)){
                    return rsBusqueda.getString("codigobarras");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        
        return "";
    }    
    
    private void obtenerDatosPestanaDos(){
        String producto=(String) ComboBoxProducto.getSelectedItem();
        String codigoBarras=obtenerCodigoBarrasNombre(producto);
        int cantidadEliminar=conver.convertirStringInt(txtCantidad2.getText());
        actualizarProductos(codigoBarras,cantidadEliminar);
    }

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
