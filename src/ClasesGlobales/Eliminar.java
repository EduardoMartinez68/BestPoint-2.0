/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package ClasesGlobales;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Eliminar {
    Connection con;
    
    public Eliminar(Connection con){
        this.con=con;
    }
    
    public void eliminarDatoCarrito(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM carritocompras WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarImpuesto(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM iva WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarTablaImpuesto(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM tablasproductoiva WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarCaja(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM caja WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarProducto(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM productos WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarCajero(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM cajeros WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarDepartamento(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM departamento WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarVentas(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM ventas WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarCliente(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM clientes WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void eliminarPagoTarjeta(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM ventastarjeta WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }        
    }
    
    public void eliminarDepaEmpleado(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM departamentosempleados WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
            
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }        
    }
    
    public void eliminarPuesto(int id){
        try{
            Statement sts=con.createStatement();
            String eliminar="DELETE FROM puestos WHERE id = "+id+"";
            sts.executeUpdate(eliminar);
            
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }            
    }
}
