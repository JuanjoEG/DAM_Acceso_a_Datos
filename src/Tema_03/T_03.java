package Tema_03;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_03 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  ACCESO A DATOS EN FICHEROS XML CON DOM Y SAX.\n";
    public static String punto_03 ="*  PUNTO  3.  ACCESO A DATOS EN FICHEROS XML CON DOM Y SAX. TABLA.\n";
    public static String punto_04 ="*  PUNTO  4.  CONVERSIÓN DE FICHEROS XML.\n";
    public static String punto_05 ="*  PUNTO  5.  CONVERSIÓN DE FICHEROS XML. INFORMACIÓN ADICIONAL.\n";
    public static String punto_06 ="*  PUNTO  6.  PROCESAMIENTO DE XML: XPATH.\n";
    public static String punto_07 ="*  PUNTO  7.  EXCEPCIONES EN JAVA Y TIPOS.\n";
    public static String punto_08 ="*  PUNTO  8.  EXCEPCIONES. LA CLASE THROWABLE.\n";
    public static String punto_09 ="*  PUNTO  9.  EXCEPCIONES. TABLA I.\n";
    public static String punto_10 ="*  PUNTO 10.  EXCEPCIONES. DETECCIÓN Y TRATAMIENTO.\n";
    public static String punto_11 ="*  PUNTO 11.  EXCEPCIONES. AYUDAS DEL ENTORNO DE DESARROLLO INTEGRADO (IDE).\n";
    public static String punto_12 ="*  PUNTO 12.  EXCEPCIONES ASOCIADAS A CLASES XML.\n";
    public static String punto_13 ="*  PUNTO 13.  EXCEPCIONES. TABLA II.\n";
    public static String punto_14 ="*  PUNTO 14.  EXCEPCIONES. TABLA III.\n";
    public static String punto_15 ="*  PUNTO 15.  PRUEBAS Y DOCUMENTACIÓN JUnit I.\n";
    public static String punto_16 ="*  PUNTO 16.  PRUEBAS Y DOCUMENTACIÓN JUnit II.\n";
    public static String punto_17 ="*  PUNTO 17.  PRUEBAS Y DOCUMENTACIÓN JUnit III.\n";
    public static String punto_18 ="*  PUNTO 18.  PRUEBAS Y DOCUMENTACIÓN JUnit IV.\n";
    public static String punto_19 ="*  PUNTO 19.  EJEMPLO. Parsers DOM.\n";
    public static String punto_20 ="*  PUNTO 20.  EJEMPLO. Parsers SAX.\n";
    public static String punto_21 ="*  PUNTO 21.  EJEMPLO. Parsers XPath.\n";
    public static String punto_22 ="*  PUNTO 22.  EJEMPLO. Prueba Unitaria.\n";
    public static String punto_23 ="*  PUNTO 23.  T O D O.\n";
    
    public static void main(String[] args) {
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_03 + """
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
        """ + punto_08 + """
        """ + punto_09 + """                        
        """ + punto_10 + """
        """ + punto_11 + """
        """ + punto_12 + """                        
        """ + punto_13 + """
        """ + punto_14 + """
        *
        """ + punto_15 + """
        """ + punto_16 + """
        """ + punto_17 + """
        """ + punto_18 + """
        *
        """ + punto_19 + """
        """ + punto_20 + """                        
        """ + punto_21 + """
        """ + punto_22 + """
        *
        """ + punto_23 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "23" -> Recursos_03.recurso(menu); 
                    case "19" -> Ejemplos_T03.ParsersDOM.main(args);
                    case "20" -> Ejemplos_T03.ParsersSAX.main(args);
                    case "21" -> Ejemplos_T03.ParsersXPath.main(args);
                    case "22" -> Ejemplos_T03.PruebaUnitaria.main(args);
                    
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