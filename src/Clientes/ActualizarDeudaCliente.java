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

public class ActualizarDeudaCliente {
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[10];
    Connection con;
    String cliente="";
    
    public ActualizarDeudaCliente(Connection con,String cliente){
        this.con = con;
        this.cliente=cliente;
        actualizaTabla();
    }

    public void actualizaTabla() {
        getModelo().addColumn("producto");
        getModelo().addColumn("Codigo de Barras");
        getModelo().addColumn("Precio");
        getModelo().addColumn("Cantidad");
        getModelo().addColumn("Total");
        llenarDatosTabla();
    }
    
    public void llenarDatosTabla(){
        int reg=0;
        try{
            Statement sts=con.createStatement();
            sts.execute("Select * from deudacliente");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                String nuevoCliente=rs.getString("cliente");
                if(cliente.equals(nuevoCliente)){
                    getLista().add(new ArrayList<>());

                    //ver si el productos tiene ese tipo de iva         
                    getLista().get(reg).add(rs.getString("producto"));
                    getLista().get(reg).add(rs.getString("codigobarras"));
                    getLista().get(reg).add(rs.getString("precio"));
                    getLista().get(reg).add(rs.getString("cantidad"));
                    getLista().get(reg).add(rs.getString("total"));
                    reg++;
                }
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                datos[3]=getLista().get(j).get(3);
                datos[4]=getLista().get(j).get(4);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de de los clientes");
            System.out.println(ex);
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
