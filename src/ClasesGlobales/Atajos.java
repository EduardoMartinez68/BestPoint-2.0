/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package ClasesGlobales;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Atajos implements KeyListener{
    boolean presionar=true;
    int alarm=1;
    int atajo=0;

    
    public void alarmaTecla(){
        if(alarm>0){
            alarm--;
        }
        else{
            atajo=0;
            presionar=true;
            alarm=1;
        }
    }    
    
    public void keyTyped(KeyEvent e){
    }
        
    public void keyPressed(KeyEvent e){
        atajo=e.getKeyCode();
    }           
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    public int getAtajo(){
        return atajo;
    }
    
    public boolean getPresionar(){
        return presionar;
    }
    
    public void PresionarFalse(){
        atajo=0;
        presionar=false;
    }
}
