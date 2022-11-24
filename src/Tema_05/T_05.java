package Tema_05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_05 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        *******************************************************************************************************************************
        *  TEMA 05                                       MANEJO DE CONECTORES II                                                      *
        *******************************************************************************************************************************
        *                                          CONFIGURACI�N DE LA CONEXI�N H2.                                                   *
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
        *  ARRANCAR SPRING H2 JPA WEB SIN TENER EL IDE                                                                                *
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
        *  0. SALIR.                                                                                                                  *
        *******************************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {                    
                    case "0" -> {}
                    default -> System.out.println("\n ��� LA OPCI�N NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}