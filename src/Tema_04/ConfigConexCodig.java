package Tema_04;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
*  1/4                                     CONFIGURACI�N DE UNA CONEXI�N EN C�DIGO.                                           *
*******************************************************************************************************************************

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

*******************************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
*******************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
*******************************************************************************************************************************
*  2/4                                     CONFIGURACI�N DE UNA CONEXI�N EN C�DIGO.                                           *
*******************************************************************************************************************************

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

*******************************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
*******************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
*******************************************************************************************************************************
*  3/4                                     CONFIGURACI�N DE UNA CONEXI�N EN C�DIGO.                                           *
*******************************************************************************************************************************

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

*******************************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
*******************************************************************************************************************************
*  TEMA 04                                       MANEJO DE CONECTORES I
*******************************************************************************************************************************
*  4/4                 MySQL               CONFIGURACI�N DE UNA CONEXI�N EN C�DIGO.                                           *
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