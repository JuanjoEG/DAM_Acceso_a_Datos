package Tema_07;

import static Principal_Main.Main.*;
import static Tema_07.T_07.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_07 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_07 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************

            - JAVA ES UN LENGUAJE DE PROGRAMACIÓN ORIENTADO A OBJETOS EL CUAL PUEDE SER REPRESENTADO EN UN DIAGRAMA DE OBJETOS;
              MIENTRAS QUE UNA BASE DE DATOS RELACIONAL SE REPRESENTA EN UN FORMATO TABULAR USANDO FILAS Y COLUMNAS.
                    - CUANDO SE TRATA DE GRABAR UN OBJETO EN BASES DE DATOS, EXISTEN ALGUNAS DIFERENCIAS ENTRE ESTOS DOS SISTEMAS,
                      QUE PUEDEN DAR LUGAR A PROBLEMAS: PARA SOLVENTARLO TENEMOS LA AYUDA DEL MAPEO OBJETO RELACIONAL. ORM.

           - PODEMOS DEFINIR UN ORM COMO UN FRAMEWORK, UN MARCO DE TRABAJO,
             QUE FACILITA EL ALMACENAMIENTO DE LOS OBJETOS A UNA BASE DE DATOS RELACIONAL.
                    - EN CUALQUIER BASE DE DATOS, EL NIVEL DE ELEMENTO MÁS ALTO ES LA TABLA,
                      DIVIDIDA A SU VEZ EN FILAS Y COLUMNAS.
                            - UNA COLUMNA CONTIENE VALORES EN UN TIPO DE DATO DETERMINADO.
                            - UNA FILA CONTENDRÁ UN CONJUNTO DE INFORMACIÓN DE UNA TABLA DETERMINADA.

                    - SE MAPEARÍA UN OBJETO PLANO CON SU 'EQUIVALENTE' EN UNA FILA DE UNA BD RELACIONAL.
                            - DESDE LA BD RELACIONAL SE OBTENDRÍA EL OBJETO EN EL OTRO SENTIDO.

                    - FLUJO DEL MAPEO OBJETO RELACIONAL:
                            1.- PARTIMOS DE UNA APLICACIÓN CON OBJETOS DESARROLLADOS EN JAVA.
                            2.- PASAMOS POR UN FRAMEWORK QUE PREPARA ESOS OBJETOS EN ENTIDADES FÁCILES DE PERSISTIR.
                            3.- LAS ENTIDADES SE ALMACENAN EN BASES DE DATOS.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """

            - OPERACIONES CON LAS BASES DE DATOS:
                   - CONEXIÓN: JAVA POSEE UNA API DE CONEXIÓN A BASE DE DATOS: LOS DRIVERS JDBC.
                   - CONSULTA: JAVA FACILITA LA FORMA DE CONSULTAR LA INFORMACIÓN EN BASES DE DATOS USANDO SQL.
                           - ESCRIBIRÍAMOS CIERTAS CONSULTAS SQL NATIVAS,
                             Y OBTENDRÍAMOS UN RESULTSET CON EL RESULTADO DE NUESTRA QUERY.
                                       
            - PROBLEMA:
                   - EL DESARROLADOR DEBE CONOCER LA BASE DE DATOS A FONDO,
                     Y SABER QUÉ TIPO DE RELACIONES EXISTEN ENTRE TABLAS,
                     ASÍ COMO EL NOMBRE EXACTO DE LAS COLUMNAS, CONSTRAINTS (CONDICIONES, REQUISITOS, RESTRICCIONES), ETC...
                                       
            - LA PERSPECTIVA SERÍA OTRA SI CONSIGUIERAMOS REALIZAR LAS MISMAS OPERACIONES CON LOS DATOS DESDE JAVA:
                   - TENDRÍAMOS ABSTRACCIÓN, HERENCIA, COMPOSICIÓN, MÉTODOS, IDENTIDAD,
                     Y MUCHAS CARACTERÍSTICAS MÁS EN LA PARTE DE LA APLICACIÓN JAVA.
                           - ESTAS CARACTERÍSTICAS SE PUEDEN CONSEGUIR TAMBIÉN POR MEDIO DE FRAMEWORKS;
                             ESE ES UNO DE LOS MOTIVOS DEL USO DE LOS    --->   ORM.
                                       
            EXISTEN DISTINTOS TIPOS DE BASES DE DATOS,
            CADA UNA CON DIFERENTES TIPOS DE FUNCIONALIDADES Y TIPOLOGÍA DE DATOS DEFINIDOS.
                   - CUANDO USAMOS LA CONEXIÓN JDBC DEBEMOS TENER EN CUENTA ESTE TIPO DE DIFERENCIAS.
                                       
                *********************************************************************************************
                *              VENTAJAS USO ORM               *          INCONVENIENTES USO ORM             *
                *********************************************************************************************
                *  MEJORA LA EFICIENCIA DEL DESARROLLO        *  EL MAPEO AUTOMÁTICO DE LAS BD CONSUME      *
                *                                             *  MUCHOS RECURSOS DEL SISTEMA                *
                *---------------------------------------------*---------------------------------------------*
                *  DESARROLLO MÁS ORIENTADO A OBJETOS         *  LA SINTAXIS DE LOS ORM A VECES PUEDE       *
                *                                             *  COMPLICARSE  SI REALIZAMOS CONSULTAS MUY   *
                *                                             *  COMPLEJAS MEDIANTE LAS QUE CRUCEMOS        *
                *                                             *  VARIAS TABLAS Y CON DIVERSAS CONDICIONES   *
                *---------------------------------------------*---------------------------------------------*
                *  MANEJABILIDAD                              *                                             *
                *---------------------------------------------*---------------------------------------------*
                *  FACILIDAD PARA INTRODUCIR NUEVAS FUNCIONES *                                             *
                *  POR EJEMPLO EL CACHEO DE INFORMACIÓN       *                                             *
                *********************************************************************************************
                                       
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

                                **********************************************************************
                                *           DENTRO DE LA APLICACIÓN           *        EXTERNA       *
                                **********************************************************************
                                *        FASE 1        *        FASE 2        *        FASE 3        *
                                *----------------------*----------------------*----------------------*
                                *   CAPA DE SERVICIO   *      OBJECT GRID     *                      *
                                *         POJO         *      JPA LOADER      *                      *
                                *       ENTIDADES      *  ARCHIVO ASIGNACIÓN  *         BDD          *
                                *         DAO          *     JPA PROVIDER     *                      *
                                *                      *        MAPPING       *                      *
                                **********************************************************************

            - FASE 1:
                   - CENTRADA EN LOS DATOS DEL OBJETO Y DE TODO EL MODELO DE OBJETOS.
                   - POJO -> PLAIN OLD JAVA OBJECT
                   - CLASES SIMPLES DE JAVA Y CLASES DE IMPLEMENTACIÓN, CON SUS DTO (DIAGRAMAS DE ESTADO), ETC...
                   - CLASES E INTERFACES CON SU CORRESPONDIENTE CAPA DE NEGOCIO DE CADA APLICATIVO.
                           - LLAMADA CAPA DE SERVICIO
                           - ESTARÁN TAMBIÉN LAS CLASES DAO --> CLASES DE ACCESO A DATOS. --> DATA ACCESS OBJECT.
                   - CLASES ORIENTADAS A CAPA DE DATOS: MÉTODOS COMO:
                           - crearObjeto()
                           - encontrarObjeto()
                           - borrarObjeto()
                           - ETC...            

            - FASE 2:
                   - LLAMADA FASE DE PERSISTENCIA O MAPEO.
                   - PROVEEDOR JPA: PROVEEDOR DE ACCESO A DATOS DE JAVA:
                           - LIBRERÍA QUE HACE POSIBLE TODA LA FUNCIONALIDAD DE JPA:  --> javax.persistence
                   - ARCHIVOS DE ASIGNACIÓN: FICHERO XML DONDE SE ALMACENA LA CONFIGURACIÓN DE LA ASIGNACIÓN
                     DE LOS DATOS DE UNA CLASE JAVA POJO Y LOS DATOS REALES DE LA BASE DE DATOS RELACIONAL.
                           - EL MAPEO DEBE RECOGER LA ESTRUCTURA DE LA BASE DE DATOS,
                             CON LOS NOMBRES EXASTOS QUE TENGAN LAS TABLAS, Y SUS CAMPOS, EN LA BASE DE DATOS.
                   - JPA CARGADOR: MEMORIA CACHÉ CON LOS DATOS DE LA BASE DE DATOS PROPORCIONANDO 'UNA COPIA EN MEMORIA RAM';
                     PARA REALIZAR INTERACCIONES RÁPIDAS CON LAS CLASES DE SERVICIO.
                   - REJA DE OBJETO: DONDE SE ALMACENAN TEMPORALMENTE 'LA COPIA EN MEMORIA RAM'
                     DE LOS DATOS DE MUESTRA DE BASE DE DATOS RELACIONAL.
                     LLAMADA 'OBJETO GRID' POR LO QUE TODAS LAS CONSULTAS PASARÁN POR ESTE PUNTO,
                     Y UNA VEZ REALIZADAS LAS VERIFICACIONES PASARÁ A LA BASE DE DATOS PRINCIPAL.

            - FASE 3:
                   - LLAMADA FASE DE DATOS RELACIONALES.
                   - UNA VEZ PASADA LA REJA DE OBJETOS Y TODO HA IDO BIEN, SE IRÁ DIRECTAMENTE A BD.
                   - HASTA ENTONCES, COMO HEMOS MENCIONADO, PERMANECERÁ TEMPORALMENTE EN LA CACHÉ.  

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

            - EBEAN:
                    - SOPORTA BASES DE DATOS COMO H2, POSTGRES, MYSQL, NUODB, POSTGIS, MARIADB, SQL SERVER, ORACLE, SAP, ETC...
                    - MÚLTIPLES NIVELES DE ABSTRACCIÓN: CONSULTAS TIPO ORM MEZCLADAS CON SQL, ADEMÁS CONSULTAS DTO.
                    - BENEFICIOS: 
                            - AJUSTA AUTOMÁTICAMENTE LAS CONSULTAS ORM:
                            - USO MUY EFICIENTE DE TECNOLOGÍAS DE CACHEADO DE DIFERENTES NIVELES:
                                    -REALIZA CONSULTAS MEZCLANDO BASE DE DATOS Y CACHEADO L2, EVITA AUTOMÁTICAMENTE N+1, 
                                     USA CACHÉ DE TIPO L2 PARA REDUCIR CARGA DE BASE DE DATOS, 
                                     CONTIENE TECNOLOGÍA ELASTICSEARCH PARA CACHÉ L3, ETC...

            - IBATIS:
                    - NACE DE LA MANO DE APACHE SOFTWARE FOUNDATION, 
                      POSTERIORMENTE EL DESARROLLO SE CENTRALIZÓ EN 'GOOGLE CODE',
                      CON EL NOMBRE DE MyBatis.
                    - SOPORTE PARA JAVA Y .NET.
                    - POSEE LA OPCIÓN DE DIVIDIR LA CAPA DE PERSISTENCIA EN:
                            - CAPA DE ABSTRACCIÓN.
                            - CAPA DE FRAMEWORK PERSISTENTE.
                            - CAPA DE DRIVER.
                    - UNA DE SUS VIRTUDES ES LA FACILIDAD DE INTERACTUAR CON LOS OBJETOS
                      Y LOS DATOS DE LAS BASES DE DATOS RELACIONALES.
                    - OFRECE ABSTRACCIÓN A NIVEL DE LA CAPA DE PERSISTENCIA DE OBJETOS.

            - HIBERNATE:
                    - ES EL ORM MÁS EXTENDIDO Y MÁS USADO.
                    - DISPONIBLE PARA LENGUAJE JAVA Y TAMBIÉN PARA .NET, LLAMANDOSE PARA ÉSTE CASO NHIBERNATE.
                    - FACILITA EL MAPEO RELACIONAL DE LOS DISTINTO OBJETOS ENTRE UNA BASE DE DATOS RELACIONAL
                      Y EL MODELO DE OBJETOS DE LA APLICACIÓN.
                    - LAS RELACIONES SE ESTABLECEN MEDIANTE UN FICHERO .xml O TAMBIÉN POR MEDIO DE ANOTACIONES.
                    - SIMPLICIDAD: UN SOLO .xml PARA ESTABLECER RELACIONES,
                      SIMPLIFICANDO DIRIGIRNOS A ÉSTE PARA CONSULTAR CUALQUIER RELACIÓN ENTRE ENTIDADES O ATRIBUTOS.
                    - ROBUSTO: DISPONE DE MUCHAS CARACTERÍSTICAS ADAPTADAS AL LENGUAJE JAVA:
                      COLECCIONES, HERNCIA, ABSTRACCIÓN, ORIENTACIÓN A OBJETOS, ETC...
                    - EN LA CAPA DE ABSTRACCIÓN OFRECE UNA PROPIA CAPA DE CONSULTAS SQL, LLAMADA HQL,
                      ORIENTADA A FACILITAR LA SINTAXIS Y A MEJORAR LA EFICIENCIA DE ESTAS CONSULTAS.

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

            - LA ARQUITECTURA HIBERNATE INCLUYE, ENTRE OTROS:
                    - OBJETOS DE PERSISTENCIA.
                    - OBJETOS DE SESIONES.
                    - TRANSACCIONES.

            - HIBERNATE USA EL PRINCIPIO DE REFLEXIÓN JAVA, QUE PERMITE AL ANÁLISIS Y MODIFICACIÓN DE ATRIBUTOS 
              Y CARACTERÍSTICAS DE LAS DISTINTAS CLASES EN TIEMPO DE EJECUCIÓN.

            - LAS CAPAS DE APLICACIÓN E HIBERNATE ESTÁN UNIDAS POR LOS OBJETOS DE PERSISTENCIA.
                    - MOTIVO: EN UNA PARTE ESPECÍFICA DE LA APLICACIÓN SE DA CIERTA CONVERSIÓN (FICHERO DE MAPEO),
                      DONDE LA INFORMACIÓN FLUYE Y ES MAPEADA DESDE DICHOS FICHEROS PERSISTENTES A LA BASE DE DATOS.

            - LA CAPA HIBERNATE ES DONDE SE REALIZA LA CONEXIÓN CON EL DRIVER,
              TAMBIÉN DONDE SE CARGAN TANTO LAS DISTINTAS CONFIGURACIONES HIBERNATE,
              COMO TODAS LAS ENTIDADES PREVIAMENTE DISEÑADAS.

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

            -  SessionFactory Object  --> NOS PERMITE USAR OBJETOS TIPO Session  (UNO POR CADA BDD)           INSTANCIAR LA SESIÓN

                    - ES EL QUE SE PERMITIRÁ EL USO DE OBJETOS DE TIPO Session.
                    - ESTE OBJETO JAVA SE PUEDE INSTANCIAR DE DIFERENTES FORMAS:
                            - NORMALMENTE COGE LA CONFIGURACIÓN DEL FICHERO DE CONFIGURACIÓN POR DEFECTO.
                    - UTILIZAREMOS UN OBJETO SessionFactory POR CADA BASE DE DATOS QUE TENGAMOS EN LA APLICACIÓN.

            -  Session Object         --> NOS PERMITE INSTANCIAR UNA CONEXIÓN DIRECTA A LA BDD RELACIONAL   INSTANCIAR LA CONEXIÓN

                    - UTILIZAREMOS DICHO OBJETO PARA INSTANCIAR UNA CONEXIÓN DIRECTA CON NUESTRA BASE DE DATOS RELACIONAL.
                    - ES UN OBJETO NO MUY PESADO Y SU FUNCIÓN PRINCIPAL ES INTERACTUAR CON LA BASE DE DATOS.
                    - ESTE TIPO DE OBJETOS NO DEBEN PERMANECER ABIERTOS MUCHO TIEMPO POR TEMAS DE SEGURIDAD.

            -  Transaction Object     --> NOS PERMITE MANEJAR TRANSACCTIÓN --> ENTRE COMMIT Y COMMIT (OPCIONAL)

                    - MANEJA LAS TRANSACCIONES DIRECTAMENTE CON LAS BASES DE DATOS RELACIONALES.
                    - ES UN OBJETO OPCIONAL: SI NO SE QUIERE HACER USO DE ÉL, 
                      PODEMOS INDICAR MANUALMENTE AQUELLOS BLOQUES QUE QUEREMOS SEAN TRANSACCIONALES.
                            - RECORDEMOS LA DEFINICIÓN DE TRANSACCIÓN, ORIENTADA A BLOQUE DE OPERACIÓN/ES:
                              PERSISTIR TODAS Y CADA UNA DE LAS OPERACIONES DEL BLOQUE, 
                              O POR EL CONTRARIO, REALIZAR ROLLBACK (MARCHA ATRÁS) EN DICHA OPERACIÓN.

            -  Query Object           --> NOS PERMITE HACER CONSULTAS SQL Y HQL                          EJECUTAR LAS INSTRUCCIONE

                    - EN HIBERNATE DISPONEMOS DE VARIAS FORMAS DE REALIZAR CONSULTAS A LA BASE DE DATOS.
                    - ESTE TIPO DE OBJETOS UTILIZAN CONSULTAS DE TIPO SQL O DE TIPO HIBERNATE QUERY (HQL).
                    - CON ESTE TIPO DE OBJETOS ENLAZAREMOS LOS DISTINTOS PARÁMETROS DE NUESTRA CONSULTA, TAMBIÉN
                      PODREMOS REALIZAR CIERTAS RESTRICCIONES COMO CONTROLAR EL NÚMERO DE RESULTADOS, Y EJECUTAR LA CONSULTA.
                    - ES UN MODO DE REALIZAR CONSULTAS MUCHO MÁS DINÁMICO QUE LAS CONSULTAS NATIVAS.

            -  Criteria Object        --> NOS PERMITE HACER CONSULTAS JAVA                                  FILTRAR USANDO OBJETOS 

                    - DESAPARECERÁ EL LENGUAJE NATIVO DE SQL PARA DAR PASO A LAS CONSULTAS POR MEDIO DE OBJETOS JAVA,
                      Y POR MEDIO DE LAS FUNCIONES QUE NOS OFRECE HIBERNATE, QUE MÁS TARDE SERÁM TRADUCIDAS A SENTENCIAS SQL.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        *******************************************************************************************************************************
        * 1.- SE TRATA DE DE GRABAR UN OBJETO JAVA --> EN UNA BASE DE DATOS RELACIONAL  (TABLA CON FILAS Y COLUMNAS)                  *
        * 2.- TRADUCIR LOS DATOS DE UNA TABLA EN UNA BASE DE DATOS RELACIONAL --> A UN OBJETO JAVA                                    *
        *******************************************************************************************************************************
        *  FASES DEL MAPEO OBJETO RELACIONAL:                                                                                         *
        *                                                                                                                             *
        *      FASE 1: CAPA DE SERVICIO.                                                                                              *
        *            - LAS CLASES POJO --> CLASES SIMPLES EN JAVA PARA PERSISTIR LOS OBJETOS EN BDD                                   *
        *            - LAS CLASES DAO  --> DATA ACCESS OBJECT                                                                         *
        *                                                                                                                             *
        *      FASE 2: CAPA DE PERSISTENCIA O MAPEO.                                                                                  *
        *            - JPA --> LIBRERÍA DEL PROVEEDOR DE ACCESO A DATOS          javax.persistence                                    *
        *            - ARCHIVO DE ASIGNACIÓN XML --> DATOS DE LA CLASE POJO Y DE LA BD RELACIONAL                                     *
        *            - JPA CARGADOR --> MEMORIA CACHÉ CON LOS DATOS DE LA BDD ( COPIA )                                               *
        *            - REJA DE OBJETO --> COPIA TEMPORAL DE LA BDD RELACIONAL ( OBJECT GRID )                                         *
        *                                                                                                                             *
        *      FASE 3: CAPA DE DATOS RELACIONALES.   ( YA ESTAMOS FUERA DE LA APLICACIÓN )                                            *
        *            - DE LA CACHÉ JPA --> PASAMOS --> A LA BDD RELACIONAL EXTERNA A LA APLICACIÓN.                                   *
        *                                                                                                                             *
        *******************************************************************************************************************************
        * HERRAMIENTA ORM A USAR -->  HIBERNATE                                                                                       *
        *                                                                                                                             *
        *    COMPONENTES:                                                                                                             *
        *      -  SessionFactory Object  --> NOS PERMITE USAR OBJETOS TIPO Session  (UNO POR CADA BDD)           INSTANCIAR LA SESIÓN *
        *      -  Session Object         --> NOS PERMITE INSTANCIAR UNA CONEXIÓN DIRECTA A LA BDD RELACIONAL   INSTANCIAR LA CONEXIÓN *
        *      -  Transaction Object     --> NOS PERMITE MANEJAR TRANSACCTIÓN --> ENTRE COMMIT Y COMMIT (OPCIONAL)                    *
        *      -  Query Object           --> NOS PERMITE HACER CONSULTAS SQL Y HQL                          EJECUTAR LAS INSTRUCCIONE *
        *      -  Criteria Object        --> NOS PERMITE HACER CONSULTAS JAVA                                  FILTRAR USANDO OBJETOS *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        *******************************************************************************************************************************
        *  INSTALAR HIBERNATE:  SIMILAR A INSTALACIÓN H2 TEMA 5                                                                       *
        *                                                                                                                             *
        *  PARTIMOS QUE TENEMOS YA UNA BDD CON UNA TABLA CREADA CON MySQL Workbench POR EJEMPLO                                       *
        *                                                                                                                             *
        *                   --  EN NETBEANS --                                                                                        *
        *  1. - FILE -> NEW PROJECT -> JAVA WITH MAVEN -> SPRING BOOT INITIALIZR PROJECT                                              *
        *  2. - (MAVEN PROJECT) (LANGUAGE JAVA) (SPRING BOOT 2.7.5) (PACKAGING JAR) -->                                               *
        *  3. - SELECCIONAR LAS DEPENDENCIES -->  --  H2 DATABASE  --  SPRING DATA JPA  --  SPRING WEB  --  --> NEXT --> FINISH       *
        *  4. - EN EL FICHERO -->  application.properties --> CONFIGURAMOS:                                                           *
        *                                                                                                                             *
        *        spring.jpa.database-platform=org.hibernate.dialect.H2Dialect     -->  BASE DE DATOS                                  *
        *                                                                                                                             *
        *        spring.jpa.show-sql=true                                         -->  HABILITAMOS LAS TRAZAS DE TIPO SQL             *
        *        spring.jpa.properties.hibernate.format_sql=true                  -->  QUE SE MUESTREN CON EL FORMATO CORRESPONDOENTE *
        *                                                                                                                             *
        *        spring.jpa.properties.hibernate.generate_statistics=true         -->  HABILITA LOS LOG DE HIBERNATE                  *
        *        logging.level.org.hibernate.type=trace                                                                               *
        *        logging.level.org.hibernate.stat=info                            -->  TAMBIEN SE PUEDE =debug                        *
        *                                                                                                                             *
        *        spring.jpa.hibernate.ddl-auto=none                               -->  PARA CREAR MANUALMENTE schema.sql & data.aql   *
        *                                                                                                                             *
        *  5. - CREAMOS UNA CLASE JAVA EN LA CARPETA   -->  com.example.demo   (VER EJEMPLO --> CLASE Persona)                        *
        *             - NOMBRE DE LA CLASE      -->   NOMBRE DE LA TABLA                                                              *
        *             - ATRIBUTOS DE LA CLASE   -->   COLUMNAS DE LA TABLA  ( OJO CON LOS TIPOS DE DATOS )                            *
        *             - NECESITAMOS LOS GETTERS, SETTERS Y TOSTRING                                                                   *
        *                                                                                                                             *
        *  6. - INCLUIR LAS DEPENDENCIAS  EN EL ACHIVO   -->  pom.xml     (VER --> EjemploPom.xml)                                    *
        *                   MAVEN  -->  https://search.maven.org/                                                                     *
        *             - HIBERNATE CORE                                                                                                *
        *             - MYSQL CONNECTION                                                                                              *
        *             - LOG4J       (OPCIONAL)                                                                                        *
        *                                                                                                                             *
        *  7. - CREAMOS EL FICHERO DE PERSISTENCIA    --> persistence.xml   (VER --> EjemploPersistence.xml)                          *
        *             - CON EL RATÓN SOBRE NUESTRO PROYECTO -->  BOTÓN DERECHO                                                        *
        *             - NEW -> OTHER ->PERSISTENCE -> PERSISTENCE UNIT -> SEGUIR EL ASISTENTE                                         *
        *             PONER NOMBRE A LA CONEXIÓN  Y SELLECCIONAR A QUÉ BDD TE QUIERES CONECTAR   --> BUSCAR EL CONECTOR MySQL .jar    *
        *             PONER USUARIO Y CONTRASEÑA  -->  PROBAR LA CONEXIÓN  --> NEXT ...                                               *
        *                                                                                                                             *
        *                                                                                                                             *
        *  8. - MODIFICAR CLASE DE LA BASE DE DATOS CON ANOTACIONES                                                                   *
        *             - @Entity                              --> ESTE CLASE SE CORRESPONDE CON ...                                    *
        *             - @Table(name = "persona")             --> ESTA TABLA EN LA BDD                                                 *
        *             - @Column(name="id_persona")           --> CON CLAVE PRIMARIA ...                                               *
        *             - @Id                                  --> Y NÚMEROS ENTEROS AUTOCOMPLETABLES                                   *
        *                                                                                                                             *
        *  9. - EN EL FICHERO .java PRINCIPAL DE NUESTRO PROYECTO  --> DENTRO  DEL main  ...                                          *
        *                                                                                                                             *
        *           String hql = "SELECT p FROM Persona p";          <-- QUERY EN HQL                                                 *
        *           EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("conexion_Personas"); <-- NOMBRE            *
        *           EntityManager entityManager = fabrica.createEntityManager();                                  DE LA CONEXIÓN      *
        *                                                                                                                             *
        *           Query query = entityManager.createQuery(hql);      <-- EL RESULTADO LO DEBUELVE EN UN ARRAY                       *
        *           List<Persona> persona = query.getResultList();         DE OBJETO DE LA CLASE PERSONA                              *
        *               for (Persona p: persona) {                                                                                    *
        *                   System.out.println (p);                       <-- Y LO MOSTRAMOS                                          *
        *               }                                                                                                             *
        *               System.out.println("");                                                                                       *
        *           }                                                                                                                 *
        *                                                                                                                             *
        * 10. - RUN PROJECT                                                                                                           *
        *                                                                                                                             *
        *******************************************************************************************************************************
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
                case "9" -> {
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