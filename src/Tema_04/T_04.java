package Tema_04;


import Ejemplos_T04.ConexionMySQL;
import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
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
        *  1. EL DESFASE OBJETO-RELACIONAL.                                                                   *
        *  2. PROTOCOLOS DE ACCESO A BASE DE DATOS.                                                           *
        *  3. COMPONENTES DE JDBC.                                                                            *
        *  4. TIPOS DE DRIVERS DE CONEXIONES JDBC.                                                            *
        *  5. VENTAJAS E INCONVENIENTES DEL USO DE CONECTORES.                                                *
        *  6. CONFIGURACIÓN DE UNA CONEXIÓN EN CÓDIGO.                                                        *
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
                meterEspacios(25);
                switch (menu) {
                    case "1" -> DesfaseObjRel.main(args);
                    case "2" -> ProtolosAccesoBD.main(args);                    
                    case "3" -> ComponenteJDBC.main(args);
                    case "4" -> TiposDriversConexionesJDBC.main(args);
                    case "5" -> VentajaInconvenientes.main(args);                    
                    case "6" -> ConfigConexCodig.main(args);
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