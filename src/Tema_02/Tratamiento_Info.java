package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
*                                     CLASES PARA EL TRATAMIENTO DE LA INFORMACIÓN
********************************************************************************************************************
   DataInputStream Y DataOutputStream:  PERMITE PROCESAR TIPOS PRIMITIVOS DE JAVA.  (int, float, long, ETC...)
   ES ÚTIL CUANDO LA LECTURA ESTÉ ORIENTADA A LOS TIPOS PRIMITIVOS.
   SE USA DataInputStream PARA LEER E INTERPRETAR FICHEROS ESCRITOS CON DataOutputStream.
                               
        - DataInputStream:
               - INTERPRETA TIPOS PRIMITIVOS DE JAVA,
                 FRENTE A InputStream QUE SÓLO LEÍA BYTES SIN ASOCIAR NINGUNA TIPOLOGÍA.
               - SUBCLASE DE InputStream --> HEREDA SUS MÉTODOS:
                       - DISPONIBLE EL MÉTODO read() PARA LEER BYTE A BYTE.
                       - TAMBIÉN LA LECTURA CON UN ARRAY DE BYTES.
               - MUY IMPORTANTE EN ESTA LECTURA SABER QUÉ TIPO DE DATOS VAMOS A LEER Y QUÉ ORDEN LLEVAN,
                 PORQUE CON TIPOS PRIMITIVOS LA LECTURA DEL NÚMERO (-1) NO SE DISTINGUE DEL FIN DE FLUJO (TAMBIÉN -1).
                               
        - DataOutputStream:
                ESCRIBE EN EL STREAM DISTINTOS TIPOS PRIMITIVOS DE JAVA USANDO DIFERENTES MÉTODOS:
                       - writeInt()         INTRODUCIMOS   int,   SOLO ACEPTA COMO PARÁMETRO TIPO   int.
                       - writeFloat()       INTRODUCIMOS   float, SOLO ACEPTA COMO PARÁMETRO TIPO   float.
                       - writeLong()        INTRODUCIMOS   long,  SOLO ACEPTA COMO PARÁMETRO TIPO   long.             
                               
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