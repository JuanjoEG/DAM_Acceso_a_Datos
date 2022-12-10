package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Excepciones {
    
    public static void main(String[] args) {
        
        String menu;
        do {            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""  
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   1/8                                                EXCEPCIONES
********************************************************************************************************************
                               
   EXCEPCIONES EN JAVA Y TIPOS:
                               
        - EXCEPCIÓN: EVENTO QUE DURANTE LA EJECUCIÓN DE UN PROGRAMA,
            INTERRUMPE EL FLUJO DEL MISMO POR ALGÚN MOTIVO.
                   - MOTIVOS: INTRODUCCIÓN DE DATOS ERRÓNEOS (O DIFERENTES DE LO ESPERADO),
                              FICHERO NO ENCONTRADO, CORTES DE CONEXIÓN O PROBLEMAS DE ACCESO A MEDIOS.
                   - ORIGEN:  ALGUNAS SON OCASIONADAS POR EL USUARIO, OTRAS POR EL DESARROLLADOR,
                              Y OTRAS POR EL ESTADO DE LOS RECURSOS FÍSICOS.
                               
        - LAS EXCEPCIONES SE DIVIDEN EN 3 CATEGORÍAS:
                               
                   - EXCEPCIONES CON CHEQUEO (checked exception): 
                              NOTIFICADAS POR EL COMPILADOR DURANTE LA COMPILACIÓN, NO PUEDEN SER IGNORADAS.
                               
                   - EXCEPCIONES SIN CHEQUEO (unchecked exceptions) O RuntimeExcepcions:
                              SE ORIGINAN EN TIEMPO DE EJECUCIÓN.
                                    - INCLUYE ERRORES DE PROGRAMACIÓN, O MAL USO DE UNA API DE CÓDIGO.
                                    - ESTE TIPO DE EXCEPCIONES SON IGNORADAS EN TIEMPO DE COPILACIÓN.
                               
                   - ERRORES: ESCAPAN DEL CONTROL DEL USUARIO O DEL DESARROLLADOR.
                                    - GENERALMENTE SE IGNORAN TANTO EN EL CÓDIGO COMO EN TIEMPO DE COMPILACIÓN,
                                      PORQUE RARA VEZ SE PUEDE HACER ALGO AL RESPECTO.
                                    - EJEMPLO: Stack overflow SI HAY DESBORDAMIENTO DE PILA,
                                      Y DIFICILMENTE VAMOS A PODER HACER ALGO PARA SOLUCIONARLO.
                                    - NO SON DEL TODO EXCEPCIONES.
                               
        - EN EL TRABAJO CON FICHEROS, Y POR TANTO CON XML, ES IMPRESCINDIBLE HACER TRATAMIENTO DE EXCEPCIONES.                               
                               
********************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println("""  
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   2/8                                                EXCEPCIONES
********************************************************************************************************************
                                                            
   LA CLASE THROWABLE

        - LA CLASE Throwable ES LA SUPERCLASE DE TODOS LOS ERRORES Y EXCEPCIONES EN EL LENGUAJE JAVA.
        - ES LA CLASE RAÍZ DE LA JERARQUÍA DE EXCEPCIONES DE JAVA Y ES HEREDADA POR DOS SUBCLASES:
               - Exception
               - Error
        - IMPLEMENTA LA INTERFAZ SERIALIZABLE.
        - SUS CLASES DIRECTAS CONOCIDAS DE Throwable SON Error Y Exception.
        - CONTIENE UNA INSTANTÁNEA DE LA PILA DE EJECUCIÓN DE SU HILO EN EL MOMENTO DE SU CREACIÓN.
        - TAMBIÉN PUEDE CONTENER UNA STRING DE MENSAJE QUE BRINDA MÁS INFORMACIÓN SOBRE EL ERROR.
                                                            
   SERIALIZABLE:
        - PARA QUE UN PROGRAMA JAVA PUEDA CONVERTIR UN OBJETO EN UN MONTÓN DE BYTES Y PUEDA LUEGO RECUPERARLO,
          EL OBJETO NECESITA SER SERIALIZABLE.
        - AL PODER CONVERTIR EL OBJETO A BYTES, ESE OBJETO SE PUEDE ENVIAR A TRAVES DE RED, GUARDADO EN UN FICHERO, ETC...
          Y DESPUÉS RECONSTRUIRLO AL OTRO LADO DE LA RED, LEERLO DEL FICHERO, ETC...
        - PARA QUE UN OBJETO SEA SERIALIZABLE BASTA CON QUE IMPLEMENTE LA INTERFAZ Serializable.                             
                               
********************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   3/8                                                EXCEPCIONES
********************************************************************************************************************                      
                               
        ************************************************************************************
        *                                EXCEPCIONES                                       *
        ************************************************************************************
        *  TRES TIPOS:                                                                     *
        *                                                                                  *
        *       - CHECKED EXCEPTIONS (CON CHEQUEO)                                         *
        *                            DURANTE LA COMPILACIÓN                                *
        *                                                                                  *
        *       - UNCHECKED EXCEPTIONS (SIN CHEQUEO)  RunTimeExceptionS                    *
        *                            EN TIEMPO DE EJECUCIÓN                                *
        *                                                                                  *
        *       - ERRORES (FUERA DEL CONTROL DEL USUARIO Y DESARROLLADOR)                  *
        *                                                                                  *
        ************************************************************************************
        *   TODAS HEREDAN DE LA CLASE  -->  Throwable  (SUPERCLASE)                        *
        *                                    | Exception  (SUBCLASE)                       *
        *                                    | Error      (SUBCLASE)                       *
        *                                                                                  *
        *   Throwable IMPLEMENTA LA INTERFAZ SERIALIZABLE                                  *
        ************************************************************************************
        *   LOS MÉTODOS PRINCIPALES PARA GESTIONAR EXCEPCIONE:                             *
        *                                                                                  *
        *   getMessage()       -> DEVUELVE MENSAJE DETALLADO SOBRE LA EXCEPCIÓN            *
        *   getCause()         -> DEVELVE LA CAUSA EN UN OBJETO Throwable                  *
        *   toString()         -> DEVUELVE EL NOMBRE DE LA CLASE + getMessage()            *
        *   printStackTrace()  -> IMPRIME toString() + ERROR DE LA PILA                    *
        *   getStackTrace()    -> DEVUELVE UN ARRAY CON LOS ELEMENTOS DE LA PILA           *
        *   fillInstackTrace() -> RELLENA LA PILA DEL OBJETO Throwable CON LA PILA ACTUAL  *
        ************************************************************************************
                               
********************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   4/8                                                EXCEPCIONES
********************************************************************************************************************
                                                            
    DETECCIÓN Y TRATAMIENTO     try/catch/finally Y throw                                                        
                                                            
            PARA PODER CAPTURAR Y TRATAR UNA EXCEPCIÓN, SE INCLUYE EN BLOQUES DE CÓDIGO try/catch.

                 - ESTE BLOQUE SE COLOCA ALREDEDOR DEL CÓDIGO QUE CREEMOS QUE PUDIERA GENERAR UNA EXCEPCIÓN.

                 - EL CÓDIGO INCLUIDO DENTRO DE UN BLOQUE try/catch SE CONOCE COMO CÓDIGO PROTEGIDO.

                 - EL CÓDIGO QUE ES PROPENSO A EXCEPCIONES SE COLOCA A CONTINUACIÓN DE LA SENTENCIA try.

                 - CUANDO SE LANZA UNA EXCEPCIÓN, ES CAPTURADA POR EL BLOQUE catch ASOCIADA A ELLA.
                        - UN BLOQUE catch IMPLICA DECLARAR UN TIPO DE LA EXCEPCIÓN QUE QUERAMOS CAPTURAR.

                 - CADA BLOQUE try PUEDE IR SEGUIDO DE UNO O VARIOS BLOQUES catch Y/O DE UN BLOQUE finally.
                        - UN BLOQUE finally LO ENCONTRAMOS JUSTO DESPUÉS DEL BLOQUE try O DESPUÉS DEL catch.
                                 - ES UN CÓDIGO QUE SE EJECUTA SIEMPRE, INDEPENDIENTEMENTE SI PASA POR ÉSTOS.
                                 - SUELEN USARSE PARA LIMPIEZA O LIBERACIÓN DE RECURSOS DE MEMORIA.

            OTRA OPCIÓN ES AÑADIR EL TIPO DE EXCEPCIÓN QUE CREEMOS SE PUEDE PRODUCIR, A LA DEFINICIÓN DEL MÉTODO
            CON LO QUE LA LANZAMOS (throw) A UN NIVEL SUPERIOR, HASTA QUE ALGUNO DE ELLOS DECIDAD TRATARLA.
                                                            
                                                            
********************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   5/8                                                EXCEPCIONES
********************************************************************************************************************
                                                            
    AYUDAS DEL ENTORNO DE DESARROLLO INTEGRADO (IDE)
               
            - PUEDEN ADVERTIRNOS:
                    - EXCEPCIONE CON CHEQUEO. (DETECTABLES POR EL COMPILADOR).
                    - LÍNEAS QUE NECESITAN OBLIGATORIAMENTE SER RODEADAS DE try/catch.
                                                            
            - AUTOMATIZAN:
                    - AÑADIR LA EXCEPCIÓN A LA DEFINICIÓN DEL MÉTODO, PARA LANZARLA (throw) A UN NIVEL SUPERIOR.
                    - RODEAR LA SENTENCIA CON UN BLOQUE  try/catch.
                                                            
            - COPILOT:
                    - LOS IDES MÁS AVANZADOS PUEDEN HACER SUGERENCIAS CON LAS SOLUCIONES
                      MÁS HABITUALES PARA LAS SITUACIONES QUE DETECTAN.
                    - BASADAS EN LA COMUNIDAD DE DESARROLLADORES.
                                                            
********************************************************************************************************************

                                                            """);
                                          continuar();
                                          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   6/8                                                EXCEPCIONES
********************************************************************************************************************
                                           
   EXCEPCIONES ASOCIADAS A CLASES XML
                                                             
           - LAS OPERACIONES QUE EJECUTEMOS CON LOS PARSERS XML PUEDEN LANZAR DIFERENTES EXCEPCIONES.
                    - NORMALMENTE, EL IDE LOCALIZARÁ CUANDO SE ESTÉ EJECUTANDO EL MÉTODO parse(),
                      Y NOS INDICARÁ QUE HAY UN ERROR SI NO ESTAMOS MANEJANDO LA EXCEPCIÓN.
                                                             
           - LA PROPIA DOCUMENTACIÓN DE JAVA, EN SU APARTADO Throws,
             INDICA QUÉ EXCEPCIONES PUEDE LANZAR EL MÉTODO QUE SE ESTÁ EJECUTANDO.
                    - NORMALMENTE LOS IDES TIENEN UNA COMBINACIÓN DE TECLAS PARA MOSTRAR
                      LA DOCUMENTACIÓN DE JAVA SOBRE EL MÉTODO EN EL QUE SE ESTÁ.
                                                             
           - ES UNA MUY BUENA PRÁCTICA CUBRIR LAS DIFERENTES OPCIONES CON BLOQUES catch,
             CAPTURANDO CADA UNO DE ESTOS POSIBLES LANZAMIENTOS DE EXCEPCIONES.
                    - LOS BLOQUES catch SE PUEDEN ANIDAR,
                      PARA EVITAR TENER QUE IR ESCRIBIENDO CONTINUAMENTE BLOQUES try/catch.
                                                             
           - EN XML Y CON parse(), PODEMOS ENGLOBAR TODOS LOS BLOQUES catch
             DE UNA SERIE DE OPERACIONES DE ANÁLISIS O PARSING,
             TENIÉNDOLAS MEJOR DISTRIBUIDAS Y MANEJADAS.                                                             
                                                                              
********************************************************************************************************************
                                                   
                                                            """);
                                          continuar();
                                          System.out.println(""" 

********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   7/8                                                EXCEPCIONES
********************************************************************************************************************                    
                                                                                   
        *****************************************************************************
        *   FORMAS DE TRATAR UNA EXCEPCIÓN:                                         *
        *   1º- AÑADIR LA EXCEPCIÓN A LA DEFINICIÓN DEL MÉTODO -> PASA A OTRO NIVEL.*
        *   2º- CONTRÓL MEDIANTE LOS BLOQUES  -->  try-catch                        *
        *       LOS BLOQUES  try-catch  SE PONDRÁN EN EL PROGRAMA PRINCIPAL.        *
        *****************************************************************************
        *   SI LA EXCEPCIÓN SE DA EN UN MÉTODO  -->  AÑADIR  throws  Y...           *
        *   LA EJECUCIÓN SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
        *****************************************************************************
        *          SI QUEREMOS LANZAR NOSOTROS UNA EXCEPCIÓN:                       *
        *   thow new MiException(); --> PODEMOS PERSONALIZAR LA EXCEPCIÓN.          *
        *****************************************************************************
        *   EN EL PROGRAMA PRINCIPAL:                                               *
        *                                                                           *
        *    try {                                                                  *
        *        BLOQUE QUE PUEDE GENERAR LA EXCEPCIÓN;                             *
        *        CÓDIGO PROTEGIDO;                                                  *
        *    } catch (TipoException e) {                                            *
        *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCIÓN;                        *
        *        e.printStackTrace();                                               *
        *        System.out.println("Error: " + e.toString());                      *
        *        System.out.println("Error: " + e.getMessage());                    *
        *        System.out.println("La Excepción es: " + e.getClass());            *
        *    } finaly {                                                             *
        *        BLOQUE QUE SIEMPRE SE EJECUTA;                                     *
        *        CIERRE DE RECURSOS.                                                *
        *    }                                                                      *
        *                                                                           *
        *****************************************************************************
        *   UN try    -->  PUEDE TENER VARIOS catch  -->  MULTICATCH                *
        *   UN catch  -->  TIENE QUE TENER UN try OBLIGATORIAMENTE                  *
        *****************************************************************************
                                                       
********************************************************************************************************************
                               
                                                           """);
                                         continuar();
                                         System.out.println(""" 
                               
********************************************************************************************************************
*  TEMA 03                                       TRABAJOS CON FICHEROS XML
********************************************************************************************************************
*   8/8                                                EXCEPCIONES
********************************************************************************************************************                          
                               
        *****************************************************************************
        *                       EXCEPCIONES PERSONALIZADAS                          *
        *****************************************************************************
        *   SU NOMBRE DEBERÁ TERMINAR EN  ...Exception                              *
        *   TENDRÁ UN CONSTRUCTOR QUE LE LLEGA UN String COMO PARÁMETRO.            *
        *   String  -->  MENSAJE DE NUESTRO ERROR PERSONALIZADO.                    *
        *****************************************************************************
        *   SI SE DAN LAS CONDICIONES REQUERIDAS DE LA EXCEPCIÓN ...                *
        *   SE LANZA NUESTRA EXCEPCIÓN CON EL CÓDIGO:                               *
        *                                                                           *
        *   throw new TipoException(String);                                        *
        *                                                                           *
        *****************************************************************************
        *   SI LA EXCEPCIÓN SE DA EN UN MÉTODO  -->  AÑADIR  throws  Y...           *
        *   LA EJECUCIÓN SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
        *                                                                           *
        *   private static void unMetodo() throws TipoException {                   *
        *        ...                                                                *
        *        if (CONDICIÓN) {                                                   *
        *            throw new TipoException("¡¡¡ No es correcto !!!");             *
        *        }                                                                  *
        *        ...                                                                *
        *   }                                                                       *
        *                                                                           *
        *****************************************************************************
        *   EN LA CLASE EXCEPCIÓN PERSONALIZADA:                                    *
        *                                                                           *
        *  public class TipoException extends Exception {                           *
        *                                                                           *
        *      public TipoException (String mensajeError) {                         *
        *          super(mensajeError);                                             *
        *      }                                                                    *
        *  }                                                                        *
        *                                                                           *
        *****************************************************************************
        *  0. ATRÁS.                                                                *
        *****************************************************************************                                                              
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            meterEspacios(25);
            switch(menu){
                case "0" -> {}
                default -> {
                        meterEspacios(25);
                        System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                        meterEspacios(15);
                        esperar(1500);
                        }
            }
        } while (!"0".equals(menu));
    }
}