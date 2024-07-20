
package Opciones;

import ClasesGlobales.Agregar;
import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import com.raven.event.EventTimePicker;
import com.raven.swing.TimePicker;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import puntoventa.FrameInventario;

public class FrameCreacionHorarios extends javax.swing.JFrame {
    
    FrameInventario JF;
    Connection con;
    Agregar add;
    JTextField txtHora;
    Color btnHover=new Color(46,69,209);
    Color btnNorm=new Color(22,35,105);
    
    Color btnHoverApagado=new Color(28,45,142);
    Color btnNormApagado=new Color(10,16,50);
    
    ImageIcon  iconoReloj=new ImageIcon("src/img/relojHorario.png");
    ImageIcon  iconoRelojApagado=new ImageIcon ("src/img/relojHorarioApagado.png");
    
    boolean L=false;
    boolean M=false;
    boolean MM=false;
    boolean J=false;
    boolean V=false;
    boolean S=false;
    boolean D=false;
    
    FrameOpcionesCajeros FC;
    public FrameCreacionHorarios(Connection con,FrameInventario JF,FrameOpcionesCajeros FC) {
        this.con=con;
        this.JF=JF;
        this.FC=FC;
        this.add=new Agregar(con,this,JF);
        initComponents();
        txtHora=txtLE;
        restaurarFrame();
        setIconImage(getIcono());
        centrarPanel();
        actualizarReloj();
    }
    
     private Image getIcono(){
        Image icono=Toolkit.getDefaultToolkit().getImage("icono.png");
        return icono;
    }
    
