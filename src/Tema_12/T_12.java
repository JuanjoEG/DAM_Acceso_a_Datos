package Tema_12;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_12 {
    
    public static String punto_01 ="*  PUNTO  1.  BASE DE DATOS MONGODB. CARACTER�STICAS I.\n";
    public static String punto_02 ="*  PUNTO  2.  BASE DE DATOS MONGODB. CARACTER�STICAS II.\n";
    public static String punto_03 ="*  PUNTO  3.  EL TEOREMA DE CAP.\n";
    public static String punto_04 ="*  PUNTO  4.  CLASIFICACI�N DE LAS BASES DE DATOS SEG�N EL TEOREMA DE CAP.\n";
    public static String punto_05 ="*  PUNTO  5.  BASE DE DATOS MONGODB. CASOS DE USO.\n";
    public static String punto_06 ="*  PUNTO  6.  BASE DE DATOS MONGODB. T�RMINOS EQUIVALENTES.\n";
    public static String punto_07 ="*  PUNTO  7.  CARACTER�STICAS DEL CONCEPTO DE DOCUMENTO EN MONGODB.\n";
    public static String punto_08 ="*  PUNTO  8.  FICHEROS BINARIOS DE MONGODB.\n";
    public static String punto_09 ="*  PUNTO  9.  HERRAMIENTAS EXPORTACI�N / IMPORTACI�N.\n";
    public static String punto_10 ="*  PUNTO 10.  UTILIDADES DE AN�LISIS DE PERFORMANCE Y ACTIVIDAD.\n";
    public static String punto_11 ="*  PUNTO 11.  SHELL DE MONGODB.\n";
    public static String punto_12 ="*  PUNTO 12.  COMANDOS �TILES DE LA SHELL DE MONGO.\n";
    public static String punto_13 ="*  PUNTO 13.  PROCESO DE CREACI�N DE UNA BASE DE DATOS MONGODB EN LA NUBE.\n";
    public static String punto_14 ="*  PUNTO 14.  OTRAS HERRAMIENTAS GR�FICAS DE MONGODB. ROBOMONGO.\n";
    public static String punto_15 ="*  PUNTO 15.  OPERACIONES CRUD.\n";
    public static String punto_16 ="*  PUNTO 16.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_12 + """
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" -> Recursos_12.recurso(menu); 
                    
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