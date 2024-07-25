
/**
Nombre de la empresa
Nombre del software
Ingeniero en tegnologia de la informacion Martinez Ortiz Eduardo Antonio 
Todos los derechos reservados.
**/

package puntoventa;
import Membresia.ComprobarMembresia;
import Membresia.FrameMembresia;
import Notificaciones.MessageError;
import com.raven.main.Main;
import java.sql.Connection;

public class PuntoVenta {
    public static void main(String[] args) {
        //conectar con la base de datos
        Conexion obj=new Conexion();
        Connection con=obj.Conexion("postgres");
       ComprobarMembresia comprobarMembresia;
       
        //comprobamos que si se conecto
        if(con!=null){
            //comprobamos si existe una cuenta registrada en esta pc 
            comprobarMembresia=new ComprobarMembresia(con);
            
            if(comprobarMembresia.existeCuentaAsignada()){
                //si existe una membresia guardada en esta pc, abrimos el sistema
                new FrameInisiarSecion(con).setVisible(true);
            }else{
                new FrameInisiarSecion(con).setVisible(true);
                //si no existe una membresia guardada en esta pc, abrimos el campo de relleno
               //new  FrameMembresia(con).setVisible(true);
            }
        }else{
            MessageError ms=new MessageError(null,"No pudimos conectarnos a su base de datos");
        }
    }
}
