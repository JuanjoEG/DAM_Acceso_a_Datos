package Tema_01;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Esquemas {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""
                                  
    ********************************************************************************************************************
    *  TEMA 01            INTRODUCCIÓN AL MANEJO DE FICHEROS                          
    ********************************************************************************************************************
    *  1/5                            ESQUEMAS
    ********************************************************************************************************************         

                *******************************************************************************************
                *    10. ESCRITURA SECUENCIAL BYTES.                FileOutputStream                      *
                *******************************************************************************************               
                *                                                                                         *
                *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                *     INSTANCIAR FICHERO (RUTA);                                                          *
                *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************

                *******************************************************************************************
                *    11. LECTURA   SECUENCIAL BYTES.                FileInputStream                       *
                *******************************************************************************************               
                *                                                                                         *
                *     INSTANCIAR FICHERO (RUTA);                                                          *
                *     BYTE = FICHERO.read();                        LEER                                  *
                *     BUCLE while |                                                                       *
                *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                *                 | BYTE = FICHERO.read();          LEER                                  *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************


                                             """);

            continuar();

            System.out.println("""
                               
    ********************************************************************************************************************
    *  TEMA 01            INTRODUCCIÓN AL MANEJO DE FICHEROS                          
    ********************************************************************************************************************
    *  2/5                            ESQUEMAS
    ********************************************************************************************************************

                *******************************************************************************************
                *    12. ESCRITURA SECUENCIAL CARACTER.             FileWriter                            *
                *******************************************************************************************               
                *                                                                                         *
                *     INSTANCIAR FICHERO (RUTA);                                                          *
                *     ESCRIBIR --> FICHERO.write(STRING);                                                 *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************

                *******************************************************************************************
                *    13. LECTURA   SECUENCIAL CARACTER.             FileReader                            *
                *******************************************************************************************               
                *                                                                                         *
                *     INSTANCIAR FICHERO (RUTA);                                                          *
                *     BYTE = FICHERO.read();                        LEER                                  *
                *     BUCLE while |                                                                       *
                *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                *                 | BYTE = FICHERO.read();          LEER                                  *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************


                                             """);

            continuar();

            System.out.println("""

    ********************************************************************************************************************
    *  TEMA 01            INTRODUCCIÓN AL MANEJO DE FICHEROS                          
    ********************************************************************************************************************
    *  3/5                            ESQUEMAS
    ********************************************************************************************************************

                *******************************************************************************************
                *    14. ESCRITURA ALEATORIO UN BYTE.               RandomAcessFile                       *
                *******************************************************************************************               
                *                                                                                         *
                *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                *     ESCRIBIR --> FICHERO.write(BYTE);                                                   *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************

                *******************************************************************************************
                *    15. LECTURA   ALEATORIO UN BYTE.               RandomAcessFile                       *
                *******************************************************************************************               
                *                                                                                         *
                *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                *     LEER     --> BYTE = FICHERO.read();                                                 *
                *     CASTING  --> CONTENIDO = (char)BYTE;                                                *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************


                                             """);

            continuar();

            System.out.println("""
                               
    ********************************************************************************************************************
    *  TEMA 01            INTRODUCCIÓN AL MANEJO DE FICHEROS                          
    ********************************************************************************************************************
    *  4/5                            ESQUEMAS
    ********************************************************************************************************************

                *******************************************************************************************
                *    16. ESCRITURA ALEATORIA DE SECUENCIA DE BYTES.             RandomAcessFile           *
                *******************************************************************************************               
                *                                                                                         *
                *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************

                *******************************************************************************************
                *    17 LECTURA ALEATORIA DE SECUENCIA CADENA DE BYTES.          RandomAcessFile          *
                *******************************************************************************************               
                *                                                                                         *
                *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                *     BYTE = FICHERO.read();                        LEER                                  *
                *     BUCLE while |                                                                       *
                *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                *                 | BYTE = FICHERO.read();          LEER                                  *
                *                 | if (CONTADOR==TAMAÑO) break;    LÍMITE                                *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************


                                             """);

            continuar();

            System.out.println("""

    ********************************************************************************************************************
    *  TEMA 01            INTRODUCCIÓN AL MANEJO DE FICHEROS                          
    ********************************************************************************************************************
    *  5/5                            ESQUEMAS
    ********************************************************************************************************************

                *******************************************************************************************
                *    18. ESCRITURA CON BUFFER..                 BufferedOutputStream - FileOutputStream   *
                *******************************************************************************************               
                *                                                                                         *
                *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************

                *******************************************************************************************
                *    19. LECTURA   CON BUFFER.                  BufferedInputStream - FileInputStream     *
                *******************************************************************************************               
                *                                                                                         *
                *     INSTANCIAR FICHERO (RUTA, TAMAÑO_BUFFER);                                           *
                *     BYTE = FICHERO.read();                        LEER                                  *
                *     BUCLE while |                                                                       *
                *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                *                 | BYTE = FICHERO.read();          LEER                                  *
                *     CERRAR   --> FICHERO.close();                                                       *
                *                                                                                         *
                *******************************************************************************************
                               
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
                    default -> System.out.println("\n ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}
