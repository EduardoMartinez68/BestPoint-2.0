/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package ClasesGlobales;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Buscar {
    Connection con;
    ResultSet rs;
    
    public Buscar(Connection con){
        this.con=con;
    }

    
    public boolean buscarProducto(String codigoBarra){
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from productos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("codigobarras").equals(codigoBarra)){
                    this.rs=rsBusqueda;
                    return true;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        return false;
    }
    
    public void buscarProductoNombre(String nombre){
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from productos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("nombre").equals(nombre)){
                    this.rs=rsBusqueda;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
    
    public void buscarProductoId(int id){
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from productos WHERE id = "+id);
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                    this.rs=rsBusqueda;
                    break;
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }    
    
    
    public void buscar(String codigoBarra){
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from productos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("codigobarras").equals(codigoBarra)){
                    this.rs=rsBusqueda;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
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
            return rs.getString("nombre");
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
            return rs.getString("codigobarras");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }    
   

    public int IVA() throws SQLException{
        try{
            return rs.getInt("IVA");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    } 
    
    public float Precio() throws SQLException{
        try{
            return rs.getFloat("precio");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }     
    }   
    
    public float Ganancias() throws SQLException{
        try{
            return rs.getInt("ganancia");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }     
    }      
    
    public float Costo(){
        try{
            return rs.getFloat("costo");
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
    
    public String SeVendePor() throws SQLException{
        try{
            return rs.getString("sevendepor");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }    
    
    
    public int Existencia() throws SQLException{
        try{
            return rs.getInt("cantidad");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }      
    
    public String Ubicacion() throws SQLException{
        try{
            return rs.getString("ubicacion");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }        

    public String UsaInventario() throws SQLException{
        try{
            return rs.getString("usaInventario");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }   
    
    public String rutaImg(){
        try{
            String rut=rs.getString("rutimg");
            if (rut==null){
                String rutaProyecto=System.getProperty("user.dir");
                return rutaProyecto+"\\src\\Img\\imgP.png";              
            }
            
            return rut;
        }
        catch(SQLException e){
            String rutaProyecto=System.getProperty("user.dir");
            return rutaProyecto+"\\src\\Img\\imgP.png";
        }        
    }
    
    public float Precioporpeso(){
        try{
            return rs.getFloat("precioporpeso");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }
    
    public String Unidad(){
        try{
            return rs.getString("unidad");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }  
    
    public String Descuento(){
        try{
            return rs.getString("descuento");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }    
    
    public int Total() throws SQLException{
        try{
            return rs.getInt("total");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }    
    
    public Connection getCon(){
        return con;
    }
    
    public ResultSet getRs(){
        return this.rs;
    }
}
