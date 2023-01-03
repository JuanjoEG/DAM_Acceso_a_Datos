package Tema_02;

import static Principal_Main.Main.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class MenuEjemplos {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 02                      FLUJOS  -  STREAMS                                *
        ***********************************************************************************
        *                                   EJEMPLOS:                                     *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * 10. FLUJOS BASADOS EN TUBERÍAS.                                                 *
        * 11. DE FLUJOS BASADOS EN ARRAYS READER.                                         *        
        * 12. DE FLUJOS BASADOS EN ARRAYS READER WRITER.                                  *
        * 13. DE FLUJOS ANÁLISIS TOKEN.                                                   *
        * 14. DE FLUJOS ANÁLISIS TOKEN2.                                                  *
        * 15. DE FLUJOS ANÁLISIS PUSHBACK.                                                *
        * 16. DE FLUJOS ANÁLISIS LINE NUMBER.                                             *
        * 17. DE FLUJOS ANÁLISIS INFORMACIÓN WRITE.                                       *
        * 18. DE FLUJOS ANÁLISIS INFORMACIÓN READ.                                        *
        *                                                                                 *
        ***********************************************************************************
        *  0. SALIR.                                                                      *
        ***********************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "10" -> Ejemplos_T02.FlujosTuberias.main(args);
                    case "11" -> Ejemplos_T02.FlujosArraysReader.main(args);
                    case "12" -> Ejemplos_T02.FlujosArraysReaderWriter.main(args);
                    case "13" -> Ejemplos_T02.FlujosAnalisisTokenizer.main(args);
                    case "14" -> Ejemplos_T02.FlujosAnalisisTokenizer2.main(args);
                    case "15" -> Ejemplos_T02.FlujosAnalisisPushback.main(args);
                    case "16" -> Ejemplos_T02.FlujosAnalisisLineNumber.main(args);
                    case "17" -> Ejemplos_T02.FlujosAnalisisInformacionWrite.main(args);
                    case "18" -> Ejemplos_T02.FlujosAnalisisInformacionRead.main(args);
                    
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