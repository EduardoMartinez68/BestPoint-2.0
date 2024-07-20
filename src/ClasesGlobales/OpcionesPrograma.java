package ClasesGlobales;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OpcionesPrograma {
    Connection con;
    ResultSet rs;
    public OpcionesPrograma(Connection con) {
        this.con = con;
        buscar();
    }
    
    private void buscar(){
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from opciones");
            ResultSet rs=sts.getResultSet();
            
            while(rs.next()){
                this.rs=rs;
                break;
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }   
    }    
    
    public String getUsuario(){       
        try{
            return rs.getString("administrador");
        }catch(SQLException ex){
            return "";
        } 
    }
    
    public String getPassword(){       
        try{
            return rs.getString("password");
        }catch(SQLException ex){
            return "";
        } 
    }
    
    public String getCorreo(){       
        try{
            return rs.getString("correo");
        }catch(SQLException ex){
            return "";
        } 
    }
}
