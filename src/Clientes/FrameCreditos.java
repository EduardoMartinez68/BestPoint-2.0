package Clientes;

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
import java.util.Calendar;
import java.util.Date;
import puntoventa.BuscarCarrito;
import puntoventa.FrameInventario;
	
import java.util.GregorianCalendar;

public class FrameCreditos extends javax.swing.JFrame {
    Connection con;
    Agregar add;
    Eliminar delete;
    convertir conver=new convertir();
    
    FrameInventario JF;
    
    int idCliente=0;
    float creditoClienteActual=0;
    float deudaClienteActual=0;
    float totalCarrito=0;
    int mouseX,mouseY;
    
    //colores 
    Color colorBtnFondo=new Color(22,35,105);
    Color colorBtnFondoHover=new Color(46,69,209);
    
    //fechas 
    Calendar calendario = Calendar.getInstance();
    Date fechaActual=calendario.getTime();
    
    public FrameCreditos(Connection con,FrameInventario JF) {
        this.con=con;
        add=new Agregar(con,this,JF);
        delete=new Eliminar(con);
        this.JF=JF;
        
        initComponents();
        panelCreditoCliente1.iniciarConexion(this.con);
        llenarComboBoxCliente();
        calcularTotalCarrito();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setTitle("Credito de clientes");
        this.setSize(1200, 639);
        centrarPanel();
        txtFechaInicial.setText(fechaActual+"");
        txtFechaInicial.setEditable(false);
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

        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDeudaActual = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLimiteCredito = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        btnLiquidarDeuda = new javax.swing.JButton();
        btnAgregarCredito = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelCreditoCliente1 = new Clientes.PanelCreditoCliente();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFechaInicial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFechaFinal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jPasswordField1.setText("jPasswordField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        ComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("ESTADO DE CUENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreCliente.setText("Nombre Cliente");
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Saldo actual");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 154, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("$");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 147, -1, -1));

        txtDeudaActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDeudaActual.setText("0.00");
        getContentPane().add(txtDeudaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 147, -1, -1));

        jLabel9.setText("Limite de credito:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("$");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        txtLimiteCredito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLimiteCredito.setText("0.00");
        getContentPane().add(txtLimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jPanel2.setBackground(new java.awt.Color(22, 35, 105));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImprimir.setBackground(new java.awt.Color(22, 35, 105));
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir Edo. Cuenta completa");
        btnImprimir.setBorder(null);
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImprimirMouseExited(evt);
            }
        });
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnLiquidarDeuda.setBackground(new java.awt.Color(22, 35, 105));
        btnLiquidarDeuda.setForeground(new java.awt.Color(255, 255, 255));
        btnLiquidarDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usd-circulo.png"))); // NOI18N
        btnLiquidarDeuda.setText("Liquidar adeudo");
        btnLiquidarDeuda.setBorder(null);
        btnLiquidarDeuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLiquidarDeudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLiquidarDeudaMouseExited(evt);
            }
        });
        btnLiquidarDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiquidarDeudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLiquidarDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLiquidarDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 390, -1));

        btnAgregarCredito.setBackground(new java.awt.Color(22, 35, 105));
        btnAgregarCredito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarCredito.setText("Agregar un nuevo credito");
        btnAgregarCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCreditoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCreditoMouseExited(evt);
            }
        });
        btnAgregarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 240, 40));

        btnBuscar.setBackground(new java.awt.Color(22, 35, 105));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel4.setText("Al agregar un nuevo credito a un cliente ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, -1, -1));

        jLabel8.setText("el carrito de compras se vaciara y los");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, -1));

        jLabel11.setText("productos que existan en el se agregaran");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, -1, -1));

        jLabel12.setText("a la deuda del cliente marcado");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Nota:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, -1, -1));

        jScrollPane3.setViewportView(panelCreditoCliente1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

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
        jLabel17.setText("Credito de clientes");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1001, Short.MAX_VALUE)
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

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jLabel1.setText("Fecha inicial");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel14.setText("Dias de prologa");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        txtFechaInicial.setText("00/00/0000");
        getContentPane().add(txtFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 90, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        txtFechaFinal.setText("0");
        getContentPane().add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 90, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void calcularTotalCarrito(){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from carritocompras where numcarrito = "+JF.getNumCarrito());
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                totalCarrito+=rs.getFloat("total");  
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }          
    }
    
    private void llenarComboBoxCliente(){
        ComboBoxCliente.removeAllItems();
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from clientes");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                String cliente=rs.getString("nombre");
                ComboBoxCliente.addItem(cliente);
            }
        }catch(SQLException ex){
        } 
    }
    
    private void buscarDatosDeuda(){
        String cliente=ComboBoxCliente.getSelectedItem().toString();
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from clientes");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                String producto=rs.getString("nombre");
                if(producto.equals(cliente)){
                    txtNombreCliente.setText(cliente);
                    creditoClienteActual=rs.getFloat("credito");
                    deudaClienteActual=rs.getFloat("deuda");
                    idCliente=rs.getInt("id");
                    actualizarDatosDeuda();
                    break;
                }
            }
        }catch(SQLException ex){
        } 
    }
    
    private void actualizarDatosDeuda(){
        txtDeudaActual.setText(deudaClienteActual+"");
        txtLimiteCredito.setText(creditoClienteActual+"");
    }
    
    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(panelCreditoCliente1);
        //comprobar si se puede imprimir
        if(job.printDialog()){
            try{
                job.print();
                new FrameCorrecto(null,"nta de cliente impresa con exito").setVisible(true);
            }catch(PrinterException ex){
                new FrameError(null,"Algo fallo al imprimir la deuda del cliente").setVisible(true);
            }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAgregarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCreditoActionPerformed
        if(comprobarSiPuedoEndeudarme()){
            agregarNuevoCredito();
        }
        else{
            new FrameError(null,"Este cliente ya no puede recibir esta deuda").setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarCreditoActionPerformed

    private void btnLiquidarDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiquidarDeudaActionPerformed
        new FramePagarDeuda(con,deudaClienteActual,idCliente,this,JF).setVisible(true);
    }//GEN-LAST:event_btnLiquidarDeudaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        actualizarDatosPantalla();
    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void btnAgregarCreditoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCreditoMouseEntered
        btnAgregarCredito.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnAgregarCreditoMouseEntered

    private void btnAgregarCreditoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCreditoMouseExited
        btnAgregarCredito.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnAgregarCreditoMouseExited

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        btnImprimir.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnImprimirMouseEntered

    private void btnImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseExited
        btnImprimir.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnImprimirMouseExited

    private void btnLiquidarDeudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiquidarDeudaMouseEntered
        btnLiquidarDeuda.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnLiquidarDeudaMouseEntered

    private void btnLiquidarDeudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiquidarDeudaMouseExited
        btnLiquidarDeuda.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnLiquidarDeudaMouseExited
    
    public void actualizarDatosPantalla(){
        buscarDatosDeuda();
        panelCreditoCliente1.actualizarInformacion(txtNombreCliente.getText()+"",deudaClienteActual+"");    
    }
    
    private boolean registrarCompras(){
        try{
            Statement sts=con.createStatement();
            int numCarrito=JF.getNumCarrito();
            sts.execute("Select * from carritocompras where numcarrito = "+numCarrito);
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                int idProducto=rs.getInt("idproducto");
                Buscar bs=new Buscar(con);
                bs.buscarProductoId(idProducto);
                String codigoBarras=bs.CodigoBarra();
                
                //buscar datos del producto 
                BuscarCarrito bc=new BuscarCarrito(con);
                bc.buscarProducto(codigoBarras, numCarrito);
                String producto=bc.Nombre();
                float precio=bc.Precio();
                int cantidadEnCarrito=bc.Cantidad();
                float total=bc.Total();
                
                add.agregarDeudaCliente(txtNombreCliente.getText(),producto,codigoBarras,precio,cantidadEnCarrito,total);  
            }
            
            return true;
        }catch(SQLException ex){
            return false;
        }        
    }    
    
    private boolean comprobarSiPuedoEndeudarme(){
        float creditoRestante=creditoClienteActual-deudaClienteActual;
        float creditoConNuevaDeuda=creditoRestante-totalCarrito;
        if(creditoConNuevaDeuda>=0){
            //actualizar el credito del hombre 
            float nuevaDeuda=totalCarrito+deudaClienteActual;
            actualizarDeuda(nuevaDeuda);
            return true;
        }
        else{
            return false;
        }
    }
    
    private void actualizarDeuda(float deuda){
        try{
            Statement sts=con.createStatement();
            String actualizar="UPDATE clientes SET deuda = '"+deuda+"' WHERE id = "+idCliente;
            //UPDATE `clientes` SET `deuda` = '1.13' WHERE `clientes`.`id` = 2; 
            sts.executeUpdate(actualizar);    
            new FrameCorrecto(JF,"El cliente se actualizo correctamente").setVisible(true);
        }catch(SQLException ex){
            System.out.println("No se pudo actualizar el cliente");
        }    
    }
    
    private void agregarNuevoCredito(){
       if(registrarCompras()){
            comprarDesdePrimeraInterfaz();
       }
    }
    
    private void comprarDesdePrimeraInterfaz(){
        //obtener las fechas
        int num=conver.convertirStringInt(txtFechaFinal.getText());
        calendario.roll(Calendar.DATE, num);
        Date fechaFinal=calendario.getTime();

        //apagar ventana
        this.dispose();
        JF.registrarCompras("Efectivo");
        JF.borrarTabla();
        new FrameCorrecto(JF,"Compras realizadas con exito").setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCliente;
    private javax.swing.JButton btnAgregarCredito;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLiquidarDeuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private Clientes.PanelCreditoCliente panelCreditoCliente1;
    private javax.swing.JLabel txtDeudaActual;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicial;
    private javax.swing.JLabel txtLimiteCredito;
    private javax.swing.JLabel txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
