package Tema_14;

import static Principal_Main.Main.*;
import static Tema_14.T_14.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    O DATOS, QUE TIENEN ALGUNA RELACI�N ENTRE ELLOS.
                         
                  * LOS CONTENEDORES TAMBI�N PUEDEN TENER SUBCONTENEDORES.
                         
                  * LA GRAN DIFERENCIA CON LAS BASES DE DATOS RELACIONALES 
                    ES QUE LA ESTRUCTURA DE LOS DATOS XML EN UN CONTENEDOR NO TIENE POR QU� SER FIJA.
                         
                          * PODREMOS ALMACENAR DISTINTAS UNIDADES DE NEGOCIO SIN MUCHA RELACI�N DENTRO DEL MISMO CONTENEDOR.
                         
                          * LA INFRAESTRUCTURA LO PERMITE, Y PODEMOS HACERLO, OTRA COSA ES QUE SEA M�S O MENOS RECOMENDABLE.

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

                  * XPATH ES UN EST�NDAR MUNDIAL ESTABLECIDO POR EL 'W3C' PARA NAVEGAR A TRAV�S DE DOCUMENTOS XML.
                    ES UN LENGUAJE QUE SE PUEDE UTILIZAR PARA CONSULTAR DATOS DE DOCUMENTOS XML.
                         
                  * LAS CONSULTAS XPATH SE PUEDEN UTILIZAR PARA ESCANEAR EL CONTENIDO DE DOCUMENTOS XML.

                  * ESTE LENGUAJE SE BASA EN UNA REPRESENTACI�N DE �RBOL DEL DOCUMENTO XML,
                    Y SELECCIONA NODOS SEG�N DIFERENTES CRITERIOS.
                         
            CUANDO SE CONSULTA UNA BASE DE DATOS XML NATIVA:
                         
                 1. EL USUARIO GENERALMENTE ABRE UN CONTENEDOR.
                         
                 2. POSTERIORMENTE, ENV�A DICHA EXPRESI�N XPATH
                    CONTRA TODOS LOS DOCUMENTOS XML EN LA BASE DE DATOS. 

                 3. A CONTINUACI�N, SE DEVUELVE UN CONJUNTO DE DOCUMENTOS XML.
                                   
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
                         
                    ANTIGUAMENTE ESTABA MUY DIFUNDIDA LA CONSIDERACI�N QUE LAS BASES DE DATOS NATIVAS
                    SON M�S LENTAS EN LAS CONSULTAS QUE LAS BASES DE DATOS RELACIONALES,
                    PERO HOY EN D�A YA NO ES DEL TODO CORRECTA.
                         
                    LAS BASES DE DATOS XML ACTUALES SON SEGURAMENTE TAN R�PIDAS COMO LAS RELACIONALES,
                    Y ADEM�S, M�S F�CILES DE MANTENER Y SOPORTAR, CON RESPECTO A DATOS XML SE REFIERE.
                         
            VENTAJAS DEL USO DE LAS BASES DE DATOS XML:
                         
                  * LAS BASES DE DATOS XML NATIVAS SON CAPACES DE ALMACENAR,
                    MANTENER Y CONSULTAR MAYORES CANTIDADES DE DOCUMENTOS XML EN COMPARACI�N A LAS RELACIONALES.
                         
                  * A DIFERENCIA DE LAS RELACIONALES, NO ES NECESARIO CONFIGURAR TABLAS,
                    Y POR TANTO, NO SE NECESITA REALIZAR DISE�OS COMPLICADOS ANTES DE CONFIGURAR LA BASE DE DATOS.
                    UNA TABLA DE BASE DE DATOS CL�SICA TIENE LA DESVENTAJA DE SER SOLO BIDIMENSIONAL,
                    POR LO QUE LA ESTRUCTURA 'M�S PROFUNDA' DEBE IMPLEMENTARSE UTILIZANDO CLAVES SECUNDARIAS,
                    LO QUE PUEDE HACER QUE EL DISE�O DE UNA BASE DE DATOS SEA BASTANTE COMPLICADO.
                         
                  *  LA FACILIDAD DE IMPORTACI�N O EXPORTACI�N HACIA/DESDE OTRAS APLICACIONES CON OTROS FORMATOS.
                         
            DESVENTAJAS DEL USO DE LAS BASES DE DATOS XML:
                         
                  * LAS BASES DE DATOS RELACIONALES EST�N MUY BIEN ESTABLECIDAS, ES TECNOLOG�A YA PROBADA.
                    LAS BASES DE DATOS XML SON UN FEN�MENO ALGO M�S RECIENTE
                    YA QUE ALGUNAS DE LAS PRIMERAS BASES DE DATOS XML NO TIENEN MUCHO M�S DE UNA D�CADA DE ANTIG�EDAD,
                    POR LO QUE LA EXPERIENCIA A�N ES LIMITADA.
                         
                  * XPATH NO ES UN LENGUAJE EXCESIVAMENTE F�CIL DE APRENDER, MIENTRAS QUE SQL EST� MUY EXTENDIDO. 
                    NO MUCHOS DESARROLLADORES Y ADMINISTRADORES DE BASES DE DATOS DOMINAN XPATH.
                    SQL EST� M�S RELACIONADO CON EL LENGUAJE Y LA FORMA HUMANA DE 'PEDIR' CUALQUIER COSA EN GENERAL,
                    POR LO QUE ES ALGO M�S SENCILLO DE APRENDER.
                         
                  * NO TODAS LAS APLICACIONES GESTORAS DE DATOS SOPORTAN DICHO LENGUAJE,
                    TENDR�AMOS QUE BUSCAR CUALES SON LOS COMPATIBLES CON LAS BASES DE DATOS MENCIONADAS.
                         
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
                            LO QUE ELIMINA LA NECESIDAD DE DESCOMPONER DATOS O CONFIGURAR C�MO SE ALMACENAR�N LOS DATOS.
                         
                    * INFONYTE DB:
                            LA TECNOLOG�A DE BASE DE DATOS DE INFONYTE SE DISTINGUE POR EL SOPORTE NATIVO PARA XML,
                            LA INDEPENDENCIA DE LA PLATAFORMA Y EL USO MODERADO DE LOS RECURSOS DEL SISTEMA.
                            POR LO TANTO, SE ADAPTA PERFECTAMENTE 
                            A LOS REQUISITOS TANTO DE ARQUITECTURAS DE COMPONENTES COMO DE DISPOSITIVOS PEQUE�OS.
                            EN ESTOS MERCADOS EMERGENTES, SU LIDERAZGO TECNOL�GICO
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
            
            SISTEMAS GESTORES DE BASES DE DATOS XML LIBRES / C�DIGO ABIERTO:
                         
                    * EXIST DB:
                            ES UN PROYECTO DE SOFTWARE DE C�DIGO ABIERTO PARA BASES DE DATOS NOSQL CONSTRUIDO SOBRE TECNOLOG�A XML.
                            EST� CLASIFICADO COMO UN SISTEMA DE BASE DE DATOS ORIENTADO A DOCUMENTOS NOSQL Y UNA BASE DE DATOS XML NATIVA.
                            TAMBI�N PROPORCIONA SOPORTE PARA DOCUMENTOS XML, JSON, HTML Y BINARIOS.
                            A DIFERENCIA DE LA MAYOR�A DE LOS SISTEMAS DE ADMINISTRACI�N DE BASES DE DATOS RELACIONALES,
                            PROPORCIONA XQUERY Y XSLT COMO LENGUAJES DE PROGRAMACI�N DE APLICACIONES Y CONSULTAS.
                         
                    * X-HIBE DB:
                            ES UNA PODEROSA BASE DE DATOS XML NATIVA DISE�ADA PARA DESARROLLADORES DE SOFTWARE
                            QUE REQUIEREN FUNCIONES AVANZADAS DE PROCESAMIENTO Y ALMACENAMIENTO DE DATOS XML DENTRO DE SUS APLICACIONES.
                         
                    * TAMINO DB:
                            ES UNA BASE DE DATOS XML NATIVA.
                            SI LA COMPARAMOS CON UNA BASE DE DATOS RELACIONAL, TIENE LA DESVENTAJA DE NO SER MUY POPULAR.
                            SIN EMBARGO, SI PARA TRABAJAR CON ELLA, SE PARTE DE UNO DATOS YA ESTRUCTURADOS,
                            SE PUEDEN ENCONTRAR MUCHAS VENTAJAS Y POSIBLEMENTE SEA UNA OPCI�N PREFERENTE,
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
                         
                    * SI INSTALAMOS UNA VERSI�N FINAL SUPERIOR A LA VERSI�N 3.0 TENDREMOS QUE TENER INSTALADO PREVIAMENTE EL JDK JAVA 8.
                    * DEBEMOS ASIGNAR 128 MB DE MEMORIA CACH�.
                    * DEBEMOS DE TENER 1024 MB DE MEMORIA RAM DISPONIBLES PARA PODERLE ASIGNAR AL APLICATIVO.
                         
            http://exist-db.org/exist/apps/homepage/index.html 
                         
            UNA VEZ DESCARGADO EL ARCHIVO .jar --> DESCOMPRIMIR E INSTALAR.
            
            HACEMOS DOBLE CLIC EN EL FICHERO Y LANZAREMOS DIRECTAMENTE LA APLICACI�N.
                         
            EN EL PROCESO DE INSTALACI�N SE NOS PREGUNTARA SOBRE EL DIRECTORIO HABITUAL DE NUESTRA APLICACI�N POR SI QUEREMOS MODIFICARLO.
            TAMBI�N SE NOS OFRECER� UN DIRECTORIO DE DONDE COGER� LOS FICHEROS DE INFORMACI�N,
            PODEMOS DEJAR EL QUE NOS OFRECE EXIST O CAMBIARLO AL QUE DECIDAMOS.
                         
            A CONTINUACI�N, NOS ENCONTRAREMOS LA CONFIGURACI�N DE MEMORIA Y TAMBI�N LA CONTRASE�A DEL USUARIO ADMIN.
            ESTA CUENTA PERTENECER� A LA PERSONA QUE EST� LLEVANDO A CABO LA INSTALACI�N,
            POR LO QUE DETERMINADAS FUNCIONALIDADES EN ESTE GESTOR, SOLO PODR�N SER EJECUTADAS CON DICHO USUARIO.
            AS� QUE UNA BUENA RECOMENDACI�N ES CUMPLIMENTAR EL CAMPO PASSWORD DEL USUARIO ADMIN. CON UNA CONTRASE�A FUERTE.
                         
            FINALMENTE, EN ESTE PUNTO, ES NECESARIO CONFIGURAR Y ESTABLECER LA CANTIDAD DE MEMORIA RAM 
            QUE QUEREMOS DARLE A NUESTRO PROCESO JAVA Y A NUESTRA MEMORIA CACH�.
                         
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
                       
            PAQUETES QUE PODEMOS AGREGAR A LA INSTALACI�N:
                         
                    * EL PAQUETE 'CORE':
                            ES REQUERIDO PARA LA INSTALACI�N,
                            YA QUE ES UNO DE LOS ELEMENTOS QUE NOS PERMITIR� 'CORRER' LA BASE DE DATOS.
                         
                    * EL PAQUETE 'SOURCES':
                            ES OPCIONAL DESELECCIONAR�AMOS DICHO PAQUETE SI TUVI�RAMOS PROBLEMAS DE ESPACIO,
                            SI NO, ES PREFERIBLE INSTALARLO. 
                         
                    * EL PAQUETE 'APP':
                            NOS PERMITE SELECCIONAR O DESELECCIONAR UNA SERIE DE APPS
                            QUE SER�N INSTALADAS CUANDO EXISTDB ARRANQUE POR PRIMERA VEZ.
                            ES RECOMENDABLE DEJARLAS PARA DAR LOS PRIMEROS PASOS.
                         
            UNA VEZ HECHAS LAS SELECCIONES OPORTUNAS, CLICAMOS EN NEXT, Y FINALIZAREMOS LA INSTALACI�N.
                         
            PARA LANZAR LA BASE DE DATOS EN LINUX O EN WINDOWS,
            SIMPLEMENTE EJECUTAREMOS EL ACCESO DIRECTO QUE NOS HA GENERADO LA INSTALACI�N EN EL MEN� DE INICIO.
            APARECER� UN LOGO INICIAL CON UNA IMAGEN SPLASH MIENTRAS LAS APLICACIONES SELECCIONADAS PREVIAMENTE SE VAN INSTALANDO.
            UNA VEZ TENEMOS NUESTRA BASE DE DATOS INSTALADA LOCALIZAREMOS UN NUEVO ICONO DE BANDEJA DEL SISTEMA
            QUE NOS DAR� ACCESO A TODAS LAS HERRAMIENTAS QUE NOS OFRECE EXISTDB Y NOS PERMITIR� APAGAR O REINICIAR LA BASE DE DATOS.
                         
            SI QUEREMOS LANZAR NUESTRA BASE DE DATOS DESDE L�NEA DE COMANDOS
            NOS DIRIGIREMOS AL DIRECTORIO DE INSTALACI�N DE LA BASE DE DATOS
            Y LLAMAREMOS A 'launcher.sh' O 'launcher.bat' DEPENDIENDO SI USAMOS LINUX O WINDOWS.
                         
            UNA VEZ INSTALADO Y LANZADO PODEMOS NAVEGAR HASTA EL DASHBOARD DE LA BASE DE DATOS,
            ABRI�NDOLO DESDE EL ICONO DE SISTEMA O ACCEDIENDO DIRECTAMENTE A:   http://localhost:8080/exist/
                         
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
            DE ESTE MODO, A CONTINUACI�N, VEREMOS LOS DIFERENTES MODOS DE ALMACENAMIENTO
            DE LOS QUE DISPONEMOS EN UNA BASE DE DATOS NATIVA XML:
                         
                    - ALMACENAMIENTO BASADO EN TEXTO:
                            ESTA MODALIDAD CONSISTE EN ALMACENAR EL DOCUMENTO COMPLETO EN BASE DE DATOS,
                            Y DOTAR A LA MISMA, DE ALG�N TIPO DE FUNCIONALIDAD PARA QUE SE PUEDA ACCEDER F�CILMENTE A �L.
                         
                            EN ESTE TIPO DE ALMACENAMIENTO SUELE REALIZARSE LA COMPRESI�N DE FICHEROS.
                            TAMBI�N A�ADIR ALGUNOS �NDICES ESPEC�FICOS PARA AUMENTAR LA EFICIENCIA.
                            LAS POSIBILIDADES PARA ESTO SER�AN DOS:
                                    * ALMACENAR EL FICHERO BINARIO DE TIPO BLOB EN UN SISTEMA RELACIONAL. 
                                    * GUARDAR DICHO FICHERO EN UN SOPORTE O ALMAC�N ORIENTADO A DICHA OPERACI�N CON �NDICES,
                                      SOPORTE DE TRANSACCIONES ETC.
                         
                    - ALMACENAMIENTO BASADO EN MODELO:
                            PARA ESTE CASO, SE UTILIZAR�A UN MODELO DE DATOS L�GICO COMO POR EJEMPLO PUEDE SER DOM,
                            PARA DEFINIR LA ESTRUCTURA Y LA JERARQU�A DE LOS DOCUMENTOS XML QUE SE VAYAN A ALMACENAR. 
                         
                            SE GUARDAR�A EL MODELO DEL DOCUMENTO EN UN ALMAC�N DEFINIDO PREVIAMENTE. 
                         
                            PARA ESTO, TENEMOS ALGUNAS POSIBILIDADES COMO:
                                    * TRADUCIR DESDE DOM A TABLAS DE UNA BASE DE DATOS CONVENCIONAL RELACIONAL.
                                    * TRADUCIR EL OBJETO DOM A OBJETOS EN UNA BASE DE DATOS ORIENTADA A OBJETOS.
                                    * USAR UN ALMAC�N DE DATOS CREADO ESPEC�FICAMENTE PARA ESTA UTILIDAD.
                         
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
                                    - MALA RECUPERACI�N. 
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
                       
            A CONTINUACI�N, REALIZAREMOS UNA CONEXI�N CON LA BASE DE DATOS EXISTDB COMO EJEMPLO.
            PARA ELLO DEBEREMOS DE TENER EN CUENTA CIERTOS ASPECTOS:
                         
                    - ORG.XMLDB.API:
                            NOS ENRIQUECER� EL C�DIGO CON LAS INTERFACES Y DatabaseManager.
                         
                    - ORG.XMLDB.API.BASE:
                            CON ESTA LIBRER�A ACCEDEREMOS A LAS COLECCIONES,
                            LOS OBJETOS Database, Resource, ResourceIterator, ResourceSet Y ALGUNOS M�S.
                         
                    - ORG.XMLDB.API.MODULES:
                            ACCEDEREMOS A LOS SERVICIOS DE TRANSACCIONES, XMLResource,
                            SERVICIOS DE XPathQueryService  Y OTROS VARIOS RELACIONADOS.
                         
            UNA VEZ HECHAS LAS CONSULTAS TENDREMOS EN CUENTA EN QU� CONSISTE LOS CONCEPTOS DE:
                         
                    - INDEXACI�N:
                            PERMITEN LA CREACI�N DE �NDICES PARA ACELERAR LAS CONSULTAS FRECUENTES.
                         
                    - IDENTIFICADOR �NICO:
                            CADA DOCUMENTO XML EST� ASOCIADO CON UN IDENTIFICADOR �NICO,
                            A TRAV�S DEL CUAL SE PUEDE IDENTIFICAR EN EL REPOSITORIO.
             
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
                                
            SUPONDREMOS QUE TENEMOS EN NUESTRA APLICACI�N JAVA YA DESARROLLADA, UNA CLASE DEDICADA AL ACCESO A CAPA DE DATOS,
            DONDE DICHA APLICACI�N ACCEDER�, ESTABLECER� CONEXI�N, REALIZAR� ALGUNAS CONSULTAS Y OBTENDR� RESULTADOS. 
                         
            LOS BLOQUES FUNDAMENTALES DEL C�DIGO SER�N LOS SIGUIENTES:
                         
                1.- ACCESO A CAPA DE DATOS:
                         
                        String driver = "org.exist.xmldb.DatabaseImpl";      --->       A.- INDICAREMOS EL DRIVER A CARGAR.

                        Class clase = Class.forName(driver);                 --->       B.- CARGAREMOS EL DRIVER INSTANCIADO.

                        Database database = (Database) clase.newInstance();  --->       C.- INSTANCIAREMOS LA BASE DE DATOS.

                        DatabaseManager.registerDatabase(database);          --->       D.- REGISTRAREMOS LA BASE DE DATOS.
                         
                2.- ACCESO A LA COLECCI�N: (M�S TARDE LA CONSULTAREMOS).
                                                                                                      (SUSTITUIR db POR EL NOMBRE DE LA BASE DE DATOS)
                        Collection coleccion =DatabaseManager.getCollection("xmldb:exist://localhost:8080/exist/xmlrpc/db/", "usuario", "contrase�a");
                         
                        XPathQueryService service =(XPathQueryService) coleccion.getService("XPathQueryService", "1.0");
                         
                3.- REALIZAREMOS LAS CONSULTAS A LA BASE DE DATOS E ITERACI�N:
                         
                        ResourceSet resultado = service.query("for $b in doc('prueba.xml')//a return $b");
                         
                LOS RESULTADOS OBTENIDOS SE ALMACENAR�N EN LA VARIABLE resultado
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
                       
            TAMBI�N ES POSIBLE AGREGAR NUEVOS RECURSOS XML Y NO XML A LA COLECCI�N (OBJETO DE 'Collection').
            PARA ESTO, SE NECESITAN LAS SIGUIENTES CLASES Y M�TODOS:
                         
                    - CLASE Collection:
                         
                            LA CLASE Collection REPRESENTA UNA COLECCI�N DE RECURSOS (resource)
                            ALMACENADOS EN UNA BASE DE DATOS XML.
                            LOS M�TODO M�S RELEVANTES PARA AGREGAR NUEVOS RECURSOS EN ESTA CLASE SON:
                         
                                    - storeResource(resource res):
                                            ALMACENA EL RECURSO RES PROPORCIONADO POR EL PAR�METRO EN LA COLECCI�N.
                         
                                    - removeResource(recurso res):
                                            ELIMINA EL RECURSO RES PASADO AL RECURSO A TRAV�S DE PAR�METROS DE LA COLECCI�N.
                         
                            OTROS M�TODOS INTERESANTES DE LA COLECCI�N, �TILES PARA CREAR Y ELIMINAR NUEVOS RECURSOS, SON:
                         
                                    - listResources():
                                            QUE DEVUELVE UNA MATRIZ DE CADENAS QUE CONTIENE LOS IDS 
                                            DE TODOS LOS RECURSOS QUE TIENE LA COLECCI�N.
                         
                                    - getResourceCount(): 
                                            OBTIENE LA CANTIDAD DE RECURSOS ALMACENADOS EN LA COLECCI�N.
                         
                                    - createResource(java.lang.String id, java.lang.String type): 
                                            CREA UN NUEVO RECURSO VAC�O EN LA COLECCI�N,
                                            CUYO ID Y TIPO SON PASADOS POR PAR�METROS.
                         
            SI YA SE COMPRENDE EL PROCESO DE CREACI�N DE UN NUEVO RECURSO,
            SE PUEDE DEFINIR EL PROCESO DE ELIMINACI�N M�S F�CILMENTE.
            PARA ESTO, LA CLASE Collection VUELVE A INTERVENIR.
            LA FORMA PRINCIPAL DE ELIMINAR RECURSOS ES: 
                         
                                    - removeResource(resource res):
                                            QUE ELIMINA RESOURCE RES DE LA COLECCI�N. 
                         
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
                         
            A CONTINUACI�N, VEREMOS UN EJEMPLO DE AGREGACI�N Y BORRADO DE COLECCIONES EN C�DIGO:
                         
                    public Collection anadirColeccion(Collection contexto, String newColec) throws ExcepcionGestorBD {
                         
                        Collection newCollection = null;
                        try {
                            // CREAMOS UN NUEVO SERVICIO
                            CollectionManagementService mgtService = (CollectionManagementService) contexto.getService("CollectionManagementService", "1.0");
                         
                            // CREAMOS UNA NUEVA Collection CON CODIFICACI�N UTF8
                            newCollection = mgtService.createCollection(new String(UTF(.encode(newColec))))??
                         
                        } catch (XMLDBException e) {
                            throw new ExceptionGestorDB ("Error agregando coleccion: " + e.getMesagget());
                        }
                        return newCollection;
                    }
                         
            SI LO QUE DESEAMOS ES BORRAR DICHA COLECCI�N
            SIMPLEMENTE TENDREMOS QUE LLAMAR AL M�TODO  removeCollection(String nombre) 
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
                       
            ESTUDIAREMOS DISTINTAS ACCIONES PARA MODIFICAR EL CONTENIDO DE UN �RBOL DOM.
                         
                    - MODIFICAREMOS EL VALOR DEL TEXTO ASOCIADO A UNA ETIQUETA.
                         
                            Node nodo = raiz.getElementsByTagName("nombreDelTag").item(0);
                            nodo.setTextContent("Otro");                                     // ESTABLECEMOS Y MODIFICAMOS EL VALOR DEL TEXTO
                         
                            CON ESTE C�DIGO, ESTAREMOS OBTENIENDO UN NODO CON getElementsByTagName
                            Y A CONTINUACI�N, CON EL M�TODO 'setTextContent'
                            ESTAREMOS ESTABLECIENDO Y MODIFICANDO EL VALOR DEL TEXTO ASOCIADO A DICHA ETIQUETA.

                    - PODREMOS MODIFICAR EL VALOR DE UN ATRIBUTO ASOCIADO A UNA ETIQUETA.
                         
                            IMAGINEMOS QUE POSEEMOS UN OBJETO DE LA CLASE 'Node' QUE REPRESENTA UNA ETIQUETA.
                            LA IDEA ES CONVERTIR DICHO OBJETO A UN OBJETO DE LA CLASE 'Element'
                            PARA UTILIZAR EL M�TODO 'setAttribute(String)'.
                         
                            PARA ELLO TENDREMOS QUE REALIZAR UN CASTING DE 'Element' SOBRE EL NODO DESEADO.
                            A CONTINUACI�N, PODEMOS VER EL C�DIGO:
                         
                            Element elemento = doc.getDocumentElement();
                            elemento.setAttribute("nombre", "valor");                          // EXTRAEMOS EL ELEMENTO
                         
                            TAL Y COMO PODEMOS OBSERVAR EN EL C�DIGO ANTERIOR,
                            EXTRAEMOS EL ELEMENTO Y TRABAJAMOS CON EL M�TODO 'setAttribute',
                            INDIC�NDOLE EL NOMBRE DE LA ETIQUETA, Y A CONTINUACI�N,
                            INTRODUCIENDO EL VALOR DESEADO.
                            PARA OBTENER DICHO CONTENIDO SIMPLEMENTE USAR�AMOS:
                         
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
            EXISTE EL CONCEPTO DE TRANSACCI�N: 
                    UN CONJUNTO DE DECLARACIONES EJECUTADAS QUE FORMAN INSEPARABLEMENTE UNA UNIDAD DE TRABAJO,
                    DE MODO QUE TODAS SE EJECUTAN O NO SE EJECUTAN.
                         
            AL ADMINISTRAR LAS TRANSACCIONES, 
            EL ADMINISTRADOR O GESTOR XML TIENE QUE:
                         
                    - PROPORCIONA ACCESO SIMULT�NEO A LOS DATOS ALMACENADOS.
                         
                    - MANTIENE LA INTEGRIDAD Y SEGURIDAD DE LOS DATOS.
                         
                    - PROPORCIONA UN MECANISMO DE RECUPERACI�N DE FALLOS EN LA BASE DE DATOS.
                         
            Exist-DB ADMITE TRANSACCIONES COMPATIBLES CON ACID:
            CUMPLEN LAS SIGUIENTES CARACTER�STICA:
                         
                    - ATOMICIDAD:
                            SE DEBEN COMPLETAR TODAS LAS OPERACIONES DE LA TRANSACCI�N,
                            O NO REALIZAR NINGUNA OPERACI�N, NO SE PUEDE DEJAR A LA MITAD. 
                         
                    - CONSISTENCIA:
                            LA TRANSACCI�N FINALIZA SOLO CUANDO LA BASE DE DATOS PERMANECE EN UN ESTADO COHERENTE.
                         
                    - AISLAMIENTO:
                            LAS TRANSACCIONES SOBRE UNA MISMA INFORMACI�N DEBEN SER INDEPENDIENTES
                            PARA QUE NO INTERFIERAN CON SUS OPERACIONES, Y NO GENEREN NING�N TIPO DE ERROR. 
                         
                    - DURABILIDAD:
                            AL FINAL DE LA TRANSACCI�N,
                            EL RESULTADO DE LA MISMA SE CONSERVAR� Y NO SE PODR� DESHACER INCLUSO SI EL SISTEMA FALLA.
                         
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
            ESTA EXCEPCI�N CONTENDR�A DOS C�DIGOS DE ERROR: 
                         
                * UN C�DIGO DE ERROR ESPECIFICADO POR CADA SISTEMA DE PROCESAMIENTO XML LOCAL (FABRICANTE-PROVEEDOR).
                         
                * UN C�DIGO DE ERROR DEFINIDO EN LA CLASE ErrorCodes. 
                         
            SI EL ERROR QUE OCURRI� EN UN MOMENTO DADO ES PARTE DEL SISTEMA DE ADMINISTRACI�N XML,
            ErrorCode DEBE TENER UN VALOR DE errorCodes, VENDOR_ERROR.
                         
            LA CLASE ErrorCodes DEFINE LOS DIFERENTES C�DIGOS DE ERROR XML:DB 
            UTILIZADO POR EL ATRIBUTO errorCodes DE LA EXCEPCI�N XMLDBEzxception.
            
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
                         
            ENLACES DE INTER�S:
                         
                    Documentaci�n 'oficial' para el desarrollo en Java contra eXist DB:
                    https://exist-db.org/exist/apps/doc/devguide_xmldb#intro

                    Ejemplos en Java de las diferentes formas de conectarse a eXist DB (extra�dos de un libro):
                    https://github.com/eXist-book/book-code/tree/master/chapters/integration

                    XQuery en eXist DB:
                    https://www.youtube.com/watch?v=Kq2C3-OaxA0

                    Ejercicios pr�cticos de XQuery (resueltos):
                    https://www.ticarte.com/contenido/ejercicios-practicos-de-xquery

                    Ejemplo de configuraci�n de eXistDB en Netbeans (versiones antiguas):
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