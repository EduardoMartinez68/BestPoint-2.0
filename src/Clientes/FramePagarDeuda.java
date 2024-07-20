package Clientes;

import ClasesGlobales.Agregar;
import ClasesGlobales.convertir;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import puntoventa.FrameInventario;

public class FramePagarDeuda extends javax.swing.JFrame {
    Connection con;
    convertir conver=new convertir();
    Agregar add;
    float deudaCliente;
    int idCliente;
    FrameCreditos JF;
    int mouseX,mouseY;
    FrameInventario JF2;
    public FramePagarDeuda(Connection con,float deudaCliente,int idCliente,FrameCreditos JF,FrameInventario JF2) {
        this.con=con;
        this.deudaCliente=deudaCliente;
        this.idCliente=idCliente;
        this.JF2=JF2;
        this.add=new Agregar(con,this,JF2);
        this.JF=JF;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setTitle("Pagar deuda");
        limpiarPantalla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDineroCaja = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPorque = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ENTRADA");

        txtEntrada.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtEntrada.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("TOTAL EN CAJA");

        txtDineroCaja.setEditable(false);
        txtDineroCaja.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtDineroCaja.setText("0");

        btnGuardar.setBackground(new java.awt.Color(22, 35, 105));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/donar.png"))); // NOI18N
        btnGuardar.setText("Pagar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("¿QUE PAGA?");

        txtPorque.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPorque, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDineroCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPorque, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDineroCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, -1, -1));

        jPanel8.setBackground(new java.awt.Color(22, 35, 105));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel8MouseDragged(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pago de Deuda");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiarPantalla(){
        txtDineroCaja.setText(dineroActual()+"");
        txtPorque.setText("");
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(!txtPorque.getText().equals("") && !txtEntrada.getText().equals("")){
            guardarDinero();
            limpiarPantalla();
        }
        else{
            JOptionPane.showMessageDialog(this,"Faltan datos por llenar");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
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

    private void jPanel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mouseX,y-mouseY);
    }//GEN-LAST:event_jPanel8MouseDragged

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel8MousePressed
    
    
    private void guardarDinero(){
        float dineroCaja=conver.convertirStringFloat(txtDineroCaja.getText());
        float dineroRecibido=conver.convertirStringFloat(txtEntrada.getText());
        float dineroTotal=dineroCaja+dineroRecibido;
        //comprobar si eñ dinero que entra es mayor a 0
        if(dineroRecibido>0){
            float dineroPrevioDeuda=deudaCliente-dineroRecibido;
            if(dineroPrevioDeuda>=0){
                actualizarEntrada(dineroTotal);
                guardarEntradaSalida(dineroRecibido);
                actualizarDeudaCliente(dineroPrevioDeuda);
                agregarPagoDeuda(txtPorque.getText(),dineroRecibido);
                JF.actualizarDatosPantalla();
                JOptionPane.showMessageDialog(this,"El dinero de la caja fue actualizado de "+dineroCaja+" a "+dineroTotal);
                JOptionPane.showMessageDialog(this,"La deuda del la cliente fue actualizada de "+deudaCliente+" a "+dineroPrevioDeuda);
            }
            else{
                JOptionPane.showMessageDialog(this,"No se puede sobre pasar la deuda del cliente con el dinero recibido");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"El dinero ingresado debe ser mayor a 0");
        }
    }
    
    private void agregarPagoDeuda(String porque, float dineroRecibido){
        String cliente=obtenerNombreCliente();
        add.agregarPagoCliente(cliente,dineroRecibido,porque);
    }
    
    private String obtenerNombreCliente(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from clientes where id = "+idCliente);
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String cajero=rs.getString("nombre");
                return cajero;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        return "";
    }
    
    private void actualizarDeudaCliente(float nuevaDeuda){
        try{
            Statement sts=con.createStatement();
            String actualizar="UPDATE clientes SET deuda = '"+nuevaDeuda+"' WHERE id = "+idCliente;
            sts.executeUpdate(actualizar);    
            
            JOptionPane.showMessageDialog(this,"El cliente se actualizo correctamente");
        }catch(SQLException ex){
            System.out.println("No se pudo actualizar el cliente");
        }
    }
    
    private float dineroActual(){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver do
            while (rsBusqueda.next()){
                float dinero=rsBusqueda.getFloat("dinerocaja");
                return dinero;
            }
            float dinero=rsBusqueda.getFloat("dinerocaja");
            return dinero;
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }
    
private void actualizarEntrada(float dinero){
        try{
            Statement sts=con.createStatement();
            String actualizar="UPDATE caja SET dinerocaja = '"+dinero+"' WHERE id = 0";
            sts.executeUpdate(actualizar);    
        }catch(SQLException ex){
            System.out.println("No se pudo actualizar inventario");
        }
    }
    
    //guardar salidas y entradas
    private void guardarEntradaSalida(float movimiento){
        String fecha=obtenerFecha();
        String nombreCajero=obtenerUsuario();
        String obtenerTurnoCajero=getTurno();
        add.agregarEntradasSalidas(fecha, nombreCajero, movimiento,txtPorque.getText(),obtenerTurnoCajero);
    }
    
    private String getTurno(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String cajero=rs.getString("tiemporegistro");
                return cajero;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        return "";        
    }
    
    private String obtenerFecha(){
        //obtenemos la hora y la actualizamos
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        String fecha=(dtf.format(LocalDateTime.now())+"");
        return fecha;
    }
    
    private String obtenerUsuario(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String cajero=rs.getString("nombrecajero");
                return cajero;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        return "";
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextField txtDineroCaja;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtPorque;
    // End of variables declaration//GEN-END:variables
}
