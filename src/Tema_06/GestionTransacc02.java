package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class GestionTransacc02 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                                    GESTIÓN DE TRANSACCIONES. LA INTERFAZ STATEMENT.
********************************************************************************************************************

   - LA INTERFAZ Statement LA USAMOS CUANDO SE TRATA DE REALIZAR UNA CONEXIÓN CON UN DRIVER DE UN BASE DE DATOS.
     ES LA ENCARGADA DE EJECUTAR LAS SENTENCIAS SQL EN NUESTRO APLICATIVO
     Y RECOGER LOS RESULTADOS PARA MANIPULARLOS MÁS TARDE.
                               
   - UNA VEZ QUE SE CREA EL OBJETO Statement, DISPONEMOS DE UN LUGAR PARA REALIZAR CONSULTAS SQL;
     PODREMOS UTILIZAR DIFERENTES MÉTODOS:
                               
           - executeQuery(String):
                       - UTILIZAREMOS ESTE MÉTODO PARA REALIZAR SENTENCIAS SELECT.
                       - NOS DEVOLVERÁ UN OBJETO ResultSet CON TODA LA INFORMACIÓN RESULTANTE.
                               
           - executeUpdate(String):
                       - UTILIZAREMOS ESTE MÉTODO PARA REALIZAR SENTENCIAS MANIPULACIÓN DE DATOS.
                               - INSERT, DELETE, UPDATE, ETC...
                       - NOS DEVOLVERÁ UN ENTERO QUE CONTIENE LA CANTIDAD DE FILAS QUE HAN SIDO AFECTADAS EN LA OPERACIÓN.
                               
           - execute(String):
                       - UTILIZAREMOS ESTE MÉTODO PARA EJECUTAR CUALQUIERA DE LAS ACCIONES PROPUESTAS EN LOS DOS CASOS ANTERIORES.
                        - NOS DEVOLVERÁ:
                               - True:    SI LA SENTENCIA DEVUELVE UN ResultSet,
                                          Y PARA ACCEDER A ÉL, TENDREMOS QUE EJECUTAR EL MÉTODO getResultSet().
                               - False:   SI LA SENTENCIA DEVUELVE UN int,
                                          Y PARA ACCEDER A ÉL, TENDREMOS QUE EJECUTAR EL MÉTODO getUpdateCount().
                               
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