    private void actualizarReloj(){
        reloj.addEventTimePicker(new EventTimePicker(){
            @Override
            public void timeSelected(String string) {
                txtHora.setText(string);
            }
            
        });
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

        reloj = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        LE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LS = new javax.swing.JLabel();
        txtLS = new javax.swing.JTextField();
        btnLunes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMS = new javax.swing.JTextField();
        btnMartes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ME = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtME = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MS = new javax.swing.JLabel();
        txtMMS = new javax.swing.JTextField();
        btnMiercoles = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        MIE = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMME = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        MIS = new javax.swing.JLabel();
        txtJS = new javax.swing.JTextField();
        btnJueves = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        JE = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtJE = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        JS = new javax.swing.JLabel();
        txtVS = new javax.swing.JTextField();
        btnViernes = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        VE = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtVE = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        VS = new javax.swing.JLabel();
        txtSS = new javax.swing.JTextField();
        btnSabado = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        SE = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtSE = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        SS = new javax.swing.JLabel();
        txtDS = new javax.swing.JTextField();
        btnDomingo = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        DE = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtDE = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        DS = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        reloj.setForeground(new java.awt.Color(22, 35, 105));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

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
        jLabel17.setText("Creacion de horarios");

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

        LE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        LE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LEMousePressed(evt);
            }
        });

        jLabel3.setText("Entrada");

        txtLE.setText("00:00:PM");

        jLabel4.setText("Salida");

        LS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        LS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LSMousePressed(evt);
            }
        });

        txtLS.setText("00:00:PM");

        btnLunes.setBackground(new java.awt.Color(22, 35, 105));
        btnLunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLunesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLunesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLunesMousePressed(evt);
            }
        });
        btnLunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lunes");
        btnLunes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtMS.setText("00:00:PM");

        btnMartes.setBackground(new java.awt.Color(22, 35, 105));
        btnMartes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMartesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMartesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMartesMousePressed(evt);
            }
        });
        btnMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Martes");
        btnMartes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        ME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        ME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MEMousePressed(evt);
            }
        });

        jLabel8.setText("Entrada");

        txtME.setText("00:00:PM");

        jLabel9.setText("Salida");

        MS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        MS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MSMousePressed(evt);
            }
        });

        txtMMS.setText("00:00:PM");

        btnMiercoles.setBackground(new java.awt.Color(22, 35, 105));
        btnMiercoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMiercolesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMiercolesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMiercolesMousePressed(evt);
            }
        });
        btnMiercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Miercoles");
        btnMiercoles.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        MIE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MIE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MIEMousePressed(evt);
            }
        });

        jLabel13.setText("Entrada");

        txtMME.setText("00:00:PM");

        jLabel14.setText("Salida");

        MIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        MIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MISMousePressed(evt);
            }
        });

        txtJS.setText("00:00:PM");

        btnJueves.setBackground(new java.awt.Color(22, 35, 105));
        btnJueves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJuevesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJuevesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJuevesMousePressed(evt);
            }
        });
        btnJueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Jueves");
        btnJueves.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        JE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        JE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JEMousePressed(evt);
            }
        });

        jLabel19.setText("Entrada");

        txtJE.setText("00:00:PM");

        jLabel20.setText("Salida");

        JS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        JS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JSMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JSMousePressed(evt);
            }
        });

        txtVS.setText("00:00:PM");

        btnViernes.setBackground(new java.awt.Color(22, 35, 105));
        btnViernes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViernesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViernesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnViernesMousePressed(evt);
            }
        });
        btnViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Viernes");
        btnViernes.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        VE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        VE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VEMousePressed(evt);
            }
        });

        jLabel24.setText("Entrada");

        txtVE.setText("00:00:PM");

        jLabel25.setText("Salida");

        VS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        VS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VSMousePressed(evt);
            }
        });

        txtSS.setText("00:00:PM");

        btnSabado.setBackground(new java.awt.Color(22, 35, 105));
        btnSabado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSabadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSabadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSabadoMousePressed(evt);
            }
        });
        btnSabado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Sabado");
        btnSabado.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        SE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        SE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SEMousePressed(evt);
            }
        });

        jLabel29.setText("Entrada");

        txtSE.setText("00:00:PM");

        jLabel30.setText("Salida");

        SS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        SS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SSMousePressed(evt);
            }
        });

        txtDS.setText("00:00:PM");

        btnDomingo.setBackground(new java.awt.Color(22, 35, 105));
        btnDomingo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDomingoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDomingoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDomingoMousePressed(evt);
            }
        });
        btnDomingo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Domingo");
        btnDomingo.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        DE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        DE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DEMousePressed(evt);
            }
        });

        jLabel34.setText("Entrada");

        txtDE.setText("00:00:PM");

        jLabel35.setText("Salida");

        DS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/relojHorario.png"))); // NOI18N
        DS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DSMousePressed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(22, 35, 105));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disco.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(238, 238, 238));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setText("Escribe el nombre del horario...");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtLE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(LE)
                            .addGap(80, 80, 80)
                            .addComponent(txtLS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(LS))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtME, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(ME)
                            .addGap(80, 80, 80)
                            .addComponent(txtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(MS))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtMME, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(MIE)
                            .addGap(80, 80, 80)
                            .addComponent(txtMMS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(MIS))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtJE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JE)
                            .addGap(80, 80, 80)
                            .addComponent(txtJS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JS))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtVE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(VE)
                            .addGap(80, 80, 80)
                            .addComponent(txtVS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(VS))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtSE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(SE)
                            .addGap(80, 80, 80)
                            .addComponent(txtSS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(SS))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtDE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(DE)
                            .addGap(80, 80, 80)
                            .addComponent(txtDS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(DS))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel20))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel25))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel30))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel35)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LE)
                            .addComponent(txtLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LS))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ME))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(MS)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MIE)
                            .addComponent(txtMMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MIS))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JE)
                            .addComponent(txtJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VE)
                            .addComponent(txtVS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VS))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SE)
                            .addComponent(txtSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SS))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DE)
                            .addComponent(txtDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DS))))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void LEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEMousePressed
        if(L){
            txtHora=txtLE;
            moverHorario(LE);
        }
    }//GEN-LAST:event_LEMousePressed

    private void LSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSMousePressed
        if(L){
            txtHora=txtLS;
            moverHorario(LS);
        }
    }//GEN-LAST:event_LSMousePressed

    private void MEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEMousePressed
        if(M){
            txtHora=txtME;
            moverHorario(ME);
        }
    }//GEN-LAST:event_MEMousePressed

    private void btnLunesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLunesMouseEntered
        cambiarColorBotonHover(L,btnLunes);
    }//GEN-LAST:event_btnLunesMouseEntered

    private void btnLunesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLunesMouseExited
        cambiarColorBotonNorm(L,btnLunes);
    }//GEN-LAST:event_btnLunesMouseExited

    private void btnLunesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLunesMousePressed
        L=L ? false : true;
        bloquearTxtHoras();
    }//GEN-LAST:event_btnLunesMousePressed

    private void btnMartesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMartesMouseEntered
        cambiarColorBotonHover(M,btnMartes);
    }//GEN-LAST:event_btnMartesMouseEntered

    private void btnMartesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMartesMouseExited
        cambiarColorBotonNorm(M,btnMartes);
    }//GEN-LAST:event_btnMartesMouseExited

    private void btnMartesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMartesMousePressed
        M=M ? false : true;
        bloquearTxtHoras();
    }//GEN-LAST:event_btnMartesMousePressed

    private void btnMiercolesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiercolesMouseEntered
        cambiarColorBotonHover(MM,btnMiercoles);
    }//GEN-LAST:event_btnMiercolesMouseEntered

    private void btnMiercolesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiercolesMouseExited
        cambiarColorBotonNorm(MM,btnMiercoles);
    }//GEN-LAST:event_btnMiercolesMouseExited

    private void btnMiercolesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiercolesMousePressed
        MM=MM ? false : true;
        bloquearTxtHoras();
    }//GEN-LAST:event_btnMiercolesMousePressed

    private void btnJuevesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuevesMouseEntered
        cambiarColorBotonHover(J,btnJueves);
    }//GEN-LAST:event_btnJuevesMouseEntered

    private void btnJuevesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuevesMouseExited
        cambiarColorBotonNorm(J,btnJueves);
    }//GEN-LAST:event_btnJuevesMouseExited

    private void btnJuevesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuevesMousePressed
        J=J ? false : true;
        bloquearTxtHoras();
    }//GEN-LAST:event_btnJuevesMousePressed

    private void btnViernesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViernesMouseEntered
        cambiarColorBotonHover(V,btnViernes);
    }//GEN-LAST:event_btnViernesMouseEntered

    private void btnViernesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViernesMouseExited
        cambiarColorBotonNorm(V,btnViernes);
    }//GEN-LAST:event_btnViernesMouseExited

    private void btnViernesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViernesMousePressed
        V=V ? false : true;
        bloquearTxtHoras();
    }//GEN-LAST:event_btnViernesMousePressed

    private void btnSabadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSabadoMouseEntered
        cambiarColorBotonHover(S,btnSabado);
    }//GEN-LAST:event_btnSabadoMouseEntered

    private void btnSabadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSabadoMouseExited
        cambiarColorBotonNorm(S,btnSabado);
    }//GEN-LAST:event_btnSabadoMouseExited

    private void btnSabadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSabadoMousePressed
        S=S ? false : true;
        bloquearTxtHoras();
    }//GEN-LAST:event_btnSabadoMousePressed

    private void btnDomingoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDomingoMouseEntered
        cambiarColorBotonHover(D,btnDomingo);
    }//GEN-LAST:event_btnDomingoMouseEntered

    private void btnDomingoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDomingoMouseExited
        cambiarColorBotonNorm(D,btnDomingo);
    }//GEN-LAST:event_btnDomingoMouseExited

    private void btnDomingoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDomingoMousePressed
        D=D ? false : true;
        bloquearTxtHoras();
    }//GEN-LAST:event_btnDomingoMousePressed

    private void MSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MSMousePressed
        if(M){
            txtHora=txtMS;
            moverHorario(MS);
        }
    }//GEN-LAST:event_MSMousePressed

    private void MIEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MIEMousePressed
        if(MM){
            txtHora=txtMME;
            moverHorario(MIE);
        }
    }//GEN-LAST:event_MIEMousePressed

    private void MISMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MISMousePressed
        if(MM){
            txtHora=txtMMS;
            moverHorario(MIS);
        }
    }//GEN-LAST:event_MISMousePressed

    private void JEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEMousePressed
        if(J){
            txtHora=txtJE;
            moverHorario(JE);
        }
    }//GEN-LAST:event_JEMousePressed

    private void JSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JSMouseEntered

    private void JSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSMousePressed
        if(J){
            txtHora=txtJS;
            moverHorario(JS);
        }
    }//GEN-LAST:event_JSMousePressed

    private void VEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEMousePressed
        if(V){
            txtHora=txtVE;
            moverHorario(VE);
        }
    }//GEN-LAST:event_VEMousePressed

    private void VSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VSMousePressed
        if(V){
            txtHora=txtVS;
            moverHorario(VS);
        }
    }//GEN-LAST:event_VSMousePressed

    private void SEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEMousePressed
        if(S){
            txtHora=txtSE;
            moverHorario(SE);
        }
    }//GEN-LAST:event_SEMousePressed

    private void SSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SSMousePressed
        if(S){
            txtHora=txtSS;
            moverHorario(SS);
        }
    }//GEN-LAST:event_SSMousePressed

    private void DEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEMousePressed
        if(D){
            txtHora=txtDE;
            moverHorario(DE);
        }
    }//GEN-LAST:event_DEMousePressed

    private void DSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DSMousePressed
        if(D){
            txtHora=txtDS;
            moverHorario(DS);
        }
    }//GEN-LAST:event_DSMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        cambiarTxtNombre();
    }//GEN-LAST:event_txtNombreMousePressed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(btnHover);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(btnNorm);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        //guardarHorario();
    }//GEN-LAST:event_btnGuardarMousePressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        cambiarTxtNombre();
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarHorario();
        if(FC!=null){
            FC.actualizarTxtHorarios();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void cambiarTxtNombre(){
        if(txtNombre.getText().equals("Escribe el nombre del horario...")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.BLACK);
        }       
    }
    
    private void guardarHorario(){
        //obtener los datos
        String nombre=txtNombre.getText();
        if(nombre.equals("") || nombre.equals("Escribe el nombre del horario...")){
            new FrameError(null,"Nombre de horario invalido").setVisible(true);
        }
        else{
            if(comprobarSiExisteHorario(nombre)){
                new FrameError(null,"Este nombre de horario ya existe").setVisible(true);
            }
            else{
                //obtener horas
                String le=txtLE.getText();
                String ls=txtLS.getText();

                String me=txtME.getText();
                String ms=txtMS.getText();

                String mme=txtMME.getText();
                String mms=txtMMS.getText();

                String je=txtJE.getText();
                String js=txtJS.getText();

                String ve=txtVE.getText();
                String vs=txtVS.getText();

                String se=txtSE.getText();
                String ss=txtSS.getText();

                String de=txtDE.getText();
                String ds=txtDS.getText();

                add.agregarHorarios(nombre,L,le,ls,M,me,ms,MM,mme,mms,J,je,js,V,ve,vs,S,se,ss,D,de,ds);
                restaurarFrame();
            }
        }
    }
    
    private boolean comprobarSiExisteHorario(String nombre){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from horarios");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                if (rs.getString("nombre").equals(nombre)){
                    return true;
                }
            }
            
            return false;
        }catch(SQLException ex){
            System.out.println(ex);
            return false;
        } 
    }
    
    private void restaurarFrame(){
        txtNombre.setText("Escribe el nombre del horario...");
        txtNombre.setForeground(Color.gray);
        L=false;
        M=false;
        MM=false;
        J=false;
        V=false;
        S=false;
        D=false;
        
        apagarTxt();
        bloquearTxtHoras();
        cambiarBtns();
    }
    
    private void moverHorario(JLabel la){
        int Mx=la.getX();
        int My=la.getY();
        reloj.showPopup(this, Mx, My);
    }
    
    private void bloquearTxtHoras(){
        if(L){
            LE.setIcon(iconoReloj);
            LS.setIcon(iconoReloj);
        }
        else{
            LE.setIcon(iconoRelojApagado);
            LS.setIcon(iconoRelojApagado);
        }
        
        if(M){
            ME.setIcon(iconoReloj);
            MS.setIcon(iconoReloj);
        }
        else{
            ME.setIcon(iconoRelojApagado);
            MS.setIcon(iconoRelojApagado);
        }
        
        if(MM){
            MIE.setIcon(iconoReloj);
            MIS.setIcon(iconoReloj);
        }
        else{
            MIE.setIcon(iconoRelojApagado);
            MIS.setIcon(iconoRelojApagado);
        }   
        
        if(J){
            JE.setIcon(iconoReloj);
            JS.setIcon(iconoReloj);
        }
        else{
            JE.setIcon(iconoRelojApagado);
            JS.setIcon(iconoRelojApagado);
        }
        
        if(V){
            VE.setIcon(iconoReloj);
            VS.setIcon(iconoReloj);
        }
        else{
            VE.setIcon(iconoRelojApagado);
            VS.setIcon(iconoRelojApagado);
        }
        
        if(S){
            SE.setIcon(iconoReloj);
            SS.setIcon(iconoReloj);
        }
        else{
            SE.setIcon(iconoRelojApagado);
            SS.setIcon(iconoRelojApagado);
        }
        
        if(D){
            DE.setIcon(iconoReloj);
            DS.setIcon(iconoReloj);
        }
        else{
            DE.setIcon(iconoRelojApagado);
            DS.setIcon(iconoRelojApagado);
        }
    }
    
    private void apagarTxt(){
        txtLE.setEditable(L);
        txtLS.setEditable(L);
        
        txtME.setEditable(M);
        txtMS.setEditable(M);
        
        txtMME.setEditable(MM);
        txtMMS.setEditable(MM);
        
        txtJE.setEditable(J);
        txtJS.setEditable(J);
        
        txtVE.setEditable(V);
        txtVS.setEditable(V);
        
        txtSE.setEditable(S);
        txtSS.setEditable(S);     
        
        txtDE.setEditable(D);
        txtDS.setEditable(D);     
    }
    
    private void cambiarBtns(){
        cambiarColorBotonHover(L,btnLunes);
        cambiarColorBotonHover(M,btnMartes);
        cambiarColorBotonHover(MM,btnMiercoles);
        cambiarColorBotonHover(J,btnJueves);
        cambiarColorBotonHover(V,btnViernes);
        cambiarColorBotonHover(S,btnSabado);
        cambiarColorBotonHover(D,btnDomingo);
    }
    
    private void cambiarColorBotonHover(boolean dia,JPanel btn){
        if(dia){
            btn.setBackground(btnHover);
        }
        else{
            btn.setBackground(btnHoverApagado);
        }        
    }
    
    private void cambiarColorBotonNorm(boolean dia,JPanel btn){
        if(dia){
            btn.setBackground(btnNorm);
        }
        else{
            btn.setBackground(btnNormApagado);
        }       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DE;
    private javax.swing.JLabel DS;
    private javax.swing.JLabel JE;
    private javax.swing.JLabel JS;
    private javax.swing.JLabel LE;
    private javax.swing.JLabel LS;
    private javax.swing.JLabel ME;
    private javax.swing.JLabel MIE;
    private javax.swing.JLabel MIS;
    private javax.swing.JLabel MS;
    private javax.swing.JLabel SE;
    private javax.swing.JLabel SS;
    private javax.swing.JLabel VE;
    private javax.swing.JLabel VS;
    private javax.swing.JPanel btnDomingo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel btnJueves;
    private javax.swing.JPanel btnLunes;
    private javax.swing.JPanel btnMartes;
    private javax.swing.JPanel btnMiercoles;
    private javax.swing.JPanel btnSabado;
    private javax.swing.JPanel btnViernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private com.raven.swing.TimePicker reloj;
    private javax.swing.JTextField txtDE;
    private javax.swing.JTextField txtDS;
    private javax.swing.JTextField txtJE;
    private javax.swing.JTextField txtJS;
    private javax.swing.JTextField txtLE;
    private javax.swing.JTextField txtLS;
    private javax.swing.JTextField txtME;
    private javax.swing.JTextField txtMME;
    private javax.swing.JTextField txtMMS;
    private javax.swing.JTextField txtMS;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSE;
    private javax.swing.JTextField txtSS;
    private javax.swing.JTextField txtVE;
    private javax.swing.JTextField txtVS;
    // End of variables declaration//GEN-END:variables
}
