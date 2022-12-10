package Tema_05;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                - SON LAS M�S R�PIDAS.
                - ALMACENA TODA LA INFORMACI�N DE LA MISMA EN MEMORIA PRINCIPAL DEL SISTEMA. --> RAM.
                - LA MEMORIA ES VOL�TIL: LA INFORMACI�N SOLO PERMANECE MIENTRAS LA APLICACI�N EST� EJECUTANDOSE.
                - NO SE ALMACENA NING�N DATO EN DISCO.
                               
        - GESTORES DE BASES DE DATOS EMBEBIDAS:
                - ES PARTE DE LA APLICACI�N QUE SE HA DESARROLLADO.
                - EL MOTOR DE LA BASE DE DATOS CORRE CON EL MISMO MOTOR DE LA APLICACI�N JAVA (JVM -> JAVA VIRTUAL MACHINE).
                  MIENTRAS LA APLICACI�N EST� EN EJECUCI�N.
                - ACCEDEREMOS A ESTE TIPO DE BASE DE DATOS POR MEDIO DE LOS JDBC DRIVER.
                - DESVENTAJAS:
                       - COHESI�N -> TODOS LOS ELEMENTOS EST�N MUY RELACIONADOS ENTRE S�, LE RESTA FLEXIBILIDAD.
                       - DIFICULTAD DE MANTENIMIENTO: NO EST� CONSTRUIDAS PARA GESTIONAR MUCHOS PROBLEMAS.
                - USO RECOMENDADO: REPOSITORIO PARA PERSISTIR LAS TRANSACCIONES SIN NING�N TIPO
                                   DE INTERVENCI�N POR PARTE DEL USUARIO.
                - EJEMPLOS: HyperSQL, OBjectDB, JavaDB, Apache, Derby, H2
                               
        - GESTORES DE BASES DE DATOS INDEPENDIENTES:
                - DISPONEN DE UN GESTOR O ADMINISTRADOR DE BASE DE DATOS
                  DEDICADO A RESOLVER CIERTOS PROBLEMAS DE MANTENIMIENTO.
                - SON LOS SGBD, SISTEMAS DE GESTI�N DE BASES DE DATOS RELACIONALES.
                - LAS BASES DE DATOS CLIENTE/SERVIDOR SON INDEPENDIENTES Y, LAS M�S PESADAS Y POTENTES.
                - EJEMPLOS: Oracle, SQL Server, MySQL, Postgres

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