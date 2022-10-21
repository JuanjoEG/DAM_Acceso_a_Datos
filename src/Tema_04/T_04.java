package Tema_04;


import static Clases.Utilidades.continuar;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_04 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""                          
                               
        *******************************************************************************************************
        *  TEMA 03                                       MANEJO DE CONECTORES I                               *
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
        *                                          CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                           *
        *******************************************************************************************************************************
        *  1º - DESCARGAR EL DRIVER DE CONEXIÓN DE LA BASE DE DATOS             http://dev.mysql.com/downloads/mysql/                 *
        *                                                                       https://www.mysql.com/products/connector/             *
        *                                                                       WINDOWS -> INSTALADOR                                 *
        *                                                                                  (CUSTOM) -> SERVIDOR / WORKBENCH / SHELL   *
        *                                                                       LINUX -> VERSIÓN COMMUNNITY SERVER                    *
        *  2º - ABRIR WORKBENCH -> CONECTARSE A LA BASE DE DATOS -> HACER UNA CONSULTA -> ¿TODO OK?                                   *
        *  3º - AÑADIR EL DRIVER AL PROYECTO                                                                                          *
        *                  CARPETA LIBRARIES -> ADD JAR/FOLDER... -> mysql-connector-j-8.0.31.jar  (MIRAR DOCUMENTACIÓN)              *
        *******************************************************************************************************************************
                                                           
                                           """);
                    continuar();
                    }
                    case "10" -> ConexionMySQL.main(args);
                    case "0" -> {}
                    default -> System.out.println("\n ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}