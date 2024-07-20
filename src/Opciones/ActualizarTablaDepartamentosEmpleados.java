package Opciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablaDepartamentosEmpleados {
    private final Connection con;
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[4];
    
    
    public ActualizarTablaDepartamentosEmpleados(Connection con){
        this.con=con;
        actualizaTabla();
    }
    
    public void actualizaTabla(){
        int reg=0;
        getModelo().addColumn("Nombre del departamento");
        getModelo().addColumn("Descripcion");
        
        
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from departamentosempleados");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                getLista().add(new ArrayList<>());
                getLista().get(reg).add(rs.getString("nombre"));
                getLista().get(reg).add(rs.getString("descripcion"));
                reg++;
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                getModelo().addRow(datos);
            }
            
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
    }
    
    
    
    public Connection getCon(){
        return con;
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
}
