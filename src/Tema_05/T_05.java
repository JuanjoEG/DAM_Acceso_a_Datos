package Tema_05;

import static Principal_Main.Main.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_05 {
    
    public static String punto_01 ="*  PUNTO  1.  GESTORES DE BASES DE DATOS EMBEBIDOS E INDEPENDIENTES.\n";
    public static String punto_02 ="*  PUNTO  2.  GESTORES DE BASES DE DATOS EMBEBIDOS I: HyperSQL Y ObjectDB.\n";
    public static String punto_03 ="*  PUNTO  3.  GESTORES DE BASES DE DATOS EMBEBIDOS I: Apache Derby, JavaDB Y H2.\n";
    public static String punto_04 ="*  PUNTO  4.  GESTORES DE BASES DE DATOS INDEPENDIENTES.\n";
    public static String punto_05 ="*  PUNTO  5.  AÑADIR BASE DE DATOS H2 USANDO SPRING BOOT.\n";
    public static String punto_06 ="*  PUNTO  6.  ARRANCAR SPRING H2 JPA WEB SIN TENER EL IDE.\n";
    public static String punto_07 ="*  PUNTO  7.  COMPARATIVA.\n";
    public static String punto_08 ="*  PUNTO  8.  T O D O.\n";
        
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_05 + """
        *******************************************************************************************
        *
        """ + punto_01 + """                        
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """                        
        """ + punto_06 + """
        """ + punto_07 + """
        *
        """ + punto_08 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_05.recurso(menu);

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