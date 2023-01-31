package Tema_14;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_14 {
    
    public static String punto_01 ="*  PUNTO  1.  BASES DE DATOS XML I.\n";
    public static String punto_02 ="*  PUNTO  2.  BASES DE DATOS XML II.\n";
    public static String punto_03 ="*  PUNTO  3.  VENTAJAS Y DESVENTAJAS DE LAS BASES DE DATOS XML.\n";
    public static String punto_04 ="*  PUNTO  4.  GESTORES XML LIBRES Y COMERCIALES I.\n";
    public static String punto_05 ="*  PUNTO  5.  GESTORES XML LIBRES Y COMERCIALES II.\n";
    public static String punto_06 ="*  PUNTO  6.  INSTALACIÓN Y CONFIGURACIÓN DE EXIST DB.\n";
    public static String punto_07 ="*  PUNTO  7.  EL PAQUETE DE INSTALACIÓN.\n";
    public static String punto_08 ="*  PUNTO  8.  ESTRATEGIAS DE ALMACENAMIENTO.\n";
    public static String punto_09 ="*  PUNTO  9.  ESTABLECIMIENTO Y CIERRE DE CONEXIONES I.\n";
    public static String punto_10 ="*  PUNTO 10.  ESTABLECIMIENTO Y CIERRE DE CONEXIONES II.\n";
    public static String punto_11 ="*  PUNTO 11.  AGREGAR, MODIFICAR Y ELIMINAR RECURSOS.\n";
    public static String punto_12 ="*  PUNTO 12.  CREACIÓN Y BORRADO DE COLECCIONES.\n";
    public static String punto_13 ="*  PUNTO 13.  MODIFICACIÓN DE CONTENIDOS XML.\n";
    public static String punto_14 ="*  PUNTO 14.  TRANSACCIONES XML.\n";
    public static String punto_15 ="*  PUNTO 15.  TRATAMIENTO EXCEPCIONES.\n";
    public static String punto_16 ="*  PUNTO 16.  OTRA FORMA DE APRENDER XQUERY EN EXISTDB.\n";
    public static String punto_17 ="*  PUNTO 17.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_14 + """
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" -> Recursos_14.recurso(menu); 
                    
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