package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_07 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        *******************************************************************************************************************************
        *  TEMA 07                                       EL MAPEO OBJETO RELACIONAL  ( ORM )                                          *
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