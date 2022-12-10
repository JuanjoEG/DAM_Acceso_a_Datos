package Tema_01;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class OperacioneBuffer {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
                        System.out.println("""

********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  1/2                         OPERACIONES CON BUFFER
********************************************************************************************************************

        OPERACIONES CON BUFFER:
        UTILIZACIÓN DE BUFFER --> MEMORIA INTERNA / MEMORIA INTERMEDIA)
                                           
    - TODAS ESTAS CLASES DE TRATAMIENTO DE INFORMACIÓN DE FICHEROS,
      REALIZAN LAS OPERACIONES DE LECTURA O ESCRITURA CAPTURANDO BYTES DEL DISCO.
                                           
    - OTRA POSIBILIDAD PARA EL ACCESO A LA INFORMACIÓN DE LOS FICHEROS ES A TRAVÉS DE BUFFERS:
      LA INFORMACIÓN SE ALMACENA EN BLOQUES DE BYTES COMPLETOS (BUFFER) EN MEMORIA INTERNA RAM.
                                           
            - EL ACCESO A LA MEMORIA INTERNA ES MUCHO MÁS RÁPIDO QUE A DISCO,
              A TRAVÉS DEL BUFFER SE CONSIGUE MÁS RAPIDEZ EN EL PROCESO.
                                           
            - CUANDO TODA LA INFORMACIÓN DEL BUFFER YA SE HA UTILIZADO Y SE NECESITA MÁS DATOS,
              SE VUELVE A VOLCAR OTRO BLOQUE DE BYTES A LA MEMORIA BUFFER.
                                           
            - LA CANTIDAD DE MEMORIA INTERNA ES LIMITADA,
              ES IMPORTANTE HACER UNA GESTIÓN ADECUADA DE LOS RECURSOS.

********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  2/2                         OPERACIONES CON BUFFER
********************************************************************************************************************

        OPERACIONES CON BUFFER:
        CLASES PARA LA REALIZACIÓN DE OPERACIONES CON BUFFER:
                             
            - BufferedInputStream    
            - BufferedOutputStream    
            - BufferedWriter          
            - BufferedReader                     
                             
        PERMITEN LEER Y ESCRIBIR INFORMACIÓN MEJORANDO EL RENDIMIENTO,
        EN COMPARACIÓN CON FileInputStream O FileOutStream.
        
        LAS OPERACIONES DE ESCRITURA EN BUFFER SE REALIZAN EN MEMORIA RAM. PARA HACERLAS EFECTIVAS:
        .close()  -->  EL CONTENIDO DEL BUFFER SE VUELCA AL FICHERO. --> LIBERAS EL RECURSO.
                                                                     
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