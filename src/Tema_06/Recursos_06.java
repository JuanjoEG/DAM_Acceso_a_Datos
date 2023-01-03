package Tema_06;

import static Principal_Main.Main.*;
import static Tema_06.T_06.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_06 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_06 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************

            - CREATE DATABASE:
                    - CREACIÓN DE UNA NUEVA BASE DE DATOS.
                    - ES NECESARIO DISPONER DEL PERMISO CREATE.
                    - CON 'create:specification' SE ESTABLECERÁN LAS DISTINTAS CARACTERÍSTICAS DE LA BASE DE DATOS.
                    - CON LA CLÁUSULA 'character set', SE ESPECIFICARÁ EL SET DE CARACTERES
                      POR DEFECTO DE DICHA BASE DE DATOS QUE SE ESTÁ CREANDO.

            - DROP DATABASE:
                    - USAREMOS ESTE COMANDO PARA REALIZAR UN BORRADO PERMANENTE DE TODAS LAS TABLAS
                      DE NUESTRA BASE DE DATOS Y BORRAR, ASÍ, DICHA BASE DE DATOS.
                    - ES UN COMANDO MUY PELIGROSO: TENDREMOS QUE TENER ESPECÍFICAMENTE HABILITADO EL PERMISO DE DROP.
                    - SI LA BASE DE DATOS QUE ESTAMOS BORRANDO ESTÁ ENLAZADA SIMBÓLICAMENTE, SE BORRARÁN AMBOS OBJETOS.

            - ALTER DATABASE:
                    - ESTE COMANDO FACILITA CAMBIAR CARACTERÍSTICAS GENERALES DE UNA BASE DE DATOS.
                    - PARA USAR ESTE COMANDO SE NECESITA EL PERMISO ALTER.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        ************************************************************************************************************************

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

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        ************************************************************************************************************************

            - INSERT:
                    - AGREGA NUEVOS REGISTROS EN UNA TABLA PREVIAMENTE DEFINIDA.
                    - INSERT-SET O INSERT-VALUES INSERTAN VALORES BASADOS EN COLUMNAS DE LA TABLA.
                    - TAMBIÉN PODREMOS ENCONTRAR INSERT-SELECT COGIENDO REGISTROS DE OTRA/S TABLA/S.  

              INSERT           -->  INSERT [LOW_PRIORITY | DELAYED | HIGH_PRIORITY] [IGNORE] 
                                    [INTO] tbl_name [(col_name, ...)] 
                                    VALUES ({expr | DEFAULT}, ...),(...), ... 
                                    [ ON DUPLICATE KEY UPDATE col_name=expr, ... ]                                 

            - DELETE:
                    - ELIMINA LAS FILAS DE 'tbl_name' QUE VALIDAN LA CONDICIÓN EXPRESADA EN 'where_definition'.
                    - DEVUELVE EL NÚMERO DE REGISTROS ELIMINADOS.
                    - NOTA: SI NO ESTABLECEMOS CLÁUSULA 'where', SE ELIMINARÁN TODAS LAS FILAS DE LA TABLA.

              DELETE           -->  DELETE [LOW_PRIORITY] [QUICK] [IGNORE] FROM tbl_name 
                                    [WHERE where_definition] 
                                    [ORDER BY ...]    
                                    [LIMIT row count]   

            - DO:
                    - NO ES ESTÁDAR DE SQL.
                    - EJECUTAMOS EXPRESIONES SIN OBTENER NINGÚN RESULTADO.

            - HANDLER:
                    - NO ES ESTÁDAR DE SQL.
                    - ACCEDEMOS A LAS INTERFACES DEL MOTOR DE LA TABLA. ( - OPEN - READ - CLOSE - )

            - LOAD DATA INFILE:
                    - NO ES ESTÁDAR DE SQL.
                    - LEER REGISTROS.                   

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        ************************************************************************************************************************

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

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        ************************************************************************************************************************

            - UNA CONSULTA, BÁSICAMENTE, NO ES MÁS QUE REALIZAR UNA PREGUNTA A BASE DE DATOS CON UNA SERIE DE CRITERIOS,
              Y ÉSTA DEVOLVERÁ UNA RESPUESTA A DICHA PREGUNTA. LA FORMA PRINCIPAL DE REALIZAR ESTAS 'PREGUNTAS'
              ES A PARTIR DE UN SELECT.
                    - PODREMOS CONSULTAR UNA TABLA O MÁS DE UNA.
                    - EXISTEN DISTINTAS CLÁUSILAS VINCULADAS A SELECT: HAVING, ORDER BY, UNION, ETC...

            - CUANDO REALIZAMOS UNA CONSULTA CON SELECT, LO QUE OBTENEMOS ES UNA ESPECIE DE 'TABLA FICTICIA' EN MEMORIA.
                    - SON UNA SERIE DE RESULTADOS QUE SE RELACIONAN ACORDE A NUESTROS REQUISITOS EN LA CONSULTA.
                    - ESTA TABLA DE LA QUE HABLAMOS, NO PERSISTE EN DISCO: SE MANTIENE EN MEMORIA MIENTRAS LA ESTEMOS USANDO.

            - ALGUNOS PUNTOS PRINCIPALES DE LA SINTAXIS DE LA SENTENCIA SELECT:
                    - SELECT: JUNTO A LA PALABRA CLAVE 'SELECT' PODREMOS:
                            - AÑADIR [ALL/DISTINCT]: INDICAREMOS SI QUEREMOS MOSTRAR FILAS DUPLICADAS,
                              O SI EN EL CONJUNTO DE RESULTADOS, INCLUIREMOS FILAS ÚNICAS, RESPECTIVAMENTE.
                            - AÑADIR ASTERISCO [*] SEGUIDO DE UN LISTADO DE COLUMNAS [COLUMNAS].
                            - REALIZAR UN ALIAS CON LA PALABRA CLAVE AS[NOMBRE DEL ALIAS].
                    - FROM: USAREMOS LA PALABRA CLAVE 'FROM' Y A CONTINUACIÓN EL NOMBRE DE LA TABLA/S O VISTA/S.

            - CON LA CLÁUSULA WHERE ESPECIFICAREMOS CONDICIONES DE FILTRO:
              USAREMOS DICHA CLÁUSULA CUANDO NO QUERAMOS OBTENER EL CONTENIDO TOTAL
              DE LA TABLA O TABLAS QUE ESTEMOS CONSULTANDO. 

                 SELECT           -->  SELECT [ALL | DISTINCT] <columnas> [AS <mombre_del_alias>] 
                                       FROM <tablas>                                                 
                                       [WHERE <condición> [AND | OR <condición>] ]                
                                       [GROUP BY <nombe_columna>]                              
                                       [HAVING <criterios_de_agrupación>]                                      
                                       [HORDER BY <nombre_columna> | <índice_columna> [ASC | DESC] ];

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        ************************************************************************************************************************

            OPERADORES       -->        <    <=    =    !=    <>    >=    >   AND    OR    NOT    (     )                             

            NULOS            -->        IS NULL     IS NOT NULL

                                 UN VALOR ES NULO CUANDO NO EXISTE VALOR, UN REGISTRO EN BLANCO NO SERÍA NULO.

            LIKE             -->  REALIZA COMPARACIONES DE REGISTROS.   _ UN CARACTER                    % UNA CADENA                 
                                                                       WHERE apellido LIKE 'A_'   WHERE apellido LIKE 'C%'

                                 CON EL % INDICAMOS QUE PUEDE IR CUALQUIER CADENA DE CARACTERES EN ESA POSICIÓN.
                                 CON EL _ SERÍA EL MISMO CONCEPTO, PERO EN ESTE CASO, SOLO CON UN CARÁCTER.

            BETWEEN          -->  RANGO DE VALORES.                                                    WHERE edad BETWEEN 3 AND 7     

            IN(valores)      -->  QUEREMOS MOSTRAR LOS RESULTADOS QUE COINCIDA CON VALORES MARCADOS.   WHERE edad IN (3,4,7,8)        

            ORDER BY         -->  ESTABLECE UN ORDEN PARA MOSTRAR LOS RESULTADOS.     [ASC | DESC]                                    


            SELECT           -->  SELECT [ALL | DISTINCT] <columnas> [AS <mombre_del_alias>] 
                                  FROM <tablas>                                                 
                                  [WHERE <condición> [AND | OR <condición>] ]                
                                  [GROUP BY <nombe_columna>]                              
                                  [HAVING <criterios_de_agrupación>]                                      
                                  [HORDER BY <nombre_columna> | <índice_columna> [ASC | DESC] ];

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        ************************************************************************************************************************

            - UNA TRANSACCIÓN EN SQL SON UNIDADES O CONJUNTOS DE ACCIONES
              QUE SE REALIZAN EN SERIE Y DE FORMA ORDENADA EN EL SISTEMA GESTOR DE BASE DE DATOS.

            - LOS OBJETOS DE LAS TRANSACCIONES SON DOS:
                    - PROPORCIONAR CONSISTENCIA EN LA BASE DE DATOS REALIZANDO SECUENCIAS DE ALTA FIABILIDAD,
                      DE TAL FORMA QUE SE PUEDA VOLVER A ESTADOS ANTERIORES FÁCILMENTE.
                    - OFRECER AISLAMIENTO CUANDO MÁS DE UN APLICATIVO ESTÁ ACCEDIENDO A LOS DATOS SIMULTANEAMENTE.

            - COMANDOS DE CONTROL PRINCIPALES QUE SE REALIZAN PARA LA EJECUCIÓN DE TRANSACCIONES EN SQL:
                    - COMMIT:    CON ESTE COMANDO SE PERSISTIRÁN LOS CAMBIOS EN LA BASE DE DATOS.
                    - ROLLBACK:  DESHAREMOS LOS CAMBIOS QUE SE HUBIERAN EJECUTADO HASTA EL MOMENTO Y SE ABANDONARÁ LA TRANSACCIÓN.
                    - SAVEPOINT: PUNTOS DONDE SE PODRÁ ALMACENAR Y, EN CASO DE ROLLBACK, SE PODRÁ VOLVER A DICHO PUNTO DE CONTROL.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        ************************************************************************************************************************

            - LA INTERFAZ Statement LA USAMOS CUANDO SE TRATA DE REALIZAR UNA CONEXIÓN CON UN DRIVER DE UN BASE DE DATOS.
              ES LA ENCARGADA DE EJECUTAR LAS SENTENCIAS SQL EN NUESTRO APLICATIVO
              Y RECOGER LOS RESULTADOS PARA MANIPULARLOS MÁS TARDE.

            - UNA VEZ QUE SE CREA EL OBJETO Statement, DISPONEMOS DE UN LUGAR PARA REALIZAR CONSULTAS SQL;
              PODREMOS UTILIZAR DIFERENTES MÉTODOS:

                    - executeQuery(String):
                            - UTILIZAREMOS ESTE MÉTODO PARA REALIZAR SENTENCIAS SELECT.
                            - NOS DEVOLVERÁ UN OBJETO ResultSet CON TODA LA INFORMACIÓN RESULTANTE.

                    - executeUpdate(String):
                            - UTILIZAREMOS ESTE MÉTODO PARA REALIZAR SENTENCIAS MANIPULACIÓN DE DATOS.
                                    - INSERT, DELETE, UPDATE, ETC...
                            - NOS DEVOLVERÁ UN ENTERO QUE CONTIENE LA CANTIDAD DE FILAS QUE HAN SIDO AFECTADAS EN LA OPERACIÓN.

                    - execute(String):
                            - UTILIZAREMOS ESTE MÉTODO PARA EJECUTAR CUALQUIERA DE LAS ACCIONES PROPUESTAS EN LOS DOS CASOS ANTERIORES.
                            - NOS DEVOLVERÁ:
                                    - True:    SI LA SENTENCIA DEVUELVE UN ResultSet,
                                               Y PARA ACCEDER A ÉL, TENDREMOS QUE EJECUTAR EL MÉTODO getResultSet().
                                    - False:   SI LA SENTENCIA DEVUELVE UN int,
                                               Y PARA ACCEDER A ÉL, TENDREMOS QUE EJECUTAR EL MÉTODO getUpdateCount().

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        *******************************************************************************************************************************
        *                                                                                                                             *
        *  ALTER DATABASE;  -->  CAMBIA CARACTERISTICAS DE LA BASE DE DATOS.    (db.opt)                                              *
        *                                                                                                                             *
        *  CREATE DATABASE; -->  CREAMOS UNA BASE DE DATOS. (create_specification) -->  SE ESTABLECEN LAS CARACTERÍSTICAS.  (*.opt)   *
        *                                                   (character set)        -->  SE ESPECIFICAN LOS CARACTERES POR DEFECTO.    *        
        *                                                                                                                             *
        *  DROP DATABASE;   -->  REALIZA UN BORRADO PERMANENTE DE TODAS LAS TABLAS DE LA BASE DE DATOS.                               *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
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
        *                  CREACIÓN DE UNA TABLA. (TEMPORALY)     --> EXISTIRÁ MIENTRAS EXISTA LA CONEXIÓN.                           *
        *                                         (IF NOT EXISTS) --> PARA ASEGURARNOS QUE NO EXISTE.                                 *
        *                                                                                                                             *
        *  DROP DATABASE;   -->  REALIZA UN BORRADO PERMANENTE DE TODAS LAS TABLAS DE LA BASE DE DATOS.                               *
        *                                                                                                                             *
        *  DROP INDEX;      -->  + NOMBRE DEL INDICE + TABLA --> SE EJECUTA UN ALTER TABLE PARA BORRAR EL ÍNDICE INDICADO.            *
        *                                                                                                                             *
        *  DROP TABLE;      -->  DROP TABLE [ IF EXISTS ] tableName [,...] [ RESTRICT | CASCADE ]                                     *
        *                                                                                                                             *
        *                  BORRA TABLAS. (IF EXISTS) --> PARA ASEGURARNOS QUE EXISTE. --> commit AUTOMÁTICO.                          *
        *                                                                                                                             *
        *  RENAME TABLE;    -->  RENOMBRAR TABLAS.                                                                                    *
        *                                                                                                                             *
        *  CREATE INDEX;    -->  CREACIÓN DE INDICES. (COLUMNAS NUMERADAS)                                                            *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        *******************************************************************************************************************************
        *                                                                                                                             *
        *  DELETE           -->  DELETE [LOW_PRIORITY] [QUICK] [IGNORE] FROM tbl_name                                                 *
        *                        [WHERE where_definition]                                                                             *
        *                        [ORDER BY ...]                                                                                       *
        *                        [LIMIT row count]                                                                                    *
        *                                                                                                                             *
        *                  ELIMINAMOS LAS FILAS DE tbl_name QUE VALIDAN LA CONDICIÓN EN EL where_definition                           *
        *                  SIN EL WHERE SE ELIMINAN TODAS LAS LAS FILAS DE LA TABLA tbl_name                                          *
        *                  NOS DEVOLVERÁ EL NÚMERO DE REGISTROS ELIMINADOS.                                                           *
        *                                                                                                                             *
        *                                                                                                                             *
        *  DO               -->  DO expr [, expr] ...                                                                                 *
        *                                                                                                                             *
        *                  EJECUTAMOS EXPRESIONES SIN OBTENER NINGÚN RESULTADO.                                                       *
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
        *                  INSERT-SELECT                       --> TAMBIÉN PARA COGER REGISTROS DE OTRAS TABLAS.                      *
        *                  PODEMOS INSERTAR NUEVOS DATOS A LAS COLUMNAS TAMBIÉN SIN PONER LOS NOMBRES DE LAS COLUMNAS, USA EL ORDEN.  *
        *                                                                                                                             *
        *  LOAD DATA INFILE -->  LEER REGISTROS.                                                                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
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
        *                        [WHERE <condición> [AND | OR <condición>] ]                                                          *
        *                        [GROUP BY <nombe_columna>]                                                                           *
        *                        [HAVING <criterios_de_agrupación>]                                                                   *
        *                        [HORDER BY <nombre_columna> | <índice_columna> [ASC | DESC] ];                                       *
        *                                                                                                                             *                       
        *                        REALIZA CONSULTAS                                                                                    *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
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
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_14 + """
        *******************************************************************************************************************************
        *                                                                                                                             *
        *  COMMIT           -->  SE PERSISTIRÁN LOS CAMBIOS EN LA BASE DE DATOS.                                                      *
        *                                                                                                                             *
        *  ROLLBACK         -->  DESHACEMOS LOS CAMBIOS Y SE ABANDONARÁ LA TRANSACCIÓN.                                               *
        *                                                                                                                             *
        *  SAVEPOINT        -->  CREA PUNTO DE CONTROL SALVANDO DATOS.                                                                *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_15 + """
        *******************************************************************************************************************************
        *                                                                                                                             *
        *  executeQuery(String)   -->  MÉTODO PARA REALIZAR SENTENCIAS SELECT.                                                        *
        *                              NOS DEVUELVE UN OBJETO ResultSet.                                                              *
        *                                                                                                                             *
        *  executeUpdate(String)  -->  MÉTODO PARA REALIZAR SENTENCIAS INSERT, DELETE, UPDATE,... (MANIPULACÓN DE DATOS)              *
        *                              NOS DEVUELVE UN int CON EL NÚMERO DE FILAS AFECTADOS.                                          *
        *                                                                                                                             *
        *  execute(String)        -->  MÉTODO PARA REALIZAR CUALQUIER SENTENCIA SQL.                                                  *
        *                              DEVOLVERÁ true  SI LA SENTENCIA DEVUELVE UN ResultSet, PARA ACCEDER --> getResultSet()         *
        *                              DEVOLVERÁ false SI LA SENTENCIA DEVUELVE UN int,       PARA ACCEDER --> getUpdateCount()       *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05);                
                case "6" -> System.out.println(recurso_06);
                case "7" -> System.out.println(recurso_07);
                case "8" -> System.out.println(recurso_08);
                case "9" -> System.out.println(recurso_09);
                case "10" -> System.out.println(recurso_10);
                case "11" -> System.out.println(recurso_11);
                case "12" -> System.out.println(recurso_12);
                case "13" -> System.out.println(recurso_13);
                case "14" -> System.out.println(recurso_14);
                case "15" -> System.out.println(recurso_15);
                case "16" -> {
                    System.out.println(recurso_01);
                    continuar();
                    System.out.println(recurso_02);
                    continuar();
                    System.out.println(recurso_03);
                    continuar();
                    System.out.println(recurso_04);
                    continuar();
                    System.out.println(recurso_05);
                    continuar();
                    System.out.println(recurso_06);
                    continuar();
                    System.out.println(recurso_07);
                    continuar();
                    System.out.println(recurso_08);
                    continuar();
                    System.out.println(recurso_09);
                    continuar();
                    System.out.println(recurso_10);
                    continuar();
                    System.out.println(recurso_11);
                    continuar();
                    System.out.println(recurso_12);
                    continuar();
                    System.out.println(recurso_13);
                    continuar();
                    System.out.println(recurso_14);
                    continuar();
                    System.out.println(recurso_15);
                }
            }
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
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