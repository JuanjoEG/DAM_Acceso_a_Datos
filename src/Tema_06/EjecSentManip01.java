package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class EjecSentManip01 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                         EJECUCI�N DE SENTENCIAS DE MANIPULACI�N DE DATOS I. INSERCI�N
********************************************************************************************************************

    - INSERT:
            - AGREGA NUEVOS REGISTROS EN UNA TABLA PREVIAMENTE DEFINIDA.
            - INSERT-SET O INSERT-VALUES INSERTAN VALORES BASADOS EN COLUMNAS DE LA TABLA.
            - TAMBI�N PODREMOS ENCONTRAR INSERT-SELECT COGIENDO REGISTROS DE OTRA/S TABLA/S.  
                               
      INSERT           -->  INSERT [LOW_PRIORITY | DELAYED | HIGH_PRIORITY] [IGNORE] 
                            [INTO] tbl_name [(col_name, ...)] 
                            VALUES ({expr | DEFAULT}, ...),(...), ... 
                            [ ON DUPLICATE KEY UPDATE col_name=expr, ... ]                                 
                               
    - DELETE:
            - ELIMINA LAS FILAS DE 'tbl_name' QUE VALIDAN LA CONDICI�N EXPRESADA EN 'where_definition'.
            - DEVUELVE EL N�MERO DE REGISTROS ELIMINADOS.
            - NOTA: SI NO ESTABLECEMOS CL�USULA 'where', SE ELIMINAR�N TODAS LAS FILAS DE LA TABLA.
                               
      DELETE           -->  DELETE [LOW_PRIORITY] [QUICK] [IGNORE] FROM tbl_name 
                            [WHERE where_definition] 
                            [ORDER BY ...]    
                            [LIMIT row count]   
                               
    - DO:
            - NO ES EST�DAR DE SQL.
            - EJECUTAMOS EXPRESIONES SIN OBTENER NING�N RESULTADO.
                               
    - HANDLER:
            - NO ES EST�DAR DE SQL.
            - ACCEDEMOS A LAS INTERFACES DEL MOTOR DE LA TABLA. ( - OPEN - READ - CLOSE - )
                               
    - LOAD DATA INFILE:
            - NO ES EST�DAR DE SQL.
            - LEER REGISTROS.                   
                                   
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