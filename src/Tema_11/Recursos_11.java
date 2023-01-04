package Tema_11;

import static Principal_Main.Main.*;
import static Tema_11.T_11.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_11 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_11 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                         
            TRADICIONALMENTE, LA INDUSTRIA DEL SOFTWARE,
            USA LAS BASES DE DATOS RELACIONALES PARA ALMACENAR Y MANEJAR DATOS DE FORMA PERSISTENTE.
                         
            EN CONCRETO No-SQL NO REPRESENTA UN PRODUCTO �NICO O UNA �NICA TECNOLOG�A.
            No-SQL:
                    - REPRESENTA UN GRUPO DE PRODUCTOS Y UN CONJUNTO RELACIONADO DE CONCEPTOS PARA EL ALMACENAMIENTO Y SU ADMINISTRACI�N.
                    - SE REFIERE A BASES DE DATOS Y ALMACENES DE DATOS
                      NO BASADOS EN EL SISTEMA TRADICIONAL DE BASES DE DATOS RELACIONALES ENTRE S�,
                      O NO BASADOS EN SUS PRINCIPIOS.
                    - SUELE RELACIONARSE CON GRANDES CONJUNTOS DE DATOS A LOS QUE SE ACCEDE Y SE MANIPULAN A ESCALA WEB.
                    - FUE TAMBI�N UN 'HASHTAG' ESCOGIDO PARA UNA GRAN REUNI�N T�CNICA PARA DISCUTIR LAS NUEVAS BASES DE DATOS.
                         
            LAS BASES DE DATOS No-SQL TIENEN UNA SERIE DE CARACTER�STICAS COMUNES COMO:
                    - MODELO DE DATOS NO RELACIONAL.
                    - FUNCIONAN BIEN EN CLUSTERS,
                      ENTENDIENDO POR CLUSTER UN CONJUNTO DE M�QUINAS IMPLEMENTADAS COMO SERVIDORES DE PROCESAMIENTO PARALELO.
                            - FUNCIONAN ENTRE S� COMO UN �NICO RECURSO.
                            - A CADA ELEMENTO O M�QUINA LO LLAMAMOS NODO.
                    - SUELEN SER EN SU MAYOR�A DE C�DIGO ABIERTO.
                    - SU CONSTRUCCI�N EST� ORIENTADA PARA LAS APLICACIONES WEB DE NUEVA GENERACI�N.
                    - SON BASES DE DATOS CON AUSENCIA DE ESQUEMAS (SCHEMALESS).
                            - ESTA ES UNA CARACTER�STICA MUY FLEXIBLE:
                              SE PUEDE ALMACENAR INFORMACI�N NO UNIFORME, Y AS� SE FACILITA LA EVOLUCI�N.
                              
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
                       
            CADA VEZ AUMENTA M�S EL VOLUMEN Y EL TIPO DE DATOS QUE SE PRODUCEN, SE MANEJAN, ANALIZAN Y SE ARCHIVAN,
            EN MUCHOS CASOS CON DATOS SEMIESTRUCTURADOS:
                    - LA EXPLOSI�N DEL SOCIAL-MEDIA Y LOS CONTENIDOS MANEJADOS POR EL USUARIO.
                    - APORTACIONES DE LAS NUEVAS FUENTES DE INFORMACI�N COMO SENSORES, SISTEMAS GLOBALES DE POSICIONAMIENTO O GPS,
                      REASTREADORES, Y OTROS TIPOS DE SISTEMAS QUE MONITOREAN GRANDES CANTIDADES DE INFORMACI�N DE FORMA REGULAR.
                         
            ESTO HA PROVOCADO UNA REVISI�N DE LAS BASES DE DATOS RELACIONALES, UNA DEFINICI�N DEL ESQUEMA Y REFERENCIAS RELACIONALES.
                         
            PARA RESOLVER EL PROBLEMA RELACIONADO CON LOS GRANDES VOL�MENES DE INFORMACI�N Y LOS DATOS SEMI-ESTRUCTURADOS,
            SURGEN NUEVAS CLASES DE BASES DE DATOS DENTRO DE LA FAMILIA No-SQL.
                        
            ESTE TIPO DE BASES DE DATOS CONSISTE EN EL ALMACENAMIENTO BASADO EN COLUMNAS,
            CLAVE-VALOR Y DE DOCUMENTOS, QUE ESTUDIAREMOS M�S ADELANTE.
                         
                - EL USUARIO EDy Latam EN UN POST DE UNA RED SOCIAL TIENE UNA INFORMAC�N QUE SER� GUARDADA EN BASE DE DATOS...
                         
                * EN UNA BASE DE DATOS RELACIONAL ESA INFORMACI�N SE DIVIDE Y REPARTE EN DISTINTAS TABLAS.
                         
                * EN UNA BASE DE DATOS NoSQL TODA LA INFORMACI�N SE ALMACENA EN UN FICHERO BSON,
                  PUDIENDO ESTAR REPETIDA TODA LA INFORMACI�N EN DISTINTOS PUNTOS
                  CON EL FIN DE ACCEDER A LA INFORMACI�N LO M�S R�PIDO POSIBLE.
                         
                   SQL                      VS                       NO SQL
              (RELACIONALES)                                    (NO RELACIONALES)
                         
            EVITA LA REDUNDANCIA                               USAN LA REDUNDANCIA
                 DE DATOS                                         DE DATOS PARA
              ORGANIZANDOLOS                                     HACER CONSULTAS
                EN TABLAS.                                          M�S R�PIDO.
               
            - MySQL                                             - mongoDB
                         
            * TABLA Usuario                                     * FICHERO: post1.json  -->     {
                                                                                                   "autor": "EDy Latam",
            * TABLA Imagenes                                                                        "date":"20-02-2021",
                                                                                                    "images":
            * TABLA Likes                                                                           ["/images/photo1.jpg"],
                                                                                                    "likes": "60"
            * TABLA Post                                                                        }
                         
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
            
            BASES DE DATOS RELACIONALES:
                         
                A.- LA INFORMACI�N EST� ALMACENADA EN UN MODELO RELACIONAL CON FILAS Y COLUMNAS.                         
                    UNA FILA CONTIENE INFORMACI�N SOBRE UN ELEMENTO MIENTRAS QUE LAS COLUMNAS CONTIENEN INFORMACI�N ESPEC�FICA.
                         
                B.- SIGUE UN ESQUEMA FIJO. LAS COLUMNAS SON DEFINIDAS Y ESTABLECIDAS ANTES DE LA ENTRADA DE DATOS.
                    ADEM�S, CADA FILA CONTIENE INFORMACI�N DE CADA COLUMNA.
                         
                C.- A FAVOR DEL ESCALADO VERTICAL.
                         
                D.- ACID. --> ATOMICIDAD, CONSISTENCIA, AISLAMIENTO Y DURABILIDAD.
                         
            BASES DE DATOS No-SQL:
                         
                A.- LA INFORMACI�N EST� ALMACENADA EN UN CLIENTE O EN UNA BASE DE DATOS DIFERENTE CON MODELOS DE DATOS DISTINTOS.
                         
                B.- SIGUE UN ESQUEMA DIM�MICO, PUEDES A�ADIR COLUMNAS EN CUALQUIER MOMENTO.
                         
                C.- FACILITA EL ESCALADO HORIZONTAL. SE PUEDE ESCALAR A TRAV�S DE SERVIDORES M�LTIPLES.
                    LOS SERVIDORES M�LTIPLES TIENEN LA VENTAJA DEL PRECIO EN RELACI�N AL HARDWARE
                    QUE SE VA A�ADIENDO COMPARADO CON EL ESCALADO VERTICAL.
                         
                D.- NO EST� A FAVOR DE LOS PRINCIPIOS ACID.
                         
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
                       
            CAPACIDAD DE FUENTE DE DATOS PRIMARIA Y DE AN�LISIS:
                         
                    * DEBE SERVIR COMO FUENTE PRINCIPAL DE DATOS QUE RECIBE INFORMACI�N DE DISTINTAS APLICACIONES DE NEGOCIO Y SISTEMAS.
                    * TAMBI�N DEBE ACTUAR COMO SEGUNDA FUENTE DE INFORMACI�N O AN�LISIS PARA LAS APLICACIONES DE 'Business Intelligence'.
                    * DEBEN DE SER CAPACES DE INTEGRARSE DE UNA FORMA R�PIDA A TODOS LOS TIPOS DE DATOS ESTRUCTURADOS,
                      SEMIESTRUCTURADOS O SIN ESTRUCTURA. DEBEN ALMACENAR TODO TIPO DE DATOS.
                    * DEBEN SER CAPACES DE EJECUTAR CONSULTAS DE ALTO RENDIMIENTO.
                         
            CAPACIDAD BIG DATA: -> PERO NO LIMITADA A TRABAJAR CON BIG DATA.
                         
                    * PUEDE ESCALAR PARA ADMINISTRAR GRANDES VOL�MENES DE DATOS DESDE TERABYTES HASTA PETABYTES.
                    * ADEM�S DE ALMACENAR GRANDES VOL�MENES DE DATOS, OFRECE UN ALTO RENDIMIENTO
                      PARA LA VELOCIDAD, VARIEDAD Y COMPLEJIDAD DE LOS DATOS.
                         
            DISPONIBILIDAD CONTINUA:
                         
                DEBE OFRECER DISPONIBILIDAD CONTINUA, SIN UN SOLO PUNTO DE FALLO, Y ADEM�S DE MANERA INTEGRADA,
                INCLUYENDO LAS SIGUIENTES CARACTER�STICAS:
                         
                    * TODOS LOS NODOS DE UN CL�STER DEBEN PODER ATENDER SOLICITUDES DE LECTURA INCLUSO SI ALGUNAS M�QUINAS NO FUNCIONAN.
                    * DEBE SER CAPAZ DE REPLICAR Y SEGREGAR DATOS F�CILMENTE ENTRE DIFERENTES PARTES F�SICAS EN UN CENTRO DE DATOS.
                    * ESTO EVITAR� CORTES DE HARDWARE.
                    * DEBE PODER ADMITIR DISE�OS DE DISTRIBUCI�N DE DATOS QUE SEAN CENTROS DE DATOS M�LTIPLES
                      YA SEA EN INSTANCIACIONES F�SICAS O EN LA NUBE.
                         
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
                       
            CAPACIDAD DE TENER M�LTIPLES CENTROS DE DATOS: (FISICOS Y EN LA NUBE).
                    UNA BUENA SOLUCI�N EMPRESARIAL No-SQL DEBE ADMITIR LA IMPLEMENTACI�N DE VARIOS CENTROS DE DATOS
                    Y DEBE PROPORCIONAR UNA OPCI�N CONFIGURABLE PARA MANTENER UN EQUILIBRIO ENTRE EL RENDIMIENTO Y LA COHERENCIA.
                            - POR LO GENERAL, EN UN ENTORNO PROFESIONAL,
                              LAS EMPRESAS POSEEN BASES DE DATOS ALTAMENTE DISTRIBUIDAD QUE SE ENCUENTRAN
                              EN VARIOS CENTROS DE DATOS Y UBICACIONES GEOGR�FICAS DISTINTAS.
                            - AUNQUE LA RECEPCI�N DE DATOS ES UNA CARACTER�STICA QUE OFRECEN TODAS LAS BASES DE DATOS RELACIONALES,
                              NINGUNA PUEDE OFRECER UN MODELO SIMPLE DE DISTRIBUCI�N DE DATOS ENTRE VARIOS CENTROS DE DATOS
                              SIN SUFRIR PROBLEMAS DE RENDIMIENTO.
                         
            F�CIL REPLICACI�N INDEPENDIENTEMENTE DE LA UBICACI�N:
                    PARA EVITAR QUE LA P�RDIDA DE DATOS AFECTE A UNA APLICACI�N,
                    UNA BUENA SOLUCI�N No-SQL PROPORCIONA UNA GRAN CAPACIDAD DE REPLICACI�N.
                    CAPACIDAD DE LECTURA Y ESCRITURA EN CUALQUIER LUGAR CON COMPATIBILIDAD TOTAL E INDEPENDIENTE DE UBICACI�N.
                            - SE PUEDEN ESCRIBIR DATOS EN CUALQUIER NODO DE UN CL�STER.
                            - DEBE GARANTIZAR QUE LOS DATOS EST�N SEGUROS EN CASO DE CORTE DE SUMINISTRO EL�CTRICO U OTRO TIPO DE INCIDENTE.
                            - HACER QUE SE REPLIQUEN EN OTROS NODOS DE MANERA AUTOM�TICA.
                            - PONERLOS A DISPOSICI�N DE TODOS LOS USUARIOS INDEPENDIENTEMENTE DE SU UBICACI�N.
                         
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
                       
            SIN CAPA DE ALMACENAMIENTO EN CACH� SEPARADA:
                    NO REQUIERE UNA CAPA DE ALMACENAMIENTO EN CACH� ESPEC�FICA.
                    LAS CACH� DE TODOS LOS NODOS PUEDEN ALMACENAR DATOS PARA:
                            - ENTRADA Y SALIDA R�PIDA.
                            - PARA UN ACCESO ENTRADA/SALIDA.
                    ELIMINA EL PROBLEMA DE SINCRONIZAR LOS DATOS DE LA CACH� CON LA BASE DE DATOS PERSISTENTE.
                            - LA CACH� SON MEMORIAS INTERMEDIAS, CON LAS CUALES TRABAJAMOS LOS USUARIOS
                              QUE ESTAMOS ACCEDIENDO A LA BASE DE DATOS, PARA CONSEGUIR UN ACCESO M�S R�PIDO.
                            - LA BASE DE DATOS PERSISTENTE ES DONDE SE PASA LA INFORMACI�N
                              UNA VEZ QUE LA INFORMACI�N DE LA CACH� YA EST� CONFIRMADA
                              PARA GUARDARLA A LARGO PLAZO.
                            - DE ESTA FORMA, ADMITE UNA ESCALABILIDAD SIMPLE
                              CON MENOS PROBLEMAS DE ADMISI�N, REDUNDANCIA, CONSISTENCIA, ETC...
                         
            LISTA EN LA NUBE:
                    DADO QUE LA ADAPTACI�N DE LA INFRAESTRUCTURA DE LA NUBE AUMENTA D�A A D�A,
                    UNA SOLUCI�N No-SQL DE NIVEL EMPRESARIAL DEBE ESTAR PREPARADA PARA LA NUBE,
                    CUMPLIENDO VARIAS CONDICIONES:
                            - PODER FUNCIONAR EN UNA CONFIGURACI�N DE LA NUBE
                              COMO AMAZON EC2, GOOGLE CLOUD, MICROSOFT AZURE, ETC...
                            - PODER EXTENDER Y REDUCIR UN CL�STER CUANDO SEA NECESARIO.
                            - ADMITIR UNA SOLUCI�N H�BRIDA EN LA QUE PARTE DE LA BASE DE DATOS
                              SE ALOJE DENTRO DE LAS INSTALACIONES DE LA EMPRESA Y OTRA PARTE SE ALOJE EN LA NUBE.
                         
            ALTO RENDIMIENTO CON ESCALABILIDAD LINEAL:
                    NORMALMENTE, EL RENDIMIENTO DE OTROS SISTEMAS DE BASES DE DATOS, PUEDE DISMINUIR CUANDO SE A�ADEN M�S NODOS.
                    UNA BUENA SOLUCI�N No-SQL AUMENTA EL RENDIMIENTO DE LAS OPERACIONES DE LECTURA CUANDO SE AGREGAN NODOS ADICIONALES.
                            - UNA BASE DE DATOS DE ESTE TIPO PUEDE MEJORAR EL RENDIMIENTO AGREGANDO NODOS A UN CL�STER.
                            - ESTAS GANANCIAS DE RENDIMIENTO SON DE NATURALEZA LINEAL.
                         
            OTROS BENEFICIOS:
                    - SOPORTE DE ESQUEMA FLEXIBLE.
                    - ADMITE LENGUAJES Y PLATAFORMAS CLAVE PARA DESARROLLADORES.
                    - F�CIL DE IMPLEMENTAR, MANTENER Y EXTENDER,
                    - COMUNIDAD DE C�DIGO ABIERTO.
                         
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
                       
            BASES DE DATOS CLAVE/VALOR:
                    - REALMENTE SON UNA TABLA 'HASH' DE CLAVES Y VALORES.
                    - EJEMPLOS:  --> RIAK, TOKYO CABINET, SERVIDOR REDIS, MEMCACHED Y SCALARIS.
                         
            BASES DE DATOS BASADAS EN DOCUMENTOS:
                    - ALMACENA DOCUMENTOS COMPUESTOS POR ELEMENTOS ETIQUETADOS.
                    - EJEMPLOS:  --> MONGODB, COUCHDB, ORIENTDB Y RAVENDB.
                         
            BASES DE DATOS BASADAS EN COLUMNAS:
                    - CADA BLOQUE DE ALMACENAMIENTO CONTIENE DATOS DE UNA SOLA COLUMNA.
                    - EJEMPLOS:  --> BIBTABLE, CASSANDRA, HBASE E HYPERTABLE.
                         
            BASES DE DATOS BASADAS EN GR�FICOS:
                    - UNA BASE DE DATOS BASADA EN GR�FICOS ES UNA BASE DE DATOS DE RED
                      QUE UTILIZA NODOS PARA REPRESENTAR Y ALMACENAR DATOS.
                    - EJEMPLOS:  --> NEO4J, INFOGRID, INFINITE GRAPH Y FLOCKDB.
                         
                         
            LA VARIEDAD DE OPCIONES EN LA NUBE DE BASES DE DATOS No-SQL TIENE SUS PROPIAS:
                    - VENTAJAS:
                            PERMITEN ELEGIR UN DISE�O DE ACUERDO A LOS REQUISITOS DE SU SISTEMA.
                    - INCONVENIENTES:
                            A�N AJUSTANDO EL PRODUCTO A LOS RECURSOS DEL SISTEMA NO SIEMPRE FUNCIONAR� CORRECTAMENTE.
                         
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
                       
            SON BASES DE DATOS QUE PRIORIZAN EL ACCESO R�PIDO A LA INFORMACI�N
            POR ENCIMA DE LA INTEGRIDAD DE LOS DATOS.
                         
                AZURE COSMOS DB:
                        MULTI-MODELO, DE DISTRIBUCI�N GLOBAL Y ESCALADO HORIZONTAL.
                        DESARROLLADA POR MICROSOFT.
                         
                MONGODB:
                        ORIENTADA A LA DOCUMENTACI�N.
                        SUS DATOS SON ALMACENADOS EN BSON, QUE ES UNA REPRESENTACI�N BINARIA DE JSON.
                         
                ARANGODB:
                        UTILIZA SU LENGUAJE LLAMADO AQL
                        Y ESTO LE PERMITE CREAR ESTRUCTURAS DE TIPO CLAVE/VALOR, RELACIONALES Y GRAFOS.
                        
                GOOGLE CLOUD FIRESTORE:
                        DE USO EN LA NUBE.
                        PERMITE TRANSACCIONES ACID Y POSEE SOPORTE SIN CONEXI�N.
                         
                REDIS:
                        SU POPULARIDAD SE DEBE A SU ALMACENAMIENTO DE DATOS EN MEMORIA RAM.
                         
                AMAZON DYNAMODB:
                        SU SERVICIO ES 100% 'SERVER-LESS'.
                        PROVEE ESCALABILIDAD AUTOM�TICA Y PERMITE TRANSACCIONES SEGURAS.
                         
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
                       
            PRIMERO DEFINIREMOS QU� SON LOS DATOS (DATA):
                CARACTERES O S�MBOLOS CON LOS QUE SE REALIZAN OPERACIONES MEDIANTE UNA M�QUINA.
                    - PUEDEN ALMACENARSE Y TRANSMITIRSE EN FORMA DE SE�ALES EL�CTRICAS.
                    - SE REGISTRAN EN SOPORTES DE ALMACENAMIENTO MAGN�TICOS, �PTICOS O MEC�NICOS.
                         
            * BIG DATA:
                SON DATOS QUE POSEEN LA CARACTER�STICA 'ESPECIAL' --> QUE SU TAMA�O ES MUY GRANDE.
                    - ES UNA COLECCI�N DE DATOS 'GIGANTE' Y, QUE CRECE CADA VEZ M�S CON EL TIEMPO.
                    - MANEJA DATOS TAN GRANDES Y TAN TEDIOSOS DE ADMINISTRAR QUE NO SE POD�A MANEJAR CON LAS HERRAMIENTAS QUE HAB�A.
                         
            - CARACTER�STICAS DIFERENCIALES:
                QUE PRESENTAN DESAF�OS IMPORTANTES A LA HORA DE DISE�AR SOLUCIONES.
                    - ESCALABILIDAD A GRAN VOLUMEN.
                    - RAPIDEZ DE MOVER INFORMACI�N Y DE PROCESARLA.
                    - PROPIEDADES DE ALGUNOS DE LOS DATOS QUE SE TRATAR�N EN EL PROCESO.
                         
            - OBJETIVO:
                    SACAR A LA LUZ CONOCIMIENTOS Y CONEXIONES DE GRANDES VOL�MENES DE DATOS HETEROG�NEOS
                    QUE NO SER�AN POSIBLES CON M�TODOS CONVENCIONALES.
                         
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
                       
            ESTRUCTURADO:
                         
                    DATOS ESTRUCTURADOS:
                            TODA AQUELLA INFORMACI�N QUE PUEDA SER ALMACENADA, Y SEA ACCESIBLE DE FORMA FIJA.
                         
                    CON EL PASO DEL TIEMPO, LOS SISTEMAS DE ALMACENAMIENTO HAN SIDO MEJORADOS
                    CON DISTINTAS T�CNICAS QUE MEJORAN EL TRABAJO CON ESTE TIPO DE DATOS ESTRUCTURADOS.
                            - ACTUALMENTE EXISTE EL PROBLEMA DEL CRECIMIENTO DE LOS DATOS: CON TAMA�O ZETTABYTES.
                         
                            1 ZETTABYTE.    --> MIL EXABYTES.                                     10 ELEVADO A  3   EXABYTES.
                                            --> 1 MILL�N DE PETABYTES.                            10 ELEVADO A  6  PETABYTES.
                                            --> 1 BILL�N DE TERABYTES.                            10 ELEVADO A  9  TERABYTES.
                                            --> MIL BILLONES DE GIGABYTES.                        10 ELEVADO A 12  GIGABYTES.
                                            --> 1 MILL�N DE BILLONES DE MEGABYTES.                10 ELEVADO A 15  MEGABYTES.
                                            --> 1 BILL�N DE BILLONES DE KILOBYTE.                 10 ELEVADO A 18  KILOBYTES.
                                            --> MIL BILLONES DE BILLONES DE BYTES.                10 ELEVADO A 21      BYTES.
                                            --> 8 MIL BILLONES DE BILLONES DE BYTS.           8 * 10 ELEVADO A 21       BYTS.
                         
                    VIENDO ESTAS CIFRAS PODEMOS ENTENDER F�CILMENTE POR QU� SE LE DA EL NOMBRE DE BIG DATA.
                         
                         
            NO ESTRUCTURADOS:
                         
                    CUALQUIER DATO CUYA FORMA O ESTRUCTURA SEA DESCONOCIDA, SE CLASIFICAR� COMO DATOS NO ESTRUCTURADOS.
                         
                    HOY EN D�A MUCHAS COMPA��AS DISPONEN DE SISTEMAS NO ESTRUCTURADOS DONDE MEZCLAN COLECCIONES
                    QUE CONTIENEN IM�GENES DE TEXTO, N�MEROS, DIRECCIONES, FICHEROS MULTIMEDIA DE IMAGEN Y SONIDO, ETC...
                         
                    ADEM�S DEL PROBLEMA DEL TAMA�O DE LOS DATOS,
                    LOS DATOS NO ESTRUCTURADOS PLANTEAN OTRAS DIFICULTADES PARA SU PROCESAMIENTO.
                         
                    ESTO PUEDE SUPONER UN PROBLEMA REAL SI ESTOS DATOS NO SON PROCESADOS
                    Y SI NO SE SABE SACAR PARTIDO DE ELLOS.
                         
                         
            SEMI-ESTRUCTURADOS:
                         
                    TIENEN LA SIMILITUD DE SER EN PARTE, DATOS ESTRUCTURADOS, EN CUYO INTERIOR POSEEN DATOS NO ESTRUCTURADOS.
                         
                    LA REALIDAD ES QUE NO EST�N PLANTEADOS PARA SER PLENAMENTE ESTRUCTURADOS COMO UNA TABLA.
                         
                    UN EJEMPLO SER�A LOS DATOS REPRESENTADOS COMO EN EL FORMATO XML O JSON.
                    SON FICHEROS DE DATOS ESTRUCTURADOS PERO ...
                    DENTRO PUEDEN CONTENER ENLACES A INFORMACI�N NO ESTRUCTURADA.
                         
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
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
        **********************************************************************************************************************************
                       
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