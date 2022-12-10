package Tema_02;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Flujos_Arrays {
    
        
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   1/2                                  CLASES DE FLUJOS BASADOS EN ARRAYS  
********************************************************************************************************************

    - DIVIDIREMOS LAS CLASES BASADAS EN EL FLUJO DE ARRAYS SEGÚN EL TIPO DE ACCESO:
            
            - ARRAYS DE BYTES:          -->  ByteArrayInputStream   -   ByteArrayOutputStream.
                               
            - ARRAYS DE CARACTERES:     -->  CharArrayReader        -   CharArrayWriter.
                               
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 02                                       FLUJOS  -  STREAMS  
********************************************************************************************************************
*   2/2                                  CLASES DE FLUJOS BASADOS EN ARRAYS  
********************************************************************************************************************

    - CharArrayReader: PUEDE LEER ARRAY DE CARACTERES (char) COMO Stream DE CARACTERES.
           - ES ÚTIL SI TENEMOS INFORMACIÓN EN ARRAYS DE CARACTERES Y HAY QUE PASARLO A ALGÚN COMPONENTE
             QUE SOLO LEE DESDE LA CLASE Reader, O UNA SUBCLASE DE Reader.
           - EN ESE CASO: ENCAPSULAMOS EL ARRAY NORMAL EN UN  -->  CharArrayReader
             Y SE PASA AL COMPONENTE:
           PASOS:                     
                   1. INSTANCIAR UN ARRAY DE CARACTER. (LO LLAMAREMOS 'chars').
                   2. PASAR POR PARÁMETROS EL ARRAY AL CREAR UN OBJETO DE LA CLASE   -->  CharArrayReader.
                             DE ESTA FORMA, TENDRÍAMOS EN ESTA CLASE EL CONTENIDO DE TODO EL ARRAY.
                   3. YA TENEMOS LA INFORMACIÓN EN EL OBJETO 'charArrayReader' 
                             --> PODEMOS IR LEYENDO LETRA A LETRA. (char). O LA OERACIÓN QUE SE DESEE.
                   4. EJECUTAMOS EL MÉTODO close(). -> CERRAR Y LIBERAR RECURSOS.
                             
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