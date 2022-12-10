package Tema_04;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
           ES UNA SERIE DE CLASES Y LIBRER�AS IMPLEMENTADAS (EN FORMA DE API) QUE UNEN LA CAPA DE NUESTRA
           APLICACI�N CON LA CAPA DE BASE DE DATOS, PERMITIENDO AS� LA CONEXI�N Y LA REALIZACI�N DE CONSULTAS.
           ALGUNOS EJEMPLOS DE CONECTORES:
                               
                - JDBC -->  JAVA DATABASE CONNECTIVITY.  DESARROLLADO POR SUN.
                - ODBC -->  OPEN DATABASE CONNECTIVITY.  DESARROLLADO POR MICROSOFT.
                - ADO Y ADO.net
                               
    - UNA APLICAC�N QUE ACCEDA A UNA BASE DE DATOS DEBE TENER ASOCIADO SIEMPRE UN CONECTOR.
            - DE ESTA FORMA, NO TENEMOS QUE CONOCER LOS ASPECTOS T�CNICOS,
              NI C�MO FUNCIONAN EN SU INTERIOR LAS BASES DE DATOS.
            - EN SU LUGAR, NOS OCUPAREMOS DE C�MO REALIZAR LA COMUNICACI�N,
              Y DE C�MO FUNCIONA NUESTRO APLICATIVO.
                               
    - USANDO UN CONECTOR:
      NO HABR� QUE PROGRAMAR APLICACIONES DIFERENTES PARA ACCEDER A DISTINTAS BASES DE DATOS,
      NOSOTROS DESARROLLAR�AMOS NUESTRA APLICACI�N, USAR LOS CONECTORES ADECUADOS, 
      Y A LA HORA DE REALIZAR CUALQUIER CONSULTA,
      EL CONECTOR INTERPRETAR�A DE UNA FORMA O DE OTRA SEG�N LA BASE DE DATOS ASOCIADA.
                               
    - EL APLICATIVO S�LO NECESITAR� INFORMACI�N PARA EL ACCESO A LA BASE DE DATOS.
      INDICANDO LAS CONFIGURACIONES, TENDR�AMOS ACCESO SIN PREOCUPARNOS DEL LENGUAJE INTERNO,
      NI FABRICANTE DE CADA UNA DE ELLAS.

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