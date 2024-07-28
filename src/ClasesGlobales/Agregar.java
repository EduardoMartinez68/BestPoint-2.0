/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package ClasesGlobales;

import Notificaciones.FrameCorrecto;
import Notificaciones.FrameError;
import Notificaciones.MessageCorrect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import puntoventa.FrameInventario;


public class Agregar {
    Connection con;
    JFrame JF;
    FrameInventario JF2;
    public Agregar(Connection con,JFrame JF,FrameInventario JF2){
        this.con=con;
        this.JF=JF;
        this.JF2=JF2;
    }
    
    public void actualizarToken(String token, String password) {
        try {
            Statement sts = con.createStatement();

            String sql = "UPDATE opciones SET " +
                         "administrador = '" + token + "', " +
                         "password = '" + password + "', " +
                         "WHERE id = " + 0;

            sts.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("No se puede actualizar");
        }
    }
    
    public void agregarOpciones(){
        try{
            Statement sts=con.createStatement();
            
            sts.executeUpdate("INSERT INTO opciones (id,administrador,password,correo,nombreempresa,fechaticket,despedidaticket,misproductosmanejaniva,imprimirlosimpuestosticket,rutlogo)"
                    +" VALUES ('"+0+"','admin','admin','admin','Nombre empresa','1','Despedida Tikcet','1','1','null')" );
            
            //sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println("No se puede agregar");
        }
    }
    
    public void carritoCompras(int idProducto,float cantidad,float total,int numCarrito){
        try{
            Statement sts=con.createStatement();
            
            sts.executeUpdate("INSERT INTO carritocompras (idproducto,cantidad,total,numcarrito)"
                    +" VALUES ('"+idProducto+"','"+cantidad+"','"+total+"','"+numCarrito+"' )" );
            
            //sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println("No se puede agregar");
            new FrameError(JF2,"Error "+e).setVisible(true);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }
    }  
    
    public void productos(String nombre,String descripcion,String codigoBarras,float costo,float ganancia,float precio,String seVendePor,String ubicacion,int cantidad,String usaInventario,String rutaImg,float precioporpeso,String unidad){
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO productos (nombre, descripcion, codigobarras, costo,ganancia, precio, sevendepor, ubicacion, cantidad, usainventario, rutimg, precioporpeso, unidad)"
                    +" VALUES ('"+nombre+"','"+ descripcion+"','"+codigoBarras+"','"+costo+"','"+ganancia+"','"+precio+"','"+seVendePor+"','"+ubicacion+"','"+cantidad+"','"+usaInventario+"','"+rutaImg+"','"+precioporpeso+"','"+unidad+"' )" );
            
