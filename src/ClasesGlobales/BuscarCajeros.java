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

public class BuscarCajeros {
    Connection con;
    ResultSet rs;
    
    public BuscarCajeros(Connection con){
        this.con=con;
    }
    
    public boolean buscarCajero(String usuario){
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from cajeros");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getString("usuario").equals(usuario)){
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
    //buscar las caracteristicas 
   public int Id() throws SQLException{
        try{
            return rs.getInt("id");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }      
   
   public String Usuario() throws SQLException{
        try{
            return rs.getString("usuario");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }   
   
   
   public String Turno() throws SQLException{
        try{
            return rs.getString("turno");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
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
   
   public String Pasword() throws SQLException{
        try{
            return rs.getString("password");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return "";
        }
    }      
   
   
   public int idDepartamento(){
        try{
            return rs.getInt("departamento");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }
    }  
   
    public int idPuesto(){
        try{
            return rs.getInt("puesto");
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return 0;
        }   
    }
    
    public String nombreDepartamento(){
        int id=idDepartamento();
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from departamentosempleados");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getInt("id")==id){
                    return rsBusqueda.getString("nombre");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        return "";
    }
    
    public String nombrePuesto(){
        int id=idPuesto();
        try{
            Statement sts = getCon().createStatement();
            sts.execute("Select * from puestos");
            ResultSet rsBusqueda = sts.getResultSet();
            
            //pasar por todos los pedidos a ver donde coinside
            while (rsBusqueda.next()){
                if(rsBusqueda.getInt("id")==id){
                    return rsBusqueda.getString("nombre");
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
        return "";       
    }
    
    //buscar los permisos
    public boolean Permiso(String permiso) throws SQLException{
        try{
            return rs.getBoolean(permiso);
        }
        catch(SQLException e){
            System.out.println("Error "+e);
            return false;
        }
    }    
    
   //conexiones
    public Connection getCon(){
        return con;
    }
    
    public ResultSet getRs(){
        return this.rs;
    }
}
