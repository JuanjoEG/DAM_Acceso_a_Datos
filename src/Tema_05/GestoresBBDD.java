package Tema_05;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class GestoresBBDD {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 05                                       MANEJO DE CONECTORES II
********************************************************************************************************************
*                                  GESTORES DE BASES DE DATOS EMBEBIDOS E INDEPENDIENTES
********************************************************************************************************************

   DIFERENTES POSIBILIDADES PARA EL ALMACENAMIENTO DE DATOS EN SISTEMAS DE BASES DE DATOS RELACIONALES,
   QUE GIRAN ALREDEDOR DEL DESARROLLO DE NUESTRO APLICATIVO:
                               
        - GESTORES DE BASES DE DATOS EN MEMORIA:
                - SON LAS MÁS RÁPIDAS.
                - ALMACENA TODA LA INFORMACIÓN DE LA MISMA EN MEMORIA PRINCIPAL DEL SISTEMA. --> RAM.
                - LA MEMORIA ES VOLÁTIL: LA INFORMACIÓN SOLO PERMANECE MIENTRAS LA APLICACIÓN ESTÉ EJECUTANDOSE.
                - NO SE ALMACENA NINGÚN DATO EN DISCO.
                               
        - GESTORES DE BASES DE DATOS EMBEBIDAS:
                - ES PARTE DE LA APLICACIÓN QUE SE HA DESARROLLADO.
                - EL MOTOR DE LA BASE DE DATOS CORRE CON EL MISMO MOTOR DE LA APLICACIÓN JAVA (JVM -> JAVA VIRTUAL MACHINE).
                  MIENTRAS LA APLICACIÓN ESTÁ EN EJECUCIÓN.
                - ACCEDEREMOS A ESTE TIPO DE BASE DE DATOS POR MEDIO DE LOS JDBC DRIVER.
                - DESVENTAJAS:
                       - COHESIÓN -> TODOS LOS ELEMENTOS ESTÁN MUY RELACIONADOS ENTRE SÍ, LE RESTA FLEXIBILIDAD.
                       - DIFICULTAD DE MANTENIMIENTO: NO ESTÁ CONSTRUIDAS PARA GESTIONAR MUCHOS PROBLEMAS.
                - USO RECOMENDADO: REPOSITORIO PARA PERSISTIR LAS TRANSACCIONES SIN NINGÚN TIPO
                                   DE INTERVENCIÓN POR PARTE DEL USUARIO.
                - EJEMPLOS: HyperSQL, OBjectDB, JavaDB, Apache, Derby, H2
                               
        - GESTORES DE BASES DE DATOS INDEPENDIENTES:
                - DISPONEN DE UN GESTOR O ADMINISTRADOR DE BASE DE DATOS
                  DEDICADO A RESOLVER CIERTOS PROBLEMAS DE MANTENIMIENTO.
                - SON LOS SGBD, SISTEMAS DE GESTIÓN DE BASES DE DATOS RELACIONALES.
                - LAS BASES DE DATOS CLIENTE/SERVIDOR SON INDEPENDIENTES Y, LAS MÁS PESADAS Y POTENTES.
                - EJEMPLOS: Oracle, SQL Server, MySQL, Postgres

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