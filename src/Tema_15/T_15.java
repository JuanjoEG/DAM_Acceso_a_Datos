package Tema_15;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_15 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  CONCEPTO Y CARACTERÍSTICAS DE UN COMPONENTE.\n";
    public static String punto_03 ="*  PUNTO  3.  ELEMENTOS DE LOS COMPONENTES.\n";
    public static String punto_04 ="*  PUNTO  4.  PROPIEDADES Y ATRIBUTOS DE UN COMPONENTE.\n";
    public static String punto_05 ="*  PUNTO  5.  PROPIEDADES Y ATRIBUTOS DE UN COMPONENTE: INDEXADAS Y SIMPLES.\n";
    public static String punto_06 ="*  PUNTO  6.  PROPIEDADES Y ATRIBUTOS DE UN COMPONENTE: COMPARTIDAS.\n";
    public static String punto_07 ="*  PUNTO  7.  PROPIEDADES Y ATRIBUTOS DE UN COMPONENTE: RESTRINGIDAS.\n";
    public static String punto_08 ="*  PUNTO  8.  DIFERENCIA ENTRE POJOS Y BEANS.\n";
    public static String punto_09 ="*  PUNTO  9.  EJEMPLO DE CLASE POJO.\n";
    public static String punto_10 ="*  PUNTO 10.  EJEMPLO DE CLASE BEAN.\n";
    public static String punto_11 ="*  PUNTO 11.  EVENTOS.\n";
    public static String punto_12 ="*  PUNTO 12.  INTROSPECCIÓN.\n";
    public static String punto_13 ="*  PUNTO 13.  EJEMPLO DE CÓDIGO DE INTROSPECCIÓN.\n";
    public static String punto_14 ="*  PUNTO 14.  PERSISTENCIA DEL COMPONENTE.\n";
    public static String punto_15 ="*  PUNTO 15.  CLASES QUE COMPONEN JPA.\n";
    public static String punto_16 ="*  PUNTO 16.  JAVA EE TUTORIAL.\n";
    public static String punto_17 ="*  PUNTO 17.  JAKARTA EE TUTORIAL.\n";
    public static String punto_18 ="*  PUNTO 18.  EJEMPLO DE CÓDIGO DE PERSISTENCIA.\n";
    public static String punto_19 ="*  PUNTO 19.  EMPAQUETADO DE COMPONENTES.\n";
    public static String punto_20 ="*  PUNTO 20.  TIPOS DE MÓDULOS J2EE.\n";
    public static String punto_21 ="*  PUNTO 21.  INFORMACIÓN ADICIONAL.\n";
    public static String punto_22 ="*  PUNTO 22.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_15 + """
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
        """ + punto_16 + """                        
        """ + punto_17 + """
        """ + punto_18 + """
        """ + punto_19 + """
        """ + punto_20 + """
        """ + punto_21 + """
        *
        """ + punto_22 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22" -> Recursos_15.recurso(menu); 
                    
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