package Opciones;

import ClasesGlobales.convertir;
import java.awt.Color;
import puntoventa.FrameInventario;

public class FrameHorario extends javax.swing.JFrame {
    FrameInventario JF;
    Color colorBtnFondo=new Color(22,35,105);
    Color colorBtnFondoHover= new Color(46,69,209);
    FrameOpcionesCajeros FI;
    int horaio;
    convertir conver=new convertir();
            
    public FrameHorario(FrameInventario JF,FrameOpcionesCajeros FI,int horaio) {
        this.JF=JF;
        this.FI=FI;
        this.horaio=horaio;
        initComponents();
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
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnSumHora = new javax.swing.JButton();
        btnMinHora = new javax.swing.JButton();
        txtMinutos = new javax.swing.JTextField();
        btnSumMinuto = new javax.swing.JButton();
        btnMinMinuto = new javax.swing.JButton();
        txtTiempo = new javax.swing.JTextField();
        btnSumPmAm = new javax.swing.JButton();
        btnMinPmAm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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
        jLabel17.setText("Seleccion de horario");

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

        txtHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setText("00");

        btnSumHora.setBackground(new java.awt.Color(22, 35, 105));
        btnSumHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flechas.png"))); // NOI18N
        btnSumHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumHoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumHoraMouseExited(evt);
            }
        });
        btnSumHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumHoraActionPerformed(evt);
            }
        });

        btnMinHora.setBackground(new java.awt.Color(22, 35, 105));
        btnMinHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flechas2.png"))); // NOI18N
        btnMinHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinHoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinHoraMouseExited(evt);
            }
        });
        btnMinHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinHoraActionPerformed(evt);
            }
        });

        txtMinutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMinutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinutos.setText("00");

        btnSumMinuto.setBackground(new java.awt.Color(22, 35, 105));
        btnSumMinuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flechas.png"))); // NOI18N
        btnSumMinuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumMinuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumMinutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumMinutoMouseExited(evt);
            }
        });
        btnSumMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumMinutoActionPerformed(evt);
            }
        });

        btnMinMinuto.setBackground(new java.awt.Color(22, 35, 105));
        btnMinMinuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flechas2.png"))); // NOI18N
        btnMinMinuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinMinuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMinutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMinutoMouseExited(evt);
            }
        });
        btnMinMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinMinutoActionPerformed(evt);
            }
        });

        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setText("AM");

        btnSumPmAm.setBackground(new java.awt.Color(22, 35, 105));
        btnSumPmAm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flechas.png"))); // NOI18N
        btnSumPmAm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumPmAm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumPmAmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumPmAmMouseExited(evt);
            }
        });
        btnSumPmAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumPmAmActionPerformed(evt);
            }
        });

        btnMinPmAm.setBackground(new java.awt.Color(22, 35, 105));
        btnMinPmAm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flechas2.png"))); // NOI18N
        btnMinPmAm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinPmAm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinPmAmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinPmAmMouseExited(evt);
            }
        });
        btnMinPmAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinPmAmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText(":");

        btnGuardar.setBackground(new java.awt.Color(22, 35, 105));
        btnGuardar.setForeground(new java.awt.Color(22, 35, 105));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disco.png"))); // NOI18N
        jLabel2.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(new java.awt.Color(22, 35, 105));
        btnCancelar.setForeground(new java.awt.Color(22, 35, 105));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circulo-cruzado.png"))); // NOI18N
        jLabel3.setText("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSumHora, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSumMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSumPmAm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnMinHora, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnMinMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnMinPmAm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSumHora)
                        .addGap(6, 6, 6)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSumMinuto)
                        .addGap(6, 6, 6)
                        .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSumPmAm)
                        .addGap(6, 6, 6)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinHora)
                    .addComponent(btnMinMinuto)
                    .addComponent(btnMinPmAm))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
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
        
    }//GEN-LAST:event_jPanel10MousePressed

    private void btnSumHoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumHoraMouseEntered
        btnSumHora.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnSumHoraMouseEntered

    private void btnSumMinutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumMinutoMouseEntered
        btnSumMinuto.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnSumMinutoMouseEntered

    private void btnSumPmAmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumPmAmMouseEntered
       btnSumPmAm.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnSumPmAmMouseEntered

    private void btnMinHoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinHoraMouseEntered
        btnMinHora.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnMinHoraMouseEntered

    private void btnMinMinutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMinutoMouseEntered
        btnMinMinuto.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnMinMinutoMouseEntered

    private void btnMinPmAmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinPmAmMouseEntered
        btnMinPmAm.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnMinPmAmMouseEntered

    private void btnSumHoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumHoraMouseExited
        btnSumHora.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnSumHoraMouseExited

    private void btnSumMinutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumMinutoMouseExited
        btnSumMinuto.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnSumMinutoMouseExited

    private void btnSumPmAmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumPmAmMouseExited
        btnSumPmAm.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnSumPmAmMouseExited

    private void btnMinHoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinHoraMouseExited
       btnMinHora.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnMinHoraMouseExited

    private void btnMinMinutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMinutoMouseExited
        btnMinMinuto.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnMinMinutoMouseExited

    private void btnMinPmAmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinPmAmMouseExited
        btnMinPmAm.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnMinPmAmMouseExited

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(colorBtnFondo);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(colorBtnFondoHover);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        guardarHorario();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnSumHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumHoraActionPerformed
        //comprobar que no se pase 
        int hora=conver.convertirStringInt(txtHora.getText());
        if(hora>=12){
            txtHora.setText(0+"");
        }
        else{
            txtHora.setText((hora+1)+"");
        }
    }//GEN-LAST:event_btnSumHoraActionPerformed

    private void btnSumMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumMinutoActionPerformed
        //comprobar que no se pase 
        int minutos=conver.convertirStringInt(txtMinutos.getText());
        if(minutos>=60){
            txtMinutos.setText(0+"");
        }
        else{
            txtMinutos.setText((minutos+1)+"");
        }
    }//GEN-LAST:event_btnSumMinutoActionPerformed

    private void btnSumPmAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumPmAmActionPerformed
        if(txtTiempo.getText().equals("PM")){
            txtTiempo.setText("AM");
        }
        else{
            txtTiempo.setText("PM");
        }
    }//GEN-LAST:event_btnSumPmAmActionPerformed

    private void btnMinPmAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinPmAmActionPerformed
        if(txtTiempo.getText().equals("PM")){
            txtTiempo.setText("AM");
        }
        else{
            txtTiempo.setText("PM");
        }
    }//GEN-LAST:event_btnMinPmAmActionPerformed

    private void btnMinMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinMinutoActionPerformed
        //comprobar que no se pase 
        int minutos=conver.convertirStringInt(txtMinutos.getText());
        if(minutos<=0){
            txtMinutos.setText(60+"");
        }
        else{
            txtMinutos.setText((minutos-1)+"");
        }
    }//GEN-LAST:event_btnMinMinutoActionPerformed

    private void btnMinHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinHoraActionPerformed
        //comprobar que no se pase 
        int hora=conver.convertirStringInt(txtHora.getText());
        if(hora<=0){
            txtHora.setText(12+"");
        }
        else{
            txtHora.setText((hora-1)+"");
        }
    }//GEN-LAST:event_btnMinHoraActionPerformed

    private void guardarHorario(){
        //obtener los datos en pantalla 
        int hora=conver.convertirStringInt(txtHora.getText());
        int minutos=conver.convertirStringInt(txtMinutos.getText());
        String time=txtTiempo.getText();
        
        //guardar la hora 
        if(horaio==0){
            if(hora<10){
                if(minutos<10){
                    FI.setTxtHoraEntrada("0"+hora+":0"+minutos+":"+time);
                }
                else{
                    FI.setTxtHoraEntrada("0"+hora+":"+minutos+":"+time);
                }
            }
            else{
                if(minutos<10){
                    FI.setTxtHoraEntrada(+hora+":0"+minutos+":"+time);
                }
                else{
                    FI.setTxtHoraEntrada(hora+":"+minutos+":"+time);
                }
            }
        }
        else{
            if(hora<10){
                if(minutos<10){
                    FI.setTxtHoraSalida("0"+hora+":0"+minutos+":"+time);
                }
                else{
                    FI.setTxtHoraSalida("0"+hora+":"+minutos+":"+time);
                }
            }
            else{
                if(minutos<10){
                    FI.setTxtHoraSalida(+hora+":0"+minutos+":"+time);
                }
                else{
                    FI.setTxtHoraSalida(hora+":"+minutos+":"+time);
                }
            }
        }
        
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JButton btnMinHora;
    private javax.swing.JButton btnMinMinuto;
    private javax.swing.JButton btnMinPmAm;
    private javax.swing.JButton btnSumHora;
    private javax.swing.JButton btnSumMinuto;
    private javax.swing.JButton btnSumPmAm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
