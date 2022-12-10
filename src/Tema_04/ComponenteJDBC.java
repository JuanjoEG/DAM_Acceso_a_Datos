package Tema_04;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class ComponenteJDBC {
    
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
********************************************************************************************************************
*                                                COMPONENTES DE JDBC   
********************************************************************************************************************

   - 4 COMPONENTES:
                               
           - API: CONJUNTO DE LIBRERÍAS Y CLASES QUE NOS FACILITAN EL ACCESO A LAS BASES DE DATOS RELACIONALES,
                  Y LA POSIBILIDAD DE REALIZAR CONSULTAS A DICHAS BASES DE DATOS.
                       - ESTÁN EN LOS PAQUETES   -->  java.sql   Y   javax.sql
                               
           - PAQUETE DE PRUEBAS: CLASES QUE VALIDAN SI UN DRIVER PASA LOS REQUISITOS PREVISTOS POR JDBC.
                               
           - GESTOR: REALIZA LA UNIÓN ENTRE NUESTRO APLICATIVO Y EL DRIVER APROPIADO JDBC,
                     BIEN POR CONEXIÓN DIRECTA, O SINO A TRAVÉS DE UN pool DE CONEXIONES.
                               
           - PUENTE JDBC-ODBC: FACILITA USAR DRIVERS ODBC COMO SI ESTUVIÉRAMOS TRABAJANDO CON JDBC.
                               
   - 2 TIPOS DE ARQUITECTURA DE CONEXIÓN CON JDBC.
                   
           - ARQUITECTURA EN 2 CAPAS:
                    - NUESTRA APLICACIÓN SE CONECTARÁ A LA BASE DE DATOS A TRAVÉS DE UN DRIVER.
                    - TANTO EL DRIVER COMO LA APLICACIÓN DEBEN LOCALIZARSE EN EL MISMO SISTEMA O MÁQUINA.
                               
           - ARQUITECTURA EN 3 CAPAS:
                    - NUESTRO APLICATIVO ENVÍA LAS INSTRUCCIONES A UNA CAPA INTERMADIA, 
                      (MIDDLEWARE) -->  TRADUCTOR: QUE ESTÁ EN OTRA MÁQUINA.
                    - ESTA CAPA COGERÁ LA INFORMACIÓN Y LA ENVIARÁ A LA BASE DE DATOS,
                      TRADUCIENDO LOS COMANDOS QUE EL APLICATIVO HAYA ENVIADO. 

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