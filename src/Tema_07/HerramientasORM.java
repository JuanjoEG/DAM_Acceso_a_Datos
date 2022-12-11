package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class HerramientasORM {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 07                                     EL MAPEO OBJETO RELACIONAL  
********************************************************************************************************************
*                                                 HERRAMIENTAS ORM.
********************************************************************************************************************

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
                               
********************************************************************************************************************
*  0. SALIR.
********************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
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