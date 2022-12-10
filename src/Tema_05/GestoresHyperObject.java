package Tema_05;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class GestoresHyperObject {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 05                                       MANEJO DE CONECTORES II
********************************************************************************************************************
*                                  GESTORES DE BASES DE DATOS EMBEBIDOS I: HyperSQL Y ObjectDB
********************************************************************************************************************

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