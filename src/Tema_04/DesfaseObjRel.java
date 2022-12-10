package Tema_04;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class DesfaseObjRel {
    
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
********************************************************************************************************************
*                                               EL DESFASE OBJETO-RELACIONAL  
********************************************************************************************************************

    CONECTOR O DRIVER:
               ES UNA SERIE DE CLASES Y LIBRER�AS IMPLEMENTADAS (EN FORMA DE API) QUE UNEN LA CAPA DE NUESTRA
               APLICACI�N CON LA CAPA DE BASE DE DATOS, PERMITIENDO AS� LA CONEXI�N Y LA REALIZACI�N DE CONSULTAS.
                               
    EL DESFASE OBJETO-RELACIONAL VIENE EN RELACI�N A DOS PUNTOS:
           - TENEMOS LA PARTE DE LA PROGRAMACI�N ORIENTADA A OBJETOS, ES DECIR, EL APLICATIVO,
             EN NUESTRO CASO PROGRAMADO EN JAVA, Y POR TANTO ORIENTADO A OBJETOS, PUDIENDO SER OBJETOS COMPLEJOS.
           - TENEMOS LA BASE DE DATOS FISICA, GENERALMENTE UNA BASE DE DATOS RELACIONAL,
             CON INFORMACI�N ESTRUCTURADA EN TABLAS, ES DECIR, CON DATOS SIMPLES.
                               
    ESTE DESFASE IMPLICA QUE SEA NECESARIA UNA TRADUCCI�N
    DESDE LOS OBJETOS DEL APLICATIVO JAVA A LA BASE DE DATOS RELACIONAL.

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