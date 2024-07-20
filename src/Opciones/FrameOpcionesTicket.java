package Opciones;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import puntoventa.FrameInventario;

public class FrameOpcionesTicket extends javax.swing.JFrame{
    Connection con;
    int mouseX,mouseY;
    String rutaImg="";
    FrameInventario JF;
    public FrameOpcionesTicket(Connection con,FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        initComponents();
        leerBaseDatos();
        llenarDatosTicket();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setSize(880, 650);
        this.setTitle("Opciones de ticket de compra");
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        impresionTicket1 = new Opciones.ImpresionTicket();
        checkBoxFecha = new javax.swing.JCheckBox();
        btnImpresionPrueba = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeDespedida = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("PERSONALIZACION DEL TICKET DE VENTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Ejemplo de impresion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(impresionTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(impresionTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));

        checkBoxFecha.setText("Incluir fecha");
        checkBoxFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkBoxFechaMousePressed(evt);
            }
        });
        getContentPane().add(checkBoxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        btnImpresionPrueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora.png"))); // NOI18N
        btnImpresionPrueba.setText("Probar impresion de prueba");
        btnImpresionPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpresionPruebaActionPerformed(evt);
            }
        });
        getContentPane().add(btnImpresionPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, 43));

        jLabel2.setText("Mensaje de despedida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        txtMensajeDespedida.setColumns(20);
        txtMensajeDespedida.setRows(5);
        txtMensajeDespedida.setText("Mensaje despedida");
        txtMensajeDespedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMensajeDespedidaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtMensajeDespedida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 293, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        jButton2.setText("Quitar logotipo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        jButton1.setText("Agregar logotipo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgL.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(labelImg)
                .addGap(113, 113, 113))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelImg)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 290, 60));

        jLabel5.setText("Nombre de la empresa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        txtNombreEmpresa.setText("Nombre empresa");
        txtNombreEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreEmpresaKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 293, -1));

        btnActualizar.setBackground(new java.awt.Color(22, 35, 105));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disco.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 220, 41));

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
        jLabel17.setText("Configuraciones de Ticket");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 621, Short.MAX_VALUE)
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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarDatosTicket(){
        String pd=impresionTicket1.getDescripciones();
        String cant=impresionTicket1.getCantidades();
        String importe=impresionTicket1.getImportes();
        String total=impresionTicket1.getTotalProducto();
        
        impresionTicket1.setDescripciones("");
        impresionTicket1.setCantidades("");
        impresionTicket1.setImportes("");
        impresionTicket1.setTotalProducto("");  
        
        impresionTicket1.setDescripciones("<html>"+pd+"<p>"+"Agua mineral 600ml"+"<html>");
        impresionTicket1.setCantidades("<html>"+cant+"<p>"+"1"+"<html>");
        impresionTicket1.setImportes("<html>"+importe+"<p>"+"$7.00"+"<html>");
        impresionTicket1.setTotalProducto("<html>"+total+"<p>"+"7"+"<html>");
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
                String img=rs.getString("rutlogo");
                cargarLogo(img);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    private void cargarLogo(String img){
        if (img!=null){
            rutaImg=img;
        }
        else{
            String rutaProyecto=System.getProperty("user.dir");
            rutaImg=rutaProyecto+"\\src\\Img\\imgL.png";                
        }
        actualizarImg();      
    }
    
    private void actualizarImg(){
        //cambiar el logo en la interfaz 
        Image img=new ImageIcon(rutaImg).getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);

        //cambiar la img en el ticket
        impresionTicket1.setImg(rutaImg);
    }
    
    private void llenarTicket(String NombreEmpresa,String mensajeDespedida,int fecha){
        impresionTicket1.setNombreEmpres(NombreEmpresa);
        impresionTicket1.setMensajeDespedida(mensajeDespedida);
        actualizarFecha(fecha);
    }
    
    private void obtenerNuevosDatos(){
       String NombreEmpresa=txtNombreEmpresa.getText();
       String mensajeDespedida=txtMensajeDespedida.getText();
       int fecha=getFechaOpciones();
       actualizarTicket(NombreEmpresa,mensajeDespedida,fecha);
    }
    
    private void actualizarTicket(String NombreEmpresa,String mensajeDespedida,int fecha){
        try{
            String orden=" UPDATE opciones SET nombreempresa = '"+NombreEmpresa+"', fechaticket = '"+fecha+"', despedidaticket = '"+mensajeDespedida+"', rutlogo='"+rutaImg+"' WHERE id = 0";
            Statement sts=con.createStatement();
            sts.executeUpdate(orden);
            leerBaseDatos();
            JOptionPane.showMessageDialog(this,"Los cambios se han guardado con exito");
            System.out.println("Se guardo ");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Algo fallo al actualizar");
            System.out.println("Error "+e);
        }
    }
    
    private int getFechaOpciones(){
        if(checkBoxFecha.isSelected()){
            return 1;
        }
        else{
            return 0;
        }    
    }
    
    private void actualizarFecha(int fecha){
        //0 false 1 true
        if(fecha==0){
            checkBoxFecha.setSelected(false);
            impresionTicket1.setFecha("");
        }
        else{
            checkBoxFecha.setSelected(true);
            activarFecha();
        }
    }
    
    private void btnImpresionPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpresionPruebaActionPerformed
        
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(impresionTicket1);
        //comprobar si se puede imprimir
        if(job.printDialog()){
            try{
                job.print();
                JOptionPane.showMessageDialog(this,"Ticket impreso con exito");
            }catch(PrinterException ex){
                JOptionPane.showMessageDialog(this,"Algo fallo al imprimir");
            }
        }
    }//GEN-LAST:event_btnImpresionPruebaActionPerformed

    private void txtMensajeDespedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeDespedidaKeyReleased
        String mensajeDespedida=txtMensajeDespedida.getText();
        impresionTicket1.setMensajeDespedida(mensajeDespedida);
    }//GEN-LAST:event_txtMensajeDespedidaKeyReleased

    private void txtNombreEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpresaKeyReleased
       String nombreEmpresa=txtNombreEmpresa.getText();
       impresionTicket1.setNombreEmpres(nombreEmpresa);
    }//GEN-LAST:event_txtNombreEmpresaKeyReleased

    private void checkBoxFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxFechaMousePressed
        if(checkBoxFecha.isSelected()){
            impresionTicket1.setFecha("");
        }
        else{
            activarFecha();
        }
    }//GEN-LAST:event_checkBoxFechaMousePressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       obtenerNuevosDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        fileChooser.setFileFilter(imgFilter);
        int result = fileChooser.showOpenDialog(this);
        
        if(result==JFileChooser.APPROVE_OPTION){
            //cambiar el logo en la interfaz 
            rutaImg=fileChooser.getSelectedFile().getPath();
            Image img=new ImageIcon(rutaImg).getImage();
            ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
            labelImg.setIcon(icono);
            
            //cambiar la img en el ticket
            impresionTicket1.setImg(rutaImg);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        borrarImgProducto();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void borrarImgProducto(){
        String rutaProyecto=System.getProperty("user.dir");
        rutaImg=rutaProyecto+"\\src\\Img\\imgL.png";
        Image img=new ImageIcon(rutaImg).getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);    
        
        //cambiar la img en el ticket
        impresionTicket1.setImg(rutaImg);
    }
    
    private void activarFecha(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        impresionTicket1.setFecha(dtf.format(LocalDateTime.now())+"");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnImpresionPrueba;
    private javax.swing.JCheckBox checkBoxFecha;
    private Opciones.ImpresionTicket impresionTicket1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelImg;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextArea txtMensajeDespedida;
    private javax.swing.JTextField txtNombreEmpresa;
    // End of variables declaration//GEN-END:variables
    
}
