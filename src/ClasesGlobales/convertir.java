/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package ClasesGlobales;

public class convertir {
    
    public int convertirStringInt(String texto){
        try{
        return Integer.parseInt(texto);
        }catch(Exception e){
            return 0;
        }
    }
    
    public String convertirIntString(int num){
        return num+"";
    }
    
    public float convertirStringFloat(String texto){
        try{
        return Float.parseFloat(texto);
        }catch(Exception e){
            return 0;
        }        
    }
}
