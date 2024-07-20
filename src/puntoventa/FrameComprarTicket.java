package puntoventa;

import ClasesGlobales.Buscar;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class FrameComprarTicket extends javax.swing.JFrame {
    Connection con;
    FrameInventario JF;
    Buscar search;
    int mouseX;
    int mouseY;
    
    Color colorBtnHover=new Color(46,69,209);
    Color ColorBtn=new Color(22,35,105);
    
    public FrameComprarTicket(Connection con,FrameInventario JF) {
        this.JF=JF;
        this.con=con;
        search=new Buscar(con);
        initComponents();
        
        impresionTicket1.setDescripciones("<html>Producto <p>"+"<html>");
        impresionTicket1.setCantidades("<html>Cant.<p> <html>");
        impresionTicket1.setImportes("<html>Importe<p><html>");
        impresionTicket1.setTotalProducto("<html>Total<p><html>");
        
        this.setResizable(false);
        this.setTitle("Compra e impresion de Ticket");
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        cambiarLogoTicket();
        leerBaseDatos();
        registrarCompras();
        centrarPanel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        impresionTicket1 = new Opciones.ImpresionTicket();
        btnCobrar = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        btnCobrarTarjeta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtReferencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        toggleButton1 = new toggle.ToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        btnCobrar.setBackground(new java.awt.Color(22, 35, 105));
        btnCobrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora.png"))); // NOI18N
        btnCobrar.setText("Imprimir Ticket y cobrar");
        btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCobrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCobrarMouseExited(evt);
            }
        });
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnTicket.setBackground(new java.awt.Color(22, 35, 105));
        btnTicket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/donar.png"))); // NOI18N
        btnTicket.setText("Cobrar y no imprimir Ticket");
        btnTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTicketMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTicketMouseExited(evt);
            }
        });
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });

        btnCobrarTarjeta.setBackground(new java.awt.Color(22, 35, 105));
        btnCobrarTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCobrarTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrarTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarjeta.png"))); // NOI18N
        btnCobrarTarjeta.setText("Cobrar por tarjeta");
        btnCobrarTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrarTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCobrarTarjetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCobrarTarjetaMouseExited(evt);
            }
        });
        btnCobrarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarTarjetaActionPerformed(evt);
            }
        });

        txtReferencia.setFont(new java.awt.Font("OCR A Extended", 0, 48)); // NOI18N

        jLabel1.setText("Numero de referencia:");

        jLabel2.setText("La referencia se utiliza cuando deceas pagar con tarjeta");

        jLabel3.setText("de credito");

        jPanel1.setBackground(new java.awt.Color(22, 35, 105));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Facturar la compra");

        panelBtnExit.setBackground(new java.awt.Color(22, 35, 105));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        toggleButton1.setForeground(new java.awt.Color(22, 35, 105));

        jLabel5.setText("Redondear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(impresionTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(btnCobrarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(txtReferencia))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCobrarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(toggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))))
                    .addComponent(impresionTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        imprimitTicket();
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        cobrarTienda("Efectivo");
    }//GEN-LAST:event_btnTicketActionPerformed

    private void btnCobrarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarTarjetaActionPerformed
        if(txtReferencia.getText().equals("")){
            new FrameError(null,"Es necesario agregar el numero de referencia").setVisible(true);
        }
        else{
            cobrarTienda("Credito/Tarjeta");
        }
    }//GEN-LAST:event_btnCobrarTarjetaActionPerformed

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        this.dispose();
        JF.apagarWallpaper();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        panelBtnExit.setBackground(Color.RED);
        labelExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        panelBtnExit.setBackground(new Color(22,35,105));
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btnTicketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketMouseEntered
        btnTicket.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnTicketMouseEntered

    private void btnTicketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketMouseExited
        btnTicket.setBackground(ColorBtn);
    }//GEN-LAST:event_btnTicketMouseExited

    private void btnCobrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseEntered
        btnCobrar.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnCobrarMouseEntered

    private void btnCobrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseExited
         btnCobrar.setBackground(ColorBtn);
    }//GEN-LAST:event_btnCobrarMouseExited

    private void btnCobrarTarjetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarTarjetaMouseEntered
        btnCobrarTarjeta.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnCobrarTarjetaMouseEntered

    private void btnCobrarTarjetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarTarjetaMouseExited
        btnCobrarTarjeta.setBackground(ColorBtn);
    }//GEN-LAST:event_btnCobrarTarjetaMouseExited

    private void panelBtnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMousePressed
        this.dispose();
    }//GEN-LAST:event_panelBtnExitMousePressed

    private void cobrarTienda(String tipoPago){
        this.dispose();
        JF.registrarCompraTarjtea(txtReferencia.getText());
        JF.registrarCompras(tipoPago);
        JF.borrarTabla();
        //new FrameCorrecto(JF,"Compras realizadas con exito").setVisible(true);
        new MessageCorrect(JF,"Compras realizadas con exito",JF).setVisible(true);
    }
    
    private void leerBaseDatos(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from opciones");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String NombreEmpresa=rs.getString("nombreempresa");
                String mensajeDespedida=rs.getString("despedidaticket");
                int fehca=rs.getInt("fechaticket");
                llenarTicket(NombreEmpresa,mensajeDespedida,fehca);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }  
    
    private void llenarTicket(String NombreEmpresa,String mensajeDespedida,int fecha){
        impresionTicket1.setNombreEmpres(NombreEmpresa);
        impresionTicket1.setMensajeDespedida(mensajeDespedida);
        actualizarFecha(fecha);
    }
    
    private void actualizarFecha(int fecha){
        //0 false 1 true
        if(fecha==0){
            impresionTicket1.setFecha("");
        }
        else{
            activarFecha();
        }
    }    
    
    private void activarFecha(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        impresionTicket1.setFecha(dtf.format(LocalDateTime.now())+"");
    }      
    
    private void registrarCompras(){
        impresionTicket1.setTotal(JF.getTotalCarrito());
        
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from carritocompras");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                int idProducto=rs.getInt("idproducto");
                search.buscarProductoId(idProducto);
                
                //obtener informacion del producto
                //int codigoBarras=rs.getInt("codigoBarras");
                int cantidad=rs.getInt("cantidad");
                String descripcion=search.Nombre();
                float precio=search.Precio();
                float total=rs.getFloat("total");
                
                //obtener los datos viejos que ya estan escriots
                String descripcionVieja=impresionTicket1.getDescripciones();
                String viejasCantidades=impresionTicket1.getCantidades();
                String viejosImporte=impresionTicket1.getImportes();
                String viejoTotalProducto=impresionTicket1.getTotalProducto();
                
                
                //actualizar informacion
                impresionTicket1.setDescripciones(descripcionVieja+"<p>"+descripcion);
                impresionTicket1.setCantidades(viejasCantidades+"<p>"+cantidad);
                impresionTicket1.setImportes(viejosImporte+"<p>"+precio);
                impresionTicket1.setTotalProducto(viejoTotalProducto+"<p>"+total);
                
            }
        }catch(SQLException ex){
            
        }        
    }
    
    private void cambiarLogoTicket(){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from opciones");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                String rutImg=rsBusqueda.getString("rutlogo");
                impresionTicket1.setImg(rutImg);
                break;
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    private void imprimitTicket(){
        this.dispose();
        JF.apagarWallpaper();
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(impresionTicket1);
        //comprobar si se puede imprimir
        if(job.printDialog()){
            try{
                job.print();
                JF.registrarCompras("Efectivo");
                JF.borrarTabla();
                JOptionPane.showMessageDialog(JF,"Compras realizadas con exito");
            }catch(PrinterException ex){
                JOptionPane.showMessageDialog(this,"Algo fallo al imprimir");
            }
        } 
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnCobrarTarjeta;
    private javax.swing.JButton btnTicket;
    private Opciones.ImpresionTicket impresionTicket1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private toggle.ToggleButton toggleButton1;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
