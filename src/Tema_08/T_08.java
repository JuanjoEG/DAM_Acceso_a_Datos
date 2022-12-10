package Tema_08;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_08 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        *******************************************************************************************************************************
        *  TEMA 08                                       EXPLORACI�N DEL MAPEO OBJETO-RELACIONAL                                      *
        *******************************************************************************************************************************
        *  INSTALAR HIBERNATE:  SIMILAR A INSTALACI�N H2 TEMA 5 Y ORM TEMA 7                                                          *
        *                                                                                                                             *
        *  PARTIMOS QUE TENEMOS YA UNA BDD CON UNA TABLA CREADA CON MySQL Workbench POR EJEMPLO                                       *
        *                                                                                                                             *
        *                   --  EN NETBEANS --                                                                                        *
        *  1. - FILE -> NEW PROJECT -> JAVA WITH MAVEN -> SPRING BOOT INITIALIZR PROJECT                                              *
        *  2. - (MAVEN PROJECT) (LANGUAGE JAVA) (SPRING BOOT 2.7.5) (PACKAGING JAR) -->                                               *
        *  3. - SELECCIONAR LAS DEPENDENCIES -->  --  H2 DATABASE  --  SPRING DATA JPA  --  SPRING WEB  --  --> NEXT --> FINISH       *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  CLASES PERSISTENTES:      SE COLOCAN EN LA MISMA CARPETA QUE EL FICHERO *.jar PRINCIPAL DE HIBERNATE                       *
        *                       ( CLASES POJO --> CLASES SIMPLES EN JAVA PARA PERSISTIR LOS OBJETOS EN BDD )                          *
        *                                                                                                                             *
        *         - NECESITAN CONSTRUCTOR POR DEFECTO Y CONSTRUCTOR CON PAR�METROS ( SIN Id )                                         *
        *         - DEBEN CONTENER UN ATRIBUTO Id...  -->  SER� PRIMARY KEY EN LA TABLA  -->  private int id...;                      *
        
        *         - TODOS LOS ATRIBUTOS PRIVADOS                                                                                      *
        *         - NECESITAMOS LOS GETTERS Y SETTERS    GET -> OBTENER INFO     SET -> GUARDAR INFO                                  *
        *         - LA CLASE NO PUEDE SER DE TIPO FINAL                                                                               *
        *         - LOS ATRIBUTOS TIENEN QUE ESTAR EN CAMELKEY                                                                        *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  CREAREMOS UNA TABLA EN UNA BDD:  CON ESTRUCTURA EQUIVALENTE A LA CLASE                                                     *
        *                                                                                                                             *        
        *         - NECESITA CLAVE PRIMARIA AUTO INCREMENTAL --> LA COLUMNA NO DEBE LLAMARSE ID A SECAS                               *
        *                (EL NOMBRE DE LA COLUMNA PRIMARY KEY Y EL NOMBRE DEL ATRIBUTO DE LA CLASE TIENEN QUE SER DIFERENTES)         *
        *         - TENDR� COLUMNAS QUE SE CORRESPONDAN CON LOS ATRIBUTOS DE LA CLASE                                                 *
        *                (LOS NOMBRES DEL RESTO DE LAS COLUMNA Y LOS NOMBRES DE LOS ATRIBUTOS DE LA CLASE SI PUEDEN SER IGUALES)      *
        *                                                                                                                             *
        *                               Sentencia SQL de creacion de la tabla en la base de datos:                                    *
        *                               create table ejemploormhibernate.CLIENTE (                                                    *
        *                               num_cliente INT NOT NULL auto_increment,                                                      *
        *                               nombre_cliente VARCHAR(20) default NULL,                                                      *
        *                               apellido_cliente  VARCHAR(20) default NULL,                                                   *
        *                               email VARCHAR(20)  default NULL,                                                              *
        *                               PRIMARY KEY (num_cliente));                                                                   *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  FICHERO DE MAPEO: --> NOMBRE: <nombreClasePojo>.hbm.xml       RUTA: src/main/resources/default packade/                    *
        *                                                                                                                             *        
        *         - VA A CONTENER LA INFORMACI�N QUE NECESITA HIBERNATE PARA GUARDAR CADA OBJETO EN LA BDD                            *
        *         - EL MAPEO TIENE QUE COINCIDIR CON LA ESTRUCTURA DE LA TABLA --> CREADA EN DDL (LENGUAJE DE DEFINICI�N DE DATOS)    *
        *         - EL FICHERO XML SE PUEDE ESCRIBIR USANDO HERRAMIENTAS O A MANO                                                     *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  USANDO ANOTACIONES EN LA CLASE POJO: --> ALTERNATIVA AL FICHERO DE MAPEO.                                                  *
        *                                                                                                                             *
        *             - @Entity                              --> ESTA CLASE ES UNA ENTIDAD Y SE CORRESPONDE CON ...                   *
        *             - @Table(name = "......")              --> ESTE NOMBRE DE ESTA TABLA EN LA BDD                                  *
        *                                                                                                                             *
        *             - @Id @GeneratedValue                  --> CON CLAVE PRIMARIA Y N�MEROS ENTEROS AUTOCOMPLETABLES                *
        *             - @Column(name=".......")              --> Y SE CORRESPONDE CON ESTA COLUMNA                                    *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  SESIONES Y OBJETOS HIBERNATE I. ESTADOS                                                                                    *
        *                                                                                                                             *
        *         - ES UN OBJETO QUE SE CREA PARA ESTABLECER UNA CONEXI�N F�SICA CON UNA BDD                                          *
        *         - SE CREA --> SE INTERACTUA CON LA BDD --> SE DESTRUYE --> SE CIERRA LA CONEXI�N                                    *
        *         - SU FUNCI�N --> OFRECER - CREAR - LEER - BORRAR --> OPERACIONES PARA LOS OBJETOS DE LA CLASE JAVA                  *
        *         - ESAS INSTANCIAS PUEDEN ESTAR EN UNO DE LOS ESTADOS:                                                               *
        *                 - TRANSIENT  --> TRANSITORIO: SOLO TENEMOS EL OBJETO EN JAVA, NO TIENE AUN REPRESENTACI�N EN LA BDD         *
        *                 - PERSISTENT --> PERSISTENTE: AL ASOCIARSE CON UNA SESI�N, YA TIENE REPRESENTACI�N EN LA BDD                *
        *                 - DETACHED   --> DESASIGNADO: AL CERRAR LA SESI�N                                                           *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  SESIONES Y OBJETOS HIBERNATE II. M�TODOS                                                                                   *
        *                                                                                                                             *
        *        - beginTransaction() --> COMENZAR UNA UNIDAD DE TRABAJO - DEVUELVE OBJETO ASOCIADO DE LA TRANSACCI�N                 *
        *        - cancelQuery()      --> CANCELA LA EJECUCI�N DE LA CONSULTA ACTUAL                                                  *
        *        - clear()            --> ELIMINA LA SESI�N                                                                           *
        *        - close()            --> FINALIZA LA SESI�N, LIBERA Y LIMPIA LA CONEXI�N JDBC - DEVUELVE OBJETO Connection           *
        *        - createCriteria(Class clasePersistente) --> CREA INSTANCIA DE TIPO Criteria Y DEVUELVE EL OBJETO Criteria           *
        *        - createCriteria(String entityName) --> CREA INSTANCIA DE TIPO Criteria Y DEVUELVE EL OBJETO Criteria                *
        *        - getIdentifier(Object object) -->                                                                                   *
        *        - createFilter(Object collection, String queryString)                                                                *
        *        - createQuery(String HQLqueryString)                                                                                 *
        *        - delete(Object object)                                                                                              *
        *        - getSessionFactory()                                                                                                *
        *        - refresh(Object object)                                                                                             *
        *        - isConnected()                                                                                                      *
        *        - isOpen()                                                                                                           *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  CARGA, ALMACENAMIENTO Y MODIFICACIONES DE OBJETOS                                                                          *
        *                                                                                                                             *
        *       - CARGA DE DATOS:                                                                                                     *
        *                      Session.get()                                                                                          *
        *                      Session.load()                                                                                         *
        *                                                                                                                             *
        *       - ALMACENAMIENTO DE OBJETOS:                                                                                          *
        *                      Session.persist()                                                                                      *
        *                      Session.save()                                                                                         *
        *                                                                                                                             *
        *       - MODIFICACI�N DE OBJETOS:                                                                                            *
        *                      Session.update()                                                                                       *
        *                      Session.merge()                                                                                        *
        *                                                                                                                             *
        *       - OTROS M�TODOS:                                                                                                      *
        *                      Session.delete()                                                                                       *
        *                      Session.saveOrUpdate()                                                                                 *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  GESTI�N DE TRANSACCIONES CON HIBERNATE               *   ACID         ATOMICIDAD   -  ATOMICITY                            *
        *                                                       *                CONSISTENCIA -  CONSISTENCY                          *
        *       SessionFactory factory;                         *                AISLAMIENTO  -  ISOLATION                            *
        *       Session session = factory.openSession();        *                DURABILIDAD  -  DURABILLITY                          *
        *       Transaction transaction = null;                 *                                                                     *
        *                                                       *     ALGUNOS M�TODOS DE LA INTERFAZ Transaction:                     *
        *       try {                                           *                                                                     *
        *           transaction = session.beginTransaction();   *                                                                     *
        * ------>   AQU� REALIZAMOS LAS OPERACIONES   <------   *      - Void begin                                                   *
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
        *  0. SALIR.                                                                                                                  *
        *******************************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {                    
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}