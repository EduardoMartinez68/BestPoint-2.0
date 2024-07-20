package OpcionesBarra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarTablaVentasDevolucionesDia {
    private final DefaultTableModel modelo=new DefaultTableModel();
    private final ArrayList <ArrayList<Object>> lista=new ArrayList<>();
    private String matri[];
    private final Object datos[]=new Object[16];
    
    Connection con;
    int vendidos=0;
    FrameVentasHoy JF;
    String turnoHoy;
    public ActualizarTablaVentasDevolucionesDia(FrameVentasHoy JF,Connection con){
        this.con=con;
        this.turnoHoy=getTurno();
        this.JF=JF;
        turnoHoy=getTurno();
        actualizaTabla();
    }
    
    public void actualizaTabla(){
        getModelo().addColumn("Producto");
        getModelo().addColumn("Cant.");
        getModelo().addColumn("Precio");
        getModelo().addColumn("Accion");
        llenarDatosTabla();
        JF.seVentas(vendidos);
    }
    
    public void llenarDatosTabla(){
        int reg=0;
        try{
            Statement sts=getCon().createStatement();
            sts.execute("Select * from ventas");
            ResultSet rs=sts.getResultSet();
            while(rs.next()){
                String fecha=rs.getString("turnoCajero");
                if(turnoHoy.equals(fecha)){
                    getLista().add(new ArrayList<>());

                    //ver si el productos tiene ese tipo de iva 
                    getLista().get(reg).add(rs.getString("producto"));
                    getLista().get(reg).add(rs.getString("cantidad"));
                    getLista().get(reg).add(rs.getString("precio"));
                    getLista().get(reg).add("Compra");
                    reg++;
                    vendidos++;
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
            System.out.println("error al llenar la tabla de ivas1");
            System.out.println(ex.getNextException());
        }
    }    
    
    private String getTurno(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String cajero=rs.getString("tiempoRegistro");
                return cajero;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        return "";        
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
