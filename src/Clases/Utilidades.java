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
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.print("Escribe 0 y pulsa INTRO para continuar: ");
            menu = teclaStr.nextLine();
            meterEspacios(25);
            if (!"0".equals(menu)) {
                meterEspacios(25);
                System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                meterEspacios(15);
                esperar(1500);
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