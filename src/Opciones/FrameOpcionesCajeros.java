package Opciones;

import ClasesGlobales.Agregar;
import ClasesGlobales.BuscarCajeros;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import puestosEmpleados.FramePuestos;
import puntoventa.FrameInventario;

public class FrameOpcionesCajeros extends javax.swing.JFrame {
    Connection con;
    private ActualizarTablaCajeros obj;
    convertir conver=new convertir();
    Agregar add;
    Eliminar delete;
    BuscarCajeros search;
    //crear las variables activas y desactivadas 
    boolean Permiso1;
    boolean Permiso2;
    boolean Permiso3;
    boolean Permiso4;
    boolean Permiso5;
    boolean Permiso6;
    boolean Permiso7;
    boolean Permiso8;
    boolean Permiso9;
    boolean Permiso10;
    boolean Permiso11;
    boolean Permiso12;
    boolean Permiso13;
    boolean Permiso14;
    boolean Permiso15;
    boolean Permiso16;
    boolean Permiso17;
    boolean Permiso18;
    boolean Permiso19;
    
    int mouseX,mouseY;
    FrameInventario JF;
    public FrameOpcionesCajeros(Connection con,FrameInventario JF) {
        this.con=con;
        this.JF=JF;
        this.obj=new ActualizarTablaCajeros(con);
        search=new BuscarCajeros(con);
        delete=new Eliminar(con);
        initComponents();
        actualizarTablaCarrito();
        actualizarTxtHorarios();
        llenarComboBox();
        setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
        this.setSize(860, 650);
        this.setResizable(false);
        this.setTitle("Configuraciones de cajeros");
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
    
    private void llenarComboBox(){
        llenarComboBoxDepartamentos();
        llenarComboBoxPuestos();
    }
    
    public void llenarComboBoxDepartamentos(){
        ComboBoxDepartamentos.removeAllItems();
        ComboBoxDepartamentosEditar.removeAllItems();
        //lenar los departamentos
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from departamentosempleados");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String nombreDepartamento=rs.getString("nombre");
                ComboBoxDepartamentos.addItem(nombreDepartamento);
                ComboBoxDepartamentosEditar.addItem(nombreDepartamento);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    public void llenarComboBoxPuestos(){
        ComboBoxPuestos.removeAllItems();
        ComboBoxPuestosEditar.removeAllItems();
        //lenar los puestos
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from puestos");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String puestos=rs.getString("nombre");
                ComboBoxPuestos.addItem(puestos);
                ComboBoxPuestosEditar.addItem(puestos);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    public void actualizarTxtHorarios(){
        txtTurno.removeAllItems();
        txtTurnoEditar.removeAllItems();
        
        //lenar los horarios
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from horarios");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String nombreHorario=rs.getString("nombre");
                txtTurno.addItem(nombreHorario);
                txtTurnoEditar.addItem(nombreHorario);
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCajeros = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PaswordCajero = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JComboBox<>();
        btnAgregarHorario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxDepartamentos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        ComboBoxPuestos = new javax.swing.JComboBox<>();
        btnAgregarHorario1 = new javax.swing.JLabel();
        btnAgregarHorario3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNombreEditar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PaswordCajeroEditar = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtUsuarioEditar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTurnoEditar = new javax.swing.JComboBox<>();
        btnAgregarHorario2 = new javax.swing.JLabel();
        btnAgregarHorario4 = new javax.swing.JLabel();
        btnAgregarHorario5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ComboBoxDepartamentosEditar = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        ComboBoxPuestosEditar = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        PaswordCajeroEliminar = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreEliminar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtUsuarioEliminar = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        permiso5 = new javax.swing.JCheckBox();
        permiso4 = new javax.swing.JCheckBox();
        permiso3 = new javax.swing.JCheckBox();
        permiso2 = new javax.swing.JCheckBox();
        permiso1 = new javax.swing.JCheckBox();
        permiso6 = new javax.swing.JCheckBox();
        permiso7 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        permiso8 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        permiso9 = new javax.swing.JCheckBox();
        permiso10 = new javax.swing.JCheckBox();
        permiso11 = new javax.swing.JCheckBox();
        permiso12 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        permiso13 = new javax.swing.JCheckBox();
        permiso14 = new javax.swing.JCheckBox();
        permiso15 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        permiso16 = new javax.swing.JCheckBox();
        permiso17 = new javax.swing.JCheckBox();
        permiso18 = new javax.swing.JCheckBox();
        permiso19 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        txtHoraEntradaL = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHoraSalidaL = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        checkL = new javax.swing.JCheckBox();
        txtHoraEntradaM = new javax.swing.JTextField();
        txtHoraSalidaM = new javax.swing.JTextField();
        checkM = new javax.swing.JCheckBox();
        txtHoraEntradaMI = new javax.swing.JTextField();
        txtHoraSalidaMI = new javax.swing.JTextField();
        checkMI = new javax.swing.JCheckBox();
        txtHoraEntradaJ = new javax.swing.JTextField();
        txtHoraSalidaJ = new javax.swing.JTextField();
        checkJ = new javax.swing.JCheckBox();
        txtHoraEntradaV = new javax.swing.JTextField();
        txtHoraSalidaV = new javax.swing.JTextField();
        checkV = new javax.swing.JCheckBox();
        txtHoraEntradaS = new javax.swing.JTextField();
        txtHoraSalidaS = new javax.swing.JTextField();
        checkS = new javax.swing.JCheckBox();
        txtHoraEntradaD = new javax.swing.JTextField();
        txtHoraSalidaD = new javax.swing.JTextField();
        checkD = new javax.swing.JCheckBox();
        checkTodosPermisos = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 22));

        tablaCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuario", "Nombre usuario", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCajeros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 348, 415));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ADMINISTRACION DE CAJEROS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Usuario");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Nombre");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnGuardar.setText("Guardar empleado y permisos");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circulo-cruzado.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Turno");

        txtTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoActionPerformed(evt);
            }
        });

        btnAgregarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarHorarioMousePressed(evt);
            }
        });

        jLabel1.setText("Departamento");

        ComboBoxDepartamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Puesto");

        ComboBoxPuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarHorario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarHorario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarHorario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarHorario1MousePressed(evt);
            }
        });

        btnAgregarHorario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarHorario3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarHorario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarHorario3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxPuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaswordCajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTurno, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxDepartamentos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarHorario)
                            .addComponent(btnAgregarHorario1)
                            .addComponent(btnAgregarHorario3))
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaswordCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnAgregarHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar)))
                    .addComponent(btnAgregarHorario3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo cajero", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Nombre");

        jLabel7.setText("Contraseña");

        jLabel8.setText("Usuario");

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/caja.png"))); // NOI18N
        btnActualizar.setText("Actualizar cajero");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel13.setText("Turno");

        txtTurnoEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtTurnoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoEditarActionPerformed(evt);
            }
        });

        btnAgregarHorario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarHorario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarHorario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarHorario2MousePressed(evt);
            }
        });

        btnAgregarHorario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarHorario4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarHorario4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarHorario4MousePressed(evt);
            }
        });

        btnAgregarHorario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        btnAgregarHorario5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarHorario5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarHorario5MousePressed(evt);
            }
        });

        jLabel18.setText("Departamento");

        ComboBoxDepartamentosEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxDepartamentosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDepartamentosEditarActionPerformed(evt);
            }
        });

        jLabel19.setText("Puesto");

        ComboBoxPuestosEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnActualizar)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxDepartamentosEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxPuestosEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarHorario4)
                            .addComponent(btnAgregarHorario5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PaswordCajeroEditar)
                                    .addComponent(txtNombreEditar)
                                    .addComponent(txtTurnoEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUsuarioEditar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarHorario2)))
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUsuarioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(PaswordCajeroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtTurnoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregarHorario2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxDepartamentosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(btnAgregarHorario4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxPuestosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnAgregarHorario5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Editar cajero", jPanel3);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PaswordCajeroEliminar.setEditable(false);

        jLabel9.setText("Nombre");

        txtNombreEliminar.setEditable(false);

        jLabel10.setText("Usuario");

        jLabel11.setText("Contraseña");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtUsuarioEliminar.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PaswordCajeroEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(txtUsuarioEliminar))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(149, 149, 149))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(PaswordCajeroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dar de baja empleado", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 260));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        permiso5.setText("Registrar salida de efectivo");

        permiso4.setText("Registrar entrada de efectivo");

        permiso3.setText("Resivar el historial de ventas");

        permiso2.setText("Aplicar descuento");

        permiso1.setText("Utilizar productos comun");

        permiso6.setText("Devolver articulos");

        permiso7.setText("Eliminar articulos de venta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(permiso1)
                    .addComponent(permiso2)
                    .addComponent(permiso3)
                    .addComponent(permiso4)
                    .addComponent(permiso5)
                    .addComponent(permiso6)
                    .addComponent(permiso7))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(permiso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso7)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ventas", jPanel4);

        permiso8.setText("Crear, modificar o eliminar clientes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(permiso8)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(permiso8)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", jPanel5);

        permiso9.setText("Crear nuevos productos");

        permiso10.setText("Modificar productos");

        permiso11.setText("Eliminar productos");

        permiso12.setText("Ver reporte de ventas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(permiso9)
                    .addComponent(permiso10)
                    .addComponent(permiso11)
                    .addComponent(permiso12))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(permiso9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso12)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Productos", jPanel6);

        permiso13.setText("Agregar mercancia");

        permiso14.setText("Ver movimiento de inventario");

        permiso15.setText("Ajustar inventario");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(permiso13)
                    .addComponent(permiso14)
                    .addComponent(permiso15))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(permiso13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso15)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Inventario", jPanel7);

        permiso16.setText("Realizar el corte de su turno");

        permiso17.setText("Realizar el corte del dia (Todos los turnos)");
        permiso17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permiso17ActionPerformed(evt);
            }
        });

        permiso18.setText("Ver la ganancia del dia");

        permiso19.setText("Cambiar la configuracion del programa");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(permiso16)
                    .addComponent(permiso17)
                    .addComponent(permiso18)
                    .addComponent(permiso19))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(permiso16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permiso19)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Otros", jPanel8);

        txtHoraEntradaL.setEditable(false);
        txtHoraEntradaL.setText("00:00:AM");

        jLabel14.setText("Hora de entrada");

        txtHoraSalidaL.setEditable(false);
        txtHoraSalidaL.setText("00:00:AM");

        jLabel15.setText("Hora de salida");

        checkL.setText("Lunes");

        txtHoraEntradaM.setEditable(false);
        txtHoraEntradaM.setText("00:00:AM");

        txtHoraSalidaM.setEditable(false);
        txtHoraSalidaM.setText("00:00:AM");

        checkM.setText("Martes");

        txtHoraEntradaMI.setEditable(false);
        txtHoraEntradaMI.setText("00:00:AM");

        txtHoraSalidaMI.setEditable(false);
        txtHoraSalidaMI.setText("00:00:AM");

        checkMI.setText("Miercoles");

        txtHoraEntradaJ.setEditable(false);
        txtHoraEntradaJ.setText("00:00:AM");

        txtHoraSalidaJ.setEditable(false);
        txtHoraSalidaJ.setText("00:00:AM");

        checkJ.setText("Jueves");

        txtHoraEntradaV.setEditable(false);
        txtHoraEntradaV.setText("00:00:AM");

        txtHoraSalidaV.setEditable(false);
        txtHoraSalidaV.setText("00:00:AM");

        checkV.setText("Viernes");
        checkV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVActionPerformed(evt);
            }
        });

        txtHoraEntradaS.setEditable(false);
        txtHoraEntradaS.setText("00:00:AM");

        txtHoraSalidaS.setEditable(false);
        txtHoraSalidaS.setText("00:00:AM");

        checkS.setText("Sabado");
        checkS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSActionPerformed(evt);
            }
        });

        txtHoraEntradaD.setEditable(false);
        txtHoraEntradaD.setText("00:00:AM");

        txtHoraSalidaD.setEditable(false);
        txtHoraSalidaD.setText("00:00:AM");

        checkD.setText("Domingo");
        checkD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkL)
                    .addComponent(checkM)
                    .addComponent(checkMI)
                    .addComponent(checkJ)
                    .addComponent(checkV)
                    .addComponent(checkS)
                    .addComponent(checkD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(88, 88, 88))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtHoraEntradaL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoraEntradaM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraEntradaMI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraEntradaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraEntradaV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraEntradaS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraEntradaD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoraSalidaD, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaV, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaMI, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaM, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtHoraSalidaL, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaS, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoraEntradaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHoraSalidaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkL))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkM)
                    .addComponent(txtHoraEntradaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkMI)
                    .addComponent(txtHoraEntradaMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkJ)
                    .addComponent(txtHoraEntradaJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkV)
                    .addComponent(txtHoraEntradaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkS)
                    .addComponent(txtHoraEntradaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkD)
                    .addComponent(txtHoraEntradaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalidaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Horario", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 440, 270));

        checkTodosPermisos.setText("Ofrecer todos los permisos");
        checkTodosPermisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkTodosPermisosMouseReleased(evt);
            }
        });
        getContentPane().add(checkTodosPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

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
        jLabel17.setText("Configuraciones de empleados");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
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

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void permiso17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permiso17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_permiso17ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(datosLlenado()){
            String nombre=txtNombre.getText();
            String usuario=txtUsuario.getText();
            String password=PaswordCajero.getText();
            String turno=txtTurnoEditar.getSelectedItem().toString();
            agregarCajero(nombre,usuario,password,turno);
        }
        else{
            new FrameError(null,"Faltan datos por llenar").setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private boolean datosLlenado(){
        if(txtNombre.getText().equals("") || txtUsuario.getText().equals("") || PaswordCajero.getText().equals("") || txtTurnoEditar.getSelectedItem().toString().equals("")){
            return false;
        }
        else{
            return true;
        }
    }
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(!txtUsuarioEditar.getText().equals("")){
           guardarActualizarCajero();
        }
        else{
            new FrameError(null,"No existe ningun usuario").setVisible(true);
        }        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        borrarPantalla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarCajero();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtUsuarioEditar.getText().equals("")){
            comporbarEliminacion();
        }
        else{
            new FrameError(null,"No existe ningun usuario").setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void checkTodosPermisosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkTodosPermisosMouseReleased
        activarDesactivarTodosPermisos(checkTodosPermisos.isSelected());
    }//GEN-LAST:event_checkTodosPermisosMouseReleased

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

    private void jPanel10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseDragged

    }//GEN-LAST:event_jPanel10MouseDragged

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_jPanel10MousePressed

    private void checkVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkVActionPerformed

    private void checkSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSActionPerformed

    private void checkDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDActionPerformed

    private void btnAgregarHorario2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarHorario2MousePressed
        new FrameCreacionHorarios(con,JF,this).setVisible(true);
    }//GEN-LAST:event_btnAgregarHorario2MousePressed

    private void btnAgregarHorarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarHorarioMousePressed
        new FrameCreacionHorarios(con,JF,this).setVisible(true);
    }//GEN-LAST:event_btnAgregarHorarioMousePressed

    private void txtTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoActionPerformed
        if(txtTurno.getItemCount()>0){
            buscarHorarioEmpleado(txtTurno.getSelectedItem().toString());
        }
    }//GEN-LAST:event_txtTurnoActionPerformed

    private void txtTurnoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoEditarActionPerformed
        if(txtTurnoEditar.getItemCount()>0){
            buscarHorarioEmpleado(txtTurnoEditar.getSelectedItem().toString());
        }
    }//GEN-LAST:event_txtTurnoEditarActionPerformed

    private void btnAgregarHorario1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarHorario1MousePressed
        new FrameDepartamentoEmpleados(con,JF,this).setVisible(true);
    }//GEN-LAST:event_btnAgregarHorario1MousePressed

    private void btnAgregarHorario3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarHorario3MousePressed
        new FramePuestos(con,JF,this).setVisible(true);
    }//GEN-LAST:event_btnAgregarHorario3MousePressed

    private void btnAgregarHorario4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarHorario4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarHorario4MousePressed

    private void btnAgregarHorario5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarHorario5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarHorario5MousePressed

    private void ComboBoxDepartamentosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDepartamentosEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDepartamentosEditarActionPerformed
    
    private void buscarHorarioEmpleado(String turno){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from horarios");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                if(rs.getString("nombre").equals(turno)){
                    llenarHorarioEmpleado(rs);
                    break;
                }
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }        
    }
    
    private void llenarHorarioEmpleado(ResultSet rs){
        try {
            txtHoraEntradaL.setText(rs.getString("le"));
            txtHoraEntradaM.setText(rs.getString("me"));
            txtHoraEntradaMI.setText(rs.getString("mie"));
            txtHoraEntradaJ.setText(rs.getString("je"));
            txtHoraEntradaV.setText(rs.getString("ve"));
            txtHoraEntradaS.setText(rs.getString("se"));
            txtHoraEntradaD.setText(rs.getString("de"));
            
            txtHoraSalidaL.setText(rs.getString("ls"));
            txtHoraSalidaM.setText(rs.getString("ms"));
            txtHoraSalidaMI.setText(rs.getString("mis"));
            txtHoraSalidaJ.setText(rs.getString("js"));
            txtHoraSalidaV.setText(rs.getString("vs"));
            txtHoraSalidaS.setText(rs.getString("ss"));
            txtHoraSalidaD.setText(rs.getString("ds"));
            
            checkL.setEnabled(rs.getBoolean("lunes"));
            checkM.setEnabled(rs.getBoolean("martes"));
            checkMI.setEnabled(rs.getBoolean("miercoles"));
            checkJ.setEnabled(rs.getBoolean("jueves"));
            checkV.setEnabled(rs.getBoolean("viernes"));
            checkS.setEnabled(rs.getBoolean("sabado"));
            checkD.setEnabled(rs.getBoolean("domingo"));
            
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }    
    }
    
    //funciones para comprobar
    private void comporbarEliminacion(){
        String usuario=txtBuscarUsuario.getText();
        //preguntar si quiere eliminar el carrito
        int i=JOptionPane.showConfirmDialog(this, "¿Quiere eleminar a '"+usuario+"' como un usuario?");
        if(i==0){
            //comprobar que no sea el administardor
            if(!txtUsuarioEditar.getText().equals("admin")){
                eliminarCajero(usuario);
            }
            else{
                new FrameError(null,"No se puede modificar o eliminar el usuario administrador").setVisible(true);
            }
        }
    }
    
    private void eliminarCajero(String usuario){
        try{
            delete.eliminarCajero(search.Id());
            borrarPantalla();
            new FrameCorrecto(null,"El usuario '"+usuario+"' fue eliminado correctamente").setVisible(true);
        }catch(SQLException e){
            new FrameError(null,"El usuario no se pudo eliminar").setVisible(true);
        }
    }
    
    //funciones para buscar 
    private void buscarCajero(){
        String usuario=txtBuscarUsuario.getText();
        if(!usuario.equals("") && search.buscarCajero(usuario)){
            new FrameCorrecto(null,"Usuario encontrado").setVisible(true);
            actualizarInformacionuCajero();
            actualizarInformacionPantalla();
        }
        else{
            new FrameError(null,"El usuario no existe").setVisible(true);
        }
    }
    
    //funciones para guardar los datos del cajero
    private void obtenerInformacionPermisos(){
        Permiso1= permiso1.isSelected();
        Permiso2= permiso2.isSelected();
        Permiso3= permiso3.isSelected();
        Permiso4= permiso4.isSelected();
        Permiso5= permiso5.isSelected();
        Permiso6= permiso6.isSelected();
        Permiso7= permiso7.isSelected();
        Permiso8= permiso8.isSelected();
        Permiso9= permiso9.isSelected();
        Permiso10= permiso10.isSelected();
        Permiso11= permiso11.isSelected();
        Permiso12= permiso12.isSelected();
        Permiso13= permiso13.isSelected();
        Permiso14= permiso14.isSelected();
        Permiso15= permiso15.isSelected();
        Permiso16= permiso16.isSelected();
        Permiso17= permiso17.isSelected();
        Permiso18= permiso18.isSelected();
        Permiso19= permiso19.isSelected();
    }

    private void obtenerInformacionPermisosAdmin(){
        Permiso1=true;
        Permiso2=true;
        Permiso3=true;
        Permiso4=true;
        Permiso5=true;
        Permiso6=true;
        Permiso7=true;
        Permiso8=true;
        Permiso9=true;
        Permiso10=true;
        Permiso11=true;
        Permiso12=true;
        Permiso13=true;
        Permiso14=true;
        Permiso15=true;
        Permiso16=true;
        Permiso17=true;
        Permiso18=true;
        Permiso19=true;
    }
    
    
    private void agregarCajero(String nombreCajero,String usuario,String password,String turno){
       int id=generarId();
       obtenerInformacionPermisos();
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO cajeros (id, usuario, nombre, password, turno, permiso1, permiso2, permiso3, permiso4, permiso5, permiso6, permiso7, permiso8, permiso9, permiso10, permiso11, permiso12, permiso13, permiso14, permiso15, permiso16, permiso17, permiso18, permiso19)"
                    +" VALUES ('"+id+"','"+usuario+"','"+nombreCajero+"','"+password+"','"+turno+"','"+pI(Permiso1)+"','"+pI(Permiso2)+"','"+pI(Permiso3)+"','"+pI(Permiso4)+"','"+pI(Permiso5)+"','"+pI(Permiso6)+"','"+pI(Permiso7)+"','"+pI(Permiso8)+"','"+pI(Permiso9)+"','"+pI(Permiso10)+"','"+pI(Permiso11)+"','"+pI(Permiso12)+"','"+pI(Permiso13)+"','"+pI(Permiso14)+"','"+pI(Permiso15)+"','"+pI(Permiso16)+"','"+pI(Permiso17)+"','"+pI(Permiso18)+"','"+pI(Permiso19)+"' )" );
            
            sts.executeBatch();
            borrarPantalla();
            new FrameCorrecto(JF,"El usuario '"+usuario+"' fue agregado correctamente").setVisible(true);
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(JF,"No se pudo agregar el usuario").setVisible(true);
        }   
    }
    
    private int pI(boolean permiso){
        if(permiso){
            return 1;
        }
        
        return 0;
    }
    
    private int generarId(){
        int id=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from cajeros");
            ResultSet rs=sts.getResultSet();
            
            //pasar por todas la lista de id 
            while(rs.next()){
                id=rs.getInt("id");
            }
            
            //aumentarle un valor a ese ultimo dato y retornar
            id++;
            return id;
        }catch(SQLException ex){
            return id;
        }
    }
    
    //funciones para actualizar 
    private void guardarActualizarCajero(){
        String usuario=txtUsuarioEditar.getText();
        String nombre=txtNombreEditar.getText();
        String password=PaswordCajeroEditar.getText();
        String turno=txtTurnoEditar.getSelectedItem().toString();
        obtenerInformacionPermisos();
        
        if(txtUsuarioEditar.getText().equals("admin")){
            obtenerInformacionPermisosAdmin();
            actualizarCajero("admin","admin",password,"admin");
        }
        else{
            actualizarCajero(usuario,nombre,password,turno);
        }
    }
    
    private void actualizarCajero(String usuario,String nombre,String password,String turno){
        try{
            int id=search.Id();
            Statement sts=con.createStatement();
            String actualizar="UPDATE `cajeros` SET `usuario` = '"+usuario+"', `nombre` = '"+nombre+"', `password` = '"+password+"',`turno` = '"+turno+"', `permiso` = '"+pI(Permiso1)+"', `permiso2` = '"+pI(Permiso2)+"', `permiso3` = '"+pI(Permiso3)+"', `permiso4` = '"+pI(Permiso4)+"', `permiso5` = '"+pI(Permiso5)+"', `permiso6` = '"+pI(Permiso6)+"', `permiso7` = '"+pI(Permiso7)+"', `permiso8` = '"+pI(Permiso8)+"', `permiso9` = '"+pI(Permiso9)+"', `permiso10` = '"+pI(Permiso10)+"', `permiso11` = '"+pI(Permiso12)+"', `permiso12` = '"+pI(Permiso13)+"', `permiso14` = '"+pI(Permiso14)+"', `permiso15` = '"+pI(Permiso16)+"', `permiso17` = '"+pI(Permiso17)+"', `permiso18` = '"+pI(Permiso18)+"', `permiso19` = '"+pI(Permiso19)+"' WHERE `cajeros`.`id` = "+id;
            sts.executeUpdate(actualizar);    
            borrarPantalla();
            new FrameCorrecto(null,"El usuario '"+usuario+"' se actualizo con existe").setVisible(true);
        }catch(SQLException ex){
            new FrameError(null,"El usuario '"+usuario+"' no se pudo actualizar").setVisible(true);
            System.out.println(ex);
        }    
    }
    
    public void actualizarTablaCarrito(){
        obj=new ActualizarTablaCajeros(con);
        this.tablaCajeros.setModel(obj.getModelo()); 
    }    
    
    private void actualizarInformacionPantalla(){
        try{
            permiso1.setSelected(search.Permiso("permiso"));
            permiso2.setSelected(search.Permiso("permiso2"));
            permiso3.setSelected(search.Permiso("permiso3"));
            permiso4.setSelected(search.Permiso("permiso4"));
            permiso5.setSelected(search.Permiso("permiso5"));
            permiso6.setSelected(search.Permiso("permiso6"));
            permiso7.setSelected(search.Permiso("permiso7"));
            permiso8.setSelected(search.Permiso("permiso8"));
            permiso9.setSelected(search.Permiso("permiso9"));
            permiso10.setSelected(search.Permiso("permiso10"));
            permiso11.setSelected(search.Permiso("permiso11"));
            permiso12.setSelected(search.Permiso("permiso12"));
            permiso13.setSelected(search.Permiso("permiso13"));
            permiso14.setSelected(search.Permiso("permiso14"));
            permiso15.setSelected(search.Permiso("permiso15"));
            permiso16.setSelected(search.Permiso("permiso16"));
            permiso17.setSelected(search.Permiso("permiso17"));
            permiso18.setSelected(search.Permiso("permiso18"));
            permiso19.setSelected(search.Permiso("permiso19"));
        }catch(SQLException ex){
        }
    }
    
    private void actualizarInformacionuCajero(){
        txtUsuario.setText("");
        txtNombre.setText("");
        PaswordCajero.setText("");
        txtTurnoEditar.setSelectedIndex(0);
        
        try{
            String usuario=search.Usuario();
            String nombre=search.Nombre();
            String password=search.Pasword();
            String turno=search.Turno();
            String departamento=search.nombreDepartamento();
            String puesto=search.nombrePuesto();
            
            txtUsuarioEditar.setText(usuario);
            txtUsuarioEliminar.setText(usuario);

            txtNombreEditar.setText(nombre);
            txtNombreEliminar.setText(nombre);

            PaswordCajeroEditar.setText(password);
            PaswordCajeroEliminar.setText(password);
            
            txtTurnoEditar.setSelectedItem(turno);
            ComboBoxDepartamentosEditar.setSelectedItem(departamento);
            ComboBoxPuestosEditar.setSelectedItem(puesto);
            
        }catch(SQLException ex){
        }
    }
    
    private void borrarPantalla(){
        txtBuscarUsuario.setText("");
        
        txtUsuario.setText("");
        txtNombre.setText("");
        PaswordCajero.setText("");
            
        txtUsuarioEditar.setText("");
        txtUsuarioEliminar.setText("");

        txtNombreEditar.setText("");
        txtNombreEliminar.setText("");

        PaswordCajeroEditar.setText("");
        PaswordCajeroEliminar.setText("");
        
        txtTurnoEditar.setSelectedIndex(0);
        txtTurnoEditar.setSelectedIndex(0);
        
        permiso1.setSelected(false);
        permiso2.setSelected(false);
        permiso3.setSelected(false);
        permiso4.setSelected(false);
        permiso5.setSelected(false);
        permiso6.setSelected(false);
        permiso7.setSelected(false);
        permiso8.setSelected(false);
        permiso9.setSelected(false);
        permiso10.setSelected(false);
        permiso11.setSelected(false);
        permiso12.setSelected(false);
        permiso13.setSelected(false);
        permiso14.setSelected(false);
        permiso15.setSelected(false);
        permiso16.setSelected(false);
        permiso17.setSelected(false);
        permiso18.setSelected(false);
        permiso19.setSelected(false);
        
        actualizarTablaCarrito();
    }
    
    private void activarDesactivarTodosPermisos(boolean perm){
        permiso1.setSelected(perm);
        permiso2.setSelected(perm);
        permiso3.setSelected(perm);
        permiso4.setSelected(perm);
        permiso5.setSelected(perm);
        permiso6.setSelected(perm);
        permiso7.setSelected(perm);
        permiso8.setSelected(perm);
        permiso9.setSelected(perm);
        permiso10.setSelected(perm);
        permiso11.setSelected(perm);
        permiso12.setSelected(perm);
        permiso13.setSelected(perm);
        permiso14.setSelected(perm);
        permiso15.setSelected(perm);
        permiso16.setSelected(perm);
        permiso17.setSelected(perm);
        permiso18.setSelected(perm);
        permiso19.setSelected(perm);        
    }
    
    //actualizar horario del cajero
    public void setTxtHoraEntrada(String hora){
        txtHoraEntradaL.setText(hora);
    }
    
    public void setTxtHoraSalida(String hora){
        txtHoraSalidaL.setText(hora);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxDepartamentos;
    private javax.swing.JComboBox<String> ComboBoxDepartamentosEditar;
    private javax.swing.JComboBox<String> ComboBoxPuestos;
    private javax.swing.JComboBox<String> ComboBoxPuestosEditar;
    private javax.swing.JPasswordField PaswordCajero;
    private javax.swing.JPasswordField PaswordCajeroEditar;
    private javax.swing.JPasswordField PaswordCajeroEliminar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel btnAgregarHorario;
    private javax.swing.JLabel btnAgregarHorario1;
    private javax.swing.JLabel btnAgregarHorario2;
    private javax.swing.JLabel btnAgregarHorario3;
    private javax.swing.JLabel btnAgregarHorario4;
    private javax.swing.JLabel btnAgregarHorario5;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox checkD;
    private javax.swing.JCheckBox checkJ;
    private javax.swing.JCheckBox checkL;
    private javax.swing.JCheckBox checkM;
    private javax.swing.JCheckBox checkMI;
    private javax.swing.JCheckBox checkS;
    private javax.swing.JCheckBox checkTodosPermisos;
    private javax.swing.JCheckBox checkV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JCheckBox permiso1;
    private javax.swing.JCheckBox permiso10;
    private javax.swing.JCheckBox permiso11;
    private javax.swing.JCheckBox permiso12;
    private javax.swing.JCheckBox permiso13;
    private javax.swing.JCheckBox permiso14;
    private javax.swing.JCheckBox permiso15;
    private javax.swing.JCheckBox permiso16;
    private javax.swing.JCheckBox permiso17;
    private javax.swing.JCheckBox permiso18;
    private javax.swing.JCheckBox permiso19;
    private javax.swing.JCheckBox permiso2;
    private javax.swing.JCheckBox permiso3;
    private javax.swing.JCheckBox permiso4;
    private javax.swing.JCheckBox permiso5;
    private javax.swing.JCheckBox permiso6;
    private javax.swing.JCheckBox permiso7;
    private javax.swing.JCheckBox permiso8;
    private javax.swing.JCheckBox permiso9;
    private javax.swing.JTable tablaCajeros;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtHoraEntradaD;
    private javax.swing.JTextField txtHoraEntradaJ;
    private javax.swing.JTextField txtHoraEntradaL;
    private javax.swing.JTextField txtHoraEntradaM;
    private javax.swing.JTextField txtHoraEntradaMI;
    private javax.swing.JTextField txtHoraEntradaS;
    private javax.swing.JTextField txtHoraEntradaV;
    private javax.swing.JTextField txtHoraSalidaD;
    private javax.swing.JTextField txtHoraSalidaJ;
    private javax.swing.JTextField txtHoraSalidaL;
    private javax.swing.JTextField txtHoraSalidaM;
    private javax.swing.JTextField txtHoraSalidaMI;
    private javax.swing.JTextField txtHoraSalidaS;
    private javax.swing.JTextField txtHoraSalidaV;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtNombreEliminar;
    private javax.swing.JComboBox<String> txtTurno;
    private javax.swing.JComboBox<String> txtTurnoEditar;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioEditar;
    private javax.swing.JTextField txtUsuarioEliminar;
    // End of variables declaration//GEN-END:variables
}
