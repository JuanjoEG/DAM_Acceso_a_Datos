package Ejemplos_T02;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 *
 * @author Juan José Estévez González
 */
public class FlujosAnalisisTokenizer {
    
    public static void main(String[] args) {
        
        String chars1 = "Hola amigo, \nmi teléfono es: 617 88 55 22.";
        String chars2 = "\n¡¡¡ Mi edad es de 50 años !!!\n";
        String chars3 = "¿Quieres un helado?";
        int linea = 0;
                
        // INSTANCIAMOS UN OBJETO StringReader Y LE PASAMOS UNA CADENA DE CARACTERES.
        StringReader stringReader = new StringReader(chars1 + chars2 + chars3);
        
        // INSTANCIAMOS UN OBJETO StreamTokenizer Y LE PASAMOS UN OBJETO StringReader.
        StreamTokenizer streamTokenizer = new StreamTokenizer (stringReader);
        
        // ACTIVA  TT_EOL
        streamTokenizer.eolIsSignificant(true);
         
        try {        
            while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {            
                     
                // RULE SWITCH
                switch (streamTokenizer.ttype) {
                    case StreamTokenizer.TT_WORD   -> System.out.println("  PALABRA   : "  + streamTokenizer.sval);
                    case StreamTokenizer.TT_NUMBER -> System.out.println("  NÚMERO    : " + streamTokenizer.nval);
                    case StreamTokenizer.TT_EOL    -> System.out.println("  FIN LÍNEA : "  + streamTokenizer);
                    default -> System.out.println("  OTRO      : " + streamTokenizer);
                }
                if (linea !=streamTokenizer.lineno()) {
                
                    System.out.println("***** LÍNEA NUEVA *****");
                }
                // PINTAMOS EL Nº DE LÍNEA.
                linea = streamTokenizer.lineno();
                System.out.print("  LÍNEA     : " + linea);
            }            
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    }
}