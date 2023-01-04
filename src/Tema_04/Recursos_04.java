package Tema_04;

import static Principal_Main.Main.*;
import static Tema_04.T_04.*;

/**
 *
 * @author Juan José Estévez González
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
                       ES UNA SERIE DE CLASES Y LIBRERÍAS IMPLEMENTADAS (EN FORMA DE API) QUE UNEN LA CAPA DE NUESTRA
                       APLICACIÓN CON LA CAPA DE BASE DE DATOS, PERMITIENDO ASÍ LA CONEXIÓN Y LA REALIZACIÓN DE CONSULTAS.

            EL DESFASE OBJETO-RELACIONAL VIENE EN RELACIÓN A DOS PUNTOS:
                   - TENEMOS LA PARTE DE LA PROGRAMACIÓN ORIENTADA A OBJETOS, ES DECIR, EL APLICATIVO,
                     EN NUESTRO CASO PROGRAMADO EN JAVA, Y POR TANTO ORIENTADO A OBJETOS, PUDIENDO SER OBJETOS COMPLEJOS.
                   - TENEMOS LA BASE DE DATOS FISICA, GENERALMENTE UNA BASE DE DATOS RELACIONAL,
                     CON INFORMACIÓN ESTRUCTURADA EN TABLAS, ES DECIR, CON DATOS SIMPLES.

            ESTE DESFASE IMPLICA QUE SEA NECESARIA UNA TRADUCCIÓN
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
                    ES UNA SERIE DE CLASES Y LIBRERÍAS IMPLEMENTADAS (EN FORMA DE API) QUE UNEN LA CAPA DE NUESTRA
                    APLICACIÓN CON LA CAPA DE BASE DE DATOS, PERMITIENDO ASÍ LA CONEXIÓN Y LA REALIZACIÓN DE CONSULTAS.
                    ALGUNOS EJEMPLOS DE CONECTORES:

                            - JDBC -->  JAVA DATABASE CONNECTIVITY.  DESARROLLADO POR SUN.
                            - ODBC -->  OPEN DATABASE CONNECTIVITY.  DESARROLLADO POR MICROSOFT.
                            - ADO Y ADO.net

            - UNA APLICACÓN QUE ACCEDA A UNA BASE DE DATOS DEBE TENER ASOCIADO SIEMPRE UN CONECTOR.
                    - DE ESTA FORMA, NO TENEMOS QUE CONOCER LOS ASPECTOS TÉCNICOS,
                      NI CÓMO FUNCIONAN EN SU INTERIOR LAS BASES DE DATOS.
                    - EN SU LUGAR, NOS OCUPAREMOS DE CÓMO REALIZAR LA COMUNICACIÓN,
                      Y DE CÓMO FUNCIONA NUESTRO APLICATIVO.

            - USANDO UN CONECTOR:
              NO HABRÁ QUE PROGRAMAR APLICACIONES DIFERENTES PARA ACCEDER A DISTINTAS BASES DE DATOS,
              NOSOTROS DESARROLLARÍAMOS NUESTRA APLICACIÓN, USAR LOS CONECTORES ADECUADOS, 
              Y A LA HORA DE REALIZAR CUALQUIER CONSULTA,
              EL CONECTOR INTERPRETARÍA DE UNA FORMA O DE OTRA SEGÚN LA BASE DE DATOS ASOCIADA.

            - EL APLICATIVO SÓLO NECESITARÁ INFORMACIÓN PARA EL ACCESO A LA BASE DE DATOS.
              INDICANDO LAS CONFIGURACIONES, TENDRÍAMOS ACCESO SIN PREOCUPARNOS DEL LENGUAJE INTERNO,
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

                    - API: CONJUNTO DE LIBRERÍAS Y CLASES QUE NOS FACILITAN EL ACCESO A LAS BASES DE DATOS RELACIONALES,
                           Y LA POSIBILIDAD DE REALIZAR CONSULTAS A DICHAS BASES DE DATOS.
                                - ESTÁN EN LOS PAQUETES   -->  java.sql   Y   javax.sql

                    - PAQUETE DE PRUEBAS: CLASES QUE VALIDAN SI UN DRIVER PASA LOS REQUISITOS PREVISTOS POR JDBC.

                    - GESTOR: REALIZA LA UNIÓN ENTRE NUESTRO APLICATIVO Y EL DRIVER APROPIADO JDBC,
                              BIEN POR CONEXIÓN DIRECTA, O SINO A TRAVÉS DE UN pool DE CONEXIONES.

                    - PUENTE JDBC-ODBC: FACILITA USAR DRIVERS ODBC COMO SI ESTUVIÉRAMOS TRABAJANDO CON JDBC.

            - 2 TIPOS DE ARQUITECTURA DE CONEXIÓN CON JDBC.

                    - ARQUITECTURA EN 2 CAPAS:
                             - NUESTRA APLICACIÓN SE CONECTARÁ A LA BASE DE DATOS A TRAVÉS DE UN DRIVER.
                             - TANTO EL DRIVER COMO LA APLICACIÓN DEBEN LOCALIZARSE EN EL MISMO SISTEMA O MÁQUINA.

                    - ARQUITECTURA EN 3 CAPAS:
                             - NUESTRO APLICATIVO ENVÍA LAS INSTRUCCIONES A UNA CAPA INTERMADIA, 
                               (MIDDLEWARE) -->  TRADUCTOR: QUE ESTÁ EN OTRA MÁQUINA.
                             - ESTA CAPA COGERÁ LA INFORMACIÓN Y LA ENVIARÁ A LA BASE DE DATOS,
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

                    - ESCRITOS UNA PARTE EN JAVA, Y OTRA PARTE EN CÓDIGO NATIVO.
                    - LAS LLAMADAS AL API JDBC SE TRADUCEN EN LLAMADAS PROPIAS DE LA BBDD RELACIONAL QUE TENGAMOS.
                    - CADA CLIENTE DEBE TENER INSTALADO EL DRIVER.

            - DRIVER TIPO 3 JDBC NET  (3 CAPAS)   CON MIDDLEWARE

                    - 3 CAPAS: LAS SOLICITUDES JDBC SE TRADUCEN EN UN PROTOCOLO DE RED EN UNA CAPA INTERMEDIA, MIDDLEWARE,
                      QUE ENVÍA LAS SOLICITUDES A LA BBDD USANDO UN DRIVER JDBC DE TIPO 1 O 2.
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
        *  TIPO 1     *  FÁCIL DE ENCONTRAR, SE DISTRIBUYE CON JAVA           *  PEOR RENDIMIENTO: DEMASIADAS CAPAS INTERMEDIAS            *
        * PUENTE ODBC *  ACCESO A GRAN CANTIDAD DE DRIVER ODBC                *  LIMITACIÓN DE FUNCIONALIDAD                               *
        *             *                                                       *  NO FUNCIONAN BIEN CON APPLETS                             *
        ************************************************************************************************************************************
        *  TIPO 2     *  MEJOR RENDIMIENTO QUE EL TIPO 1                      *  NECESITA EL DRIVER INSTALADO EN EL CLIENTE                *
        *  API NATIVO *                                                       *  NO SE PUEDE MOVER ENTRE PLATAFORMAS                       *
        *             *                                                       *                                                            *
        ************************************************************************************************************************************
        *  TIPO 3     *  NO NECESITA LIBRERÍA DEL FABRICANTE EN EL CLIENTE    *  REQUIEREN CÓDIGO ESPECÍFICO DE BBDD EN LA CAPA INTERMEDIA *
        * MIDDLEWARE  *  MEJOR RENDIMIENTO EN INTERNET                        *  EL SERVIDOR DEBERÁ ESTAR EQUIPADO CON TODOS LOS DRIVERS   *
        *  (3 CAPAS)  *  MUCHAS OPCIONES DE PORTABILIDAD Y ESCALABILIDAD      *  PARA DAR SOPORTE A CUALQUIER MÁQUINA CLIENTE              *
        ************************************************************************************************************************************
        *  TIPO 4     *  BUEN RENDIMIENTO                                     *  EL USUARIO NECESITATARÁ DISTINTO SOFTWARE DE              *
        *  PROTOCOLO  *  NO NECESITAN INSTALAR UN SOFTWARE ESPECIAL           *            CONEXIÓN (DRIVER) PARA CADA BBDD                *
        *  NATIVO     *  LOS DRIVES SON DE FÁCIL ACCESO                       *                                                            *
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

            - ANTES INCLUSO DE ESTABLECER LA CONEXIÓN,
              EL PRIMER PASO VA A SER DESCARGAR EL DRIVER DE CONEXIÓN DE LA BASE DE DATOS QUE VAMOS A USAR.
              AÑADIRLO AL PROYECTO JAVA O APLICATIVO, LA FORMA DE AÑADIRLO DEPENDE DEL PROYECTO Y DEL IDE.

            - SE DEFINIRÁN DOS LITERALES (private static final String):
                    - DRIVER: LIBRERÍA AÑADIDA A LA APLICACIÓN.
                    - URL CONEXIÓN: URL DE LA BASE DE DATOS A LA QUE NOS QUEREMOS CONECTAR.

            - VARIABLES ADICIONALES:
                    - DOS VARIABLES (final String) PARA EL USUARIO Y CONTRASEÑA DE LA BBDD.
                    - UNA VARIABLE DE TIPO Connection Y OTRO Statement, INICIADAS A NULL.
                            - Connection: REPRESENTARÁ LA CONEXIÓN DIRECTA CON UNA BASE DE DATOS.
                                    - COMO PODRÁ TENER DISTINTAS IMPLEMENTACIONES (DIFERENTES CONEXIONES)
                                      SERÁ UNA INTERFAZ.
                            - Statement: CONTENDRÁ EL COMANDO A LANZAR Y EJECUTAR AN LA BASE DE DATOS.

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
                    - CADA CONEXIÓN Y CADA BASE DE DATOS UTILIZARÁ LOS DRIVERS JDBC.
                    - A SU VEZ, CADA UNO DE ELLOS IMPLEMENTARÁ LA INTERFAZ -->  java.sql.Driver

            - DriverManager:
                    - GESTIONA TODOS LOS DRIVERS EN LA APLICACIÓN, Y PERMITE EN UNA MISMA CAPA EL ACCESO A TODOS ELLOS.
                    - REQUIERE QUE LOS DRIVERS ESTÉN REGISTRADOS ANTES DE CUALQUIER ACCESO A LA BASE DE DATOS:
                            - PARA ELLO LA PRIMERA INSTRUCCIÓN SERÁ -->  Class.forName(DRIVER)
                                    - REGISTRA EL DRIVER DECLARADO EN LA VARIABLE ESTÁTICA 'DRIVER'.

            - DESPUÉS DE REGISTRAR EL DRIVER, SE USARÁN MÉTODOS ESTÁTICOS PARA HACER getConnection Y ESTABLECER CONEXIONES:
                            - PARÁMETROS: URL DE CONEXIÓN, USUARIO Y CONTRASEÑA.

            - LOS INTENTOS DE CONEXIÓN Y LAS OPERACIONES QUE SE REALICEMOS DESPUÉS, LAS ENGLOBAREMOS EN UN BLOQUE try/catch.
                            - SE PUEDE LANZAR LA EXCEPCIÓN ClassNotFoundException SI EN LA LÍNEA
                              ClassforName(DRIVER) EL FICHERO DEL DRIVER QUE ESTÁ INDICADO, NO SE ENCONTRASE LA LIBRERÍA.

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

            - DriverManager DEVUELVE LA CONEXIÓN A BBDD, Y YA PODEMOS LANZAR LOS COMANDOS.

            - CON LA VARIABLE Connection, EJECUTAMOS EL MÉTODO createStatement, QUE ASIGNAMOS A LA VARIABLE DEFINIDA INICIALMENTE.

            - PARA EJECUTAR LA CONSULTA, USAREMOS EL MÉTODO executeQuery PASÁNDOLE COMO PARÁMETRO EL COMANDO A EJECUTAR.

            - EL RESULTADO DE LA Query SE ASIGNA A UNA VARIABLE DE TIPO ResultSet.
                    - EN NUESTRO EJEMPLO, LO RECORREMOS CON UN BUCLE.

            - TRATAMIENTO DE EXCEPCIONES: ADEMÁS DE LAS COMENTADAS EN EL ESTABLECIMIENTO DE LA CONEXIÓN, SE PUEDEN GENERAR OTRAS:
                    - SQLException: SI A LA HORA DE EJECUTAR EL MÉTODO executeQuery --> ALGO VA MAL EN BBDD.
                    - PODEMOS INCLUIR UNA SENTENCIA finaly PARA REALIZAR SIEMPRE LOS CIERRES
                      DE LA CLASE Statement Y DEL OBJETO Connection.
                            - SI ESTE ÚLTIMO CIERRE PROVOCASE UNA EXCEPCIÓN, LA PODRÍAMOS RECOGER Y LANZAR A LA CAPA SUPERIOR,
                              INCLUYÉNDOLA EN LA DEFINICIÓN DEL MÉTODO QUE ESTAMOS PROGRAMANDO.

            - SI EJECUTAMOS DIRECTAMENTE EL CÓDIGO FUENTE SIN HABER IMPORTADO EL .jar DEL DRIVER, NOS DEVOLVERÁ UNA EXCEPCIÓN.

            - CONSULTAR LA DOCUMENTACIÓN DEL DRIVER PARA SABER QUÉ CLASE HAY QUE PONER.  
                         
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
        *  1º - DESCARGAR EL DRIVER DE CONEXIÓN DE LA BASE DE DATOS                                                                   *
        *                                                                                                                             *
        *       DOCUMENTACIÓN:  https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html        *
        *                                                                       http://dev.mysql.com/downloads/mysql/                 *
        *                                                                       https://www.mysql.com/products/connector/             *
        *                                                                       WINDOWS -> INSTALADOR                                 *
        *                                                                       LINUX -> VERSIÓN COMMUNNITY SERVER                    *
        *                                                                                                                             *
        *                                       COMPONENTES MÍNIMOS A INSTALAR -->         (CUSTOM) -> SERVIDOR / WORKBENCH / SHELL   *
        *                                                                                                                             *
        *         CONFIGURACIÓN BÁSICA  -->  SERVIDOR DE BASE DE DATOS  -->  localhost     --> (SU DIRECCIÓN ES:127.0.0.1)            *
        *                                                                    SI ES EN RED  -->  SU DIRECCIÓN IP.                      *
        *                                                                    PUERTO        -->  3306        (POR DEFECTO)             *
        *                                                                                                                             *
        *                                        DURANTE LA INSTALACIÓN  -->  USUARIO root Y CONTRASEÑA.                              *
        *                                                                                                                             *
        *  2º - ABRIR GESTOR DE BASES DE DATOS MySQL.                                                                                 *
        *       --> (MySQL Workbench, DBeaver, HeidiSQL, ...) -> CONECTARSE A LA BASE DE DATOS -> HACER UNA CONSULTA -> ¿TODO OK?     *
        *                                                                                                                             *
        *  DESDE NETBEANS                                             --> import java.sql.*;                                          *
        *  3º - AÑADIR EL DRIVER AL PROYECTO (ConexioMySQL)                                                                           *
        *       CARPETA LIBRARIES (BOTÓN DERECHO) -> ADD JAR/FOLDER... -> mysql-connector-j-8.0.31.jar                                *
        *  4º - DEFINIR EL DRIVER A UTILIZAR.  -->  com.mysql.cj.jdbc.Driver                     (MIRAR EN LADOCUMENTACIÓN)           *
        *  5º - INDICAR LA URL DE LA CONEXIÓN. -->  jdbc:mysql://localhost:3306/mysql            (EL SERVIDOR DE BASE DE DATOS)       *
        *           SE PODRÍA PONER TAMBIÉN... -->  jdbc:mysql://127.0.0.1:3306/mysql                                                 *
        *  6º - ALMACENAR EN VARIABLES:                                                                                               *
        *                                  final String usuario = "root";                                                             *
        *                                  final String password = "password";                                                        *
        *                                  Connection dbConnection = null;    REPRESENTA LA CONEXIÓN DIRECTA CON LA BASE DE DATOS     *
        *                                  Statement statement = null;        VA A CONTENER LA SENTENCIA SQL QUE QUERAMOS EJECUTAR    *
        *                                                                                                                             *
        *  7º - ESTABLECER LA CONEXIÓN: USAREMOS LA CLASE --> java.sql.DriverManager      (RECOMENDADA POR JAVA)                      *
        *       PODREMOS ESTABLECER TODAS LAS CONEXÍONES QUE NECESITEMOS Y CADA UNA IMPLEMENTA UNA INTERFAZ DE java.sql.Driver.       *
        *                                                                                                                             *
        *       REGISTRAMOS EL DRIVER   -->     Class.forName(DRIVER);                                                                *
        *       ESTABLECER LA CONEXIÓN --->     dbConnection = DriverManager.getConnection(URL_CONEXION, usuario, password);          *
        *                                                                                                                             *
        *  8º - ESTABLECEMOS UNA CONSULTA SQL: -->     String selectTableSQL = "SELECT * FROM mysql.user";                            *
        *                                                                                                                             *
        *  9º - EJECUTAMOS LA INSTRUCCIÓN CON:                                                                                        *
        *                                         statement = dbConnection.createStatement();                                         *
        *                                         ResultSet rs = statement.executeQuery(selectTableSQL);                              *
        *       EL RESULTADO DE LA CONSULTA SE GUARDA EN EL ResultSet rs QUE PODEMOS RECORRER CON UN BUCLE while                      *
        *       RECORRE EN CADA FILA, UN ELEMENTO DE CADA COLUMNA.                                                                    *
        *                                                                                                                             *
        * 10º - REALIZAMOS LOS CIERRES DE LOS OBJETOS:       statement.close();        dbConnection.close();                          *
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