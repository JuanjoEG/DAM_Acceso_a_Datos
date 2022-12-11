package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class EjecSentManip02 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                         EJECUCIÓN DE SENTENCIAS DE MANIPULACIÓN DE DATOS II. EDICIÓN
********************************************************************************************************************

    - UPDATE:
            - ACTUALIZA LA INFORMACIÓN DE LAS COLUMNAS QUE LE INDIQUEMOS EN LA SECCIÓN SET CON INFORMACIÓN NUEVA.
            - CON LA CLÁUSULA WHERE INDICAREMOS QUÉ REGISTROS DEBEN ACTUALIZARSE.
            - SI NO EXISTE ESTA CLÁUSULA, SE MODIFICARÁN TODOS.
                               
       UPDATE           -->  UPDATE [LOW_PRIORITY] [IGNORE] tbl_name [AS <mombre_del_alias>]                                     
                             SET col_name1=exp1 [, col_name2=exp2 ...]                                                           
                             [WHERE where_definition]                                                                             
                             [ORDER BY ...]                                                                                       
                             [LIMIT row_count]
                               
    - TRUNCATE:
            - ELIMINARÁ COMPLETAMENTE UNA TABLA.
            - ES EQUIVALENTE A UN DELETE, CON LIGERAS DIFERENCIAS DEPENDIENDO DEL MOTOR DE BASE DE DATOS:
            - EN ALGUNOS SE REALIZA UN DELETE, Y SE BORRAN TODOS LOS REGISTROS DE ESA TABLA.
            - PARA OTROS MOTORES DE BASE DE DATOS, SE ELIMINA EL OBJETO COMPLETO DE LA TABLA Y SE VUELVE A CREAR.
            - DARÁ UN ERROR SI DICHA TABLA ESTÁ OCUPADA. EN USO.
            - DARÁ UN ERROR POR ESE MOTIVO PORQUE SON OPERACIONES NO TRANSACCIONALES.                   
   
       TRUNCATE         -->  TRUNCATE TABLE tbl_name
                               
    - REPLACE:
            - NO ES ESTÁDAR DE SQL.
            - ES UNA EXTENSIÓN DE MySQL.
            - REEMPLAZA REGISTROS EN UNA TABLA.
                                   
       REPLACE          -->  REPLACE [LOW_PRIORITY | DELAYED] 
                             [INTO] tbl_name [(col_name, ...)]
                               
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