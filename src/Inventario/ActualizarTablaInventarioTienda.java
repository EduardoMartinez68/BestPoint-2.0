/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package Inventario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablaInventarioTienda {
    Connection con;
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[10];
    
    public ActualizarTablaInventarioTienda(Connection con) {
        this.con=con;
        actualizaTabla();
    }
    public void actualizaTabla(){
        getModelo().addColumn("Codigo de barras");
        getModelo().addColumn("Producto");
        getModelo().addColumn("Descripcion del producto");
        getModelo().addColumn("Importe");
        getModelo().addColumn("Se vende por");
        getModelo().addColumn("Ubicacion");
        getModelo().addColumn("Cantidad existente");
        llenarDatosTabla();
    }
    
    public void llenarDatosTabla(){
        int reg=0;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from productos");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                getLista().add(new ArrayList<>());
                
                //ver si el productos tiene ese tipo de iva 
                getLista().get(reg).add(rs.getString("codigoBarras"));
                getLista().get(reg).add(rs.getString("nombre"));
                getLista().get(reg).add(rs.getString("descripcion"));
                getLista().get(reg).add(rs.getString("precio"));
                getLista().get(reg).add(rs.getString("seVendePor"));
                getLista().get(reg).add(rs.getString("ubicacion"));
                getLista().get(reg).add(rs.getString("cantidad"));
                reg++;
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                datos[3]=getLista().get(j).get(3);
                datos[4]=getLista().get(j).get(4);
                datos[5]=getLista().get(j).get(5);
                datos[6]=getLista().get(j).get(6);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de productos");
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
