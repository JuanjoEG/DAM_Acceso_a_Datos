package Tema_05;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
              MÁQINA VIRTUAL DE JAVA QUE USA NUESTRA APLICACIÓN.
                               
            - UNA BASE DE DATOS INDEPENDIENTE CONSUMIRÁ SIEMPRE MÁS RECURSOS QUE UNA EMBEBIDA.
                               
            - A NIVEL DE FUNCIONALIDAD Y OPERATIVO, LAS BASES DE DATOS EMBEBIDAS ESTÁN RESTRINGIDAS.
                               
            - NORMALMENTE LOS SGBD INDEPENDIENTES SE INSTALAN EN OTRA MÁQUINA FÍSICA.
                   - VENTAJAS DE LA INSTALACIÓN EN UNA MÁQUINA AISLADA PARA LA BASE DE DATOS:
                            - APROVECHARÁ MEJOR LOS RECURSOS QUE TIENE DISPONIBLES.
                            - EN DICHA MÁQUINA SEPARADA, NO TIENE LAS LIMITACIONES 
                              Y RESTRICCIONES DE FUNCIONALIDAD Y OPERATIVA DE LAS EMBEBIDAS.
                              PUEDE VOLCAR TODO EL POTENCIAL QUE OFRECE CON TODOS SUS PROCEDIMIENTOS Y OPERATIVOS.
                   - PUEDE SER INSTALADA EN LOCAL PARA PRUEBAS O APRENDIZAJE.
                               
            - ALGUNAS DE LAS BASES DE DATOS RELACIONALES INDEPENDIENTES MÁS RECONOCIDAS A NIVEL COMERCIAL
              Y DE MAYOR POTENCIA Y EXTENSIÓN SON:
                        
                        - Oracle
                        - SQL Server DataBase
                        - Postgres SQL
                        - MySQL
                               
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