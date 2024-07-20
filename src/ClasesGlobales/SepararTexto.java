package ClasesGlobales;
public class SepararTexto {
    
    public String obtenerFecha(String fecha){
        String fechaCorrecta="";
        
        fechaCorrecta=fecha.split(" ")[0];
        
        return fechaCorrecta;        
    }
    
    public int obtenerYears(String fecha){
        String fechaCorrecta="";
        
        fechaCorrecta=fecha.split("/")[0];
        
        return Integer.parseInt(fechaCorrecta);         
    }
    
    public int obtenerMesNum(String fecha){
        String fechaCorrecta="";
        
        fechaCorrecta=fecha.split("/")[1];
        int num;
        switch(fechaCorrecta){
            case "enero":
                num=1;
                break;
            case "febrero":
                num=2;
                break;
            case "marzo":
                num=3;
                break;
            case "abril":
                num=4;
                break;           
            case "mayo":
                num=5;
                break;        
            case "junio":
                num=6;
                break;    
            case "julio":
                num=7;
                break;    
            case "agosto":
                num=8;
                break; 
            case "septiembre":
                num=9;
                break;      
            case "octubre":
                num=10;
                break;  
            case "noviembre":
                num=11;
                break;  
            case "diciembre":
                num=12;
                break;
            default:
                num=0;
                break;
            
        }   
        
        return num;
    }
    
    public String obtenerMes(String fecha){
        String fechaCorrecta="";
        
        fechaCorrecta=fecha.split("/")[1];
        return fechaCorrecta;
    }
    
    public int obtenerDia(String fecha){
        String fechaCorrecta="";
        
        fechaCorrecta=fecha.split("/")[2];
        
        return Integer.parseInt(fechaCorrecta);         
    }
}
