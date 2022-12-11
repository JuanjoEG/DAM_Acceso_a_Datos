package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class GestionTransacc01 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                                    GESTI�N DE TRANSACCIONES. COMMIT-ROLLBACK-SAVEPOINT.
********************************************************************************************************************

   - UNA TRANSACCI�N EN SQL SON UNIDADES O CONJUNTOS DE ACCIONES
     QUE SE REALIZAN EN SERIE Y DE FORMA ORDENADA EN EL SISTEMA GESTOR DE BASE DE DATOS.
                               
   - LOS OBJETOS DE LAS TRANSACCIONES SON DOS:
           - PROPORCIONAR CONSISTENCIA EN LA BASE DE DATOS REALIZANDO SECUENCIAS DE ALTA FIABILIDAD,
             DE TAL FORMA QUE SE PUEDA VOLVER A ESTADOS ANTERIORES F�CILMENTE.
           - OFRECER AISLAMIENTO CUANDO M�S DE UN APLICATIVO EST� ACCEDIENDO A LOS DATOS SIMULTANEAMENTE.
                               
   - COMANDOS DE CONTROL PRINCIPALES QUE SE REALIZAN PARA LA EJECUCI�N DE TRANSACCIONES EN SQL:
           - COMMIT:    CON ESTE COMANDO SE PERSISTIR�N LOS CAMBIOS EN LA BASE DE DATOS.
           - ROLLBACK:  DESHAREMOS LOS CAMBIOS QUE SE HUBIERAN EJECUTADO HASTA EL MOMENTO Y SE ABANDONAR� LA TRANSACCI�N.
           - SAVEPOINT: PUNTOS DONDE SE PODR� ALMACENAR Y, EN CASO DE ROLLBACK, SE PODR� VOLVER A DICHO PUNTO DE CONTROL.
                               
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