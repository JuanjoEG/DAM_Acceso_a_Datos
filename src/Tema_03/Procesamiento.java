package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Procesamiento {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   1/2                           PROCESAMIENTO DE XML: XPATH  
********************************************************************************************************************
   CARACTER�STICAS LIBRER�A XPath:
                               
        - XPATH ES UNA RECOMENDACI�N OFICIAL DEL CONSORCIO DEL WORLD WIDE WEB (W3C).
          COMO FORMA DE B�SQUEDA DE INFORMACI�N A TRAV�S DE UN DOCUMENTO XML.
                - SE UTILIZA PARA RECORRER ELEMENTOS Y ATRIBUTOS DE UN DOCUMENTO XML.
                - PROPORCIONA VARIOS TIPOS DE EXPRESIONES QUE PUEDEN USARSE
                  PARA CONSULTAR INFORMACION RELEVANTE DEL FICHERO XML.
                               
        - ALGUNAS DE LAS CARACTER�STICAS PRINCIPALES DE XPATH SON:
                               
                - PERMITE LA DEFINICI�N DE ESTRUCTURAS: DEFINE LAS PARTES DE UN DOCUMENTO XML:
                        - ELEMENTO, ATRIBUTOS, TEXTOS, INSTRUCCIONES DE PROCESAMIENTO,
                          COMENTARIOS Y NODOS DEL DOCUMENTO.
                               
                - SOPORTA EXPRESIONES: POSEE EXPRESIONES POTENTES PARA EL MANEJO DE FICHEROS.
                        - POR EJEMPLO SELECCIONAR NODOS A LISTAS DE NODOS EN FICHEROS XML.
                               
                - TIENE FUNCIONES EST�NDAR: BRINDA UNA LIBRER�A MUY COMPLETA DE FUNCIONALIDADES EST�NDAR.
                        - MANIPULACI�N DE STRING, VALORES NUM�RICOS, FECHAS, COMPARACIONES,
                          SECUENCIAS, VALORES BOOLEANOS, ETC...
                               
********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   2/2                           PROCESAMIENTO DE XML: XPATH  
********************************************************************************************************************
   GUI�N UTIZACI�N LIBRER�A XPath    -->    PASOS A UTILIZAR:
        
       1.- IMPORTAR LOS PAQUETES RELACIONADOS CON LA LIBRER�A XPath.
       2.- CREAR UN OBJETO DE LA CLASE DocumentBuieder.
       3.- CARGAR UN FICHERO O UN FLUJO DE DATOS.
       4.- CREAR UN OBJETO XPath Y UNA EXPRESI�N.
               - LA INSTANCIACI�N DEL OBJETO XPath LA REALIZAMOS DE LA SIGUIENTE FORMA:
                    XPath xPath = XPathFactory.newInstance().newXPath();
       5.- REALIZAR UNA COMPILACI�N DE DICHA EXPRESI�N CON EL M�TODO xPath.compile().
       6.- CON xPath.evaluate() OBTENDREMOS UNA LISTA DE LOS NODOS DE DICHAS EXPRESI�N.
       7.- REALIZAR UNA ITERACI�N POR LO GENERAL DE LA LISTA DE NODOS.
       8.- EXAMINAR LOS ATRIBUTOS.
       9.- EXAMINAR LOS SUB-ELEMENTOS.

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