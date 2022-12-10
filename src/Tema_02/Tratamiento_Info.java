package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Tratamiento_Info {

        
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*                                     CLASES PARA EL TRATAMIENTO DE LA INFORMACI�N
********************************************************************************************************************
   DataInputStream Y DataOutputStream:  PERMITE PROCESAR TIPOS PRIMITIVOS DE JAVA.  (int, float, long, ETC...)
   ES �TIL CUANDO LA LECTURA EST� ORIENTADA A LOS TIPOS PRIMITIVOS.
   SE USA DataInputStream PARA LEER E INTERPRETAR FICHEROS ESCRITOS CON DataOutputStream.
                               
        - DataInputStream:
               - INTERPRETA TIPOS PRIMITIVOS DE JAVA,
                 FRENTE A InputStream QUE S�LO LE�A BYTES SIN ASOCIAR NINGUNA TIPOLOG�A.
               - SUBCLASE DE InputStream --> HEREDA SUS M�TODOS:
                       - DISPONIBLE EL M�TODO read() PARA LEER BYTE A BYTE.
                       - TAMBI�N LA LECTURA CON UN ARRAY DE BYTES.
               - MUY IMPORTANTE EN ESTA LECTURA SABER QU� TIPO DE DATOS VAMOS A LEER Y QU� ORDEN LLEVAN,
                 PORQUE CON TIPOS PRIMITIVOS LA LECTURA DEL N�MERO (-1) NO SE DISTINGUE DEL FIN DE FLUJO (TAMBI�N -1).
                               
        - DataOutputStream:
                ESCRIBE EN EL STREAM DISTINTOS TIPOS PRIMITIVOS DE JAVA USANDO DIFERENTES M�TODOS:
                       - writeInt()         INTRODUCIMOS   int,   SOLO ACEPTA COMO PAR�METRO TIPO   int.
                       - writeFloat()       INTRODUCIMOS   float, SOLO ACEPTA COMO PAR�METRO TIPO   float.
                       - writeLong()        INTRODUCIMOS   long,  SOLO ACEPTA COMO PAR�METRO TIPO   long.             
                               
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