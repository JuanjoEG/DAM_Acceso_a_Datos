package Tema_04;


import static Clases.Utilidades.continuar;
import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
        *  5. CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                                        *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *                EJEMPLOS:                                                                            *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  10. ConexionMySQL                                                                                  *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        System.out.println("""
                                           
        *************************************************************************************************
        * UN CONECTOR O DRIVER :      ES UNA SERIE DE CLASES IMPLEMENTADAS (API)                        *
        *                             QUE FACILITAN LA CONEXIÓN A LA BASE DE DATOS ASOCIADA.            *
        *************************************************************************************************
        *                  BASÁNDONOS EN EL LENGUAJE SQL DISPONEMOS DE DOS PROTOCOLOS                   *
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
        *  TIPO 1     *  FÁCIL DE ENCONTRAR                                   *  PEOR RENDIMIENTO: DEMASIADAS CAPAS INTERMEDIAS       *
        *             *  ACCESO A GRAN CANTIDAD DE DRIVER ODBC                *  LIMITACIÓN DE FUNCIONALIDAD                          *
        *             *                                                       *  NO FUNCIONAN BIEN CON APPLETS                        *
        *******************************************************************************************************************************
        *  TIPO 2     *  MEJOR RENDIMIENTO QUE EL TIPO 1                      *  NECESITA EL DRIVER INSTALADO EN EL CLIENTE           *
        *             *                                                       *  NO SE PUEDE MOVER ENTRE PLATAFORMAS                  *
        *******************************************************************************************************************************
        *  TIPO 3     *  NO NECESITA LIBRERÍA DEL FABRICANTE EN EL CLIENTE    *  REQUIEREN CÓDIGO ESPECÍFICO DE BBDD                  *
        *             *  MEJOR RENDIMIENTO EN INTERNET                        *            EN LA CAPA INTERMEDIA                      *
        *******************************************************************************************************************************
        *  TIPO 4     *  BUEN RENDIMIENTO                                     *  EL USUARIO NECESITATARÁ DISTINTO SOFTWARE DE         *
        *             *  NO NECESITAN INSTALAR UN SOFTWARE ESPECIAL           *            CONEXIÒN (DRIVER) PARA CADA BBDD           *
        *******************************************************************************************************************************
                                                   
                                           """);
                    continuar();
                    }
                    
                    case "5" -> {
                        System.out.println("""
                                           
        *******************************************************************************************************************************
        *                      MySQL               CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                           *
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
        *                                  final String password = "polako";                                                          *
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
                                                           
                                           """);
                    continuar();
                    }
                    case "10" -> ConexionMySQL.main(args);
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