            //(nombre, descripcion, codigoBarras, costo,ganancia, precio, seVendePor, ubicacion, cantidad, usaInventario)
            //sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println("Error al agregar");
            System.out.println(e);
            new FrameError(JF2,"Error "+e).setVisible(true);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }
    }
    
    public void tablaImpuestos(int id,String nombre, float precio){
       try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO tablasproductoiva (nombre,precio,idimpuesto)"
                    +" VALUES ('"+nombre+"','"+precio+"','"+id+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println("tablaImpuestos");
            new FrameError(JF2,"Error "+e).setVisible(true);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }
    }
    
    public void nuevoCajero(String nombre ,String usuario,String correo,String numero,int permiso,int permiso2,int permiso3,int permiso4,int permiso5,int permiso6,int permiso7,int permiso8,int permiso9,int permiso10,int permiso11,int permiso12,int permiso13,int permiso14,int permiso15,int permiso16,int permiso17,int permiso18,int permiso19){
        try{
            Statement sts=con.createStatement();
            
            sts.executeUpdate("INSERT INTO cajeros (usuario,password,turno,numero,permiso1,permiso2,permiso3,permiso4,permiso5,permiso6,permiso47,permiso8,permiso9,permiso10,permiso11,permiso12,permiso13,permiso14,permiso15,permiso16,permiso17,permiso18,permiso19)"
                    +" VALUES ('"+nombre+"','"+usuario+"','"+correo+"','"+numero+"' ,'"+permiso+"','"+permiso2+"','"+permiso3+"','"+permiso4+"','"+permiso5+"','"+permiso6+"','"+permiso7+"','"+permiso8+"','"+permiso9+"','"+permiso10+"','"+permiso11+"','"+permiso12+"','"+permiso13+"','"+permiso14+"','"+permiso15+"','"+permiso16+"','"+permiso17+"','"+permiso18+"','"+permiso19+"')" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println("No se puede agregar el cajero");
            new FrameError(JF2,"Error "+e).setVisible(true);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }
    }  
    
    public void agregarIvas(String nombre, float cantidad,int agregarAutomaticamente){
       try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO iva (nombre,cantidad,agregarautomaticamente)"
                    +" VALUES ('"+nombre+"','"+cantidad+"','"+agregarAutomaticamente+"' )" );
            
            sts.executeBatch();
            JOptionPane.showMessageDialog(JF, "Impuesto agregado");;
        }
        catch(SQLException e){
            System.out.println("agregarIvas");
            new FrameError(JF2,"Error "+e).setVisible(true);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }
    }
    
    public void productosYsusIvas(int id,String productoIva,String nombre,float precio){
       try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO productosivas  (id,productoiva,nombre,precio)"
                    +" VALUES ('"+id+"','"+productoIva+"','"+nombre+"','"+precio+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println("productosYsusIvas");
            new FrameError(JF2,"Error "+e).setVisible(true);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }        
    }
    
    public void agregarCaja(String nombreCajero,String tiempoRegistro,String turno, float dineroInicial,float dineroFinal){
       int id=0;
        try{
            Statement sts=con.createStatement();
              sts.executeUpdate("INSERT INTO caja (id,nombrecajero,tiemporegistro,turno,dineroinicial,dinerocaja,dinerofinal)"
                    +" VALUES ('"+id+"','"+nombreCajero+"','"+tiempoRegistro+"','"+turno+"','"+dineroInicial+"','"+dineroInicial+"','"+dineroFinal+"' )" );
                        
            sts.executeBatch();
        }
        catch(SQLException e){
            new FrameError(JF2,"Error "+e).setVisible(true);
            System.out.println("No se puede agregar caja");
            System.out.println(tiempoRegistro);
            System.out.println(e);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }   
    }

    //voy aqui 
    public void agregarDepartamento(String nombre){
       try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO departamento (nombre)"
                    +" VALUES ('"+nombre+"' )" );
            
            sts.executeBatch();
            JOptionPane.showMessageDialog(JF,"El producto fue agregado correctamente");
        }
        catch(SQLException e){
            new FrameError(JF2,"Error "+e).setVisible(true);
            //JOptionPane.showMessageDialog(JF, "Error "+e);
        }
    }
    
    public void agregarVentas(String cajero,String producto,int cantidad,float precio,String fecha,String tipoPago,int idProducto){
       String turnoCajero=getTurno();
       try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO ventas (cajero,producto,cantidad,precio,fecha,turnocajero,tipopago,idproducto)"
                    +" VALUES ('"+cajero+"','"+producto+"','"+cantidad+"','"+precio+"','"+fecha+"','"+turnoCajero+"','"+tipoPago+"','"+idProducto+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            new FrameError(JF2,"No se pudo agregar la venta a la base de datos").setVisible(true);
            //JOptionPane.showMessageDialog(JF, "No se pudo agregar la venta a la base de datos");
        }
    }
    
    public void agregarEntradasSalidas(String fecha,String nombreCajero,float movimiento,String porque,String turno){
       try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO entradasysalidasdinero (fecha,nombrecajero,movimiento,porque,turno)"
                    +" VALUES ('"+fecha+"','"+nombreCajero+"','"+movimiento+"','"+porque+"','"+turno+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            new FrameError(JF2,"No se pudo agregar la entrada/salida de dinero").setVisible(true);
            //JOptionPane.showMessageDialog(JF, "No se pudo agregar la entrada o salida a la base de datos");
        }
    }
    
    public void agregarDevoluciones(String producto,float precio,String fecha){
       String turno=getTurno();
       try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO devoluciones (producto,precio,fecha,turnocajero)"
                    +" VALUES ('"+producto+"','"+precio+"','"+fecha+"','"+turno+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(JF2,"No se pudo agregar a la base de datos").setVisible(true);
            //JOptionPane.showMessageDialog(JF, "No se pudo agregar a la base de datos");
        }
    }
    //aqui voy
    public void agregarCliente(String nombre,String direccion,String correo,String telefono,float credito){
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO clientes (nombre, direccion, correo, telefono, credito, deuda)"
                    +" VALUES ('"+nombre+"','"+direccion+"','"+correo+"','"+telefono+"','"+credito+"','"+0+"' )" );
            
            sts.executeBatch();
            
            //new FrameCorrecto(JF2,"Cliente agregado con exito").setVisible(true);
            //JOptionPane.showMessageDialog(JF,"Cliente agregado con exito");
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(JF2,"No se pudo agregar a la base de datos").setVisible(true);
            //JOptionPane.showMessageDialog(JF, "No se pudo agregar a la base de datos");
        }
    }
    
    public void agregarDeudaCliente(String cliente,String producto,String codigoBarras,float precio,int cantidad,float total){
        String turno=getTurno();
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO deudacliente (cliente, producto, codigobarras, precio, cantidad, total, turnocajero)"
                    +" VALUES ('"+cliente+"','"+producto+"','"+codigoBarras+"','"+precio+"','"+cantidad+"','"+total+"','"+turno+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(JF2,"No se pudo agregar a la base de datos la deuda").setVisible(true);
            //JOptionPane.showMessageDialog(JF, "No se pudo agregar a la base de datos la nueva deuda");
        }
    }
    
    public void agregarPagoCliente(String cliente,float dineroRecibido,String porque){
        String turno=getTurno();
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO pagodeudacliente (cliente, dinerorecibido, porque, turnoCajero)"
                    +" VALUES ('"+cliente+"','"+dineroRecibido+"','"+porque+"','"+turno+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(JF2,"No se pudo agregar a la base de datos la deuda").setVisible(true);
            //JOptionPane.showMessageDialog(JF, "No se pudo agregar a la base de datos la nueva deuda");
        }
    }    
    
    public void agregarPagoTarjeta(String referencia,float dineroRecibido){
        String fecha=getTurno();
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO ventastarjeta (referencia, dinerorecibido, fecha)"
                    +" VALUES ('"+referencia+"','"+dineroRecibido+"','"+fecha+"' )" );
            
            sts.executeBatch();
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(JF2,"No se pudo agregar el pago con tarjeta").setVisible(true);
            //JOptionPane.showMessageDialog(JF, "No se pudo agregar a la base de dato el pago con tarjeta");
        }
    }   
    
    public void agregarHorarios(String nombre,boolean L,String le,String ls,boolean M,String me,String ms,boolean MI,String MIE,String MIS,boolean J,String JE,String JS,boolean V,String VE,String VS,boolean S,String SE,String SS,boolean D,String DE,String DS){
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO horarios (nombre,lunes, le, ls, martes, me, ms, miercoles, mie, mis, jueves, je, js, viernes, ve, vs, sabado, se, ss, domingo, de, ds)"
                    +" VALUES ('"+nombre+"','"+L+"','"+le+"','"+ls+"','"+M+"','"+me+"','"+ms+"','"+MI+"','"+MIE+"','"+MIS+"','"+J+"','"+JE+"','"+JS+"','"+V+"','"+VE+"','"+VS+"','"+S+"','"+SE+"','"+SS+"','"+D+"','"+DE+"','"+DS+"')" );
            
            sts.executeBatch();
            new FrameCorrecto(null,"Horario guardado con exito").setVisible(true);
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(null,"No se pudo agregar el horario").setVisible(true);
        }       
    }
    
    public void agregarDepaEmpleado(String nombre,String descripcion){
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO departamentosempleados (nombre, descripcion)"
                    +" VALUES ('"+nombre+"','"+descripcion+"')" );
            
            sts.executeBatch();
            new FrameCorrecto(null,"Departamento agregado con exito").setVisible(true);
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(null,"No se pudo agregar el departamento").setVisible(true);
        }     
    }
    
    public void agregarPuestoEmpleados(String nombre,String descripcion,String tipoSalario,float salario,float descuento,float comisiones){
        try{
            Statement sts=con.createStatement();
            sts.executeUpdate("INSERT INTO puestos (nombre, descripcion, tiposalario, salario, descuento, comision)"
                    +" VALUES ('"+nombre+"','"+descripcion+"','"+tipoSalario+"','"+salario+"','"+descuento+"','"+comisiones+"')" );
            
            sts.executeBatch();
            new FrameCorrecto(null,"Puesto agregado con exito").setVisible(true);
        }
        catch(SQLException e){
            System.out.println(e);
            new FrameError(null,"No se pudo agregar el puesto").setVisible(true);
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
}
