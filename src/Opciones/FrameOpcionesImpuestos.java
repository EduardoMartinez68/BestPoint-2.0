package Opciones;

import ClasesGlobales.Agregar;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import puntoventa.FrameInventario;


public class FrameOpcionesImpuestos extends javax.swing.JFrame {

    Connection con;
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    int ubicacion=0;
    
    //variables info 
    int IncluiImpuestoAutomaticamente;
    int MisProductosManejanImpuestos;
    int esglosarImpuestosTicket;
    
    int mouseX,mouseY;
    FrameInventario JF;
    public FrameOpcionesImpuestos(Connection con,FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        initComponents();
        setIconImage(getIcono());
        actualizarVariables();
        actualizarInformacionImpuesto();
        leerBaseDatos();
        SpinnerPorcentaje.setValue(0);
        this.setSize(430, 580); //430
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
    
    private Image getIcono(){
        Image icono=Toolkit.getDefaultToolkit().getImage("icono.png");
        return icono;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckBoxDesglosarImpuestosTicket = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CheckBoxIncluiImpuestoAutomaticamente = new javax.swing.JCheckBox();
        btnAgregarImpuesto = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreImpuesto = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ComBoxImpuestos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        SpinnerPorcentaje = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        CheckBoxMisProductosManejanImpuestos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaImpuestos = new javax.swing.JTable();
        btnActualizarOpciones = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CheckBoxDesglosarImpuestosTicket.setText("Desglosar los impuestos en el ticket de venta.");
        getContentPane().add(CheckBoxDesglosarImpuestosTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Porcentaje");

        jLabel6.setText("%");

        CheckBoxIncluiImpuestoAutomaticamente.setText("incluir en nuevos productos automaticamente");

        btnAgregarImpuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarImpuesto.setText("Agregar nuevo impuestos");
        btnAgregarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImpuestoActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel3.setText("Nuevos impuestos");

        jLabel7.setText("Nombre impuesto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo impuesto", jPanel3);

        jLabel4.setText("Impuestos");

        ComBoxImpuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComBoxImpuestos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComBoxImpuestosItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel8.setText("Editar impuestos");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ComBoxImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComBoxImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Editar impuesto", jPanel4);

        SpinnerPorcentaje.setEditor(new javax.swing.JSpinner.NumberEditor(SpinnerPorcentaje, ""));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxIncluiImpuestoAutomaticamente)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SpinnerPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAgregarImpuesto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(SpinnerPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CheckBoxIncluiImpuestoAutomaticamente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarImpuesto)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("IMPUESTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        CheckBoxMisProductosManejanImpuestos.setText("Mis productos manejan impuestos (IVA, etc)");
        getContentPane().add(CheckBoxMisProductosManejanImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        TablaImpuestos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaImpuestos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 395, 111));

        btnActualizarOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizarOpciones.setText("Actualizar opciones de impuestos");
        btnActualizarOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarOpcionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

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
        jLabel17.setText("Impuestos");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImpuestoActionPerformed
        comprobarDondeSeGuardaraInformacion();
    }//GEN-LAST:event_btnAgregarImpuestoActionPerformed

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        ubicacion=jTabbedPane1.getSelectedIndex();
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void ComBoxImpuestosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComBoxImpuestosItemStateChanged
        //obtener nombre del combox 
        try{
            String impuesto=ComBoxImpuestos.getSelectedItem().toString();
            buscarImpuesto(impuesto);
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ComBoxImpuestosItemStateChanged

    private void btnActualizarOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarOpcionesActionPerformed
        actualizarOpciones();
    }//GEN-LAST:event_btnActualizarOpcionesActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i=JOptionPane.showConfirmDialog(this, "¿Quieres eliminar este impuesto?");
        if(i==0){
            eliminarImpuesto();
            actualizarInformacionImpuesto();
        }        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    
    private void eliminarImpuesto(){
        String impuesto=ComBoxImpuestos.getSelectedItem().toString();
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from iva");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                if(impuesto.equals(rs.getString("nombre"))){
                    int id=rs.getInt("id");
                    delete.eliminarImpuesto(id);
                    JOptionPane.showMessageDialog(this,"Impuesto eliminado");
                    break;
                }
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    private boolean comprobarExistenciaInformacion(){
        if(!txtNombreImpuesto.getText().equals("")){
            return true;
        }
        return false;
    }
    private void comprobarInfo(){
        if(comprobarExistenciaInformacion()){
            guardarImpuesto();
            actualizarInformacionImpuesto();
        }
        else{
            JOptionPane.showMessageDialog(this,"Faltan datos por llenar");
        }
    }    
    private void comprobarDondeSeGuardaraInformacion(){
        if(ubicacion==0){ //guardar nuevo impuesto
            comprobarInfo();
        }
        else{ //actualizar viejo impuesto
            guardarImpuesto2();
        }
    }
    private void guardarImpuesto2(){
        //obtener nombre del combox 
        try{
            obtenerInformacionPantalla();
            String impuesto=ComBoxImpuestos.getSelectedItem().toString();
            float porcentaje=(Integer) SpinnerPorcentaje.getValue();
            add.agregarIvas(impuesto, porcentaje,IncluiImpuestoAutomaticamente);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    private void guardarImpuesto(){
        obtenerInformacionPantalla();
        String nombre=txtNombreImpuesto.getText();
        float porcentaje=(Integer) SpinnerPorcentaje.getValue();
        add.agregarIvas(nombre, porcentaje,IncluiImpuestoAutomaticamente);
    }

    
    private void obtenerInformacionPantalla(){
        IncluiImpuestoAutomaticamente=comprobarCheck(CheckBoxIncluiImpuestoAutomaticamente.isSelected());
        MisProductosManejanImpuestos=comprobarCheck(CheckBoxMisProductosManejanImpuestos.isSelected());
        esglosarImpuestosTicket=comprobarCheck(CheckBoxDesglosarImpuestosTicket.isSelected());
    }
    
    private int comprobarCheck(boolean selecion){
        if(selecion){
            return 1;
        }
        return 0;
    }
    
    private void actualizarVariables(){
        this.add=new Agregar(con,this,JF);
        this.delete=new Eliminar(con);
        
        this.setResizable(false);
        this.setTitle("Configuraciones de impuestos");
    }
    
    private void actualizarInformacionImpuesto(){
        ComBoxImpuestos.removeAllItems();
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from iva");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String strID=rs.getString("nombre");
                ComBoxImpuestos.addItem(strID);
                SpinnerPorcentaje.setValue(rs.getInt("cantidad"));
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    private void buscarImpuesto(String impuesto){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from iva");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){        
                String nombre=rs.getString("nombre");
                if(impuesto.equals(nombre)){
                    float strID=rs.getFloat("cantidad");
                    int agregarAutomaticamente=rs.getInt("agregarautomaticamente");
                    SpinnerPorcentaje.setValue(strID);
                    
                    //saber si el impuesto se maneja con todos los productos
                    if(agregarAutomaticamente==1){
                        CheckBoxIncluiImpuestoAutomaticamente.setSelected(true);
                    }
                    else{
                        CheckBoxIncluiImpuestoAutomaticamente.setSelected(false);
                    }
                }
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    private void actualizarOpciones(){
        obtenerInformacionPantalla();
        try{
            String orden=" UPDATE `opciones` SET `misproductosmanejaniva` = '"+MisProductosManejanImpuestos+"', `imprimirlosimpuestosticket` = '"+esglosarImpuestosTicket +"' WHERE `opciones`.`id` = 0";
            Statement sts=con.createStatement();
            sts.executeUpdate(orden);
            JOptionPane.showMessageDialog(this,"Los cambios se han guardado con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Algo fallo al actualizar");
            System.out.println("Error "+e);
        }
    }
    
    private void leerBaseDatos(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from opciones");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                int misProductosManejanIva =rs.getInt("misproductosmanejaniva");
                if(misProductosManejanIva==1){
                    CheckBoxMisProductosManejanImpuestos.setSelected(true);
                }
                else{
                    CheckBoxMisProductosManejanImpuestos.setSelected(false);
                }
                
                int imprimirLosImpuestosTicket=rs.getInt("imprimirlosimpuestosticket");
                if(imprimirLosImpuestosTicket==1){
                    CheckBoxDesglosarImpuestosTicket.setSelected(true);
                }
                else{
                    CheckBoxDesglosarImpuestosTicket.setSelected(false);
                }          
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxDesglosarImpuestosTicket;
    private javax.swing.JCheckBox CheckBoxIncluiImpuestoAutomaticamente;
    private javax.swing.JCheckBox CheckBoxMisProductosManejanImpuestos;
    private javax.swing.JComboBox<String> ComBoxImpuestos;
    private javax.swing.JSpinner SpinnerPorcentaje;
    private javax.swing.JTable TablaImpuestos;
    private javax.swing.JButton btnActualizarOpciones;
    private javax.swing.JButton btnAgregarImpuesto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextField txtNombreImpuesto;
    // End of variables declaration//GEN-END:variables
}
