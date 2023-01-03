package Tema_03;

import static Principal_Main.Main.*;
import static Tema_03.T_03.*;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_03 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_03 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                         
            EL XML ES, CON DIFERENCIA, EL FORMATO M�S UTILIZADO PARA EL INTERCAMBIO DE DATOS ENTRE APLICACIONES.
            ES FUNDAMENTAL SABER TRABAJAR CON ESTE FORMATO, SUS TIPOLOG�AS,
            Y LOS M�TODOS Y CLASES A UTILIZAR EN EL DESARROLLO DE APLICACIONES O UTILIDADES.
                                              
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        ************************************************************************************************************************
                         
            DOM  -->  DOCUMENT OBJECT MODEL.
            SAX  -->  SIMPLE API FOR XML.

            DOM Y SAX SON PARSERS O ANALIZADORES: HERRAMIENTAS PARA LEER EL TIPO ESPECIAL DE FICHEROS XML,
            Y QUE VERIFICAN SI SON DOCUMENTOS XML V�LIDOS SINTACTICAMENTE:

                    - DOM CARGA EL FICHERO HTML O XML COMPLETO.
                            - VENTAJAS:
                                     - UNA VEZ INTRODUCIMOS EL FICHERO,
                                       TENEMOS TODO EL �RBOL YA FORMADO DE LOS NODOS Y DEM�S OBJETOS,
                                       DISPONIBLE Y PREPARADO PARA TRABAJAR.
                            - INCONVENIENTES:
                                     - SI EL FICHERO ES MUY GRANDE, OCUPAR� MUCHO ESPACIO EN LA MEMORIA.
                                     - AL GESTIONAR TODA LA INFORMACI�N, ES M�S LENTO Y MENOS VERS�TIL.

                    - SAX CARGA EL NODO O EL EVENTO ACTUAL.
                      REQUIERE INTRODUCIR L�NEAS DE PROGRAMACI�N PARA OBTENER PARTES DETERMINADAS DE LOS FICHEROS.
                            - VENTAJAS:
                                     - OCUPA MENOS MEMORIA, TIENE EN MEMORIA SOLO UNA PARTE DEL FICHERO.
                                     - ES M�S R�PIDO, M�S FUNCIONAL Y VERS�TIL.
                            - INCONVENIENTES:
                                     - AL GESTIONAR PARTE DE LA INFORMACI�N, ES MENOS POTENTE.

                    - EJEMPLOS DE USO RECOMENDABLE:

                            - DOM: CUANDO TENGAMOS EL OBJETIVO CLARO SOBRE EL QUE QUEREMOS TRABAJAR,
                                   A PARTIR DE UN �RBOL CREADO EN MEMORIA.

                            - SAX: RECORRER SECUENCIALMENTE LOS ELEMENTOS DE FICHEROS XML
                                   MUY GRANDES Y REALIZAR CIERTAS OPERACIONES.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        ************************************************************************************************************************

                *************************************************************************************************
                *                       javax.xml.parsers  -->  LIBRER�AS DE HERRAMIENTAS XML                   *
                *************************************************************************************************
                *                     SAX                       *                     DOM                       *
                *************************************************************************************************
                * BASADO EN EVENTOS                             * CARGA EL FICHERO COMPLETO EN MEMORIA          *
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
                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        ************************************************************************************************************************
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
                                                      
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        ************************************************************************************************************************
                         
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
                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        ************************************************************************************************************************
                         
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

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        ************************************************************************************************************************
                               
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
                                                      
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        ************************************************************************************************************************
                                                            
            LA CLASE THROWABLE:

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

