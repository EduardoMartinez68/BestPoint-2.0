
/**
Nombre de la empresa
Nombre del software
Ingeniero en tegnologia de la informacion Martinez Ortiz Eduardo Antonio 
Todos los derechos reservados.
**/

package puntoventa;
import com.raven.main.Main;
import java.sql.Connection;

public class PuntoVenta {
    public static void main(String[] args) {
        //conectar con la base de datos
        Conexion obj=new Conexion();
        Connection con=obj.Conexion("postgres");
       
        //comprobamos que si se conecto
        if(con!=null){
            new FrameInisiarSecion(con).setVisible(true);
        }
    }
}
