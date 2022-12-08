package Tema_03;


import static Clases.Utilidades.continuar;
import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
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
                               
        *******************************************************************************************************
        *  TEMA 03                                       TRABAJOS CON FICHEROS XML                            *
        *******************************************************************************************************
        *                                                                                                     *
        *  1. TABLA DE HERRAMIENTAS PARA LA LECTURA DE FICHEROS XML.                                          *
        *  2. EXCEPCIONES.                                                                                    *
        *  3. PRUEBAS Y DOCUMENTACIÓN JUnit                                                                   *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *                EJEMPLOS:                                                                            *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  10. Parsers DOM                                                                                    *
        *  11. Parsers SAX                                                                                    *
        *  12. Parsers XPath                                                                                  *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        System.out.println("""
                                           
                            *************************************************************************************************
                            *                       javax.xml.parsers  -->  LIBRERÍAS DE HERRAMIENTAS XML                   *
                            *************************************************************************************************
                            *                     SAX                       *                     DOM                       *
                            *************************************************************************************************
                            * BASADO EN EVENTOS                             * CARGA EL FICHERO EN MEMORIA                   *
                            *************************************************************************************************
                            * VA ANALIZANDO NODO POR NODO                   * BÚSQUEDA DE TAGS HACIA DELANTE Y HACIA DETRÁS *
                            *************************************************************************************************
                            * SIN RESTRICCIONES DE MEMORIA                  * ESTRUCTURA DE ÁRBOL                           *
                            *************************************************************************************************
                            * RAPIDEZ EN TIEMPO DE EJECUCIÓN                * MÁS LENTO EN TIEMPO DE EJECUCIÓN              *
                            *************************************************************************************************
                            * ES DE SÓLO LECTURA                            * SE PUEDEN INSERTAR O ELIMINAR NODOS           *
                            *************************************************************************************************
                            *                                               *  DataInputStream                              *
                            *                                               *  DataOutputStream                             *
                            *                                               *  PrintStream                                  *
                            *************************************************************************************************
                            *  SAXParserFactory                             *  DocumentBuilderFactoty                       *
                            *  SAXParser                                    *  DocumentBuilder                              *
                            *************************************************************************************************
                            *  setValidating -> true    ATRIB. VALIDACÓN    *  setValidating -> true    ATRIB. VALIDACÓN    *
                            *                                               *  setIgnoringElementContentWhitespace -> true  *
                            *************************************************************************************************
                                           
                                           """);
                    continuar();
                    }
                    
                    
                    case "2" -> Tema_03.Excepciones.main(args);
                    case "3" -> {}
                    case "10" -> Tema_03.ParsersDOM.main(args);
                    case "11" -> Tema_03.ParsersSAX.main(args);
                    case "12" -> Tema_03.ParsersXPath.main(args);
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