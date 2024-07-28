package Clientes;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import Notificaciones.MessageError;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaswingdev.message.MessageDialog;
import javax.swing.JOptionPane;
import puntoventa.FrameInventario;


public class FrameClientes extends javax.swing.JFrame {
    Connection con;
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    Buscar search;
    int mouseX,mouseY;
    
    private ActualizarTablaClientes obj;
    
    int idCliente=0;
    float deudaCliente=0;
    FrameInventario JF;
    public FrameClientes(Connection con, FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        initComponents();
        actualizarVariables();
        actualizarTabla();
        centrarPanel();
        this.setSize(910, 650);
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setTitle("Clientes");
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
     
    private void actualizarVariables(){
        add=new Agregar(con,this,JF);
        delete=new Eliminar(con);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javaswingdev.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        txtBuscar = new textfield.TextField();
        jPanel1 = new javax.swing.JPanel();
        materialTabbed1 = new tabbed.MaterialTabbed();
        jPanel2 = new javax.swing.JPanel();
        btnGuardarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNuevoDomicilio = new textfield.TextField();
        txtNuevoCredito = new textfield.TextField();
        txtNuevoTelefono = new textfield.TextField();
        txtNuevoCorreo = new textfield.TextField();
        txtNuevoNombre = new textfield.TextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtEditarNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEditarCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEditarDomicilio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtEditarCredito = new javax.swing.JTextField();
        txtEditarTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setBackground(new java.awt.Color(57, 78, 194));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 43, 130, 40));

