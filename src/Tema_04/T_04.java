package Tema_04;


import static Clases.Utilidades.continuar;
import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_04 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        *******************************************************************************************************
        *  TEMA 04                                       MANEJO DE CONECTORES I                               *
        *******************************************************************************************************
        *                                                                                                     *
        *  1. PROTOCOLOS DE ACCESO A LAS BASES DE DATOS.                                                      *
        *  2. COMPONENTES EN EL CONECTOR JDBC Y TIPOS DE CONEXIONES.                                          *
        *  3. TIPOS DE DRIVERS DE CONEXIONES JDBC.                                                            *
        *  4. VENTAJAS E INCONVENIENTES DEL USO DE CONECTORES.                                                *
        *  5. CONFIGURACI�N DE UNA CONEXI�N EN C�DIGO.                                                        *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *                EJEMPLOS:                                                                            *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  10. ConexionMySQL                                                                                  *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        System.out.println("""
                                           
        *************************************************************************************************
        * UN CONECTOR O DRIVER :      ES UNA SERIE DE CLASES IMPLEMENTADAS (API)                        *
        *                             QUE FACILITAN LA CONEXI�N A LA BASE DE DATOS ASOCIADA.            *
        *************************************************************************************************
        *                  BAS�NDONOS EN EL LENGUAJE SQL DISPONEMOS DE DOS PROTOCOLOS                   *
        *************************************************************************************************
        *       JDBC (JAVA DATABASE CONNECTIVITY)       *         ODBC (OPEN DATABASE CONNECTIVITY)     *
        *              DESARROLLADO POR SUN             *           DESARROLLADO POR MICROSOFT          *
        *************************************************************************************************
                                                   
                                           """);
                    continuar();
                    }
                    
                    case "2" -> {
                        System.out.println("""
                                           
        *********************************************** ************************************************
        *       COMPONENTES EN EL CONECTOR JDBC.      * *        TIPOS DE CONEXIONES.                  *
        *********************************************** ************************************************
        *   LA API DE JDBC.                           * *     ARQUITECTURA EN DOS CAPAS.               *
        *   PAQUETE DE PRUEBAS JDBC.                  * *     ARQUITECTURA EN TRES CAPAS.              *
        *   EL GESTOR JDBC.                           * ************************************************
        *   EL PUENTE JDBC-ODBC.                      * 
        *********************************************** 
                                                   
                                           """);
                    continuar();
                    }
                    
                    case "3" -> {
                        System.out.println("""
                                           
        ***************************************************************
        *              TIPOS DE DRIVERS DE CONEXIONES JDBC.           *
        ***************************************************************
        *   DRIVER TIPO 1 JDBC-ODBC             CON PUENTE ODBC       *
        *   DRIVER TIPO 2 JDBC NATIVO           CON API NATIVO        *
        *   DRIVER TIPO 3 JDBC NET  (3 CAPAS)   CON MIDDLEWARE        *
        *   DRIVER TIPO 4 PROTOCOLO NATIVO                            *
        ***************************************************************
                                                   
                                           """);
                    continuar();                    
                    }
                    
                    case "4" -> {
                        System.out.println("""
                                           
        *******************************************************************************************************************************
        * TIPO DRIVER *                VENTAJAS :)                            *                     INCONVENIENTES  :(                *
        *******************************************************************************************************************************
        *******************************************************************************************************************************
        *  TIPO 1     *  F�CIL DE ENCONTRAR                                   *  PEOR RENDIMIENTO: DEMASIADAS CAPAS INTERMEDIAS       *
        *             *  ACCESO A GRAN CANTIDAD DE DRIVER ODBC                *  LIMITACI�N DE FUNCIONALIDAD                          *
        *             *                                                       *  NO FUNCIONAN BIEN CON APPLETS                        *
        *******************************************************************************************************************************
        *  TIPO 2     *  MEJOR RENDIMIENTO QUE EL TIPO 1                      *  NECESITA EL DRIVER INSTALADO EN EL CLIENTE           *
        *             *                                                       *  NO SE PUEDE MOVER ENTRE PLATAFORMAS                  *
        *******************************************************************************************************************************
        *  TIPO 3     *  NO NECESITA LIBRER�A DEL FABRICANTE EN EL CLIENTE    *  REQUIEREN C�DIGO ESPEC�FICO DE BBDD                  *
        *             *  MEJOR RENDIMIENTO EN INTERNET                        *            EN LA CAPA INTERMEDIA                      *
        *******************************************************************************************************************************
        *  TIPO 4     *  BUEN RENDIMIENTO                                     *  EL USUARIO NECESITATAR� DISTINTO SOFTWARE DE         *
        *             *  NO NECESITAN INSTALAR UN SOFTWARE ESPECIAL           *            CONEXI�N (DRIVER) PARA CADA BBDD           *
        *******************************************************************************************************************************
                                                   
                                           """);
                    continuar();
                    }
                    
                    case "5" -> {
                        System.out.println("""
                                           
        *******************************************************************************************************************************
        *                      MySQL               CONFIGURACI�N DE UNA CONEXI�N EN C�DIGO.                                           *
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
        *                                  final String password = "polako";                                                          *
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
                                                           
                                           """);
                    continuar();
                    }
                    case "10" -> ConexionMySQL.main(args);
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