package Tema_05;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class GestoresIndepend {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 05                                       MANEJO DE CONECTORES II
********************************************************************************************************************
*                                          GESTORES DE BASES DE DATOS INDEPENDIENTES
********************************************************************************************************************

    - DIFERENCIAS PRINCIPALES CON LOS SGBD EMBABIDOS
                               
            - UNA BASE DE DATOS INDEPENDIENTE NO PUEDE EJECUTARSE BAJO LA MISMA
              M�QINA VIRTUAL DE JAVA QUE USA NUESTRA APLICACI�N.
                               
            - UNA BASE DE DATOS INDEPENDIENTE CONSUMIR� SIEMPRE M�S RECURSOS QUE UNA EMBEBIDA.
                               
            - A NIVEL DE FUNCIONALIDAD Y OPERATIVO, LAS BASES DE DATOS EMBEBIDAS EST�N RESTRINGIDAS.
                               
            - NORMALMENTE LOS SGBD INDEPENDIENTES SE INSTALAN EN OTRA M�QUINA F�SICA.
                   - VENTAJAS DE LA INSTALACI�N EN UNA M�QUINA AISLADA PARA LA BASE DE DATOS:
                            - APROVECHAR� MEJOR LOS RECURSOS QUE TIENE DISPONIBLES.
                            - EN DICHA M�QUINA SEPARADA, NO TIENE LAS LIMITACIONES 
                              Y RESTRICCIONES DE FUNCIONALIDAD Y OPERATIVA DE LAS EMBEBIDAS.
                              PUEDE VOLCAR TODO EL POTENCIAL QUE OFRECE CON TODOS SUS PROCEDIMIENTOS Y OPERATIVOS.
                   - PUEDE SER INSTALADA EN LOCAL PARA PRUEBAS O APRENDIZAJE.
                               
            - ALGUNAS DE LAS BASES DE DATOS RELACIONALES INDEPENDIENTES M�S RECONOCIDAS A NIVEL COMERCIAL
              Y DE MAYOR POTENCIA Y EXTENSI�N SON:
                        
                        - Oracle
                        - SQL Server DataBase
                        - Postgres SQL
                        - MySQL
                               
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