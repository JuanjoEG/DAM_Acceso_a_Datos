package Tema_04;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class ProtolosAccesoBD {
    
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
********************************************************************************************************************
*                                        PROTOCOLOS DE ACCESO A BASE DE DATOS  
********************************************************************************************************************

    CONECTOR O DRIVER:
           ES UNA SERIE DE CLASES Y LIBRERÍAS IMPLEMENTADAS (EN FORMA DE API) QUE UNEN LA CAPA DE NUESTRA
           APLICACIÓN CON LA CAPA DE BASE DE DATOS, PERMITIENDO ASÍ LA CONEXIÓN Y LA REALIZACIÓN DE CONSULTAS.
           ALGUNOS EJEMPLOS DE CONECTORES:
                               
                - JDBC -->  JAVA DATABASE CONNECTIVITY.  DESARROLLADO POR SUN.
                - ODBC -->  OPEN DATABASE CONNECTIVITY.  DESARROLLADO POR MICROSOFT.
                - ADO Y ADO.net
                               
    - UNA APLICACÓN QUE ACCEDA A UNA BASE DE DATOS DEBE TENER ASOCIADO SIEMPRE UN CONECTOR.
            - DE ESTA FORMA, NO TENEMOS QUE CONOCER LOS ASPECTOS TÉCNICOS,
              NI CÓMO FUNCIONAN EN SU INTERIOR LAS BASES DE DATOS.
            - EN SU LUGAR, NOS OCUPAREMOS DE CÓMO REALIZAR LA COMUNICACIÓN,
              Y DE CÓMO FUNCIONA NUESTRO APLICATIVO.
                               
    - USANDO UN CONECTOR:
      NO HABRÁ QUE PROGRAMAR APLICACIONES DIFERENTES PARA ACCEDER A DISTINTAS BASES DE DATOS,
      NOSOTROS DESARROLLARÍAMOS NUESTRA APLICACIÓN, USAR LOS CONECTORES ADECUADOS, 
      Y A LA HORA DE REALIZAR CUALQUIER CONSULTA,
      EL CONECTOR INTERPRETARÍA DE UNA FORMA O DE OTRA SEGÚN LA BASE DE DATOS ASOCIADA.
                               
    - EL APLICATIVO SÓLO NECESITARÁ INFORMACIÓN PARA EL ACCESO A LA BASE DE DATOS.
      INDICANDO LAS CONFIGURACIONES, TENDRÍAMOS ACCESO SIN PREOCUPARNOS DEL LENGUAJE INTERNO,
      NI FABRICANTE DE CADA UNA DE ELLAS.

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