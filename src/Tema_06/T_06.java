package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_06 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""
                               
        *******************************************************************************************************
        *  TEMA 06                          MANEJO DE CONECTORES III: SENTENCIAS                              *
        *******************************************************************************************************
        *                                                                                                     *
        *  1. EJECUCIÓN DE SENTENCIAS DE DEFINICIÓN DE DATOS I.  CREACIÓN DE BASE DE DATOS.                   *
        *  2. EJECUCIÓN DE SENTENCIAS DE DEFINICIÓN DE DATOS II. CREACIÓN Y ELIMINACIÓN DE TABLAS.            *
        *                                                                                                     *
        *  3. EJECUCIÓN DE SENTENCIAS DE MANIPULACIÓN DE DATOS I.  INSERCIÓN.                                 *
        *  4. EJECUCIÓN DE SENTENCIAS DE MANIPULACIÓN DE DATOS II. EDICIÓN.                                   *
        *                                                                                                     *
        *  5. EJECUCIÓN DE CONSULTAS I.  SELECT.                                                              *
        *  6. EJECUCIÓN DE CONSULTAS II. WHERE.                                                               *
        *                                                                                                     *
        *  7. GESTIÓN DE TRANSACCIONES. COMMIT-ROLLBACK-SAVEPOINT.                                            *
        *  8. GESTIÓN DE TRANSACCIONES. LA INTERFAZ STATEMENT.                                                *
        *                                                                                                     *
        *  9. TABLA RESUMEN.                                                                                  *
        *                                                                                                     *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************                          


                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1" -> EjecSentDefin01.main(args);
                    case "2" -> EjecSentDefin02.main(args);
                    case "3" -> EjecSentManip01.main(args);
                    case "4" -> EjecSentManip02.main(args);
                    case "5" -> EjecSentConsult01.main(args);
                    case "6" -> EjecSentConsult02.main(args);
                    case "7" -> GestionTransacc01.main(args);
                    case "8" -> GestionTransacc02.main(args);
                    case "9" -> TablaResumen.main(args);
                    
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