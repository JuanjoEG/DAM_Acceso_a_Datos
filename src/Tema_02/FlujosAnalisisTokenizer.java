package Tema_02;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class FlujosAnalisisTokenizer {
    
    public static void main(String[] args) {
        
        String chars1 = "Hola amigo, \nmi tel�fono es: 617 88 55 22.";
        String chars2 = "\n��� Mi edad es de 50 a�os !!!\n";
        String chars3 = "�Quieres un helado?";
        int linea = 0;
                
        // INSTANCIAMOS UN OBJETO StringReader Y LE PASAMOS UNA CADENA DE CARACTERES.
        StringReader stringReader = new StringReader(chars1 + chars2 + chars3);
        
        // INSTANCIAMOS UN OBJETO StreamTokenizer Y LE PASAMOS UN OBJETO StringReader.
        StreamTokenizer streamTokenizer = new StreamTokenizer (stringReader);
        
        // ESTABLECEMOS  EL CARACTER N� 32 --> (EL ESPACIO) COMO UN NUEVO TOKEN.
        streamTokenizer.ordinaryChar(32);
                
        // EN UN S�LO PASO.        
        // StreamTokenizer streamTokenizer = new StreamTokenizer (new StringReader(chars));
        
        try {        
            while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {            
                
                if (linea !=streamTokenizer.lineno()) {
                
                    System.out.println("***** L�NEA NUEVA *****");
                }
                // PINTAMOS EL N� DE L�NEA.
                linea = streamTokenizer.lineno();
                System.out.print("L�NEA: " + linea);
                
                // TRES MANERAS DE IMPLEMENTAR EL AN�LISIS DEL TEXTO:
               
                // RULE SWITCH
                switch (streamTokenizer.ttype) {
                    case StreamTokenizer.TT_WORD -> System.out.println(" PALABRA: " + streamTokenizer.sval);
                    case StreamTokenizer.TT_NUMBER -> System.out.println("  N�MERO:  " + streamTokenizer.nval);
                    case StreamTokenizer.TT_EOL -> System.out.println("FIN L�NEA : " + streamTokenizer);
                    default -> System.out.println("   OTRO : " + streamTokenizer);
                }
            /*
                // SWITCH
                switch (streamTokenizer.ttype) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println(" PALABRA: " + streamTokenizer.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("  N�MERO:  " + streamTokenizer.nval);
                        break;
                    case StreamTokenizer.TT_EOL:  
                        System.out.println("FIN L�NEA : " + streamTokenizer);
                        break;
                    default:
                        System.out.println("   OTRO : " + streamTokenizer);
                        break;
                }
                // IF
                if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {                
                    System.out.println(" PALABRA: " + streamTokenizer.sval);
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {                
                    System.out.println("  N�MERO:  " + streamTokenizer.nval);
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_EOL) {                
                  System.out.println("FIN L�NEA : " + streamTokenizer);  
                } else {                    
                  System.out.println("   OTRO : " + streamTokenizer);  
                }
            */
            }            
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    }
}