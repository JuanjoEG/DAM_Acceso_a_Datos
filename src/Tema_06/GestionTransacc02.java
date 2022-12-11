package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
*                                    GESTI�N DE TRANSACCIONES. LA INTERFAZ STATEMENT.
********************************************************************************************************************

   - LA INTERFAZ Statement LA USAMOS CUANDO SE TRATA DE REALIZAR UNA CONEXI�N CON UN DRIVER DE UN BASE DE DATOS.
     ES LA ENCARGADA DE EJECUTAR LAS SENTENCIAS SQL EN NUESTRO APLICATIVO
     Y RECOGER LOS RESULTADOS PARA MANIPULARLOS M�S TARDE.
                               
   - UNA VEZ QUE SE CREA EL OBJETO Statement, DISPONEMOS DE UN LUGAR PARA REALIZAR CONSULTAS SQL;
     PODREMOS UTILIZAR DIFERENTES M�TODOS:
                               
           - executeQuery(String):
                       - UTILIZAREMOS ESTE M�TODO PARA REALIZAR SENTENCIAS SELECT.
                       - NOS DEVOLVER� UN OBJETO ResultSet CON TODA LA INFORMACI�N RESULTANTE.
                               
           - executeUpdate(String):
                       - UTILIZAREMOS ESTE M�TODO PARA REALIZAR SENTENCIAS MANIPULACI�N DE DATOS.
                               - INSERT, DELETE, UPDATE, ETC...
                       - NOS DEVOLVER� UN ENTERO QUE CONTIENE LA CANTIDAD DE FILAS QUE HAN SIDO AFECTADAS EN LA OPERACI�N.
                               
           - execute(String):
                       - UTILIZAREMOS ESTE M�TODO PARA EJECUTAR CUALQUIERA DE LAS ACCIONES PROPUESTAS EN LOS DOS CASOS ANTERIORES.
                        - NOS DEVOLVER�:
                               - True:    SI LA SENTENCIA DEVUELVE UN ResultSet,
                                          Y PARA ACCEDER A �L, TENDREMOS QUE EJECUTAR EL M�TODO getResultSet().
                               - False:   SI LA SENTENCIA DEVUELVE UN int,
                                          Y PARA ACCEDER A �L, TENDREMOS QUE EJECUTAR EL M�TODO getUpdateCount().
                               
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