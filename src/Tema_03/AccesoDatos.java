package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class AccesoDatos {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   1/2                           ACCESO A DATOS EN FICHEROS XML CON DOM Y SAX  
********************************************************************************************************************
   DOM  -->  DOCUMENT OBJECT MODEL.
   SAX  -->  SIMPLE API FOR XML.
                               
   DOM Y SAX SON PARSERS O ANALIZADORES: HERRAMIENTAS PARA LEER EL TIPO ESPECIAL DE FICHEROS XML,
   Y QUE VERIFICAN SI SON DOCUMENTOS XML VÁLIDOS SINTACTICAMENTE:
               
           - DOM CARGA EL FICHERO HTML O XML COMPLETO.
                   - VENTAJAS:
                            - UNA VEZ INTRODUCIMOS EL FICHERO,
                              TENEMOS TODO EL ÁRBOL YA FORMADO DE LOS NODOS Y DEMÁS OBJETOS,
                              DISPONIBLE Y PREPARADO PARA TRABAJAR.
                   - INCONVENIENTES:
                            - SI EL FICHERO ES MUY GRANDE, OCUPARÁ MUCHO ESPACIO EN LA MEMORIA.
                            - AL GESTIONAR TODA LA INFORMACIÓN, ES MÁS LENTO Y MENOS VERSÁTIL.
                               
           - SAX CARGA EL NODO O EL EVENTO ACTUAL.
             REQUIERE INTRODUCIR LÍNEAS DE PROGRAMACIÓN PARA OBTENER PARTES DETERMINADAS DE LOS FICHEROS.
                   - VENTAJAS:
                            - OCUPA MENOS MEMORIA, TIENE EN MEMORIA SOLO UNA PARTE DEL FICHERO.
                            - ES MÁS RÁPIDO, MÁS FUNCIONAL Y VERSÁTIL.
                   - INCONVENIENTES:
                            - AL GESTIONAR PARTE DE LA INFORMACIÓN, ES MENOS POTENTE.
    
           - EJEMPLOS DE USO RECOMENDABLE:
                   
                   - DOM: CUANDO TENGAMOS EL OBJETIVO CLARO SOBRE EL QUE QUEREMOS TRABAJAR,
                          A PARTIR DE UN ÁRBOL CREADO EN MEMORIA.
                               
                   - SAX: RECORRER SECUENCIALMENTE LOS ELEMENTOS DE FICHEROS XML
                          MUY GRANDES Y REALIZAR CIERTAS OPERACIONES.
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   2/2                           ACCESO A DATOS EN FICHEROS XML CON DOM Y SAX  
********************************************************************************************************************

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

********************************************************************************************************************
*  0. SALIR.
********************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                  
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