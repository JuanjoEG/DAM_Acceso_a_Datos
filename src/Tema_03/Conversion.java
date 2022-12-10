package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Conversion {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   1/2                                          CONVERSIÓN DE FICHEROS XML  
********************************************************************************************************************
   DOM  -->  DOCUMENT OBJECT MODEL.         SAX  -->  SIMPLE API FOR XML.      LIBRERÍA: -->  javax.xml.parsers
   
   -LOS PARSERS DOM UTILIZAN LAS CLASES   -->   DocumentBuilderFactory Y DocumentBuilder.
            - DOS ATRIBUTOS A TENER EN CUENTA SON:
                    - ATRIBUTO DE VALIDACIÓN (setValidating):
                      PONER A true PARA ASEGURARNOS QUE EL FICHERO QUE SE CARGUE ESTÉ BIEN VALIDADO.
                    - ATRIBUTO 'IGNORAR LOS ELEMENTOS QUE CONTENGAN ESPACIOS EN BLANCO'
                      (setIgnoringElementContentWhitespace) PONER A true.

            - DESPUÉS SE CREARÍA EL OBJETO DocumentBuilder, SOBRE EL DocumentBuilderFactory.
            - SE INSTANCIARÁ EL FICHERO (File) INDICANDO LA RUTA DEL FICHERO A ANALIZAR.
            - POR ÚLTIMO SE CARGA EL FICHERO COMPLETO,
              EN UN OBJETO DE TIPO Document, APLICANDO MÉTODO .parse()
              DEL OBJETO DocumentBuilder AL OBJETO File.
            - DE ESTA FORMA, EL FICHERO QUEDA ALMACENADO Y YA PODEMOS REALIZAR DIFERENTES ACCIONES AL OBJETO.
                               
   - LOS PARSERS SAX UTILIZAN LAS CLASES   -->   SAXParserFactory Y SAXParser.
            - TAMBIÉN TIENEN EL ATRIBUTO DE VALIDACIÓN (setValidating):
              PONER A true PARA ASEGURARNOS QUE EL FICHERO QUE SE CARGUE ESTÉ BIEN VALIDADO.
            
            - DESPUÉS SE CREARÍA EL OBJETO SAXParser, SOBRE EL SAXParserFactory.
            - SE INSTANCIARÁ EL FICHERO (File) INDICANDO LA RUTA DEL FICHERO A ANALIZAR.
            - SE INVOCA EL MÉTODO .parse() Y SE INSTANCIA UN Handle:
                       - EN LA DEFINICIÓN DEL Handler SE INDICA:
                               - OPERACIONES: INICIAR ELEMENTO, OPERACIONES NODOS, INICIO/FIN DOC
                               - COMO ACTUARÁ CON CADA UNO DE LOS ELEMENTOS/NODO.                       
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   2/2                                          CONVERSIÓN DE FICHEROS XML  
********************************************************************************************************************
   INFORMACIÓN ADICIONAL HANDLER PARA SAX
                             
    - ADAPTAREMOS (SOBREESCRIBIENDO: override) CUATRO DE LOS MÉTODOS DE LA SUPERCLASE DefaultHandler,
      CADA UNO RESPONDIENDO A UN EVENTO:
           - characters(char[], int, int): RECIBE LOS CARACTERES QUE SE LEEN DEL FICHERO.
           - startDocument(): SE VA A UTILIZAR AL EMPEZAR A LEER EL FICHERO.
                   - NORMALMENTE SE UTILIZARÁ PARA CONSTRUIR LA INSTANCIA DEL OBJETO
                     QUE RECIBIRÁ EL ÁRBOL QUE SE EMPEZARÁ A LEER DEL FICHERO.
                   - TAMBIÉN EXISTE UN endDocument().
           - startElement(): SE UTILIZARÁ AL EMPEZAR EL PARSER A PROCESAR UN ELEMENTO.
                   - NORMALMENTE SE UTILIZARÁ PARA CONSTRUIR LAS INSTANCIAS
                     DE LOS OBJETOS QUE RECIBIRÁN LOS NODOS.
           - endElement(): SE UTILIZARÁ AL TERMINAR EL PARSER DE LEER UN ELEMENTO.
                   - NORMALMENTE SE ASIGNARÁ EL CONTENIDO DE LAS ETIQUETAS (tags)
                     A SUS RESPECTIVAS VARIABLES.
                             
    - IMPORTANTE: ES NECESARIO CONOCER LA ESTRUCTURA DEL FICHERO XML QUE VAMOS A LEER.

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