/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package puntoventa;

import ClasesGlobales.Buscar;
import ClasesGlobales.convertir;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BuscarCarrito {
    Connection con;
    ResultSet rs;
    convertir conver=new convertir();
    Buscar search;
    
    public BuscarCarrito(Connection con){
        this.con=con;
        this.search=new Buscar(con);
    }

    
    public void buscarProducto(String codigoBarra,int numCarrito){
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from carritocompras WHERE numcarrito="+numCarrito);
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                //obtenemos el id del producto
                int idProducto=rsBusqueda.getInt("idproducto");
                search.buscarProductoId(idProducto);
                
                if(search.CodigoBarra().equals(codigoBarra)){
                    this.rs=rsBusqueda;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        
    }
    
    public boolean buscarProductoExistente(String codigoBarra,int numCarrito){
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from carritocompras WHERE numcarrito="+numCarrito);
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                //obtenemos el id del producto
                int idProducto=rsBusqueda.getInt("idproducto");
                search.buscarProductoId(idProducto);
                
                if(search.CodigoBarra().equals(codigoBarra)){
                    this.rs=rsBusqueda;
                    return true;
                }
                /*
                if(rsBusqueda.getString("codigobarras").equals(codigoBarra)){
                    this.rs=rsBusqueda;
                    return true;
                }*/
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        return false;
    }    
    //retornar la informaciuon solicitada
    public int Id() throws SQLException{
        try{
            return rs.getInt("id");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        return 0;
    }
    
    public String Nombre() throws SQLException{
        try{
            return search.Nombre();//rs.getString("nombre");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }    
    
    public String Descripcion() throws SQLException{
        try{
            return rs.getString("descripcion");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }   
    
    public String CodigoBarra() throws SQLException{
        try{
            return search.CodigoBarra();//rs.getInt("codigobarras");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }    
   

    public int IVA() throws SQLException{
        try{
            return rs.getInt("iva");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    } 
    
    public float Precio() throws SQLException{
        try{
            return search.Precio();//rs.getFloat("precio");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }     
    }   
    
    public int Cantidad() throws SQLException{
        try{
            return rs.getInt("cantidad");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }      
    
    public float Total() throws SQLException{
        try{
            return conver.convertirStringFloat(rs.getString("total"));
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }    
    
    public Connection getCon(){
        return con;
    }
}
