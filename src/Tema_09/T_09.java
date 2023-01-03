package Tema_09;

import static Principal_Main.Main.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_09 {
    
    public static String punto_01 ="*  PUNTO  1.  NOMENCLATURAS.\n";
    public static String punto_02 ="*  PUNTO  2.  DEFINICIÓN DE LAS BASES DE DATOS ORIENTADAS A OBJETOS.\n";
    public static String punto_03 ="*  PUNTO  3.  CARACTERÍSTICAS DE LAS BASES DE DATOS ORIENTADAS A OBJETOS.\n";
    public static String punto_04 ="*  PUNTO  4.  PROPIEDADES DE LOS LOS OBJETOS.\n";
    public static String punto_05 ="*  PUNTO  5.  SISTEMAS GESTORES DE BASES DE DATOS ORIENTADOS A OBJETOS.\n";
    public static String punto_06 ="*  PUNTO  6.  LENGUAJE DE CONSULTAS PARA OBJETOS. OQL.\n";
    public static String punto_07 ="*  PUNTO  7.  LENGUAJE DE CONSULTAS PARA OBJETOS. OQL. CONSULTAS DE UN OBJETO.\n";
    public static String punto_08 ="*  PUNTO  8.  VENTAJAS EN LA UTILIZACIÓN DE BASES DE DATOS ORIENTADAS A OBJETOS.\n";
    public static String punto_09 ="*  PUNTO  9.  DESVENTAJAS EN LA UTILIZACIÓN DE BASES DE DATOS ORIENTADAS A OBJETOS.\n";
    public static String punto_10 ="*  PUNTO 10.  PROGRAMACIÓN DE APLICACIONES CON ACCESO A BASES DE DATOS ORIENTADAS A OBJETOS.\n";
    public static String punto_11 ="*  PUNTO 11.  PETICIÓN A UNA API DESDE UN FRONT-END.\n";
    public static String punto_12 ="*  PUNTO 12.  T O D O.\n";
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_09 + """
        *******************************************************************************************
        *
        """ + punto_01 + """                        
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """                        
        """ + punto_06 + """
        """ + punto_07 + """                        
        """ + punto_08 + """
        """ + punto_09 + """                        
        """ + punto_10 + """
        """ + punto_11 + """
        *
        """ + punto_12 + """
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" -> Recursos_09.recurso(menu); 
                    
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