/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package ClasesGlobales;
//librerias para tener la fecha
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelojTiempo extends javax.swing.JFrame implements Runnable{
    //hora 
    Thread h1;
    
    public RelojTiempo(){
        //nodo de hora 
        h1=new Thread(this);
        h1.start();
    }
    
    //el metodo para actualizar el reloj
    public void run(){
        Thread ct=Thread.currentThread();
        while(h1==ct){
            //obtenemos la hora y la actualizamos
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
            //labelFecha.setText(dtf.format(LocalDateTime.now())+"");
            
            try{
                Thread.sleep(1000); //el tiempo que va esperar para repetirse
            }catch(InterruptedException e){
            }
        }
    }    
}
