package Tema_04;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                               
           - API: CONJUNTO DE LIBRER�AS Y CLASES QUE NOS FACILITAN EL ACCESO A LAS BASES DE DATOS RELACIONALES,
                  Y LA POSIBILIDAD DE REALIZAR CONSULTAS A DICHAS BASES DE DATOS.
                       - EST�N EN LOS PAQUETES   -->  java.sql   Y   javax.sql
                               
           - PAQUETE DE PRUEBAS: CLASES QUE VALIDAN SI UN DRIVER PASA LOS REQUISITOS PREVISTOS POR JDBC.
                               
           - GESTOR: REALIZA LA UNI�N ENTRE NUESTRO APLICATIVO Y EL DRIVER APROPIADO JDBC,
                     BIEN POR CONEXI�N DIRECTA, O SINO A TRAV�S DE UN pool DE CONEXIONES.
                               
           - PUENTE JDBC-ODBC: FACILITA USAR DRIVERS ODBC COMO SI ESTUVI�RAMOS TRABAJANDO CON JDBC.
                               
   - 2 TIPOS DE ARQUITECTURA DE CONEXI�N CON JDBC.
                   
           - ARQUITECTURA EN 2 CAPAS:
                    - NUESTRA APLICACI�N SE CONECTAR� A LA BASE DE DATOS A TRAV�S DE UN DRIVER.
                    - TANTO EL DRIVER COMO LA APLICACI�N DEBEN LOCALIZARSE EN EL MISMO SISTEMA O M�QUINA.
                               
           - ARQUITECTURA EN 3 CAPAS:
                    - NUESTRO APLICATIVO ENV�A LAS INSTRUCCIONES A UNA CAPA INTERMADIA, 
                      (MIDDLEWARE) -->  TRADUCTOR: QUE EST� EN OTRA M�QUINA.
                    - ESTA CAPA COGER� LA INFORMACI�N Y LA ENVIAR� A LA BASE DE DATOS,
                      TRADUCIENDO LOS COMANDOS QUE EL APLICATIVO HAYA ENVIADO. 

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