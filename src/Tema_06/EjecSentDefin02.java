package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
*                   EJECUCIÓN DE SENTENCIAS DE DEFINICIÓN DE DATOS II. CREACIÓN Y ELIMINACIÓN DE TABLAS
********************************************************************************************************************

    - CREATE TABLE:
            - CON ESTE COMANDO EJECUTAREMOS LA CREACIÓN DE UNA TABLA CON EL NOMBRE DEFINIDO.
            - NECESITAREMOS EL PERMISO CREATE PARA TABLA.
            - OCURRIRÁ UN ERROR SI LA TABLA QUE ESTAMOS CREANDO EXISTE PREVIAMENTE
              EN LA BASE DE DATOS QUE ESTAMOS TRABAJANDO.
            - SE PUEDE USAR 'TEMPORARY' Y SERÁ SOLO VISIBLE MIENTRAS TENGAMOS ACTIVA
              LA CONEXIÓN CON LA QUE ESTAMOS TRABAJANDO, DESPUÉS, DICHA TABLA NO EXISTIRÁ.
            - TAMBIÉN PODREMOS USAR LAS CLAVES 'IF NOT EXISTS' PARA ASEGURARNOS DE QUE CIERTA TABLA NO EXISTA.                               
                               
    - DROP TABLE:
            - CON ESTE COMANDO PODREMOS BORRAR UNA O MÁS TABLAS EN NUESTRA BASE DE DATOS.
            - EL PERMISO DROP DEBE DE ESTAR HABILITADO PARA NUESTRO USUARIO DE LA BASE DE DATOS.
            - DEBE DE SER EJECUTADO CON MUCHA PRECAUCIÓN,
              YA QUE TODA LA INFORMACIÓN DE LA TABLA QUE ESTAMOS INDICANDO SERÁ ELIMINADA.
            - PODREMOS USAR LA CLAVE 'IF EXISTS' PARA EVITAR EL ERROR DE CUANDO LA TABLA NO EXISTA.
            - ESTE COMANDO DROP TABLE REALIZARÁ COMMIT AUTOMÁTICO AL SER EJECUTADO.
                               
    - RENAME TABLE:
            - CON ESTE COMANDO PODREMOS RENOMBRAR UNA O MÁS TABLAS.
            - UNA VEZ SE ESTÁ EJECUTANDO EL RENOMBRADO,
              LA TABLA QUEDARÁ TEMPORALMENTE BLOQUEADA HASTA FINALIZAR LA TRANSACCIÓN.
                               
    - ALTER TABLE:
            - CON ESTE COMANDO PODREMOS MODIFICAR LA ESTRUCTURA DE UNA TABLA QUE PREVIAMENTE HEMOS CREADO.
            - ACCIONES COMO AGREGAR COLUMNAS, BORRARLAS, CREAR ÍNDICES, BORRARLOS,
              CAMBIAR LA TIPOLOGÍA DE CIERTAS COLUMNAS, TAMBIÉN MODIFICAR LA DESCRIPCIÓN DE LA TABLA
              Y LA TIPOLOGÍA DE LA MISMA.
                               
    - CREATE INDEX:
            - LOS ÍNDICES SE FORMAN AL UNIR LOS VALORES DE LAS COLUMNAS.
            - NORMALMENTE, CON LA CREACIÓN DE LA TABLA, SE AGREGAN TODOS LOS ÍNDICES,
              PERO CON ESTE COMANDO PODEMOS AGREGARLOS MANUALMENTE DESPUÉS
              DE HABER CREADO UNA TABLA.
            - PARA EL TIPO DE COLUMNAS NUMERADAS (columna01, columna02, clumna03, etc...), 
              SE CREA UN ÍNDICE DE COLUMNAS MÚLTIPLES.
            - EN MUCHAS DE LAS BASES DE DATOS, ESTE COMANDO SE TRADUCE A UN COMANDO ALTER TABLE
              PARA LA CREACIÓN DE ÍNDICES.
                               
    - DROP INDEX:
            - USANDO ESTE COMANDO Y AÑADIENDO EL NOMBRE DEL ÍNDICE Y LA TABLA ESPECIFICADA,
              SE EJECUTARÁ UN ALTER TABLE JUSTO PARA BORRAR EL ÍNDICE QUE ESTAMOS INDICANDO.
                               
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