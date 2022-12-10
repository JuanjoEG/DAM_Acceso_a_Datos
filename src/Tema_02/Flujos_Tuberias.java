package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Flujos_Tuberias {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   1/2                           CLASES DE FLUJOS BASADOS EN TUBER�AS. (PIPE)  
********************************************************************************************************************

    - EL CONCEPTO DE TUBER�AS, ASOCIADO A LOS HILOS (THREADS) ES DISTINTO EN JAVA QUE EN OTROS SISTEMAS:

           - TUBER�A EN EL LENGUAJE DE PROGRAMACI�N JAVA:
                    - CAPACIDAD DE UTILIZAR DOS THREADS EJECUT�NDOSE EN LA MISMA M�QUINA VIRTUAL. (JVM).
                    - SON HILOS DIFERENTES, PERO PERTENECEN AL MISMO PROCESO.
                    - LAS TUBER�AS EN LOS THREADS PUEDEN SER OR�GENES O DESTINOS DE DATOS, PERO NO A LA VEZ.

           - TUBER�A EN SISTEMAS UNIX:
                    - DOS PROCESOS QUE SE EJECUTAN EN LUGARES DISTINTOS DE MEMORIA.
                    - LOS PROCESOS PUEDEN COMUNICARSE A TRAV�S DE UNA TUBER�A.
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   2/2                           CLASES DE FLUJOS BASADOS EN TUBER�AS. (PIPE)  
********************************************************************************************************************

    - EJEMPLO T�PICO DE UTILIZACI�N DE TUBER�AS EN JAVA:

           - UN PROCESO CON 2 HILOS.
                    - UN HILO ESCRIBIENDO EN UN STREAM.
                    - OTRO HILO LEY�NDOLO.

           - EN EL ESPACO COM�N A AMBOS THREADS, A NIVEL CLASE.                               
                    - SE CREAR�N PipedOutStream Y PipedInputStream.
                    - CONEXI�N: 
                      LA INSTANCIA DE LA TUBER�A PipedInputStream 
                      UTILIZAR� EL PipedOutStream PREVIAMENTE CREADO.

                           final PipedOutputStream salida = new PipedOutputStream();
                           final PipedInputStream entrada = new PipedInputStream(salida);

                    - SE LANZAR�N --> start() --> LOS DOS THREADS.

           - CADA HILO USAR� UNA DE ELLAS, PERO AMBOS OBJETOS ESTAR�N DEFINIDOS A NIVEL DE CLASES. (SON COMUNES).

                    - EL THREADS QUE ESCRIBE EN LA TUBER�A INSTANCIAR� EL PipedOutputStream, 
                      HACIENDO REFERENCIA A UN OBJETO DE SALIDA.
                            - PUEDE SER LA ESCRITURA DE UN FICHERO, O DIRECTAMENTE UNA CADENA DE TEXTO.

                    - EL THREADS QUE LEE, TIENE ACCESO A LOS BYTES QUE LLEGAN A LA TUBER�A.

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