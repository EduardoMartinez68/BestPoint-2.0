package Productos;

import Inventario.ActualizarTablaInventarioTienda;
import Notificaciones.MessageError;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import puntoventa.FrameInventario;

public class FrameTablaProductos extends javax.swing.JFrame {

    Connection con;
    FrameInventario JF;
    private ActualizarTablaInventarioTienda obj;
    
    Color colorBtnHover=new Color(46,69,209);
    Color ColorBtn=new Color(57,78,194);
    
    Color colorBtnFondo=new Color(57,78,194);
    Color colorBtnFondoHover=new Color(41,57,137);
    
    int mouseX;
    int mouseY;
    
    public FrameTablaProductos(Connection con, FrameInventario JF) {
        this.con=con;
        this.JF=JF;
  
        obj=new ActualizarTablaInventarioTienda(con);
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setResizable(false);
        this.setTitle("Tabla de Productos");
        initComponents();
        actualizarTablaCarrito();
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
    
    //actualizar tablas
    public void actualizarTablaCarrito(){
        obj=new ActualizarTablaInventarioTienda(con);
        this.tableInventario.setModel(obj.getModelo());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInventario = new javaswingdev.swing.table.Table();
        codigoBarrasBuscar = new textfield.TextField();
        btnGuardarProducto = new javax.swing.JButton();
        btnEliminar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDepartamentos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(57, 78, 194));
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
        jLabel17.setText("Productos");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        tableInventario.setBackground(new java.awt.Color(255, 255, 255));
        tableInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableInventario);

        codigoBarrasBuscar.setLabelText("Busca un producto por su codigo de barras");
        codigoBarrasBuscar.setLineColor(new java.awt.Color(22, 35, 105));
        codigoBarrasBuscar.setSelectionColor(new java.awt.Color(22, 35, 105));

        btnGuardarProducto.setBackground(new java.awt.Color(57, 78, 194));
        btnGuardarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnGuardarProducto.setText("Buscar");
        btnGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarProductoMouseExited(evt);
            }
        });
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(57, 78, 194));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setPreferredSize(new java.awt.Dimension(390, 46));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/documento-firmado.png"))); // NOI18N
        jLabel2.setText("Actualizar productos");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnDepartamentos.setBackground(new java.awt.Color(57, 78, 194));
        btnDepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDepartamentos.setPreferredSize(new java.awt.Dimension(390, 46));
        btnDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepartamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepartamentosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDepartamentosMousePressed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lineas-de-calendario.png"))); // NOI18N
        jLabel18.setText("Departamentos de Productos");

        javax.swing.GroupLayout btnDepartamentosLayout = new javax.swing.GroupLayout(btnDepartamentos);
        btnDepartamentos.setLayout(btnDepartamentosLayout);
        btnDepartamentosLayout.setHorizontalGroup(
            btnDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnDepartamentosLayout.setVerticalGroup(
            btnDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDepartamentosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnAgregar.setBackground(new java.awt.Color(57, 78, 194));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setPreferredSize(new java.awt.Dimension(390, 46));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        jLabel19.setText("Agregar un nuevo producto");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigoBarrasBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDepartamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigoBarrasBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        panelBtnExit.setBackground(new Color(57,78,194));
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged

    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void btnGuardarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProductoMouseEntered
        btnGuardarProducto.setBackground(colorBtnHover);
    }//GEN-LAST:event_btnGuardarProductoMouseEntered

    private void btnGuardarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProductoMouseExited
        btnGuardarProducto.setBackground(ColorBtn);
    }//GEN-LAST:event_btnGuardarProductoMouseExited

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        //creamos la interfaz de edicion de productos 
        FrameActualizarProductos frameActualizarProductos=new FrameActualizarProductos(con,JF);
        
        //esta funcion sirve para buscar si existe un producto con este codigo de barras. Si no existe lo dices
        if(!frameActualizarProductos.buscarProducto(codigoBarrasBuscar.getText())){
            codigoBarrasBuscar.setText("");
            frameActualizarProductos.dispose(); //destruimos la interfaz que creamos
            new MessageError(this,"El producto no fue encontrado"); //mostramos mensaje de error
        }else{
            //si existe un producto en la base de datos, mostraremos los datos en pantalla y ocultaremos esta interfaz
            frameActualizarProductos.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(colorBtnFondoHover);
        //jLabel2.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(colorBtnFondo);
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        this.dispose();
        new FrameActualizarProductos(con,JF).setVisible(true);
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnDepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentosMouseEntered
        btnDepartamentos.setBackground(colorBtnFondoHover);
        //jLabel18.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnDepartamentosMouseEntered

    private void btnDepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentosMouseExited
        btnDepartamentos.setBackground(colorBtnFondo);
        jLabel18.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnDepartamentosMouseExited

    private void btnDepartamentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentosMousePressed
        new FrameDepartamento(con,JF).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDepartamentosMousePressed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(colorBtnFondoHover);
        //jLabel19.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(colorBtnFondo);
        jLabel19.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
       this.dispose();
       new FrameProductos(con,JF).setVisible(true);
    }//GEN-LAST:event_btnAgregarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnDepartamentos;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JButton btnGuardarProducto;
    private textfield.TextField codigoBarrasBuscar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javaswingdev.swing.table.Table tableInventario;
    // End of variables declaration//GEN-END:variables
}
