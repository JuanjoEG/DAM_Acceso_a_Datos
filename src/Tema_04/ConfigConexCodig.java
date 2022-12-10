package Tema_04;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class ConfigConexCodig {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""
                               
*******************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
*******************************************************************************************************************************
*  1/4                                     CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                           *
*******************************************************************************************************************************

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

*******************************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
*******************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
*******************************************************************************************************************************
*  2/4                                     CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                           *
*******************************************************************************************************************************

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

*******************************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
*******************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
*******************************************************************************************************************************
*  3/4                                     CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                           *
*******************************************************************************************************************************

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

*******************************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
*******************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
*******************************************************************************************************************************
*  4/4                 MySQL               CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                           *
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
*******************************************************************************************************************************

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