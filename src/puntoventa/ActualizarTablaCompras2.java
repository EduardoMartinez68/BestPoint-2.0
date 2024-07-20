package puntoventa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablaCompras2 {
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[10];
    
    Connection con;
    
    String fecha;
    String cajero;
    String tipoPago;
    
    boolean fechaT=false;
    boolean cajeroT=false;
    boolean tipoPagoT=false;
    
    public ActualizarTablaCompras2(Connection con,String fecha,String cajero,String tipoPago){
        this.con=con;
        this.fecha=fecha;
        this.cajero=cajero;
        this.tipoPago=tipoPago;
        evaluaciones();
        actualizaTabla();
    }    
    
    
    public void actualizaTabla(){
        getModelo().addColumn("Producto");
        getModelo().addColumn("Cant.");
        getModelo().addColumn("Precio");
        getModelo().addColumn("Metodo de pago");
        getModelo().addColumn("Fecha");
        getModelo().addColumn("Cajero");
        llenarDatosTabla();
    }
    
    private void evaluaciones(){
        //ver que coinsidan 
        if(fecha.equals("Todas")){
            fechaT=true;
        }
        if(cajero.equals("Todos")){
            cajeroT=true;
        }
        if(tipoPago.equals("Todos")){
            tipoPagoT=true;
        }
    }
    
    
    public void llenarDatosTabla(){
        int reg=0;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                
                if(fechaT){
                    fecha=rs.getString("turnoCajero");
                }
                if(cajeroT){
                    cajero=rs.getString("cajero");
                }
                if(tipoPagoT){
                    tipoPago=rs.getString("tipoPago");
                }
                
                //ver si coinsiden 
                if(fecha.equals(rs.getString("turnoCajero")) && cajero.equals(rs.getString("cajero")) && tipoPago.equals(rs.getString("tipoPago")) ){
                    getLista().add(new ArrayList<>());

                    getLista().get(reg).add(rs.getString("producto"));
                    getLista().get(reg).add(rs.getString("cantidad"));
                    getLista().get(reg).add(rs.getString("precio"));
                    getLista().get(reg).add(rs.getString("tipoPago"));
                    getLista().get(reg).add(rs.getString("turnoCajero"));
                    getLista().get(reg).add(rs.getString("cajero"));
                    reg++;
                }
            }
            
            for(int j=0;j<getLista().size();j++){
                datos[0]=getLista().get(j).get(0);
                datos[1]=getLista().get(j).get(1);
                datos[2]=getLista().get(j).get(2);
                datos[3]=getLista().get(j).get(3);
                datos[4]=getLista().get(j).get(4);
                datos[5]=getLista().get(j).get(5);
                getModelo().addRow(datos);
            }
        }catch(SQLException ex){
            System.out.println("error al llenar la tabla de pagos");
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
