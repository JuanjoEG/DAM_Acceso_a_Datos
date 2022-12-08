package Principal;

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
            System.out.println("""                          
                               
        **************************************************************
        *                     ACCESO A DATOS                         *
        **************************************************************
        *                                                            *
        *  1. INTRODUCCIÓN AL MANEJO DE FICHEROS.                    *
        *  2. FLUJOS.                                                *
        *  3. TRABAJOS CON FICHEROS XML.                             *
        *  4. MANEJO DE CONECTORES I.                                *
        *  5. MANEJO DE CONECTORES II.                               *
        *  6. MANEJO DE CONECTORES III: SENTENCIAS.                  *
        *  7. EL MAPEO OBJETO-RELACIONAL.                            *
        *  8. EXPLORACIÓN DEL MAPEO OBJETO-RELACIONAL.               *
        *  9. BASES DE DATOS ORIENTADAS A OBJETOS.                   *
        * 10.                                                        *
        * 11.                                                        *
        * 12.                                                        *
        * 13.                                                        *
        * 14.                                                        *
        * 15.                                                        *
        *                                                            *
        **************************************************************
        *  0. SALIR.                                                 *
        **************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> Tema_01.T_01.main(args);
                    case "2" -> Tema_02.T_02.main(args);
                    case "3" -> Tema_03.T_03.main(args);
                    case "4" -> Tema_04.T_04.main(args);
                    case "5" -> Tema_05.T_05.main(args);
                    case "6" -> Tema_06.T_06.main(args);
                    
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
                
    public static void esperar(int segundos) {
        try {            
            Thread.sleep(segundos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void meterEspacios(int espacios) {
    
        for (int i=0; i<espacios; i++) {
                System.out.println("");
            }
    
    }
}