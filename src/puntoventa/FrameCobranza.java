package puntoventa;

import static ClasesGlobales.ConvertirNumeroATexto.convertirNumeroATexto;
import ClasesGlobales.convertir;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FrameCobranza extends javax.swing.JFrame {
    Connection con;
    convertir conver=new convertir();
    FrameInventario JF;
    
    int mouseX;
    int mouseY;
    Color colorBtnHover=new Color(46,69,209);
    Color ColorBtn=new Color(57,78,194);
    
    public FrameCobranza(Connection con,FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        initComponents();
        float total=JF.getTotalCarritoNum();
        txtCobro.setText(total+"");
        txtTotalTexto.setText("("+convertirNumeroATexto(total)+")");
        this.setSize(809, 550);
        this.setResizable(false);
        this.setTitle("Compra del producto");
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        centrarPanel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCobro = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtTotalTexto = new javax.swing.JLabel();
        inputTarjetaCredito = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputTarjetaDebito = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCupones = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Efectivo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));

        txtEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txtEntrada.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtEntrada.setForeground(new java.awt.Color(57, 78, 194));
        txtEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrada.setText("0");
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEntradaKeyReleased(evt);
            }
        });
        jPanel2.add(txtEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 158, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 78, 194));
        jLabel3.setText("Total a pagar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        txtCobro.setEditable(false);
        txtCobro.setBackground(new java.awt.Color(255, 255, 255));
        txtCobro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtCobro.setForeground(new java.awt.Color(57, 78, 194));
        txtCobro.setText("0");
        txtCobro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 47, 235, 48));

        btnGuardar.setBackground(new java.awt.Color(57, 78, 194));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/donar.png"))); // NOI18N
        btnGuardar.setText("COMPRAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 235, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 91));
        jLabel4.setText("Cambio");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        txtCambio.setEditable(false);
        txtCambio.setBackground(new java.awt.Color(255, 255, 255));
        txtCambio.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtCambio.setForeground(new java.awt.Color(0, 204, 91));
        txtCambio.setText("0");
        txtCambio.setBorder(null);
        jPanel2.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 229, 48));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 91));
        jLabel1.setText("$");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 738, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 78, 194));
        jLabel6.setText("$");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 34, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 750, 10));

        txtTotalTexto.setForeground(new java.awt.Color(57, 78, 194));
        txtTotalTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalTexto.setText("(cero)");
        jPanel2.add(txtTotalTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 100, 240, -1));

        inputTarjetaCredito.setBackground(new java.awt.Color(255, 255, 255));
        inputTarjetaCredito.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        inputTarjetaCredito.setForeground(new java.awt.Color(57, 78, 194));
        inputTarjetaCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTarjetaCredito.setText("0");
        inputTarjetaCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputTarjetaCreditoKeyReleased(evt);
            }
        });
        jPanel2.add(inputTarjetaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 158, 48));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tarjeta Credito");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 160, -1));

        inputTarjetaDebito.setBackground(new java.awt.Color(255, 255, 255));
        inputTarjetaDebito.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        inputTarjetaDebito.setForeground(new java.awt.Color(57, 78, 194));
        inputTarjetaDebito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTarjetaDebito.setText("0");
        inputTarjetaDebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputTarjetaDebitoKeyReleased(evt);
            }
        });
        jPanel2.add(inputTarjetaDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 158, 48));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tarjeta Debito");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 160, -1));

        txtCupones.setBackground(new java.awt.Color(255, 255, 255));
        txtCupones.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtCupones.setForeground(new java.awt.Color(57, 78, 194));
        txtCupones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCupones.setText("0");
        txtCupones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCuponesKeyReleased(evt);
            }
        });
        jPanel2.add(txtCupones, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 158, 48));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cupones");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 160, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cupon_0.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 70, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dinero_0.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 70, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarjeta_1.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 70, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarjeta_0.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 70, 50));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cliente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel15.setForeground(new java.awt.Color(57, 78, 194));
        jLabel15.setText("Publico en General");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cliente.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(57, 78, 194));
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

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cobranza");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 692, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cobrar();
    }//GEN-LAST:event_btnGuardarActionPerformed
    
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
    
    private void txtEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyReleased
        guardarDinero();
    }//GEN-LAST:event_txtEntradaKeyReleased

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

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mouseX,y-mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(ColorBtn);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void inputTarjetaCreditoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTarjetaCreditoKeyReleased
        guardarDinero();
    }//GEN-LAST:event_inputTarjetaCreditoKeyReleased

    private void inputTarjetaDebitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTarjetaDebitoKeyReleased
        guardarDinero();
    }//GEN-LAST:event_inputTarjetaDebitoKeyReleased

    private void txtCuponesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuponesKeyReleased
        guardarDinero();
    }//GEN-LAST:event_txtCuponesKeyReleased
    
    private void cobrar(){
        //comporbaremos que los datos si se pueden convertir a float
        try{
            float cobrar=Float.parseFloat(txtCobro.getText()); //el dinero a cobrar
            float dineroRecibido=Float.parseFloat(txtEntrada.getText()); //efectivo
            float tarjetaCredito=Float.parseFloat(inputTarjetaCredito.getText());
            float tarjetaDebito=Float.parseFloat(inputTarjetaDebito.getText());
            float cupones=Float.parseFloat(txtCupones.getText());
            
            float cambio=(dineroRecibido+tarjetaCredito+tarjetaDebito+cupones)-cobrar;
            
            //ver si el cambio es mayor al dinero que tengo en caja
            if(cambio<=dineroActual() && cambio>=0){
                this.setVisible(false);
                float dineroCaja=dineroActual()+cobrar;
                JF.actualizarDineroCaja(dineroCaja);
                new FrameComprarTicket(con,JF).setVisible(true); 
            }
            else{
                new FrameError(null,"No hay suficiente dinero en caja para el cambio").setVisible(true);
                //JOptionPane.showMessageDialog(this,"No hay suficiente dinero en caja para el cambio");
            }
        }catch(Exception e){
            new FrameError(null,"Uno de los datos esta mal escrito").setVisible(true);
            //JOptionPane.showMessageDialog(this,"Uno de los datos esta mal escrito");
        } 
    }
    
    private void guardarDinero() {
        try {
            float cobrar = Float.parseFloat(txtCobro.getText()); // el dinero a cobrar

            // Comprobar y asignar valores a las variables, o 0 si no son válidos
            float dineroRecibido = parseOrZero(txtEntrada.getText());
            float tarjetaCredito = parseOrZero(inputTarjetaCredito.getText());
            float tarjetaDebito = parseOrZero(inputTarjetaDebito.getText());
            float cupones = parseOrZero(txtCupones.getText());

            float cambio = (dineroRecibido + tarjetaCredito + tarjetaDebito + cupones) - cobrar;

            // Redondear a 2 cifras
            BigDecimal totalRounded = new BigDecimal(cambio).setScale(2, RoundingMode.HALF_UP);
            txtCambio.setText(totalRounded.toString());
        } catch (Exception e) {
            txtCambio.setText("Error");
        }
    }
    
    // Método auxiliar para convertir el texto a float, o devolver 0 si no es válido
    private float parseOrZero(String text) {
        try {
            return Float.parseFloat(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    private float dineroActual(){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rsBusqueda = sts.getResultSet();
            
            while (rsBusqueda.next()){
                float dinero=rsBusqueda.getFloat("dineroCaja");
                return dinero;
            }
            float dinero=rsBusqueda.getFloat("dineroCaja");
            return dinero;
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField inputTarjetaCredito;
    private javax.swing.JTextField inputTarjetaDebito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCobro;
    private javax.swing.JTextField txtCupones;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JLabel txtTotalTexto;
    // End of variables declaration//GEN-END:variables
}
