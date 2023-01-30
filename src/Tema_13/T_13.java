package Tema_13;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_13 {
    
    public static String punto_01 ="*  PUNTO  1.  CONCEPTO Y CARACTER�STICAS PRINCIPALES DE LOS �NDICES.\n";
    public static String punto_02 ="*  PUNTO  2.  TIPOLOG�AS DE LOS �NDICES EN MONGODB. MONOCLAVE. COMPUESTOS.\n";
    public static String punto_03 ="*  PUNTO  3.  TIPOLOG�AS DE LOS �NDICES EN MONGODB. UNIQUE. SPARSE.\n";
    public static String punto_04 ="*  PUNTO  4.  OTROS TIPOS DE �NDICES M�S ESPEC�FICOS.\n";
    public static String punto_05 ="*  PUNTO  5.  OPERACIONES CON LOS �NDICES.\n";
    public static String punto_06 ="*  PUNTO  6.  CREACI�N DE USUARIOS Y ROLES.\n";
    public static String punto_07 ="*  PUNTO  7.  CREACI�N DE USUARIOS Y ROLES. SINTAXIS.\n";
    public static String punto_08 ="*  PUNTO  8.  ACCESO DE CONTROL BASADO EN ROLES. RBAC.\n";
    public static String punto_09 ="*  PUNTO  9.  EXPORTACI�N DE DATOS.\n";
    public static String punto_10 ="*  PUNTO 10.  IMPORTACI�N DE DATOS.\n";
    public static String punto_11 ="*  PUNTO 11.  PAR�METROS DE CONEXI�N DE VS CODE A MONGODB ATLAS.\n";
    public static String punto_12 ="*  PUNTO 12.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_13 + """
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
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" -> Recursos_13.recurso(menu); 
                    
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