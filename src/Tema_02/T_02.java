package Tema_02;

import static Principal_Main.Main.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_02 {
    
    public static String punto_01 ="*  PUNTO  1.  DEFINICIÓN FLUJOS - STREAMS.\n";
    public static String punto_02 ="*  PUNTO  2.  CLASIFICACIÓN DE FLUJOS.\n";
    public static String punto_03 ="*  PUNTO  3.  CLASES DE FLUJOS BASADOS EN TUBERÍAS. (PIPE).\n";
    public static String punto_04 ="*  PUNTO  4.  CLASES DE FLUJOS BASADOS EN ARRAYS.\n";
    public static String punto_05 ="*  PUNTO  5.  CLASES DE ANÁLISIS PARA FLUJOS DE DATOS.\n";
    public static String punto_06 ="*  PUNTO  6.  CLASES PARA EL TRATAMIENTO DE LA INFORMACIÓN.\n";
    public static String punto_07 ="*  PUNTO  7.  EJEMPLOS.\n";
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
        """ + Principal_Main.Main.tema_02 + """
        *******************************************************************************************
        *
        """ + punto_01 + """                        
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """                        
        """ + punto_06 + """
        *
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
                    
                    case "1", "2", "3", "4", "5", "6", "8" -> Recursos_02.recurso(menu);                    
                    case "7" -> Tema_02.MenuEjemplos.main(args);
                    
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