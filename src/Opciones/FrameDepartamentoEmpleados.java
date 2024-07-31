package Opciones;

import ClasesGlobales.Agregar;
import ClasesGlobales.Eliminar;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import puntoventa.FrameInventario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FrameDepartamentoEmpleados extends javax.swing.JFrame {
    FrameOpcionesCajeros FC;
    Connection con;
    FrameInventario JF;
    private ActualizarTablaDepartamentosEmpleados obj;
    Agregar add;
    Eliminar delete;
    
    //datos del departamento
    int idDepa=-1;
    String depaNombre="";
    
    public FrameDepartamentoEmpleados(Connection con,FrameInventario JF,FrameOpcionesCajeros FC) {
        this.con=con;
        this.FC=FC;
        this.JF=JF;
        add=new Agregar(con,JF,null);
        delete=new Eliminar(con);
        initComponents();
        centrarPanel();
        actualizarTablaCarrito();
        limpiarPantalla();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDepartamentos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtNombreEditar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcionEditar = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(22, 35, 105));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel10MouseDragged(evt);
            }
        });
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Departamentos de empleados");

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(panelBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNombreBuscador.setBackground(new java.awt.Color(238, 238, 238));
        txtNombreBuscador.setText("Nombre del departamento");
        txtNombreBuscador.setBorder(null);
        txtNombreBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreBuscadorMousePressed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
        });

        tablaDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaDepartamentos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(txtNombreBuscador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreBuscador)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Nombre del departamento");

        txtNombre.setBackground(new java.awt.Color(238, 238, 238));
        txtNombre.setText("Escribe el nombre del departamento");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel5.setText("Descripcion");

        btnGuardar.setBackground(new java.awt.Color(22, 35, 105));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnGuardar.setText("Guardar departamento");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(238, 238, 238));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setText("Escribe una descripcion para el departamento");
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre)
                            .addComponent(jScrollPane3)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Agregar departamento", jPanel3);

        jLabel6.setText("Nombre del departamento");

        txtNombreEditar.setBackground(new java.awt.Color(238, 238, 238));
        txtNombreEditar.setText("Escribe el nombre del departamento");
        txtNombreEditar.setBorder(null);
        txtNombreEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreEditarMousePressed(evt);
            }
        });
        txtNombreEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreEditarKeyPressed(evt);
            }
        });

        jLabel7.setText("Descripcion");

        btnActualizar.setBackground(new java.awt.Color(22, 35, 105));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtDescripcionEditar.setBackground(new java.awt.Color(238, 238, 238));
        txtDescripcionEditar.setColumns(20);
        txtDescripcionEditar.setRows(5);
        txtDescripcionEditar.setText("Escribe una descripcion para el departamento");
        txtDescripcionEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionEditarMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtDescripcionEditar);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(txtNombreEditar)
                        .addComponent(jScrollPane4)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(215, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Editar departamento", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    
    
    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        this.dispose();
        if(FC==null){
            JF.apagarWallpaper();
        }
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        panelBtnExit.setBackground(Color.RED);
        labelExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        panelBtnExit.setBackground(new Color(22,35,105));
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void jPanel10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseDragged

    }//GEN-LAST:event_jPanel10MouseDragged

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed

    }//GEN-LAST:event_jPanel10MousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarDepa();
        limpiarPantalla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreEditarMousePressed
        detectarTexto();
        txtNombreEditar.setForeground(Color.black);
        txtNombreEditar.setText("");
    }//GEN-LAST:event_txtNombreEditarMousePressed

    private void txtDescripcionEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionEditarMousePressed
        detectarTexto();
        txtDescripcionEditar.setForeground(Color.black);
        txtDescripcionEditar.setText("");
    }//GEN-LAST:event_txtDescripcionEditarMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        detectarTexto();
        txtNombre.setForeground(Color.black);
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed
        detectarTexto();
        txtDescripcion.setForeground(Color.black);
        txtDescripcion.setText("");
    }//GEN-LAST:event_txtDescripcionMousePressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(txtNombre.getText().equals("Escribe el nombre del departamento")){
            detectarTexto();
            txtNombre.setForeground(Color.black);
            txtNombre.setText("");
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(idDepa==-1){
            new FrameError(null,"No has buscado ningun departamento").setVisible(true);
        }else{
            if(depaExiste(txtNombreEditar.getText())){
                new FrameError(null,"Este Departamento ya existe").setVisible(true);
            }
            else{
                actualizarDepartamento();
                limpiarPantalla();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtNombreBuscadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreBuscadorMousePressed
        detectarTexto();
        txtNombreBuscador.setText("");
        txtNombreBuscador.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreBuscadorMousePressed

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
        String nombre=txtNombreBuscador.getText();
        if( nombre.equals("") ||  nombre.equals("Nombre del departamento") ){
            new FrameError(null,"Ingresa un nombre valido").setVisible(true);
        }
        else{
            if(buscarDepa(nombre)){
                new FrameCorrecto(null,"Departamento encontrado").setVisible(true);
            }
            else{
                new FrameError(null,"Departamento no encontrado").setVisible(true);
            }
        }
    }//GEN-LAST:event_btnBuscarMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(idDepa>-1){
            eliminarDepa();
            limpiarPantalla();
            depaNombre="";
            idDepa=-1;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreEditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEditarKeyPressed
        detectarTexto();
        if(txtNombreEditar.getText().equals("Escribe el nombre del departamento")){
            txtNombreEditar.setForeground(Color.black);
            txtNombreEditar.setText("");
        }
    }//GEN-LAST:event_txtNombreEditarKeyPressed
    
    private void eliminarDepa(){
        int i=JOptionPane.showConfirmDialog(this, "¿Quiere eleminar el departamento '"+depaNombre+"' ?");
        if(i==0){
            delete.eliminarDepaEmpleado(idDepa);
            actualizarTablaCarrito();
            actualizarDepartamentosEmpleados();
            limpiarPantalla();
            new FrameCorrecto(null,"Departamento eliminado").setVisible(true);
        }
    }
    
    
    private void detectarTexto(){
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Escribe el nombre del departamento");
            txtNombre.setForeground(Color.gray);
        }
        
        if(txtDescripcion.getText().equals("")){
            txtDescripcion.setText("Escribe una descripcion para el departamento");
            txtDescripcion.setForeground(Color.gray);
        }
        
        if(txtNombreEditar.getText().equals("")){
            txtNombreEditar.setText("Escribe el nombre del departamento");
            txtNombreEditar.setForeground(Color.gray);
        }
        
        if(txtDescripcionEditar.getText().equals("")){
            txtDescripcionEditar.setText("Escribe el nombre del departamento");
            txtDescripcionEditar.setForeground(Color.gray);
        }
        
        if(txtNombreBuscador.getText().equals("")){
            txtNombreBuscador.setText("Nombre del departamento");
            txtNombreBuscador.setForeground(Color.gray);
        }
    }
    
    private void guardarDepa(){
        String nombre=txtNombre.getText();
        String Descripcion=txtDescripcion.getText();
        
        if(nombre.equals("") || nombre.equals("Escribe el nombre del departamento")){
            new FrameError(null,"Nombre invalido").setVisible(true);
        }
        else{
            if(depaExiste(nombre)){
                new FrameError(null,"Este Departamento ya existe").setVisible(true);
            }
            else{
                add.agregarDepaEmpleado(nombre, Descripcion);
                limpiarPantalla();
                actualizarDepartamentosEmpleados();
                actualizarTablaCarrito();
            }
        }
    }
    
    private void actualizarDepartamentosEmpleados(){
        if(FC!=null){
            FC.llenarComboBoxDepartamentos();
        }
    }
    
    private boolean depaExiste(String nombre){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from departamentosempleados");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                //comprobar si es el nombre que buscamos
                if(rs.getString("nombre").equals(nombre)){ 
                    if(idDepa==rs.getInt("id")){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            }
                
            return false;
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }       
        return false;       
    }
    
    private boolean buscarDepa(String nombreBusqueda){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from departamentosempleados");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                //comprobar si es el nombre que buscamos
                String nombre=rs.getString("nombre");
                if(nombre.equals(nombreBusqueda)){
                    idDepa=rs.getInt("id");
                    depaNombre=nombre;
                    txtNombreEditar.setText(nombre);
                    txtDescripcionEditar.setText(rs.getString("descripcion"));
                    
                    txtNombreEditar.setForeground(Color.BLACK);
                    txtDescripcionEditar.setForeground(Color.BLACK);
                    
                    return true;
                }
            }
                
            return false;
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }       
        return false;
    }
    
    private void actualizarDepartamento(){
        String nombre=txtNombreEditar.getText();
        String descripcion=txtDescripcionEditar.getText();
        actualizarDepa(nombre,descripcion);
        actualizarDepartamentosEmpleados();
        limpiarPantalla();
        depaNombre=nombre;
        actualizarTablaCarrito();
    }
    
    private void actualizarDepa(String nombre,String descripcion){
        try{
            Statement sts=con.createStatement();
            String actualizar="update departamentosempleados set nombre = '"+nombre+"', descripcion = '"+descripcion+"' where id = '"+idDepa+"'";
            sts.executeUpdate(actualizar);    
            actualizarTablaCarrito();
            new FrameCorrecto(null,"El departamento se actualizo").setVisible(true);
        }catch(SQLException ex){
            System.out.println(ex);
            System.out.println("No se pudo actualizar el departamento");
        }
    }
    
    private void limpiarPantalla(){
        txtNombre.setText("Escribe el nombre del departamento");
        txtNombre.setForeground(Color.gray);
        txtDescripcion.setText("Escribe una descripcion para el departamento");
        txtDescripcion.setForeground(Color.gray);
        txtNombreEditar.setText("Escribe el nombre del departamento");
        txtNombreEditar.setForeground(Color.gray);
        txtDescripcionEditar.setText("Escribe una descripcion para el departamento");
        txtDescripcionEditar.setForeground(Color.gray);
    }
    
    public void actualizarTablaCarrito(){
        obj=new ActualizarTablaDepartamentosEmpleados(con);       
        this.tablaDepartamentos.setModel(obj.getModelo());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTable tablaDepartamentos;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtDescripcionEditar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBuscador;
    private javax.swing.JTextField txtNombreEditar;
    // End of variables declaration//GEN-END:variables
}
