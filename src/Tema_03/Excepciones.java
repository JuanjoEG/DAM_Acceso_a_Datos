package Tema_03;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                               
        - EXCEPCI�N: EVENTO QUE DURANTE LA EJECUCI�N DE UN PROGRAMA,
            INTERRUMPE EL FLUJO DEL MISMO POR ALG�N MOTIVO.
                   - MOTIVOS: INTRODUCCI�N DE DATOS ERR�NEOS (O DIFERENTES DE LO ESPERADO),
                              FICHERO NO ENCONTRADO, CORTES DE CONEXI�N O PROBLEMAS DE ACCESO A MEDIOS.
                   - ORIGEN:  ALGUNAS SON OCASIONADAS POR EL USUARIO, OTRAS POR EL DESARROLLADOR,
                              Y OTRAS POR EL ESTADO DE LOS RECURSOS F�SICOS.
                               
        - LAS EXCEPCIONES SE DIVIDEN EN 3 CATEGOR�AS:
                               
                   - EXCEPCIONES CON CHEQUEO (checked exception): 
                              NOTIFICADAS POR EL COMPILADOR DURANTE LA COMPILACI�N, NO PUEDEN SER IGNORADAS.
                               
                   - EXCEPCIONES SIN CHEQUEO (unchecked exceptions) O RuntimeExcepcions:
                              SE ORIGINAN EN TIEMPO DE EJECUCI�N.
                                    - INCLUYE ERRORES DE PROGRAMACI�N, O MAL USO DE UNA API DE C�DIGO.
                                    - ESTE TIPO DE EXCEPCIONES SON IGNORADAS EN TIEMPO DE COPILACI�N.
                               
                   - ERRORES: ESCAPAN DEL CONTROL DEL USUARIO O DEL DESARROLLADOR.
                                    - GENERALMENTE SE IGNORAN TANTO EN EL C�DIGO COMO EN TIEMPO DE COMPILACI�N,
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
        - ES LA CLASE RA�Z DE LA JERARQU�A DE EXCEPCIONES DE JAVA Y ES HEREDADA POR DOS SUBCLASES:
               - Exception
               - Error
        - IMPLEMENTA LA INTERFAZ SERIALIZABLE.
        - SUS CLASES DIRECTAS CONOCIDAS DE Throwable SON Error Y Exception.
        - CONTIENE UNA INSTANT�NEA DE LA PILA DE EJECUCI�N DE SU HILO EN EL MOMENTO DE SU CREACI�N.
        - TAMBI�N PUEDE CONTENER UNA STRING DE MENSAJE QUE BRINDA M�S INFORMACI�N SOBRE EL ERROR.
                                                            
   SERIALIZABLE:
        - PARA QUE UN PROGRAMA JAVA PUEDA CONVERTIR UN OBJETO EN UN MONT�N DE BYTES Y PUEDA LUEGO RECUPERARLO,
          EL OBJETO NECESITA SER SERIALIZABLE.
        - AL PODER CONVERTIR EL OBJETO A BYTES, ESE OBJETO SE PUEDE ENVIAR A TRAVES DE RED, GUARDADO EN UN FICHERO, ETC...
          Y DESPU�S RECONSTRUIRLO AL OTRO LADO DE LA RED, LEERLO DEL FICHERO, ETC...
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
        *                            DURANTE LA COMPILACI�N                                *
        *                                                                                  *
        *       - UNCHECKED EXCEPTIONS (SIN CHEQUEO)  RunTimeExceptionS                    *
        *                            EN TIEMPO DE EJECUCI�N                                *
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
        *   LOS M�TODOS PRINCIPALES PARA GESTIONAR EXCEPCIONE:                             *
        *                                                                                  *
        *   getMessage()       -> DEVUELVE MENSAJE DETALLADO SOBRE LA EXCEPCI�N            *
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
                                                            
    DETECCI�N Y TRATAMIENTO     try/catch/finally Y throw                                                        
                                                            
            PARA PODER CAPTURAR Y TRATAR UNA EXCEPCI�N, SE INCLUYE EN BLOQUES DE C�DIGO try/catch.

                 - ESTE BLOQUE SE COLOCA ALREDEDOR DEL C�DIGO QUE CREEMOS QUE PUDIERA GENERAR UNA EXCEPCI�N.

                 - EL C�DIGO INCLUIDO DENTRO DE UN BLOQUE try/catch SE CONOCE COMO C�DIGO PROTEGIDO.

                 - EL C�DIGO QUE ES PROPENSO A EXCEPCIONES SE COLOCA A CONTINUACI�N DE LA SENTENCIA try.

                 - CUANDO SE LANZA UNA EXCEPCI�N, ES CAPTURADA POR EL BLOQUE catch ASOCIADA A ELLA.
                        - UN BLOQUE catch IMPLICA DECLARAR UN TIPO DE LA EXCEPCI�N QUE QUERAMOS CAPTURAR.

                 - CADA BLOQUE try PUEDE IR SEGUIDO DE UNO O VARIOS BLOQUES catch Y/O DE UN BLOQUE finally.
                        - UN BLOQUE finally LO ENCONTRAMOS JUSTO DESPU�S DEL BLOQUE try O DESPU�S DEL catch.
                                 - ES UN C�DIGO QUE SE EJECUTA SIEMPRE, INDEPENDIENTEMENTE SI PASA POR �STOS.
                                 - SUELEN USARSE PARA LIMPIEZA O LIBERACI�N DE RECURSOS DE MEMORIA.

            OTRA OPCI�N ES A�ADIR EL TIPO DE EXCEPCI�N QUE CREEMOS SE PUEDE PRODUCIR, A LA DEFINICI�N DEL M�TODO
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
                    - L�NEAS QUE NECESITAN OBLIGATORIAMENTE SER RODEADAS DE try/catch.
                                                            
            - AUTOMATIZAN:
                    - A�ADIR LA EXCEPCI�N A LA DEFINICI�N DEL M�TODO, PARA LANZARLA (throw) A UN NIVEL SUPERIOR.
                    - RODEAR LA SENTENCIA CON UN BLOQUE  try/catch.
                                                            
            - COPILOT:
                    - LOS IDES M�S AVANZADOS PUEDEN HACER SUGERENCIAS CON LAS SOLUCIONES
                      M�S HABITUALES PARA LAS SITUACIONES QUE DETECTAN.
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
                    - NORMALMENTE, EL IDE LOCALIZAR� CUANDO SE EST� EJECUTANDO EL M�TODO parse(),
                      Y NOS INDICAR� QUE HAY UN ERROR SI NO ESTAMOS MANEJANDO LA EXCEPCI�N.
                                                             
           - LA PROPIA DOCUMENTACI�N DE JAVA, EN SU APARTADO Throws,
             INDICA QU� EXCEPCIONES PUEDE LANZAR EL M�TODO QUE SE EST� EJECUTANDO.
                    - NORMALMENTE LOS IDES TIENEN UNA COMBINACI�N DE TECLAS PARA MOSTRAR
                      LA DOCUMENTACI�N DE JAVA SOBRE EL M�TODO EN EL QUE SE EST�.
                                                             
           - ES UNA MUY BUENA PR�CTICA CUBRIR LAS DIFERENTES OPCIONES CON BLOQUES catch,
             CAPTURANDO CADA UNO DE ESTOS POSIBLES LANZAMIENTOS DE EXCEPCIONES.
                    - LOS BLOQUES catch SE PUEDEN ANIDAR,
                      PARA EVITAR TENER QUE IR ESCRIBIENDO CONTINUAMENTE BLOQUES try/catch.
                                                             
           - EN XML Y CON parse(), PODEMOS ENGLOBAR TODOS LOS BLOQUES catch
             DE UNA SERIE DE OPERACIONES DE AN�LISIS O PARSING,
             TENI�NDOLAS MEJOR DISTRIBUIDAS Y MANEJADAS.                                                             
                                                                              
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
        *   FORMAS DE TRATAR UNA EXCEPCI�N:                                         *
        *   1�- A�ADIR LA EXCEPCI�N A LA DEFINICI�N DEL M�TODO -> PASA A OTRO NIVEL.*
        *   2�- CONTR�L MEDIANTE LOS BLOQUES  -->  try-catch                        *
        *       LOS BLOQUES  try-catch  SE PONDR�N EN EL PROGRAMA PRINCIPAL.        *
        *****************************************************************************
        *   SI LA EXCEPCI�N SE DA EN UN M�TODO  -->  A�ADIR  throws  Y...           *
        *   LA EJECUCI�N SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
        *****************************************************************************
        *          SI QUEREMOS LANZAR NOSOTROS UNA EXCEPCI�N:                       *
        *   thow new MiException(); --> PODEMOS PERSONALIZAR LA EXCEPCI�N.          *
        *****************************************************************************
        *   EN EL PROGRAMA PRINCIPAL:                                               *
        *                                                                           *
        *    try {                                                                  *
        *        BLOQUE QUE PUEDE GENERAR LA EXCEPCI�N;                             *
        *        C�DIGO PROTEGIDO;                                                  *
        *    } catch (TipoException e) {                                            *
        *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCI�N;                        *
        *        e.printStackTrace();                                               *
        *        System.out.println("Error: " + e.toString());                      *
        *        System.out.println("Error: " + e.getMessage());                    *
        *        System.out.println("La Excepci�n es: " + e.getClass());            *
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
        *   SU NOMBRE DEBER� TERMINAR EN  ...Exception                              *
        *   TENDR� UN CONSTRUCTOR QUE LE LLEGA UN String COMO PAR�METRO.            *
        *   String  -->  MENSAJE DE NUESTRO ERROR PERSONALIZADO.                    *
        *****************************************************************************
        *   SI SE DAN LAS CONDICIONES REQUERIDAS DE LA EXCEPCI�N ...                *
        *   SE LANZA NUESTRA EXCEPCI�N CON EL C�DIGO:                               *
        *                                                                           *
        *   throw new TipoException(String);                                        *
        *                                                                           *
        *****************************************************************************
        *   SI LA EXCEPCI�N SE DA EN UN M�TODO  -->  A�ADIR  throws  Y...           *
        *   LA EJECUCI�N SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
        *                                                                           *
        *   private static void unMetodo() throws TipoException {                   *
        *        ...                                                                *
        *        if (CONDICI�N) {                                                   *
        *            throw new TipoException("��� No es correcto !!!");             *
        *        }                                                                  *
        *        ...                                                                *
        *   }                                                                       *
        *                                                                           *
        *****************************************************************************
        *   EN LA CLASE EXCEPCI�N PERSONALIZADA:                                    *
        *                                                                           *
        *  public class TipoException extends Exception {                           *
        *                                                                           *
        *      public TipoException (String mensajeError) {                         *
        *          super(mensajeError);                                             *
        *      }                                                                    *
        *  }                                                                        *
        *                                                                           *
        *****************************************************************************
        *  0. ATR�S.                                                                *
        *****************************************************************************                                                              
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            meterEspacios(25);
            switch(menu){
                case "0" -> {}
                default -> {
                        meterEspacios(25);
                        System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                        meterEspacios(15);
                        esperar(1500);
                        }
            }
        } while (!"0".equals(menu));
    }
}