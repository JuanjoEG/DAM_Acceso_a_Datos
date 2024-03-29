package Principal_Main;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Main {

    public static String curso ="*  T�CNICO EN DESARROLLO DE APLICACIONES MULTIPLATAFORMA.\n";
    public static String asignatura ="*  ACCESO A DATOS\n";
    
    public static String tema_01 ="*  TEMA  1.  INTRODUCCI�N AL MANEJO DE FICHEROS.\n";
    public static String tema_02 ="*  TEMA  2.  FLUJOS.\n";
    public static String tema_03 ="*  TEMA  3.  TRABAJOS CON FICHEROS XML.\n";
    public static String tema_04 ="*  TEMA  4.  MANEJO DE CONECTORES I.\n";
    public static String tema_05 ="*  TEMA  5.  MANEJO DE CONECTORES II.\n";
    public static String tema_06 ="*  TEMA  6.  MANEJO DE CONECTORES III: SENTENCIAS.\n";
    public static String tema_07 ="*  TEMA  7.  EL MAPEO OBJETO-RELACIONAL.\n";
    public static String tema_08 ="*  TEMA  8.  EXPLORACI�N DEL MAPEO OBJETO-RELACIONAL.\n";
    public static String tema_09 ="*  TEMA  9.  BASES DE DATOS ORIENTADAS A OBJETOS.\n";
    public static String tema_10 ="*  TEMA 10.  BASES DE DATOS OBJETO RELACIONALE.\n";
    public static String tema_11 ="*  TEMA 11.  INTRODUCCI�N A LAS BASES DE DATOS NO-SQL.\n";
    public static String tema_12 ="*  TEMA 12.  OPERACIONES CON BASES DE DATOS NO-SQL.\n";
    public static String tema_13 ="*  TEMA 13.  EXPLOTACI�N DE LAS BASES DE DATOS NO-SQL.\n";
    public static String tema_14 ="*  TEMA 14.  GESTI�N DE BASES DE DATOS NATIVAS XML.\n";
    public static String tema_15 ="*  TEMA 15.  PROGRAMACI�N DE COMPONENTES DE ACCESO A DATOS.\n";

    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
        
        *******************************************************************
        """ + curso + """
        *******************************************************************
        """ + asignatura + """
        *******************************************************************
        *
        """ + tema_01 + """                        
        """ + tema_02 + """
        """ + tema_03 + """                        
        """ + tema_04 + """
        """ + tema_05 + """                        
        """ + tema_06 + """
        """ + tema_07 + """                        
        """ + tema_08 + """
        """ + tema_09 + """                        
        """ + tema_10 + """
        """ + tema_11 + """                        
        """ + tema_12 + """
        """ + tema_13 + """                        
        """ + tema_14 + """
        """ + tema_15 + """ 
        *
        *******************************************************************
        *  0. SALIR.
        *******************************************************************
                               
                               """);
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1" -> Tema_01.T_01.main(args);
                    case "2" -> Tema_02.T_02.main(args);
                    case "3" -> Tema_03.T_03.main(args);
                    case "4" -> Tema_04.T_04.main(args);
                    case "5" -> Tema_05.T_05.main(args);
                    case "6" -> Tema_06.T_06.main(args);
                    case "7" -> Tema_07.T_07.main(args);
                    case "8" -> Tema_08.T_08.main(args);
                    case "9" -> Tema_09.T_09.main(args);
                    case "10" -> Tema_10.T_10.main(args);
                    case "11" -> Tema_11.T_11.main(args);
                    case "12" -> Tema_12.T_12.main(args);
                    case "13" -> Tema_13.T_13.main(args);
                    case "14" -> Tema_14.T_14.main(args);
                    case "15" -> Tema_15.T_15.main(args);
                    
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
    public static void esperar(int segundos) {
        try {            
            Thread.sleep(segundos);
        } catch (Exception e) {
            miError(e);
        }
    }
    
    public static void meterEspacios(int espacios) {
    
        for (int i=0; i<espacios; i++) {
                System.out.println("");
            }
    
    }
    
    public static void continuar() {
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.print("Seleccione la opci�n '0': ");
            menu = teclaStr.nextLine();
            meterEspacios(25);
            if (!"0".equals(menu)) {
                miDefault();
            }
        } while (!"0".equals(menu));
    }
    
    public static void miDefault() {
    
        meterEspacios(25);
        System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
        meterEspacios(15);
        esperar(1500);
        meterEspacios(25);
    }
    
    public static String miTry () {
    
        Scanner teclaStr = new Scanner(System.in, "UTF-8");
        System.out.print("Seleccione una opci�n: ");
        String menu = teclaStr.nextLine();
        meterEspacios(25);
        return menu;
    }
    
    public static String miTryRecursos() {
    
        Scanner teclaStr = new Scanner(System.in, "UTF-8");
        System.out.print("Seleccione la opci�n '0': ");
        String menu = teclaStr.nextLine();
        meterEspacios(25);
        switch (menu) {
            case "0" -> {}
            default -> {                
                miDefault();
            }
        }
        return menu;
    }
    
    public static void miError(Exception e) {
    
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("Error: " + e.toString());
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("MENSAJE " + e.getMessage());
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("La Excepci�n es: " + e.getClass());
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
    }
}