        tablaClientes.setBackground(new java.awt.Color(255, 255, 255));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo de Barras", "Nombre", "Descripcion", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 410, 410));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ADMINISTRACION DE CLIENTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel8.setBackground(new java.awt.Color(57, 78, 194));
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
        jLabel17.setText("Clientes");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 795, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        txtBuscar.setLabelText("Buscar unl cliente por su nombre");
        txtBuscar.setLineColor(new java.awt.Color(22, 35, 105));
        txtBuscar.setSelectionColor(new java.awt.Color(22, 35, 105));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarCliente.setBackground(new java.awt.Color(57, 78, 194));
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnGuardarCliente.setText("Guardar nuevo cliente");
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 343, 180, 40));

        btnCancelar.setBackground(new java.awt.Color(219, 68, 83));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circulo-cruzado.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 180, 40));

        txtNuevoDomicilio.setLabelText("Direccion ");
        txtNuevoDomicilio.setLineColor(new java.awt.Color(22, 35, 105));
        txtNuevoDomicilio.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtNuevoDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 370, -1));

        txtNuevoCredito.setLabelText("Credito del cliente *");
        txtNuevoCredito.setLineColor(new java.awt.Color(22, 35, 105));
        txtNuevoCredito.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtNuevoCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 370, -1));

        txtNuevoTelefono.setLabelText("telefono");
        txtNuevoTelefono.setLineColor(new java.awt.Color(22, 35, 105));
        txtNuevoTelefono.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtNuevoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 370, -1));

        txtNuevoCorreo.setLabelText("Correo electronico");
        txtNuevoCorreo.setLineColor(new java.awt.Color(22, 35, 105));
        txtNuevoCorreo.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtNuevoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 370, -1));

        txtNuevoNombre.setLabelText("Nombre del cliente *");
        txtNuevoNombre.setLineColor(new java.awt.Color(22, 35, 105));
        txtNuevoNombre.setSelectionColor(new java.awt.Color(22, 35, 105));
        jPanel2.add(txtNuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, -1));

        materialTabbed1.addTab("Nuevo cliente", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Telefono");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 73, -1, -1));

        jLabel7.setText("Credito");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 42, -1, -1));

        jLabel8.setText("Nombre");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 8, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(57, 78, 194));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnActualizar.setText("Actualizar cliente");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 181, -1, 40));

        txtEditarNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtEditarNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtEditarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 209, -1));

        jLabel12.setText("Correo electronico");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 101, -1, -1));

        txtEditarCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtEditarCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtEditarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 209, -1));

        jLabel13.setText("Domicilio");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 129, -1, -1));

        txtEditarDomicilio.setBackground(new java.awt.Color(255, 255, 255));
        txtEditarDomicilio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtEditarDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 209, -1));

        btnEliminar.setBackground(new java.awt.Color(219, 68, 83));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 181, 124, 40));

        txtEditarCredito.setBackground(new java.awt.Color(255, 255, 255));
        txtEditarCredito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtEditarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 209, -1));

        txtEditarTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtEditarTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtEditarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, -1));

        materialTabbed1.addTab("Editar/Eliminar cliente", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 910, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        obtenerDatosBusqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarPantalla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        if(!txtNuevoNombre.getText().equals("") && conver.convertirStringFloat(txtNuevoCredito.getText())>=0){
            guardarCliente();              
        }
        else{
            new MessageError(this,"Faltan datos por llenar como el nombre o el credito que puede tener el cliente que son campos obligatorios");
        }        
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtEditarNombre.getText().equals("")){
            preguntarEliminacion();      
        }
        else{
            new MessageError(this,"No existe ningun dato a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(!txtEditarNombre.getText().equals("") && conver.convertirStringFloat(txtEditarCredito.getText())>=0){
             actualizarCliente();      
        }
        else{
            new MessageError(this,"Faltan datos por llenar como el nombre o el credito que puede tener el cliente que son campos obligatorios");
        } 
    }//GEN-LAST:event_btnActualizarActionPerformed

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

    private void jPanel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseDragged

    }//GEN-LAST:event_jPanel8MouseDragged

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel8MousePressed
    
    private void actualizarCliente(){
        String nombre=txtEditarNombre.getText();
        String direccion=txtEditarDomicilio.getText();
        String correo=txtEditarCorreo.getText();
        String telefono=txtEditarTelefono.getText();
        float credito=conver.convertirStringFloat(txtEditarCredito.getText());
        
        try{
            Statement sts=con.createStatement();
            String actualizar="UPDATE clientes SET nombre = '"+nombre+"', direccion = '"+direccion+"', correo = '"+correo+"',telefono = '"+telefono+"',credito = '"+credito+"' WHERE id = "+idCliente;
            sts.executeUpdate(actualizar);    
            new MessageCorrect(this,"El cliente se actualizo correctamente",null).setVisible(true);
        }catch(SQLException ex){
            System.out.println("No se pudo actualizar el cliente");
        }
        limpiarPantalla();
    }
    
    private void preguntarEliminacion(){
        if(deudaCliente>0){
            preguntarEliminarDeuda();
        }
        else{
            eliminarSinDeuda();
        }
    }
    
    private void preguntarEliminarDeuda(){
        //preguntar si quiere eliminar el cliente con deuda
        MessageDialog ms=new MessageDialog(this);
        ms.showMessage("Eliminar Cliente","¿Quiere eleminar al cliente '"+txtEditarNombre.getText()+"' ? \n"
                + "Este cliente tiene una deuda de: "+deudaCliente+" y si lo eliminas se borrara tambien su adeudo");
        if(ms.getMessageType()==MessageDialog.MessageType.OK){
            delete.eliminarCliente(idCliente);
            limpiarPantalla();
            new MessageCorrect(this,"Eliminaste al cliente correctamente",null);
        }
    }
    
    private void eliminarSinDeuda(){
        //preguntar si quiere eliminar el cliente
        MessageDialog ms=new MessageDialog(this);
        ms.showMessage("Eliminar Cliente","¿Quiere eleminar al cliente '"+txtEditarNombre.getText()+"' ? \n"
                + "Este cliente tiene una deuda de: "+deudaCliente+" y si lo eliminas se borrara tambien su adeudo");
        if(ms.getMessageType()==MessageDialog.MessageType.OK){
            delete.eliminarCliente(idCliente);
            limpiarPantalla();
            new MessageCorrect(this,"Eliminaste al cliente correctamente",null);
        }
    }
    
    private void obtenerDatosBusqueda(){
        String nombreBuscar=txtBuscar.getText();
        if(!nombreBuscar.equals("")){
            buscarCliente(nombreBuscar);
        }
        else{
            new MessageError(this,"Escribe un nombre valido").setVisible(true);
        }
    }
    
    private void buscarCliente(String nombreBuscar){
        boolean encontreCliente=false;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from clientes");
            ResultSet rs=sts.getResultSet();
            //pasar por todos los archivos
            while(rs.next()){
                //comprobar si existe 
                String nombre=rs.getString("nombre");
                if(nombreBuscar.equals(nombre)){
                    llenarDatosPantalla(rs);
                    encontreCliente=true;
                    break;
                }
            }
        }
        catch(SQLException ex){
            System.out.println("error al buscar al cliente");
            System.out.println(ex.getNextException());
        }
        txtBuscar.setText("");
        if(encontreCliente==false){
            new MessageError(this,"El usuario no fue encontrado").setVisible(true);
        }else{
            new MessageCorrect(this,"El usuario fue encontrado con exito",null).setVisible(true);       
        }
    }
    
    private void llenarDatosPantalla(ResultSet rs){
        try{
            idCliente=rs.getInt("id");
            deudaCliente=rs.getFloat("deuda");
            txtEditarNombre.setText(rs.getString("nombre"));
            txtEditarDomicilio.setText(rs.getString("direccion"));
            txtEditarTelefono.setText(rs.getString("telefono"));
            txtEditarCorreo.setText(rs.getString("correo"));
            txtEditarCredito.setText(rs.getString("credito")); 
        }
        catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
    }
    
    
    private void guardarCliente(){
        String nombre=txtNuevoNombre.getText();
        String direccion=txtNuevoDomicilio.getText();
        String correo=txtNuevoCorreo.getText();
        String telefono=txtNuevoTelefono.getText();
        float credito=conver.convertirStringFloat(txtNuevoCredito.getText());
        
        add.agregarCliente(nombre,direccion,correo,telefono,credito);
        limpiarPantalla();
        new MessageCorrect(this,"Cliente agregado con exito",null);
    }
    
    private void limpiarPantalla(){
        txtBuscar.setText("");
        txtNuevoNombre.setText("");
        txtNuevoDomicilio.setText("");
        txtNuevoCorreo.setText("");
        txtNuevoTelefono.setText("");
        txtNuevoCredito.setText("");

        txtEditarNombre.setText("");
        txtEditarDomicilio.setText("");
        txtEditarCorreo.setText("");
        txtEditarTelefono.setText("");
        txtEditarCredito.setText("");
        
        txtBuscar.setText("");
        
        actualizarTabla();
    }
    
    private void actualizarTabla(){
        obj=new ActualizarTablaClientes(con);
        this.tablaClientes.setModel(obj.getModelo());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelExit;
    private tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JPanel panelBtnExit;
    private javaswingdev.swing.table.Table tablaClientes;
    private textfield.TextField txtBuscar;
    private javax.swing.JTextField txtEditarCorreo;
    private javax.swing.JTextField txtEditarCredito;
    private javax.swing.JTextField txtEditarDomicilio;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEditarTelefono;
    private textfield.TextField txtNuevoCorreo;
    private textfield.TextField txtNuevoCredito;
    private textfield.TextField txtNuevoDomicilio;
    private textfield.TextField txtNuevoNombre;
    private textfield.TextField txtNuevoTelefono;
    // End of variables declaration//GEN-END:variables
}
