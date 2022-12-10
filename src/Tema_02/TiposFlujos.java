package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class TiposFlujos {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
        *  TEMA 02                      FLUJOS  -  STREAMS  
********************************************************************************************************************
        *  1/2                       CLASIFICACIÓN DE FLUJOS
********************************************************************************************************************
        *   SEGÚN EL TIPO DE INFORMACIÓN A TRATAR:
        *       - TRATAMIENTO DE FICHEROS.
        *       - TRATAMIENTO CON BUFFERS.
        *       - TRATAMIENTO CON ARRAYS.
        *       - TRATAMIENTO CON TUBERÍAS.
        *       - TRATAMIENTO CON ANÁLISIS. (PARSING).
        *       - TRATAMIENTO CON BLOQUES DE INFORMACIÓN. (TOKENS).
        *
        *   CADA UNA DE ESTAS CATEGORÍAS VAN A PODER Y USAR DIFERENTES FUNCIONALIDADES,
        *   A TRAVÉS DE DIFERENTES CLASES Y MÉTODOS,
        *   COMO SE MUESTRA EN LA SIGUIENTE TABLA:
        *                      
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
        *  TEMA 02                      FLUJOS  -  STREAMS  
********************************************************************************************************************
        *  2/2                       CLASIFICACIÓN DE FLUJOS
********************************************************************************************************************
        ***************************************************************************
        *       TABLA DE TIPOS DE CLASES DE FLUJOS SEGÚN SU FUNCIONALIDAD         *
        ***************************************************************************
        *       USABILIDAD      *       BYTES (E/S)      *     CARACTERES (E/S)   *
        ***************************************************************************
        *  FICHEROS             *  FileInputStream       *  FiliReader            *
        *                       *  FileOutputStream      *  FileWriter            *
        ***************************************************************************
        *  ARRAYS               *  ByteArrayInputStream  *  CharArrayReader       *
        *                       *  ByteArrayOutputStream *  CharArrayWriter       *
        ***************************************************************************
        *  TUBERÍAS             *  PipedInputStream      *  PipedReader           *
        *                       *  PipedOutputStream     *  PipedWriter           *
        ***************************************************************************
        *  BUFFER               *  BufferedInputStream   *  BufferedReader        *
        *                       *  BufferedOutputStream  *  BufferedWriter        *
        ***************************************************************************
        *  ANÁLISIS (Parsing)   *  PushbackInputStream   *  PushbackReader        *
        *                       *  StreamTokenizer       *  LineNumberReader      *
        ***************************************************************************
        *  INFORMACIÓN          *  DataInputStream       *  PrintWriter           *
        *                       *  DataOutputStream      *                        *
        *                       *  PrintStream           *                        *
        ***************************************************************************
********************************************************************************************************************
        *  0. SALIR.
********************************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}