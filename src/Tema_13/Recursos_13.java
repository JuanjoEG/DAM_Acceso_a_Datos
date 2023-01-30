package Tema_13;

import static Principal_Main.Main.*;
import static Tema_13.T_13.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_13 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_13 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
            
            EL CONCEPTO DE �NDICES QUE MANEJA MongoDB ES EL MISMO QUE EL QUE SE MANEJA EN OTROS REPOSITORIOS DE INFORM�TICA.
            
                    * PERMITE QUE UNA CONSULTA DEVUELVA INFORMACI�N DE UNA FORMA M�S EFECTIVA.
                         
                    * EN MongoDB LOS �NDICES VAN A ESTAR RELACIONADOS A COLECCIONES ESPEC�FICAS
                      O CAMPOS DE ESTA MISMA COLECCION ESPEC�FICA CON UNA O M�S CLAVES DEFINIDAS.
                         
            SINTAXIS GENERAL PARA CREAR UN �NDICE:      ******************************************
                                                        *   db.collection.createIndex(           *
                                                        *       {<campo_1>:<tipo �ndice>,        *
                                                        *       <campo_2>:<tipo �ndice> ... }    *
                                                        *   {<opciones>})                        *
            CARACTER�STICAS DE LOS �NDICES:             ******************************************
                         
                    * SE ALMACENAN EN MEMORIA.
                         
                    * MEJORAN LAS OPERACIONES DE LECTURA.
                         
                    * PUEDEN PENALIZAR LAS OPERACIONES DE ESCRITURA.
                            * ADEM�S LA OPERACI�N DE ESCRITURA EN S�, SER�N NECESARIAS ACCIONES ADICIONALES.
                                    POR EJEMPLO AL METER UN DATO NUEVO:
                                    HAY QUE INTRODUCIR EL DATO EN TODOS LOS NODOS DONDE EST� REPLICADO,
                                    Y TAMBI�N HAY QUE ACTUALIZAR LOS �NDICES EN LA MEMORIA DE TODOS LOS NODOS.
                         
                    * EN MongoDB POR DEFECTO SE CREA UN �NDICE �NICO SOBRE EL CAMPO  -->  _id
                            * EN LOS SGBD RELACIONALES, HABITUALMENTE SE CREA TAMBI�N UN �NDICE
                              AUTOM�TICAMENTE PARA LOS CAMPOS CLAVES.
                         
                    * NO S�LO SE INDICAN LOS CAMPOS DEL �NDICE SINO EL ORDEN DEL MISMO.
                            * EL ORDEN EN LA CREACI�N DE LOS �NDICES ES FUNDAMENTAL,
                              Y NO ES LO MISMO SI SE INTERCAMBIA EL ORDEN EN LA SINTAXIS, SER�N �NDICES DIFERENTES.
                         
                    * UTILIZACI�N:
                            * LOS �NDICES LOS EMPLEAN LAS QUERYS Y LAS AGREGACIONES.
                            * LOS OPERADORES DE NEGACI�N NO UTILIZAN �NDICES.
                    
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
            
            * MONOCLAVE:
                    INDEXAN POR UN �NICO CAMPO DE LOS DOCUMENTOS DE LA COLECCI�N.
                    CARACTER�STICAS:
                        - S�LO AFECTAN A UN CAMPO DE B�SQUEDA.
                        - INDICAR '-1' O '1' CONFIGURA EL �NDICE COMO DESCENDENTE O ASCENDENTE RESPECTIVAMENTE.
                         
                    ************************************
                    *   db.collection.createIndex(     *
                    *       {<campo>:<-1|1>}           *
                    *   )                              *
                    ************************************
                         
            * COMPUESTOS:
                    INDEXAN POR VARIOS CAMPOS DE LOS DOCUMENTOS DE LA COLECCI�N.
                     
                    ************************************
                    *   db.collection.createIndex(     *
                    *       {<campo_1>:<-1|1>,         *
                    *       <campo_2>: <-1|1>}         *
                    *   )                              *
                    ************************************
                                                  
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

            * UNIQUE:
                    LOS �NDICES MONOCLAVE Y COMPUESTOS, SIMPLES Y M�LTIPLES, PUEDEN ESTAR OBLIGADOS A CONTENER VALORES �NICOS,
                    ESTO LO CONSEGUIMOS, A LA HORA DE CREARLOS A�ADIENDO EL PAR�METRO  -->  unique
                            - S�LO PUEDE HABER UNA CORRESPONDENCIA ENTRE ENTRADA DEL �NDICE Y DOCUMENTO.
                            - CADA VALOR DEL �NDICE DEBE CORRESPONDER CON UN �NICO VALOR.
                            - SE PUEDE UTILIZAR PARA �NDICES DE UN SOLO CAMPO O MULTICAMPO.

                    ************************************
                    *   db.collection.createIndex(     *
                    *       {<campo>:<tipo_�ndice>},   *
                    *       {unique:<true|false>}      *
                    *   )                              *
                    ************************************

            * SPARSE:
                    LOS �NDICES QUE HEMOS MENCIONADO ANTES, INCLUYEN TODOS LOS DOCUMENTOS,
                    INCLUSO AQUELLOS QUE NO CONTENGAN EL CAMPO INDEXADO, O LO TENGAN CON VALOR NULO.
                    TENER EN CUENTA QUE MongoDB NO OBLIGA A QUE USEMOS UN 'ESQUEMA', UNA MISMA ESTRUCTURA PARA LOS CAMPOS DOCUMENTOS,
                    AS� QUE EN REALIDAD NO HAY OBLIGATORIEDAD EN QUE LOS CAMPOS EXISTAN EN EL DOCUMENTO.
                    SI QUEREMOS CREAR �NDICES QUE SOLO INCLUYAN LOS DOCUMENTOS CUYO CAMPO INDEXADO EXISTE, UTILIZAREMOS LA OPCI�N  --> sparse
                            - NO INDEXA CAMPOS CON VALORES NULOS.
                            - LOS VALORES NULOS NO SE INTRODUCEN EN EL �NDICE.
                            - UNA B�SQUEDA QUE UTILICE ESTE �NDICE NO DEVOLVER� DOCUMENTOS QUE NO EST�N EN EL �NDICE:
                              ESTE TIPO DE �NDICE NO TIENE PORQU� CONTENER TODOS LOS DOCUMENTOS DE LA COLECCI�N.

                    ************************************
                    *   db.collection.createIndex(     *
                    *       {<campo>:<tipo_�ndice>,    *
                    *       sparse:<true|false>}       *
                    *   )                              *
                    ************************************

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
            
            * HASHED:
                    - INDEXAN DE FORMA CLAVE-VALOR.
                    - SON �NDICES EN LOS QUE S�LO UN ELEMENTO DEL �NDICE HACE REFERENCIA A UN CAMPO QUE TIENE VALORES DE ARRAY.
                    - SE CREAN TANTAS ENTRADAS DEL �NDICE COMO VALORES CONTENGA EL ARRAY.
                    - PUEDEN SER �NDICES DE UN �NICO CAMPO O COMPUESTOS.
                         
            * TEXT:
                    - �NDICES DE TEXTO.
                         
            * GEOESPACIALES:
                    - INDEXAN POR COORDENADAS ESPACIALES.
                         
            * BACKGROUND:
                    - M�S LENTO, PERO NO BLOQUEA A LOS LECTORES/ESCRITORES.
                         
            * TTL: 
                    - TIME TO LIVE. ES PONER UNA FECHA DE CADUCIDAD A LOS DOCUMENYOS.
                    - ELIMINA DOCUMENTOS DE LA COLECCI�N CUANDO PASA CIERTO TIEMPO O CUANDO ALCANZA LA FECHA DE EXPIRACI�N.
                         
            * PARTIAL:
                    - INDEXA AQUELLOS DOCUMENTOS QUE CUMPLAN UNA CONDICI�N.                      
            
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
            
            * COVERED QUERY:
                    - CONSULTA QUE SE RESUELVE CONTRA UN �NDICE SIN CONSULTAR DATOS DE LA COLECCI�N.
            
                    ************************************
                    *   db.collection.find(            *    <filtro>     -->  ES UNA LISTA DE CONDICIONES SOBRE CLAVES DE LOS �NDICES.
                    *       <filtro>[,{<proyecci�n>}]  *    <proyecci�n> -->  ES UNA LISTA DE LOS CAMPOS QUE QUEREMOS OBTENER
                    *   )                              *                      COMO RESULTADO DE LA CONSULTA.
                    ************************************
            
                    - UTILIZA EL CONCEPTO DE PROYECCI�N DE MongoDB:
                            - UNA MongoDB Proyection ES UNA SELECCI�N DE CAMPOS DE UN DOCUMENTO
                              QUE QUEREMOS QUE DEVUELVA UNA CONSULTA.
                            - USAREMOS LA PROYECCI�N CUANDO QUEREMOS RECUPERAR SOLO UN CONJUNTO DE CAMPOS
                              SELECCIONADOS DE UN DOCUMENT, EN LUGAR DE TODOS.
                            - EL PROP�SITO DE LA PROYECCI�N ES QUE NOS AYUDE A ENCONTRAR UNOS DATOS ESPEC�FICOS.
            
            * BORRADO DE �NDICE:
                    - PARA REALIZAR EL BORRADO DE UN �NDICE.
                         
                    ********************************
                    *   db.collection.dropIndex(   *
                    *       {<nombre_clave>:1}     *
                    *   )                          *
                    ********************************
                    
            * REGENERACI�N DE �NDICE:
                    - PARA VOLVER A CREAR UN �NDICE YA CREADO PREVIAMENTE.
                               
                    ********************************
                    *   db.collection.reIndex()    *
                    ********************************
                         
            * LISTADO DE �NDICES:
                    - PARA LISTAR LOS �NDICES ASOCIADOS A UNA COLECCI�N.
                                                          
                    ********************************
                    *   db.collection.getIndex()   *
                    ********************************
                                                      
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
            
            MongoDB EMPLEA EL CONTROL DE ACCESO BASADO EN ROLES (RBAC) PARA DETERMINAR EL ACCESO DE LOS USUARIOS:
                         
                    - A UN USUARIO SE LE OTORGAN UNO O M�S ROLES QUE DETERMINAN:
                            - EL ACCESO O LOS PRIVILEGIOS DEL USUARIO, A LOS RECURSOS DE NUESTRA BASE DE DATOS MongoDB.
                            - ACCIONES QUE DICHO USUARIO PUEDE REALIZAR.
                         
                    - UN USUARIO DEBE TENER SOLO EL CONJUNTO M�NIMO DE PRIVILEGIOS
                      NECESARIOS PARA GARANTIZAR UN SISTEMA DE PRIVILEGIOS M�NIMOS.
                         
                    - CADA APLICACI�N Y USUARIO DE UN SISTEMA Mongo DEBE ASIGNARSE A UN USUARIO DISTINTO.
                         
            ESTE AISLAMIENTO DE ACCESO FACILITA LA REVOCACI�N DEL ACCESO Y EL MANTENIMIENTO CONTINUO DEL USUARIO.
                         
            PARA CREAR UN USUARIO EN MongoDB PODEMOS EJECUTAR EL COMANDO --> db.createUser()
                    - SI EL USUARIO NO EXISTE LO CREA Y NO DEVOLVER� NADA.
                    - SI EL USUARIO SI EXISTE NOS DEVOLVER� UN ERROR DE DUPLICADO.
          
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
                       
            LA SINTAXIS DE ESTE COMANDO ES:                                         EJEMPLO:
                         
                ****************************************************************    >   use blog
                *   db.createUser(                                             *    >   db.posts.insertOne({title:"Articulo 1"});
                *       {                                                      *    >   db.posts.insertOne({title:"Articulo 2"});
                *       user: "<name>",                                        *    >   db.createUser(
                *       pwd: passwordPrompt(),  // Or  "<cleartext password>"  *            {
                *       customData: { <any information> },                     *            user:"lector",
                *       roles: [                                               *            pwd:"123456",
                *           { role: "<role>", db: "<database>" } | "<role>",   *            roles:[
                *           ...                                                *                {role:"read",db:"blog"}
                *       ],                                                     *            ]
                *       authenticationRestrictions: [                          *        }
                *           {                                                  *        )
                *           clientSource: ["<IP>" | "<CIDR range>", ...],      *    >   db.createUser(
                *           serverAddress: ["<IP>" | "<CIDR range>", ...]      *            {
                *       },                                                     *            user:"escritor",
                *           ...                                                *            pwd:"123456",
                *       ],                                                     *            roles:[
                *       mechanisms: [ "<SCRAM-SHA-1|SCRAM-SHA-256>", ... ],    *                {role:"readWrite",db:"blog"}
                *       passwordDigestor: "<server|client>"                     *            ]
                *   }                                                          *        }
                *   )                                                          *        )
                ****************************************************************
                
                    - user: STRING QUE INDICA EL NOMBRE DEL NUEVO USUARIO.

                    - pwd: STRING DONDE INDICAREMOS LA CONTRASE�A.

                    - CustomData: DE MANERA OPCIONAL, EN ESTE CAMPO (DOCUMENTO) INDICAREMOS INFORMACI�N ADICIONAL.
                      EL NOMBRE COMPLETO, EL ID DEL EMPLEADO, ETC.

                    - roles: EN ESTE ARRAY INDICAREMOS LOS PERMISOS QUE QUERAMOS OTORGARLE AL NUEVO USUARIO.
                      MongoDB TIENE UN CONJUNTO DE ROLES PREDEFINIDOS.
                            - LO DEJAMOS VAC�O SI NO QUEREMOS DOTAR DE PERMISOS.

                    - authentionRestriction: ARRAY OPCIONAL CON EL RANGO DE DIRECCIONES IP
                      DESDE LAS CUALES DICHO USUARIO SE PODR� CONECTAR.

                    - mechanisms: ARRAY OPCIONAL QUE ESPECIFICA SI EL USUARIO TIENE PERMISOS PARA CREAR CREDENCIALES SCRAM.
                      SCRAM: SALTED CHALLENGE RESPONSE AUTHENTICATION MECHANISM. MONGODB DISPONE DE 4 MECANISMOS DE AUTENTIFICACI�N.
                      SCRAM ES EL SISTEMA POR DEFECTO Y M�S B�SICO, ES EL SISTEMA CL�SICO DE USUARIO Y CONTRASE�A.

                    - passwordDigestor: STRING OPCIONAL QUE INDICA SI EL SERVIDOR O EL CLIENTE TRADUCEN LA CONTRASE�A
                    
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
            
            MONGODB EMPLEA EL CONTROL DE ACCESO BASADO EN ROLES, RBAC, PARA CONTROLAR EL ACCESO.
            A UN USUARIO SE LE OTORGAN UNO O M�S ROLES QUE DETERMINAR�N
            EL ACCESO DEL USUARIO A LOS RECURSOS Y OPERACIONES DE LA BASE DE DATOS.
            
            FUERA DE LAS ASIGNACIONES DE FUNCIONES, EL USUARIO NO TIENE ACCESO AL SISTEMA.
                        
            MONGODB NO HABILITA EL CONTROL DE ACCESO BASADO EN ROLES POR DEFECTO.
                         
                    - SE PUEDE HABILITAR LA AUTORIZACI�N DE 2 FORMAS ALTERNATIVAS.
                            - LA CONFIGURACI�N --auth
                            - A TRAV�S DE LA CONFIGURACI�N --> security.authorization
                         
                    - SI SE HABILITA LA AUTENTICACI�N INTERNA TAMBI�N SE HABILITA LA DEL CLIENTE.
                         
                    - UNA VEZ QUE SE HABILITA EL CONTROL DE ACCESO, LOS USUARIOS DEBEN AUTENTICARSE.
                         
            UN ROL OTORGA PRIVILEGIOS PARA REALIZAR ACCIONES ESPEC�FICAS SOBRE NUESTROS RECURSOS.
                         
                    - CADA PRIVILEGIO SE ESPECIFICA EXPL�CITAMENTE EN EL ROL O SE HEREDA DE OTRO ROL.
                            - UN PRIVILEGIO SE APLICA SOBRE UN RECURSO ESPECIFICADO,
                              Y SOBRE LAS ACCIONES PERMITIDAS DE ESE MISMO.
                         
                    - UN RECURSO PUEDE SER UNA BASE DE DATOS, UNA COLECCI�N O CONJUNTO DE ELLAS, O INCLUSO EL CL�STER.
                            - SI EL RECURSO ES EL CL�STER, LAS ACCIONES AFILIADAS AFECTAN AL ESTADO DEL SISTEMA
                              EN LUGAR DE A UNA BASE DE DATOS O COLECCI�N DETERMINADA.
                         
                    - UNA ACCI�N ESPEC�FICA LA OPERACI�N PERMITIDA SOBRE EL RECURSO.
                            - PODEMOS USAR EL COMANDO 'rolesInfo' PARA VISUALIZAR LOS PRIVILEGIOS DE UN ROL 
                              CON EL PAR�METRO 'showPrivileges' Y 'shoBuiltinRoles' A true.
                         
            ***********************************************     mongo --port 27017 -u user -p '1234' --authenticatio
            *   {                                         *     nDatabase 'admin'
            *   rolesInfo: { role: <name>, db: <db> },    *     use admin
            *   showPrivileges: <Boolean>,                *     db.createUser(
            *   showBuiltinRoles: <Boolean>,              *         {
            *   comment: <any>                            *         role:"manRole",
            *   }                                         *         privileges:[
            ***********************************************             {resource:{cluster:true},action:["killop","inprog"]},
                                                                        {resource:{db:"",collection""},action:["killCursors"]}
                                                                    ],
                                                                    roles:[]
                                                                }
                                                                )
            
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
                       
            EL PROCESO DE EXPORTACI�N DE DATOS LO REALIZAREMOS A TRAV�S DE LA HERRAMIENTA  --> MONGODB COMPASS.
            LA WEB DE MONGODB COMPASS:   https://www.mongodb.com/products/compass/
                         
            PARA DESCARGAR USAREMOS UN ENLACE DENTRO DE NUESTRA CONECCI�N ATLAS:
                    - ENTRAMOS EN LA WEB DE MONGODB ATLAS CON NUESTRO CORREO Y CONTRASE�A.                         
                    - PULSAMOS LA PESTA�A 'CONNECT' --> 'CONNECT USING MONGODB COMPAS'
                            TE DA LA OPCI�N DE DESCARGA E INSTALACI�N.
                            TE DA TAMBIEN UNA URL PARA PEGAR EN MONGODB COMPASS Y QUE PUEDA CONECTAR.
                         
                     mongodb+srv://username:password@cluster0.sdahxxa.mongodb.net/test
                         
                    * DESPU�S DE DESCARGARLO E INSTALARLO, EL PRIMER PASO SER�A CONECTARNOS A NUESTRA BASE DE DATOS MONGODB,
                      Y NAVEGAR HASTA ENCONTRAR LA INFORMACI�N/COLECCIONES QUE DESEEMOS EXPORTAR.
                 
                    * HACEMOS CLIC EN 'COLLECTION' --> 'EXPORT COLLECTION' Y COMPASS NOS MOSTRAR� UN CUADRO DE DI�LOGO.
                            - SE MUESTRA LA 'QUERY' POR MEDIO DE LA QUE SE VA A REALIZAR LA OPERACI�N.
                            - SI QUEREMOS IGNORAR LA QUERY Y EXPORTAR DIRECTAMENTE LA COLECCI�N COMPLETA
                              PODEMOS SELECCIONAR EL RADIO BUTTON 'EXPORT FULL COLLECTION' --> 'SELECT FIELDS'.
                         
                        OTRO CUADRO DE DI�LOGO NOS PERMITIR� ESCOGER LOS CAMPOS A EXPORTAR.
                            - SI NUESTRA APLICACI�N NO NOS DETECTA ALG�N CAMPO PODREMOS A�ADIRLO MANUALMENTE CON EL BOT�N DE 'ADD FIELD'.
                            - SI TODO EST� CORRECTO HACEMOS CLIC EN 'SELECT OUTPUT'.
                    * DEBEREMOS SELECCIONAR EL FORMATO DEL FICHERO QUE QUEREMOS EXPORTAR: JSON O CSV.
                         
                    * HACEMOS CLIC EN EXPORT.
                         
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
                       
            EL PROCESO DE IMPORTACI�N DE DATOS LO REALIZAREMOS TAMBI�N A TRAV�S DE LA HERRAMIENTA MONGODB COMPASS.
                         
                - NAVEGAR POR LA BASE DE DATOS CON MONGO COMPASS Y SELECCIONAR EL LUGAR DONDE IMPORTAR LOS DATOS.
                         
                - PULSAR 'ADD DATA' --> 'IMPORT FILE'
                         
                - LA APLICACI�N NOS MUESTRA UN CUADRO DE DIALOGO PARA SELECCIONAR LA RUTA Y EL TIPO --> JSON O CSV.
                        - SI IMPORTAMOS CSV DEBEREMOS ESPECIFICAR LOS CAMPOS QUE VAMOS A IMPORTAR
                          Y LOS TIPOS DE LOS MISMOS. EL TIPO POR DEFECTO ES STRING.
                         
                - TENDREMOS QUE CONFIGURAR LAS OPCIONES DE IMPORTACI�N ACORDE A NUESTRO CASO.
                        - SI IMPORTAMOS UN CSV TENDREMOS QUE INDICAR C�MO EST�N DELIMITADOS LOS CAMPOS.
                
                - UNA BARRA DE PROGRESO MOSTRAR� EL ESTADO ACTUAL DE LA IMPORTACI�N.
                        - SI OCURRE UN ERROR EN LA IMPORTACI�N, LA BARRA SE MOSTRAR� EN COLOR ROJO,
                          Y APARECER� UN MENSAJE EN EL CUADRO DE DIALOGO.
                         
                - UNA VEZ FINALIZADO EL PROCESO, LA APLICACI�N MOSTRAR� LOS DATOS IMPORTADOS.
                         
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
                       
            - ENTRAMOS EN LA WEB DE MONGODB ATLAS CON NUESTRO CORREO Y CONTRASE�A.                         
            - PULSAMOS LA PESTA�A 'CONNECT' --> 'CONNECT USING VS CODE'
                    
                    TE DA TODA LA INFORMACI�N.
                         
            1.- INSTALAR LA EXTENSI�N EN VS CODE PARA MONGODB. "Extensions" --> "MongoDB for VS Code"
            
            2.- EN VS CODE PULSAR 'VIEW' --> 'COMMAND PALETTE'
                Search "MongoDB: Connect" on the Command Palette and click on "Connect with Connection String."
                         
            3.- mongodb+srv://juanjoEG:<password>@cluster0.sdahxxa.mongodb.net/test
                         
            4.- Click "Create New Playground" in MongoDB for VS Code to get started.
                         
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
                case "12" -> {
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