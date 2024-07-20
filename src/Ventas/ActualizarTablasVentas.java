/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package Ventas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablasVentas {
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[10];
    Connection con;

    public ActualizarTablasVentas(Connection con) {
        this.con = con;
        actualizaTabla();
    }
    
    public void actualizaTabla(){
        getModelo().addColumn("Usuaio del empleado");
        getModelo().addColumn("Producto");
        getModelo().addColumn("Cantidad");
        getModelo().addColumn("Fecha");
    }
    
    public void llenarDatosTabla(){
        int reg=0;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                getLista().add(new ArrayList<>());
                
                //ver si el productos tiene ese tipo de iva 
                getLista().get(reg).add(rs.getString("cajero"));
                getLista().get(reg).add(rs.getString("producto"));
                getLista().get(reg).add(rs.getString("cantidad"));
                getLista().get(reg).add(rs.getString("fecha"));
                reg++;
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                datos[3]=getLista().get(j).get(3);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de las ventas");
            System.out.println(ex.getNextException());
        }
    } 
    
    
    
    public void llenarDatosTablaEmpleado(String cajero,String fecha){
        int reg=0;
        boolean fehcaEncontrada=false;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){         
                //ver si el productos coinside con el cajero y la fecha 
                if(rs.getString("cajero").equals(cajero) && rs.getString("fecha").equals(fecha)){
                    fehcaEncontrada=true;
                }
                
                //si ya coinsidio ver que a partir de esa fecha solo me tome al cajero indicado
                if(fehcaEncontrada && rs.getString("cajero").equals(cajero)){
                    
                    getLista().add(new ArrayList<>());        
                    getLista().get(reg).add(rs.getString("cajero"));
                    getLista().get(reg).add(rs.getString("producto"));
                    getLista().get(reg).add(rs.getString("cantidad"));
                    getLista().get(reg).add(rs.getString("fecha"));
                    reg++;
                }
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                datos[3]=getLista().get(j).get(3);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de las ventas");
            System.out.println(ex.getNextException());
        }
    }     
    
    
    public void llenarDatosTablaFecha(String fecha1,String fecha2){
        int reg=0;
        boolean fehcaEncontrada=false;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                //ver si el productos coinside con el cajero y la fecha 
                if(rs.getString("fecha").equals(fecha1)){
                    fehcaEncontrada=true;
                }
                
                //si ya coinsidio ver que a partir de esa fecha solo me tome al cajero indicado
                if(fehcaEncontrada && !rs.getString("fecha").equals(fecha2)){
                    getLista().add(new ArrayList<>());
                    getLista().get(reg).add(rs.getString("cajero"));
                    getLista().get(reg).add(rs.getString("producto"));
                    getLista().get(reg).add(rs.getString("cantidad"));
                    getLista().get(reg).add(rs.getString("fecha"));
                    reg++;
                }
                
                //obtener el ultimo parametro 
                if(fehcaEncontrada && rs.getString("fecha").equals(fecha2)){
                    getLista().add(new ArrayList<>());
                    getLista().get(reg).add(rs.getString("cajero"));
                    getLista().get(reg).add(rs.getString("producto"));
                    getLista().get(reg).add(rs.getString("cantidad"));
                    getLista().get(reg).add(rs.getString("fecha"));
                    reg++;
                    break;
                }
            }

            for(int j=0;j<getLista().size();j++){            
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                datos[3]=getLista().get(j).get(3);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de las ventas");
            System.out.println(ex.getNextException());
        }
    }     
        
    
    public DefaultTableModel getModelo(){
        return modelo;
    }
    public ArrayList <ArrayList<Object>> getLista(){
        return lista;
    }
    public String[] getMatri(){
        return matri;
    }
    public java.sql.Connection getCon(){
        return con;
    }
}
