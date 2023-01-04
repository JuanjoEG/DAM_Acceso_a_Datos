package Tema_02;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class T_02 {
    
    public static String punto_01 ="*  PUNTO  1.  DEFINICI�N FLUJOS - STREAMS.\n";
    public static String punto_02 ="*  PUNTO  2.  CLASIFICACI�N DE FLUJOS.\n";
    public static String punto_03 ="*  PUNTO  3.  CLASES DE FLUJOS BASADOS EN TUBER�AS. (PIPE).\n";
    public static String punto_04 ="*  PUNTO  4.  CLASES DE FLUJOS BASADOS EN ARRAYS.\n";
    public static String punto_05 ="*  PUNTO  5.  CLASES DE AN�LISIS PARA FLUJOS DE DATOS.\n";
    public static String punto_06 ="*  PUNTO  6.  CLASES PARA EL TRATAMIENTO DE LA INFORMACI�N.\n";
    public static String punto_07 ="*  PUNTO  7.  EJEMPLOS.\n";
    public static String punto_08 ="*  PUNTO  8.  T O D O.\n";
    
    public static void main(String[] args) {
        String menu="";
        do {
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
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "8" -> Recursos_02.recurso(menu);                    
                    case "7" -> Tema_02.MenuEjemplos.main(args);
                    
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));
    }
}