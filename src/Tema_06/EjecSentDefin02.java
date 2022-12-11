package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class EjecSentDefin02 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                   EJECUCI�N DE SENTENCIAS DE DEFINICI�N DE DATOS II. CREACI�N Y ELIMINACI�N DE TABLAS
********************************************************************************************************************

    - CREATE TABLE:
            - CON ESTE COMANDO EJECUTAREMOS LA CREACI�N DE UNA TABLA CON EL NOMBRE DEFINIDO.
            - NECESITAREMOS EL PERMISO CREATE PARA TABLA.
            - OCURRIR� UN ERROR SI LA TABLA QUE ESTAMOS CREANDO EXISTE PREVIAMENTE
              EN LA BASE DE DATOS QUE ESTAMOS TRABAJANDO.
            - SE PUEDE USAR 'TEMPORARY' Y SER� SOLO VISIBLE MIENTRAS TENGAMOS ACTIVA
              LA CONEXI�N CON LA QUE ESTAMOS TRABAJANDO, DESPU�S, DICHA TABLA NO EXISTIR�.
            - TAMBI�N PODREMOS USAR LAS CLAVES 'IF NOT EXISTS' PARA ASEGURARNOS DE QUE CIERTA TABLA NO EXISTA.                               
                               
    - DROP TABLE:
            - CON ESTE COMANDO PODREMOS BORRAR UNA O M�S TABLAS EN NUESTRA BASE DE DATOS.
            - EL PERMISO DROP DEBE DE ESTAR HABILITADO PARA NUESTRO USUARIO DE LA BASE DE DATOS.
            - DEBE DE SER EJECUTADO CON MUCHA PRECAUCI�N,
              YA QUE TODA LA INFORMACI�N DE LA TABLA QUE ESTAMOS INDICANDO SER� ELIMINADA.
            - PODREMOS USAR LA CLAVE 'IF EXISTS' PARA EVITAR EL ERROR DE CUANDO LA TABLA NO EXISTA.
            - ESTE COMANDO DROP TABLE REALIZAR� COMMIT AUTOM�TICO AL SER EJECUTADO.
                               
    - RENAME TABLE:
            - CON ESTE COMANDO PODREMOS RENOMBRAR UNA O M�S TABLAS.
            - UNA VEZ SE EST� EJECUTANDO EL RENOMBRADO,
              LA TABLA QUEDAR� TEMPORALMENTE BLOQUEADA HASTA FINALIZAR LA TRANSACCI�N.
                               
    - ALTER TABLE:
            - CON ESTE COMANDO PODREMOS MODIFICAR LA ESTRUCTURA DE UNA TABLA QUE PREVIAMENTE HEMOS CREADO.
            - ACCIONES COMO AGREGAR COLUMNAS, BORRARLAS, CREAR �NDICES, BORRARLOS,
              CAMBIAR LA TIPOLOG�A DE CIERTAS COLUMNAS, TAMBI�N MODIFICAR LA DESCRIPCI�N DE LA TABLA
              Y LA TIPOLOG�A DE LA MISMA.
                               
    - CREATE INDEX:
            - LOS �NDICES SE FORMAN AL UNIR LOS VALORES DE LAS COLUMNAS.
            - NORMALMENTE, CON LA CREACI�N DE LA TABLA, SE AGREGAN TODOS LOS �NDICES,
              PERO CON ESTE COMANDO PODEMOS AGREGARLOS MANUALMENTE DESPU�S
              DE HABER CREADO UNA TABLA.
            - PARA EL TIPO DE COLUMNAS NUMERADAS (columna01, columna02, clumna03, etc...), 
              SE CREA UN �NDICE DE COLUMNAS M�LTIPLES.
            - EN MUCHAS DE LAS BASES DE DATOS, ESTE COMANDO SE TRADUCE A UN COMANDO ALTER TABLE
              PARA LA CREACI�N DE �NDICES.
                               
    - DROP INDEX:
            - USANDO ESTE COMANDO Y A�ADIENDO EL NOMBRE DEL �NDICE Y LA TABLA ESPECIFICADA,
              SE EJECUTAR� UN ALTER TABLE JUSTO PARA BORRAR EL �NDICE QUE ESTAMOS INDICANDO.
                               
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