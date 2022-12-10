package Tema_04;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class TiposDriversConexionesJDBC {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
********************************************************************************************************************
*                                          TIPOS DE DRIVERS DE CONEXIONES JDBC
********************************************************************************************************************

    - DRIVER TIPO 1 JDBC-ODBC             CON PUENTE ODBC
                               
             - USA API NATIVA, QUE TRADUCE LAS LLAMADAS REALIZADAS DE JDBC A ODBC.
             - LOS DATOS DEVUELTOS POR LA BBDD SE TRADUCEN DE ODBC A JDBC.
                               
    - DRIVER TIPO 2 JDBC NATIVO           CON API NATIVO
                               
              - ESCRITOS UNA PARTE EN JAVA, Y OTRA PARTE EN CÓDIGO NATIVO.
              - LAS LLAMADAS AL API JDBC SE TRADUCEN EN LLAMADAS PROPIAS DE LA BBDD RELACIONAL QUE TENGAMOS.
              - CADA CLIENTE DEBE TENER INSTALADO EL DRIVER.
                               
    - DRIVER TIPO 3 JDBC NET  (3 CAPAS)   CON MIDDLEWARE
                               
              - 3 CAPAS: LAS SOLICITUDES JDBC SE TRADUCEN EN UN PROTOCOLO DE RED EN UNA CAPA INTERMEDIA, MIDDLEWARE,
                QUE ENVÍA LAS SOLICITUDES A LA BBDD USANDO UN DRIVER JDBC DE TIPO 1 O 2.
              - ES UNA ARQUITECTURA MUY FLEXIBLE.
                               
    - DRIVER TIPO 4 PROTOCOLO NATIVO
                               
              - REALIZA LAS LLAMADAS MEDIANTE EL SERVIDOR DE BASE DE DATOS, USANDO SU PROTOCOLO NATIVO.
              - LA LLAMADA JDBC SE TRADUCE DIRECTAMENTE EN UNA LLAMADA DE RED A LA BASE DE DATOS, SIN INTERMEDIARIOS.
              - PUEDEN DESARROLLARSE AL COMPLETO EN JAVA.
              - SI CAMBIASE LA BASE DE DATOS,
                HABRIA QUE DESARROLLAR OTRO DRIVER NATIVO ADAPTADO A LA NUEVA BBDD RELACIONAL.

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