package Emails;

import java.awt.Color;
import ClasesGlobales.Mail;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import puntoventa.FrameInventario;

public class FrameCorreo extends javax.swing.JFrame {
    int mouseX,mouseY;
    Color colorBtnHover=new Color(46,69,209);
    Color ColorBtn=new Color(22,35,105);
    Connection con;
    FrameInventario JF;
    public FrameCorreo(Connection con,FrameInventario JF) {
        this.JF=JF;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.con=con;
        txtCorreo.setForeground(Color.gray);
        txtAsunto.setForeground(Color.gray);
        txtMensaje.setForeground(Color.gray);
        this.setSize(648, 500);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnEnviar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CheckBoxEnviarTodos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(22, 35, 105));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Emails");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(238, 238, 238));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setText("Correo electronico");
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });

        jLabel6.setText("Asunto");

        txtAsunto.setBackground(new java.awt.Color(238, 238, 238));
        txtAsunto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAsunto.setText("Asunto");
        txtAsunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAsuntoMousePressed(evt);
            }
        });

        jLabel7.setText("Mensaje");

        txtMensaje.setBackground(new java.awt.Color(238, 238, 238));
        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        txtMensaje.setText("Escribe un mensaje...");
        txtMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMensajeMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtMensaje);

        btnEnviar.setBackground(new java.awt.Color(22, 35, 105));
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEnviarMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/enviar.png"))); // NOI18N
        jLabel1.setText("Enviar");

        javax.swing.GroupLayout btnEnviarLayout = new javax.swing.GroupLayout(btnEnviar);
        btnEnviar.setLayout(btnEnviarLayout);
        btnEnviarLayout.setHorizontalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnviarLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );
        btnEnviarLayout.setVerticalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnviarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        CheckBoxEnviarTodos.setText("Enviarle el mensaje a todos mis contactos");
        CheckBoxEnviarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxEnviarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                            .addComponent(txtCorreo)
                            .addComponent(txtAsunto)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckBoxEnviarTodos)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxEnviarTodos)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 648, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged

    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if(txtCorreo.getText().equals("Correo electronico")){
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }

        if(txtAsunto.getText().equals("Asunto") || txtAsunto.getText().equals("")){
            txtAsunto.setForeground(Color.gray);
            txtAsunto.setText("Asunto");
        }

        if(txtMensaje.getText().equals("Escribe un mensaje...") || txtMensaje.getText().equals("")){
            txtMensaje.setForeground(Color.gray);
            txtMensaje.setText("Escribe un mensaje...");
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtAsuntoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAsuntoMousePressed
        if(txtAsunto.getText().equals("Asunto")){
            txtAsunto.setText("");
            txtAsunto.setForeground(Color.black);
        }

        if(txtCorreo.getText().equals("Correo electronico") || txtCorreo.getText().equals("")){
            txtCorreo.setForeground(Color.gray);
            txtCorreo.setText("Correo electronico");
        }

        if(txtMensaje.getText().equals("Escribe un mensaje...") || txtMensaje.getText().equals("")){
            txtMensaje.setForeground(Color.gray);
            txtMensaje.setText("Escribe un mensaje...");
        }
    }//GEN-LAST:event_txtAsuntoMousePressed

    private void txtMensajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMensajeMousePressed
        if(txtMensaje.getText().equals("Escribe un mensaje...")){
            txtMensaje.setText("");
            txtMensaje.setForeground(Color.black);
        }

        if(txtCorreo.getText().equals("Correo electronico") || txtCorreo.getText().equals("")){
            txtCorreo.setForeground(Color.gray);
            txtCorreo.setText("Correo electronico");
        }

        if(txtAsunto.getText().equals("Asunto") || txtAsunto.getText().equals("")){
            txtAsunto.setForeground(Color.gray);
            txtAsunto.setText("Asunto");
        }
    }//GEN-LAST:event_txtMensajeMousePressed

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(ColorBtn);
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMousePressed
        String asunto=txtAsunto.getText();
        String mensaje=txtMensaje.getText();      
        
        if(CheckBoxEnviarTodos.isSelected()){
            enviarATodosElCorreo(asunto,mensaje);
        }
        else{ //enviar el correo a una sola persona
            String destinatario=txtCorreo.getText();
            Mail msj=new Mail(JF,destinatario,asunto,mensaje); 
            
            //enviamos el correo y comprovamos si lo hizo
            if(msj.enviar()){
                new FrameCorrecto(JF,"correo enviado con exito").setVisible(true);
            }
            else{
                new FrameError(JF,"Lo sentimos pero el correo no pudo enviarse");
            }
        }
    }//GEN-LAST:event_btnEnviarMousePressed
    
    private void enviarATodosElCorreo(String asunto,String mensaje){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from clientes");
            ResultSet rs=sts.getResultSet();
            
            //enviar un correo a todos los clientes
            while(rs.next()){
                String destinatario=rs.getString("correo");
                if(destinatario!=null){
                    Mail msj=new Mail(JF,destinatario, asunto, mensaje);
                    msj.enviar();
                }
            }
            
            //mensaje de correo enviado
            new FrameCorrecto(JF,"correo enviado con exito").setVisible(true);
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }        
    }
    
    private void CheckBoxEnviarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxEnviarTodosActionPerformed
        txtCorreo.setEditable(!CheckBoxEnviarTodos.isSelected());
    }//GEN-LAST:event_CheckBoxEnviarTodosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxEnviarTodos;
    private javax.swing.JPanel btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
