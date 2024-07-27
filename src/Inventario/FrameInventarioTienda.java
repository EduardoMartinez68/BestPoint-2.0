package Inventario;

import ClasesGlobales.Agregar;
import ClasesGlobales.Atajos;
import ClasesGlobales.Buscar;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import Notificaciones.MessageError;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javaswingdev.message.MessageDialog;
import javax.swing.ImageIcon;
import puntoventa.FrameInventario;

public class FrameInventarioTienda extends javax.swing.JFrame implements Runnable{
    Connection con;
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    Buscar search;
    private ActualizarTablaInventarioTienda obj;

    //variables de los datos 
    String nombre;
    String codigoBarras;
    String descripcion;
    float precio;
    String seVendePor;
    String departamento;
    int cantidad;
    
    String rutaImg;
    //detector de teclas 
    Atajos teclado=new Atajos();
    Thread h1;    
    
    int mouseX,mouseY;
    FrameInventario JF;
    public FrameInventarioTienda(Connection con,FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        initComponents();
        obj=new ActualizarTablaInventarioTienda(con);
        actualizarClases();
        actualizarTablaCarrito();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setTitle("Inventario de Tienda");
        //nodo de hora 
        h1=new Thread(this);
        h1.start();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtSeVendePor1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizarInventario = new javax.swing.JButton();
        txtNombreProducto1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrecioCosto1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDepartamento1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtExistencia1 = new javax.swing.JTextField();
        txtCodigoBarras = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombreProducto2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        txtSeVendePor2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        txtCodigoBarras2 = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();
        txtBarraBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        labelImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo de barras", "Producto", "Descripcion del producto", "Importe", "Se vende por", "Ubicacion", "Cantidad existente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 106, 760, 357));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ADMINISTRACION DE INVENTARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 84, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSeVendePor1.setEditable(false);

        jLabel6.setText("Se vende por");

        jLabel7.setText("Codigo de barra");

        jLabel8.setText("Nombre producto");

        btnActualizarInventario.setBackground(new java.awt.Color(57, 78, 194));
        btnActualizarInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizarInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnActualizarInventario.setText("Actualizar inventario");
        btnActualizarInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInventarioActionPerformed(evt);
            }
        });

        txtNombreProducto1.setEditable(false);

        jLabel12.setText("Precio Costo");

        txtPrecioCosto1.setEditable(false);

        jLabel13.setText("Departamento");

        txtDepartamento1.setEditable(false);

        jLabel14.setText("En existencia");

        txtCodigoBarras.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(48, 48, 48)
                            .addComponent(txtSeVendePor1))
                        .addComponent(txtDepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(49, 49, 49)
                            .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnActualizarInventario)
                                .addComponent(txtExistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSeVendePor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarInventario)
                .addGap(123, 123, 123))
        );

        jTabbedPane1.addTab("Editar inventario", jPanel3);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEliminar.setBackground(new java.awt.Color(245, 71, 71));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel11.setText("Codigo de barra");

        jLabel15.setText("Nombre producto");

        txtNombreProducto2.setEditable(false);

        jLabel16.setText("Precio Costo");

        txtPrecioCosto.setEditable(false);

        jLabel17.setText("Departamento");

        txtDepartamento.setEditable(false);

        txtSeVendePor2.setEditable(false);

        jLabel18.setText("En existencia");

        jLabel19.setText("Se vende por");

        txtExistencia.setEditable(false);

        txtCodigoBarras2.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel16))
                            .addGap(48, 48, 48)
                            .addComponent(txtSeVendePor2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel15))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreProducto2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(txtCodigoBarras2))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCodigoBarras2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeVendePor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar inventario", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, 290));

        btnBusqueda.setBackground(new java.awt.Color(57, 78, 194));
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnBusqueda.setText("Buscar");
        btnBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 120, 30));

        txtBarraBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarraBusquedaKeyReleased(evt);
            }
        });
        getContentPane().add(txtBarraBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 42, 290, 30));

        jLabel3.setText("Codigo de barras");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel7.setBackground(new java.awt.Color(57, 78, 194));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel7MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Inventario");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1013, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 30));

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgP.png"))); // NOI18N
        getContentPane().add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void run(){
        Thread ct=Thread.currentThread();
        while(h1==ct){
            
            //saber los atajos del teclado
            if(teclado.getPresionar()){
                txtBarraBusqueda.addKeyListener(teclado);
                abrirAtajos(teclado.getAtajo());
            }
            else{
                teclado.alarmaTecla(); //esto es para que no se abran muchas ventanas a la vez
            }
            
            try{
                Thread.sleep(1000); //el tiempo que va esperar para repetirse
            }catch(InterruptedException e){
                System.out.println("Error en el nudo");
                System.out.println(e);
                
            }
        }
    }
    
    private void actualizarClases(){
        this.add=new Agregar(con,this,JF);
        this.delete=new Eliminar(con);
        this.search=new Buscar(con);
    }    
    
    public void abrirAtajos(int atajo){
        switch(atajo){
            case 10:{ //ENTER
                buscarProducto();
                teclado.PresionarFalse();
                break;
            }
        }
    }
    
    private void btnActualizarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInventarioActionPerformed
        if(!txtCodigoBarras.getText().equals("")){
            actualizarProducto();
        }
    }//GEN-LAST:event_btnActualizarInventarioActionPerformed

    private void txtBarraBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarraBusquedaKeyReleased

    }//GEN-LAST:event_txtBarraBusquedaKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtCodigoBarras.getText().equals("")){
            //preguntar si quiere eliminar el producto
            MessageDialog ms=new MessageDialog(this);
            ms.showMessage("Eliminar productos","¿Quiere eliminar este producto?");
            if(ms.getMessageType()==MessageDialog.MessageType.OK){
                borrarProductoTabla();
                limpiarPantalla();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBusquedaActionPerformed

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

    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged

    }//GEN-LAST:event_jPanel7MouseDragged

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel7MousePressed
    
    private void limpiarPantalla(){
        txtCodigoBarras.setText("");
        txtCodigoBarras2.setText("");
        
        txtDepartamento.setText("");
        txtDepartamento1.setText("");
                
        txtExistencia.setText(""); 
        txtExistencia1.setText(""); 
        
        txtNombreProducto1.setText("");
        txtNombreProducto2.setText(""); 
        
        txtPrecioCosto.setText("");
        txtPrecioCosto1.setText("");
        
        txtSeVendePor1.setText("");
        txtSeVendePor2.setText("");
        
        //borrar los datos guardados
        nombre="";
        codigoBarras="";
        descripcion="";
        precio=0;
        seVendePor="";
        departamento="";
        cantidad=0;
        
        //eliminar imagen del producto
        String rutaProyecto=System.getProperty("user.dir");
        rutaImg=rutaProyecto+"\\src\\Img\\imgP.png";
        actualizarImgProducto();
    }
    
    private void actualizarProducto(){
        try{
            Statement sts=con.createStatement();
            String actualizar="update productos set cantidad = '"+txtExistencia1.getText()+"' where id = "+search.Id();
            sts.executeUpdate(actualizar); 
            actualizarTablaCarrito();
            new MessageCorrect(this,"El producto '"+nombre+"' fue actualizado",null);
        }catch(SQLException ex){
            new MessageError(this,"No se pudo actualizar el producto");
        }
    }
    
    private void borrarProductoTabla(){
        try{
            delete.eliminarProducto(search.Id());
            actualizarTablaCarrito();
            new MessageCorrect(this,"El producto '"+nombre+"' fue eliminado correctamente",null);
        }catch(SQLException ex){
            new MessageError(this,"No se pudo eliminar el producto");
        }
    }
    
    private void buscarProducto(){
        String codigoBarra=txtBarraBusqueda.getText();
        System.out.println(codigoBarra);
        if(search.buscarProducto(codigoBarra)){
            obtenerLosDatosDelProducto();
            buscarImgProducto();
        }
        else{
            //new FrameError(null,"El codigo de barras de existe").setVisible(true);
            new MessageError(this,"Este producto no existe");
        }
        
        txtBarraBusqueda.setText("");
    }
 
    private void actualizarImgProducto(){
        Image img=new ImageIcon(rutaImg).getImage();
        ImageIcon icono=new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(),Image.SCALE_SMOOTH ));
        labelImg.setIcon(icono);        
    }
    
    private void buscarImgProducto(){   
        //obtenemos la direcion de su imagen y cargamos la ruta 
        rutaImg=search.rutaImg();
        File archivo = new File(rutaImg);      
        //si no existe el archivo cargamos la imagen de muestra
        if (!archivo.exists()) {
            String rutaProyecto=System.getProperty("user.dir");
            rutaImg=rutaProyecto+"\\src\\Img\\imgP.png";
        }
        
        actualizarImgProducto();
    }
    
    private void obtenerLosDatosDelProducto(){
        try{
            nombre=search.Nombre();
            codigoBarras=search.CodigoBarra();
            descripcion=search.Descripcion();
            precio=search.Precio();
            seVendePor=search.SeVendePor();
            departamento=search.Ubicacion();
            cantidad=search.Existencia();
            actualizarDatos();
            
        }catch(SQLException ex){
        }
    }
    
    private void actualizarDatos(){
        txtCodigoBarras.setText(codigoBarras+"");
        txtCodigoBarras2.setText(codigoBarras+"");
        
        txtDepartamento.setText(departamento);
        txtDepartamento1.setText(departamento);
                
        txtExistencia.setText(cantidad+""); 
        txtExistencia1.setText(cantidad+""); 
        
        txtNombreProducto1.setText(nombre);
        txtNombreProducto2.setText(nombre); 
        
        txtPrecioCosto.setText(precio+"");
        txtPrecioCosto1.setText(precio+"");
        
        txtSeVendePor1.setText(seVendePor+"");
        txtSeVendePor2.setText(seVendePor+"");
    }
    
    //actualizar tablas
    public void actualizarTablaCarrito(){
        obj=new ActualizarTablaInventarioTienda(con);
        this.tableInventario.setModel(obj.getModelo());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarInventario;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelImg;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTable tableInventario;
    private javax.swing.JTextField txtBarraBusqueda;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtCodigoBarras2;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDepartamento1;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtExistencia1;
    private javax.swing.JTextField txtNombreProducto1;
    private javax.swing.JTextField txtNombreProducto2;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioCosto1;
    private javax.swing.JTextField txtSeVendePor1;
    private javax.swing.JTextField txtSeVendePor2;
    // End of variables declaration//GEN-END:variables
}
