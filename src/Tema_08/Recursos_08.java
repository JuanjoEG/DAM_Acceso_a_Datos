package Tema_08;

import static Principal_Main.Main.*;
import static Tema_08.T_08.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_08 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_08 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        *******************************************************************************************************************************
        *  INSTALAR HIBERNATE:  SIMILAR A INSTALACIÓN H2 TEMA 5 Y ORM TEMA 7                                                          *
        *                                                                                                                             *
        *  PARTIMOS QUE TENEMOS YA UNA BDD CON UNA TABLA CREADA CON MySQL Workbench POR EJEMPLO                                       *
        *                                                                                                                             *
        *                   --  EN NETBEANS --                                                                                        *
        *  1. - FILE -> NEW PROJECT -> JAVA WITH MAVEN -> SPRING BOOT INITIALIZR PROJECT                                              *
        *  2. - (MAVEN PROJECT) (LANGUAGE JAVA) (SPRING BOOT 2.7.5) (PACKAGING JAR) -->                                               *
        *  3. - SELECCIONAR LAS DEPENDENCIES -->  --  H2 DATABASE  --  SPRING DATA JPA  --  SPRING WEB  --  --> NEXT --> FINISH       *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        *******************************************************************************************************************************
                         
            HIBERNATE, O UN ORM EN GENERAL,
            COGERÁ VALORES DE LOS ATRIBUTOS DE LAS CLASES DE JAVA Y LOS PERSISTIRÁN, LOS PASARÁ,
            A LAS TABLAS DE UNA BASE DE DATOS.
                    - USAREMOS UN DOCUMENTO DE MAPEO, FICHERO DE MAPEO DE LOS VALORES,
                      DESDE CLASES DE JAVA  -->  A LOS CAMPOS ASOCIADOS EN LA BD.
                         
            EN HIBERNATE SE LLAMARÁN CLASES PERSISTENTES:                         
                    - A LAS CLASES CUYOS OBJETOS SERÁN ALMACENADOS EN BASE DE DATOS.
                         
            HIBERNATE FUNCIONARÁ MEJOR SI ESTAS CLASES SON CLASES SIMPLES O POJO. --> PLAIN OLD JAVA OBJECT.
                SE USA ESTE NOMBRE PARA DESTACAR QUE ES UN OBJETO ORDINARIO JAVA. NO ES UN OBJETO ESPECIAL.
            
            CLASES PERSISTENTES:    SE COLOCAN EN LA MISMA CARPETA QUE EL FICHERO *.jar PRINCIPAL DE HIBERNATE.
                                    ( CLASES POJO --> CLASES SIMPLES EN JAVA PARA PERSISTIR LOS OBJETOS EN BDD )
            
            REGLAS GENERALES DE LAS CLASES PERSISTENTES: (NO SON REQUERIMIENTOS PUROS).
            
                    - NECESITAN CONSTRUCTOR POR DEFECTO (VACÍO) Y CONSTRUCTOR CON PARÁMETROS ( SIN id ).
                            - EL CONSTRUCTOR POR PARÁMETROS NO RECOGE EL ATRIBUTO id YA QUE SERÁ AUTONUMÉRICO Y AUTOINCREMENTAL.
                    - DEBEN CONTENER UN ATRIBUTO id...  -->  private int id...;
                            - EN LA BASE DE DATOS  -->  SERÁ PRIMARY KEY EN LA TABLA.
                            - EN JAVA  -->  PARA QUE HIBERNATE PUEDA IDENTIFICAR OBJETOS.
                    - TODOS LOS ATRIBUTOS PRIVADOS.
                    - NECESITAMOS LOS MÉTODOS GETTERS Y SETTERS.    GET -> OBTENER INFO.     SET -> GUARDAR INFO.
                    - LA CLASE NO PUEDE SER DE TIPO FINAL.
                    - LOS ATRIBUTOS TIENEN QUE ESTAR EN CAMELKEY.
                         
            TODOS LOS IDES CON LOS QUE TRABAJEMOS NOS PERMITIRÁN CREAR CLASES POJO DE FORMA MUY FÁCIL.
            TANTO LOS CONSTRUCTORES COMO LOS MÉTODOS GETTERS Y SETTERS SON GENERADOS POR LOS IDES DE FORMA AUTOMÁTICA.
            
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        *******************************************************************************************************************************
                         
            CREAREMOS UNA TABLA EN UNA BDD:  CON ESTRUCTURA EQUIVALENTE A LA CLASE.
        
                    - NECESITA CLAVE PRIMARIA AUTO INCREMENTAL --> LA COLUMNA NO DEBE LLAMARSE ID A SECAS.
                            (EL NOMBRE DE LA COLUMNA PRIMARY KEY Y EL NOMBRE DEL ATRIBUTO DE LA CLASE TIENEN QUE SER DIFERENTES).
                    - TENDRÁ COLUMNAS QUE SE CORRESPONDAN CON LOS ATRIBUTOS DE LA CLASE.
                            (LOS NOMBRES DEL RESTO DE LAS COLUMNA Y LOS NOMBRES DE LOS ATRIBUTOS DE LA CLASE SI PUEDEN SER IGUALES)

                                Sentencia SQL de creacion de la tabla en la base de datos:
        
                                    create table ejemploormhibernate.CLIENTE (
                                        num_cliente INT NOT NULL auto_increment,
                                        nombre_cliente VARCHAR(20) default NULL,
                                        apellido_cliente  VARCHAR(20) default NULL,
                                        email VARCHAR(20)  default NULL,
                                        PRIMARY KEY (num_cliente));
        
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        *******************************************************************************************************************************
                         
            NORMALMENTE, LAS RELACIONES DE MAPEO OBJETO-RELACIONAL ESTÁN DEFINIDAS EN UN DOCUMENTO CON EXTENSIÓN XML.
                         
            FICHERO DE MAPEO: --> NOMBRE: <nombreClasePojo>.hbm.xml       RUTA: src/main/resources/default packade/ 
          
                    - VA A CONTENER LA INFORMACIÓN QUE NECESITA HIBERNATE PARA PODER GUARDAR
                            CADA OBJETO DE NUESTRA CLASE JAVA, EN LAS TABLAS DE LA BDD.
                            LAS ESTRUCTURAS TIENEN QUE COINCIDIR, TIENE QUE SER COMPATIBLES.
                    - EL MAPEO TIENE QUE COINCIDIR CON LA ESTRUCTURA DE LA TABLA EN LA BASE DE DATOS.
                            --> CREADA EN DDL (LENGUAJE DE DEFINICIÓN DE DATOS).
                    - EL FICHERO XML DE MAPEO SE PUEDE ESCRIBIR A MANO,
                      O USANDO HERRAMIENTAS QUE LA GENERAN A PARTIR DE LA DEFINICIÓN DE LA CLASE.
                      (XDOCLET, MIDDLEGEN O ANDROMDA).
                        
            EJEMPLO DE FICHERO DE MAPEO: Persona.hbm.xml <--> MAPEA CLASE 'Persona' <--> A LA TABLA 'CLIENTE' DE LA BD.
                    CADA ATRIBUTO DE LA CLASE JAVA SE CORRESPONDE CON UNA COLUMNA DE LA TABLA EN LA BASE DE DATOS.
                    *                                                                                           *
                    *   <?xml version="1.0" encoding="ISO-8859-1"?>                                             *
                    *                                                                                           *
                    *   <!DOCTYPE hibernate-mapping PUBLIC                                                      *
                    *   "-//Hibernate/Hibernate Mapping DTD//EN"                                                *
                    *   "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">                               *
                    *                                                                                           *
                    *   <hibernate-mapping>                                                                     *
                    *       <class name = "com.example.demo.Persona" table = "CLIENTE">                         *
                    *                                                                                           *
                    *           <meta attribute = "class-description">                                          *
                    *              Esta clase contiene el detalle del cliente.                                  *
                    *           </meta>                                                                         *
                    *                                                                                           *
                    *           <id name = "idPersona" type = "int" column = "id_cliente">                      *
                    *              <generator class="native"/>                                                  *
                    *           </id>                                                                           *
                    *                                                                                           *
                    *           <property name = "nombre" column = "nombre_cliente" type = "string"/>           *
                    *           <property name = "apellido" column = "apellido_cliente" type = "string"/>       *
                    *           <property name = "email" column = "email_cliente" type = "string"/>             *
                    *           <property name = "telefono" column = "telefono_cliente" type = "string"/>       *
                    *                                                                                           *
                    *       </class>                                                                            *
                    *   </hibernate-mapping>                                                                    *
                    *                                                                                           *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        *******************************************************************************************************************************
                         
            <hibernate-mapping>
                    ESTE ES EL ELEMENTO PRINCIPAL DEL DOCUMENTO XML, EN SU INTERIOR ALMACENARÁ TODAS LAS CLASES DEFINIDAS.
                         
            <class>
                    ESTOS ELEMENTOS DEFINEN MAPEOS ESPECIALES DESDE NUESTRA CLASE JAVA A LAS TABLAS DE LA BASE DE DATOS.
                        - name        --> EL NOMBRE DE LA CLASE JAVA ES ESPECIFICADO USANDO ESTE ATRIBUTO.
                        - table       --> LA TABLA ASOCIADA EN LA BASE DE DATOS ES VINCULADA CON ESTE ATRIBUTO.
                         
            <meta>
                    ESTOS ELEMENTOS SON OPCIONALES, Y SE PUEDEN USAR PARA DEFINIR LA DESCRIPCIÓN DE UNA CLASE.
                         
            <id>
                    EL ELEMENTO <id> MAPEA EL ATRIBUTO ID ÚNICO EN LA PARTE DE LA CLASE JAVA,
                    Y LO TRANSFORMA EN PRIMARY KEY EN LA TABLA DE LA BASE DE DATOS.
                        - name        --> HACE REFERENCIA AL NOMBRE DEL ATRIBUTO IDENTIFICADOR DE LA CLASE JAVA.
                        - columm      --> SE REFIERE A LA COLUMNA DE LA TABLA EN LA BASE DE DATOS.
                        - type        --> PROPORCIONA A HIBERNATE LA TIPOLOGÍA DEL OBJETO Y SERÁ CONVERTIDO DE TIPOLOGÍA JAVA A SQL.
                        - <generator> --> JUNTO A <id> GENERARÁ CLAVES PRIMARIAS AUTOMÁTICAMENTE.
                            - <generator class>  --> SE ESTABLECE CON EL VALOR 'native' PARA PERMITIR A HIBERMATE CREAR LA 
                                                     PRIMARY KEY CON DIFERENTES ALGORITMOS. (IDENTITY, HILO O SEQUENCE).
                         
            <property>
                    ESTE ELENTO MAPEA LOS ATRIBUTOS O PROPIEDADES DE JAVA EN COLUMNAS DE LA TABLA ASOCIADA EN LA BASE DE DATOS.
                        - name        --> HACE REFERENCIA AL NOMBRE DEL ATRIBUTO DE LA CLASE JAVA.
                        - columm      --> SE REFIERE A LA COLUMNA DE LA TABLA EN LA BASE DE DATOS.
                        - type        --> PROPORCIONA A HIBERNATE LA TIPOLOGÍA DEL OBJETO Y SERÁ CONVERTIDO DE TIPOLOGÍA JAVA A SQL.
                         
            EN EL CASO DE HIBERNATE: EL FICHERO SE LLAMARÁ CON EL NOMBRE DE LA CLASE Y LA EXTENSIÓN:  -->  .hbm.xml
        
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        *******************************************************************************************************************************
                         
            EN LUGAR DE USAR UN FICHERO DE MAPEO XML,
            OTRA POSIBILIDAD PARA ESTABLECER LA RELACIÓN ENTRE LA CLASE POJO Y LA BASE DE DATOS,
            ES INCLUIR EN EL PROPIO CÓDIGO DE LA CLASE,    --->    ANOTACIONES.
            ESAS ANOTACIONES HACEN REFERENCIA AL ALMACENAMIENTO DE DICHA CLASE 
            Y CADA UNO DE SUS ATRIBUTOS EN LA BASE DE DATOS.
                         
            USANDO ANOTACIONES EN LA CLASE POJO: --> ALTERNATIVA AL FICHERO DE MAPEO.
                (YA VISTAS EN EL TEMA DE SPRING BOOT).
        
                    - @Entity                              --> ESTA CLASE ES UNA ENTIDAD Y SE CORRESPONDE CON ...
                    - @Table(name = "......")              --> ESTE NOMBRE DE ESTA TABLA EN LA BDD.

                    - @Id @GeneratedValue                  --> CON CLAVE PRIMARIA Y NÚMEROS ENTEROS AUTOCOMPLETABLES.
                    - @Column(name=".......")              --> Y SE CORRESPONDE CON ESTA COLUMNA.
        
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        *******************************************************************************************************************************
                         
            SESIONES Y OBJETOS HIBERNATE I. ESTADOS.
                         
                LOS OBJETOS PERSISTENTES SON ALMACENADOS Y DEVUELTOS A TRAVÉS DEL OBJETO DE SESIÓN: --> Session object.
        
                UN OBJETO DE SESIÓN ES USADO PARA ESTABLECER UNA CONEXIÓN FÍSICA CON UNA BASE DE DATOS.
                    ESTE OBJETO DEBE SER INSTANCIADO CADA VEZ QUE SE NECESITE UNA INTERACCIÓN CON LA BASE DE DATOS.
                    NO DEBE MANTENERSE ABIERTO DURANTE MUCHO TIEMPO, POR SEGURIDAD.
                        - SE CREA --> SE INTERACTUA CON LA BDD --> SE DESTRUYE --> SE CIERRA LA CONEXIÓN.
                         
                LA FUNCIÓN PRINCIPAL DE ESTOS OBJETOS ES:
                        OFRECER, CREAR, LEER Y BORRAR OPERACIONES PARA LAS INSTANCIAS DE LASS CLASES MAPEADAS.
                    - SU FUNCIÓN --> OFRECER - CREAR - LEER - BORRAR --> OPERACIONES PARA LOS OBJETOS DE LA CLASE JAVA.
                    - ESAS INSTANCIAS PUEDEN ESTAR EN UNO DE LOS ESTADOS:
                         
                            - TRANSIENT: TRANSITORIO:
                                NUEVA INSTANCIA DE UNA CLASE PERSISTENTE.
                                NO ESTÁ AÚN ASOCIADA A UN OBJETO DE SESIÓN.
                                SOLO TENEMOS EL OBJETO EN JAVA.
                                NO TIENE AUN REPRESENTACIÓN EN LA BDD.
                                NO TIENE IDENTIFICADOR SEGÚN HIBERNATE.
                         
                            - PERSISTENT: PERSISTENTE:
                                UNA INSTANCIA TRANSIENT SE PUEDE HACER PERSISTENTE ASOCIÁNDOLA CON UNA SESIÓN.
                                ES UNA INSTANCIA QUE YA HEMOS 'COPIADO' A LA BASE DE DATOS.
                                AL ASOCIARSE CON UNA SESIÓN, YA TIENE REPRESENTACIÓN EN LA BDD.
                                TIENE ASOCIADO UN OBJETO SESIÓN.
                                TIENE UN IDENTIFICADOR.
                         
                            - DETACHED: DESASIGNADO:
                                UNA VEZ SE CIERRA LA SESIÓN DE HIBERNATE,
                                LA INSTANCIA PERSISTENTE SE CONVERTIRÁ EN UNA INSTANCIA SEPARADA.
        
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
                         
            LOS PRINCIPALES MÉTODOS DE LA INTERFAZ SESSION:
         
                - beginTransaction():
                        PERMITE COMENZAR UNA UNIDAD DE TRABAJO.
                        DEVUELVE EL OBJETO ASOCIADO DE LA TRANSACCIÓN.
                         
                - cancelQuery():
                        CANCELA LA EJECUCIÓN DE LA CONSULTA ACTUAL.
                         
                - clear():
                        ELIMINA COMPLETAMENTE LA SESIÓN.
                         
                - close():
                        FINALIZA LA SESIÓN.
                        LIBERA Y LIMPIA LA CONEXIÓN JDBC.
                        DEVUELVE UN OBJETO DE TIPO --> Connection.
                         
                - createCriteria(Class clasePersistente):
                        CREA UNA INSTANCIA NUEVA DE TIPO --> Criteria.
                        ES PARA LA CLASE PERSISTENTE PROPORCIONADA COMO PARÁMETRO.
                        DEVUELVE EL OBJETO DE TIPO --> Criteria.
                         
                - createCriteria(String entityName):
                        CREA UNA INSTANCIA NUEVA DE TIPO --> Criteria.
                        ES PARA LA ENTIDAD PROPORCIONADA COMO PARÁMETRO.
                        DEVUELVE EL OBJETO DE TIPO --> Criteria.
                         
                - getIdentifier(Object object):
                        DEVUELVE UN OBJETO DE TIPO --> Serializable.
                        ES EL IDENTIFICADOR DE LA ENTIDAD PROPORCIONADA COMO PARÁMETRO.
                        ESTÁ ASOCIADO A ESTA SESIÓN.
                         
                - createFilter(Object collection, String queryString):
                        CREA UNA NUEVA INSTANCIA DE CONSULTA.
                        EN FUNCIÓN A LA COLECCIÓN Y LA CONSULTA PASADAS COMO PARÁMETROS.
                        DEVUELVE UN OBJETO DE TIPO --> Query.
                         
                - createQuery(String HQLqueryString):
                        CREA UNA NUEVA INSTANCIA DE CONSULTA.
                        EN FUNCIÓN DE LA SENTENCIA HQL PASADA COMO PARÁMETRO.
                        DEVUELVE UN OBJETO DE TIPO --> SQLQuery.
                         
                - delete(Object object):
                        BORRA UNA INSTANCIA PERSISTENTE DEL ALMACÉN DE DATOS.
                         
                - getSessionFactory():
                        DEVUELVE UN OBJETO DE TIPO --> Session Factory.
                        ES EL OBJETO QUE CREÓ LA SESIÓN ACTUAL.
                         
                - refresh(Object object):
                        VUELVE A LEER EL ESTADO DE LA INSTANCIA DADA COMO OBJETO.
                        EL OBJETO PROVIENE DE LA BASE DE DATOS.
                         
                - isConnected():
                        COMPRUEBA SI LA SISIÓN ESTÁ CONECTADA ACTUALMENTE.
                         
                - isOpen():
                        COMPRUEBA SI LA SESIÓN AÚN ESTÁ ABIERTA.
         
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        *******************************************************************************************************************************
        
            COMANDOS QUE EJECUTAREMOS DESDE NUESTRO OBJETO SESSION:
        
                - CARGA DE DATOS:
                        OBTENCIÓN DE DATOS DE NUESTRA BASE DE DATOS:
                         
                                Session.get():
                                        DEVUELVE UN OBJETO PERSISTENTE SEGÚN LOS PARÁMETROS DE OBJETO DE ENTIDAD E IDENTIFICADOR.
                                        SI NO EXISTE OBJETO EN BD, VEVOLVERÁ --> null.
                         
                                Session.load():
                                        DEVUELVE UN OBJETO PERSISTENTE SEGÚN LOS PARÁMETROS DE OBJETO DE ENTIDAD E IDENTIFICADOR.
                                        EN CASO DE NO ENCONTRAR LA ENTIDAD, VEVOLVERÁ --> ObjectNotFoundException.
        
                - ALMACENAMIENTO DE OBJETOS:
                        PARA GUARDAR LA INFORMACIÓN EN LA BASE DE DATOS DESDE HIBERNATE USAREMOS:
                         
                                Session.persist():
                                        EJECUTA INTERNAMENTE EL COMANDO --> insert --> DE SQL.
                                        ALMACENANDO FILAS EN LA BASE DE DATOS.
                                        ESTE MÉTODO ES DE TIPO --> void().
                                        NO DEVUELVE NADA.
                         
                                Session.save():
                                        EJECUTA INTERNAMENTE EL COMANDO --> insert --> DE SQL.
                                        ALMACENANDO FILAS EN LA BASE DE DATOS.
                                        DEVUELVE UN OBJETO DE TIPO --> Serializable.
        
                - MODIFICACIÓN DE OBJETOS:
                        PODREMOS ACTUALIZAR LOS DIFERENTES OBJETOS DE LA BASE DE DATOS:
                         
                                Session.update():
                                        REALIZA A BASE DE DATOS UN --> update.
                                        NECESITA QUE HAYA EJECUTÁNDOSE OTRA INSTANCIA DE --> session.
                                        SI NO LA ENCUENTRA LANZARÁ UNA EXCEPCIÓN.
                         
                                Session.merge():
                                        REALIZA A BASE DE DATOS UN --> update.
                                        NO NECESITA QUE HAYA EJECUTÁNDOSE OTRA INSTANCIA DE --> session.
        
                - OTROS MÉTODOS:
                         
                                Session.delete():
                                        PASAREMOS COMO PARÁMETRO LA ENTIDAD PERSISTENTE.
                                        SE REALIZARÁ EL BORRADO EN LA BASE DE DATOS.
                         
                                Session.saveOrUpdate():
                                        PERMITE ACTUALIZAR LA ENTIDAD EN LA BASE DE DATOS.
                                        SI NO EXISTE LA CREA --> CREA LA FILA EJECUTANDO UN --> insert.
        
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        *******************************************************************************************************************************
        
            EL LENGUAJE HIBERNATE QUERY --> HQL:
            
            ES UN LENGUAJE ORIENTADO A OBJETOS MUY PARECIDO A SQL, PERO EN LUGAR DE OPERAR CON TABLAS Y COLUMNAS,
            HQL TRABAJA CON LOS OBJETOS PERSISTENTES Y SUS PROPIEDADES.
                         
            EN VEZ DE USAR LOS NOMBRES DE LAS COLUMNAS Y DE LAS TABLAS USA SUS EQUIVALENTES,
            LOS NOMBRES DE LOS ATRIBUTOS Y DE LOS OBJETOS EN JAVA.
                         
                    LAS CONSULTAS DE HQL SON TRADUCIDAS POR HIBERNATE EN CONSULTAS CORRIENTES DE SQL,
                    QUE MÁS TARDE SON EJECUTADAS EN LA BASE DE DATOS.
                         
            EN HIBERNATE PODEMOS USAR SENTENCIAS SQL, PERO SE RECOMIENDA USAR HQL
            PARA EVITAR PROBLEMAS DE PORTABILIDAD DE LA BASE DE DATOS
            Y APROVECHAR TAMBIÉN LAS ESTRATEGIAS DE CACHÉ IMPLEMENTADAS EN HIBERNATE.
                         
                    PODEMOS EMPLEAR SENTENCIAS DE SQL NATIVAS
                    SI QUEREMOS USAR FUNCIONALIDADES ESPECÍFICAS DE LA BASE DE DATOS
                    QUE TENEMOS CONECTADA A NUESTRA APLICACIÓN.
                    COMO POR EJEMPLO, EN LOS PROCEDIMIENTOS ALMACENADOS INTERNAMENTE EN LA BASE DE DATOS,
                    EN ESE CASO NO USAREMOS HQL, USAREMOS SQL.
                    PARA ESOS PROCEDIMIENTOS DE EJECUCIÓN DE SENTENCIAS NATIVAS SQL USAREMOS --> createSQLQuery().
                    RECIBE COMO PARÁMETRO UN String CON LA CONSULTA NATIVA SQL.
                    DEVUELVE UN OBJETO DE TIPO --> SQLQuery.
                    ESE OBJETO SE PUEDE ASOCIAR A UNA ENTIDAD EXISTENTE DE HIBERNATE.

        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        *******************************************************************************************************************************
                         
            EJEMPLO DE HQL PARA ACTUALIZAR LA CLASE POJO Customer USANDO EL MÉTODO createQuery SOBRE UN OBJETO DE TIPO Session
            OBTENIDO A TRAVÉS DE sessionFactory.openSession().
            OBSERVAR QUE NO HACE FALTA LA TABLA CUSTOMER.
            LOS PARÁMETROS SE PASAN AL createQuery USANDO EL MÉTODO setParameter.
            SE UTILIZA EL MÉTODO commit PARA CONFIRMAR LA TRANSACCIÓN.
            ESTE EJEMPLO ACTUALIZA UN CAMPO EN FUNCIÓN DE OTROS DOS.
            ACTUALIZA LA TABLA 'Customer' CAMBIANDO LA COLUMNA 'CUSTOMERNUMBER'.
                         
            **************************************************************************************************
            *   CUANDO EN JAVA TENEMOS UNA LA CLASE 'Customer' CON UN OBJETO QUE TIENE...                    *
            **************************************************************************************************
            *           UN   ATRIBUTO   'id'               DE ESE OBJETO CON UN VALOR IGUAL A      '105'     *
            *        Y  UN   ATRIBUTO   'firstName'        DE ESE OBJETO CON UN VALOR IGUAL A      'Pepe'    *
            *   ACTUALIZO EL ATRIBUTO   'customerNuember'  DE ESE MISMO OBJETO AL VALOR            '25'      *
            **************************************************************************************************

            **************************************************************************************************
            *   CUANDO EN LA BASE DE DATOS TENEMOS UNA TABLA 'CUSTOMER' CON UNA FILA QUE TIENE...            *
            **************************************************************************************************
            *           UNA  COLUMNA    'ID'               CON ESA FILA CON UN VALOR IGUAL A        '105'    *
            *        Y  UNA  COLUMNA    'FIRSTNAME'        CON ESA FILA CON UN VALOR IGUAL A        'Pepe'   *
            *   ACTUALIZO LA COLUMNA    'CUSTOMERNUMBER'   DE ESA MISMA FILA AL VALOR               '25'     *
            **************************************************************************************************
                         
            Session session = sessionFactory.openSession();            <-------- CREAR UN OBJETO session --> ES LA MANERA DE INICIAR SESIÓN EN LA BD.
            Transaction transaction = session.beginTransaction();      <-------- CREAR UN OBJETO transaction --> EMPEZAMOS LA TRANSACCIÓN EN ESTE PUNTO.
            Query q = session.createQuery(                             <-------- CREAMOS UNA VARIABLE q --> QUE ES LA CONSULTA HQL PASANDOLA POR UN String.
                         
                "update Customer set CUSTOMERNUMBER=:customerNuember where ID=:id and FIRSTNAME=:firstName");
                         
            q.setParameter("customerNuember",25);                      <--|
            q.setParameter("id",105);                                  <--|<---- ESTABLECEMOS LOS VALORES DE LOS PARÁMETROS DE LA CONSULTA HQL.
            q.setParameter("firstName","Pepe");                        <--|      TENEMOS QUE NOMBRARLOS RESPETANDO EL ORDEN DE LA CONSULTA HQL.

            int status = q.executeUpdate();                            <-------- NOS DEVUELVE EL NÚMERO DE TABLAS AFECTADAS, EN NUESTRO CASO 1.
            transaction.commit();                                      <-------- FINALIZAMOS LA TRANSACCIÓN HACIENDO UN commit.
            if (status > 0) {
                System.out.println("Update realizado");
            } else {
                System.out.println("Update no realizado");
            }
                               
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
        *******************************************************************************************************************************
                         
            UNA TRANSACCIÓN REPRESENTA UNA UNIDAD DE TRABAJO.
                - SI UNO DE LOS PASOS FALLA, LA TRANSACCIÓN COMPLETA FALLARÁ. --> RELACIONADO CON EL CONCEPTO DE ATOMICIDAD.
                - UNA TRANSACCIÓN SE DEFINE POR LAS CARACTERÍSTICAS ACID. --> ATOMICIDAD, CONSISTENCIA, AISLAMIENTO Y DURABILIDAD.
                         
            EN HIBERNATE, LA INTERFAZ 'Transaction' DEFINIRÁ LA UNIDAD DE TRABAJO:
                - ALGUNOS MÉTODOS DE LA INTERFAZ 'Transaction' SON:
                         
                    Void begin:
                            EMPIEZA UNA TRANSACCIÓN NUEVA.
                         
                    Void commit():
                            FINALIZA LA UNIDAD DE TRABAJO A MENOS QUE ESTEMOS EN EL MODO 'FlushMode.NEVER'.
                         
                    Void rollback():
                            FUERZA A CANCELAR TOTALMENTE LA TRANSACCIÓN.
                         
                    Void setTimeout(int segundos):
                            ESTABLECE UN 'time out' DETERMINADO POR PARÁMETRO EN SEGUNDOS.
                            LE DA UN TIEMPO A LA BD PARA HACER LAS OPERACIONE.
                         
                    Boolean isAlive():
                            COMPRUEBA SI LA TRANSACCIÓN ESTÁ AÚN ACTIVA.
                         
                    Void registerSynchronization(Synchronization s):
                            REGISTRA LA RESPUESTA SINCRONIZADA DE UN USUARIO PARA ESA TRANSACCIÓN.
                         
                    Boolean wasCommited():
                            COMPRUEBA SI SE HA CERRADO LA TRANSACCIÓN SATISFACTORIAMENTE.
                         
                    Boolean wasRolledBack():
                            COMPRUEBA SI LA TRANSACCIÓN HA SIDO CANCELADA SATISFACTORIAMENTE.
                         
        *******************************************************************************************************************************
        *  GESTIÓN DE TRANSACCIONES CON HIBERNATE               *   ACID         ATOMICIDAD   -  ATOMICITY                            *
        *                                                       *                CONSISTENCIA -  CONSISTENCY                          *
        *       SessionFactory factory;                         *                AISLAMIENTO  -  ISOLATION                            *
        *       Session session = sessionFactory.openSession(); *                DURABILIDAD  -  DURABILLITY                          *
        *       Transaction transaction = null;                 *                                                                     *
        *                                                       *     ALGUNOS MÉTODOS DE LA INTERFAZ Transaction:                     *
        *       try {                                           *                                                                     *
        *           transaction = session.beginTransaction();   *                                                                     *
        * ------>   AQUÍ REALIZAMOS LAS OPERACIONES   <------   *      - Void begin                                                   *
        *           transaction.commit();                       *      - Void commit()                                                *
        *       } catch (HibernateException e) {                *      - Void rollback()                                              *
        *           if (transaction != null)                    *      - Void setTimeout(int segundos)                                *
        *               transaction.rollback();                 *      - Boolean isAlive()                                            *
        *           e.printStackTrace();                        *      - Void registerSynchronization(Synchronization s)              *
        *       } finally {                                     *      - Boolean wasCommited()                                        *
        *           session.close();                            *      - Boolean wasRolledBack()                                      *
        *       }                                               *                                                                     *
        *                                                       *                                                                     *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
        *******************************************************************************************************************************
          
            PODEMOS ESTUDIAR AL DETALLE EL EJEMPLO FUNCIONAL --> 'Hibernate_ORM'
            QUE DEBE ESTAR ALOJADO ENTRE LOS PROYECTOS ADJUNTOS.
                         
            AL EJECUTAR EL FICHERO --> 'HibernateOrmApplication.java' NOS LANZA ESTOS RESULTADOS...
                         
            1-. MUESTRA LOS DATOS INICIALES DE LA BASE DE DATOS USANDO ENTITYMANAGER.
            2.- REALIZA LAS CONSULTAS: HQL 01 , HQL 02 Y HQL 03.
            3.- MUESTRA LOS RESULTADOS UNANDO EL MÉTODO   'listaPersonas'.
            4.- CREA UN NUEVO REGISTRO USANDO EL MÉTODO   'nuevaPersona'.
            5.- MUESTRA LOS RESULTADOS UNANDO EL MÉTODO   'listaPersonas'.
            6.- MODIFICA ESE REGISTRO USANDO EL MÉTODO    'actualizaPersona'.
            7.- BORRA ESE REGISTRO USANDO EL MÉTODO       'borraPersona'.
            8.- MUESTRA LOS RESULTADOS UNANDO EL MÉTODO   'listaPersonas'.
                         
                * * * * *   INICIO DE LA TABLA INICIAL  * * * * *

                TABLA PERSONA:
                 Persona ID:  1
                 Nombre    :  Elon
                 Apellido  :  Musk                              LA CONSULTA HQL 02 REALIZA UN UPDATE
                 Email     :  elonmusk@tesla.com  <------------ CAMBIA EL email --> elonmusk@twitter.com
                 Telefono  :  954321789                         LA CONSULTA HQL 03 REALIZA OTRO UPDATE
                                                         *      CAMBIA EL email --> elonmusk@tesla.com
                TABLA PERSONA:                             *
                 Persona ID:  2                            *
                 Nombre    :  Bill                         *
                 Apellido  :  Gates                        *
                 Email     :  bill.gates@microsoft.com     *
                 Telefono  :  958369852                    *
                                                           *
                TABLA PERSONA:                             *
                 Persona ID:  3                            *
                 Nombre    :  Tim                          *     LA CONSULTA HQL 01
                 Apellido  :  Cook                         *     MUESTRA ESTOS TRES OBJETOS
                 Email     :  tim.cook@apple.com           *
                 Telefono  :  965854632                    *     consulta.setFirstResult(1);
                                                           *     consulta.setMaxResults(3);
                TABLA PERSONA:                             *
                 Persona ID:  4                            *
                 Nombre    :  Oscar                        *
                 Apellido  :  Vinan                        *
                 Email     :  vermudez@medac.es            *
                 Telefono  :  963963963                    *
                                                         *
                TABLA PERSONA:
                 Persona ID:  5
                 Nombre    :  Bonifacio Jesus
                 Apellido  :  Macias
                 Email     :  patino@medac.es
                 Telefono  :  957854852

                TABLA PERSONA:
                 Persona ID:  6
                 Nombre    :  Amancio
                 Apellido  :  Ortega
                 Email     :  aortega@zara.es
                 Telefono  :  965874321

                * * * * *   FINAL DE LA TABLA INICIAL  * * * * *

            4.- CREACION NUEVO REGISTRO

                TABLA PERSONA:
                 Persona ID:  29
                 Nombre    :  Irene
                 Apellido  :  Montero
                 Email     :  motero@iglesias.com  <------------  6.- ACTUALIZAR EMAIL REGISTRO --> motero@iglesias.es
                 Telefono  :  985698510

            7.- BORRAR REGISTRO Irene

        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_14 + """
        *******************************************************************************************************************************
            package com.example.demo;

            import java.util.List;
            import java.util.Iterator;
            import javax.persistence.Query;

            import org.hibernate.HibernateException;
            import org.hibernate.Session;
            import org.hibernate.Transaction;
            import org.hibernate.SessionFactory;
            import org.hibernate.cfg.Configuration;

            /**
             *
             * @author Juan José Estévez González
             */
            public class ServicioPersona {

                private static SessionFactory factory;

                public static List consultaHQL_01(){

                    String hql = "FROM Persona";
                    Session session = factory.openSession();
                    Transaction transaction = null;
                    List results = null;

                    try {
                        transaction = session.beginTransaction();
                        Query consulta = session.createQuery(hql);
                        System.out.println("\n* * * * * * * * * --->   EJECUTANDO consulta.setFirstResult(1)   <--- * * * * * * * * *\n");
                        consulta.setFirstResult(1);
                        System.out.println("\n* * * * * * * * * --->   EJECUTANDO consulta.setMaxResults(3)   <--- * * * * * * * * *\n");
                        consulta.setMaxResults(3);
                        results = consulta.getResultList();
                        transaction.commit();
                        return results;
                    } catch (HibernateException e) {
                        if (transaction != null)
                            transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }      
                    return results;
                }

                public static void consultaHQL_02(){

                    String hql = "update Persona set EMAIL=:email where NOMBRE=:nombre and APELLIDO=:apellido";
                    Session session = factory.openSession();
                    Transaction transaction = null;

                    try {
                        transaction = session.beginTransaction();
                        Query consulta = session.createQuery(hql);

                        consulta.setParameter("email", "elonmusk@twitter.com");
                        consulta.setParameter("nombre", "Elon");
                        consulta.setParameter("apellido", "Musk");

                        int status = consulta.executeUpdate();
                        transaction.commit();
                        if (status > 0) {
                            System.out.println("\n* * * * * * * * * --->   UPDATE REALIZADO email elonmusk@twitter.com   <--- * * * * * * * * *\n");
                        } else {
                            System.out.println("\n* * * * * * * * * --->   UPDATE NO REALIZADO email elonmusk@twitter.com   <--- * * * * * * * * *\n");
                        }

                    } catch (HibernateException e) {
                        if (transaction != null)
                            transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                }

                public static void consultaHQL_03(){

                    String hql = "update Persona set EMAIL=:email where NOMBRE=:nombre and APELLIDO=:apellido";
                    Session session = factory.openSession();
                    Transaction transaction = null;

                    try {
                        transaction = session.beginTransaction();
                        Query consulta = session.createQuery(hql);

                        consulta.setParameter("email", "elonmusk@tesla.com");
                        consulta.setParameter("nombre", "Elon");
                        consulta.setParameter("apellido", "Musk");

                        int status = consulta.executeUpdate();
                        transaction.commit();
                        if (status > 0) {
                            System.out.println("\n* * * * * * * * * --->   UPDATE REALIZADO email elonmusk@tesla.com   <--- * * * * * * * * *\n");
                        } else {
                            System.out.println("\n* * * * * * * * * --->   UPDATE NO REALIZADO email elonmusk@tesla.com   <--- * * * * * * * * *\n");
                        }

                    } catch (HibernateException e) {
                        if (transaction != null)
                            transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                }

                public ServicioPersona() {
                    try {
                        // De esta forma, Java busca el fichero de configuracion del mapeo:
                        factory = new Configuration().configure().buildSessionFactory();
                        // De esta forma, Java busca las anotaciones en la declaracion de la clase:
                        //factory = new AnnotationConfiguration().configure().addAnnotatedClass(Cliente.class).buildSessionFactory();
                    } catch (Throwable ex) {
                        System.err.println("Fallo al crear el objeto sessionFactory." + ex);
                        throw new ExceptionInInitializerError(ex);
                    }
                }

                public Integer nuevaPersona(String nombre, String apellido, String email, String telefono) {
                    Session session = factory.openSession();
                    Transaction transaction = null;
                    Integer idPersona = null;

                    try {
                        transaction = session.beginTransaction();
                        Persona persona = new Persona(nombre, apellido, email, telefono);
                        idPersona = (Integer) session.save(persona);
                        transaction.commit();
                    } catch (HibernateException e) {
                        if (transaction != null)
                            transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                    return idPersona;
                }

                public List listaPersonas() {
                    Session session = factory.openSession();
                    Transaction transaction = null;
                    List personas = null;
                    try {
                        transaction = session.beginTransaction();
                        personas = session.createQuery("FROM Persona").list();
                        transaction.commit();
                        return personas;
                    } catch (HibernateException e) {
                        if (transaction != null)
                            transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                    return personas;
                }    

                public void actualizaPersona(Integer idPersona, String email) {
                    Session session = factory.openSession();
                    Transaction transaction = null;

                    try {
                        transaction = session.beginTransaction();
                        Persona persona = (Persona) session.get(Persona.class, idPersona);
                        persona.setEmail(email);
                        session.update(persona);
                        transaction.commit();
                    } catch (HibernateException e) {
                        if (transaction != null)
                            transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                }

                public void borraPersona(Integer idPersona) {
                    Session session = factory.openSession();
                    Transaction transaction = null;

                    try {
                        transaction = session.beginTransaction();
                        Persona persona = (Persona) session.get(Persona.class, idPersona);
                        session.delete(persona);
                        transaction.commit();
                    } catch (HibernateException e) {
                        if (transaction != null)
                            transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                }

                public static void imprimeListaPersonas(List personas) {
                    if(!personas.iterator().hasNext()) {
                        System.out.println("La lista esta vacia!");
                    }
                    for (Iterator iterator = personas.iterator(); iterator.hasNext();) {
                        Persona persona = (Persona) iterator.next();            

                        System.out.println("");
                        System.out.println("TABLA PERSONA:");
                        System.out.println(" Persona ID:  " + persona.getIdPersona());
                        System.out.println(" Nombre    :  " + persona.getNombre());
                        System.out.println(" Apellido  :  " + persona.getApellido());
                        System.out.println(" Email     :  " + persona.getEmail());
                        System.out.println(" Telefono  :  " + persona.getTelefono());            

                    }
                }    
            }
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_15 + """
        *******************************************************************************************************************************
            package com.example.demo;

            import static com.example.demo.ServicioPersona.*;

            import org.springframework.boot.autoconfigure.SpringBootApplication;
            import java.util.List;
            import javax.persistence.EntityManager;
            import javax.persistence.EntityManagerFactory;
            import javax.persistence.Persistence;
            import javax.persistence.Query;
            import org.hibernate.Session;
            import org.hibernate.SessionFactory;
            import org.hibernate.Transaction;

            @SpringBootApplication
            public class HibernateOrmApplication {

                private static SessionFactory sessionFactory;

                public static void main(String[] args) {

                    ServicioPersona servicioPersona = new ServicioPersona();
                    String hql;
                        //SpringApplication.run(HibernateOrmApplication.class, args);

                    // USANDO ENTITYMANAGER:        
                        hql = "SELECT p FROM Persona p";
                        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("conexion_Personas");
                        EntityManager entityManager = fabrica.createEntityManager();

                        Query query = entityManager.createQuery(hql);
                        List<Persona> persona = query.getResultList();

                            System.out.println("\n* * * * *   INICIO DE LA TABLA INICIAL  * * * * *\n");
                            for (Persona p: persona) {
                                System.out.println (p);
                            }
                            System.out.println("\n* * * * *   FINAL DE LA TABLA INICIAL  * * * * *\n");

                    // CONSULTAS HQL

                    System.out.println("\n* * * * * * * * * * * * INICIO: CONSULTA HQL 01 * * * * * * * * * * * *\n"); 
                    imprimeListaPersonas(servicioPersona.consultaHQL_01());
                    System.out.println("\n* * * * * * * * * * * * FINAL: CONSULTA HQL 01 * * * * * * * * * * * *\n");

                    System.out.println("\n* * * * * * * * * * * * INICIO: CONSULTA HQL 02 * * * * * * * * * * * *\n");
                    servicioPersona.consultaHQL_02();
                    imprimeListaPersonas(servicioPersona.listaPersonas());
                    System.out.println("\n* * * * * * * * * * * * FINAL: CONSULTA HQL 02 * * * * * * * * * * * *\n");

                    System.out.println("\n* * * * * * * * * * * * INICIO: CONSULTA HQL 03 * * * * * * * * * * * *\n");
                    servicioPersona.consultaHQL_03();
                    imprimeListaPersonas(servicioPersona.listaPersonas());
                    System.out.println("\n* * * * * * * * * * * * FINAL: CONSULTA HQL 03 * * * * * * * * * * * *\n");



                    System.out.println("\n* * * * * * * * * * * * INICIO: CREACION NUEVO REGISTRO Irene * * * * * * * * * * * *\n");    
                    Integer idPersona = servicioPersona.nuevaPersona("Irene", "Montero", "motero@iglesias.com", "985698510"); 
                    imprimeListaPersonas(servicioPersona.listaPersonas());
                    System.out.println("\n* * * * * * * * * * * * FINAL: CREACION NUEVO REGISTRO Irene * * * * * * * * * * * *\n");

                    System.out.println("\n* * * * * * * * * * * * INICIO: ACTUALIZAR EMAIL REGISTRO motero@iglesias.es * * * * * * * * * * * *\n");
                    servicioPersona.actualizaPersona(idPersona, "motero@iglesias.es");    
                    imprimeListaPersonas(servicioPersona.listaPersonas());
                    System.out.println("\n* * * * * * * * * * * * FINAL: ACTUALIZAR EMAIL REGISTRO motero@iglesias.es * * * * * * * * * * * *\n");

                    System.out.println("\n* * * * * * * * * * * * INICIO: BORRAR REGISTRO Irene * * * * * * * * * * * *\n");
                    servicioPersona.borraPersona(idPersona);
                    imprimeListaPersonas(servicioPersona.listaPersonas()); 
                    System.out.println("\n* * * * * * * * * * * * FINAL: BORRAR REGISTRO Irene * * * * * * * * * * * *\n");

                }     
            }
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_16 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_16 + """
        *******************************************************************************************************************************
            package com.example.demo;

            import java.io.Serializable;
            import javax.persistence.Column;
            import javax.persistence.Entity;
            import javax.persistence.GeneratedValue;
            import javax.persistence.Id;
            import javax.persistence.Table;

            /**
             *
             * @author Juan José Estévez González
             */

            @Entity
            @Table(name = "persona")
            public class Persona implements Serializable {

                // ATRIBUTOS

                @Id @GeneratedValue
                @Column(name="id_persona")    
                private int idPersona;

                @Column(name="nombre")
                private String nombre;

                @Column(name="apellido")
                private String apellido;

                @Column(name="email")
                private String email;

                @Column(name="telefono")
                private String telefono;

                // CONSTRUCTORES

                public Persona(){}    

                public Persona(String nombre, String apellido, String email, String telefono) {
                    this.nombre = nombre;
                    this.apellido = apellido;
                    this.email = email;
                    this.telefono = telefono;
                }

                // GETTERS Y SETTERS

                public int getIdPersona() {
                    return idPersona;
                }

                public void setIdPersona(int idPersona) {
                    this.idPersona = idPersona;
                }

                public String getNombre() {
                    return nombre;
                }

                public void setNombre(String nombre) {
                    this.nombre = nombre;
                }

                public String getApellido() {
                    return apellido;
                }

                public void setApellido(String apellido) {
                    this.apellido = apellido;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getTelefono() {
                    return telefono;
                }

                public void setTelefono(String telefono) {
                    this.telefono = telefono;
                }

                // TO STRING

                @Override
                public String toString() {

                    String tit = ("\nTABLA PERSONA:");
                    String idP = ("\n Persona ID:  " + idPersona);
                    String noP = ("\n Nombre    :  " + nombre);
                    String apP = ("\n Apellido  :  " + apellido);
                    String emP = ("\n Email     :  " + email);
                    String teP = ("\n Telefono  :  " + telefono);       

                    return tit + idP + noP + apP + emP + teP;
                }   
            }
        *******************************************************************************************************************************
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
                case "17" -> {
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