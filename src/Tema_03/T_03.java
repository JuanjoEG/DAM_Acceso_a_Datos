package Tema_03;


import static Clases.Utilidades.continuar;
import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
        *  3. PRUEBAS Y DOCUMENTACI�N JUnit                                                                   *
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
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        System.out.println("""
                                           
                            *************************************************************************************************
                            *                       javax.xml.parsers  -->  LIBRER�AS DE HERRAMIENTAS XML                   *
                            *************************************************************************************************
                            *                     SAX                       *                     DOM                       *
                            *************************************************************************************************
                            * BASADO EN EVENTOS                             * CARGA EL FICHERO EN MEMORIA                   *
                            *************************************************************************************************
                            * VA ANALIZANDO NODO POR NODO                   * B�SQUEDA DE TAGS HACIA DELANTE Y HACIA DETR�S *
                            *************************************************************************************************
                            * SIN RESTRICCIONES DE MEMORIA                  * ESTRUCTURA DE �RBOL                           *
                            *************************************************************************************************
                            * RAPIDEZ EN TIEMPO DE EJECUCI�N                * M�S LENTO EN TIEMPO DE EJECUCI�N              *
                            *************************************************************************************************
                            * ES DE S�LO LECTURA                            * SE PUEDEN INSERTAR O ELIMINAR NODOS           *
                            *************************************************************************************************
                            *                                               *  DataInputStream                              *
                            *                                               *  DataOutputStream                             *
                            *                                               *  PrintStream                                  *
                            *************************************************************************************************
                            *  SAXParserFactory                             *  DocumentBuilderFactoty                       *
                            *  SAXParser                                    *  DocumentBuilder                              *
                            *************************************************************************************************
                            *  setValidating -> true    ATRIB. VALIDAC�N    *  setValidating -> true    ATRIB. VALIDAC�N    *
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
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}