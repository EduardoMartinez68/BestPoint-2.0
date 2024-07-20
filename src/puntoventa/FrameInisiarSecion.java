package puntoventa;

import ClasesGlobales.Agregar;
import ClasesGlobales.Atajos;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import Notificaciones.MessageError;
import com.raven.main.Main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FrameInisiarSecion extends javax.swing.JFrame implements Runnable{
    Connection con;
    convertir conver=new convertir();
    String turnoCajero;
    
    //hora 
    Thread h1;    
    //detector de teclas 
    Atajos teclado=new Atajos();
    
    
    int mouseX;
    int mouseY;
    public FrameInisiarSecion(Connection con){
        this.con=con;
        this.setResizable(false);
        this.setTitle("Inisiar secion");
        initComponents();
        borrarCaja();
        txtPasword.setForeground(Color.BLACK);
        txtUsuario.setForeground(Color.BLACK);
        txtDinero.setForeground(Color.BLACK);
        txtRecuperarCorreo.setForeground(new Color(22,35,105));
        //icono de la imagen
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        jPanel2.setBackground(new Color(0,0,0,0));
        //nodo de hora 
        h1=new Thread(this);
        h1.start();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int anchoPantalla = (int) screenSize.getWidth();
        int altoPantalla = (int) screenSize.getHeight();

    }
    public void run(){
        Thread ct=Thread.currentThread();
        while(h1==ct){           
            //saber los atajos del teclado
            if(teclado.getPresionar()){
                txtPasword.addKeyListener(teclado);
                abrirAtajos(teclado.getAtajo());
            }
            else{
                teclado.alarmaTecla(); //esto es para que no se abran muchas ventanas a la vez
            }
            
            try{
                Thread.sleep(500); //el tiempo que va esperar para repetirse
            }catch(InterruptedException e){
                System.out.println("Error en el nudo");
                System.out.println(e);
                
            }
        }
        
    }
    
    public void abrirAtajos(int atajo){
        switch(atajo){
            case 10:{ //ENTER
                teclado.PresionarFalse();
                ingresarSecion();
                break;
            }
            case 27:{ //ESCAPE
                break;
            }
            default:{
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        materialTabbed1 = new tabbed.MaterialTabbed();
        jPanel6 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new textfield.TextField();
        txtPasword = new textfield.PasswordField();
        jPanel7 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDinero = new textfield.TextField();
        jPanel2 = new javax.swing.JPanel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRecuperarCorreo = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(57, 78, 194));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/User_icon_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel6)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 480));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnIngresar.setBackground(new java.awt.Color(57, 78, 194));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtUsuario.setLabelText("Ingresa nombre de usuario");
        txtUsuario.setLineColor(new java.awt.Color(22, 35, 105));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtPasword.setLabelText("Ingresa tu contraseña ");
        txtPasword.setLineColor(new java.awt.Color(22, 35, 105));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPasword, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Inisiar sesion", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setText("Esta informacion servira para despues reportarla en el reporte y el corte del cajero.");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel7.setText("Este es el dinero que estara en la caja al iniciar el turno del cajero.");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        txtDinero.setLabelText("Dinero Inicial");
        txtDinero.setLineColor(new java.awt.Color(22, 35, 105));
        txtDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDineroActionPerformed(evt);
            }
        });
        jPanel7.add(txtDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 480, -1));

        materialTabbed1.addTab("Dinero en caja", jPanel7);

        jPanel1.add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 530, 260));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBtnExit.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelBtnExitLayout.setVerticalGroup(
            panelBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnExitLayout.createSequentialGroup()
                .addComponent(labelExit)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.add(panelBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¡Bienvenido de vuelta!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ENTRADA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setText("No es magia, es el futuro");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        txtRecuperarCorreo.setForeground(new java.awt.Color(0, 51, 255));
        txtRecuperarCorreo.setText("¿No recuerdas tu contraseña?");
        txtRecuperarCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRecuperarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRecuperarCorreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtRecuperarCorreoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRecuperarCorreoMousePressed(evt);
            }
        });
        jPanel1.add(txtRecuperarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 210, -1));

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ingresarSecion();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mouseX,y-mouseY);
        System.out.println(mouseX);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        panelBtnExit.setBackground(Color.RED);
        labelExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        panelBtnExit.setBackground(new Color(255,255,255));
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new Color(34,117,226));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new Color(57,78,194));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void txtRecuperarCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecuperarCorreoMouseEntered
        txtRecuperarCorreo.setForeground(new Color(46,69,209));
    }//GEN-LAST:event_txtRecuperarCorreoMouseEntered

    private void txtRecuperarCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecuperarCorreoMouseExited
        txtRecuperarCorreo.setForeground(new Color(22,35,105));
    }//GEN-LAST:event_txtRecuperarCorreoMouseExited

    private void txtRecuperarCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecuperarCorreoMousePressed
        new FrameRecuperarPassword(con).setVisible(true);
    }//GEN-LAST:event_txtRecuperarCorreoMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDineroActionPerformed
    
    private void ingresarSecion(){
        String usuario=txtUsuario.getText();
        String password=txtPasword.getText();
        if(comprobarSiExisteUsuario(usuario,password)){
            guardarDatosEnCaja(usuario);
            //new Main(con,usuario).setVisible(true);
            new FrameInventario(con,usuario).setVisible(true);
            this.dispose();
        }
        else{
            //new Main(con,usuario).setVisible(true);
            //new FrameInventario(con,usuario).setVisible(true);
            //this.dispose();
            MessageError ms=new MessageError(this,"Usuario o contraseña invalida");
            //o.showMessage(usuario, password);
            //new FrameError(null,"Usuario o contraseña incorrecta").setVisible(true);
        }
    }
    
    private void guardarDatosEnCaja(String usuario){
        Agregar add=new Agregar(con,this,null);
        
        float dineroCaja=conver.convertirStringFloat(txtDinero.getText());
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss"); //obtenemos el horario
        
        //formateamos la fecha a string
        String tiempoRegistro=dtf.format(LocalDateTime.now()).toString();
        add.agregarCaja(usuario,tiempoRegistro,turnoCajero, dineroCaja, 0);
    }
    
    private boolean comprobarSiExisteUsuario(String usuario,String password){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from cajeros");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                if (rs.getString("usuario").equals(usuario) && rs.getString("password").equals(password)){
                    turnoCajero=rs.getString("turno");
                    return true;
                }
            }
            
            return false;
        }catch(SQLException ex){
            System.out.println(ex);
            return false;
        } 
    }
    
    private void borrarCaja(){
        Eliminar delete=new Eliminar(con);
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String strID=rs.getString("id");
                int id=conver.convertirStringInt(strID);
                delete.eliminarCaja(id);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelExit;
    private tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JPanel panelBtnExit;
    private textfield.TextField txtDinero;
    private textfield.PasswordField txtPasword;
    private javax.swing.JLabel txtRecuperarCorreo;
    private textfield.TextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
