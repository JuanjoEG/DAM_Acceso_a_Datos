package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
*   1/2                                          CONVERSI�N DE FICHEROS XML  
********************************************************************************************************************
   DOM  -->  DOCUMENT OBJECT MODEL.         SAX  -->  SIMPLE API FOR XML.      LIBRER�A: -->  javax.xml.parsers
   
   -LOS PARSERS DOM UTILIZAN LAS CLASES   -->   DocumentBuilderFactory Y DocumentBuilder.
            - DOS ATRIBUTOS A TENER EN CUENTA SON:
                    - ATRIBUTO DE VALIDACI�N (setValidating):
                      PONER A true PARA ASEGURARNOS QUE EL FICHERO QUE SE CARGUE EST� BIEN VALIDADO.
                    - ATRIBUTO 'IGNORAR LOS ELEMENTOS QUE CONTENGAN ESPACIOS EN BLANCO'
                      (setIgnoringElementContentWhitespace) PONER A true.

            - DESPU�S SE CREAR�A EL OBJETO DocumentBuilder, SOBRE EL DocumentBuilderFactory.
            - SE INSTANCIAR� EL FICHERO (File) INDICANDO LA RUTA DEL FICHERO A ANALIZAR.
            - POR �LTIMO SE CARGA EL FICHERO COMPLETO,
              EN UN OBJETO DE TIPO Document, APLICANDO M�TODO .parse()
              DEL OBJETO DocumentBuilder AL OBJETO File.
            - DE ESTA FORMA, EL FICHERO QUEDA ALMACENADO Y YA PODEMOS REALIZAR DIFERENTES ACCIONES AL OBJETO.
                               
   - LOS PARSERS SAX UTILIZAN LAS CLASES   -->   SAXParserFactory Y SAXParser.
            - TAMBI�N TIENEN EL ATRIBUTO DE VALIDACI�N (setValidating):
              PONER A true PARA ASEGURARNOS QUE EL FICHERO QUE SE CARGUE EST� BIEN VALIDADO.
            
            - DESPU�S SE CREAR�A EL OBJETO SAXParser, SOBRE EL SAXParserFactory.
            - SE INSTANCIAR� EL FICHERO (File) INDICANDO LA RUTA DEL FICHERO A ANALIZAR.
            - SE INVOCA EL M�TODO .parse() Y SE INSTANCIA UN Handle:
                       - EN LA DEFINICI�N DEL Handler SE INDICA:
                               - OPERACIONES: INICIAR ELEMENTO, OPERACIONES NODOS, INICIO/FIN DOC
                               - COMO ACTUAR� CON CADA UNO DE LOS ELEMENTOS/NODO.                       
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   2/2                                          CONVERSI�N DE FICHEROS XML  
********************************************************************************************************************
   INFORMACI�N ADICIONAL HANDLER PARA SAX
                             
    - ADAPTAREMOS (SOBREESCRIBIENDO: override) CUATRO DE LOS M�TODOS DE LA SUPERCLASE DefaultHandler,
      CADA UNO RESPONDIENDO A UN EVENTO:
           - characters(char[], int, int): RECIBE LOS CARACTERES QUE SE LEEN DEL FICHERO.
           - startDocument(): SE VA A UTILIZAR AL EMPEZAR A LEER EL FICHERO.
                   - NORMALMENTE SE UTILIZAR� PARA CONSTRUIR LA INSTANCIA DEL OBJETO
                     QUE RECIBIR� EL �RBOL QUE SE EMPEZAR� A LEER DEL FICHERO.
                   - TAMBI�N EXISTE UN endDocument().
           - startElement(): SE UTILIZAR� AL EMPEZAR EL PARSER A PROCESAR UN ELEMENTO.
                   - NORMALMENTE SE UTILIZAR� PARA CONSTRUIR LAS INSTANCIAS
                     DE LOS OBJETOS QUE RECIBIR�N LOS NODOS.
           - endElement(): SE UTILIZAR� AL TERMINAR EL PARSER DE LEER UN ELEMENTO.
                   - NORMALMENTE SE ASIGNAR� EL CONTENIDO DE LAS ETIQUETAS (tags)
                     A SUS RESPECTIVAS VARIABLES.
                             
    - IMPORTANTE: ES NECESARIO CONOCER LA ESTRUCTURA DEL FICHERO XML QUE VAMOS A LEER.

********************************************************************************************************************
*  0. SALIR.
********************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                  
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