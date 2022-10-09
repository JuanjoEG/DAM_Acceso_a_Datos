package Clases;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Utilidades {
    
        public static void continuar() {
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.print("Escribe 0 y pulsa INTRO para continuar: ");
            menu = teclaStr.nextLine();
            if (!"0".equals(menu)) {
                System.out.println("\n ¡¡¡ LA OPCIÓN NO ES CORRECTA !!! \n");
            }
        } while (!"0".equals(menu));
    }
    
}