************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        ************************************************************************************************************************
                               
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
                    *                                                                                  *
                    ************************************************************************************
                                                      
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        ************************************************************************************************************************
                                                            
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
                                                                                   
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        ************************************************************************************************************************
                                                            
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

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
        ************************************************************************************************************************
                                           
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
                                                                                
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
        ************************************************************************************************************************
                                                                                   
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
                                                                              
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_14 + """
        ************************************************************************************************************************
                               
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

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_15 + """
        ************************************************************************************************************************
   
            - UNA PRUEBA (TEST) ES UNA PIEZA DE SOFTWARE QUE EJECUTA OTRA PIEZA DE SOFTWARE.
             (UN PROGRAMA QUE EJECUTA OTRO PROGRAMA).
                    - VALIDA SI LOS RESULTADOS DE UN C�DIGO EST�N EN EL ESTADO QUE SE ESPERA, 
                      O EJECUTA LA SECUENCIA ESPERADA DE OPERACIONES O EVENTOS.
                    - AYUDAN AL PROGRAMADOR A VERIFICAR QUE UN FRAGMENTO DE C�DIGO ES CORRECTO.
                    - ES UNA BUENA PR�CTICA QUE LAS PRUEBAS LAS HAGAN PERSONAS O EQUIPOS DIFERENTES
                      DE LAS PERSONAS QUE DESARROLLAN LOS PROGRAMAS.
                    - EXISTEN DIFERENTES TIPOS DE PRUEBAS; DOS DE LOS M�S IMPORTANTES SON:
                            - PRUEBAS UNITARIAS (UNIT TESTING) PARA CHEQUEAR UN COMPONENTE DE MANERA INDIVIDUAL.
                              (POR EJEMPLO PARA CHEQUEAR UNA CLASE O UN M�TODO JAVA).
                            - PRUEBAS INTEGRADAS, COMPRUEBA EL FUNCIONAMIENTO DE VARIOS COMPONENTES TRABAJANDO EN CONJUNTO.
                              (INCLUYE LA COMUNICACI�N ENTRE ELLOS).                               

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_16 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_16 + """
        ************************************************************************************************************************

            - JUnit ES UN MARCO DE TRABAJO (UN FRAMEWORK) PARA HACER PRUEBAS UNITARIAS,
              QUE REALIZA ANOTACIONES @Test PARA IDENTIFICAR TEST A REALIZAR:                           
                    - HABITUALMENTE, LOS IDES QUE SOPORTAN JUnit, AL ESCRIBIR LA ANOTACI�N @Test,
                      ENTENDER�N QUE QUEREMOS INTRODUCIR LIBRER�AS DE Junit.
                    - LO QUE HAR� JUnit ES CREAR UN M�TODO QUE EST� EN EL INTERIOR DE UNA CLASE LLAMADA Test class.
                    - DE ESTA FORMA, PARA DEFINIR QUE UN M�TODO FORMA PARTE PARTE DE UN TEST,
                      SOLO HAY QUE A�ADIR LA ANOTACI�N @Test SOBRE LA CABECERA DEL M�TODO.
                    - JUnit UTILIZA ADEM�S OTRAS ANOTACIONES Y M�TODOS QUE SON MUY �TILES PARA ESCRIBIR TEST UNITARIOS:
                            - ANOTACI�N @Before: SIEMPRE QUE EJECUTEMOS UN TEST UNITARIO, ANTES,
                              SE EJECUTAR� EL C�DIGO DE ESTE M�TODO CON ANOTACI�N @Before.
                                     - NORMALMENTE SE UTILIZA PARA INSTANCIAR LA MAYOR PARTE
                                       DE LAS VARIABLES QUE VAMOS A NECESITAR PARA LOS TEST.
                            - ANOTACI�M @After: ESTA ANOTACI�N DEFINE UN M�TODO QUE SE EJECUTAR� SIEMPRE
                              AL FINALIZAR CUALQUIER TEST DENTRO DE NUESTRA CLASE.

            - UNA ANOTACI�N EN JAVA ES UNA CARACTER�STICA QUE PERMITE INCRUSTAR INFORMACI�N SUPLEMENTARIA EN EL C�DIGO FUENTE.
                    - NO CAMBIA LAS ACCIONES DE UN PROGRAMA, PERO PUEDE SER UTILIZADO POR VARIAS HERRAMIENTAS,
                      TANTO DURANTE EL DESARROLLO COMO DURANTE EL DESPLIEGUE.
                    - LAS ANOTACIONES EN JAVA COMIENZAN CON @.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_17 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_17 + """
        ************************************************************************************************************************

            - LO PRIMERO VA A SER DECIDIR LAS PRUEBAS A REALIZAR, CASOS DE PRUEBA, ETC...
                    - EN NUESTRO CASO VAMOS A USAR EL EJEMPLO DE UNA SENCILLA CLASE Calculadora.
                      EL MAIN SE ENCUENTRA EN LA CLASE PruebaUnitaria.

            - UNA VEZ DECIDIDAS LAS PRUEBAS A REALIZAR, PARA UTILIZAR JUnit PARA IMPLEMENTARLAS EN NetNeans:
                    - BOT�N DERECHO SOBRE EL NOMBRE DEL PAQUETE --> NEW --> TEST FOR EXISTING CLASS.
                    - O SOBRE EL NOMBRE DE LA CLASE Calculadora --> TOOLS --> CREATE/UPDATE TESTS.
                    - SELECCIONAMOS LA CLASE DE LA QUE QUEREMOS HACER LA PRUEBA, Y LOS TIPOS DE PRUEBAS QUE QUEREMOS REALIZAR.
                    - SE NOS GENERAR� UN NUEVO PAQUETE Test Packages, Y DENTRO UNA NUEVA CLASE CalculadoraTest,
                      CON UN ESQUELETO CON LAS ANOTACIONES:
                            - EN LA ANOTACI�N @Test PONDREMOS LA PRUEBAS.
                            - EN LAS ANOTACIONES @Before Y @After PONDREMOS
                              EL C�DIGO QUE QUEREMOS EJECUTAR ANTES Y DESPUES DE LAS PRUEBAS.

            - EL C�DIGO QUE APARECE POR DEFECTO EN @Test LO MODIFICAMOS O SUSTITUIMOS POR LAS PRUEBAS QUE QUERAMOS QUE SE HAGAN.
              PODEMOS COPIAR Y PEGAR ESE C�DIGO LAS VECES QUE QUERAMOS PARA REALIZAR DISTINTAS PRUEBAS JUNTAS.

            - EN LOS PROYECTOS JavaANT  -->  HAY QUE A�ADIR LAS LIBRER�AS DE JUnit4, JUnit5 Y Hamcrest.
                    - PARA ACCEDER A LAS LIBRER�AS: --> PROPERTIES  --> LIBRARIES  -->  +  --> ADD LIBRARY

            - LAS ANOTACIONES QUE SE GENERAN POR DEFECTO, SON DE VERSIONES ANTIGUAS,
                    - HAY QUE SUSTITUIR --> IMPORTAR EN  CalculadoraTest  LOS PAQUETES:

                    import org.junit.After;
                    import org.junit.AfterClass;
                    import org.junit.Before;
                    import org.junit.BeforeClass;
                    import org.junit.Test;
                    import static org.junit.Assert.*; 

            - COMENTAR LA L�NEA:  -->  //fail("The test case is a prototype.");        

            - BOT�N DERECHO SOBRE CalculadoraTest --> TEST FILE.
                    - EN LA PESTA�A Test Result TENDR�AMOS LOS RESULTADOS.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_18 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_18 + """
        ************************************************************************************************************************
                             
            - PARA HACER LA DOCUMENTACION USAMOS JAVADOC:

                    - SIMILAR EN CIERTO MODO A JUnit, A PARTIR DEL CONTENIDO DEL C�DIGO FUENTE EN ESTE CASO,
                      GENERA DOCUMENTACI�N EN FORMATO HTML, NAVEGABLE, DESCRIBIENDO M�TODOS, PAR�METROS, CLASES, ETC...

                    - UTILIZA LA INFORMACI�N EN LOS COMENTARIOS DEL C�DIGO:
                            - DOS ASTERISCOS ** AL PRINCIPIO DE CADA M�TODO.
                            - UN ASTERISCO Y UNA ARROBA *@ PARA INDICAR LOS COMENTARIOS DE LOS PAR�METROS.

                    - EN NetBeans SIMPLEMENTE HAY QUE PULSAR: --> RUN  -->  GENERATE JAVADOC.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05);                
                case "6" -> System.out.println(recurso_06);
                case "7" -> System.out.println(recurso_07);
                case "8" -> System.out.println(recurso_08);
                case "9" -> System.out.println(recurso_09);
                case "10" -> System.out.println(recurso_10);
                case "11" -> System.out.println(recurso_11);
                case "12" -> System.out.println(recurso_12);
                case "13" -> System.out.println(recurso_13);
                case "14" -> System.out.println(recurso_14);
                case "15" -> System.out.println(recurso_15);
                case "16" -> System.out.println(recurso_16);
                case "17" -> System.out.println(recurso_17);
                case "18" -> System.out.println(recurso_18);
                case "23" -> {
                    System.out.println(recurso_01);
                    continuar();
                    System.out.println(recurso_02);
                    continuar();
                    System.out.println(recurso_03);
                    continuar();
                    System.out.println(recurso_04);
                    continuar();
                    System.out.println(recurso_05);
                    continuar();
                    System.out.println(recurso_06);
                    continuar();
                    System.out.println(recurso_07);
                    continuar();
                    System.out.println(recurso_08);
                    continuar();
                    System.out.println(recurso_09);
                    continuar();
                    System.out.println(recurso_10);
                    continuar();
                    System.out.println(recurso_11);
                    continuar();
                    System.out.println(recurso_12);
                    continuar();
                    System.out.println(recurso_13);
                    continuar();
                    System.out.println(recurso_14);
                    continuar();
                    System.out.println(recurso_15);
                    continuar();
                    System.out.println(recurso_16);
                    continuar();
                    System.out.println(recurso_17);
                    continuar();
                    System.out.println(recurso_18);
                }
            }
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
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