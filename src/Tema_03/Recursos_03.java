package Tema_03;

import static Principal_Main.Main.*;
import static Tema_03.T_03.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_03 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_03 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                         
            EL XML ES, CON DIFERENCIA, EL FORMATO MÁS UTILIZADO PARA EL INTERCAMBIO DE DATOS ENTRE APLICACIONES.
            ES FUNDAMENTAL SABER TRABAJAR CON ESTE FORMATO, SUS TIPOLOGÍAS,
            Y LOS MÉTODOS Y CLASES A UTILIZAR EN EL DESARROLLO DE APLICACIONES O UTILIDADES.
                                              
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
                *                       javax.xml.parsers  -->  LIBRERÍAS DE HERRAMIENTAS XML                   *
                *************************************************************************************************
                *                     SAX                       *                     DOM                       *
                *************************************************************************************************
                * BASADO EN EVENTOS                             * CARGA EL FICHERO COMPLETO EN MEMORIA          *
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
                            - LÍNEAS QUE NECESITAN OBLIGATORIAMENTE SER RODEADAS DE try/catch.

                    - AUTOMATIZAN:
                            - AÑADIR LA EXCEPCIÓN A LA DEFINICIÓN DEL MÉTODO, PARA LANZARLA (throw) A UN NIVEL SUPERIOR.
                            - RODEAR LA SENTENCIA CON UN BLOQUE  try/catch.

                    - COPILOT:
                            - LOS IDES MÁS AVANZADOS PUEDEN HACER SUGERENCIAS CON LAS SOLUCIONES
                              MÁS HABITUALES PARA LAS SITUACIONES QUE DETECTAN.
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
                    - VALIDA SI LOS RESULTADOS DE UN CÓDIGO ESTÁN EN EL ESTADO QUE SE ESPERA, 
                      O EJECUTA LA SECUENCIA ESPERADA DE OPERACIONES O EVENTOS.
                    - AYUDAN AL PROGRAMADOR A VERIFICAR QUE UN FRAGMENTO DE CÓDIGO ES CORRECTO.
                    - ES UNA BUENA PRÁCTICA QUE LAS PRUEBAS LAS HAGAN PERSONAS O EQUIPOS DIFERENTES
                      DE LAS PERSONAS QUE DESARROLLAN LOS PROGRAMAS.
                    - EXISTEN DIFERENTES TIPOS DE PRUEBAS; DOS DE LOS MÁS IMPORTANTES SON:
                            - PRUEBAS UNITARIAS (UNIT TESTING) PARA CHEQUEAR UN COMPONENTE DE MANERA INDIVIDUAL.
                              (POR EJEMPLO PARA CHEQUEAR UNA CLASE O UN MÉTODO JAVA).
                            - PRUEBAS INTEGRADAS, COMPRUEBA EL FUNCIONAMIENTO DE VARIOS COMPONENTES TRABAJANDO EN CONJUNTO.
                              (INCLUYE LA COMUNICACIÓN ENTRE ELLOS).                               

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
                    - HABITUALMENTE, LOS IDES QUE SOPORTAN JUnit, AL ESCRIBIR LA ANOTACIÓN @Test,
                      ENTENDERÁN QUE QUEREMOS INTRODUCIR LIBRERÍAS DE Junit.
                    - LO QUE HARÁ JUnit ES CREAR UN MÉTODO QUE ESTÁ EN EL INTERIOR DE UNA CLASE LLAMADA Test class.
                    - DE ESTA FORMA, PARA DEFINIR QUE UN MÉTODO FORMA PARTE PARTE DE UN TEST,
                      SOLO HAY QUE AÑADIR LA ANOTACIÓN @Test SOBRE LA CABECERA DEL MÉTODO.
                    - JUnit UTILIZA ADEMÁS OTRAS ANOTACIONES Y MÉTODOS QUE SON MUY ÚTILES PARA ESCRIBIR TEST UNITARIOS:
                            - ANOTACIÓN @Before: SIEMPRE QUE EJECUTEMOS UN TEST UNITARIO, ANTES,
                              SE EJECUTARÁ EL CÓDIGO DE ESTE MÉTODO CON ANOTACIÓN @Before.
                                     - NORMALMENTE SE UTILIZA PARA INSTANCIAR LA MAYOR PARTE
                                       DE LAS VARIABLES QUE VAMOS A NECESITAR PARA LOS TEST.
                            - ANOTACIÓM @After: ESTA ANOTACIÓN DEFINE UN MÉTODO QUE SE EJECUTARÁ SIEMPRE
                              AL FINALIZAR CUALQUIER TEST DENTRO DE NUESTRA CLASE.

            - UNA ANOTACIÓN EN JAVA ES UNA CARACTERÍSTICA QUE PERMITE INCRUSTAR INFORMACIÓN SUPLEMENTARIA EN EL CÓDIGO FUENTE.
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
                    - BOTÓN DERECHO SOBRE EL NOMBRE DEL PAQUETE --> NEW --> TEST FOR EXISTING CLASS.
                    - O SOBRE EL NOMBRE DE LA CLASE Calculadora --> TOOLS --> CREATE/UPDATE TESTS.
                    - SELECCIONAMOS LA CLASE DE LA QUE QUEREMOS HACER LA PRUEBA, Y LOS TIPOS DE PRUEBAS QUE QUEREMOS REALIZAR.
                    - SE NOS GENERARÁ UN NUEVO PAQUETE Test Packages, Y DENTRO UNA NUEVA CLASE CalculadoraTest,
                      CON UN ESQUELETO CON LAS ANOTACIONES:
                            - EN LA ANOTACIÓN @Test PONDREMOS LA PRUEBAS.
                            - EN LAS ANOTACIONES @Before Y @After PONDREMOS
                              EL CÓDIGO QUE QUEREMOS EJECUTAR ANTES Y DESPUES DE LAS PRUEBAS.

            - EL CÓDIGO QUE APARECE POR DEFECTO EN @Test LO MODIFICAMOS O SUSTITUIMOS POR LAS PRUEBAS QUE QUERAMOS QUE SE HAGAN.
              PODEMOS COPIAR Y PEGAR ESE CÓDIGO LAS VECES QUE QUERAMOS PARA REALIZAR DISTINTAS PRUEBAS JUNTAS.

            - EN LOS PROYECTOS JavaANT  -->  HAY QUE AÑADIR LAS LIBRERÍAS DE JUnit4, JUnit5 Y Hamcrest.
                    - PARA ACCEDER A LAS LIBRERÍAS: --> PROPERTIES  --> LIBRARIES  -->  +  --> ADD LIBRARY

            - LAS ANOTACIONES QUE SE GENERAN POR DEFECTO, SON DE VERSIONES ANTIGUAS,
                    - HAY QUE SUSTITUIR --> IMPORTAR EN  CalculadoraTest  LOS PAQUETES:

                    import org.junit.After;
                    import org.junit.AfterClass;
                    import org.junit.Before;
                    import org.junit.BeforeClass;
                    import org.junit.Test;
                    import static org.junit.Assert.*; 

            - COMENTAR LA LÍNEA:  -->  //fail("The test case is a prototype.");        

            - BOTÓN DERECHO SOBRE CalculadoraTest --> TEST FILE.
                    - EN LA PESTAÑA Test Result TENDRÍAMOS LOS RESULTADOS.

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

                    - SIMILAR EN CIERTO MODO A JUnit, A PARTIR DEL CONTENIDO DEL CÓDIGO FUENTE EN ESTE CASO,
                      GENERA DOCUMENTACIÓN EN FORMATO HTML, NAVEGABLE, DESCRIBIENDO MÉTODOS, PARÁMETROS, CLASES, ETC...

                    - UTILIZA LA INFORMACIÓN EN LOS COMENTARIOS DEL CÓDIGO:
                            - DOS ASTERISCOS ** AL PRINCIPIO DE CADA MÉTODO.
                            - UN ASTERISCO Y UNA ARROBA *@ PARA INDICAR LOS COMENTARIOS DE LOS PARÁMETROS.

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
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
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