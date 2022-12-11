package Principal;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(15);
            System.out.println("""                          
                               
        **************************************************************
        *                     ACCESO A DATOS                         *
        **************************************************************
        *                                                            *
        *   TEMA  1. INTRODUCCIÓN AL MANEJO DE FICHEROS.             *
        *   TEMA  2. FLUJOS.                                         *
        *   TEMA  3. TRABAJOS CON FICHEROS XML.                      *
        *   TEMA  4. MANEJO DE CONECTORES I.                         *
        *   TEMA  5. MANEJO DE CONECTORES II.                        *
        *   TEMA  6. MANEJO DE CONECTORES III: SENTENCIAS.           *
        *   TEMA  7. EL MAPEO OBJETO-RELACIONAL.                     *
        *   TEMA  8. EXPLORACIÓN DEL MAPEO OBJETO-RELACIONAL.        *
        *   TEMA  9. BASES DE DATOS ORIENTADAS A OBJETOS.            *
        *   TEMA 10.                                                 *
        *   TEMA 11.                                                 *
        *   TEMA 12.                                                 *
        *   TEMA 13.                                                 *
        *   TEMA 14.                                                 *
        *   TEMA 15.                                                 *
        *                                                            *
        **************************************************************
        *  0. SALIR.                                                 *
        **************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    case "1" -> Tema_01.T_01.main(args);
                    case "2" -> Tema_02.T_02.main(args);
                    case "3" -> Tema_03.T_03.main(args);
                    case "4" -> Tema_04.T_04.main(args);
                    case "5" -> Tema_05.T_05.main(args);
                    case "6" -> Tema_06.T_06.main(args);
                    case "7" -> Tema_07.T_07.main(args);
                    
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