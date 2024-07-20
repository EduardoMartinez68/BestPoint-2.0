/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package puntoventa;

import ClasesGlobales.Buscar;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablaCarrito {
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[10];
    
    Connection con;
    Buscar search;
    
    public ActualizarTablaCarrito(Connection con,int numCarrito){
        this.con=con;
        this.search=new Buscar(con);
        actualizaTabla(numCarrito);
    }
    
    public void actualizaTabla(int numCarrito){
        getModelo().addColumn("Codigo de barras");
        getModelo().addColumn("Producto");
        getModelo().addColumn("Descripcion del producto");
        getModelo().addColumn("R");
        getModelo().addColumn("Cant.");
        getModelo().addColumn("Importe");
        getModelo().addColumn("%Desc");
        getModelo().addColumn("Total");
        llenarDatosTabla(numCarrito);
    } 
    
    public void llenarDatosTabla(int numCarrito){
        int reg=0;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from carritocompras WHERE numcarrito="+numCarrito);
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                getLista().add(new ArrayList<>());
                //obtenemos el id del producto
                int idProducto=rs.getInt("idproducto");
                search.buscarProductoId(idProducto);
                
                //ver si el productos tiene ese tipo de iva 
                getLista().get(reg).add(search.CodigoBarra()); //0
                getLista().get(reg).add(search.Nombre()); //1
                getLista().get(reg).add(search.Descripcion()); //2
                getLista().get(reg).add("✓"); //3
                getLista().get(reg).add(rs.getString("cantidad")); //4
                getLista().get(reg).add(search.Precio()); //5
                getLista().get(reg).add(rs.getString("descuento")); //6
                getLista().get(reg).add(rs.getString("total")); //7
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
                datos[7]=getLista().get(j).get(7);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de productos");
            System.out.println(ex);
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
