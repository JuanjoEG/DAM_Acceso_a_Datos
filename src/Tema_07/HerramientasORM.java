package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                               
********************************************************************************************************************
*  0. SALIR.
********************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
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