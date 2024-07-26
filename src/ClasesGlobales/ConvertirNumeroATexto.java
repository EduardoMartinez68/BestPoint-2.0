package ClasesGlobales;

import java.text.DecimalFormat;

public class ConvertirNumeroATexto {
    private static final String[] UNIDADES = {
        "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
    };
    
    private static final String[] DECENAS = {
        "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
    };
    
    private static final String[] DIEZ_A_DIECINUEVE = {
        "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
    };

    private static final String[] CENTENAS = {
        "", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"
    };
    
    public static String convertirNumeroATexto(float numero) {
        // Redondear el número a dos cifras significativas
        DecimalFormat df = new DecimalFormat("0.##");
        String numeroFormateado = df.format(numero);
        
        String[] partes = numeroFormateado.split("\\.");
        int parteEntera = Integer.parseInt(partes[0]);
        String texto = convertirParteEntera(parteEntera);
        
        if (partes.length > 1) {
            int parteDecimal = Integer.parseInt(partes[1]);
            texto += " punto " + convertirParteEntera(parteDecimal);
        }
        
        return texto;
    }

    private static String convertirParteEntera(int numero) {
        if (numero == 0) {
            return "cero";
        }
        if (numero < 0) {
            return "menos " + convertirParteEntera(-numero);
        }
        String texto = "";
        if ((numero / 1000000) > 0) {
            texto += convertirParteEntera(numero / 1000000) + " millón ";
            numero %= 1000000;
        }
        if ((numero / 1000) > 0) {
            if (numero / 1000 == 1) {
                texto += "mil ";
            } else {
                texto += convertirParteEntera(numero / 1000) + " mil ";
            }
            numero %= 1000;
        }
        if ((numero / 100) > 0) {
            if (numero / 100 == 1 && numero % 100 == 0) {
                texto += "cien";
            } else {
                texto += CENTENAS[numero / 100] + " ";
            }
            numero %= 100;
        }
        if (numero > 0) {
            if (numero < 10) {
                texto += UNIDADES[numero];
            } else if (numero < 20) {
                texto += DIEZ_A_DIECINUEVE[numero - 10];
            } else {
                texto += DECENAS[numero / 10];
                if ((numero % 10) > 0) {
                    texto += " y " + UNIDADES[numero % 10];
                }
            }
        }
        return texto.trim();
    } 

}
