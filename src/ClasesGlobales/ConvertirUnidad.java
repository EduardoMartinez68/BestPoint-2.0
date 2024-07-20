package ClasesGlobales;

public class ConvertirUnidad {
    
    //pesos
    //g=1;
    float kg=(float) 0.001;
    int mg=1000;
    float lb=(float) 453.592;
    
    
    public float Kg_g(float kilogramo){
        return kilogramo*kg;
    }

    public float lb_g(float libra){
        return libra*lb;
    }   
    
    public float Mg_g(float miligramo){
        return miligramo*mg;
    }
    
    
    public float g_Mg(float gramo){
        return gramo/mg;
    }
    
    public float g_Kg(float gramo){
        return gramo/kg;
    }
    
    public float g_libra(float gramos){
        return gramos/lb;
    }
    
    //distancia 
    //cm=1;
    float m=(float) 0.01;
    float mm=(float) 0.1;
    
    public float cm_m(float cm){
        return cm*m;
    }
    
    public float m_cm(float metros){
        return metros/m;
    }
    
    public float cm_mm(float cm){
        return cm*mm;
    }
    
    public float mm_cm(float milimetros){
        return milimetros/mm;
    }
    
    //liquido
    public float ml_l(float mililitros){
        return (float) (0.001*mililitros);
    }
    
    public float l_ml(float l){
        return (float) (1000*l);
    }
}
