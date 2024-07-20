
package Cortes;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import puntoventa.FrameInisiarSecion;
import puntoventa.FrameInventario;

public class FrameCorte extends javax.swing.JFrame {
    Connection con;
    Agregar add;
    Eliminar delete;
    Buscar search;
    convertir conver=new convertir();
    FrameInventario JF;
    //datos 
    String turnoCajero;
    String nombreCajero;
    int mouseX,mouseY;
    public FrameCorte(Connection con,FrameInventario JF) {
        this.con=con;
        delete=new Eliminar(con);
        this.JF=JF;
        initComponents();
        panelCorte1.ingresarCon(con);
        actualizarDatosCajero();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setTitle("Corte de Cajero");
        centrarPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCorteCajero = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelCajero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        panelCorte1 = new Cortes.PanelCorte();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCorteCajero.setBackground(new java.awt.Color(22, 35, 105));
        btnCorteCajero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCorteCajero.setForeground(new java.awt.Color(255, 255, 255));
        btnCorteCajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tijeras.png"))); // NOI18N
        btnCorteCajero.setText("Hacer corte de cajero");
        btnCorteCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteCajeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCorteCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 54));

        jLabel2.setText("Corte de ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelCajero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCajero.setForeground(new java.awt.Color(51, 51, 255));
        labelCajero.setText("Cajero");
        jPanel1.add(labelCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setText("del");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        labelFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(51, 51, 255));
        labelFecha.setText("18/Jun/2013");
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 54, 103, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("$0.00");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 95, -1, -1));

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
        jLabel17.setText("Corte de caja");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 633, Short.MAX_VALUE)
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

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));
        getContentPane().add(panelCorte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

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
    
    private void btnCorteCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteCajeroActionPerformed
        int i=JOptionPane.showConfirmDialog(this, "¿Quieres hacer tu corte de caja?");
        if(i==0){
            imprimirCorte();
            this.setVisible(false);
            borrarCajero();
            cerrarSecion();
        }        
    }//GEN-LAST:event_btnCorteCajeroActionPerformed
    
    private void cerrarSecion(){
        JF.setVisible(false);
        new FrameInisiarSecion(con).setVisible(true);    
    }
    
    public void borrarCajero(){
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
    
    private void actualizarDatosCajero(){
        getTurno();
        labelFecha.setText(turnoCajero);  
        labelCajero.setText(nombreCajero);  
    }
    
    private void getTurno(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                turnoCajero=rs.getString("tiemporegistro");
                nombreCajero=rs.getString("nombrecajero");
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }    
    } 
    
    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimirCorte();
    }//GEN-LAST:event_btnImprimirActionPerformed

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

    private void jPanel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseDragged

    }//GEN-LAST:event_jPanel8MouseDragged

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel8MousePressed
    
    private void imprimirCorte(){
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(panelCorte1);
        //comprobar si se puede imprimir
        if(job.printDialog()){
            try{
                job.print();
                new FrameCorrecto(JF,"Se imprimio el reporte correctamente").setVisible(true);
            }catch(PrinterException ex){
                new FrameError(JF,"Algo fallo al imprimir").setVisible(true);
            }
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorteCajero;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelCajero;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JPanel panelBtnExit;
    private Cortes.PanelCorte panelCorte1;
    // End of variables declaration//GEN-END:variables
}
