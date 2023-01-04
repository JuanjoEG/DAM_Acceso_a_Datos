package Tema_04;

import static Principal_Main.Main.*;
import static Tema_04.T_04.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_04 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_04 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************

            CONECTOR O DRIVER:
                       ES UNA SERIE DE CLASES Y LIBRER�AS IMPLEMENTADAS (EN FORMA DE API) QUE UNEN LA CAPA DE NUESTRA
                       APLICACI�N CON LA CAPA DE BASE DE DATOS, PERMITIENDO AS� LA CONEXI�N Y LA REALIZACI�N DE CONSULTAS.

            EL DESFASE OBJETO-RELACIONAL VIENE EN RELACI�N A DOS PUNTOS:
                   - TENEMOS LA PARTE DE LA PROGRAMACI�N ORIENTADA A OBJETOS, ES DECIR, EL APLICATIVO,
                     EN NUESTRO CASO PROGRAMADO EN JAVA, Y POR TANTO ORIENTADO A OBJETOS, PUDIENDO SER OBJETOS COMPLEJOS.
                   - TENEMOS LA BASE DE DATOS FISICA, GENERALMENTE UNA BASE DE DATOS RELACIONAL,
                     CON INFORMACI�N ESTRUCTURADA EN TABLAS, ES DECIR, CON DATOS SIMPLES.

            ESTE DESFASE IMPLICA QUE SEA NECESARIA UNA TRADUCCI�N
            DESDE LOS OBJETOS DEL APLICATIVO JAVA A LA BASE DE DATOS RELACIONAL.
                         
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

            CONECTOR O DRIVER:
                    ES UNA SERIE DE CLASES Y LIBRER�AS IMPLEMENTADAS (EN FORMA DE API) QUE UNEN LA CAPA DE NUESTRA
                    APLICACI�N CON LA CAPA DE BASE DE DATOS, PERMITIENDO AS� LA CONEXI�N Y LA REALIZACI�N DE CONSULTAS.
                    ALGUNOS EJEMPLOS DE CONECTORES:

                            - JDBC -->  JAVA DATABASE CONNECTIVITY.  DESARROLLADO POR SUN.
                            - ODBC -->  OPEN DATABASE CONNECTIVITY.  DESARROLLADO POR MICROSOFT.
                            - ADO Y ADO.net

            - UNA APLICAC�N QUE ACCEDA A UNA BASE DE DATOS DEBE TENER ASOCIADO SIEMPRE UN CONECTOR.
                    - DE ESTA FORMA, NO TENEMOS QUE CONOCER LOS ASPECTOS T�CNICOS,
                      NI C�MO FUNCIONAN EN SU INTERIOR LAS BASES DE DATOS.
                    - EN SU LUGAR, NOS OCUPAREMOS DE C�MO REALIZAR LA COMUNICACI�N,
                      Y DE C�MO FUNCIONA NUESTRO APLICATIVO.

            - USANDO UN CONECTOR:
              NO HABR� QUE PROGRAMAR APLICACIONES DIFERENTES PARA ACCEDER A DISTINTAS BASES DE DATOS,
              NOSOTROS DESARROLLAR�AMOS NUESTRA APLICACI�N, USAR LOS CONECTORES ADECUADOS, 
              Y A LA HORA DE REALIZAR CUALQUIER CONSULTA,
              EL CONECTOR INTERPRETAR�A DE UNA FORMA O DE OTRA SEG�N LA BASE DE DATOS ASOCIADA.

            - EL APLICATIVO S�LO NECESITAR� INFORMACI�N PARA EL ACCESO A LA BASE DE DATOS.
              INDICANDO LAS CONFIGURACIONES, TENDR�AMOS ACCESO SIN PREOCUPARNOS DEL LENGUAJE INTERNO,
              NI FABRICANTE DE CADA UNA DE ELLAS.

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

            - 4 COMPONENTES:

                    - API: CONJUNTO DE LIBRER�AS Y CLASES QUE NOS FACILITAN EL ACCESO A LAS BASES DE DATOS RELACIONALES,
                           Y LA POSIBILIDAD DE REALIZAR CONSULTAS A DICHAS BASES DE DATOS.
                                - EST�N EN LOS PAQUETES   -->  java.sql   Y   javax.sql

                    - PAQUETE DE PRUEBAS: CLASES QUE VALIDAN SI UN DRIVER PASA LOS REQUISITOS PREVISTOS POR JDBC.

                    - GESTOR: REALIZA LA UNI�N ENTRE NUESTRO APLICATIVO Y EL DRIVER APROPIADO JDBC,
                              BIEN POR CONEXI�N DIRECTA, O SINO A TRAV�S DE UN pool DE CONEXIONES.

                    - PUENTE JDBC-ODBC: FACILITA USAR DRIVERS ODBC COMO SI ESTUVI�RAMOS TRABAJANDO CON JDBC.

            - 2 TIPOS DE ARQUITECTURA DE CONEXI�N CON JDBC.

                    - ARQUITECTURA EN 2 CAPAS:
                             - NUESTRA APLICACI�N SE CONECTAR� A LA BASE DE DATOS A TRAV�S DE UN DRIVER.
                             - TANTO EL DRIVER COMO LA APLICACI�N DEBEN LOCALIZARSE EN EL MISMO SISTEMA O M�QUINA.

                    - ARQUITECTURA EN 3 CAPAS:
                             - NUESTRO APLICATIVO ENV�A LAS INSTRUCCIONES A UNA CAPA INTERMADIA, 
                               (MIDDLEWARE) -->  TRADUCTOR: QUE EST� EN OTRA M�QUINA.
                             - ESTA CAPA COGER� LA INFORMACI�N Y LA ENVIAR� A LA BASE DE DATOS,
                               TRADUCIENDO LOS COMANDOS QUE EL APLICATIVO HAYA ENVIADO. 

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

            - DRIVER TIPO 1 JDBC-ODBC             CON PUENTE ODBC

                    - USA API NATIVA, QUE TRADUCE LAS LLAMADAS REALIZADAS DE JDBC A ODBC.
                    - LOS DATOS DEVUELTOS POR LA BBDD SE TRADUCEN DE ODBC A JDBC.

            - DRIVER TIPO 2 JDBC NATIVO           CON API NATIVO

                    - ESCRITOS UNA PARTE EN JAVA, Y OTRA PARTE EN C�DIGO NATIVO.
                    - LAS LLAMADAS AL API JDBC SE TRADUCEN EN LLAMADAS PROPIAS DE LA BBDD RELACIONAL QUE TENGAMOS.
                    - CADA CLIENTE DEBE TENER INSTALADO EL DRIVER.

            - DRIVER TIPO 3 JDBC NET  (3 CAPAS)   CON MIDDLEWARE

                    - 3 CAPAS: LAS SOLICITUDES JDBC SE TRADUCEN EN UN PROTOCOLO DE RED EN UNA CAPA INTERMEDIA, MIDDLEWARE,
                      QUE ENV�A LAS SOLICITUDES A LA BBDD USANDO UN DRIVER JDBC DE TIPO 1 O 2.
                    - ES UNA ARQUITECTURA MUY FLEXIBLE.

            - DRIVER TIPO 4 PROTOCOLO NATIVO

                    - REALIZA LAS LLAMADAS MEDIANTE EL SERVIDOR DE BASE DE DATOS, USANDO SU PROTOCOLO NATIVO.
                    - LA LLAMADA JDBC SE TRADUCE DIRECTAMENTE EN UNA LLAMADA DE RED A LA BASE DE DATOS, SIN INTERMEDIARIOS.
                    - PUEDEN DESARROLLARSE AL COMPLETO EN JAVA.
                    - SI CAMBIASE LA BASE DE DATOS,
                        HABRIA QUE DESARROLLAR OTRO DRIVER NATIVO ADAPTADO A LA NUEVA BBDD RELACIONAL.

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
                         
        ************************************************************************************************************************************
        * TIPO DRIVER *                VENTAJAS :)                            *                     INCONVENIENTES  :(                     *
        ************************************************************************************************************************************
        ************************************************************************************************************************************
        *  TIPO 1     *  F�CIL DE ENCONTRAR, SE DISTRIBUYE CON JAVA           *  PEOR RENDIMIENTO: DEMASIADAS CAPAS INTERMEDIAS            *
        * PUENTE ODBC *  ACCESO A GRAN CANTIDAD DE DRIVER ODBC                *  LIMITACI�N DE FUNCIONALIDAD                               *
        *             *                                                       *  NO FUNCIONAN BIEN CON APPLETS                             *
        ************************************************************************************************************************************
        *  TIPO 2     *  MEJOR RENDIMIENTO QUE EL TIPO 1                      *  NECESITA EL DRIVER INSTALADO EN EL CLIENTE                *
        *  API NATIVO *                                                       *  NO SE PUEDE MOVER ENTRE PLATAFORMAS                       *
        *             *                                                       *                                                            *
        ************************************************************************************************************************************
        *  TIPO 3     *  NO NECESITA LIBRER�A DEL FABRICANTE EN EL CLIENTE    *  REQUIEREN C�DIGO ESPEC�FICO DE BBDD EN LA CAPA INTERMEDIA *
        * MIDDLEWARE  *  MEJOR RENDIMIENTO EN INTERNET                        *  EL SERVIDOR DEBER� ESTAR EQUIPADO CON TODOS LOS DRIVERS   *
        *  (3 CAPAS)  *  MUCHAS OPCIONES DE PORTABILIDAD Y ESCALABILIDAD      *  PARA DAR SOPORTE A CUALQUIER M�QUINA CLIENTE              *
        ************************************************************************************************************************************
        *  TIPO 4     *  BUEN RENDIMIENTO                                     *  EL USUARIO NECESITATAR� DISTINTO SOFTWARE DE              *
        *  PROTOCOLO  *  NO NECESITAN INSTALAR UN SOFTWARE ESPECIAL           *            CONEXI�N (DRIVER) PARA CADA BBDD                *
        *  NATIVO     *  LOS DRIVES SON DE F�CIL ACCESO                       *                                                            *
        ************************************************************************************************************************************
                         
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

            - ANTES INCLUSO DE ESTABLECER LA CONEXI�N,
              EL PRIMER PASO VA A SER DESCARGAR EL DRIVER DE CONEXI�N DE LA BASE DE DATOS QUE VAMOS A USAR.
              A�ADIRLO AL PROYECTO JAVA O APLICATIVO, LA FORMA DE A�ADIRLO DEPENDE DEL PROYECTO Y DEL IDE.

            - SE DEFINIR�N DOS LITERALES (private static final String):
                    - DRIVER: LIBRER�A A�ADIDA A LA APLICACI�N.
                    - URL CONEXI�N: URL DE LA BASE DE DATOS A LA QUE NOS QUEREMOS CONECTAR.

            - VARIABLES ADICIONALES:
                    - DOS VARIABLES (final String) PARA EL USUARIO Y CONTRASE�A DE LA BBDD.
                    - UNA VARIABLE DE TIPO Connection Y OTRO Statement, INICIADAS A NULL.
                            - Connection: REPRESENTAR� LA CONEXI�N DIRECTA CON UNA BASE DE DATOS.
                                    - COMO PODR� TENER DISTINTAS IMPLEMENTACIONES (DIFERENTES CONEXIONES)
                                      SER� UNA INTERFAZ.
                            - Statement: CONTENDR� EL COMANDO A LANZAR Y EJECUTAR AN LA BASE DE DATOS.

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

            - JDBC OFRECE DISTINTAS FORMAS PARA REALIZAR CONEXIONES, USAREMOS -->  java.sql.DriverManager

            - PODREMOS TENER INSTALADAS TANTAS CONEXIONES COMO QUERAMOS.
                    - CADA CONEXI�N Y CADA BASE DE DATOS UTILIZAR� LOS DRIVERS JDBC.
                    - A SU VEZ, CADA UNO DE ELLOS IMPLEMENTAR� LA INTERFAZ -->  java.sql.Driver

            - DriverManager:
                    - GESTIONA TODOS LOS DRIVERS EN LA APLICACI�N, Y PERMITE EN UNA MISMA CAPA EL ACCESO A TODOS ELLOS.
                    - REQUIERE QUE LOS DRIVERS EST�N REGISTRADOS ANTES DE CUALQUIER ACCESO A LA BASE DE DATOS:
                            - PARA ELLO LA PRIMERA INSTRUCCI�N SER� -->  Class.forName(DRIVER)
                                    - REGISTRA EL DRIVER DECLARADO EN LA VARIABLE EST�TICA 'DRIVER'.

            - DESPU�S DE REGISTRAR EL DRIVER, SE USAR�N M�TODOS EST�TICOS PARA HACER getConnection Y ESTABLECER CONEXIONES:
                            - PAR�METROS: URL DE CONEXI�N, USUARIO Y CONTRASE�A.

            - LOS INTENTOS DE CONEXI�N Y LAS OPERACIONES QUE SE REALICEMOS DESPU�S, LAS ENGLOBAREMOS EN UN BLOQUE try/catch.
                            - SE PUEDE LANZAR LA EXCEPCI�N ClassNotFoundException SI EN LA L�NEA
                              ClassforName(DRIVER) EL FICHERO DEL DRIVER QUE EST� INDICADO, NO SE ENCONTRASE LA LIBRER�A.

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

            - DriverManager DEVUELVE LA CONEXI�N A BBDD, Y YA PODEMOS LANZAR LOS COMANDOS.

            - CON LA VARIABLE Connection, EJECUTAMOS EL M�TODO createStatement, QUE ASIGNAMOS A LA VARIABLE DEFINIDA INICIALMENTE.

            - PARA EJECUTAR LA CONSULTA, USAREMOS EL M�TODO executeQuery PAS�NDOLE COMO PAR�METRO EL COMANDO A EJECUTAR.

            - EL RESULTADO DE LA Query SE ASIGNA A UNA VARIABLE DE TIPO ResultSet.
                    - EN NUESTRO EJEMPLO, LO RECORREMOS CON UN BUCLE.

            - TRATAMIENTO DE EXCEPCIONES: ADEM�S DE LAS COMENTADAS EN EL ESTABLECIMIENTO DE LA CONEXI�N, SE PUEDEN GENERAR OTRAS:
                    - SQLException: SI A LA HORA DE EJECUTAR EL M�TODO executeQuery --> ALGO VA MAL EN BBDD.
                    - PODEMOS INCLUIR UNA SENTENCIA finaly PARA REALIZAR SIEMPRE LOS CIERRES
                      DE LA CLASE Statement Y DEL OBJETO Connection.
                            - SI ESTE �LTIMO CIERRE PROVOCASE UNA EXCEPCI�N, LA PODR�AMOS RECOGER Y LANZAR A LA CAPA SUPERIOR,
                              INCLUY�NDOLA EN LA DEFINICI�N DEL M�TODO QUE ESTAMOS PROGRAMANDO.

            - SI EJECUTAMOS DIRECTAMENTE EL C�DIGO FUENTE SIN HABER IMPORTADO EL .jar DEL DRIVER, NOS DEVOLVER� UNA EXCEPCI�N.

            - CONSULTAR LA DOCUMENTACI�N DEL DRIVER PARA SABER QU� CLASE HAY QUE PONER.  
                         
                    -->   private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

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
        *  1� - DESCARGAR EL DRIVER DE CONEXI�N DE LA BASE DE DATOS                                                                   *
        *                                                                                                                             *
        *       DOCUMENTACI�N:  https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html        *
        *                                                                       http://dev.mysql.com/downloads/mysql/                 *
        *                                                                       https://www.mysql.com/products/connector/             *
        *                                                                       WINDOWS -> INSTALADOR                                 *
        *                                                                       LINUX -> VERSI�N COMMUNNITY SERVER                    *
        *                                                                                                                             *
        *                                       COMPONENTES M�NIMOS A INSTALAR -->         (CUSTOM) -> SERVIDOR / WORKBENCH / SHELL   *
        *                                                                                                                             *
        *         CONFIGURACI�N B�SICA  -->  SERVIDOR DE BASE DE DATOS  -->  localhost     --> (SU DIRECCI�N ES:127.0.0.1)            *
        *                                                                    SI ES EN RED  -->  SU DIRECCI�N IP.                      *
        *                                                                    PUERTO        -->  3306        (POR DEFECTO)             *
        *                                                                                                                             *
        *                                        DURANTE LA INSTALACI�N  -->  USUARIO root Y CONTRASE�A.                              *
        *                                                                                                                             *
        *  2� - ABRIR GESTOR DE BASES DE DATOS MySQL.                                                                                 *
        *       --> (MySQL Workbench, DBeaver, HeidiSQL, ...) -> CONECTARSE A LA BASE DE DATOS -> HACER UNA CONSULTA -> �TODO OK?     *
        *                                                                                                                             *
        *  DESDE NETBEANS                                             --> import java.sql.*;                                          *
        *  3� - A�ADIR EL DRIVER AL PROYECTO (ConexioMySQL)                                                                           *
        *       CARPETA LIBRARIES (BOT�N DERECHO) -> ADD JAR/FOLDER... -> mysql-connector-j-8.0.31.jar                                *
        *  4� - DEFINIR EL DRIVER A UTILIZAR.  -->  com.mysql.cj.jdbc.Driver                     (MIRAR EN LADOCUMENTACI�N)           *
        *  5� - INDICAR LA URL DE LA CONEXI�N. -->  jdbc:mysql://localhost:3306/mysql            (EL SERVIDOR DE BASE DE DATOS)       *
        *           SE PODR�A PONER TAMBI�N... -->  jdbc:mysql://127.0.0.1:3306/mysql                                                 *
        *  6� - ALMACENAR EN VARIABLES:                                                                                               *
        *                                  final String usuario = "root";                                                             *
        *                                  final String password = "password";                                                        *
        *                                  Connection dbConnection = null;    REPRESENTA LA CONEXI�N DIRECTA CON LA BASE DE DATOS     *
        *                                  Statement statement = null;        VA A CONTENER LA SENTENCIA SQL QUE QUERAMOS EJECUTAR    *
        *                                                                                                                             *
        *  7� - ESTABLECER LA CONEXI�N: USAREMOS LA CLASE --> java.sql.DriverManager      (RECOMENDADA POR JAVA)                      *
        *       PODREMOS ESTABLECER TODAS LAS CONEX�ONES QUE NECESITEMOS Y CADA UNA IMPLEMENTA UNA INTERFAZ DE java.sql.Driver.       *
        *                                                                                                                             *
        *       REGISTRAMOS EL DRIVER   -->     Class.forName(DRIVER);                                                                *
        *       ESTABLECER LA CONEXI�N --->     dbConnection = DriverManager.getConnection(URL_CONEXION, usuario, password);          *
        *                                                                                                                             *
        *  8� - ESTABLECEMOS UNA CONSULTA SQL: -->     String selectTableSQL = "SELECT * FROM mysql.user";                            *
        *                                                                                                                             *
        *  9� - EJECUTAMOS LA INSTRUCCI�N CON:                                                                                        *
        *                                         statement = dbConnection.createStatement();                                         *
        *                                         ResultSet rs = statement.executeQuery(selectTableSQL);                              *
        *       EL RESULTADO DE LA CONSULTA SE GUARDA EN EL ResultSet rs QUE PODEMOS RECORRER CON UN BUCLE while                      *
        *       RECORRE EN CADA FILA, UN ELEMENTO DE CADA COLUMNA.                                                                    *
        *                                                                                                                             *
        * 10� - REALIZAMOS LOS CIERRES DE LOS OBJETOS:       statement.close();        dbConnection.close();                          *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
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
                case "11" -> {
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
                }
            }
            try {                
                menu = miTryRecursos();                
                switch (menu) {                   
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));   
    }
}