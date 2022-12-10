package Tema_03;


import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_03 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ********************************************************************************************************************
        *  TEMA 03                                       TRABAJOS CON FICHEROS XML
        ********************************************************************************************************************
        *   EL XML ES, CON DIFERENCIA, EL FORMATO MÁS UTILIZADO PARA EL INTERCAMBIO DE DATOS ENTRE APLICACIONES.
        *   ES FUNDAMENTAL SABER TRABAJAR CON ESTE FORMATO, SUS TIPOLOGÍAS,
        *   Y LOS MÉTODOS Y CLASES A UTILIZAR EN EL DESARROLLO DE APLICACIONES O UTILIDADES.
        *                                                                                                 
        *  1. ACCESO A DATOS EN FICHEROS XML CON DOM Y SAX.
        *  2. CONVERSIÓN DE FICHEROS XML.
        *  3. PROCESAMIENTO DE XML: XPATH.
        *  4. EXCEPCIONES.                                                                   
        *  5. PRUEBAS Y DOCUMENTACIÓN JUnit.
        *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *                EJEMPLOS:                                                                     
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  10. Parsers DOM                                                                         
        *  11. Parsers SAX                                                                                 
        *  12. Parsers XPath
        *  13. Prueba Unitaria.
        ********************************************************************************************************************
        *  0. SALIR.                                                                                       
        ********************************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    case "1" -> AccesoDatos.main(args);
                    case "2" -> Conversion.main(args);
                    case "3" -> Procesamiento.main(args);
                    case "4" -> Excepciones.main(args);
                    case "5" -> PruebasDocument.main(args);
                    case "10" -> Ejemplos_T03.ParsersDOM.main(args);
                    case "11" -> Ejemplos_T03.ParsersSAX.main(args);
                    case "12" -> Ejemplos_T03.ParsersXPath.main(args);
                    case "13" -> Ejemplos_T03.PruebaUnitaria.main(args);
                    
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