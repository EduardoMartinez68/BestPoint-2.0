/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package Productos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImpuestosDatos {
    Connection con;
    ResultSet impuesto;
    
    public ImpuestosDatos(Connection con){
        this.con=con;
    }
    
   public void encontrarImpuesto(String impuestoBuscar){
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from iva");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                if (rs.getString("nombre").equals(impuestoBuscar)){
                    impuesto=rs; 
                    break;
                }
            }
            
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }  
    }
   
   public int idImpuesto(){
        try{
            return Integer.parseInt(impuesto.getString("id"));
        }catch(Exception e){
            return 0;
        }
   }
   
   public String nombreImpuesto(){
       try{
           return impuesto.getString("nombre");
       }catch(Exception e){
            return "";
        }
   }
   
   public float precioImpuesto(){
        try{
            return Float.parseFloat(impuesto.getString("cantidad"));
        }catch(Exception e){
            return 0;
        } 
   }  
   
    public Connection getCon(){
        return con;
    }
}
