package Tema_07;

import static Principal_Main.Main.*;
import static Tema_07.T_07.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_07 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_07 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************

            - JAVA ES UN LENGUAJE DE PROGRAMACI�N ORIENTADO A OBJETOS EL CUAL PUEDE SER REPRESENTADO EN UN DIAGRAMA DE OBJETOS;
              MIENTRAS QUE UNA BASE DE DATOS RELACIONAL SE REPRESENTA EN UN FORMATO TABULAR USANDO FILAS Y COLUMNAS.
                    - CUANDO SE TRATA DE GRABAR UN OBJETO EN BASES DE DATOS, EXISTEN ALGUNAS DIFERENCIAS ENTRE ESTOS DOS SISTEMAS,
                      QUE PUEDEN DAR LUGAR A PROBLEMAS: PARA SOLVENTARLO TENEMOS LA AYUDA DEL MAPEO OBJETO RELACIONAL. ORM.

           - PODEMOS DEFINIR UN ORM COMO UN FRAMEWORK, UN MARCO DE TRABAJO,
             QUE FACILITA EL ALMACENAMIENTO DE LOS OBJETOS A UNA BASE DE DATOS RELACIONAL.
                    - EN CUALQUIER BASE DE DATOS, EL NIVEL DE ELEMENTO M�S ALTO ES LA TABLA,
                      DIVIDIDA A SU VEZ EN FILAS Y COLUMNAS.
                            - UNA COLUMNA CONTIENE VALORES EN UN TIPO DE DATO DETERMINADO.
                            - UNA FILA CONTENDR� UN CONJUNTO DE INFORMACI�N DE UNA TABLA DETERMINADA.

                    - SE MAPEAR�A UN OBJETO PLANO CON SU 'EQUIVALENTE' EN UNA FILA DE UNA BD RELACIONAL.
                            - DESDE LA BD RELACIONAL SE OBTENDR�A EL OBJETO EN EL OTRO SENTIDO.

                    - FLUJO DEL MAPEO OBJETO RELACIONAL:
                            1.- PARTIMOS DE UNA APLICACI�N CON OBJETOS DESARROLLADOS EN JAVA.
                            2.- PASAMOS POR UN FRAMEWORK QUE PREPARA ESOS OBJETOS EN ENTIDADES F�CILES DE PERSISTIR.
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
                   - CONEXI�N: JAVA POSEE UNA API DE CONEXI�N A BASE DE DATOS: LOS DRIVERS JDBC.
                   - CONSULTA: JAVA FACILITA LA FORMA DE CONSULTAR LA INFORMACI�N EN BASES DE DATOS USANDO SQL.
                           - ESCRIBIR�AMOS CIERTAS CONSULTAS SQL NATIVAS,
                             Y OBTENDR�AMOS UN RESULTSET CON EL RESULTADO DE NUESTRA QUERY.
                                       
            - PROBLEMA:
                   - EL DESARROLADOR DEBE CONOCER LA BASE DE DATOS A FONDO,
                     Y SABER QU� TIPO DE RELACIONES EXISTEN ENTRE TABLAS,
                     AS� COMO EL NOMBRE EXACTO DE LAS COLUMNAS, CONSTRAINTS (CONDICIONES, REQUISITOS, RESTRICCIONES), ETC...
                                       
            - LA PERSPECTIVA SER�A OTRA SI CONSIGUIERAMOS REALIZAR LAS MISMAS OPERACIONES CON LOS DATOS DESDE JAVA:
                   - TENDR�AMOS ABSTRACCI�N, HERENCIA, COMPOSICI�N, M�TODOS, IDENTIDAD,
                     Y MUCHAS CARACTER�STICAS M�S EN LA PARTE DE LA APLICACI�N JAVA.
                           - ESTAS CARACTER�STICAS SE PUEDEN CONSEGUIR TAMBI�N POR MEDIO DE FRAMEWORKS;
                             ESE ES UNO DE LOS MOTIVOS DEL USO DE LOS    --->   ORM.
                                       
            EXISTEN DISTINTOS TIPOS DE BASES DE DATOS,
            CADA UNA CON DIFERENTES TIPOS DE FUNCIONALIDADES Y TIPOLOG�A DE DATOS DEFINIDOS.
                   - CUANDO USAMOS LA CONEXI�N JDBC DEBEMOS TENER EN CUENTA ESTE TIPO DE DIFERENCIAS.
                                       
                *********************************************************************************************
                *              VENTAJAS USO ORM               *          INCONVENIENTES USO ORM             *
                *********************************************************************************************
                *  MEJORA LA EFICIENCIA DEL DESARROLLO        *  EL MAPEO AUTOM�TICO DE LAS BD CONSUME      *
                *                                             *  MUCHOS RECURSOS DEL SISTEMA                *
                *---------------------------------------------*---------------------------------------------*
                *  DESARROLLO M�S ORIENTADO A OBJETOS         *  LA SINTAXIS DE LOS ORM A VECES PUEDE       *
                *                                             *  COMPLICARSE  SI REALIZAMOS CONSULTAS MUY   *
                *                                             *  COMPLEJAS MEDIANTE LAS QUE CRUCEMOS        *
                *                                             *  VARIAS TABLAS Y CON DIVERSAS CONDICIONES   *
                *---------------------------------------------*---------------------------------------------*
                *  MANEJABILIDAD                              *                                             *
                *---------------------------------------------*---------------------------------------------*
                *  FACILIDAD PARA INTRODUCIR NUEVAS FUNCIONES *                                             *
                *  POR EJEMPLO EL CACHEO DE INFORMACI�N       *                                             *
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
                                *           DENTRO DE LA APLICACI�N           *        EXTERNA       *
                                **********************************************************************
                                *        FASE 1        *        FASE 2        *        FASE 3        *
                                *----------------------*----------------------*----------------------*
                                *   CAPA DE SERVICIO   *      OBJECT GRID     *                      *
                                *         POJO         *      JPA LOADER      *                      *
                                *       ENTIDADES      *  ARCHIVO ASIGNACI�N  *         BDD          *
                                *         DAO          *     JPA PROVIDER     *                      *
                                *                      *        MAPPING       *                      *
                                **********************************************************************

            - FASE 1:
                   - CENTRADA EN LOS DATOS DEL OBJETO Y DE TODO EL MODELO DE OBJETOS.
                   - POJO -> PLAIN OLD JAVA OBJECT
                   - CLASES SIMPLES DE JAVA Y CLASES DE IMPLEMENTACI�N, CON SUS DTO (DIAGRAMAS DE ESTADO), ETC...
                   - CLASES E INTERFACES CON SU CORRESPONDIENTE CAPA DE NEGOCIO DE CADA APLICATIVO.
                           - LLAMADA CAPA DE SERVICIO
                           - ESTAR�N TAMBI�N LAS CLASES DAO --> CLASES DE ACCESO A DATOS. --> DATA ACCESS OBJECT.
                   - CLASES ORIENTADAS A CAPA DE DATOS: M�TODOS COMO:
                           - crearObjeto()
                           - encontrarObjeto()
                           - borrarObjeto()
                           - ETC...            

            - FASE 2:
                   - LLAMADA FASE DE PERSISTENCIA O MAPEO.
                   - PROVEEDOR JPA: PROVEEDOR DE ACCESO A DATOS DE JAVA:
                           - LIBRER�A QUE HACE POSIBLE TODA LA FUNCIONALIDAD DE JPA:  --> javax.persistence
                   - ARCHIVOS DE ASIGNACI�N: FICHERO XML DONDE SE ALMACENA LA CONFIGURACI�N DE LA ASIGNACI�N
                     DE LOS DATOS DE UNA CLASE JAVA POJO Y LOS DATOS REALES DE LA BASE DE DATOS RELACIONAL.
                           - EL MAPEO DEBE RECOGER LA ESTRUCTURA DE LA BASE DE DATOS,
                             CON LOS NOMBRES EXASTOS QUE TENGAN LAS TABLAS, Y SUS CAMPOS, EN LA BASE DE DATOS.
                   - JPA CARGADOR: MEMORIA CACH� CON LOS DATOS DE LA BASE DE DATOS PROPORCIONANDO 'UNA COPIA EN MEMORIA RAM';
                     PARA REALIZAR INTERACCIONES R�PIDAS CON LAS CLASES DE SERVICIO.
                   - REJA DE OBJETO: DONDE SE ALMACENAN TEMPORALMENTE 'LA COPIA EN MEMORIA RAM'
                     DE LOS DATOS DE MUESTRA DE BASE DE DATOS RELACIONAL.
                     LLAMADA 'OBJETO GRID' POR LO QUE TODAS LAS CONSULTAS PASAR�N POR ESTE PUNTO,
                     Y UNA VEZ REALIZADAS LAS VERIFICACIONES PASAR� A LA BASE DE DATOS PRINCIPAL.

            - FASE 3:
                   - LLAMADA FASE DE DATOS RELACIONALES.
                   - UNA VEZ PASADA LA REJA DE OBJETOS Y TODO HA IDO BIEN, SE IR� DIRECTAMENTE A BD.
                   - HASTA ENTONCES, COMO HEMOS MENCIONADO, PERMANECER� TEMPORALMENTE EN LA CACH�.  

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
                    - M�LTIPLES NIVELES DE ABSTRACCI�N: CONSULTAS TIPO ORM MEZCLADAS CON SQL, ADEM�S CONSULTAS DTO.
                    - BENEFICIOS: 
                            - AJUSTA AUTOM�TICAMENTE LAS CONSULTAS ORM:
                            - USO MUY EFICIENTE DE TECNOLOG�AS DE CACHEADO DE DIFERENTES NIVELES:
                                    -REALIZA CONSULTAS MEZCLANDO BASE DE DATOS Y CACHEADO L2, EVITA AUTOM�TICAMENTE N+1, 
                                     USA CACH� DE TIPO L2 PARA REDUCIR CARGA DE BASE DE DATOS, 
                                     CONTIENE TECNOLOG�A ELASTICSEARCH PARA CACH� L3, ETC...

            - IBATIS:
                    - NACE DE LA MANO DE APACHE SOFTWARE FOUNDATION, 
                      POSTERIORMENTE EL DESARROLLO SE CENTRALIZ� EN 'GOOGLE CODE',
                      CON EL NOMBRE DE MyBatis.
                    - SOPORTE PARA JAVA Y .NET.
                    - POSEE LA OPCI�N DE DIVIDIR LA CAPA DE PERSISTENCIA EN:
                            - CAPA DE ABSTRACCI�N.
                            - CAPA DE FRAMEWORK PERSISTENTE.
                            - CAPA DE DRIVER.
                    - UNA DE SUS VIRTUDES ES LA FACILIDAD DE INTERACTUAR CON LOS OBJETOS
                      Y LOS DATOS DE LAS BASES DE DATOS RELACIONALES.
                    - OFRECE ABSTRACCI�N A NIVEL DE LA CAPA DE PERSISTENCIA DE OBJETOS.

            - HIBERNATE:
                    - ES EL ORM M�S EXTENDIDO Y M�S USADO.
                    - DISPONIBLE PARA LENGUAJE JAVA Y TAMBI�N PARA .NET, LLAMANDOSE PARA �STE CASO NHIBERNATE.
                    - FACILITA EL MAPEO RELACIONAL DE LOS DISTINTO OBJETOS ENTRE UNA BASE DE DATOS RELACIONAL
                      Y EL MODELO DE OBJETOS DE LA APLICACI�N.
                    - LAS RELACIONES SE ESTABLECEN MEDIANTE UN FICHERO .xml O TAMBI�N POR MEDIO DE ANOTACIONES.
                    - SIMPLICIDAD: UN SOLO .xml PARA ESTABLECER RELACIONES,
                      SIMPLIFICANDO DIRIGIRNOS A �STE PARA CONSULTAR CUALQUIER RELACI�N ENTRE ENTIDADES O ATRIBUTOS.
                    - ROBUSTO: DISPONE DE MUCHAS CARACTER�STICAS ADAPTADAS AL LENGUAJE JAVA:
                      COLECCIONES, HERNCIA, ABSTRACCI�N, ORIENTACI�N A OBJETOS, ETC...
                    - EN LA CAPA DE ABSTRACCI�N OFRECE UNA PROPIA CAPA DE CONSULTAS SQL, LLAMADA HQL,
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

            - HIBERNATE USA EL PRINCIPIO DE REFLEXI�N JAVA, QUE PERMITE AL AN�LISIS Y MODIFICACI�N DE ATRIBUTOS 
              Y CARACTER�STICAS DE LAS DISTINTAS CLASES EN TIEMPO DE EJECUCI�N.

            - LAS CAPAS DE APLICACI�N E HIBERNATE EST�N UNIDAS POR LOS OBJETOS DE PERSISTENCIA.
                    - MOTIVO: EN UNA PARTE ESPEC�FICA DE LA APLICACI�N SE DA CIERTA CONVERSI�N (FICHERO DE MAPEO),
                      DONDE LA INFORMACI�N FLUYE Y ES MAPEADA DESDE DICHOS FICHEROS PERSISTENTES A LA BASE DE DATOS.

            - LA CAPA HIBERNATE ES DONDE SE REALIZA LA CONEXI�N CON EL DRIVER,
              TAMBI�N DONDE SE CARGAN TANTO LAS DISTINTAS CONFIGURACIONES HIBERNATE,
              COMO TODAS LAS ENTIDADES PREVIAMENTE DISE�ADAS.

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

            -  SessionFactory Object  --> NOS PERMITE USAR OBJETOS TIPO Session  (UNO POR CADA BDD)           INSTANCIAR LA SESI�N

                    - ES EL QUE SE PERMITIR� EL USO DE OBJETOS DE TIPO Session.
                    - ESTE OBJETO JAVA SE PUEDE INSTANCIAR DE DIFERENTES FORMAS:
                            - NORMALMENTE COGE LA CONFIGURACI�N DEL FICHERO DE CONFIGURACI�N POR DEFECTO.
                    - UTILIZAREMOS UN OBJETO SessionFactory POR CADA BASE DE DATOS QUE TENGAMOS EN LA APLICACI�N.

            -  Session Object         --> NOS PERMITE INSTANCIAR UNA CONEXI�N DIRECTA A LA BDD RELACIONAL   INSTANCIAR LA CONEXI�N

                    - UTILIZAREMOS DICHO OBJETO PARA INSTANCIAR UNA CONEXI�N DIRECTA CON NUESTRA BASE DE DATOS RELACIONAL.
                    - ES UN OBJETO NO MUY PESADO Y SU FUNCI�N PRINCIPAL ES INTERACTUAR CON LA BASE DE DATOS.
                    - ESTE TIPO DE OBJETOS NO DEBEN PERMANECER ABIERTOS MUCHO TIEMPO POR TEMAS DE SEGURIDAD.

            -  Transaction Object     --> NOS PERMITE MANEJAR TRANSACCTI�N --> ENTRE COMMIT Y COMMIT (OPCIONAL)

                    - MANEJA LAS TRANSACCIONES DIRECTAMENTE CON LAS BASES DE DATOS RELACIONALES.
                    - ES UN OBJETO OPCIONAL: SI NO SE QUIERE HACER USO DE �L, 
                      PODEMOS INDICAR MANUALMENTE AQUELLOS BLOQUES QUE QUEREMOS SEAN TRANSACCIONALES.
                            - RECORDEMOS LA DEFINICI�N DE TRANSACCI�N, ORIENTADA A BLOQUE DE OPERACI�N/ES:
                              PERSISTIR TODAS Y CADA UNA DE LAS OPERACIONES DEL BLOQUE, 
                              O POR EL CONTRARIO, REALIZAR ROLLBACK (MARCHA ATR�S) EN DICHA OPERACI�N.

            -  Query Object           --> NOS PERMITE HACER CONSULTAS SQL Y HQL                          EJECUTAR LAS INSTRUCCIONE

                    - EN HIBERNATE DISPONEMOS DE VARIAS FORMAS DE REALIZAR CONSULTAS A LA BASE DE DATOS.
                    - ESTE TIPO DE OBJETOS UTILIZAN CONSULTAS DE TIPO SQL O DE TIPO HIBERNATE QUERY (HQL).
                    - CON ESTE TIPO DE OBJETOS ENLAZAREMOS LOS DISTINTOS PAR�METROS DE NUESTRA CONSULTA, TAMBI�N
                      PODREMOS REALIZAR CIERTAS RESTRICCIONES COMO CONTROLAR EL N�MERO DE RESULTADOS, Y EJECUTAR LA CONSULTA.
                    - ES UN MODO DE REALIZAR CONSULTAS MUCHO M�S DIN�MICO QUE LAS CONSULTAS NATIVAS.

            -  Criteria Object        --> NOS PERMITE HACER CONSULTAS JAVA                                  FILTRAR USANDO OBJETOS 

                    - DESAPARECER� EL LENGUAJE NATIVO DE SQL PARA DAR PASO A LAS CONSULTAS POR MEDIO DE OBJETOS JAVA,
                      Y POR MEDIO DE LAS FUNCIONES QUE NOS OFRECE HIBERNATE, QUE M�S TARDE SER�M TRADUCIDAS A SENTENCIAS SQL.

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
        *            - JPA --> LIBRER�A DEL PROVEEDOR DE ACCESO A DATOS          javax.persistence                                    *
        *            - ARCHIVO DE ASIGNACI�N XML --> DATOS DE LA CLASE POJO Y DE LA BD RELACIONAL                                     *
        *            - JPA CARGADOR --> MEMORIA CACH� CON LOS DATOS DE LA BDD ( COPIA )                                               *
        *            - REJA DE OBJETO --> COPIA TEMPORAL DE LA BDD RELACIONAL ( OBJECT GRID )                                         *
        *                                                                                                                             *
        *      FASE 3: CAPA DE DATOS RELACIONALES.   ( YA ESTAMOS FUERA DE LA APLICACI�N )                                            *
        *            - DE LA CACH� JPA --> PASAMOS --> A LA BDD RELACIONAL EXTERNA A LA APLICACI�N.                                   *
        *                                                                                                                             *
        *******************************************************************************************************************************
        * HERRAMIENTA ORM A USAR -->  HIBERNATE                                                                                       *
        *                                                                                                                             *
        *    COMPONENTES:                                                                                                             *
        *      -  SessionFactory Object  --> NOS PERMITE USAR OBJETOS TIPO Session  (UNO POR CADA BDD)           INSTANCIAR LA SESI�N *
        *      -  Session Object         --> NOS PERMITE INSTANCIAR UNA CONEXI�N DIRECTA A LA BDD RELACIONAL   INSTANCIAR LA CONEXI�N *
        *      -  Transaction Object     --> NOS PERMITE MANEJAR TRANSACCTI�N --> ENTRE COMMIT Y COMMIT (OPCIONAL)                    *
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
        *  INSTALAR HIBERNATE:  SIMILAR A INSTALACI�N H2 TEMA 5                                                                       *
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
        *             - CON EL RAT�N SOBRE NUESTRO PROYECTO -->  BOT�N DERECHO                                                        *
        *             - NEW -> OTHER ->PERSISTENCE -> PERSISTENCE UNIT -> SEGUIR EL ASISTENTE                                         *
        *             PONER NOMBRE A LA CONEXI�N  Y SELLECCIONAR A QU� BDD TE QUIERES CONECTAR   --> BUSCAR EL CONECTOR MySQL .jar    *
        *             PONER USUARIO Y CONTRASE�A  -->  PROBAR LA CONEXI�N  --> NEXT ...                                               *
        *                                                                                                                             *
        *                                                                                                                             *
        *  8. - MODIFICAR CLASE DE LA BASE DE DATOS CON ANOTACIONES                                                                   *
        *             - @Entity                              --> ESTE CLASE SE CORRESPONDE CON ...                                    *
        *             - @Table(name = "persona")             --> ESTA TABLA EN LA BDD                                                 *
        *             - @Column(name="id_persona")           --> CON CLAVE PRIMARIA ...                                               *
        *             - @Id                                  --> Y N�MEROS ENTEROS AUTOCOMPLETABLES                                   *
        *                                                                                                                             *
        *  9. - EN EL FICHERO .java PRINCIPAL DE NUESTRO PROYECTO  --> DENTRO  DEL main  ...                                          *
        *                                                                                                                             *
        *           String hql = "SELECT p FROM Persona p";          <-- QUERY EN HQL                                                 *
        *           EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("conexion_Personas"); <-- NOMBRE            *
        *           EntityManager entityManager = fabrica.createEntityManager();                                  DE LA CONEXI�N      *
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