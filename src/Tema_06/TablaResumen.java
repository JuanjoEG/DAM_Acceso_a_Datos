package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class TablaResumen {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
*******************************************************************************************************************************
*  TEMA 06                                       MANEJO DE CONECTORES III: SENTENCIAS                                         *
*******************************************************************************************************************************
*  CREACI�N DE BASE DE DATOS                            TABLA RESUMEN                                                         *
*******************************************************************************************************************************
*                                                                                                                             *
*  ALTER DATABASE;  -->  CAMBIA CARACTERISTICAS DE LA BASE DE DATOS.    (db.opt)                                              *
*                                                                                                                             *
*  CREATE DATABASE; -->  CREAMOS UNA BASE DE DATOS. (create_specification) -->  SE ESTABLECEN LAS CARACTER�STICAS.  (*.opt)   *
*                                                   (character set)        -->  SE ESPECIFICAN LOS CARACTERES POR DEFECTO.    *        
*                                                                                                                             *
*  DROP DATABASE;   -->  REALIZA UN BORRADO PERMANENTE DE TODAS LAS TABLAS DE LA BASE DE DATOS.                               *
*                                                                                                                             *
*******************************************************************************************************************************
*  CREACI�N Y ELIMINACI�N DE TABLAS                                                                                           *
*******************************************************************************************************************************
*                                                                                                                             *
*  ALTER TABLE;     -->  ALTER TABLE [ IF EXISTS ] tableName ADD [ COLUMN ]                                                   *
*                        { [IF NOT EXISTS] columnDefinition [ {BEFORE | AFTER} columnName ]                                   *
*                       | ( { columnDefinition } [,...] ) }                                                                   *
*                                                                                                                             *
*                  MODIFICA LA ESTRUCTURA DE UNA TABLA.                                                                       *                                       
*                                                                                                                             *
*  CREATE TABLE;    -->  CREATE [CACHED | MEMORY] [TEMP | [GLOBAL | LOCAL] TEMPORARY]                                         *
*                        TABLE [IF NOT EXISTS] nombre_tabla                                                                   *
*                        [ ( { columnDefinition | constraint } [,...] ) ]                                                     *
*                        [ ENGINE tableEngineName [ WITH tableEngineParamName [,...] ] ]                                      *
*                        [ NOT PERSISTENT ] [ TRANSACTIONAL ]                                                                 *
*                        [ AS select ]                                                                                        *
*                                                                                                                             *
*                  CREACI�N DE UNA TABLA. (TEMPORALY)     --> EXISTIR� MIENTRAS EXISTA LA CONEXI�N.                           *
*                                         (IF NOT EXISTS) --> PARA ASEGURARNOS QUE NO EXISTE.                                 *
*                                                                                                                             *
*  DROP DATABASE;   -->  REALIZA UN BORRADO PERMANENTE DE TODAS LAS TABLAS DE LA BASE DE DATOS.                               *
*                                                                                                                             *
*  DROP INDEX;      -->  + NOMBRE DEL INDICE + TABLA --> SE EJECUTA UN ALTER TABLE PARA BORRAR EL �NDICE INDICADO.            *
*                                                                                                                             *
*  DROP TABLE;      -->  DROP TABLE [ IF EXISTS ] tableName [,...] [ RESTRICT | CASCADE ]                                     *
*                                                                                                                             *
*                  BORRA TABLAS. (IF EXISTS) --> PARA ASEGURARNOS QUE EXISTE. --> commit AUTOM�TICO.                          *
*                                                                                                                             *
*  RENAME TABLE;    -->  RENOMBRAR TABLAS.                                                                                    *
*                                                                                                                             *
*  CREATE INDEX;    -->  CREACI�N DE INDICES. (COLUMNAS NUMERADAS)                                                            *
*                                                                                                                             *
*******************************************************************************************************************************
*  INSERCI�N                                                                                                                  *
*******************************************************************************************************************************
*                                                                                                                             *
*  DELETE           -->  DELETE [LOW_PRIORITY] [QUICK] [IGNORE] FROM tbl_name                                                 *
*                        [WHERE where_definition]                                                                             *
*                        [ORDER BY ...]                                                                                       *
*                        [LIMIT row count]                                                                                    *
*                                                                                                                             *
*                  ELIMINAMOS LAS FILAS DE tbl_name QUE VALIDAN LA CONDICI�N EN EL where_definition                           *
*                  SIN EL WHERE SE ELIMINAN TODAS LAS LAS FILAS DE LA TABLA tbl_name                                          *
*                  NOS DEVOLVER� EL N�MERO DE REGISTROS ELIMINADOS.                                                           *
*                                                                                                                             *
*                                                                                                                             *
*  DO               -->  DO expr [, expr] ...                                                                                 *
*                                                                                                                             *
*                  EJECUTAMOS EXPRESIONES SIN OBTENER NING�N RESULTADO.                                                       *
*                                                                                                                             *
*                                                                                                                             *
*  HANDLER          -->  ACCEDEMOS A LAS INTERFACES DEL MOTOR DE LA TABLA. ( - OPEN - READ - CLOSE - )                        *
*                                                                                                                             *
*                                                                                                                             *
*  INSERT           -->  INSERT [LOW_PRIORITY | DELAYED | HIGH_PRIORITY] [IGNORE]                                             *
*                        [INTO] tbl_name [(col_name, ...)]                                                                    *
*                        VALUES ({expr | DEFAULT}, ...),(...), ...                                                            *
*                        [ ON DUPLICATE KEY UPDATE col_name=expr, ... ]                                                       *
*                                                                                                                             *
*                  AGREGA NUEVOS REGISTROS EN UNA TABLA                                                                       *
*                  INSERT-SELECT / INSERT-VALUES       --> INSERTA VALORES BASADOS EN LAS COLUMNAS.                           *
*                  INSERT-SELECT                       --> TAMBI�N PARA COGER REGISTROS DE OTRAS TABLAS.                      *
*                  PODEMOS INSERTAR NUEVOS DATOS A LAS COLUMNAS TAMBI�N SIN PONER LOS NOMBRES DE LAS COLUMNAS, USA EL ORDEN.  *
*                                                                                                                             *
*  LOAD DATA INFILE -->  LEER REGISTROS.                                                                                      *
*                                                                                                                             *
*******************************************************************************************************************************
*  EDICI�N                                                                                                                    *
*******************************************************************************************************************************
*                                                                                                                             *
*  REPLACE          -->  REPLACE [LOW_PRIORITY | DELAYED]                                                                     *
*                        [INTO] tbl_name [(col_name, ...)]                                                                    *
*                                                                                                                             *
*                   REEMPLAZA REGISTROS EN UNA TABLA                                                                          *
*                                                                                                                             *
*  TRUNCATE         -->  TRUNCATE TABLE tbl_name                                                                              *
*                                                                                                                             *
*                  ELIMINA UNA TABLA --> SEMEJANTE A DELETE                                                                   *
*                                                                                                                             *
*  UPDATE           -->  UPDATE [LOW_PRIORITY] [IGNORE] tbl_name [AS <mombre_del_alias>]                                      *
*                        SET col_name1=exp1 [, col_name2=exp2 ...]                                                            *
*                        [WHERE where_definition]                                                                             *
*                        [ORDER BY ...]                                                                                       *
*                        [LIMIT row_count]                                                                                    *
*                                                                                                                             *
*                  ACTUALIZA LOS DATOS DE LAS COLUMNAS QUE LE INDIQUEMOS EN EL SET.                                           *
*                  CON EL WHERE RESTRINGIMOS LOS REGISTROS QUE DEBEN ACTUALIZARSE.                                            *
*                                                                                                                             *
*  SELECT           -->  SELECT [ALL | DISTINCT] <columnas> [AS <mombre_del_alias>]                                           *
*                        FROM <tablas>                                                                                        *
*                        [WHERE <condici�n> [AND | OR <condici�n>] ]                                                          *
*                        [GROUP BY <nombe_columna>]                                                                           *
*                        [HAVING <criterios_de_agrupaci�n>]                                                                   *
*                        [HORDER BY <nombre_columna> | <�ndice_columna> [ASC | DESC] ];                                       *
*                                                                                                                             *                       
*                        REALIZA CONSULTAS                                                                                    *
*                                                                                                                             *
*******************************************************************************************************************************
*  CLAUSULA WHERE                                                                                                             *
*******************************************************************************************************************************
*                                                                                                                             *
*  OPERADORES       -->        <    <=    =    !=    <>    >=    >   AND    OR    NOT    (     )                              *
*                                                                                                                             *
*  NULOS            -->        IS NULL     IS NOT NULL                                                                        *
*                                                                                                                             *
*  LIKE             -->  REALIZA COMPARACIONES DE REGISTROS.   _ UN CARACTER                    % UNA CADENA                  *
*                                                             WHERE apellido LIKE 'A_'   WHERE apellido LIKE 'C%'             *
*                                                                                                                             *
*  BETWEEN          -->  RANGO DE VALORES.                                                    WHERE edad BETWEEN 3 AND 7      *
*                                                                                                                             *
*  IN(valores)      -->  QUEREMOS MOSTRAR LOS RESULTADOS QUE COINCIDA CON VALORES MARCADOS.   WHERE edad IN (3,4,7,8)         *
*                                                                                                                             *
*  ORDER BY         -->  ESTABLECE UN ORDEN PARA MOSTRAR LOS RESULTADOS.     [ASC | DESC]                                     *
*                                                                                                                             *
*******************************************************************************************************************************
*  TRANSACCIONES                                                                                                              *
*******************************************************************************************************************************
*                                                                                                                             *
*  COMMIT           -->  SE PERSISTIR�N LOS CAMBIOS EN LA BASE DE DATOS.                                                      *
*                                                                                                                             *
*  ROLLBACK         -->  DESHACEMOS LOS CAMBIOS Y SE ABANDONAR� LA TRANSACCI�N.                                               *
*                                                                                                                             *
*  SAVEPOINT        -->  CREA PUNTO DE CONTROL SALVANDO DATOS.                                                                *
*                                                                                                                             *
*******************************************************************************************************************************
*  LA INTERFAZ STATEMENT                                                                                                      *
*******************************************************************************************************************************
*                                                                                                                             *
*  executeQuery(String)   -->  M�TODO PARA REALIZAR SENTENCIAS SELECT.                                                        *
*                              NOS DEVUELVE UN OBJETO ResultSet.                                                              *
*                                                                                                                             *
*  executeUpdate(String)  -->  M�TODO PARA REALIZAR SENTENCIAS INSERT, DELETE, UPDATE,... (MANIPULAC�N DE DATOS)              *
*                              NOS DEVUELVE UN int CON EL N�MERO DE FILAS AFECTADOS.                                          *
*                                                                                                                             *
*  execute(String)        -->  M�TODO PARA REALIZAR CUALQUIER SENTENCIA SQL.                                                  *
*                              DEVOLVER� true  SI LA SENTENCIA DEVUELVE UN ResultSet, PARA ACCEDER --> getResultSet()         *
*                              DEVOLVER� false SI LA SENTENCIA DEVUELVE UN int,       PARA ACCEDER --> getUpdateCount()       *
*                                                                                                                             *
*******************************************************************************************************************************
*  0. SALIR.                                                                                                                  *
*******************************************************************************************************************************

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