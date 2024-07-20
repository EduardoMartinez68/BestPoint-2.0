package Reportes;

import ClasesGlobales.Buscar;
import ClasesGlobales.SepararTexto;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PanelReporte extends javax.swing.JPanel  implements Printable{
    Connection con;
    SepararTexto ST=new SepararTexto();
    
    String fechaInicial;
    String fechaFinal;
    //ver si ya llegue a la fecha necesaria 
    int yearInicial;
    int mesInicial;
    int diaInicial;

    int yearFinal;
    int mesFinal;
    int diaFinal;
    boolean fechaEncontrada=false;
    
    //definimos los datos de las tablas a usar
    private DefaultTableModel modeloVentasProductos=new DefaultTableModel();
    private DefaultTableModel modeloDevolucionesProductos=new DefaultTableModel();
    private DefaultTableModel modeloVentasProductosDepartamentos=new DefaultTableModel();
    private DefaultTableModel modeloDevolucionesProductosDepartamentos=new DefaultTableModel();
    
    //definimos los datos de los graficos a usar 
    DefaultPieDataset datosVentasProductos=new DefaultPieDataset();
    DefaultPieDataset datosDevolucionesProductos=new DefaultPieDataset();
    DefaultPieDataset datosVentasProductosDepartamentos=new DefaultPieDataset();
    DefaultPieDataset datosDevolucionesProductosDepartamentos=new DefaultPieDataset();
    
    //definimos los graficos
    JFreeChart graficoVentasProducto;
    ChartPanel panel;
    
    JFreeChart graficoDevolucionesProducto; 
    ChartPanel panel2;

    JFreeChart graficoVentasProductoDepartamento;
    ChartPanel panel3;
    
    JFreeChart graficoDevolucionesProductoDepartamento; 
    ChartPanel panel4;
    
    //variables del informe
    int ventas=0;
    int devoluciones=0;
    int ventasTotales=0;
    
    float ganancias=0;
    float perdidas=0;
    float gananciasTotales=0;
    
    float salidasTotales=0;
    float entradasTotales=0;
    
    Buscar search;
    
    public PanelReporte() {
        initComponents();
        llenarTitulosGrafica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtGanancias = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDevolucionesProducto = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txtSalidas = new javax.swing.JLabel();
        txtEntradas = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtVentasTotales = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaClientesDeuda = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableVentasProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtVentas = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDevoluciones = new javax.swing.JLabel();
        GraficaDevoluciones = new javax.swing.JPanel();
        GraficaVentas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableVentasDepartamento = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        GraficaVentasDepartamento = new javax.swing.JPanel();

        txtGanancias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGanancias.setForeground(new java.awt.Color(51, 255, 51));
        txtGanancias.setText("$0.00");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Entradas");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Ventas Totales");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Devoluciones por Ventas");

        TablaDevolucionesProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Devoluciones", "Perdida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaDevolucionesProducto);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Salidas");

        txtSalidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalidas.setForeground(new java.awt.Color(255, 0, 0));
        txtSalidas.setText("$0.00");

        txtEntradas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEntradas.setForeground(new java.awt.Color(51, 255, 51));
        txtEntradas.setText("$0.00");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Clientes");

        txtVentasTotales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtVentasTotales.setForeground(new java.awt.Color(51, 255, 51));
        txtVentasTotales.setText("0.00");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Ganancia");

        TablaClientesDeuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Deuda", "Pago de Deuda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaClientesDeuda);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Ventas por Producto");

        TableVentasProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Ganancias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TableVentasProductos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ventas");

        txtVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtVentas.setForeground(new java.awt.Color(51, 255, 51));
        txtVentas.setText("0.00");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Devoluciones");

        txtDevoluciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDevoluciones.setForeground(new java.awt.Color(255, 0, 0));
        txtDevoluciones.setText("0.00");

        GraficaDevoluciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout GraficaDevolucionesLayout = new javax.swing.GroupLayout(GraficaDevoluciones);
        GraficaDevoluciones.setLayout(GraficaDevolucionesLayout);
        GraficaDevolucionesLayout.setHorizontalGroup(
            GraficaDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        GraficaDevolucionesLayout.setVerticalGroup(
            GraficaDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        GraficaVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout GraficaVentasLayout = new javax.swing.GroupLayout(GraficaVentas);
        GraficaVentas.setLayout(GraficaVentasLayout);
        GraficaVentasLayout.setHorizontalGroup(
            GraficaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        GraficaVentasLayout.setVerticalGroup(
            GraficaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        TableVentasDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Departamento", "Cantidad", "Ganancias"
            }
        ));
        jScrollPane5.setViewportView(TableVentasDepartamento);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Ventas por Departamento");

        GraficaVentasDepartamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GraficaVentasDepartamento.setPreferredSize(new java.awt.Dimension(452, 255));

        javax.swing.GroupLayout GraficaVentasDepartamentoLayout = new javax.swing.GroupLayout(GraficaVentasDepartamento);
        GraficaVentasDepartamento.setLayout(GraficaVentasDepartamentoLayout);
        GraficaVentasDepartamentoLayout.setHorizontalGroup(
            GraficaVentasDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        GraficaVentasDepartamentoLayout.setVerticalGroup(
            GraficaVentasDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGanancias))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVentasTotales))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVentas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDevoluciones))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GraficaDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GraficaVentasDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addComponent(GraficaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(293, 293, 293))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(456, 456, 456)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(18, 18, 18)
                            .addComponent(txtSalidas))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEntradas)))
                    .addContainerGap(693, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtDevoluciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtVentasTotales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGanancias))
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GraficaVentasDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GraficaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GraficaDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 993, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtEntradas))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtSalidas))
                    .addContainerGap(2318, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1472, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarTitulosGrafica(){
        modeloVentasProductos.addColumn("Productos");
        modeloVentasProductos.addColumn("Ventas");
        modeloVentasProductos.addColumn("Ganancias");
        
        modeloDevolucionesProductos.addColumn("Productos");
        modeloDevolucionesProductos.addColumn("Devoluciones");
        modeloDevolucionesProductos.addColumn("Perdidas");    
   
        modeloVentasProductosDepartamentos.addColumn("Departamento");
        modeloVentasProductosDepartamentos.addColumn("Cantidad");
        modeloVentasProductosDepartamentos.addColumn("Ganancias");
        
        modeloDevolucionesProductosDepartamentos.addColumn("Departamento");
        modeloDevolucionesProductosDepartamentos.addColumn("Cantidad");
        modeloDevolucionesProductosDepartamentos.addColumn("Perdidas");  
    }
    
    public void conectar(Connection con){
        this.con=con;
        search=new Buscar(con);
    }
    
    public void buscar(String fechaInicial,String fechaFinal){
        //reiniciamos los datos 
        ventas=0;
        devoluciones=0;
        ventasTotales=0;

        ganancias=0;
        perdidas=0;
        gananciasTotales=0;

        salidasTotales=0;
        entradasTotales=0;
        
        //definimos la informacion de los graficos a usar 
        datosVentasProductos=new DefaultPieDataset();
        datosDevolucionesProductos=new DefaultPieDataset();   
        
        datosVentasProductosDepartamentos=new DefaultPieDataset();
        datosDevolucionesProductosDepartamentos=new DefaultPieDataset();   
        
        //defininmos nuevos valores de la tabla 
        modeloVentasProductos=new DefaultTableModel();
        modeloDevolucionesProductos=new DefaultTableModel();
        modeloVentasProductosDepartamentos=new DefaultTableModel();
        modeloDevolucionesProductosDepartamentos=new DefaultTableModel();
        
        llenarTitulosGrafica();
        
        //obtenemos la nueva informacion 
        this.fechaInicial=fechaInicial;
        this.fechaFinal=fechaFinal;
        //ver si ya llegue a la fecha necesaria 
        yearInicial=ST.obtenerYears(fechaInicial);
        mesInicial=ST.obtenerMesNum(fechaInicial);
        diaInicial=ST.obtenerDia(fechaInicial);
        
        yearFinal=ST.obtenerYears(fechaFinal);
        mesFinal=ST.obtenerMesNum(fechaFinal);
        diaFinal=ST.obtenerDia(fechaFinal);
        
        actualizarTablaProducto();
        actualizarTablaProductoDepartamento();
        actualizarGraficos();
        actualizarDatos();
    }
    
    private void actualizarGraficos(){
        //actualizamos grafico de ventas por producto
        graficoVentasProducto=ChartFactory.createPieChart(
            "Porcentaje de productos vendidos",
            datosVentasProductos,
            true,
            true,
            false
        );
        
        panel=new ChartPanel(graficoVentasProducto,false);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));
        
        GraficaVentas.setLayout(new BorderLayout());
        GraficaVentas.add(panel,BorderLayout.NORTH); 
        
        //actualizar tabla de devoluciones por producto
        graficoDevolucionesProducto=ChartFactory.createPieChart(
            "Porcentaje de productos devueltos",
            datosDevolucionesProductos,
            true,
            true,
            false
        );        
        
        panel2=new ChartPanel(graficoDevolucionesProducto);
        panel2.setMouseWheelEnabled(true);
        panel2.setPreferredSize(new Dimension(400,200));
        
        GraficaDevoluciones.setLayout(new BorderLayout());
        GraficaDevoluciones.add(panel2,BorderLayout.NORTH); 
        
        //actualizamos tabla de ventas por departamento 
        graficoVentasProductoDepartamento=ChartFactory.createPieChart(
            "Porcentaje de productos vendidos por departamento",
            datosVentasProductosDepartamentos,
            true,
            true,
            false
        );
        
        panel3=new ChartPanel(graficoVentasProductoDepartamento,false);
        panel3.setMouseWheelEnabled(true);
        panel3.setPreferredSize(new Dimension(400,200));
       
        
        GraficaVentasDepartamento.setLayout(new BorderLayout());
        GraficaVentasDepartamento.add(panel3,BorderLayout.NORTH); 
        
        //repaint();        
    }
    
    private void actualizarDatos(){
        ganancias=ganancias+perdidas;
        txtDevoluciones.setText(devoluciones+"");
        txtEntradas.setText(entradasTotales+"");
        txtGanancias.setText(ganancias+"");
        txtSalidas.setText(salidasTotales+"");
        txtVentas.setText(ventas+"");
        txtVentasTotales.setText((ventas-devoluciones)+"");     
        
        //ganancias-perdidas
    }
    
    //actualizar tablas por departamento 
    private void actualizarTablaProducto(){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from productos");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                String producto=rs.getString("nombre");
                llenarTablaVentas(producto);
                llenarTablaDevoluciones(producto);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de compras");
            System.out.println(ex.getNextException());
        } 
        
        //agregar informacion a la tabla
        this.TableVentasProductos.setModel(modeloVentasProductos);
        this.TablaDevolucionesProducto.setModel(modeloDevolucionesProductos);
    }    
    
    
    
    
    
    //actualizar tabla de productos 
    private void actualizarTablaProductoDepartamento(){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from departamento");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                String departamento=rs.getString("nombre");
                llenarTablaVentasDepartamento(departamento);
                //llenarTablaDevolucionesDepartamento(departamento);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de ventas por departamentos");
            System.out.println(ex.getNextException());
        } 
        
        //agregar informacion a la tabla
        this.TableVentasDepartamento.setModel(modeloVentasProductosDepartamentos);
        //this.TablaDevolucionesDepartamento.setModel(modeloDevolucionesProductos);
    }
    
    //llenar tabla de ventas por producto
    private void llenarTablaVentas(String producto){
        fechaEncontrada=false;
        int cantidadVendido=0;
        float ganancia=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                if(buscarFecha(rs.getString("turnocajero"))){
                    if(producto.equals(rs.getString("producto"))){
                        cantidadVendido+=rs.getInt("cantidad");
                        ganancia+=rs.getFloat("precio");
                    }
                }
            }
            
            //comprobar que se vendio mas de 0 veces 
            if(cantidadVendido>0){
                String []info=new String[3];
                info[0]=producto;
                info[1]=cantidadVendido+"";
                info[2]=ganancia+"";
                
                getModeloVentasProductos().addRow(info);
                
                ventas+=cantidadVendido;
                ganancias+=ganancia;
                
                //agregar valor a grafico
                datosVentasProductos.setValue(producto,cantidadVendido);
            }
            
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de compras");
            System.out.println(ex.getNextException());
        }         
    }
    
    private boolean buscarFecha(String fecha){
        String nuevoHorario=ST.obtenerFecha(fecha);
        
        //obtenemos los valores del nuevo horario
        int yearNuevo=ST.obtenerYears(nuevoHorario);
        int mesNuevo=ST.obtenerMesNum(nuevoHorario);
        int diaNuevo=ST.obtenerDia(nuevoHorario);  
        
        //comprobamos la logica de las fechas
        if(yearNuevo==yearInicial && mesNuevo==mesInicial && diaNuevo==diaInicial){
            fechaEncontrada=true;
        }
        
        //si ya encontramos la fecha inicial vemos la logica
        if(fechaEncontrada){
            if(yearNuevo<yearFinal){
                return true;
            }
            else if(yearNuevo==yearFinal){
                if(mesNuevo<mesFinal){
                    return true;
                }
                else if(mesNuevo==mesFinal){
                    if(diaNuevo<=diaFinal){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        
        return false;
    }
    
    private void encontrarFecha(String nuevoHorario){
        //ver si ya llegue a la fecha necesaria 
        int yearInicial=ST.obtenerYears(fechaInicial);
        int mesInicial=ST.obtenerMesNum(fechaInicial);
        int diaInicial=ST.obtenerDia(fechaInicial);
        
        int yearFinal=ST.obtenerYears(fechaFinal);
        int mesFinal=ST.obtenerMesNum(fechaFinal);
        int diaFinal=ST.obtenerDia(fechaFinal);
        
        //obtenemos los valores del nuevo horario
        int yearNuevo=ST.obtenerYears(nuevoHorario);
        int mesNuevo=ST.obtenerMesNum(nuevoHorario);
        int diaNuevo=ST.obtenerDia(nuevoHorario);  
        
        //comprobamos la logica de las fechas
        if((yearNuevo>=yearInicial && yearNuevo<=yearFinal)  && (mesNuevo>=mesInicial && mesNuevo<=mesFinal) && (diaNuevo>=diaInicial && diaNuevo<=diaFinal)){
            
        }
        
        if(nuevoHorario.equals(fechaInicial)){
            fechaEncontrada=true;
        }
        
        if(nuevoHorario.equals(fechaFinal)){
            fechaEncontrada=false;
        }        
    }
    
    //llenar tablas por departamento
    private void llenarTablaVentasDepartamento(String departamento){
        fechaEncontrada=false;
        int cantidadVendido=0;
        float ganancia=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                //comprobamos que el id del producto no sea nulo
                if(null!=rs.getString("idproducto")){
                    //obtenemos el id del producto 
                    int idProducto=rs.getInt("idproducto");
                    search.buscarProductoId(idProducto);
                    if(buscarFecha(rs.getString("turnocajero"))){
                        if(departamento.equals(search.Ubicacion())){

                                cantidadVendido+=rs.getInt("cantidad");
                                ganancia+=rs.getFloat("precio");


                        }
                    }
                }
            }
            
            //comprobar que se vendio mas de 0 veces 
            if(cantidadVendido>0){
                String []info=new String[3];
                info[0]=departamento;
                info[1]=cantidadVendido+"";
                info[2]=ganancia+"";
                
                getModeloVentasProductosDepartamentos().addRow(info);
                
                //agregar valor a grafico
                datosVentasProductosDepartamentos.setValue(departamento,cantidadVendido);
            }
            
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de compras");
            System.out.println(ex.getNextException());
        }         
    }    
    
    private DefaultTableModel getModeloVentasProductos(){
        return modeloVentasProductos;
    }
    
    private DefaultTableModel getModeloVentasProductosDepartamentos(){
        return modeloVentasProductosDepartamentos;
    }
    //llenar la tabla de devoluciones
    private void llenarTablaDevoluciones(String producto){
        fechaEncontrada=false;
        int cantidadDevueltos=0;
        float perdida=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from devoluciones");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                if(buscarFecha(rs.getString("turnocajero"))){
                    if(producto.equals(rs.getString("producto"))){
                        cantidadDevueltos+=1;
                        perdida-=rs.getFloat("precio");
                    }
                }
            }
            
            //comprobar que se vendio mas de 0 veces 
            if(cantidadDevueltos>0){
                String []info=new String[3];
                info[0]=producto;
                info[1]=cantidadDevueltos+"";
                info[2]=perdida+"";
                
                getModeloDevolucionesProductos().addRow(info);
                
                devoluciones+=cantidadDevueltos;
                perdidas+=perdida;
                
                //agregar valor a grafica
                datosDevolucionesProductos.setValue(producto,cantidadDevueltos);
            }
            
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de compras");
            System.out.println(ex.getNextException());
        }         
    } 
    
    private void llenarTablaDevolucionesDepartamentos(String departamento){
        fechaEncontrada=false;
        int cantidadDevueltos=0;
        float perdida=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from devoluciones");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                if(departamento.equals(rs.getString("producto"))){
                    if(buscarFecha(rs.getString("turnocajero"))){
                        cantidadDevueltos+=1;
                        perdida-=rs.getFloat("precio");
                    }
                }
            }
            
            //comprobar que se vendio mas de 0 veces 
            if(cantidadDevueltos>0){
                String []info=new String[3];
                info[0]=departamento;
                info[1]=cantidadDevueltos+"";
                info[2]=perdida+"";
                
                getModeloDevolucionesProductos().addRow(info);
                
                //agregar valor a grafica
                datosDevolucionesProductosDepartamentos.setValue(departamento,cantidadDevueltos);
            }
            
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de compras");
            System.out.println(ex.getNextException());
        }         
    } 
    
    private DefaultTableModel getModeloDevolucionesProductos(){
        return modeloDevolucionesProductos;
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex==0){
            Graphics2D graphics2d=(Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        }
        else{
            return NO_SUCH_PAGE;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraficaDevoluciones;
    private javax.swing.JPanel GraficaVentas;
    private javax.swing.JPanel GraficaVentasDepartamento;
    private javax.swing.JTable TablaClientesDeuda;
    private javax.swing.JTable TablaDevolucionesProducto;
    private javax.swing.JTable TableVentasDepartamento;
    private javax.swing.JTable TableVentasProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel txtDevoluciones;
    private javax.swing.JLabel txtEntradas;
    private javax.swing.JLabel txtGanancias;
    private javax.swing.JLabel txtSalidas;
    private javax.swing.JLabel txtVentas;
    private javax.swing.JLabel txtVentasTotales;
    // End of variables declaration//GEN-END:variables
}
