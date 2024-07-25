package Cortes;

import ClasesGlobales.Agregar;
import ClasesGlobales.Buscar;
import ClasesGlobales.Eliminar;
import ClasesGlobales.convertir;
import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;

public class PanelCorte extends javax.swing.JPanel implements Printable{
    Connection con;
    Agregar add;
    Eliminar delete;
    Buscar search;
    convertir conver=new convertir();
    
    float dineroSalidas=0;
    float dineroEntradas=0;
    float dineroCaja=0;
    float dineroDevoluciones=0;
    float dineroVentas=0;
    float dineroTarjeta=0;
    float totalNuevaDeuda=0;
    
    public PanelCorte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelFondoCaja = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelVentasEfectivo = new javax.swing.JLabel();
        label34 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelEntradas = new javax.swing.JLabel();
        labelSalida = new javax.swing.JLabel();
        labelDevoluciones = new javax.swing.JLabel();
        labelTotalCaja = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelVentaEfectivo = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labelVentasDevoluciones = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelVentasTotal = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labelEntradaEfectivoPorque = new javax.swing.JLabel();
        labelEntradaEfectivoDinero = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        labelSalidaEfectivoPorque = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        labelSalidaEfectivoDinero = new javax.swing.JLabel();
        labelGananciasTotal = new javax.swing.JLabel();
        labelGananciasTotalFinal = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtClientes = new javax.swing.JLabel();
        txtDeudaCliente = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtClientePagoDeuda = new javax.swing.JLabel();
        txtDineroClientePagoDeuda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTotalDeudasClientes = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelVentasTarjeta = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("$ Ganancia");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("$ Ventas Totales ");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Dinero en caja");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Reporte del dia");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fondo de caja");

        labelFondoCaja.setForeground(new java.awt.Color(0, 0, 0));
        labelFondoCaja.setText("$0.00");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("En Efectivo");

        labelVentasEfectivo.setForeground(new java.awt.Color(0, 204, 51));
        labelVentasEfectivo.setText("$0.00");

        label34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label34.setForeground(new java.awt.Color(0, 0, 0));
        label34.setText("Entradas");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Salida");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Devoluciones en efectivo");

        labelEntradas.setForeground(new java.awt.Color(0, 204, 51));
        labelEntradas.setText("$0.00");

        labelSalida.setForeground(new java.awt.Color(255, 0, 0));
        labelSalida.setText("$0.00");

        labelDevoluciones.setForeground(new java.awt.Color(255, 0, 0));
        labelDevoluciones.setText("$0.00");

        labelTotalCaja.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalCaja.setText("$0.00");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Ventas en Efectivo");

        labelVentaEfectivo.setForeground(new java.awt.Color(0, 204, 51));
        labelVentaEfectivo.setText("$0.00");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Devoluciones de ventas");

        labelVentasDevoluciones.setForeground(new java.awt.Color(255, 0, 0));
        labelVentasDevoluciones.setText("$-0.00");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        labelVentasTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelVentasTotal.setText("$0.00");

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 255));
        jLabel25.setText("Clientes con su deudas");

        labelEntradaEfectivoPorque.setForeground(new java.awt.Color(0, 0, 0));
        labelEntradaEfectivoPorque.setText("Motivos");

        labelEntradaEfectivoDinero.setForeground(new java.awt.Color(0, 0, 0));
        labelEntradaEfectivoDinero.setText("$Depositos");

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 255));
        jLabel28.setText("Salidas de efectivo");

        labelSalidaEfectivoPorque.setForeground(new java.awt.Color(0, 0, 0));
        labelSalidaEfectivoPorque.setText("Motivos");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("--------------");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("--------------");

        labelSalidaEfectivoDinero.setForeground(new java.awt.Color(0, 0, 0));
        labelSalidaEfectivoDinero.setText("$Deposito");

        labelGananciasTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGananciasTotal.setForeground(new java.awt.Color(153, 153, 255));
        labelGananciasTotal.setText("0");

        labelGananciasTotalFinal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGananciasTotalFinal.setForeground(new java.awt.Color(153, 153, 255));
        labelGananciasTotalFinal.setText("0");

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 255));
        jLabel26.setText("Entradas de efectivo");

        txtClientes.setForeground(new java.awt.Color(0, 0, 0));
        txtClientes.setText("Cliente");

        txtDeudaCliente.setForeground(new java.awt.Color(255, 0, 0));
        txtDeudaCliente.setText("$Deuda");

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 255));
        jLabel27.setText("Clientes y sus pago");

        txtClientePagoDeuda.setForeground(new java.awt.Color(0, 0, 0));
        txtClientePagoDeuda.setText("Cliente");

        txtDineroClientePagoDeuda.setForeground(new java.awt.Color(0, 204, 51));
        txtDineroClientePagoDeuda.setText("$Pago ");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Deudas de los clientes");

        labelTotalDeudasClientes.setForeground(new java.awt.Color(255, 0, 0));
        labelTotalDeudasClientes.setText("$0.00");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ventas con Tarjeta de Credito");

        labelVentasTarjeta.setForeground(new java.awt.Color(0, 204, 51));
        labelVentasTarjeta.setText("$0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelVentasTarjeta)
                                    .addComponent(labelVentaEfectivo)
                                    .addComponent(labelFondoCaja)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelGananciasTotalFinal)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addGap(305, 305, 305))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(labelGananciasTotal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelEntradaEfectivoPorque)
                                .addGap(67, 67, 67)
                                .addComponent(labelEntradaEfectivoDinero))
                            .addComponent(jLabel26)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelTotalCaja))
                                    .addComponent(jLabel31)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label34)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEntradas)
                                    .addComponent(labelSalida)
                                    .addComponent(labelDevoluciones)
                                    .addComponent(labelTotalDeudasClientes)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel18)
                            .addComponent(jLabel7)
                            .addComponent(jLabel25)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtClientes)
                                .addGap(58, 58, 58)
                                .addComponent(txtDeudaCliente)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelVentasEfectivo)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelVentasTotal)
                                                .addComponent(labelVentasDevoluciones)))
                                        .addGap(35, 35, 35))))
                            .addComponent(jLabel27)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtClientePagoDeuda)
                                .addGap(87, 87, 87)
                                .addComponent(txtDineroClientePagoDeuda))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel28)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelSalidaEfectivoPorque)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelSalidaEfectivoDinero))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addContainerGap(561, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSalidaEfectivoPorque)
                            .addComponent(labelSalidaEfectivoDinero))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientePagoDeuda)
                            .addComponent(txtDineroClientePagoDeuda)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelGananciasTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelGananciasTotalFinal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(labelVentasEfectivo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(labelVentasDevoluciones))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelVentasTotal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(labelFondoCaja))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(labelVentaEfectivo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(labelVentasTarjeta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label34)
                                    .addComponent(labelEntradas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(labelSalida))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(labelDevoluciones))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(labelTotalDeudasClientes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotalCaja)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelEntradaEfectivoPorque)
                                .addComponent(labelEntradaEfectivoDinero))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(22, 22, 22)))
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientes)
                            .addComponent(txtDeudaCliente))))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addContainerGap(482, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 258, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 259, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 749, 520));
    }// </editor-fold>//GEN-END:initComponents

    public void ingresarCon(Connection con){
        this.con=con;
        actualizarDatos();
    }
    
    //llenar los datos de los clientes
    
    private void llenarDatosClientes(){
        /*
        txtClientes.setText("");
        txtDeudaCliente.setText(""); 
        txtClientePagoDeuda.setText("");
        txtDineroClientePagoDeuda.setText(""); */
        
        String horarioActual=getTurno();
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from clientes");
            ResultSet rsBusqueda = sts.getResultSet();
            while(rsBusqueda.next()){
                String cliente=rsBusqueda.getString("nombre");
                calcularDeudaHor(cliente,horarioActual);
                calcularPagoDeuda(cliente,horarioActual);
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    private void calcularPagoDeuda(String cliente,String horarioActual){
        float deuda=0;
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from pagodeudacliente");
            ResultSet rsBusqueda = sts.getResultSet();
            while(rsBusqueda.next()){
                String clienteActual=rsBusqueda.getString("cliente");
                String horaPedido=rsBusqueda.getString("turnoCajero");
                //vemos que el cliente no sea nulo para que no nos salte un error
                if(clienteActual!=null){
                    if(clienteActual.equals(cliente) && horarioActual.equals(horaPedido)){
                        deuda+=rsBusqueda.getFloat("dineroRecibido");
                    }
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        
        //comprobar que si hay deuda nueva hoy 
        if(deuda>0){
            actualizarDatoClientePagar(cliente);
            actualizarDatosPadoDeuda(deuda+"");
        }
    }
    
    
    private void actualizarDatoClientePagar(String cliente){
        String viejoClientes=txtClientePagoDeuda.getName();
        String nuevoCliente="<html>"+viejoClientes+"<p>"+cliente+"<html>";
        txtClientePagoDeuda.setText(nuevoCliente);        
    }
    
    private void actualizarDatosPadoDeuda(String deuda){
        String viejaDeuda=txtDineroClientePagoDeuda.getName();
        String nuevaDeuda="<html>"+viejaDeuda+"<p>"+"$"+deuda+"<html>";
        txtDineroClientePagoDeuda.setText(nuevaDeuda);   
    }
    
    private void calcularDeudaHor(String cliente,String horarioActual){
        float deuda=0;
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from deudacliente");
            ResultSet rsBusqueda = sts.getResultSet();
            while(rsBusqueda.next()){
                String clienteActual=rsBusqueda.getString("cliente");
                String horaPedido=rsBusqueda.getString("turnoCajero");
                if(clienteActual.equals(cliente) && horarioActual.equals(horaPedido)){
                    deuda+=rsBusqueda.getFloat("total");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        
        //comprobar que si hay deuda nueva hoy 
        if(deuda>0){
            totalNuevaDeuda+=deuda;
            actualizarDatosClientes(cliente);
            actualizarDatosDeuda(deuda+"");
        }
    }
    
    private void actualizarDatosClientes(String cliente){
        String viejoClientes=txtClientes.getName();
        String nuevoCliente="<html>"+viejoClientes+"<p>"+cliente+"<html>";
        txtClientes.setText(nuevoCliente);
    }
    
    private void actualizarDatosDeuda(String deuda){
        String viejaDeuda=txtDeudaCliente.getName();
        String nuevaDeuda="<html>"+viejaDeuda+"<p>"+"$"+deuda+"<html>";
        txtDeudaCliente.setText(nuevaDeuda);        
    }
    
    private void actualizarDatos(){
        actualizarDineroTotal();
        actualizarSalidasEntradas();
        actualizarLabelFondoCaja();
        labelSalida.setText("$"+dineroSalidas+"");
        labelEntradas.setText("$"+dineroEntradas+"");
        llenarDatosClientes();
        
        sumarDinerosDia();
    }
    
    //sumar todo el dinero que tengo de entradas y salidas 
    private void sumarDinerosDia(){
        float total=dineroEntradas+dineroCaja+dineroVentas+dineroTarjeta-dineroDevoluciones+dineroSalidas-totalNuevaDeuda;
        
        labelTotalCaja.setText("$"+total);
        labelGananciasTotalFinal.setText("$"+total);
        labelTotalDeudasClientes.setText("$-"+totalNuevaDeuda);
    }
    
    //actualizar cuanto dinero hay en caja 
    private void actualizarLabelFondoCaja(){
        labelFondoCaja.setText("$"+obtenerDineroCaja());
    }
    
    private float obtenerDineroCaja(){
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from caja where id = 0");
            ResultSet rsBusqueda = sts.getResultSet();
            while(rsBusqueda.next()){
                float dinero=rsBusqueda.getFloat("dineroInicial");
                dineroCaja=dinero;
                return dinero;
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
        
        return 0;
    }
    
    
    //actualizar labelVentasDevoluciones
    private void actualizarDineroTotal(){
        labelVentasDevoluciones.setText("");
        labelVentasEfectivo.setText("");

        String horarioActual=getTurno();
        dineroDevoluciones=getDineroDevoluciones(horarioActual);
        dineroVentas=getDineroVentas(horarioActual);
        dineroTarjeta=getDineroTarjetas(horarioActual);
        
        labelVentasDevoluciones.setText("$-"+dineroDevoluciones);
        labelDevoluciones.setText("$-"+dineroDevoluciones);
        
        labelVentasEfectivo.setText("$"+dineroVentas);
        labelVentaEfectivo.setText("$"+dineroVentas);
        labelVentasTarjeta.setText("$"+dineroTarjeta);
        
        //esto esta bien 
        float total=dineroVentas-dineroDevoluciones;
        labelVentasTotal.setText("$"+total);
        labelGananciasTotal.setText("$"+total);
    }
    
    private float getDineroDevoluciones(String horarioActual){
        float precio=0;
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from devoluciones");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos las devoluciones
            while (rsBusqueda.next()){
                //ver si coinsiden con el horario actual
                String turno=rsBusqueda.getString("turnoCajero");
                if(turno.equals(horarioActual)){
                    precio+=rsBusqueda.getFloat("precio");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }    
        
        return precio;
    }
    
    private float getDineroVentas(String horarioActual){
        float precio=0;
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from ventas");
            ResultSet rsBusqueda = sts.getResultSet();

            //pasar por todos las devoluciones
            while (rsBusqueda.next()){
                //ver si coinsiden con el horario actual
                String turno=rsBusqueda.getString("turnoCajero");
                String tipoPago=rsBusqueda.getString("tipoPago");
                if(turno.equals(horarioActual) && tipoPago.equals("Efectivo")){
                    precio+=rsBusqueda.getFloat("precio");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }    
        
        return precio;
    }
    
    private float getDineroTarjetas(String horarioActual){
        float precio=0;
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from ventas");
            ResultSet rsBusqueda = sts.getResultSet();

            //pasar por todos las devoluciones
            while (rsBusqueda.next()){
                //ver si coinsiden con el horario actual
                String turno=rsBusqueda.getString("turnoCajero");
                String tipoPago=rsBusqueda.getString("tipoPago");
                if(turno.equals(horarioActual) && tipoPago.equals("Credito/Tarjeta")){
                    precio+=rsBusqueda.getFloat("precio");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }    
        
        return precio;
    }
    //poner todas las ventas por departamento 
    private void actualizarDatosDepartamento(){
        //borrar todas las pantallas
        /*
        labelEntradaEfectivoPorque.setText("");
        labelEntradaEfectivoDinero.setText("");
        labelSalidaEfectivoPorque.setText("");
        labelSalidaEfectivoDinero.setText("");*/
        
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from departamento");
            ResultSet rsBusqueda = sts.getResultSet();
            
            String horarioActual=getTurno();
            //pasar por todos los departamentos
            while (rsBusqueda.next()){
                leerTodasVentasDepartamento(horarioActual);
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
 
    private void leerTodasVentasDepartamento(String horarioActual){   
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from ventas");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos las ventas
            while (rsBusqueda.next()){
                //comprobar si es el horario seleccionado 
                String horarioEntradaSalida=rsBusqueda.getString("turno");
                if(horarioEntradaSalida.equals(horarioActual)){
                    //obtener los datos y llenarlos
                    String nuevaEntradaPorque=rsBusqueda.getString("porque");
                    float nuevaEntradaMovimiento=rsBusqueda.getFloat("movimiento");
                    verQueSalidaActualizar(nuevaEntradaPorque,nuevaEntradaMovimiento);
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    //actualizar datos de entradas y salidas 
    private void actualizarSalidasEntradas(){
        //borrar todas las pantallas
        /*
        labelEntradaEfectivoPorque.setText("");
        labelEntradaEfectivoDinero.setText("");
        labelSalidaEfectivoPorque.setText("");
        labelSalidaEfectivoDinero.setText("");*/
        
        try{
            Statement sts = con.createStatement();
            sts.execute("Select * from entradasysalidasdinero");
            ResultSet rsBusqueda = sts.getResultSet();
            
            String horarioActual=getTurno();
            //pasar por todos los pedidos
            while (rsBusqueda.next()){
                //comprobar si es el horario seleccionado 
                String horarioEntradaSalida=rsBusqueda.getString("turno");
                if(horarioEntradaSalida.equals(horarioActual)){
                    //obtener los datos y llenarlos
                    String nuevaEntradaPorque=rsBusqueda.getString("porque");
                    float nuevaEntradaMovimiento=rsBusqueda.getFloat("movimiento");
                    verQueSalidaActualizar(nuevaEntradaPorque,nuevaEntradaMovimiento);
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    private String getTurno(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String cajero=rs.getString("tiempoRegistro");
                return cajero;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        return "";        
    } 
    
    void verQueSalidaActualizar(String nuevaEntradaPorque,float nuevaEntradaMovimiento){
        if(nuevaEntradaMovimiento>=0){
            agregarEntradaDinero(nuevaEntradaPorque,nuevaEntradaMovimiento+"");
            dineroEntradas+=nuevaEntradaMovimiento;
        }
        else{
            agregarSalidaDinero(nuevaEntradaPorque,nuevaEntradaMovimiento+"");
            dineroSalidas+=nuevaEntradaMovimiento;
        }
    }
    
    void agregarEntradaDinero(String nuevaEntradaPorque,String nuevaEntradaMovimiento){
        String entradaPorque="<html>"+labelEntradaEfectivoPorque.getText()+"<p>"+nuevaEntradaPorque+"<html>";
        String entradaDinero="<html>"+labelEntradaEfectivoDinero.getText()+"<p>"+nuevaEntradaMovimiento+"<html>";
        
        //actualizar pantalla
        labelEntradaEfectivoPorque.setText(entradaPorque);
        labelEntradaEfectivoDinero.setText(entradaDinero);
    }
    
    void agregarSalidaDinero(String nuevaEntradaPorque,String nuevaEntradaMovimiento){
        String entradaPorque="<html>"+labelSalidaEfectivoPorque.getText()+"<p>"+nuevaEntradaPorque+"<html>";
        String entradaDinero="<html>"+labelSalidaEfectivoDinero.getText()+"<p>"+nuevaEntradaMovimiento+"<html>";
        
        //actualizar pantalla
        labelSalidaEfectivoPorque.setText(entradaPorque);
        labelSalidaEfectivoDinero.setText(entradaDinero);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label34;
    private javax.swing.JLabel labelDevoluciones;
    private javax.swing.JLabel labelEntradaEfectivoDinero;
    private javax.swing.JLabel labelEntradaEfectivoPorque;
    private javax.swing.JLabel labelEntradas;
    private javax.swing.JLabel labelFondoCaja;
    private javax.swing.JLabel labelGananciasTotal;
    private javax.swing.JLabel labelGananciasTotalFinal;
    private javax.swing.JLabel labelSalida;
    private javax.swing.JLabel labelSalidaEfectivoDinero;
    private javax.swing.JLabel labelSalidaEfectivoPorque;
    private javax.swing.JLabel labelTotalCaja;
    private javax.swing.JLabel labelTotalDeudasClientes;
    private javax.swing.JLabel labelVentaEfectivo;
    private javax.swing.JLabel labelVentasDevoluciones;
    private javax.swing.JLabel labelVentasEfectivo;
    private javax.swing.JLabel labelVentasTarjeta;
    private javax.swing.JLabel labelVentasTotal;
    private javax.swing.JLabel txtClientePagoDeuda;
    private javax.swing.JLabel txtClientes;
    private javax.swing.JLabel txtDeudaCliente;
    private javax.swing.JLabel txtDineroClientePagoDeuda;
    // End of variables declaration//GEN-END:variables
}
