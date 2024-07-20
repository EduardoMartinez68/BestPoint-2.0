package Notificaciones;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import puntoventa.FrameInventario;

public class FrameCorrecto extends javax.swing.JDialog {
    int mouseX,mouseY;
    Color colorBtnHover=new Color(46,69,209);
    Color ColorBtn=new Color(22,35,105);
    FrameInventario JF;
    public FrameCorrecto(FrameInventario JF,String mensaje) {
        this.JF=JF;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        actualizarTexto(mensaje);
        centrarPanel();
        this.setVisible(false);
        this.dispose();
        new MessageCorrect(JF,mensaje,JF).setVisible(true);
    }
    
    private void centrarPanel(){
        //si existe un JF centrame 
        if(JF!=null){
            int w=JF.getWidth()/2;
            int h=JF.getHeight()/2;
            int x=JF.getX();
            int y=JF.getY();

            int myW=this.getWidth()/2;
            int myH=this.getHeight()/2;
            this.setLocation(x+w-myW,y+h-myH);
            JF.encenderWallpaper();
        }
        else{
            //ponerme en la posicion del mouse 
            Point punto=MouseInfo.getPointerInfo().getLocation();
            int Mx=punto.x;
            int My=punto.y;
            int sizeX=this.getWidth()/2;
            int sizeY=this.getHeight()/2;
            this.setLocation(Mx-sizeX,My-sizeY);           
        }
    }   
    
    private void actualizarTexto(String mensaje){
        /*
        txtMensaje.setText(mensaje);
        txtMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        
        //obtener dimensiones
        int widthMit=this.getWidth()/2;
        //centrar el btn
        int btnX=widthMit-(btnEnviar.getWidth()/2);
        int btnY=btnEnviar.getY();
        btnEnviar.setLocation(btnX,btnY);    */    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        background1 = new javaswingdev.message.Background();
        cmdCancel = new javaswingdev.swing.ButtonCustom();
        cmdOK = new javaswingdev.swing.ButtonCustom();
        lbIcon = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        txt = new javax.swing.JTextPane();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setUndecorated(true);

        background1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        cmdCancel.setBackground(new java.awt.Color(245, 71, 71));
        cmdCancel.setText("Cancel");
        cmdCancel.setColorHover(new java.awt.Color(255, 74, 74));
        cmdCancel.setColorPressed(new java.awt.Color(235, 61, 61));
        cmdCancel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });

        cmdOK.setText("OK");
        cmdOK.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cmdOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOKActionPerformed(evt);
            }
        });

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaswingdev/message/icon.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(245, 71, 71));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Message Title");

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(76, 76, 76));
        txt.setText("Message Text\nSimple");
        txt.setFocusable(false);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(cmdCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(cmdOK, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed

    }//GEN-LAST:event_cmdCancelActionPerformed

    private void cmdOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOKActionPerformed

    }//GEN-LAST:event_cmdOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.message.Background background1;
    private javaswingdev.swing.ButtonCustom cmdCancel;
    private javaswingdev.swing.ButtonCustom cmdOK;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextPane txt;
    // End of variables declaration//GEN-END:variables
}
