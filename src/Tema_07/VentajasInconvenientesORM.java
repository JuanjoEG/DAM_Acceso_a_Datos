package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class VentajasInconvenientesORM {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 07                                     EL MAPEO OBJETO RELACIONAL  
********************************************************************************************************************
*                                  VENTAJAS E INCONVENIENTES DEL MAPEO OBJETO RELACIONAL.
********************************************************************************************************************

    - OPERACIONES CON LAS BASES DE DATOS:
           - CONEXI�N: JAVA POSEE UNA API DE CONEXI�N A BASE DE DATOS: LOS DRIVERS JDBC.
           - CONSULTA: JAVA FACILITA LA FORMA DE CONSULTAR LA INFORMACI�N EN BASES DE DATOS USANDO SQL.
                   - ESCRIBIR�AMOS CIERTAS CONSULTAS SQL NATIVAS,
                     Y OBTENDR�AMOS UN RESULTSET CON EL RESULTADO DE NUESTRA QUERY.
                               
    - PROBLEMA:
           - EL DESARROLADOR DEBE CONOCER LA BASE DE DATOS A FONDO,
             Y SABER QU� TIPO DE RELACIONES EXISTEN ENTRE TABLAS,
             AS� COMO EL NOMBRE EXACTO DE LAS COLUMNAS, CONSTRAINTS (CONDICIONES, REQUISITOS, RESTRICCIONES), ETC...
                               
    - LA PERSPECTIVA SER�A OTRA SI CONSIGUIERAMOS REALIZAR LAS MISMAS OPERACIONES CON LOS DATOS DESDE JAVA:
           - TENDR�AMOS ABSTRACCI�N, HERENCIA, COMPOSICI�N, M�TODOS, IDENTIDAD,
             Y MUCHAS CARACTER�STICAS M�S EN LA PARTE DE LA APLICACI�N JAVA.
                   - ESTAS CARACTER�STICAS SE PUEDEN CONSEGUIR TAMBI�N POR MEDIO DE FRAMEWORKS;
                     ESE ES UNO DE LOS MOTIVOS DEL USO DE LOS    --->   ORM.
                               
    EXISTEN DISTINTOS TIPOS DE BASES DE DATOS,
    CADA UNA CON DIFERENTES TIPOS DE FUNCIONALIDADES Y TIPOLOG�A DE DATOS DEFINIDOS.
           - CUANDO USAMOS LA CONEXI�N JDBC DEBEMOS TENER EN CUENTA ESTE TIPO DE DIFERENCIAS.
                               
        *********************************************************************************************
        *              VENTAJAS USO ORM               *          INCONVENIENTES USO ORM             *
        *********************************************************************************************
        *  MEJORA LA EFICIENCIA DEL DESARROLLO        *  EL MAPEO AUTOM�TICO DE LAS BD CONSUME      *
        *                                             *  MUCHOS RECURSOS DEL SISTEMA                *
        *---------------------------------------------*---------------------------------------------*
        *  DESARROLLO M�S ORIENTADO A OBJETOS         *  LA SINTAXIS DE LOS ORM A VECES PUEDE       *
        *                                             *  COMPLICARSE  SI REALIZAMOS CONSULTAS MUY   *
        *                                             *  COMPLEJAS MEDIANTE LAS QUE CRUCEMOS        *
        *                                             *  VARIAS TABLAS Y CON DIVERSAS CONDICIONES   *
        *---------------------------------------------*---------------------------------------------*
        *  MANEJABILIDAD                              *                                             *
        *---------------------------------------------*---------------------------------------------*
        *  FACILIDAD PARA INTRODUCIR NUEVAS FUNCIONES *                                             *
        *  POR EJEMPLO EL CACHEO DE INFORMACI�N       *                                             *
        *********************************************************************************************
                               
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