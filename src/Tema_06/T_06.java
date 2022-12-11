package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
        *  1. EJECUCI�N DE SENTENCIAS DE DEFINICI�N DE DATOS I.  CREACI�N DE BASE DE DATOS.                   *
        *  2. EJECUCI�N DE SENTENCIAS DE DEFINICI�N DE DATOS II. CREACI�N Y ELIMINACI�N DE TABLAS.            *
        *                                                                                                     *
        *  3. EJECUCI�N DE SENTENCIAS DE MANIPULACI�N DE DATOS I.  INSERCI�N.                                 *
        *  4. EJECUCI�N DE SENTENCIAS DE MANIPULACI�N DE DATOS II. EDICI�N.                                   *
        *                                                                                                     *
        *  5. EJECUCI�N DE CONSULTAS I.  SELECT.                                                              *
        *  6. EJECUCI�N DE CONSULTAS II. WHERE.                                                               *
        *                                                                                                     *
        *  7. GESTI�N DE TRANSACCIONES. COMMIT-ROLLBACK-SAVEPOINT.                                            *
        *  8. GESTI�N DE TRANSACCIONES. LA INTERFAZ STATEMENT.                                                *
        *                                                                                                     *
        *  9. TABLA RESUMEN.                                                                                  *
        *                                                                                                     *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************                          


                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
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