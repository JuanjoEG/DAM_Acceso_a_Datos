package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class EjecSentConsult01 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                                            EJECUCI�N DE CONSULTAS I. SELECT
********************************************************************************************************************

    - UNA CONSULTA, B�SICAMENTE, NO ES M�S QUE REALIZAR UNA PREGUNTA A BASE DE DATOS CON UNA SERIE DE CRITERIOS,
      Y �STA DEVOLVER� UNA RESPUESTA A DICHA PREGUNTA. LA FORMA PRINCIPAL DE REALIZAR ESTAS 'PREGUNTAS'
      ES A PARTIR DE UN SELECT.
            - PODREMOS CONSULTAR UNA TABLA O M�S DE UNA.
            - EXISTEN DISTINTAS CL�USILAS VINCULADAS A SELECT: HAVING, ORDER BY, UNION, ETC...
                               
    - CUANDO REALIZAMOS UNA CONSULTA CON SELECT, LO QUE OBTENEMOS ES UNA ESPECIE DE 'TABLA FICTICIA' EN MEMORIA.
            - SON UNA SERIE DE RESULTADOS QUE SE RELACIONAN ACORDE A NUESTROS REQUISITOS EN LA CONSULTA.
            - ESTA TABLA DE LA QUE HABLAMOS, NO PERSISTE EN DISCO: SE MANTIENE EN MEMORIA MIENTRAS LA ESTEMOS USANDO.
                              
    - ALGUNOS PUNTOS PRINCIPALES DE LA SINTAXIS DE LA SENTENCIA SELECT:
            - SELECT: JUNTO A LA PALABRA CLAVE 'SELECT' PODREMOS:
                    - A�ADIR [ALL/DISTINCT]: INDICAREMOS SI QUEREMOS MOSTRAR FILAS DUPLICADAS,
                      O SI EN EL CONJUNTO DE RESULTADOS, INCLUIREMOS FILAS �NICAS, RESPECTIVAMENTE.
                    - A�ADIR ASTERISCO [*] SEGUIDO DE UN LISTADO DE COLUMNAS [COLUMNAS].
                    - REALIZAR UN ALIAS CON LA PALABRA CLAVE AS[NOMBRE DEL ALIAS].
            - FROM: USAREMOS LA PALABRA CLAVE 'FROM' Y A CONTINUACI�N EL NOMBRE DE LA TABLA/S O VISTA/S.
                               
    - CON LA CL�USULA WHERE ESPECIFICAREMOS CONDICIONES DE FILTRO:
      USAREMOS DICHA CL�USULA CUANDO NO QUERAMOS OBTENER EL CONTENIDO TOTAL
      DE LA TABLA O TABLAS QUE ESTEMOS CONSULTANDO. 
                                                             
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