package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class EjecSentConsult02 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                                            EJECUCI�N DE CONSULTAS II. WHERE
********************************************************************************************************************

      OPERADORES       -->        <    <=    =    !=    <>    >=    >   AND    OR    NOT    (     )                             
                                                                                                                                
      NULOS            -->        IS NULL     IS NOT NULL
                               
                           UN VALOR ES NULO CUANDO NO EXISTE VALOR, UN REGISTRO EN BLANCO NO SER�A NULO.
                                                                                                                                
      LIKE             -->  REALIZA COMPARACIONES DE REGISTROS.   _ UN CARACTER                    % UNA CADENA                 
                                                                 WHERE apellido LIKE 'A_'   WHERE apellido LIKE 'C%'
                               
                           CON EL % INDICAMOS QUE PUEDE IR CUALQUIER CADENA DE CARACTERES EN ESA POSICI�N.
                           CON EL _ SER�A EL MISMO CONCEPTO, PERO EN ESTE CASO, SOLO CON UN CAR�CTER.
                                                                                                                                
      BETWEEN          -->  RANGO DE VALORES.                                                    WHERE edad BETWEEN 3 AND 7     
                                                                                                                                
      IN(valores)      -->  QUEREMOS MOSTRAR LOS RESULTADOS QUE COINCIDA CON VALORES MARCADOS.   WHERE edad IN (3,4,7,8)        
                                                                                                                                
      ORDER BY         -->  ESTABLECE UN ORDEN PARA MOSTRAR LOS RESULTADOS.     [ASC | DESC]                                    
                                                                                                                                 
                                                             
      SELECT           -->  SELECT [ALL | DISTINCT] <columnas> [AS <mombre_del_alias>] 
                            FROM <tablas>                                                 
                            [WHERE <condici�n> [AND | OR <condici�n>] ]                
                            [GROUP BY <nombe_columna>]                              
                            [HAVING <criterios_de_agrupaci�n>]                                      
                            [HORDER BY <nombre_columna> | <�ndice_columna> [ASC | DESC] ];
                               
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