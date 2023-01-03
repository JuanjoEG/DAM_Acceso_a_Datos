package Tema_11;

import static Principal_Main.Main.*;
import static Tema_11.T_11.*;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_11 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_11 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                         
            TRADICIONALMENTE, LA INDUSTRIA DEL SOFTWARE,
            USA LAS BASES DE DATOS RELACIONALES PARA ALMACENAR Y MANEJAR DATOS DE FORMA PERSISTENTE.
                         
            EN CONCRETO No-SQL NO REPRESENTA UN PRODUCTO �NICO O UNA �NICA TECNOLOG�A.
            No-SQL:
                    - REPRESENTA UN GRUPO DE PRODUCTOS Y UN CONJUNTO RELACIONADO DE CONCEPTOS PARA EL ALMACENAMIENTO Y SU ADMINISTRACI�N.
                    - SE REFIERE A BASES DE DATOS Y ALMACENES DE DATOS
                      NO BASADOS EN EL SISTEMA TRADICIONAL DE BASES DE DATOS RELACIONALES ENTRE S�,
                      O NO BASADOS EN SUS PRINCIPIOS.
                    - SUELE RELACIONARSE CON GRANDES CONJUNTOS DE DATOS A LOS QUE SE ACCEDE Y SE MANIPULAN A ESCALA WEB.
                    - FUE TAMBI�N UN 'HASHTAG' ESCOGIDO PARA UNA GRAN REUNI�N T�CNICA PARA DISCUTIR LAS NUEVAS BASES DE DATOS.
                         
            LAS BASES DE DATOS No-SQL TIENEN UNA SERIE DE CARACTER�STICAS COMUNES COMO:
                    - MODELO DE DATOS NO RELACIONAL.
                    - FUNCIONAN BIEN EN CLUSTERS,
                      ENTENDIENDO POR CLUSTER UN CONJUNTO DE M�QUINAS IMPLEMENTADAS COMO SERVIDORES DE PROCESAMIENTO PARALELO.
                            - FUNCIONAN ENTRE S� COMO UN �NICO RECURSO.
                            - A CADA ELEMENTO O M�QUINA LO LLAMAMOS NODO.
                    - SUELEN SER EN SU MAYOR�A DE C�DIGO ABIERTO.
                    - SU CONSTRUCCI�N EST� ORIENTADA PARA LAS APLICACIONES WEB DE NUEVA GENERACI�N.
                    - SON BASES DE DATOS CON AUSENCIA DE ESQUEMAS (SCHEMALESS).
                            - ESTA ES UNA CARACTER�STICA MUY FLEXIBLE:
                              SE PUEDE ALMACENAR INFORMACI�N NO UNIFORME, Y AS� SE FACILITA LA EVOLUCI�N.
                              
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        **********************************************************************************************************************************
                       
            CADA VEZ AUMENTA M�S EL VOLUMEN Y EL TIPO DE DATOS QUE SE PRODUCEN, SE MANEJAN, ANALIZAN Y SE ARCHIVAN,
            EN MUCHOS CASOS CON DATOS SEMIESTRUCTURADOS:
                    - LA EXPLOSI�N DEL SOCIAL-MEDIA Y LOS CONTENIDOS MANEJADOS POR EL USUARIO.
                    - APORTACIONES DE LAS NUEVAS FUENTES DE INFORMACI�N COMO SENSORES, SISTEMAS GLOBALES DE POSICIONAMIENTO O GPS,
                      REASTREADORES, Y OTROS TIPOS DE SISTEMAS QUE MONITOREAN GRANDES CANTIDADES DE INFORMACI�N DE FORMA REGULAR.
                         
            ESTO HA PROVOCADO UNA REVISI�N DE LAS BASES DE DATOS RELACIONALES, UNA DEFINICI�N DEL ESQUEMA Y REFERENCIAS RELACIONALES.
                         
            PARA RESOLVER EL PROBLEMA RELACIONADO CON LOS GRANDES VOL�MENES DE INFORMACI�N Y LOS DATOS SEMI-ESTRUCTURADOS,
            SURGEN NUEVAS CLASES DE BASES DE DATOS DENTRO DE LA FAMILIA No-SQL.
                        
            ESTE TIPO DE BASES DE DATOS CONSISTE EN EL ALMACENAMIENTO BASADO EN COLUMNAS,
            CLAVE-VALOR Y DE DOCUMENTOS, QUE ESTUDIAREMOS M�S ADELANTE.
                         
                - EL USUARIO EDy Latam EN UN POST DE UNA RED SOCIAL TIENE UNA INFORMAC�N QUE SER� GUARDADA EN BASE DE DATOS...
                         
                * EN UNA BASE DE DATOS RELACIONAL ESA INFORMACI�N SE DIVIDE Y REPARTE EN DISTINTAS TABLAS.
                         
                * EN UNA BASE DE DATOS NoSQL TODA LA INFORMACI�N SE ALMACENA EN UN FICHERO JSON,
                  PUDIENDO ESTAR REPETIDA TODA LA INFORMACI�N EN DISTINTOS PUNTOS
                  CON EL FIN DE ACCEDER A LA INFORMACI�N LO M�S R�PIDO POSIBLE.
                         
                   SQL                      VS                       NO SQL
              (RELACIONALES)                                    (NO RELACIONALES)
                         
            EVITA LA REDUNDANCIA                               USAN LA REDUNDANCIA
                 DE DATOS                                         DE DATOS PARA
              ORGANIZANDOLOS                                     HACER CONSULTAS
                EN TABLAS.                                          M�S R�PIDO.
               
            - MySQL                                             - mongoDB
                         
            * TABLA Usuario                                     * FICHERO: post1.json  -->     {
                                                                                                   "autor": "EDy Latam",
            * TABLA Imagenes                                                                        "date":"20-02-2021",
                                                                                                    "images":
            * TABLA Likes                                                                           ["/images/photo1.jpg"],
                                                                                                    "likes": "60"
            * TABLA Post                                                                        }
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        **********************************************************************************************************************************
            
            BASES DE DATOS RELACIONALES:
                         
                A.- LA INFORMACI�N EST� ALMACENADA EN UN MODELO RELACIONAL CON FILAS Y COLUMNAS.                         
                    UNA FILA CONTIENE INFORMACI�N SOBRE UN ELEMENTO MIENTRAS QUE LAS COLUMNAS CONTIENEN INFORMACI�N ESPEC�FICA.
                         
                B.- SIGUE UN ESQUEMA FIJO. LAS COLUMNAS SON DEFINIDAS Y ESTABLECIDAS ANTES DE LA ENTRADA DE DATOS.
                    ADEM�S, CADA FILA CONTIENE INFORMACI�N DE CADA COLUMNA.
                         
                C.- A FAVOR DEL ESCALADO VERTICAL.
                         
                D.- ACID. --> ATOMICIDAD, CONSISTENCIA, AISLAMIENTO Y DURABILIDAD.
                         
            BASES DE DATOS No-SQL:
                         
                A.- LA INFORMACI�N EST� ALMACENADA EN UN CLIENTE O EN UNA BASE DE DATOS DIFERENTE CON MODELOS DE DATOS DISTINTOS.
                         
                B.- SIGUE UN ESQUEMA DIM�MICO, PUEDES A�ADIR COLUMNAS EN CUALQUIER MOMENTO.
                         
                C.- FACILITA EL ESCALADO HORIZONTAL. SE PUEDE ESCALAR A TRAV�S DE SERVIDORES M�LTIPLES.
                    LOS SERVIDORES M�LTIPLES TIENEN LA VENTAJA DEL PRECIO EN RELACI�N AL HARDWARE
                    QUE SE VA A�ADIENDO COMPARADO CON EL ESCALADO VERTICAL.
                         
                D.- NO EST� A FAVOR DE LOS PRINCIPIOS ACID.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        **********************************************************************************************************************************
                       
            CAPACIDAD DE FUENTE DE DATOS PRIMARIA Y DE AN�LISIS:
                         
                    * DEBE SERVIR COMO FUENTE PRINCIPAL DE DATOS QUE RECIBE INFORMACI�N DE DISTINTAS APLICACIONES DE NEGOCIO Y SISTEMAS.
                    * TAMBI�N DEBE ACTUAR COMO SEGUNDA FUENTE DE INFORMACI�N O AN�LISIS PARA LAS APLICACIONES DE 'Business Intelligence'.
                    * DEBEN DE SER CAPACES DE INTEGRARSE DE UNA FORMA R�PIDA A TODOS LOS TIPOS DE DATOS ESTRUCTURADOS,
                      SEMIESTRUCTURADOS O SIN ESTRUCTURA. DEBEN ALMACENAR TODO TIPO DE DATOS.
                    * DEBEN SER CAPACES DE EJECUTAR CONSULTAS DE ALTO RENDIMIENTO.
                         
            CAPACIDAD BIG DATA: -> PERO NO LIMITADA A TRABAJAR CON BIG DATA.
                         
                    * PUEDE ESCALAR PARA ADMINISTRAR GRANDES VOL�MENES DE DATOS DESDE TERABYTES HASTA PETABYTES.
                    * ADEM�S DE ALMACENAR GRANDES VOL�MENES DE DATOS, OFRECE UN ALTO RENDIMIENTO
                      PARA LA VELOCIDAD, VARIEDAD Y COMPLEJIDAD DE LOS DATOS.
                         
            DISPONIBILIDAD CONTINUA:
                         
                DEBE OFRECER DISPONIBILIDAD CONTINUA, SIN UN SOLO PUNTO DE FALLO, Y ADEM�S DE MANERA INTEGRADA,
                INCLUYENDO LAS SIGUIENTES CARACTER�STICAS:
                         
                    * TODOS LOS NODOS DE UN CL�STER DEBEN PODER ATENDER SOLICITUDES DE LECTURA INCLUSO SI ALGUNAS M�QUINAS NO FUNCIONAN.
                    * DEBE SER CAPAZ DE REPLICAR Y SEGREGAR DATOS F�CILMENTE ENTRE DIFERENTES PARTES F�SICAS EN UN CENTRO DE DATOS.
                    * ESTO EVITAR� CORTES DE HARDWARE.
                    * DEBE PODER ADMITIR DISE�OS DE DISTRIBUCI�N DE DATOS QUE SEAN CENTROS DE DATOS M�LTIPLES
                      YA SEA EN INSTANCIACIONES F�SICAS O EN LA NUBE.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_14 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_15 + """
        **********************************************************************************************************************************
                       
        **********************************************************************************************************************************
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
                case "16" -> {
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
                }
            }
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