package Tema_13;

import static Principal_Main.Main.*;
import static Tema_13.T_13.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_13 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_13 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
            
            EL CONCEPTO DE ÍNDICES QUE MANEJA MongoDB ES EL MISMO QUE EL QUE SE MANEJA EN OTROS REPOSITORIOS DE INFORMÁTICA.
            
                    * PERMITE QUE UNA CONSULTA DEVUELVA INFORMACIÓN DE UNA FORMA MÁS EFECTIVA.
                         
                    * EN MongoDB LOS ÍNDICES VAN A ESTAR RELACIONADOS A COLECCIONES ESPECÍFICAS
                      O CAMPOS DE ESTA MISMA COLECCION ESPECÍFICA CON UNA O MÁS CLAVES DEFINIDAS.
                         
            SINTAXIS GENERAL PARA CREAR UN ÍNDICE:      ******************************************
                                                        *   db.collection.createIndex(           *
                                                        *       {<campo_1>:<tipo índice>,        *
                                                        *       <campo_2>:<tipo índice> ... }    *
                                                        *   {<opciones>})                        *
            CARACTERÍSTICAS DE LOS ÍNDICES:             ******************************************
                         
                    * SE ALMACENAN EN MEMORIA.
                         
                    * MEJORAN LAS OPERACIONES DE LECTURA.
                         
                    * PUEDEN PENALIZAR LAS OPERACIONES DE ESCRITURA.
                            * ADEMÁS LA OPERACIÓN DE ESCRITURA EN SÍ, SERÁN NECESARIAS ACCIONES ADICIONALES.
                                    POR EJEMPLO AL METER UN DATO NUEVO:
                                    HAY QUE INTRODUCIR EL DATO EN TODOS LOS NODOS DONDE ESTÉ REPLICADO,
                                    Y TAMBIÉN HAY QUE ACTUALIZAR LOS ÍNDICES EN LA MEMORIA DE TODOS LOS NODOS.
                         
                    * EN MongoDB POR DEFECTO SE CREA UN ÍNDICE ÚNICO SOBRE EL CAMPO  -->  _id
                            * EN LOS SGBD RELACIONALES, HABITUALMENTE SE CREA TAMBIÉN UN ÍNDICE
                              AUTOMÁTICAMENTE PARA LOS CAMPOS CLAVES.
                         
                    * NO SÓLO SE INDICAN LOS CAMPOS DEL ÍNDICE SINO EL ORDEN DEL MISMO.
                            * EL ORDEN EN LA CREACIÓN DE LOS ÍNDICES ES FUNDAMENTAL,
                              Y NO ES LO MISMO SI SE INTERCAMBIA EL ORDEN EN LA SINTAXIS, SERÁN ÍNDICES DIFERENTES.
                         
                    * UTILIZACIÓN:
                            * LOS ÍNDICES LOS EMPLEAN LAS QUERYS Y LAS AGREGACIONES.
                            * LOS OPERADORES DE NEGACIÓN NO UTILIZAN ÍNDICES.
                    
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
                    INDEXAN POR UN ÚNICO CAMPO DE LOS DOCUMENTOS DE LA COLECCIÓN.
                    CARACTERÍSTICAS:
                        - SÓLO AFECTAN A UN CAMPO DE BÚSQUEDA.
                        - INDICAR '-1' O '1' CONFIGURA EL ÍNDICE COMO DESCENDENTE O ASCENDENTE RESPECTIVAMENTE.
                         
                    ************************************
                    *   db.collection.createIndex(     *
                    *       {<campo>:<-1|1>}           *
                    *   )                              *
                    ************************************
                         
            * COMPUESTOS:
                    INDEXAN POR VARIOS CAMPOS DE LOS DOCUMENTOS DE LA COLECCIÓN.
                     
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
                    LOS ÍNDICES MONOCLAVE Y COMPUESTOS, SIMPLES Y MÚLTIPLES, PUEDEN ESTAR OBLIGADOS A CONTENER VALORES ÚNICOS,
                    ESTO LO CONSEGUIMOS, A LA HORA DE CREARLOS AÑADIENDO EL PARÁMETRO  -->  unique
                            - SÓLO PUEDE HABER UNA CORRESPONDENCIA ENTRE ENTRADA DEL ÍNDICE Y DOCUMENTO.
                            - CADA VALOR DEL ÍNDICE DEBE CORRESPONDER CON UN ÚNICO VALOR.
                            - SE PUEDE UTILIZAR PARA ÍNDICES DE UN SOLO CAMPO O MULTICAMPO.

                    ************************************
                    *   db.collection.createIndex(     *
                    *       {<campo>:<tipo_índice>},   *
                    *       {unique:<true|false>}      *
                    *   )                              *
                    ************************************

            * SPARSE:
                    LOS ÍNDICES QUE HEMOS MENCIONADO ANTES, INCLUYEN TODOS LOS DOCUMENTOS,
                    INCLUSO AQUELLOS QUE NO CONTENGAN EL CAMPO INDEXADO, O LO TENGAN CON VALOR NULO.
                    TENER EN CUENTA QUE MongoDB NO OBLIGA A QUE USEMOS UN 'ESQUEMA', UNA MISMA ESTRUCTURA PARA LOS CAMPOS DOCUMENTOS,
                    ASÍ QUE EN REALIDAD NO HAY OBLIGATORIEDAD EN QUE LOS CAMPOS EXISTAN EN EL DOCUMENTO.
                    SI QUEREMOS CREAR ÍNDICES QUE SOLO INCLUYAN LOS DOCUMENTOS CUYO CAMPO INDEXADO EXISTE, UTILIZAREMOS LA OPCIÓN  --> sparse
                            - NO INDEXA CAMPOS CON VALORES NULOS.
                            - LOS VALORES NULOS NO SE INTRODUCEN EN EL ÍNDICE.
                            - UNA BÚSQUEDA QUE UTILICE ESTE ÍNDICE NO DEVOLVERÁ DOCUMENTOS QUE NO ESTÉN EN EL ÍNDICE:
                              ESTE TIPO DE ÍNDICE NO TIENE PORQUÉ CONTENER TODOS LOS DOCUMENTOS DE LA COLECCIÓN.

                    ************************************
                    *   db.collection.createIndex(     *
                    *       {<campo>:<tipo_índice>,    *
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
                    - SON ÍNDICES EN LOS QUE SÓLO UN ELEMENTO DEL ÍNDICE HACE REFERENCIA A UN CAMPO QUE TIENE VALORES DE ARRAY.
                    - SE CREAN TANTAS ENTRADAS DEL ÍNDICE COMO VALORES CONTENGA EL ARRAY.
                    - PUEDEN SER ÍNDICES DE UN ÚNICO CAMPO O COMPUESTOS.
                         
            * TEXT:
                    - ÍNDICES DE TEXTO.
                         
            * GEOESPACIALES:
                    - INDEXAN POR COORDENADAS ESPACIALES.
                         
            * BACKGROUND:
                    - MÁS LENTO, PERO NO BLOQUEA A LOS LECTORES/ESCRITORES.
                         
            * TTL: 
                    - TIME TO LIVE. ES PONER UNA FECHA DE CADUCIDAD A LOS DOCUMENYOS.
                    - ELIMINA DOCUMENTOS DE LA COLECCIÓN CUANDO PASA CIERTO TIEMPO O CUANDO ALCANZA LA FECHA DE EXPIRACIÓN.
                         
            * PARTIAL:
                    - INDEXA AQUELLOS DOCUMENTOS QUE CUMPLAN UNA CONDICIÓN.                      
            
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
                    - CONSULTA QUE SE RESUELVE CONTRA UN ÍNDICE SIN CONSULTAR DATOS DE LA COLECCIÓN.
            
                    ************************************
                    *   db.collection.find(            *    <filtro>     -->  ES UNA LISTA DE CONDICIONES SOBRE CLAVES DE LOS ÍNDICES.
                    *       <filtro>[,{<proyección>}]  *    <proyección> -->  ES UNA LISTA DE LOS CAMPOS QUE QUEREMOS OBTENER
                    *   )                              *                      COMO RESULTADO DE LA CONSULTA.
                    ************************************
            
                    - UTILIZA EL CONCEPTO DE PROYECCIÓN DE MongoDB:
                            - UNA MongoDB Proyection ES UNA SELECCIÓN DE CAMPOS DE UN DOCUMENTO
                              QUE QUEREMOS QUE DEVUELVA UNA CONSULTA.
                            - USAREMOS LA PROYECCIÓN CUANDO QUEREMOS RECUPERAR SOLO UN CONJUNTO DE CAMPOS
                              SELECCIONADOS DE UN DOCUMENT, EN LUGAR DE TODOS.
                            - EL PROPÓSITO DE LA PROYECCIÓN ES QUE NOS AYUDE A ENCONTRAR UNOS DATOS ESPECÍFICOS.
            
            * BORRADO DE ÍNDICE:
                    - PARA REALIZAR EL BORRADO DE UN ÍNDICE.
                         
                    ********************************
                    *   db.collection.dropIndex(   *
                    *       {<nombre_clave>:1}     *
                    *   )                          *
                    ********************************
                    
            * REGENERACIÓN DE ÍNDICE:
                    - PARA VOLVER A CREAR UN ÍNDICE YA CREADO PREVIAMENTE.
                               
                    ********************************
                    *   db.collection.reIndex()    *
                    ********************************
                         
            * LISTADO DE ÍNDICES:
                    - PARA LISTAR LOS ÍNDICES ASOCIADOS A UNA COLECCIÓN.
                                                          
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
                         
                    - A UN USUARIO SE LE OTORGAN UNO O MÁS ROLES QUE DETERMINAN:
                            - EL ACCESO O LOS PRIVILEGIOS DEL USUARIO, A LOS RECURSOS DE NUESTRA BASE DE DATOS MongoDB.
                            - ACCIONES QUE DICHO USUARIO PUEDE REALIZAR.
                         
                    - UN USUARIO DEBE TENER SOLO EL CONJUNTO MÍNIMO DE PRIVILEGIOS
                      NECESARIOS PARA GARANTIZAR UN SISTEMA DE PRIVILEGIOS MÍNIMOS.
                         
                    - CADA APLICACIÓN Y USUARIO DE UN SISTEMA Mongo DEBE ASIGNARSE A UN USUARIO DISTINTO.
                         
            ESTE AISLAMIENTO DE ACCESO FACILITA LA REVOCACIÓN DEL ACCESO Y EL MANTENIMIENTO CONTINUO DEL USUARIO.
                         
            PARA CREAR UN USUARIO EN MongoDB PODEMOS EJECUTAR EL COMANDO --> db.createUser()
                    - SI EL USUARIO NO EXISTE LO CREA Y NO DEVOLVERÁ NADA.
                    - SI EL USUARIO SI EXISTE NOS DEVOLVERÁ UN ERROR DE DUPLICADO.
          
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

                    - pwd: STRING DONDE INDICAREMOS LA CONTRASEÑA.

                    - CustomData: DE MANERA OPCIONAL, EN ESTE CAMPO (DOCUMENTO) INDICAREMOS INFORMACIÓN ADICIONAL.
                      EL NOMBRE COMPLETO, EL ID DEL EMPLEADO, ETC.

                    - roles: EN ESTE ARRAY INDICAREMOS LOS PERMISOS QUE QUERAMOS OTORGARLE AL NUEVO USUARIO.
                      MongoDB TIENE UN CONJUNTO DE ROLES PREDEFINIDOS.
                            - LO DEJAMOS VACÍO SI NO QUEREMOS DOTAR DE PERMISOS.

                    - authentionRestriction: ARRAY OPCIONAL CON EL RANGO DE DIRECCIONES IP
                      DESDE LAS CUALES DICHO USUARIO SE PODRÁ CONECTAR.

                    - mechanisms: ARRAY OPCIONAL QUE ESPECIFICA SI EL USUARIO TIENE PERMISOS PARA CREAR CREDENCIALES SCRAM.
                      SCRAM: SALTED CHALLENGE RESPONSE AUTHENTICATION MECHANISM. MONGODB DISPONE DE 4 MECANISMOS DE AUTENTIFICACIÓN.
                      SCRAM ES EL SISTEMA POR DEFECTO Y MÁS BÁSICO, ES EL SISTEMA CLÁSICO DE USUARIO Y CONTRASEÑA.

                    - passwordDigestor: STRING OPCIONAL QUE INDICA SI EL SERVIDOR O EL CLIENTE TRADUCEN LA CONTRASEÑA
                    
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
            A UN USUARIO SE LE OTORGAN UNO O MÁS ROLES QUE DETERMINARÁN
            EL ACCESO DEL USUARIO A LOS RECURSOS Y OPERACIONES DE LA BASE DE DATOS.
            
            FUERA DE LAS ASIGNACIONES DE FUNCIONES, EL USUARIO NO TIENE ACCESO AL SISTEMA.
                        
            MONGODB NO HABILITA EL CONTROL DE ACCESO BASADO EN ROLES POR DEFECTO.
                         
                    - SE PUEDE HABILITAR LA AUTORIZACIÓN DE 2 FORMAS ALTERNATIVAS.
                            - LA CONFIGURACIÓN --auth
                            - A TRAVÉS DE LA CONFIGURACIÓN --> security.authorization
                         
                    - SI SE HABILITA LA AUTENTICACIÓN INTERNA TAMBIÉN SE HABILITA LA DEL CLIENTE.
                         
                    - UNA VEZ QUE SE HABILITA EL CONTROL DE ACCESO, LOS USUARIOS DEBEN AUTENTICARSE.
                         
            UN ROL OTORGA PRIVILEGIOS PARA REALIZAR ACCIONES ESPECÍFICAS SOBRE NUESTROS RECURSOS.
                         
                    - CADA PRIVILEGIO SE ESPECIFICA EXPLÍCITAMENTE EN EL ROL O SE HEREDA DE OTRO ROL.
                            - UN PRIVILEGIO SE APLICA SOBRE UN RECURSO ESPECIFICADO,
                              Y SOBRE LAS ACCIONES PERMITIDAS DE ESE MISMO.
                         
                    - UN RECURSO PUEDE SER UNA BASE DE DATOS, UNA COLECCIÓN O CONJUNTO DE ELLAS, O INCLUSO EL CLÚSTER.
                            - SI EL RECURSO ES EL CLÚSTER, LAS ACCIONES AFILIADAS AFECTAN AL ESTADO DEL SISTEMA
                              EN LUGAR DE A UNA BASE DE DATOS O COLECCIÓN DETERMINADA.
                         
                    - UNA ACCIÓN ESPECÍFICA LA OPERACIÓN PERMITIDA SOBRE EL RECURSO.
                            - PODEMOS USAR EL COMANDO 'rolesInfo' PARA VISUALIZAR LOS PRIVILEGIOS DE UN ROL 
                              CON EL PARÁMETRO 'showPrivileges' Y 'shoBuiltinRoles' A true.
                         
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
                       
            EL PROCESO DE EXPORTACIÓN DE DATOS LO REALIZAREMOS A TRAVÉS DE LA HERRAMIENTA  --> MONGODB COMPASS.
            LA WEB DE MONGODB COMPASS:   https://www.mongodb.com/products/compass/
                         
            PARA DESCARGAR USAREMOS UN ENLACE DENTRO DE NUESTRA CONECCIÓN ATLAS:
                    - ENTRAMOS EN LA WEB DE MONGODB ATLAS CON NUESTRO CORREO Y CONTRASEÑA.                         
                    - PULSAMOS LA PESTAÑA 'CONNECT' --> 'CONNECT USING MONGODB COMPAS'
                            TE DA LA OPCIÓN DE DESCARGA E INSTALACIÓN.
                            TE DA TAMBIEN UNA URL PARA PEGAR EN MONGODB COMPASS Y QUE PUEDA CONECTAR.
                         
                     mongodb+srv://username:password@cluster0.sdahxxa.mongodb.net/test
                         
                    * DESPUÉS DE DESCARGARLO E INSTALARLO, EL PRIMER PASO SERÍA CONECTARNOS A NUESTRA BASE DE DATOS MONGODB,
                      Y NAVEGAR HASTA ENCONTRAR LA INFORMACIÓN/COLECCIONES QUE DESEEMOS EXPORTAR.
                 
                    * HACEMOS CLIC EN 'COLLECTION' --> 'EXPORT COLLECTION' Y COMPASS NOS MOSTRARÁ UN CUADRO DE DIÁLOGO.
                            - SE MUESTRA LA 'QUERY' POR MEDIO DE LA QUE SE VA A REALIZAR LA OPERACIÓN.
                            - SI QUEREMOS IGNORAR LA QUERY Y EXPORTAR DIRECTAMENTE LA COLECCIÓN COMPLETA
                              PODEMOS SELECCIONAR EL RADIO BUTTON 'EXPORT FULL COLLECTION' --> 'SELECT FIELDS'.
                         
                        OTRO CUADRO DE DIÁLOGO NOS PERMITIRÁ ESCOGER LOS CAMPOS A EXPORTAR.
                            - SI NUESTRA APLICACIÓN NO NOS DETECTA ALGÚN CAMPO PODREMOS AÑADIRLO MANUALMENTE CON EL BOTÓN DE 'ADD FIELD'.
                            - SI TODO ESTÁ CORRECTO HACEMOS CLIC EN 'SELECT OUTPUT'.
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
                       
            EL PROCESO DE IMPORTACIÓN DE DATOS LO REALIZAREMOS TAMBIÉN A TRAVÉS DE LA HERRAMIENTA MONGODB COMPASS.
                         
                - NAVEGAR POR LA BASE DE DATOS CON MONGO COMPASS Y SELECCIONAR EL LUGAR DONDE IMPORTAR LOS DATOS.
                         
                - PULSAR 'ADD DATA' --> 'IMPORT FILE'
                         
                - LA APLICACIÓN NOS MUESTRA UN CUADRO DE DIALOGO PARA SELECCIONAR LA RUTA Y EL TIPO --> JSON O CSV.
                        - SI IMPORTAMOS CSV DEBEREMOS ESPECIFICAR LOS CAMPOS QUE VAMOS A IMPORTAR
                          Y LOS TIPOS DE LOS MISMOS. EL TIPO POR DEFECTO ES STRING.
                         
                - TENDREMOS QUE CONFIGURAR LAS OPCIONES DE IMPORTACIÓN ACORDE A NUESTRO CASO.
                        - SI IMPORTAMOS UN CSV TENDREMOS QUE INDICAR CÓMO ESTÁN DELIMITADOS LOS CAMPOS.
                
                - UNA BARRA DE PROGRESO MOSTRARÁ EL ESTADO ACTUAL DE LA IMPORTACIÓN.
                        - SI OCURRE UN ERROR EN LA IMPORTACIÓN, LA BARRA SE MOSTRARÁ EN COLOR ROJO,
                          Y APARECERÁ UN MENSAJE EN EL CUADRO DE DIALOGO.
                         
                - UNA VEZ FINALIZADO EL PROCESO, LA APLICACIÓN MOSTRARÁ LOS DATOS IMPORTADOS.
                         
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
                       
            - ENTRAMOS EN LA WEB DE MONGODB ATLAS CON NUESTRO CORREO Y CONTRASEÑA.                         
            - PULSAMOS LA PESTAÑA 'CONNECT' --> 'CONNECT USING VS CODE'
                    
                    TE DA TODA LA INFORMACIÓN.
                         
            1.- INSTALAR LA EXTENSIÓN EN VS CODE PARA MONGODB. "Extensions" --> "MongoDB for VS Code"
            
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