package Tema_12;

import static Principal_Main.Main.*;
import static Tema_12.T_12.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_12 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_12 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                         
            - ES UNA BASE DE DATOS NO-SQL ORIENTADA A DOCUMENTOS.
                         
            - ESTRUCTURA DE DOCUMENTOS QUE UTILIZA ES EN FORMATO     --->   JSON
              AUNQUE INTERNAMENTE LA BD LOS ALMACENA EN FORMATO      --->   BSON
                         
            - TRABAJA CON DOCUMENTOS M�S 'RICOS':
                    - SE REDUCE EL I/O SOBRE LA BASE DE DATOS.
                      I/O: --> N�MERO DE ENTRADAS Y SALIDAS EFECTUADAS SOBRE LA BASE DE DATOS.
                    - NO EXISTE LA NECESIDAD DE HACER JOINS CUANDO SE NECESITA RELACIONAR DOCUMENTOS ENTRE SI.
                      JOINS: --> ES EL PROCESO DE TOMAR DATOS DE VARIAS TABLAS Y COLOCARLOS EN UNA VISTA GENERADA.
                                 UNA INSTRUCCI�N 'SQL JOIN' EN UN COMANDO SELECT COMBINA LAS COLUMNAS ENTRE
                                 UNA O M�S TABLAS EN UNA BASE DE DATOS RELACIONAL Y RETORNA A UN CONJUNTO DE DATOS.
                         
            - PERMITE OPERACIONES CRUD CON UNA SINTAXIS PARECIDA A   --->  JavaScript.
                    CRUD: 
                            CREATE  -->  CREACI�N
                            READ    -->  LECTURA
                            UPDATE  -->  ACTUALIZACI�N
                            DELETE  -->  BORRADO
                         
            - REPLICA SETS: (CONJUNTO DE R�PLICAS).
                    PROPORCIONAN REPLICACI�N Y ALTA DISPONIBILIDAD.
                    LA INFORMACI�N VA A ESTAR EN DISTINTOS NODOS,
                    LO QUE HAR� QUE EST� DISPONIBLE MUY R�PIDAMENTE.

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
                                 
            - SHARDING PARA EL BALANCEO Y ESCALADO HORIZONTAL.
                    - EL BALANCEO DE LOS DATOS SE REALIZA AUTOM�TICAMENTE.
                    - EL ESCALADO ES LA CAPACIDAD QUE TIENE UN SISTEMA PARA ADAPTARSE AL CRECIMIENTO.
                            - ESCALADO VERTICAL: CRECE A EQUIPOS O NODOS M�S POTENTES.
                            - ESCALADO HORIZONTAL: CRECE EN N�MERO DE EQUIPOS O NODOS.
                    - SHARDING HACE REFERENCIA AL CONCEPTO DE: (FRAGMENTACI�N = PARTICIONADO DE DISCO).
                            SE VAN DISTRIBUYENDO LOS DATOS AUTOM�TICAMENTE
                            EN DISTINTOS SHARDS (CONJUNTO DE SERVIDORES)
                            QUE GUARDAN LOS DIFERENTES DATOS.

            - OFRECE UN MECANISMO DE PROCESAMIENTO MASIVO DE DATOS:
                    - A TRAV�S DE LAS OPERACIONES DE AGREGACI�N.
                    - VA A PERMITIRNOS TRABAJAR CON CONJUNTOS DE UNA FORMA MUY OBTIMA.

            - EL GRUESO DE LOS DATOS RESIDE EN MEMORIA:
                    - LAS LECTURAS Y ESCRITURAS SON MUY R�PIDAS.

            - VA A TRABAJAR CON CAPPED COLLECTION:
                    - COLECCIONES DE TIPO CIRCULAR DE TAMA�O FIJO,
                      QUE MANTIENEN EL ORDEN SEG�N SE HAN IDO INSERTANDO LOS DATOS.
                      AL ENTRAR UN NUEVO DATO, Y AL TENER LA COLECCI�N UN TAMA�O FIJO NO PUEDE CRECER,
                      EL RESULTADO ES QUE MACHACA EL DATO M�S ANTIG�O QUE TENGA.
                      SE VA ACTUALIZANDO LA COLECCI�N DE MANERA CIRCULAR.

            - M�LTIPLES MOTORES DE ALMACENAMIENTO DIFERENTES:
                    - NMAP.
                    - WIREDTIGER.
                    - IN-MEMORY.
                    - ENCRYPTED.

            - FORMA PARTE DE BIG DATA.

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
                       
            EL TEOREMA DE CAP O TAMBI�N LLAMADO DE BREWER,
            SOSTIENE QUE EN SISTEMAS DISTRIBUIDOS NO ES POSIBLE GARANTIZAR AL COMPLETO TRES CARACTER�STICAS:
            LA CONSISTENCIA, LA DISPONIBILIDAD Y LA TOLERANCIA,
            SINO QUE SOLO SE PUEDEN CUMPLIR DOS CONDICIONES A LA VEZ.
                         
                - CONSISTENCIA: (CONSISTENCY).
                        LA INFORMACI�N QUE OBTENEMOS A LA HORA DE REALIZAR UNA CONSULTA DEBE SER SIEMPRE LA MISMA.
                        INDEPENDIENTEMENTE DEL NODO DEL QUE SE EXTRAIGA LA INFORMACI�N, �STA DEBE SER SIEMPRE LA MISMA.
                         
                - DISPONIBILIDAD: (AVAILABILITY).
                        TODOS LOS CLIENTES DEBEN DE PODER REALIZAR LAS OPERACIONES DE LECTURA Y ESCRITURA,
                        AUNQUE UN NODO SE HAYA CAIDO. EL USUARIO NO PERCIBE NING�N PROBLEMA.
                         
                - TOLERANCIA A PARTICIONES: (PARTITION TOL).
                        LOS SISTEMAS, COMO VIMOS EN LA UNIDAD ANTERIOR,
                        PUEDEN ESTAR DIVIDIDOS EN PARTICIONES DISTRIBUIDAS EN DISTINTOS PUNTOS.
                        ESTA PROPIEDAD CONSISTE EN, A PESAR DE ESTA DIVISI�N,
                        EL FUNCIONAMIENTO SIEMPRE DEBE DE ESTAR ASEGURADO.

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
                                 
            NO TODAS LAS BASES DE DATOS CUMPLEN LOS MISMOS PUNTOS DEL TEOREMA DE CAP.
            SEG�N EL TEOREMA DE CAP PODEMOS HACER TRES GRUPOS:

                - AP:   --->   GARANTIZAN: LA DISPONIBILIDAD Y LA TOLERANCIA.
                        BASES DE DATOS M�S CERCANAS AL V�RTICE AP:
                                - ASEGURAN LA DISPONIBILIDAD Y LA TOLERANCIA A PARTICIONES.
                                - NO ASEGURAN AL MENOS EN SU TOTALIDAD, LA CONSISTENCIA.
                                - ALGUNAS DE ELLAS A TRAV�S DE LA REPLICACI�N Y LA VERIFICACI�N,
                                  S� CONSIGUEN EN PARTE MEJORAR LA CONSISTENCIA.
                        EJEMPLOS: 
                                - DynamoDB.
                                - CouchDB.
                                - Cassandra. --> Facebook.
                                - Infinite Graph.
                         
                - CP:   --->   GARANTIZAN: LA CONSISTENCIA Y LA TOLERANCIA.
                        BASES DE DATOS M�S CERCANAS AL V�RTICE CP:
                                - ASEGURAN LA CONSISTENCIA Y LA TOLERANCIA A PARTICIONES.
                                - SACRIFICAN LA DISPONIBILIDAD AL REPLICAR LOS DATOS A TRAV�S DE NODOS.
                        EJEMPLOS:
                                - Hbase.
                                - MongoDB.
                         
                - CA:   --->   GARANTIZAN: LA CONSISTENCIA Y LA DISPONIBILIDAD.
                        BASES DE DATOS M�S CERCANAS AL V�RTICE CA:
                                - ASEGURAN LA CONSISTENCIA Y LA DISPONIBILIDAD.
                                - SACRIFICAN LA TOLERANCIA A PARTICIONES.
                                - ESTE PROBLEMA SE SOLUCIONAR� EN PARTE REPLICANDO LOS DATOS.
                        EJEMPLOS:
                                - BASES DE DATOS RELACIONALES:
                                        - MySQL.
                                        - Oracle.
                                        - SQL Server.
                                - Neo4J.

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
                
            MongoDB ES UN PRODUCTO DE PROP�SITO GENERAL Y ES MUY �TIL PARA M�LTIPLES CASOS DE USO:
                         
                    - CMS (GESTORES DE CONTENIDO), APLICACIONES M�VILES.
                    - GAMING.
                    - E-COMMERCE.
                    - BUSSINESS INTELIGENCE.
                    - ANALYTICS.
                    - IA.
                    - PROYECTOS BIG DATA.
                    - WEB CACH�.
                         
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
                         
                                ***********************************************
                                *      RELACIONAL      *       MONGODB        *
                                ***********************************************
                                *   BASES DE DATOS     *   BASES DE DATOS     *
                                *----------------------*----------------------*
                                *   TABLA              *   COLECCI�N          *
                                *----------------------*----------------------*
                                *   FILA               *   DOCUMENTO          *
                                *----------------------*----------------------*
                                *   �NDICE             *   �NDICE             *
                                *----------------------*----------------------*
                                *   ISERT              *   INSERT             *
                                *----------------------*----------------------*
                                *   SELECT             *   FIND               *
                                *----------------------*----------------------*
                                *   UPDATE             *   UPDATE             *
                                *----------------------*----------------------*
                                *   DELETE             *   REMOVE             *
                                ***********************************************
                         
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
                       
            - CADA ENTRADA DE UNA COLECCI�N ES UN DOCUMENTO.
              EQUIVALENCIAS: (COLECCI�N => TABLA) Y (DOCUMENTO => FILA).
                         
            - SON ESTRUCTURAS DE DATOS COMPUESTAS POR CAMPOS DE CLAVE:VALOR.
                         
            - LOS DOCUMENTOS TIENEN UNA ESTRUCTURA SIMILAR A OBJETOS JSON.
                         
            - LOS DOCUMENTOS SE CORRESPONDEN CON TIPOS DE DATOS NATIVOS EN LOS LENGUAJES DE PROGRAMACI�N.
                         
            - EN UN DOCUMENTO ES POSIBLE EMBEBER OTROS DOCUMENTOS O ARRAYS.
                         
            - SE TIENE UN ESQUEMA DIN�MICO QUE PERMITE POLIMORFISMO DE MANERA FLUIDA.
                         
            - LAS OPERACIONES DE ESCRITURA SON SOLO AT�MICAS A NIVEL DE DOCUMENTO.
                         
            EJEMPLO DE DOCUMENTO BSON DE MongoDB:
            (SIMILAR A OBJETOS JSON)
                         
                    {                                                           |
                    "_id" : ObjectId("5457a502e308f720d8999e97"),               |  VEMOS LOS CAMPOS COMPUESTOS POR CLAVE:VALOR.
                    "Nombre": "Francisco",                                      |
                    "Apellidos" : "Fernandez Rioja",                            |  LA CLAVE SER� DE TIPO STRING.
                    "Edad" : 30,                                                |  PERO EL VALOR PUEDE SER ...
                    "Aficiones": "{ "Comics" : null,                            |          - UN STRING.
                            "Deportes": ["squash", "nataci�n"]                  |          - UN N�MERO.
                            },                                                  |          - UN ARRAY.               -->  []
                    "Empresa" : "XXXSA",                                        |          - UN OBJETO CLAVE:VALOR.  -->  {}
                    "Cargo" : "MongoDB DBA",                                    |
                    "Tecnolog�as" : ["Openstack" , "Openshift","MongoDB"],      |
                    "Proyectos" : "{ "Openstack": ["Cliente1","Cliente2"],      |
                            "Openshift": ["Cliente4"]                           |
                            }                                                   |
                    }                                                           |
                         
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
                       
            EL PAQUETE DE MongoDB CONTIENE ALGUNOS FICHEROS BINARIOS,
            UTILIZADOS PARA ARRANCAR EL SERVIDOR DE LA BASE DE DATOS Y ACCEDER AL SHELL (TERMINAL, CONSOLA) DE LA MISMA.
            ALGUNOS DE ELLOS SON:
                         
                - mongod:
                        SERVICIO PRINCIPAL DE MongoDB.
                        MANEJA LOS ACCESOS A LOS DATOS, LAS PETICIONES DE DATOS, Y EJECUTA TAREAS DE MANTENIMIENTO EN BACKGROUND.
                        SU FICHERO DE CONFIGURACI�N ES -->  mongod.conf
                         
                - mongo:
                        SHELL INTERACTIVA DE MongoDB.
                        APORTA UN ENTORNO FUNCIONAL COMPLETO PARA SER USADO CON LA BASE DE DATOS.
                         
                - mongos:
                        ES UN SERVICIO PROPIO DEL MODO DE DESPLIEGUE DESPLIEGUE Shard.
                        ENRUTA LAS PETICIONES DE LA CAPA DE APLICACI�N
                        Y DETERMINAR LA UBICACI�N DE LOS DATOS EN LOS DIFERENTES SHARDS DEL DESPLIEGUE.
                         
                - mongodump:
                        UTILIDAD PARA CREAR UN EXPORT BINARIO DEL CONTENIDO DE UNA BASE DE DATOS.
                        PODEMOS CONSIDERAR MongoDB COMO UNA HERRAMIENTA M�S PARA REALIZAR COPIAS DE SEGURIDAD.
                        PODREMOS USAR ESTA HERRAMIENTA CONTRA 'mongod' O 'mongos' TENIENDO EN CUENTA
                        QUE 'mongod' PODR� ESTAR ARRANCADO O PARADO INDISTINTAMENTE.
                         
                - mongorestore:
                        EN CONJUNCI�N CON mongodump, SE UTILIZA PARA RESTAURAR LOS RESPALDOS CON mongodump.
                         
                - mongooplog:
                        HERRAMIENTA QUE PERMITE HACER 'POLLING' DEL OpLog DE UN SERVIDOR REMOTO, Y APLICARLO SOBRE EL SERVIDOR LOCAL.
                        ESTA UTILIDAD LA PODEMOS USAR, POR EJEMPLO, PARA REALIZAR UNA MIGRACI�N EN TIEMPO REAL.
                        ES DECIR, DONDE SE REQUIERE QUE EL SERVIDOR FUENTE SE MANTENGA ONLINE Y EN FUNCIONAMIENTO.
                                OpLog: ES UNA COLECCI�N DENTRO DE LA BASE DE DATOS LOCAL.
                                AQU� SE ESCRIBEN LAS OPERACIONES DE UPDATE,
                                DELETE E INSERT LAS CUALES EST�N ALMACENADAS POR ORDEN DE OPERACI�N
                                Y ESTO PERMITE A LOS OTROS MIEMBROS DE LA R�PLICA APLICAR ESTOS CAMBIOS.
                         
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
                       
            - bsondump:
                    CONVIERTE FICHEROS BSON A ALG�N FORMATO LEGIBLE POR HUMANOS, INCLUIDO A JSON.
                    SE TRATA DE UNA HERRAMIENTA DE AN�LISIS, NUNCA DEBE SER UTILIZADA PARA OTRO TIPO DE ACTIVIDADES.
                         
                          - BSON: (BINARY JSON) ES UN FORMATO DE INTERCAMBIO DE DATOS USADO PARA ALMACENAMIENTO Y TRANSFERENCIA EN MongoDB.
                            ES LA REPRESENTACI�N BINARIA DE ESTRUCTURAS DE DATOS Y MAPAS.
                         
            - mongoexport:
                    PERMITE EXPLORAR LOS DATOS DE UNA INSTANCIA DE MONGODB EN FORMATO JSON O CSV.
                    JUNTO CON mongoimport SON �TILES PARA HACER BACKUP DE UNA PARTE BIEN DEFINIDA DE LOS DATOS DE LA BBDD MONGODB
                    O PARA CASOS CONCRETOS DE INSERCI�N DE DATOS.
                         
            - mongoimport:
                    PERMITE IMPORTAR LOS DATOS DE UNA INSTANCIA DE MONGODB DESDE FICHEROS CON FORMATO JSON O CSV.
                         
            - mongofiles:
                    MANEJA FICHEROS EN UNA INSTANCIA DE MONGODB CON OBJETOS GridFS, DESDE LA L�NEA DE COMANDOS.
                    EN Replica Set S�LO PODR� LEER DESDE EL PRIMARIO.
                         
                          - GridFS: ES UNA ESPECIFICACI�N PARA ALMACENAMIENTO Y RECUPERACI�N DE FICHEROS
                            QUE SUPERAN EL TAMA�O L�MITE DE LOS DOCUMENTOS BSON, QUE ES 16 MB.
                         
                          - Replica Set: ES EL MECANISMO QUE NOS PROPORCIONA MongoDB PARA GARANTIZAR
                            LA ALTA DISPONIBILIDAD DE NUESTRAS BASES DE DATOS.
                            LA IDEA CONSISTE EN TENER CORRIENDO VARIAS INSTANCIAS DE MongoDB
                            CON EL FIN DE QUE LA INFORMACI�N SE REPLIQUE ENTRE ELLAS,
                            DE TAL FORMA QUE SI EL NODO PRIMARIO SE CAE, PUEDA SER SUSTITUIDO POR OTRO.
                            HAY DIFERENTES TIPOS DE MIEMBROS (DIFERENTES TIPOS DE NODOS),
                            DOS DE LOS M�S IMPORTANTES SON:
                                    - PRIMARY: NODO SOBRE EL QUE SE REALIZAN LAS ESCRITURAS Y PRINCIPALMENTE LAS LECTURAS.
                                    - SECUNDARY: NODO QUE MANTIENE UNA COPIA DEL DATABASE DEL PRIMARIO
                                      Y PUEDE SER CANDIDATO EN CASO DE QUE �STE NO SE ENCUENTRE DISPONIBLE.
                                      INTERVIENE EN LA ELECCI�N DE UN PRIMARIO.
                         
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
                       
            - mongoperf:
                    COMPROBAR EL PERFORMANCE O RENDIMIENTO DE LAS I/O DE FORMA INDEPENDIENTE A MongoDB.
                        
            - mongostat:
                    UTILIDAD QUE PROPORCIONA UNA R�PIDA VISI�N DEL ESTADO ACTUAL DE LOS SERVICIOS mongod Y mongos.
                    ES SIMILAR A LA UTILIDAD vmstat.
                            vmstat: ES UN COMANDO DE UNIX/LINUX QUE DA INFORMACI�N SOBRE
                            PROCESOS, MEMORIA, PAGINACI�N, E/S DE BLOQUE Y LA ACTIVIDAD DE LA CPU.
                         
            - mongotop:
                    PROPORCIONA UN M�TODO PARA TRAZAR EL TIEMPO QUE UNA INSTANCIA DE MongoDB
                    EMPLEA EN LAS OPERACIONES DE LECTURA/ESCRITURA DE DATOS.
                    PROPORCIONA ESTAD�STICAS A NIVEL DE COLECCI�N, POR DEFECTO, CADA SEGUNDO.
                         
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
                       
            PARA INTERACTUAR CON ESTA BASE DE DATOS UTILIZAREMOS LA SHELL MONGO, QUE B�SICAMENTE:
                         
                    - ES UNA SHELL INTERACTIVA EN JavaScript.
                         
                    - PERMITE EJECUTAR SCRIPTS ESCRITOS EN JavaScript PARA MANIPULACI�N DE DATOS,
                      EJECUCI�N DE COMANDOS EN LA BASE DE DATOS, APLICACI�N DE �NDICES, ETC.
                         
                    - LA SHELL PUEDE SER UTILIZADA PARA:
                            - VISUALIZACI�N DE DATOS.
                            - ADMINISTRACI�N DE LA BASE DE DATOS, INDEPENDIENTEMENTE DE SI ES:
                                    - STANDALONE.    --> �L SOLO.
                                    - REPLICA SET.   --> CONJUNTO DE SERVIDORES DE R�PLICAS.
                                    - SHARDING.      --> CONJUNTO DE SERVIDORES DE FRAGMENTACI�N.
                         
            PARA TRABAJAR CON LA SHELL, EN PRIMER LUGAR,
            NOS CONECTAMOS A LA INSTANCIA QUE HEMOS LEVANTADO ANTERIORMENTE EJECUTANDO EL COMANDO mongo.
                         
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
                       
        **********************************************************************************************************************************
        *    help                                  *    MUESTRA LA AYUDA GENERAL.                                                        *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    db.help()                             *    MUESTRA AYUDA SOBRE LOS COMANDOS DE EJECUTABLES SOBRE BBDD.                      *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    db.<collection>.help()                *    MUESTRA AYUDA SOBRE LOS COMANDOS DE EJECUTABLES SOBRE COLECCIONES.               *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    show dbs                              *    MUESTRA LAS BBDD DEL SERVIDOR.                                                   *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    db                                    *    DEVUELVE EL NOMBRE DE LA BBDD DONDE NOS ENCONTRAMOS POSICIONADOS.                *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    show collections                      *    MUESTRA LAS COLECCIONES CONTENIDAS EN LA BBDD DONDE ESTAMOS POSICIONADOS.        *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    use <db>                              *    NOS POSICIONAMOS SOBRE LA BBDD ACTUAL. PARA CAMBIAR DE BBDD.                     *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    show users                            *    MUESTRA LOS USUARIOS SOBRE LA BBDD ACTUAL.                                       *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    load("<ruta_script>")                 *    CARGA EN LA SESI�N ACTUAL EL SCRIPT CONTENIDO EN LA RUTA ruta_script.            *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    it                                    *    ITERA EL CURSOR SOBRE EL QUE SE HAYA HECHO UNA QUERY.                            *
        *------------------------------------------*-------------------------------------------------------------------------------------*
        *    db.createCollection("<collection>")   *    CREA UNA COLECCI�N NUEVA, SOBRE LA QUE A CONTINUACI�N SE PODR�N INSERTAR DATOS.  *
        **********************************************************************************************************************************
                         
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
                       
                REGISTRO EN MONGODB ATLAS.
                         
            1.  BUSCAMOS LA WEB DE MONGODB ATLAS:   https://www.mongodb.com/atlas/database

            2.  PULSAMOS EN 'PRUEBA GRATUITA':   -->  COMPLETAMOS EL REGISTRO CON NUESTROS DATOS.

            3.  UNA VEZ CONECTADOS: --> AGREGAR IP PARA PODER CONECTAR.
                EN NETWORK ACCESS 'ACCESO A LA RED' PODR�S MODIFICAR LA CONFIGURACI�N SI FUERA NECESARIO.

            4.  CREATE A DATABASE:
                SELECCIONAMOS  -->  BUID A DATABASE 'CONSTRUIR UNA BASE DE DATOS'

            5.  AHORA OPTAMOS POR LA OPCI�N GRATUITA  --> FREE - SHARED  'GRATIS - COMPARTIDA'  -->  CREATE.

            6.  CLOUD PROVIDER & REGION 'PROVEEDOR DE NUBE Y REGI�N' -->
                        EN ESTE CASO VOY A DEJAR LO QUE ME SALE POR DEFECTO , PERO PUEDES SELECCIONAR CUALQUIERA.
                                CLOUD PROVIDER  --> AWS
                                REGION          --> PARIS
                 --> CREATE CLUSTER 'CREAR CLUSTER'
                        
            7.  USERNAME AND PASSWORD 'NOMBRE DE USUARIO Y CONTRASE�A'  -->  COMPLETAMOS. --> CREATE USER 'CREAR USUARIO'
                         
            8.  SI A�N NO TENEMOS NUESTRA IP A�ADIDA ES EL MOMENTO -->
                        ADD ENTRIES TO YOUR IP ACCESS LIST 'AGREGUE ENTRADAS A SU LISTA DE ACCESO IP'
                        ADD MY CURRENT IP ADDRESS 'AGREGAR MI DIRECCI�N IP ACTUAL'  --> ADD ENTRY 'A�ADIR ENTRADA'
                --> FINISH AND CLOSE 'TERMINAR Y CERRAR'
                         
            9.  AHORA TENEMOS CREADO UN NODO EN MONGODB EN MODO REPLICA: --> GO TO DATABASE 'IR A LA BASE DE DATOS'
                         
                    Congratulations on setting up access rules!
                    You will now be able to connect to your deployments.
                    You can continue to add and update access rules in Database Access and Network Access.

                    Hide Quickstart guide in the navigation.
                    You can visit Project Settings to access it in the future.
                         
                    �Felicitaciones por configurar las reglas de acceso!
                    Ahora podr� conectarse a sus implementaciones.
                    Puede continuar agregando y actualizando reglas de acceso en Acceso a la base de datos y Acceso a la red.
                    
                    Ocultar la gu�a de inicio r�pido en la navegaci�n.
                    Puede visitar Configuraci�n del proyecto para acceder a �l en el futuro.
                         
            10. EN LOAD 'SAMPLE DATABASE' PODEMOS CARGAR DATOS DE EJEMPLOS EN LA BASE DE DATOS,
                SER�N UNA SERIE DE BASES DE DATOS Y DE COLECCIONES PARA PODER PRACTICAR.
                         
            11. EN 'BROWSE COLLECTION' PODEMOS VER QUE BASES DE DATOS EST�N CARGADAS.
                PODREMOS VER LOS DOCUMENTOS DE EJEMPLO.
                PODREMOS APLICAR LOS COMANDOS VISTOS EN EL TEMA SOBRE ESAS BASES DE DATOS MONGO.
                PULSANDO 'DATA SERVICES' REGRASAMOS A LA PANTALLA INICIAL.
                         
            12. EN 'CONNECT' PODEMOS OBTENER DIFERENTES FORMAS DE CONECTAR A LA BASE DE DATOS.
                EN NUESTRO CASO, PARA PRACTICAR LO VISTO EN ESTE TEMA  -->  CONNECT WITH THE MONGODB SHELL.
                         
                        - 1. SELECCIONAMOS NUESTRO SISTEMA OPERATIVO. --> DESCARGAMOS UN ZIP.
                         
                        - 2. CREAMOS UNA CARPETA Y DESCOMPRIMIMOS LOS FICHEROS. BUSCAMOS EL FICHERO --> mongosh.exe
                             LO A�ADIMOS A LA VARIABLE DE ENTORNO PATH PARA PODER EJECUTARLO DESDE CUALQUIER SITIO.
                                 - ABRIR VARIABLES DE ENTORNO.
                                 - VARIABLES DE SISTEMAS --> SELECCIONAMOS 'PATH' --> EDITAR.
                                 - NUEVO --> AGREGAR NUESTRA RUTA DEL FICHERO mongosh.exe --> E:\\PROGRAMA\\MongoDB_Shell\\bin
                             PARA CONFIRMAR QUE FUNCIONA --> EN UNA TERMINAL --> mongosh --help
                         
                        - 3. TE DICE TU COMANDO PERSONALIZADO PARA EJECUTAR Y AS� PODER CONECTARTE A LA BASE DE DATOS. --> COPIAR.
                             ABRIMOS CMD, UNA TERMINAL, Y PEGAMOS NUESTO COMANDO DE CONEXI�N.
                                - COMO OPCI�N, SI NO QUEREMOS A�ADIR LA RUTA DEL FICHERO AL PATH,
                                  PODEMOS ABRIR UNA TERMINAL EN LA MISMA RUTA DEL FICHERO mongosh.exe.
                                  EL LA CARPETA DEL FICHERO, BOT�N DERECHO --> ABRIR EN TERMINAL.
                             mongosh "mongodb+srv://cluster0.sdahxxa.mongodb.net/myFirstDatabase" --apiVersion 1 --username juanjoEG
                             SUSTITUIMOS 'myFirstDatabase' POR UN NOMBRE V�LIDO DE NUESTRA BASE DE DATOS.
                             mongosh "mongodb+srv://cluster0.sdahxxa.mongodb.net/sample_airbnb" --apiVersion 1 --username juanjoEG
                                - ES POSIBLE QUE TE PIDA POR SEGURIDAD QUE SE A�ADA .\\ AL PRINCIPIO DEL COMANDO SI CONFIAS EN �L.
                                  .\\mongosh "mongodb+srv://cluster0.sdahxxa.mongodb.net/sample_airbnb" --apiVersion 1 --username juanjoEG
                                  NOS PIDE LA CONTRASE�A DEL USUARIO Y SE CONECTA AL NODO DE MONGODB EN LA NUBE.
                                  SI PONEMOS EL COMANDO: show dbs  --> MUESTRA LAS BASES DE DATOS.
                         
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
                       
            WEB: https://robomongo.org  --> DESCARGAS 'STUDIO 3T'
                        
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
                       
                    *************************************************************************************************
                    *            OPERACI�N          *             MONGO             *             SQL               *
                    *************************************************************************************************
                    *   CREATE                      *   insert/save                 *   INSERT                      *
                    *-------------------------------*-------------------------------*-------------------------------*
                    *   READ                        *   find/finOne                 *   SELECT                      *
                    *-------------------------------*-------------------------------*-------------------------------*
                    *   UPDATE                      *   update/findAndModify/save   *   UPDATE                      *
                    *-------------------------------*-------------------------------*-------------------------------*
                    *   DELETE                      *   remove/drop                 *   DELETE                      *
                    *************************************************************************************************
                         
            - INSERCI�N DE DATOS:
                         
                db.users.inser (                                                INSERT INTO USERS (NAME, AGE, STATUS)
                    {                                                           VALUES ("SUE", 26, "A")
                        name: "sue",
                        age: 26,
                        status: "A"
                    }
                )
                         
            - INSERCI�N DE DATOS:
                                     
                db.users.find (                                                 SELECT TOP(5), MANE, ADDRESS
                    { age: { $gt: 18 },                                         FROM USERS
                    { name: address: 1 }                                        WHERE AGE > 18
                ).limit(5)
                         
            - ACTUALIZAR INFORMACI�N:
                         
                db.users.update(                                                UPDATE USERS
                    { age: { $gt: 18 },                                         SET STATUS = "A"
                    { $set: { status: "A" } },                                  WHERE AGE > 18
                    { multi: true }
                )
                         
            - BORRADO DE DOCUMENTOS:
                         
                db.users.remove(                                                DELETE FROM USERS
                    { status: "D" }                                             WHERE STATUS = "D"
                )
                         
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