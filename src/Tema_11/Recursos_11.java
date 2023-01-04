package Tema_11;

import static Principal_Main.Main.*;
import static Tema_11.T_11.*;

/**
 *
 * @author Juan José Estévez González
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
                         
            EN CONCRETO No-SQL NO REPRESENTA UN PRODUCTO ÚNICO O UNA ÚNICA TECNOLOGÍA.
            No-SQL:
                    - REPRESENTA UN GRUPO DE PRODUCTOS Y UN CONJUNTO RELACIONADO DE CONCEPTOS PARA EL ALMACENAMIENTO Y SU ADMINISTRACIÓN.
                    - SE REFIERE A BASES DE DATOS Y ALMACENES DE DATOS
                      NO BASADOS EN EL SISTEMA TRADICIONAL DE BASES DE DATOS RELACIONALES ENTRE SÍ,
                      O NO BASADOS EN SUS PRINCIPIOS.
                    - SUELE RELACIONARSE CON GRANDES CONJUNTOS DE DATOS A LOS QUE SE ACCEDE Y SE MANIPULAN A ESCALA WEB.
                    - FUE TAMBIÉN UN 'HASHTAG' ESCOGIDO PARA UNA GRAN REUNIÓN TÉCNICA PARA DISCUTIR LAS NUEVAS BASES DE DATOS.
                         
            LAS BASES DE DATOS No-SQL TIENEN UNA SERIE DE CARACTERÍSTICAS COMUNES COMO:
                    - MODELO DE DATOS NO RELACIONAL.
                    - FUNCIONAN BIEN EN CLUSTERS,
                      ENTENDIENDO POR CLUSTER UN CONJUNTO DE MÁQUINAS IMPLEMENTADAS COMO SERVIDORES DE PROCESAMIENTO PARALELO.
                            - FUNCIONAN ENTRE SÍ COMO UN ÚNICO RECURSO.
                            - A CADA ELEMENTO O MÁQUINA LO LLAMAMOS NODO.
                    - SUELEN SER EN SU MAYORÍA DE CÓDIGO ABIERTO.
                    - SU CONSTRUCCIÓN ESTÁ ORIENTADA PARA LAS APLICACIONES WEB DE NUEVA GENERACIÓN.
                    - SON BASES DE DATOS CON AUSENCIA DE ESQUEMAS (SCHEMALESS).
                            - ESTA ES UNA CARACTERÍSTICA MUY FLEXIBLE:
                              SE PUEDE ALMACENAR INFORMACIÓN NO UNIFORME, Y ASÍ SE FACILITA LA EVOLUCIÓN.
                              
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
                       
            CADA VEZ AUMENTA MÁS EL VOLUMEN Y EL TIPO DE DATOS QUE SE PRODUCEN, SE MANEJAN, ANALIZAN Y SE ARCHIVAN,
            EN MUCHOS CASOS CON DATOS SEMIESTRUCTURADOS:
                    - LA EXPLOSIÓN DEL SOCIAL-MEDIA Y LOS CONTENIDOS MANEJADOS POR EL USUARIO.
                    - APORTACIONES DE LAS NUEVAS FUENTES DE INFORMACIÓN COMO SENSORES, SISTEMAS GLOBALES DE POSICIONAMIENTO O GPS,
                      REASTREADORES, Y OTROS TIPOS DE SISTEMAS QUE MONITOREAN GRANDES CANTIDADES DE INFORMACIÓN DE FORMA REGULAR.
                         
            ESTO HA PROVOCADO UNA REVISIÓN DE LAS BASES DE DATOS RELACIONALES, UNA DEFINICIÓN DEL ESQUEMA Y REFERENCIAS RELACIONALES.
                         
            PARA RESOLVER EL PROBLEMA RELACIONADO CON LOS GRANDES VOLÚMENES DE INFORMACIÓN Y LOS DATOS SEMI-ESTRUCTURADOS,
            SURGEN NUEVAS CLASES DE BASES DE DATOS DENTRO DE LA FAMILIA No-SQL.
                        
            ESTE TIPO DE BASES DE DATOS CONSISTE EN EL ALMACENAMIENTO BASADO EN COLUMNAS,
            CLAVE-VALOR Y DE DOCUMENTOS, QUE ESTUDIAREMOS MÁS ADELANTE.
                         
                - EL USUARIO EDy Latam EN UN POST DE UNA RED SOCIAL TIENE UNA INFORMACÓN QUE SERÁ GUARDADA EN BASE DE DATOS...
                         
                * EN UNA BASE DE DATOS RELACIONAL ESA INFORMACIÓN SE DIVIDE Y REPARTE EN DISTINTAS TABLAS.
                         
                * EN UNA BASE DE DATOS NoSQL TODA LA INFORMACIÓN SE ALMACENA EN UN FICHERO BSON,
                  PUDIENDO ESTAR REPETIDA TODA LA INFORMACIÓN EN DISTINTOS PUNTOS
                  CON EL FIN DE ACCEDER A LA INFORMACIÓN LO MÁS RÁPIDO POSIBLE.
                         
                   SQL                      VS                       NO SQL
              (RELACIONALES)                                    (NO RELACIONALES)
                         
            EVITA LA REDUNDANCIA                               USAN LA REDUNDANCIA
                 DE DATOS                                         DE DATOS PARA
              ORGANIZANDOLOS                                     HACER CONSULTAS
                EN TABLAS.                                          MÁS RÁPIDO.
               
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
                         
                A.- LA INFORMACIÓN ESTÁ ALMACENADA EN UN MODELO RELACIONAL CON FILAS Y COLUMNAS.                         
                    UNA FILA CONTIENE INFORMACIÓN SOBRE UN ELEMENTO MIENTRAS QUE LAS COLUMNAS CONTIENEN INFORMACIÓN ESPECÍFICA.
                         
                B.- SIGUE UN ESQUEMA FIJO. LAS COLUMNAS SON DEFINIDAS Y ESTABLECIDAS ANTES DE LA ENTRADA DE DATOS.
                    ADEMÁS, CADA FILA CONTIENE INFORMACIÓN DE CADA COLUMNA.
                         
                C.- A FAVOR DEL ESCALADO VERTICAL.
                         
                D.- ACID. --> ATOMICIDAD, CONSISTENCIA, AISLAMIENTO Y DURABILIDAD.
                         
            BASES DE DATOS No-SQL:
                         
                A.- LA INFORMACIÓN ESTÁ ALMACENADA EN UN CLIENTE O EN UNA BASE DE DATOS DIFERENTE CON MODELOS DE DATOS DISTINTOS.
                         
                B.- SIGUE UN ESQUEMA DIMÁMICO, PUEDES AÑADIR COLUMNAS EN CUALQUIER MOMENTO.
                         
                C.- FACILITA EL ESCALADO HORIZONTAL. SE PUEDE ESCALAR A TRAVÉS DE SERVIDORES MÚLTIPLES.
                    LOS SERVIDORES MÚLTIPLES TIENEN LA VENTAJA DEL PRECIO EN RELACIÓN AL HARDWARE
                    QUE SE VA AÑADIENDO COMPARADO CON EL ESCALADO VERTICAL.
                         
                D.- NO ESTÁ A FAVOR DE LOS PRINCIPIOS ACID.
                         
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
                       
            CAPACIDAD DE FUENTE DE DATOS PRIMARIA Y DE ANÁLISIS:
                         
                    * DEBE SERVIR COMO FUENTE PRINCIPAL DE DATOS QUE RECIBE INFORMACIÓN DE DISTINTAS APLICACIONES DE NEGOCIO Y SISTEMAS.
                    * TAMBIÉN DEBE ACTUAR COMO SEGUNDA FUENTE DE INFORMACIÓN O ANÁLISIS PARA LAS APLICACIONES DE 'Business Intelligence'.
                    * DEBEN DE SER CAPACES DE INTEGRARSE DE UNA FORMA RÁPIDA A TODOS LOS TIPOS DE DATOS ESTRUCTURADOS,
                      SEMIESTRUCTURADOS O SIN ESTRUCTURA. DEBEN ALMACENAR TODO TIPO DE DATOS.
                    * DEBEN SER CAPACES DE EJECUTAR CONSULTAS DE ALTO RENDIMIENTO.
                         
            CAPACIDAD BIG DATA: -> PERO NO LIMITADA A TRABAJAR CON BIG DATA.
                         
                    * PUEDE ESCALAR PARA ADMINISTRAR GRANDES VOLÚMENES DE DATOS DESDE TERABYTES HASTA PETABYTES.
                    * ADEMÁS DE ALMACENAR GRANDES VOLÚMENES DE DATOS, OFRECE UN ALTO RENDIMIENTO
                      PARA LA VELOCIDAD, VARIEDAD Y COMPLEJIDAD DE LOS DATOS.
                         
            DISPONIBILIDAD CONTINUA:
                         
                DEBE OFRECER DISPONIBILIDAD CONTINUA, SIN UN SOLO PUNTO DE FALLO, Y ADEMÁS DE MANERA INTEGRADA,
                INCLUYENDO LAS SIGUIENTES CARACTERÍSTICAS:
                         
                    * TODOS LOS NODOS DE UN CLÚSTER DEBEN PODER ATENDER SOLICITUDES DE LECTURA INCLUSO SI ALGUNAS MÁQUINAS NO FUNCIONAN.
                    * DEBE SER CAPAZ DE REPLICAR Y SEGREGAR DATOS FÁCILMENTE ENTRE DIFERENTES PARTES FÍSICAS EN UN CENTRO DE DATOS.
                    * ESTO EVITARÁ CORTES DE HARDWARE.
                    * DEBE PODER ADMITIR DISEÑOS DE DISTRIBUCIÓN DE DATOS QUE SEAN CENTROS DE DATOS MÚLTIPLES
                      YA SEA EN INSTANCIACIONES FÍSICAS O EN LA NUBE.
                         
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
                       
            CAPACIDAD DE TENER MÚLTIPLES CENTROS DE DATOS: (FISICOS Y EN LA NUBE).
                    UNA BUENA SOLUCIÓN EMPRESARIAL No-SQL DEBE ADMITIR LA IMPLEMENTACIÓN DE VARIOS CENTROS DE DATOS
                    Y DEBE PROPORCIONAR UNA OPCIÓN CONFIGURABLE PARA MANTENER UN EQUILIBRIO ENTRE EL RENDIMIENTO Y LA COHERENCIA.
                            - POR LO GENERAL, EN UN ENTORNO PROFESIONAL,
                              LAS EMPRESAS POSEEN BASES DE DATOS ALTAMENTE DISTRIBUIDAD QUE SE ENCUENTRAN
                              EN VARIOS CENTROS DE DATOS Y UBICACIONES GEOGRÁFICAS DISTINTAS.
                            - AUNQUE LA RECEPCIÓN DE DATOS ES UNA CARACTERÍSTICA QUE OFRECEN TODAS LAS BASES DE DATOS RELACIONALES,
                              NINGUNA PUEDE OFRECER UN MODELO SIMPLE DE DISTRIBUCIÓN DE DATOS ENTRE VARIOS CENTROS DE DATOS
                              SIN SUFRIR PROBLEMAS DE RENDIMIENTO.
                         
            FÁCIL REPLICACIÓN INDEPENDIENTEMENTE DE LA UBICACIÓN:
                    PARA EVITAR QUE LA PÉRDIDA DE DATOS AFECTE A UNA APLICACIÓN,
                    UNA BUENA SOLUCIÓN No-SQL PROPORCIONA UNA GRAN CAPACIDAD DE REPLICACIÓN.
                    CAPACIDAD DE LECTURA Y ESCRITURA EN CUALQUIER LUGAR CON COMPATIBILIDAD TOTAL E INDEPENDIENTE DE UBICACIÓN.
                            - SE PUEDEN ESCRIBIR DATOS EN CUALQUIER NODO DE UN CLÚSTER.
                            - DEBE GARANTIZAR QUE LOS DATOS ESTÉN SEGUROS EN CASO DE CORTE DE SUMINISTRO ELÉCTRICO U OTRO TIPO DE INCIDENTE.
                            - HACER QUE SE REPLIQUEN EN OTROS NODOS DE MANERA AUTOMÁTICA.
                            - PONERLOS A DISPOSICIÓN DE TODOS LOS USUARIOS INDEPENDIENTEMENTE DE SU UBICACIÓN.
                         
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
                       
            SIN CAPA DE ALMACENAMIENTO EN CACHÉ SEPARADA:
                    NO REQUIERE UNA CAPA DE ALMACENAMIENTO EN CACHÉ ESPECÍFICA.
                    LAS CACHÉ DE TODOS LOS NODOS PUEDEN ALMACENAR DATOS PARA:
                            - ENTRADA Y SALIDA RÁPIDA.
                            - PARA UN ACCESO ENTRADA/SALIDA.
                    ELIMINA EL PROBLEMA DE SINCRONIZAR LOS DATOS DE LA CACHÉ CON LA BASE DE DATOS PERSISTENTE.
                            - LA CACHÉ SON MEMORIAS INTERMEDIAS, CON LAS CUALES TRABAJAMOS LOS USUARIOS
                              QUE ESTAMOS ACCEDIENDO A LA BASE DE DATOS, PARA CONSEGUIR UN ACCESO MÁS RÁPIDO.
                            - LA BASE DE DATOS PERSISTENTE ES DONDE SE PASA LA INFORMACIÓN
                              UNA VEZ QUE LA INFORMACIÓN DE LA CACHÉ YA ESTÁ CONFIRMADA
                              PARA GUARDARLA A LARGO PLAZO.
                            - DE ESTA FORMA, ADMITE UNA ESCALABILIDAD SIMPLE
                              CON MENOS PROBLEMAS DE ADMISIÓN, REDUNDANCIA, CONSISTENCIA, ETC...
                         
            LISTA EN LA NUBE:
                    DADO QUE LA ADAPTACIÓN DE LA INFRAESTRUCTURA DE LA NUBE AUMENTA DÍA A DÍA,
                    UNA SOLUCIÓN No-SQL DE NIVEL EMPRESARIAL DEBE ESTAR PREPARADA PARA LA NUBE,
                    CUMPLIENDO VARIAS CONDICIONES:
                            - PODER FUNCIONAR EN UNA CONFIGURACIÓN DE LA NUBE
                              COMO AMAZON EC2, GOOGLE CLOUD, MICROSOFT AZURE, ETC...
                            - PODER EXTENDER Y REDUCIR UN CLÚSTER CUANDO SEA NECESARIO.
                            - ADMITIR UNA SOLUCIÓN HÍBRIDA EN LA QUE PARTE DE LA BASE DE DATOS
                              SE ALOJE DENTRO DE LAS INSTALACIONES DE LA EMPRESA Y OTRA PARTE SE ALOJE EN LA NUBE.
                         
            ALTO RENDIMIENTO CON ESCALABILIDAD LINEAL:
                    NORMALMENTE, EL RENDIMIENTO DE OTROS SISTEMAS DE BASES DE DATOS, PUEDE DISMINUIR CUANDO SE AÑADEN MÁS NODOS.
                    UNA BUENA SOLUCIÓN No-SQL AUMENTA EL RENDIMIENTO DE LAS OPERACIONES DE LECTURA CUANDO SE AGREGAN NODOS ADICIONALES.
                            - UNA BASE DE DATOS DE ESTE TIPO PUEDE MEJORAR EL RENDIMIENTO AGREGANDO NODOS A UN CLÚSTER.
                            - ESTAS GANANCIAS DE RENDIMIENTO SON DE NATURALEZA LINEAL.
                         
            OTROS BENEFICIOS:
                    - SOPORTE DE ESQUEMA FLEXIBLE.
                    - ADMITE LENGUAJES Y PLATAFORMAS CLAVE PARA DESARROLLADORES.
                    - FÁCIL DE IMPLEMENTAR, MANTENER Y EXTENDER,
                    - COMUNIDAD DE CÓDIGO ABIERTO.
                         
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
                         
            BASES DE DATOS BASADAS EN GRÁFICOS:
                    - UNA BASE DE DATOS BASADA EN GRÁFICOS ES UNA BASE DE DATOS DE RED
                      QUE UTILIZA NODOS PARA REPRESENTAR Y ALMACENAR DATOS.
                    - EJEMPLOS:  --> NEO4J, INFOGRID, INFINITE GRAPH Y FLOCKDB.
                         
                         
            LA VARIEDAD DE OPCIONES EN LA NUBE DE BASES DE DATOS No-SQL TIENE SUS PROPIAS:
                    - VENTAJAS:
                            PERMITEN ELEGIR UN DISEÑO DE ACUERDO A LOS REQUISITOS DE SU SISTEMA.
                    - INCONVENIENTES:
                            AÚN AJUSTANDO EL PRODUCTO A LOS RECURSOS DEL SISTEMA NO SIEMPRE FUNCIONARÁ CORRECTAMENTE.
                         
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
                       
            SON BASES DE DATOS QUE PRIORIZAN EL ACCESO RÁPIDO A LA INFORMACIÓN
            POR ENCIMA DE LA INTEGRIDAD DE LOS DATOS.
                         
                AZURE COSMOS DB:
                        MULTI-MODELO, DE DISTRIBUCIÓN GLOBAL Y ESCALADO HORIZONTAL.
                        DESARROLLADA POR MICROSOFT.
                         
                MONGODB:
                        ORIENTADA A LA DOCUMENTACIÓN.
                        SUS DATOS SON ALMACENADOS EN BSON, QUE ES UNA REPRESENTACIÓN BINARIA DE JSON.
                         
                ARANGODB:
                        UTILIZA SU LENGUAJE LLAMADO AQL
                        Y ESTO LE PERMITE CREAR ESTRUCTURAS DE TIPO CLAVE/VALOR, RELACIONALES Y GRAFOS.
                        
                GOOGLE CLOUD FIRESTORE:
                        DE USO EN LA NUBE.
                        PERMITE TRANSACCIONES ACID Y POSEE SOPORTE SIN CONEXIÓN.
                         
                REDIS:
                        SU POPULARIDAD SE DEBE A SU ALMACENAMIENTO DE DATOS EN MEMORIA RAM.
                         
                AMAZON DYNAMODB:
                        SU SERVICIO ES 100% 'SERVER-LESS'.
                        PROVEE ESCALABILIDAD AUTOMÁTICA Y PERMITE TRANSACCIONES SEGURAS.
                         
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
                       
            PRIMERO DEFINIREMOS QUÉ SON LOS DATOS (DATA):
                CARACTERES O SÍMBOLOS CON LOS QUE SE REALIZAN OPERACIONES MEDIANTE UNA MÁQUINA.
                    - PUEDEN ALMACENARSE Y TRANSMITIRSE EN FORMA DE SEÑALES ELÉCTRICAS.
                    - SE REGISTRAN EN SOPORTES DE ALMACENAMIENTO MAGNÉTICOS, ÓPTICOS O MECÁNICOS.
                         
            * BIG DATA:
                SON DATOS QUE POSEEN LA CARACTERÍSTICA 'ESPECIAL' --> QUE SU TAMAÑO ES MUY GRANDE.
                    - ES UNA COLECCIÓN DE DATOS 'GIGANTE' Y, QUE CRECE CADA VEZ MÁS CON EL TIEMPO.
                    - MANEJA DATOS TAN GRANDES Y TAN TEDIOSOS DE ADMINISTRAR QUE NO SE PODÍA MANEJAR CON LAS HERRAMIENTAS QUE HABÍA.
                         
            - CARACTERÍSTICAS DIFERENCIALES:
                QUE PRESENTAN DESAFÍOS IMPORTANTES A LA HORA DE DISEÑAR SOLUCIONES.
                    - ESCALABILIDAD A GRAN VOLUMEN.
                    - RAPIDEZ DE MOVER INFORMACIÓN Y DE PROCESARLA.
                    - PROPIEDADES DE ALGUNOS DE LOS DATOS QUE SE TRATARÁN EN EL PROCESO.
                         
            - OBJETIVO:
                    SACAR A LA LUZ CONOCIMIENTOS Y CONEXIONES DE GRANDES VOLÚMENES DE DATOS HETEROGÉNEOS
                    QUE NO SERÍAN POSIBLES CON MÉTODOS CONVENCIONALES.
                         
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
                            TODA AQUELLA INFORMACIÓN QUE PUEDA SER ALMACENADA, Y SEA ACCESIBLE DE FORMA FIJA.
                         
                    CON EL PASO DEL TIEMPO, LOS SISTEMAS DE ALMACENAMIENTO HAN SIDO MEJORADOS
                    CON DISTINTAS TÉCNICAS QUE MEJORAN EL TRABAJO CON ESTE TIPO DE DATOS ESTRUCTURADOS.
                            - ACTUALMENTE EXISTE EL PROBLEMA DEL CRECIMIENTO DE LOS DATOS: CON TAMAÑO ZETTABYTES.
                         
                            1 ZETTABYTE.    --> MIL EXABYTES.                                     10 ELEVADO A  3   EXABYTES.
                                            --> 1 MILLÓN DE PETABYTES.                            10 ELEVADO A  6  PETABYTES.
                                            --> 1 BILLÓN DE TERABYTES.                            10 ELEVADO A  9  TERABYTES.
                                            --> MIL BILLONES DE GIGABYTES.                        10 ELEVADO A 12  GIGABYTES.
                                            --> 1 MILLÓN DE BILLONES DE MEGABYTES.                10 ELEVADO A 15  MEGABYTES.
                                            --> 1 BILLÓN DE BILLONES DE KILOBYTE.                 10 ELEVADO A 18  KILOBYTES.
                                            --> MIL BILLONES DE BILLONES DE BYTES.                10 ELEVADO A 21      BYTES.
                                            --> 8 MIL BILLONES DE BILLONES DE BYTS.           8 * 10 ELEVADO A 21       BYTS.
                         
                    VIENDO ESTAS CIFRAS PODEMOS ENTENDER FÁCILMENTE POR QUÉ SE LE DA EL NOMBRE DE BIG DATA.
                         
                         
            NO ESTRUCTURADOS:
                         
                    CUALQUIER DATO CUYA FORMA O ESTRUCTURA SEA DESCONOCIDA, SE CLASIFICARÁ COMO DATOS NO ESTRUCTURADOS.
                         
                    HOY EN DÍA MUCHAS COMPAÑÍAS DISPONEN DE SISTEMAS NO ESTRUCTURADOS DONDE MEZCLAN COLECCIONES
                    QUE CONTIENEN IMÁGENES DE TEXTO, NÚMEROS, DIRECCIONES, FICHEROS MULTIMEDIA DE IMAGEN Y SONIDO, ETC...
                         
                    ADEMÁS DEL PROBLEMA DEL TAMAÑO DE LOS DATOS,
                    LOS DATOS NO ESTRUCTURADOS PLANTEAN OTRAS DIFICULTADES PARA SU PROCESAMIENTO.
                         
                    ESTO PUEDE SUPONER UN PROBLEMA REAL SI ESTOS DATOS NO SON PROCESADOS
                    Y SI NO SE SABE SACAR PARTIDO DE ELLOS.
                         
                         
            SEMI-ESTRUCTURADOS:
                         
                    TIENEN LA SIMILITUD DE SER EN PARTE, DATOS ESTRUCTURADOS, EN CUYO INTERIOR POSEEN DATOS NO ESTRUCTURADOS.
                         
                    LA REALIDAD ES QUE NO ESTÁN PLANTEADOS PARA SER PLENAMENTE ESTRUCTURADOS COMO UNA TABLA.
                         
                    UN EJEMPLO SERÍA LOS DATOS REPRESENTADOS COMO EN EL FORMATO XML O JSON.
                    SON FICHEROS DE DATOS ESTRUCTURADOS PERO ...
                    DENTRO PUEDEN CONTENER ENLACES A INFORMACIÓN NO ESTRUCTURADA.
                         
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