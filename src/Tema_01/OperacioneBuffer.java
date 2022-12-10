package Tema_01;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class OperacioneBuffer {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
                        System.out.println("""

********************************************************************************************************************
*  TEMA 01                 INTRODUCCI�N AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  1/2                         OPERACIONES CON BUFFER
********************************************************************************************************************

        OPERACIONES CON BUFFER:
        UTILIZACI�N DE BUFFER --> MEMORIA INTERNA / MEMORIA INTERMEDIA)
                                           
    - TODAS ESTAS CLASES DE TRATAMIENTO DE INFORMACI�N DE FICHEROS,
      REALIZAN LAS OPERACIONES DE LECTURA O ESCRITURA CAPTURANDO BYTES DEL DISCO.
                                           
    - OTRA POSIBILIDAD PARA EL ACCESO A LA INFORMACI�N DE LOS FICHEROS ES A TRAV�S DE BUFFERS:
      LA INFORMACI�N SE ALMACENA EN BLOQUES DE BYTES COMPLETOS (BUFFER) EN MEMORIA INTERNA RAM.
                                           
            - EL ACCESO A LA MEMORIA INTERNA ES MUCHO M�S R�PIDO QUE A DISCO,
              A TRAV�S DEL BUFFER SE CONSIGUE M�S RAPIDEZ EN EL PROCESO.
                                           
            - CUANDO TODA LA INFORMACI�N DEL BUFFER YA SE HA UTILIZADO Y SE NECESITA M�S DATOS,
              SE VUELVE A VOLCAR OTRO BLOQUE DE BYTES A LA MEMORIA BUFFER.
                                           
            - LA CANTIDAD DE MEMORIA INTERNA ES LIMITADA,
              ES IMPORTANTE HACER UNA GESTI�N ADECUADA DE LOS RECURSOS.

********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 01                 INTRODUCCI�N AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  2/2                         OPERACIONES CON BUFFER
********************************************************************************************************************

        OPERACIONES CON BUFFER:
        CLASES PARA LA REALIZACI�N DE OPERACIONES CON BUFFER:
                             
            - BufferedInputStream    
            - BufferedOutputStream    
            - BufferedWriter          
            - BufferedReader                     
                             
        PERMITEN LEER Y ESCRIBIR INFORMACI�N MEJORANDO EL RENDIMIENTO,
        EN COMPARACI�N CON FileInputStream O FileOutStream.
        
        LAS OPERACIONES DE ESCRITURA EN BUFFER SE REALIZAN EN MEMORIA RAM. PARA HACERLAS EFECTIVAS:
        .close()  -->  EL CONTENIDO DEL BUFFER SE VUELCA AL FICHERO. --> LIBERAS EL RECURSO.
                                                                     
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
                    default -> System.out.println("\n ��� LA OPCI�N NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}