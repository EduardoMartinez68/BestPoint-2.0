/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package Clientes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablaClientes {
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[10];
    Connection con;
    
    public ActualizarTablaClientes(Connection con){
        this.con=con;
        actualizaTabla();
    }
    
    public void actualizaTabla(){
        getModelo().addColumn("Nombre de cliente");
        getModelo().addColumn("Credito");
        getModelo().addColumn("Deuda");
        llenarDatosTabla();
    }
    
    
    public void llenarDatosTabla(){
        int reg=0;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from clientes");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                getLista().add(new ArrayList<>());

                //ver si el productos tiene ese tipo de iva        
                getLista().get(reg).add(rs.getString("nombre"));
                getLista().get(reg).add(rs.getString("credito"));
                getLista().get(reg).add(rs.getString("deuda"));
                reg++;
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de de los clientes");
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
    public Connection getCon(){
        return con;
    }    
}
