/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package puntoventa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    public Connection Conexion(String tipo){
        try{
            if(tipo.equals("MySQL")){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","upslp1234");
            }
            if(tipo.equals("postgres")){
                Class.forName("org.postgresql.Driver");
                con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/tienda","postgres","bobesponja48");
            }            
            else{
                if(tipo.equals("Derby")){
                    //con=DriverManager.getConnection("jbdc:derby://localhost/upslp;create=true;user=root;password=1234");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda?zeroDateTimeBehavior=CONVERT_TO_NULL","root","upslp1234");
                }else{
                    System.out.println("No es posible realizar la conexion");
                }
            }
            System.out.println("se conecto");
        }
        catch(ClassNotFoundException|SQLException e){
            System.out.println("No se conecto");
            System.out.println("Error"+e);
            new FrameNoSePudoConectar("Error: "+e).setVisible(true);
        }
    return con;
    }
}