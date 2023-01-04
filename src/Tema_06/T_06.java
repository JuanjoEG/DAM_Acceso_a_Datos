package Tema_06;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_06 {
    
    public static String punto_01 ="*  PUNTO  1.  EJECUCI�N DE SENTENCIAS DE DEFINICI�N DE DATOS I.  CREACI�N DE BASE DE DATOS.\n";
    public static String punto_02 ="*  PUNTO  2.  EJECUCI�N DE SENTENCIAS DE DEFINICI�N DE DATOS II. CREACI�N Y ELIMINACI�N DE TABLAS.\n";
    public static String punto_03 ="*  PUNTO  3.  EJECUCI�N DE SENTENCIAS DE MANIPULACI�N DE DATOS I.  INSERCI�N.\n";
    public static String punto_04 ="*  PUNTO  4.  EJECUCI�N DE SENTENCIAS DE MANIPULACI�N DE DATOS II. EDICI�N.\n";
    public static String punto_05 ="*  PUNTO  5.  EJECUCI�N DE CONSULTAS I.  SELECT.\n";
    public static String punto_06 ="*  PUNTO  6.  EJECUCI�N DE CONSULTAS II. WHERE.\n";
    public static String punto_07 ="*  PUNTO  7.  GESTI�N DE TRANSACCIONES. COMMIT-ROLLBACK-SAVEPOINT.\n";
    public static String punto_08 ="*  PUNTO  8.  GESTI�N DE TRANSACCIONES. LA INTERFAZ STATEMENT.\n";
    public static String punto_09 ="*  PUNTO  9.  TABLA RESUMEN. CREACI�N DE BASE DE DATOS.\n";
    public static String punto_10 ="*  PUNTO 10.  TABLA RESUMEN. CREACI�N Y ELIMINACI�N DE TABLAS.\n";
    public static String punto_11 ="*  PUNTO 11.  TABLA RESUMEN. INSERCI�N.\n";
    public static String punto_12 ="*  PUNTO 12.  TABLA RESUMEN. EDICI�N.\n";
    public static String punto_13 ="*  PUNTO 13.  TABLA RESUMEN. CLAUSULA WHERE.\n";
    public static String punto_14 ="*  PUNTO 14.  TABLA RESUMEN. TRANSACCIONES.\n";
    public static String punto_15 ="*  PUNTO 15.  TABLA RESUMEN. LA INTERFAZ STATEMENT.\n";
    public static String punto_16 ="*  PUNTO 16.  T O D O.\n";
    
    public static void main(String[] args) {
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_06 + """
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
        *
        """ + punto_09 + """                        
        """ + punto_10 + """
        """ + punto_11 + """
        """ + punto_12 + """                        
        """ + punto_13 + """
        """ + punto_14 + """                        
        """ + punto_15 + """
        *
        """ + punto_16 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" -> Recursos_06.recurso(menu);
                    
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