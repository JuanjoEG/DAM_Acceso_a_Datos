package Clases;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class PatronMenu {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        **********************************************************************************
        *                                 T  I  T  U  L  O                               *
        **********************************************************************************
        *                                                                                *
        *  1.                                                                            *
        *  2.                                                                            *
        *  3.                                                                            *
        *  4.                                                                            *
        *  5.                                                                            *
        *  6.                                                                            *
        *  7.                                                                            *
        *  8.                                                                            *
        *  9.                                                                            *
        * 10.                                                                            *
        * 11.                                                                            *
        * 12.                                                                            *
        * 13.                                                                            *
        * 14.                                                                            *
        * 15.                                                                            *
        *                                                                                *
        **********************************************************************************
        *  0. SALIR.                                                                     *
        **********************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {}
                    case "2" -> {}
                    case "3" -> {}
                    case "4" -> {}
                    case "5" -> {}
                    case "6" -> {}
                    case "7" -> {}
                    case "8" -> {}
                    case "9" -> {}
                    case "10" -> {}
                    case "11" -> {}
                    case "12" -> {}
                    case "13" -> {}
                    case "14" -> {}
                    case "0" -> {}
                    default -> System.out.println("\n ¡¡¡ LA OPCIÒN NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}