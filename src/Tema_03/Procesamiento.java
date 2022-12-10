package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
   CARACTERÍSTICAS LIBRERÍA XPath:
                               
        - XPATH ES UNA RECOMENDACIÓN OFICIAL DEL CONSORCIO DEL WORLD WIDE WEB (W3C).
          COMO FORMA DE BÚSQUEDA DE INFORMACIÓN A TRAVÉS DE UN DOCUMENTO XML.
                - SE UTILIZA PARA RECORRER ELEMENTOS Y ATRIBUTOS DE UN DOCUMENTO XML.
                - PROPORCIONA VARIOS TIPOS DE EXPRESIONES QUE PUEDEN USARSE
                  PARA CONSULTAR INFORMACION RELEVANTE DEL FICHERO XML.
                               
        - ALGUNAS DE LAS CARACTERÍSTICAS PRINCIPALES DE XPATH SON:
                               
                - PERMITE LA DEFINICIÓN DE ESTRUCTURAS: DEFINE LAS PARTES DE UN DOCUMENTO XML:
                        - ELEMENTO, ATRIBUTOS, TEXTOS, INSTRUCCIONES DE PROCESAMIENTO,
                          COMENTARIOS Y NODOS DEL DOCUMENTO.
                               
                - SOPORTA EXPRESIONES: POSEE EXPRESIONES POTENTES PARA EL MANEJO DE FICHEROS.
                        - POR EJEMPLO SELECCIONAR NODOS A LISTAS DE NODOS EN FICHEROS XML.
                               
                - TIENE FUNCIONES ESTÁNDAR: BRINDA UNA LIBRERÍA MUY COMPLETA DE FUNCIONALIDADES ESTÁNDAR.
                        - MANIPULACIÓN DE STRING, VALORES NUMÉRICOS, FECHAS, COMPARACIONES,
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
   GUIÓN UTIZACIÓN LIBRERÍA XPath    -->    PASOS A UTILIZAR:
        
       1.- IMPORTAR LOS PAQUETES RELACIONADOS CON LA LIBRERÍA XPath.
       2.- CREAR UN OBJETO DE LA CLASE DocumentBuieder.
       3.- CARGAR UN FICHERO O UN FLUJO DE DATOS.
       4.- CREAR UN OBJETO XPath Y UNA EXPRESIÓN.
               - LA INSTANCIACIÓN DEL OBJETO XPath LA REALIZAMOS DE LA SIGUIENTE FORMA:
                    XPath xPath = XPathFactory.newInstance().newXPath();
       5.- REALIZAR UNA COMPILACIÓN DE DICHA EXPRESIÓN CON EL MÉTODO xPath.compile().
       6.- CON xPath.evaluate() OBTENDREMOS UNA LISTA DE LOS NODOS DE DICHAS EXPRESIÓN.
       7.- REALIZAR UNA ITERACIÓN POR LO GENERAL DE LA LISTA DE NODOS.
       8.- EXAMINAR LOS ATRIBUTOS.
       9.- EXAMINAR LOS SUB-ELEMENTOS.

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