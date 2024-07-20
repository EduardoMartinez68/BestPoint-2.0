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
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablaIVA {
    private final Connection con;
    private Integer i;
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private final Object datos[]=new Object[3];
    
    private final ArrayList<Object>MATRICULA =new ArrayList<>();
    private String matri[];
    
    public ActualizarTablaIVA(Connection con){
        this.con=con;
        actualizaTabla();
        //actualizaCombo();
    }
    
    public void actualizaTabla(){
        getModelo().addColumn("id");
        getModelo().addColumn("nombre");
        getModelo().addColumn("IVA");
        llenarDatosTabla();
    }
    
    public void llenarDatosTabla(){
        int reg=0;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from tablasproductoiva");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                getLista().add(new ArrayList<>());
                
                //ver si el productos tiene ese tipo de iva 
                getLista().get(reg).add(rs.getString("id"));
                getLista().get(reg).add(rs.getString("nombre"));
                getLista().get(reg).add(rs.getString("precio"));
                reg++;
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de ivas");
            System.out.println(ex.getNextException());
        }
    }
    
    public void actualizaCombo(){
        try{
            int cont=0;
            Statement sts=con.createStatement();
            sts.execute("Select * from tablasproductoiva");
            ResultSet rs=sts.getResultSet();
             while(rs.next()){
                MATRICULA.add(rs.getString("id"));
                cont++;
            }
             matri=new String[cont];
             for(int mat=0;mat<cont;mat++){
                matri[mat]=MATRICULA.get(mat).toString();
             }
       
            
        }catch(SQLException ex){
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
