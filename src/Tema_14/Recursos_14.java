package Tema_14;

import static Principal_Main.Main.*;
import static Tema_14.T_14.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_14 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_14 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
            
            LAS BASES DE DATOS XML NATIVAS:
                    SON BASES DE DATOS QUE ALMACENAN DOCUMENTOS Y DATOS XML DE UNA FORMA MUY EFICIENTE.
                    IGUAL QUE EN LAS BASES DE DATOS RELACIONALES,
                    PERMITEN QUE LOS DATOS SE:
                            - ALMACENEN.
                            - CONSULTEN.
                            - COMBINEN.
                            - ASEGUREN.
                            - INDEXEN.
                            - ETC.
                         
            LAS BASES DE DATOS XML NATIVAS NO SE BASAN EN TABLAS, SINO EN LOS LLAMADOS CONTENEDORES.
                         
                  * CADA CONTENEDOR PUEDE ALMACENAR GRANDES CANTIDADES DE DOCUMENTOS XML 
                    O DATOS, QUE TIENEN ALGUNA RELACIÓN ENTRE ELLOS.
                         
                  * LOS CONTENEDORES TAMBIÉN PUEDEN TENER SUBCONTENEDORES.
                         
                  * LA GRAN DIFERENCIA CON LAS BASES DE DATOS RELACIONALES 
                    ES QUE LA ESTRUCTURA DE LOS DATOS XML EN UN CONTENEDOR NO TIENE POR QUÉ SER FIJA.
                         
                          * PODREMOS ALMACENAR DISTINTAS UNIDADES DE NEGOCIO SIN MUCHA RELACIÓN DENTRO DEL MISMO CONTENEDOR.
                         
                          * LA INFRAESTRUCTURA LO PERMITE, Y PODEMOS HACERLO, OTRA COSA ES QUE SEA MÁS O MENOS RECOMENDABLE.

        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        **********************************************************************************************************************************
                                                
            LAS BASES DE DATOS XML NATIVAS NO SON CONSULTADAS POR SENTENCIAS SQL, SON CONSULTADAS POR EXPRESIONES XPATH.

                  * XPATH ES UN ESTÁNDAR MUNDIAL ESTABLECIDO POR EL 'W3C' PARA NAVEGAR A TRAVÉS DE DOCUMENTOS XML.
                    ES UN LENGUAJE QUE SE PUEDE UTILIZAR PARA CONSULTAR DATOS DE DOCUMENTOS XML.
                         
                  * LAS CONSULTAS XPATH SE PUEDEN UTILIZAR PARA ESCANEAR EL CONTENIDO DE DOCUMENTOS XML.

                  * ESTE LENGUAJE SE BASA EN UNA REPRESENTACIÓN DE ÁRBOL DEL DOCUMENTO XML,
                    Y SELECCIONA NODOS SEGÚN DIFERENTES CRITERIOS.
                         
            CUANDO SE CONSULTA UNA BASE DE DATOS XML NATIVA:
                         
                 1. EL USUARIO GENERALMENTE ABRE UN CONTENEDOR.
                         
                 2. POSTERIORMENTE, ENVÍA DICHA EXPRESIÓN XPATH
                    CONTRA TODOS LOS DOCUMENTOS XML EN LA BASE DE DATOS. 

                 3. A CONTINUACIÓN, SE DEVUELVE UN CONJUNTO DE DOCUMENTOS XML.
                                   
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        **********************************************************************************************************************************
                       
            VENTAJAS Y DESVENTAJAS DE LAS BASES DE DATOS XML CON RESPECTO A LAS RELACIONALES
                         
                    ANTIGUAMENTE ESTABA MUY DIFUNDIDA LA CONSIDERACIÓN QUE LAS BASES DE DATOS NATIVAS
                    SON MÁS LENTAS EN LAS CONSULTAS QUE LAS BASES DE DATOS RELACIONALES,
                    PERO HOY EN DÍA YA NO ES DEL TODO CORRECTA.
                         
                    LAS BASES DE DATOS XML ACTUALES SON SEGURAMENTE TAN RÁPIDAS COMO LAS RELACIONALES,
                    Y ADEMÁS, MÁS FÁCILES DE MANTENER Y SOPORTAR, CON RESPECTO A DATOS XML SE REFIERE.
                         
            VENTAJAS DEL USO DE LAS BASES DE DATOS XML:
                         
                  * LAS BASES DE DATOS XML NATIVAS SON CAPACES DE ALMACENAR,
                    MANTENER Y CONSULTAR MAYORES CANTIDADES DE DOCUMENTOS XML EN COMPARACIÓN A LAS RELACIONALES.
                         
                  * A DIFERENCIA DE LAS RELACIONALES, NO ES NECESARIO CONFIGURAR TABLAS,
                    Y POR TANTO, NO SE NECESITA REALIZAR DISEÑOS COMPLICADOS ANTES DE CONFIGURAR LA BASE DE DATOS.
                    UNA TABLA DE BASE DE DATOS CLÁSICA TIENE LA DESVENTAJA DE SER SOLO BIDIMENSIONAL,
                    POR LO QUE LA ESTRUCTURA 'MÁS PROFUNDA' DEBE IMPLEMENTARSE UTILIZANDO CLAVES SECUNDARIAS,
                    LO QUE PUEDE HACER QUE EL DISEÑO DE UNA BASE DE DATOS SEA BASTANTE COMPLICADO.
                         
                  *  LA FACILIDAD DE IMPORTACIÓN O EXPORTACIÓN HACIA/DESDE OTRAS APLICACIONES CON OTROS FORMATOS.
                         
            DESVENTAJAS DEL USO DE LAS BASES DE DATOS XML:
                         
                  * LAS BASES DE DATOS RELACIONALES ESTÁN MUY BIEN ESTABLECIDAS, ES TECNOLOGÍA YA PROBADA.
                    LAS BASES DE DATOS XML SON UN FENÓMENO ALGO MÁS RECIENTE
                    YA QUE ALGUNAS DE LAS PRIMERAS BASES DE DATOS XML NO TIENEN MUCHO MÁS DE UNA DÉCADA DE ANTIGÜEDAD,
                    POR LO QUE LA EXPERIENCIA AÚN ES LIMITADA.
                         
                  * XPATH NO ES UN LENGUAJE EXCESIVAMENTE FÁCIL DE APRENDER, MIENTRAS QUE SQL ESTÁ MUY EXTENDIDO. 
                    NO MUCHOS DESARROLLADORES Y ADMINISTRADORES DE BASES DE DATOS DOMINAN XPATH.
                    SQL ESTÁ MÁS RELACIONADO CON EL LENGUAJE Y LA FORMA HUMANA DE 'PEDIR' CUALQUIER COSA EN GENERAL,
                    POR LO QUE ES ALGO MÁS SENCILLO DE APRENDER.
                         
                  * NO TODAS LAS APLICACIONES GESTORAS DE DATOS SOPORTAN DICHO LENGUAJE,
                    TENDRÍAMOS QUE BUSCAR CUALES SON LOS COMPATIBLES CON LAS BASES DE DATOS MENCIONADAS.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        **********************************************************************************************************************************
                       
            SISTEMAS GESTORES DE BASES DE DATOS XML NATIVAS DE PAGO:
                         
                    * EXCELON XIS:
                            CON ESTE GESTOR, LAS EMPRESAS PUEDEN APROVECHAR DE MANERA COMPLETA Y RENTABLE
                            LA EXTENSIBILIDAD Y FLEXIBILIDAD DE XML PARA CREAR, AUDITAR Y CAMBIAR
                            CONTINUAMENTE APLICACIONES QUE ALMACENAN Y MANIPULAN CANTIDADES LIMITADAS DE DATOS XML.
                         
                    * GOXML DB:
                            ES UNA BASE DE DATOS XML NATIVA CON UN MOTOR DE CONSULTAS DE ALTO RENDIMIENTO.
                            LOS DOCUMENTOS XML SE ALMACENAN DIRECTAMENTE,
                            LO QUE ELIMINA LA NECESIDAD DE DESCOMPONER DATOS O CONFIGURAR CÓMO SE ALMACENARÁN LOS DATOS.
                         
                    * INFONYTE DB:
                            LA TECNOLOGÍA DE BASE DE DATOS DE INFONYTE SE DISTINGUE POR EL SOPORTE NATIVO PARA XML,
                            LA INDEPENDENCIA DE LA PLATAFORMA Y EL USO MODERADO DE LOS RECURSOS DEL SISTEMA.
                            POR LO TANTO, SE ADAPTA PERFECTAMENTE 
                            A LOS REQUISITOS TANTO DE ARQUITECTURAS DE COMPONENTES COMO DE DISPOSITIVOS PEQUEÑOS.
                            EN ESTOS MERCADOS EMERGENTES, SU LIDERAZGO TECNOLÓGICO
                            LES DA UNA VENTAJA COMPETITIVA SOBRE LAS SOLUCIONES ACTUALES.                         
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        **********************************************************************************************************************************
            
            SISTEMAS GESTORES DE BASES DE DATOS XML LIBRES / CÓDIGO ABIERTO:
                         
                    * EXIST DB:
                            ES UN PROYECTO DE SOFTWARE DE CÓDIGO ABIERTO PARA BASES DE DATOS NOSQL CONSTRUIDO SOBRE TECNOLOGÍA XML.
                            ESTÁ CLASIFICADO COMO UN SISTEMA DE BASE DE DATOS ORIENTADO A DOCUMENTOS NOSQL Y UNA BASE DE DATOS XML NATIVA.
                            TAMBIÉN PROPORCIONA SOPORTE PARA DOCUMENTOS XML, JSON, HTML Y BINARIOS.
                            A DIFERENCIA DE LA MAYORÍA DE LOS SISTEMAS DE ADMINISTRACIÓN DE BASES DE DATOS RELACIONALES,
                            PROPORCIONA XQUERY Y XSLT COMO LENGUAJES DE PROGRAMACIÓN DE APLICACIONES Y CONSULTAS.
                         
                    * X-HIBE DB:
                            ES UNA PODEROSA BASE DE DATOS XML NATIVA DISEÑADA PARA DESARROLLADORES DE SOFTWARE
                            QUE REQUIEREN FUNCIONES AVANZADAS DE PROCESAMIENTO Y ALMACENAMIENTO DE DATOS XML DENTRO DE SUS APLICACIONES.
                         
                    * TAMINO DB:
                            ES UNA BASE DE DATOS XML NATIVA.
                            SI LA COMPARAMOS CON UNA BASE DE DATOS RELACIONAL, TIENE LA DESVENTAJA DE NO SER MUY POPULAR.
                            SIN EMBARGO, SI PARA TRABAJAR CON ELLA, SE PARTE DE UNO DATOS YA ESTRUCTURADOS,
                            SE PUEDEN ENCONTRAR MUCHAS VENTAJAS Y POSIBLEMENTE SEA UNA OPCIÓN PREFERENTE,
                            FRENTE A UN MOTOR SQL TRADICIONAL.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        **********************************************************************************************************************************
                       
            REQUISITOS DE SISTEMA RECOMENDADOS:
                         
                    * SI INSTALAMOS UNA VERSIÓN FINAL SUPERIOR A LA VERSIÓN 3.0 TENDREMOS QUE TENER INSTALADO PREVIAMENTE EL JDK JAVA 8.
                    * DEBEMOS ASIGNAR 128 MB DE MEMORIA CACHÉ.
                    * DEBEMOS DE TENER 1024 MB DE MEMORIA RAM DISPONIBLES PARA PODERLE ASIGNAR AL APLICATIVO.
                         
            http://exist-db.org/exist/apps/homepage/index.html 
                         
            UNA VEZ DESCARGADO EL ARCHIVO .jar --> DESCOMPRIMIR E INSTALAR.
            
            HACEMOS DOBLE CLIC EN EL FICHERO Y LANZAREMOS DIRECTAMENTE LA APLICACIÓN.
                         
            EN EL PROCESO DE INSTALACIÓN SE NOS PREGUNTARA SOBRE EL DIRECTORIO HABITUAL DE NUESTRA APLICACIÓN POR SI QUEREMOS MODIFICARLO.
            TAMBIÉN SE NOS OFRECERÁ UN DIRECTORIO DE DONDE COGERÁ LOS FICHEROS DE INFORMACIÓN,
            PODEMOS DEJAR EL QUE NOS OFRECE EXIST O CAMBIARLO AL QUE DECIDAMOS.
                         
            A CONTINUACIÓN, NOS ENCONTRAREMOS LA CONFIGURACIÓN DE MEMORIA Y TAMBIÉN LA CONTRASEÑA DEL USUARIO ADMIN.
            ESTA CUENTA PERTENECERÁ A LA PERSONA QUE ESTÁ LLEVANDO A CABO LA INSTALACIÓN,
            POR LO QUE DETERMINADAS FUNCIONALIDADES EN ESTE GESTOR, SOLO PODRÁN SER EJECUTADAS CON DICHO USUARIO.
            ASÍ QUE UNA BUENA RECOMENDACIÓN ES CUMPLIMENTAR EL CAMPO PASSWORD DEL USUARIO ADMIN. CON UNA CONTRASEÑA FUERTE.
                         
            FINALMENTE, EN ESTE PUNTO, ES NECESARIO CONFIGURAR Y ESTABLECER LA CANTIDAD DE MEMORIA RAM 
            QUE QUEREMOS DARLE A NUESTRO PROCESO JAVA Y A NUESTRA MEMORIA CACHÉ.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        **********************************************************************************************************************************
                       
            PAQUETES QUE PODEMOS AGREGAR A LA INSTALACIÓN:
                         
                    * EL PAQUETE 'CORE':
                            ES REQUERIDO PARA LA INSTALACIÓN,
                            YA QUE ES UNO DE LOS ELEMENTOS QUE NOS PERMITIRÁ 'CORRER' LA BASE DE DATOS.
                         
                    * EL PAQUETE 'SOURCES':
                            ES OPCIONAL DESELECCIONARÍAMOS DICHO PAQUETE SI TUVIÉRAMOS PROBLEMAS DE ESPACIO,
                            SI NO, ES PREFERIBLE INSTALARLO. 
                         
                    * EL PAQUETE 'APP':
                            NOS PERMITE SELECCIONAR O DESELECCIONAR UNA SERIE DE APPS
                            QUE SERÁN INSTALADAS CUANDO EXISTDB ARRANQUE POR PRIMERA VEZ.
                            ES RECOMENDABLE DEJARLAS PARA DAR LOS PRIMEROS PASOS.
                         
            UNA VEZ HECHAS LAS SELECCIONES OPORTUNAS, CLICAMOS EN NEXT, Y FINALIZAREMOS LA INSTALACIÓN.
                         
            PARA LANZAR LA BASE DE DATOS EN LINUX O EN WINDOWS,
            SIMPLEMENTE EJECUTAREMOS EL ACCESO DIRECTO QUE NOS HA GENERADO LA INSTALACIÓN EN EL MENÚ DE INICIO.
            APARECERÁ UN LOGO INICIAL CON UNA IMAGEN SPLASH MIENTRAS LAS APLICACIONES SELECCIONADAS PREVIAMENTE SE VAN INSTALANDO.
            UNA VEZ TENEMOS NUESTRA BASE DE DATOS INSTALADA LOCALIZAREMOS UN NUEVO ICONO DE BANDEJA DEL SISTEMA
            QUE NOS DARÁ ACCESO A TODAS LAS HERRAMIENTAS QUE NOS OFRECE EXISTDB Y NOS PERMITIRÁ APAGAR O REINICIAR LA BASE DE DATOS.
                         
            SI QUEREMOS LANZAR NUESTRA BASE DE DATOS DESDE LÍNEA DE COMANDOS
            NOS DIRIGIREMOS AL DIRECTORIO DE INSTALACIÓN DE LA BASE DE DATOS
            Y LLAMAREMOS A 'launcher.sh' O 'launcher.bat' DEPENDIENDO SI USAMOS LINUX O WINDOWS.
                         
            UNA VEZ INSTALADO Y LANZADO PODEMOS NAVEGAR HASTA EL DASHBOARD DE LA BASE DE DATOS,
            ABRIÉNDOLO DESDE EL ICONO DE SISTEMA O ACCEDIENDO DIRECTAMENTE A:   http://localhost:8080/exist/
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        **********************************************************************************************************************************
                       
            LAS BASES DE DATOS NATIVAS XML PUEDEN SER CLASIFICADAS DEPENDIENDO EL TIPO DE ALMACENAMIENTO QUE VAYAN A UTILIZAR,
            DE ESTE MODO, A CONTINUACIÓN, VEREMOS LOS DIFERENTES MODOS DE ALMACENAMIENTO
            DE LOS QUE DISPONEMOS EN UNA BASE DE DATOS NATIVA XML:
                         
                    - ALMACENAMIENTO BASADO EN TEXTO:
                            ESTA MODALIDAD CONSISTE EN ALMACENAR EL DOCUMENTO COMPLETO EN BASE DE DATOS,
                            Y DOTAR A LA MISMA, DE ALGÚN TIPO DE FUNCIONALIDAD PARA QUE SE PUEDA ACCEDER FÁCILMENTE A ÉL.
                         
                            EN ESTE TIPO DE ALMACENAMIENTO SUELE REALIZARSE LA COMPRESIÓN DE FICHEROS.
                            TAMBIÉN AÑADIR ALGUNOS ÍNDICES ESPECÍFICOS PARA AUMENTAR LA EFICIENCIA.
                            LAS POSIBILIDADES PARA ESTO SERÍAN DOS:
                                    * ALMACENAR EL FICHERO BINARIO DE TIPO BLOB EN UN SISTEMA RELACIONAL. 
                                    * GUARDAR DICHO FICHERO EN UN SOPORTE O ALMACÉN ORIENTADO A DICHA OPERACIÓN CON ÍNDICES,
                                      SOPORTE DE TRANSACCIONES ETC.
                         
                    - ALMACENAMIENTO BASADO EN MODELO:
                            PARA ESTE CASO, SE UTILIZARÍA UN MODELO DE DATOS LÓGICO COMO POR EJEMPLO PUEDE SER DOM,
                            PARA DEFINIR LA ESTRUCTURA Y LA JERARQUÍA DE LOS DOCUMENTOS XML QUE SE VAYAN A ALMACENAR. 
                         
                            SE GUARDARÍA EL MODELO DEL DOCUMENTO EN UN ALMACÉN DEFINIDO PREVIAMENTE. 
                         
                            PARA ESTO, TENEMOS ALGUNAS POSIBILIDADES COMO:
                                    * TRADUCIR DESDE DOM A TABLAS DE UNA BASE DE DATOS CONVENCIONAL RELACIONAL.
                                    * TRADUCIR EL OBJETO DOM A OBJETOS EN UNA BASE DE DATOS ORIENTADA A OBJETOS.
                                    * USAR UN ALMACÉN DE DATOS CREADO ESPECÍFICAMENTE PARA ESTA UTILIDAD.
                         
                    - ALMACENAR EN LOCAL.
                            ALMACENAR UNA FORMA MODIFICADA DEL DOCUMENTO EN LOCAL.
                         
                            REALMENTE CONSISTE EN ALMACENAR UNA FORMA MODIFICADA DEL FICHERO XML BASE COMPLETO,
                            DIRECTAMENTE EN SISTEMA DE ARCHIVOS.
                         
                            PODREMOS USAR ESTE TIPO DE ALMACENAMIENTO, DEBEN CUMPLIRSE 2 CONDICIONES:
                                    - LA CANTIDAD DE FICHEROS A ALMACENAR NO SEA MUY ELEVADA.
                                    - NO SE REALICEN NUMEROSAS ACTUALIZACIONES NI TRANSFERENCIAS DE LOS MISMOS.
                                                  
                            EVIDENTEMENTE TIENE DIFERENTES LIMITACIONES COMO:
                                    - BAJA ESCALABILIDAD.
                                    - MENOS FLEXIBILIDAD.
                                    - MALA RECUPERACIÓN. 
                                    - Y BAJA SEGURIDAD.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        **********************************************************************************************************************************
                       
            A CONTINUACIÓN, REALIZAREMOS UNA CONEXIÓN CON LA BASE DE DATOS EXISTDB COMO EJEMPLO.
            PARA ELLO DEBEREMOS DE TENER EN CUENTA CIERTOS ASPECTOS:
                         
                    - ORG.XMLDB.API:
                            NOS ENRIQUECERÁ EL CÓDIGO CON LAS INTERFACES Y DatabaseManager.
                         
                    - ORG.XMLDB.API.BASE:
                            CON ESTA LIBRERÍA ACCEDEREMOS A LAS COLECCIONES,
                            LOS OBJETOS Database, Resource, ResourceIterator, ResourceSet Y ALGUNOS MÁS.
                         
                    - ORG.XMLDB.API.MODULES:
                            ACCEDEREMOS A LOS SERVICIOS DE TRANSACCIONES, XMLResource,
                            SERVICIOS DE XPathQueryService  Y OTROS VARIOS RELACIONADOS.
                         
            UNA VEZ HECHAS LAS CONSULTAS TENDREMOS EN CUENTA EN QUÉ CONSISTE LOS CONCEPTOS DE:
                         
                    - INDEXACIÓN:
                            PERMITEN LA CREACIÓN DE ÍNDICES PARA ACELERAR LAS CONSULTAS FRECUENTES.
                         
                    - IDENTIFICADOR ÚNICO:
                            CADA DOCUMENTO XML ESTÁ ASOCIADO CON UN IDENTIFICADOR ÚNICO,
                            A TRAVÉS DEL CUAL SE PUEDE IDENTIFICAR EN EL REPOSITORIO.
             
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        **********************************************************************************************************************************
                                
            SUPONDREMOS QUE TENEMOS EN NUESTRA APLICACIÓN JAVA YA DESARROLLADA, UNA CLASE DEDICADA AL ACCESO A CAPA DE DATOS,
            DONDE DICHA APLICACIÓN ACCEDERÁ, ESTABLECERÁ CONEXIÓN, REALIZARÁ ALGUNAS CONSULTAS Y OBTENDRÁ RESULTADOS. 
                         
            LOS BLOQUES FUNDAMENTALES DEL CÓDIGO SERÁN LOS SIGUIENTES:
                         
                1.- ACCESO A CAPA DE DATOS:
                         
                        String driver = "org.exist.xmldb.DatabaseImpl";      --->       A.- INDICAREMOS EL DRIVER A CARGAR.

                        Class clase = Class.forName(driver);                 --->       B.- CARGAREMOS EL DRIVER INSTANCIADO.

                        Database database = (Database) clase.newInstance();  --->       C.- INSTANCIAREMOS LA BASE DE DATOS.

                        DatabaseManager.registerDatabase(database);          --->       D.- REGISTRAREMOS LA BASE DE DATOS.
                         
                2.- ACCESO A LA COLECCIÓN: (MÁS TARDE LA CONSULTAREMOS).
                                                                                                      (SUSTITUIR db POR EL NOMBRE DE LA BASE DE DATOS)
                        Collection coleccion =DatabaseManager.getCollection("xmldb:exist://localhost:8080/exist/xmlrpc/db/", "usuario", "contraseña");
                         
                        XPathQueryService service =(XPathQueryService) coleccion.getService("XPathQueryService", "1.0");
                         
                3.- REALIZAREMOS LAS CONSULTAS A LA BASE DE DATOS E ITERACIÓN:
                         
                        ResourceSet resultado = service.query("for $b in doc('prueba.xml')//a return $b");
                         
                LOS RESULTADOS OBTENIDOS SE ALMACENARÁN EN LA VARIABLE resultado
                QUE POSTERIORMENTE TENDREMOS QUE ITERAR SOBRE ELLA, Y REALIZAR EL PROCESAMIENTO.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        **********************************************************************************************************************************
                       
            TAMBIÉN ES POSIBLE AGREGAR NUEVOS RECURSOS XML Y NO XML A LA COLECCIÓN (OBJETO DE 'Collection').
            PARA ESTO, SE NECESITAN LAS SIGUIENTES CLASES Y MÉTODOS:
                         
                    - CLASE Collection:
                         
                            LA CLASE Collection REPRESENTA UNA COLECCIÓN DE RECURSOS (resource)
                            ALMACENADOS EN UNA BASE DE DATOS XML.
                            LOS MÉTODO MÁS RELEVANTES PARA AGREGAR NUEVOS RECURSOS EN ESTA CLASE SON:
                         
                                    - storeResource(resource res):
                                            ALMACENA EL RECURSO RES PROPORCIONADO POR EL PARÁMETRO EN LA COLECCIÓN.
                         
                                    - removeResource(recurso res):
                                            ELIMINA EL RECURSO RES PASADO AL RECURSO A TRAVÉS DE PARÁMETROS DE LA COLECCIÓN.
                         
                            OTROS MÉTODOS INTERESANTES DE LA COLECCIÓN, ÚTILES PARA CREAR Y ELIMINAR NUEVOS RECURSOS, SON:
                         
                                    - listResources():
                                            QUE DEVUELVE UNA MATRIZ DE CADENAS QUE CONTIENE LOS IDS 
                                            DE TODOS LOS RECURSOS QUE TIENE LA COLECCIÓN.
                         
                                    - getResourceCount(): 
                                            OBTIENE LA CANTIDAD DE RECURSOS ALMACENADOS EN LA COLECCIÓN.
                         
                                    - createResource(java.lang.String id, java.lang.String type): 
                                            CREA UN NUEVO RECURSO VACÍO EN LA COLECCIÓN,
                                            CUYO ID Y TIPO SON PASADOS POR PARÁMETROS.
                         
            SI YA SE COMPRENDE EL PROCESO DE CREACIÓN DE UN NUEVO RECURSO,
            SE PUEDE DEFINIR EL PROCESO DE ELIMINACIÓN MÁS FÁCILMENTE.
            PARA ESTO, LA CLASE Collection VUELVE A INTERVENIR.
            LA FORMA PRINCIPAL DE ELIMINAR RECURSOS ES: 
                         
                                    - removeResource(resource res):
                                            QUE ELIMINA RESOURCE RES DE LA COLECCIÓN. 
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
        **********************************************************************************************************************************
                         
            A CONTINUACIÓN, VEREMOS UN EJEMPLO DE AGREGACIÓN Y BORRADO DE COLECCIONES EN CÓDIGO:
                         
                    public Collection anadirColeccion(Collection contexto, String newColec) throws ExcepcionGestorBD {
                         
                        Collection newCollection = null;
                        try {
                            // CREAMOS UN NUEVO SERVICIO
                            CollectionManagementService mgtService = (CollectionManagementService) contexto.getService("CollectionManagementService", "1.0");
                         
                            // CREAMOS UNA NUEVA Collection CON CODIFICACIÓN UTF8
                            newCollection = mgtService.createCollection(new String(UTF(.encode(newColec))))??
                         
                        } catch (XMLDBException e) {
                            throw new ExceptionGestorDB ("Error agregando coleccion: " + e.getMesagget());
                        }
                        return newCollection;
                    }
                         
            SI LO QUE DESEAMOS ES BORRAR DICHA COLECCIÓN
            SIMPLEMENTE TENDREMOS QUE LLAMAR AL MÉTODO  removeCollection(String nombre) 
            DE LA CLASE 'ColeectionManagementService'.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
        **********************************************************************************************************************************
                       
            ESTUDIAREMOS DISTINTAS ACCIONES PARA MODIFICAR EL CONTENIDO DE UN ÁRBOL DOM.
                         
                    - MODIFICAREMOS EL VALOR DEL TEXTO ASOCIADO A UNA ETIQUETA.
                         
                            Node nodo = raiz.getElementsByTagName("nombreDelTag").item(0);
                            nodo.setTextContent("Otro");                                     // ESTABLECEMOS Y MODIFICAMOS EL VALOR DEL TEXTO
                         
                            CON ESTE CÓDIGO, ESTAREMOS OBTENIENDO UN NODO CON getElementsByTagName
                            Y A CONTINUACIÓN, CON EL MÉTODO 'setTextContent'
                            ESTAREMOS ESTABLECIENDO Y MODIFICANDO EL VALOR DEL TEXTO ASOCIADO A DICHA ETIQUETA.

                    - PODREMOS MODIFICAR EL VALOR DE UN ATRIBUTO ASOCIADO A UNA ETIQUETA.
                         
                            IMAGINEMOS QUE POSEEMOS UN OBJETO DE LA CLASE 'Node' QUE REPRESENTA UNA ETIQUETA.
                            LA IDEA ES CONVERTIR DICHO OBJETO A UN OBJETO DE LA CLASE 'Element'
                            PARA UTILIZAR EL MÉTODO 'setAttribute(String)'.
                         
                            PARA ELLO TENDREMOS QUE REALIZAR UN CASTING DE 'Element' SOBRE EL NODO DESEADO.
                            A CONTINUACIÓN, PODEMOS VER EL CÓDIGO:
                         
                            Element elemento = doc.getDocumentElement();
                            elemento.setAttribute("nombre", "valor");                          // EXTRAEMOS EL ELEMENTO
                         
                            TAL Y COMO PODEMOS OBSERVAR EN EL CÓDIGO ANTERIOR,
                            EXTRAEMOS EL ELEMENTO Y TRABAJAMOS CON EL MÉTODO 'setAttribute',
                            INDICÁNDOLE EL NOMBRE DE LA ETIQUETA, Y A CONTINUACIÓN,
                            INTRODUCIENDO EL VALOR DESEADO.
                            PARA OBTENER DICHO CONTENIDO SIMPLEMENTE USARÍAMOS:
                         
                            System.out.println(elemento.getAttribute("nombre"));               // OBTENEMOS ELEMENTO
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_14 + """
        **********************************************************************************************************************************
                       
            EN ALGUNOS DE LOS EJEMPLOS EXPUESTOS EN EL TEMA
            EXISTE EL CONCEPTO DE TRANSACCIÓN: 
                    UN CONJUNTO DE DECLARACIONES EJECUTADAS QUE FORMAN INSEPARABLEMENTE UNA UNIDAD DE TRABAJO,
                    DE MODO QUE TODAS SE EJECUTAN O NO SE EJECUTAN.
                         
            AL ADMINISTRAR LAS TRANSACCIONES, 
            EL ADMINISTRADOR O GESTOR XML TIENE QUE:
                         
                    - PROPORCIONA ACCESO SIMULTÁNEO A LOS DATOS ALMACENADOS.
                         
                    - MANTIENE LA INTEGRIDAD Y SEGURIDAD DE LOS DATOS.
                         
                    - PROPORCIONA UN MECANISMO DE RECUPERACIÓN DE FALLOS EN LA BASE DE DATOS.
                         
            Exist-DB ADMITE TRANSACCIONES COMPATIBLES CON ACID:
            CUMPLEN LAS SIGUIENTES CARACTERÍSTICA:
                         
                    - ATOMICIDAD:
                            SE DEBEN COMPLETAR TODAS LAS OPERACIONES DE LA TRANSACCIÓN,
                            O NO REALIZAR NINGUNA OPERACIÓN, NO SE PUEDE DEJAR A LA MITAD. 
                         
                    - CONSISTENCIA:
                            LA TRANSACCIÓN FINALIZA SOLO CUANDO LA BASE DE DATOS PERMANECE EN UN ESTADO COHERENTE.
                         
                    - AISLAMIENTO:
                            LAS TRANSACCIONES SOBRE UNA MISMA INFORMACIÓN DEBEN SER INDEPENDIENTES
                            PARA QUE NO INTERFIERAN CON SUS OPERACIONES, Y NO GENEREN NINGÚN TIPO DE ERROR. 
                         
                    - DURABILIDAD:
                            AL FINAL DE LA TRANSACCIÓN,
                            EL RESULTADO DE LA MISMA SE CONSERVARÁ Y NO SE PODRÁ DESHACER INCLUSO SI EL SISTEMA FALLA.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_15 + """
        **********************************************************************************************************************************
                       
            LA CLASE XMLDBException CAPTURA TODOS LOS ERRORES QUE OCURREN CUANDO SE USA XML (DB PARA PROCESAR LA BASE DE DATOS). 
            ESTA EXCEPCIÓN CONTENDRÍA DOS CÓDIGOS DE ERROR: 
                         
                * UN CÓDIGO DE ERROR ESPECIFICADO POR CADA SISTEMA DE PROCESAMIENTO XML LOCAL (FABRICANTE-PROVEEDOR).
                         
                * UN CÓDIGO DE ERROR DEFINIDO EN LA CLASE ErrorCodes. 
                         
            SI EL ERROR QUE OCURRIÓ EN UN MOMENTO DADO ES PARTE DEL SISTEMA DE ADMINISTRACIÓN XML,
            ErrorCode DEBE TENER UN VALOR DE errorCodes, VENDOR_ERROR.
                         
            LA CLASE ErrorCodes DEFINE LOS DIFERENTES CÓDIGOS DE ERROR XML:DB 
            UTILIZADO POR EL ATRIBUTO errorCodes DE LA EXCEPCIÓN XMLDBEzxception.
            
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_16 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_16 + """
        **********************************************************************************************************************************
                         
            ONLINE:
                        http://exist-db.org/exist/apps/demo/examples/basic/basics.html
                         
                    run  --> PODEMOS EJECUTAR LAS CONSULTAS QUE SE MUESTRAN, Y VER EL RESULTADO.
                    edit --> PODEMOS MODIFICARLAS Y HACER NUEVAS CONSULTAS.
                         
            ENLACES DE INTERÉS:
                         
                    Documentación 'oficial' para el desarrollo en Java contra eXist DB:
                    https://exist-db.org/exist/apps/doc/devguide_xmldb#intro

                    Ejemplos en Java de las diferentes formas de conectarse a eXist DB (extraídos de un libro):
                    https://github.com/eXist-book/book-code/tree/master/chapters/integration

                    XQuery en eXist DB:
                    https://www.youtube.com/watch?v=Kq2C3-OaxA0

                    Ejercicios prácticos de XQuery (resueltos):
                    https://www.ticarte.com/contenido/ejercicios-practicos-de-xquery

                    Ejemplo de configuración de eXistDB en Netbeans (versiones antiguas):
                    https://www.youtube.com/watch?v=pCDpn596eEE

                    Ejemplo de repositorio con ejemplo de aplicacion Java (con formularios):
                    https://github.com/naigos/BaseDatosXML
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
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
                case "16" -> {
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
                }
            }
            try {                
                menu = miTryRecursos();                
                switch (menu) {                   
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));   
    }
}