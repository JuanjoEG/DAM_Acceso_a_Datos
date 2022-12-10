package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
        *  1/2                       CLASIFICACI�N DE FLUJOS
********************************************************************************************************************
        *   SEG�N EL TIPO DE INFORMACI�N A TRATAR:
        *       - TRATAMIENTO DE FICHEROS.
        *       - TRATAMIENTO CON BUFFERS.
        *       - TRATAMIENTO CON ARRAYS.
        *       - TRATAMIENTO CON TUBER�AS.
        *       - TRATAMIENTO CON AN�LISIS. (PARSING).
        *       - TRATAMIENTO CON BLOQUES DE INFORMACI�N. (TOKENS).
        *
        *   CADA UNA DE ESTAS CATEGOR�AS VAN A PODER Y USAR DIFERENTES FUNCIONALIDADES,
        *   A TRAV�S DE DIFERENTES CLASES Y M�TODOS,
        *   COMO SE MUESTRA EN LA SIGUIENTE TABLA:
        *                      
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
        *  TEMA 02                      FLUJOS  -  STREAMS  
********************************************************************************************************************
        *  2/2                       CLASIFICACI�N DE FLUJOS
********************************************************************************************************************
        ***************************************************************************
        *       TABLA DE TIPOS DE CLASES DE FLUJOS SEG�N SU FUNCIONALIDAD         *
        ***************************************************************************
        *       USABILIDAD      *       BYTES (E/S)      *     CARACTERES (E/S)   *
        ***************************************************************************
        *  FICHEROS             *  FileInputStream       *  FiliReader            *
        *                       *  FileOutputStream      *  FileWriter            *
        ***************************************************************************
        *  ARRAYS               *  ByteArrayInputStream  *  CharArrayReader       *
        *                       *  ByteArrayOutputStream *  CharArrayWriter       *
        ***************************************************************************
        *  TUBER�AS             *  PipedInputStream      *  PipedReader           *
        *                       *  PipedOutputStream     *  PipedWriter           *
        ***************************************************************************
        *  BUFFER               *  BufferedInputStream   *  BufferedReader        *
        *                       *  BufferedOutputStream  *  BufferedWriter        *
        ***************************************************************************
        *  AN�LISIS (Parsing)   *  PushbackInputStream   *  PushbackReader        *
        *                       *  StreamTokenizer       *  LineNumberReader      *
        ***************************************************************************
        *  INFORMACI�N          *  DataInputStream       *  PrintWriter           *
        *                       *  DataOutputStream      *                        *
        *                       *  PrintStream           *                        *
        ***************************************************************************
********************************************************************************************************************
        *  0. SALIR.
********************************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}