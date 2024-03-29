package Tema_11;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_11 {
    
    public static String punto_01 ="*  PUNTO  1.  CARACTER�STICAS DE LAS BASES DE DATOS No-SQL.\n";
    public static String punto_02 ="*  PUNTO  2.  FUNDAMENTOS DE LAS BASES DE DATOS No-SQL.\n";
    public static String punto_03 ="*  PUNTO  3.  DIFERENCIAS ENTR BASES DE DATOS RELACIONALES Y No-SQL.\n";
    public static String punto_04 ="*  PUNTO  4.  BENEFICIOS DE LAS BASES DE DATOS No-SQL I. REQUISITOS DE UNA SOLUCI�N No-SQL A NIVEL EMPRESARIAL.\n";
    public static String punto_05 ="*  PUNTO  5.  BENEFICIOS DE LAS BASES DE DATOS No-SQL II.\n";
    public static String punto_06 ="*  PUNTO  6.  BENEFICIOS DE LAS BASES DE DATOS No-SQL III.\n";
    public static String punto_07 ="*  PUNTO  7.  TIPOS DE BASES DE DATOS NoSQL.\n";
    public static String punto_08 ="*  PUNTO  8.  MOTORES DE BASES DE DATOS No-SQL.\n";
    public static String punto_09 ="*  PUNTO  9.  INTRODUCCI�N A BIG DATA.\n";
    public static String punto_10 ="*  PUNTO 10.  TIPOS DE BIG DATA.\n";
    public static String punto_11 ="*  PUNTO 11.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_11 + """
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
        *
        """ + punto_11 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" -> Recursos_11.recurso(menu); 
                    
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