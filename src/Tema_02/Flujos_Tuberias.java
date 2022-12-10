package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
*   1/2                           CLASES DE FLUJOS BASADOS EN TUBERÍAS. (PIPE)  
********************************************************************************************************************

    - EL CONCEPTO DE TUBERÍAS, ASOCIADO A LOS HILOS (THREADS) ES DISTINTO EN JAVA QUE EN OTROS SISTEMAS:

           - TUBERÍA EN EL LENGUAJE DE PROGRAMACIÓN JAVA:
                    - CAPACIDAD DE UTILIZAR DOS THREADS EJECUTÁNDOSE EN LA MISMA MÁQUINA VIRTUAL. (JVM).
                    - SON HILOS DIFERENTES, PERO PERTENECEN AL MISMO PROCESO.
                    - LAS TUBERÍAS EN LOS THREADS PUEDEN SER ORÍGENES O DESTINOS DE DATOS, PERO NO A LA VEZ.

           - TUBERÍA EN SISTEMAS UNIX:
                    - DOS PROCESOS QUE SE EJECUTAN EN LUGARES DISTINTOS DE MEMORIA.
                    - LOS PROCESOS PUEDEN COMUNICARSE A TRAVÉS DE UNA TUBERÍA.
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   2/2                           CLASES DE FLUJOS BASADOS EN TUBERÍAS. (PIPE)  
********************************************************************************************************************

    - EJEMPLO TÍPICO DE UTILIZACIÓN DE TUBERÍAS EN JAVA:

           - UN PROCESO CON 2 HILOS.
                    - UN HILO ESCRIBIENDO EN UN STREAM.
                    - OTRO HILO LEYÉNDOLO.

           - EN EL ESPACO COMÚN A AMBOS THREADS, A NIVEL CLASE.                               
                    - SE CREARÁN PipedOutStream Y PipedInputStream.
                    - CONEXIÓN: 
                      LA INSTANCIA DE LA TUBERÍA PipedInputStream 
                      UTILIZARÁ EL PipedOutStream PREVIAMENTE CREADO.

                           final PipedOutputStream salida = new PipedOutputStream();
                           final PipedInputStream entrada = new PipedInputStream(salida);

                    - SE LANZARÁN --> start() --> LOS DOS THREADS.

           - CADA HILO USARÁ UNA DE ELLAS, PERO AMBOS OBJETOS ESTARÁN DEFINIDOS A NIVEL DE CLASES. (SON COMUNES).

                    - EL THREADS QUE ESCRIBE EN LA TUBERÍA INSTANCIARÁ EL PipedOutputStream, 
                      HACIENDO REFERENCIA A UN OBJETO DE SALIDA.
                            - PUEDE SER LA ESCRITURA DE UN FICHERO, O DIRECTAMENTE UNA CADENA DE TEXTO.

                    - EL THREADS QUE LEE, TIENE ACCESO A LOS BYTES QUE LLEGAN A LA TUBERÍA.

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