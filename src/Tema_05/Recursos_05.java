package Tema_05;

import static Principal_Main.Main.*;
import static Tema_05.T_05.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_05 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_05 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************

            DIFERENTES POSIBILIDADES PARA EL ALMACENAMIENTO DE DATOS EN SISTEMAS DE BASES DE DATOS RELACIONALES,
            QUE GIRAN ALREDEDOR DEL DESARROLLO DE NUESTRO APLICATIVO:

                    - GESTORES DE BASES DE DATOS EN MEMORIA:
                            - SON LAS M�S R�PIDAS.
                            - ALMACENA TODA LA INFORMACI�N DE LA MISMA EN MEMORIA PRINCIPAL DEL SISTEMA. --> RAM.
                            - LA MEMORIA ES VOL�TIL: LA INFORMACI�N SOLO PERMANECE MIENTRAS LA APLICACI�N EST� EJECUTANDOSE.
                            - NO SE ALMACENA NING�N DATO EN DISCO.

                    - GESTORES DE BASES DE DATOS EMBEBIDAS:
                            - ES PARTE DE LA APLICACI�N QUE SE HA DESARROLLADO.
                            - EL MOTOR DE LA BASE DE DATOS CORRE CON EL MISMO MOTOR DE LA APLICACI�N JAVA (JVM -> JAVA VIRTUAL MACHINE).
                              MIENTRAS LA APLICACI�N EST� EN EJECUCI�N.
                            - ACCEDEREMOS A ESTE TIPO DE BASE DE DATOS POR MEDIO DE LOS JDBC DRIVER.
                            - DESVENTAJAS:
                                   - COHESI�N -> TODOS LOS ELEMENTOS EST�N MUY RELACIONADOS ENTRE S�, LE RESTA FLEXIBILIDAD.
                                   - DIFICULTAD DE MANTENIMIENTO: NO EST� CONSTRUIDAS PARA GESTIONAR MUCHOS PROBLEMAS.
                            - USO RECOMENDADO: REPOSITORIO PARA PERSISTIR LAS TRANSACCIONES SIN NING�N TIPO
                                               DE INTERVENCI�N POR PARTE DEL USUARIO.
                            - EJEMPLOS: HyperSQL, OBjectDB, JavaDB, Apache, Derby, H2

                    - GESTORES DE BASES DE DATOS INDEPENDIENTES:
                            - DISPONEN DE UN GESTOR O ADMINISTRADOR DE BASE DE DATOS
                              DEDICADO A RESOLVER CIERTOS PROBLEMAS DE MANTENIMIENTO.
                            - SON LOS SGBD, SISTEMAS DE GESTI�N DE BASES DE DATOS RELACIONALES.
                            - LAS BASES DE DATOS CLIENTE/SERVIDOR SON INDEPENDIENTES Y, LAS M�S PESADAS Y POTENTES.
                            - EJEMPLOS: Oracle, SQL Server, MySQL, Postgres
                         
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        ************************************************************************************************************************

            - HyperSQL:
                    - SE PUEDE EJECUTAR TANTO EN MODO EMBEBIDO COMO EN MODO SERVIDOR.
                    - SE AJUSTA A LA VERSI�N EST�NDAR SQL 2011 Y A LA ESPECIFICACI�N JDBC 4.
                    - SOPORTA LAS CARACTER�STICAS CL�SICAS DE LAS BASES DE DATOS MODERNAS DE TIPO RELACIONALES.
                    - A PARTIR DE LA VERSI�N 2.3.X SOPORTA EL MECANISMO MVCC (MULTI VERSION CONCURRENCY CONTROL),
                      PARA EVITAR BLOQUEOS: LO QUE SE VE CON NUESTRO ACCESO ES COMO UNA IMAGEN DE LA BD
                      Y NO INTERFIERE CON LAS TRANSACCIONES.
                    - LA BASE DE DATOS ES BASTANTE ESTABLE, ES DE UNA CONFIANZA CONSIDERABLE,
                      COMO LOS PROYECTOS DESARROLLADOS DE C�DIGO ABIERTO 'Open Office' Y 'LibreOffice'.
                    - DESARROLLADO EN JAVA, SE EJECUTA SIN PROBLEMA EN NUESTRA JVM,
                      FACILITANDO UNA INTERFAZ JDBC PARA EL ACCESO A DATOS.
                    - EL PAQUETE PRINCIPAL QUE NOS DESCARGAMOS CONTIENE UN FICHERO 'hsqldb.jar' DENTRO DEL DIRECTORIO /lib
                            - CONTIENE EL MOTOR DE LA BASE DE DATOS HyperSQL RDBMS
                              Y EL DRIVER JDBC EMBEBIDO EN LA APLICACI�N JAVA.

            - ObjectDB:
                    - TAMBI�N CONTIENE LOS DOS MODOS, EMBEBIDO Y MODO CLIENTE/SERVIDOR.
                    - M�S QUE UNA BD RELACIONAL, ES UNA BASE DE DATOS ORIENTADA A OBJETOS CON SOPORTE PARA LA ESPECIFICACI�N JPA2:
                            - EL USO DE UNA CAPA DE ABSTRACCI�N, COMO LA DE Hibernate, TIENE UN MEJOR RENDIMIENTO QUE CUALQUIER OTRA BD.
                            - SU COMPATIBILIDAD CON JPA, PERMITIR�A ELIMINAR LA CAPA ORM (SI LA TUVIERA) PARA APROVECHAR EL RENDIMIENTO.

             NOTAS:

                    Java Persistence API, (JPA) ES LA API DE PERSISTENCIA DESARROLLADA PARA LA PLATAFORMA JAVA EE.

                    Hibernate ES UNA HERRAMIENTA DE MAPEO OBJETO-RELACIONAL (ORM) PARA JAVA QUE FACILITA EL MAPEO DE ATRIBUTOS
                    ENTRE UNA BASE DE DATOS RELACIONAL TRADICIONAL Y EL MODELO DE OBJETOS DE UNA APLICACI�N.
                    LA RELACI�N QUE EXISTE ENTRE JPA E HIBERNATE, RADICA EN QUE ESTE �LTIMO IMPLEMENTA
                    COMO PARTE DE SU C�DIGO LA ESPECIFICACI�N DE JPA, ES DECIR, SE PUEDE USAR HIBERNATE PARA CONSTRUIR
                    UNA CAPA DE PERSISTENCIA APOY�NDOSE EN LAS DEFINICIONES Y REGLAS QUE LA ESPECIFICACI�N DE JPA.
                    HIBERNATE ES MUCHO M�S GRANDE QUE LA ESPECIFICACI�N DE JPA Y A�ADE M�S FUNCIONALIDADES.                   

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

            - Apache Derby:
                    - PUEDE SER DESPLEGADA EN MODO SIMPLE EMBEBIDO Y TAMBI�N EN MODO CLIENTE/SERVIDOR.
                    - ESCRITA POR COMPLETO EN JAVA, PUEDE SER INCLUIDA EN CUALQUIER APLICACI�N JAVA.
                    - SOPORTA TODAS LAS FUNCIONALIDADES EST�NDAR DE UNA BASE DE DATOS RELACIONAL.
                    - PARA EMBEBER UNA BD DERBY EN NUESTRA APLICACI�N JAVA,
                      HAY QUE INCLUIR EN EL PROYECTO JAVA EL FICHERO 'derby.jar' DEL DIRECTORIO /lib.
                             - ESTE FICHERO CONTIENE EL MOTOR DE LA BASE DE DATOS
                               Y LOS CONECTORES PARA LA CONEXI�N CON EL DRIVER JDBC.           

            - JavaDB:
                    - JAVADB EST� CONTRUIDA SOBRE EL MOTOR DE LA BASE DE DATOS DERBY.

            - H2 Database:
                    - CONTIENE MODO CLIENTE/SERVIDOR, MODO EMBEBIDO Y MODO DESPLEGABLE EN MEMORIA.
                    - ES MUY R�PIDA, DE C�DIGO ABIERTO, JDBC API.
                    - SE PUEDE USAR PERFECTAMENTE PARA APLICACIONES WEB.
                    - MUY MANEJABLE Y TRANSPORTABLE, EL FICHERO .jar OCUPA 2MB DE ESPACIO TOTAL.
                    - SOPORTA MVCC -> MULTIVERSION CONCURRENCY CONTROL.
                    - PARA CONECTARSE PUEDE USAR Postgress OBDC DRIVER.

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

            - DIFERENCIAS PRINCIPALES CON LOS SGBD EMBABIDOS

                    - UNA BASE DE DATOS INDEPENDIENTE NO PUEDE EJECUTARSE BAJO LA MISMA
                      M�QINA VIRTUAL DE JAVA QUE USA NUESTRA APLICACI�N.

                    - UNA BASE DE DATOS INDEPENDIENTE CONSUMIR� SIEMPRE M�S RECURSOS QUE UNA EMBEBIDA.

                    - A NIVEL DE FUNCIONALIDAD Y OPERATIVO, LAS BASES DE DATOS EMBEBIDAS EST�N RESTRINGIDAS.

                    - NORMALMENTE LOS SGBD INDEPENDIENTES SE INSTALAN EN OTRA M�QUINA F�SICA.
                            - VENTAJAS DE LA INSTALACI�N EN UNA M�QUINA AISLADA PARA LA BASE DE DATOS:
                                    - APROVECHAR� MEJOR LOS RECURSOS QUE TIENE DISPONIBLES.
                                    - EN DICHA M�QUINA SEPARADA, NO TIENE LAS LIMITACIONES 
                                      Y RESTRICCIONES DE FUNCIONALIDAD Y OPERATIVA DE LAS EMBEBIDAS.
                                      PUEDE VOLCAR TODO EL POTENCIAL QUE OFRECE CON TODOS SUS PROCEDIMIENTOS Y OPERATIVOS.
                            - PUEDE SER INSTALADA EN LOCAL PARA PRUEBAS O APRENDIZAJE.

                    - ALGUNAS DE LAS BASES DE DATOS RELACIONALES INDEPENDIENTES M�S RECONOCIDAS A NIVEL COMERCIAL
                      Y DE MAYOR POTENCIA Y EXTENSI�N SON:

                                - Oracle
                                - SQL Server DataBase
                                - Postgres SQL
                                - MySQL

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        *******************************************************************************************************************************
        *  1� - DIRECCI�N DE LOS PLUGINS DE NETBEANS:   -->  https://plugins.netbeans.apache.org/                                     *
        *  2� - BUSCAR EL PLUGING Y DESCARGARLO         -->  NB SpringBoot                                                            *
        *  3� - EN EL NETBEANS --> TOOLS --> PLUGINGS --> DOWNLOADED --> ADD PLUGINS... --> Y A�ADIMOS EL PLUGINS E INSTALAMOS        *
        *  4� - FILE --> NEW PROJECT --> JAVA WITH MAVEN --> SPRING BOOT INITIALIZR PROJECT -->                                       *
        *  5� - (MAVEN PROJECT) (LANGUAGE JAVA) (SPRING BOOT 2.7.5) (PACKAGING JAR) -->                                               *
        *  6� - SELECCIONAR LAS DEPENDENCIES -->  --  H2 DATABASE  --  SPRING DATA JPA  --  SPRING WEB  --  --> NEXT --> FINISH       *
        *  7� - DENTRO DE src/main/resources --> application.properties -->                                                           *
        *                                                                                                                             *
        *                                                        # ALMACENAMIENTO EN MEMORIA (JDBC URL)                               *
        *                                                          spring.datasource.url=jdbc:h2:mem:testdb                           *
        *                                                                                                                             *
        *                                                        # ALMACENAMIENTO EN FICHERO (JDBC URL)  -->  jdbc:h2:~/data/demo     *
        *                                                        # spring.datasource.url=jdbc:h2:file:~/data/demo;                    *
        *                                                                                                                             *
        *                                                        # CONTROLADOR (DRIVER CLASS)                                         *
        *                                                          spring.datasource.driverClassName=org.h2.Driver                    *
        *                                                                                                                             *
        *                                                        # (USER NAME)                                                        *
        *                                                          spring.datasource.username=sa                                      *
        *                                                                                                                             *
        *                                                        # (PASSWRD)                                                          *
        *                                                          spring.datasource.password=password                                *
        *                                                                                                                             *
        *                                                          spring.jpa.database-platform=org.hibernate.dialect.H2Dialect       *
        *                                                                                                                             *
        *                                                        # HAGAMOS EL ACCESO POR CONSOLA                                      *
        *                                                          spring.h2.console.enabled=true                                     *
        *                                                                                                                             *
        *  8� - DENTRO DE src/main/resources --> data.sql   -->  CREAREMOS LAS SENTENCIAS SQL QUE SE EJECUTEN EN EL INICIO.           *
        *  9� - DENTRO DE src/main/resources --> schema.sql -->  CREAREMOS LA CONFIGURACI�N DEL ESQUEMA QUE DEBE USAR LA APLICACI�N.  *
        * 10� - LANZAR EL PROGRAMA  -->  VISITAR http://localhost:8080/h2-console  --> CONNET                                         *
        *                                                                                                                             *
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
        *                                                                                                                             *
        *  1� - GENERAR EL *.jar DEL PROYECTO EN NETBEANS.  RUN --> BUILD PROJECT (SPRING H2)                                         *
        *  2� - ME CREA EL ARCHIVO J:/Ejercicios/InitializrSpringbootProject_001/target/demo-0.0.1-SNAPSHOT.jar                       *
        *  3� - EN EL CMD ARRANCA PROGRAMA --> java -jar J:/Ejercicios/InitializrSpringbootProject_001/target/demo-0.0.1-SNAPSHOT.jar *
        *  4� - EN EL CMD COMPROBAR CONEXXI�N --> netstat -ao|find /i "8080"    (VER EL N�MERO DE PROCESO - LOCAL PORT)               *
        *  5� - EN EL CMD MATAR PROGRAMA --> PULSAR (CTRL + C)                                                                        *
        *  6� - EN EL CMD MATAR PROCESO  --> taskkill /f /im <numero_proceso>                                                         *
        *       (PODEMOS USAR EL PROGRAMA CURRPORTS PARA MATAR PROGRAMAS Y PROCESOS VIENDO SU LOCAL PORT)                             *
        *         SELECCIONAR EL PROCESO CON PUERTO 8080 --> FILE --> KILL PROCESSES OF SELECTED PORTS                                *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        ************************************************************************************************************************
                    *                         *     H2     *    DERBY   *  HYPERSQL  *   MYSQL    *  POSTGRESS *
                    ********************************************************************************************
                    *     BD  EMBEBIDAS       *     SI     *     SI     *     SI     *            *            *
                    ********************************************************************************************
                    *    BD INDEPENDIENTE     *            *            *            *     SI     *     SI     *
                    ********************************************************************************************
                    *        JAVA PURO        *     SI     *     SI     *     SI     *     NO     *     NO     *
                    ********************************************************************************************
                    *      MODO MEMORIA       *     SI     *     SI     *     SI     *     NO     *     NO     *
                    ********************************************************************************************
                    *      BD ENCRIPTADA      *     SI     *     SI     *     SI     *     NO     *     NO     *
                    ********************************************************************************************
                    *       DRIVER ODBC       *     SI     *     NO     *     NO     *     SI     *     SI     *
                    ********************************************************************************************
                    * B�SQUEDA TEXTO COMPLETO *     SI     *     NO     *     NO     *     SI     *     SI     *
                    ********************************************************************************************
                    *          MVCC           *     SI     *            *            *     SI     *     SI     *
                    ********************************************************************************************
                    *    ESPACIO EMBEBIDO     *  ~2.0 MB   *  ~3.0 MB   *  ~1.5 MB   *     --     *     --     *
                    ********************************************************************************************
                    *    ESPACIO CLIENTE      *  ~500 KB   *  ~600 KB   *  ~1.5 MB   *  ~1.0 MB   *  ~700 KB   *
        ************************************************************************************************************************
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
                case "8" -> {
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