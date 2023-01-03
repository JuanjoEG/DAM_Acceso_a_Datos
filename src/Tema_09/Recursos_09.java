package Tema_09;

import static Principal_Main.Main.*;
import static Tema_09.T_09.*;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_09 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_09 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        *******************************************************************************************************************************
        *                                                                                                                             *
        *  DBMS   -> SISTEMA GESTOR DE BASE DE DATOS                      -> DATABASE MANAGEMENT SYSTEM                               *
        *  RDBMS  -> SISTEMA GESTOR DE BASE DE DATOS RELACIONALES         -> RELATIONAL DATABASE MANAGEMENT SYSTEM                    *
        *  ODBMS  -> SISTEMA GESTOR DE BASE DE DATOS DE OBJETOS           -> OBJECT DATABASE MANAGEMENT SYSTEM                        *
        *  OODBMS -> SISTEMA GESTOR DE BASE DE DATOS ORIENTADO A OBJETOS  -> OBJECT-ORIENTED DATABASE MANAGEMENT SYSTEM               *
        *  OODB   -> BASES DE DATOS ORIENTADO A OBJETOS                   -> OBJECT-ORIENTED DATABASE                                 *
        *  OODM   -> MODELO DE DATOS ORIENTADO A OBJETOS                  -> OBJECT-ORIENTED DATA MODEL                               *
        *  OODMS  -> SISTEMA DE MODELO DE DATOS ORIENTADO A OBJETOS       -> OBJECT-ORIENTED DATA MODEL SYSTEM                        *
        *  API    -> INTERFAZ DE PROGRAMACIÓN DE APLICACIONES             -> APPLICATION PROGRAMMING INTERFACE                        *
        *  REST   -> TRANSFERENCIA DE ESTADO REPRESENTACIONAL             -> REPRESENTATIONAL STATE TRANSFER.                         *
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
        
            LOS MODELOS DE DATOS ORIENTADOS A OBJETOS (OODM):
                    - SON MODELOS LÓGICOS QUE CAPTURAN LA SEMÁNTICA DE LOS OBJETOS DE LA APLICACIÓN.
                        VAN EN CONSONANCIA CON EL MODELO DE LA APLICACIÓN.
                    - IMPLEMENTAN MODELOS CONCEPTUALES DIRECTAMENTE Y PUEDEN REPRESENTAR MÁS COMPLEJIDADES QUE LOS SGBD RELACIONALES.
                    - HEREDAN LOS CONCEPTOS PENSADOS E IMPLEMENTADOS EN LOS LENGUAJES DE PROGRAMACIÓN ORIENTADOS A OBJETOS.
                         
            UNA BASE DE DATOS ORIENTADA A OBJETOS NO ES MÁS QUE UNA COLECCIÓN DE OBJETOS DEFINIDOS POR UN MODELO ORIENTADO A OBJETOS,
            A LOS QUE LE APORTAN EXTENDER LA EXISTENCIA DE LOS OBJETOS PARA QUE SE ALMACENEN INDEFINIDAMENTE; ASÍ LOS OBJETOS:
                    - SON ALMACENADOS MÁS ALLÁ DE LA FINALIZACIÓN DE LA APLICACIÓN.
                    - PUEDEN SER RECUPERADOS MÁS TARDE Y COMPERTIDOS POR OTRAS APLICACIONES.
                         
            RELACIONAMOS EL CONCEPTO DE BASE DE DATOS ORIENTADA A OBJETOS, CUANDO LAS TÉCNICAS DE BASES DE DATOS SE COMBINAN CON OBJETOS.
            EL RESULTADO DE ESTO ES UN SISTEMA GESTOR ORIENTADO A OBJETOS: ODBMS  -> OBJECT DATABASE MANAGEMENT SYSTEM.
                         
            HOY EN DÍA, REALMENTE EXISTE UN AUMENTO DEL DESARROLLO DE APLICACIONES ORIENTADAS A OBJETOS,
            FACILITANDO LA EVOLUCIÓN DE LOS SISTEMAS GESTORES DE BASE DE DATOS ORIENTADOS A OBJETOS: OODBMS.
                         
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
                         
            CARACTERÍSTICAS:
                         
                    - EL SISTEMA PROPORCIONARÁ UN 'IDENTIFICADOR DE OBJETO' ÚNICO PARA CADA OBJETO.
                        GENERADO AUTOMÁTICAMENTE POR EL SISTEMA PARA IDENTIFICAR FÁCILMENTE A LOS OBJETOS.
                         
                    - MANTIENEN UNA RELACIÓN DIRECTA ENTRE MUNDO REAL Y LOS OBJETOS DE LA BASE DE DATOS.
                        MANTIENEN IDENTIDAD E INTEGRIDAD. NO DEBEN ESTAR CORRUPTOS.
                         
                    - SON FÁCILES DE EXTENDER
                        Y DE AÑADIR DATOS NUEVOS TIPOS DE DATOS
                            Y DE REALIZAR OPERACIONES EN ELLOS.
                         
                    - PROPORCIONAN ENCAPSULACIÓN.
                        LA REPRESENTACIÓN DE LA INFORMACIÓN
                            Y LAS IMPLEMENTACIONES DE LOS MÉTODOS
                                PUEDEN OCULTAR LAS ENTIDADES EXTERNAS.
                         
                    - PROPORCIONAN HERENCIA.
                        MEDIANTE LA HERENCIA UN OBJETO HEREDA LAS PROPIEDADES DE OTROS OBJETOS.
                            PERMITE DEFINIR UNA CLASE (DE OBJETOS) A PARTIR DE OTRA YA EXISTENTE.
                                PERMITE LA REUTILIZACIÓN DE CÓDIGO.
                         
                    - LAS TRANSACCIONES NO SON DIFERENTES DE LO VISTO EN TEMAS ANTERIORES,
                        SOLO QUE AQUÍ SERÁN MEDIANTE EL USO DE OBJETOS.                      
                        LAS OODBMS, IGUAL QUE LOS RDBMS, HARÁN USO DE TRANSACCIONES:
                        UNA TRANSACCIÓN ES UN CONJUNTO DE SENTENCIAS QUE FORMARÁN UNA UNIDAD DE TRABAJO.
                            - TENDRÁN -> ATOMICIDAD, CONSISTENCIA Y AISLAMIENTO.
        
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
                         
            - LOS OBJETOS DISPONEN DE UNA SERIE DE CONCEPTOS ASOCIADOS:
                                                  
                    - ATRIBUTOS O VARIABLES DE INSTANCIA:
                        SON LAS CARACTERÍSTICAS QUE DESCRIBEN A LOS OBJETOS.
                        EN EL MOMENTO EN QUE SE ASIGNAN VALORES A LOS ATRIBUTOS,
                        EL OBJETO ESTÁ EN UN 'ESTADO' DETERMINADO EN ESE MOMENTO.

                    - OBJETO:
                        REPRESENTACIÓN ABSTRACTA DE UNA ENTIDAD DEL MUNDO REAL, CON UN IDENTIFICADOR ÚNICO,
                        PROPIEDADES EMBEBIDAS (ATRIBUTOS) Y LA CAPACIDAD DE INTERACTUAR CON OTROS OBJETOS POR SÍ MISMO.

                    - IDENTIDAD:
                        LA IDENTIDAD ES UN IDENTIFICADOR EXTERNO (EL ID DEL OBJETO) QUE SE MANTIENE POR CADA OBJETO.
                            EL ID DEL OBJETO ES ASIGNADO POR EL SISTEMA CUANDO EL OBJETO ES CREADO Y NO PUEDE SER CAMBIADO.
                            ES DISTINTO A LAS BASES DE DATO RELACIONALES:
                                ESTE ID ESTÁ ALMACENADO EN EL INTERIOR DEL OBJETO,
                                Y SE USA PARA IDENTIFICARLO. 
                         
        *******************************************************************************************************************************
        *  LOS OBJETOS DISPONEN DE:                                                                                                   *
        *         - ATRIBUTOS. - CARACTERISTICAS DE LOS OBJETOS. VARIABLES DE INSTANCIA.                                              *
        *                      - ESTADO DE UN OBJETO. SE DETERMINA POR LOS VALORES DE SUS ATRIBUTOS EN UN MOMENTO DETERMINADO.        *
        *         - OBJETO.    - ES LA REPRESENTACIÓN ABSTRACTA DE UNA ENTIDAD EN EL MUNDO REAL.                                      *
        *                      - TIENE LA CAPACIDAD DE INTERACTUAR CON OTROS OBJETOS.                                                 *
        *         - IDENTIDAD. - ES UN IDENTIFICADOR EXTERNO. SE MANTIENE POR CADA OBJETO.                                            *
        *                      - ES UN ID DEL OBJETO PUESTO POR EL SISTEMA AL SER CREADO. NO SE PUEDE CAMBIAR.                        *
        *                                                                                                                             *
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
        *                                                                                                                             *
        *  UN SISTEMA GESTOR DE BASE DE DATOS GENÉRICO DEBE POSEER LAS SIGUIENTES                                                     *
        *  CARACTERÍSTICAS:                                                                                                           *
        *         - CONCURRENCIA.                      -> DIFERENTES USUARIOS ACCEDIENDO A LA VEZ A LA BD.                            *
        *         - PERSISTENCIA.                      -> LA INFORMACIÓN TIENE QUE ESTAR DISPONIBLE DESPUÉS DE REINICAR LA BD.        *
        *         - RECUPERACIÓN DE ERRORES.           -> PERMITIR IDENTIFICAR DÓNDE ESTÁN LOS ERRORES Y SEGUIR TRABAJANDO.           *
        *         - GESTIÓN DE ALMACENAMIENTO.         -> GESTIÓN EFICIENTE Y PERMITIR MONITOREAR Y COMPROBAR LA BASE DE DATOS.       *
        *         - CONSULTAS.                         -> PERMITIR ACCEDER A LA INFORMACIÓN ALMACENADA EN LA BASE DE DATOS.           *
        *                                                                                                                             *
        *  UN SISTEMA GESTOS DE BASE DE DATOS ORIENTADO A OBJETOS,                                                                    *
        *  UN OODBMS AÑADE ADEMÁS:                                                                                                    *
        *         - ABSTRACCIÓN.                        -> DEFINIR LAS CARACTERÍSTICAS ESPECÍFICAS DEL OBJETO.                        *
        *         - MODULARIDAD.                        -> PERMITIR DIVIDIR UN PROBLEMA EN OTROS MÁS PEQUÑOS. AGRUPAR, DISTINGUIR.    *
        *         - JERARQUÍA.                          -> DISTINTAS CATEGORÍAS DE OBJETOS. HEREDAN UNAS CLASES DE OTRAS.             *
        *         - ENCAPSULACIÓN.                      -> COHESIÓN EN LOS DATOS QUE FORMAN UN OBJETO.                                *
        *         - TIPOLOGÍA DE OBJETOS.               -> PODREMOS TRABAJAR CON DISTINTOS TIPOS DE OBJETOS.                          *
        *                                                                                                                             *
        *  UN OODBMS:                                                                                                                 *
        *         - SE FORMA CON UN SISTEMA GESTOR DE ALMACENAMIENTO QUE SOPORTE MODELADO Y CREACIÓN DE DATOS -> COMO OBJETOS.        *
        *         - PERMITE CONCURRENCIA Y LA RECUPERACIÓN DE UNA MANERA EFICIENTE.                                                   *
        *         - NO HAY QUE TRADUCIR FILAS Y COLUMNAS, SINO QUE MANIPULA OBJETOS.                                                  *
        *         - POSEE DATOS RELACIONADOS ENTRE SÍ Y UNA APLICACIÓN/ES 'RODEANDO' DICHA BD CON ACCESO A ELLA.                      *
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
                         
            EL LENGUAJE DE CONSULTAS DE OBJETOS:    OQL  ->  OBJECT QUERY LANGUAGE.
                         
                    - ES UN LENGUAJE DECLARATIVO DE TIPOLOGÍA SQL.
                            JAVA ES IMPERATIVO: LE DECIMOS  --> CÓMO <--  TIENE QUE HACER LAS COSAS.
                            OQL ES DECLARATIVO: LE DECIMOS  --> QUÉ  <--  TIENE QUE HACER.
                    - PERMITE REALIZAR CONSULTAS A BD ORIENTADAS A OBJETOS Y A SUS ESTRUCTURAS.
                    - NO CONTIENE PRIMITIVAS (MÉTODOS ORIGINALES OQL) PARA MODIFICAR EL ESTADO DE LOS OBJETOS,
                      ESO SE HARÁ A TRAVÉS DE LOS MÉTODOS DE LOS PROPIOS OBJETOS.
                         
            TRABAJANDO CON 'OBJETOS' TODO LO RELACIONADO CON LA HERENCIA ES FUNDAMENTAL,
            HAY VARIOS CONCEPTOS CLAVE:
                         
                    AGREGACIÓN:
                        LA AGREGACIÓN ES UN TIPO ESPECÍFICO Y DIFERENTE DE LA ASOCIACIÓN.
                         
                            - CUANDO SE BORRA UN OBJETO DE UNA ASOCIACIÓN DE OBJETOS:            
                                --> EL RESTO DE OBJETOS RELACIONADOS A ÉL PERSISTE.
                         
                            - CUANDO SE INSERTA O ELIMINA UN OBJETO DE UNA AGREGACIÓN DE OBJETOS:
                                --> EL RESTO DE OBJETOS RELACIONADOS A ÉL SERÁN AFECTADOS IGUALMENTE,
                                    SERÁN INSERTADOS O ELIMINADOS JUNTO A ESE OBJETO.
                         
                        LA AGREGACIÓN PERMITE QUE:
                        UN OBJETO QUE PERTENECE A OTRO NO PUEDE SER INTRODUCIDO O BORRADO DE FORMA AISLADA EN LA BD.
                         
                    ESPECIALIZACIÓN, GENERALIZACIÓN Y HERENCIA:                         
                        NOS PERMITEN DEFINIR UNA CLASE PARA ORGANIZAR UNA SERIE DE OBJETOS PARECIDOS.
                        LOS OBJETOS DE UNA CLASE PUEDEN SER ORGANIZADOS DE NUEVO, REAGRUPADOS,
                        DE FORMAS DIFERENTES, FORMANDO AGRUPACIONES NUEVAS, POR SER RELEVANTES Y POR EL INTERES DE LA BD.
                      
                        CONCEPTO DE GENERALIZACIÓN O ESPECIALIZACIÓN:
                                - CADA UNA DE LAS AGRUPACIONES SON SUBCLASES DE UNA CLASE SUPERIOR.
                                - LA CLASE SUPERIOR COGE EL MANDATO DE SUPERCLASE DEL RESTO DE CLASES.
          
        
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
        
            DISTINTAS FORMAS DE CONSULTAR UN OBJETO:
                         
              * A PARTIR DE UNA ESTRUCTURA BÁSICA DE ' SELECT, FROM, WHERE ' COMO EN EL LENGUAJE SQL.
                         
                            SELECT c.name                         <---- DEVUELVE EL VALOR DEL ATRIBUTO 'name'
                            FROM c in cliente                     <---- DEL OBJETOS 'cliente'
                            WHERE c.department='e-commerce';      <---- CUYO ATRIBUTO 'department' SEA IGUAL A 'e-commerce'.
                         
              * UTILIZANDO VARIABLES DE TIPO 'ITERDOR', NO ES OBLIGATORIO QUE POSEA LA CLÁUSULA SELECT:
                SIMPLEMENTE NOMBRANDO CUALQUIER OBJETO, SE DEVOLVERÁN TODAS SUS EXISTENCIAS.
                         
                            C in Cliente              <---- ACCEDEMOS A TODOS LOS OBJETOS DE LA CLASE 'Cliente'.

                            Cliente C                 <---- ACCEDEMOS A TODOS LOS OBJETOS DE LA CLASE 'Cliente'.

                            Cliente as C              <---- ACCEDEMOS A TODOS LOS OBJETOS DE LA CLASE 'Cliente'.
                         
              * OTRA FORMA DE EXPRESAR UNA CONSULTA OQL COMIENZA CON EL NOMBRE DEL OBJETO PERSISTENTE Y, A CONTINUACIÓN,
                MEDIANTE UN PUNTO, NINGÚNO, UNO O VARIOS ATRIBUTOS.
                         
                            cliente.empresa           <---- DEVUELVE UN OBJETO DE TIPO 'Empresa', VINCULADO A ESE OBJETO 'cliente'.
                         
                            cliente.empresa.nombre    <---- SE ACCEDE AL ATRIBUTO 'nombre' DE LA 'empresa' ASOCIADA A ESE 'cliente'.
                         
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
                         
            VENTAJAS DE DESARROLLAR UNA APLICACIÓN ORIENTADA A OBJETOS CON UNA BASE DE DATOS ORIENTADA A OBJETOS:
                         
                    - CAPACIDAD MAYOR DE REALIZAR EL MODELADO.
                            - LOS OBJETOS ENCAPSULAN TANTO COMPORTAMIENTOS COMO ESTADOS.
                            - LAS RELACIONES DE UN OBJETO PUEDEN SER ALMACENADAS EN SU INTERIOR.
                            - AL AGRUPARSE, LOS OBJETOS FORMAN OBJETOS COMPLEJOS. ES EL CONCEPTO DE LA HERENCIA.
                         
                    - DISPONEMOS DE UNA FLEXIBILIDAD IMPORTANTE.
                            - PODREMOS CONSTRUIR NUEVOS OBJETOS CON TIPOLOGÍAS NUEVAS, PARTIENDO DE LOS QUE YA TENEMOS.
                            - SE REDUCE LA REDUNDANCIA. PODREMOS AGRUPAR CARECTERÍSTICAS O PROPIEDADES DE DISTINTAS CLASES EN UNA SUPERCLASE.
                            - LAS CLASES EXISTENTES U OBJETOS SON REUSABLES. MENOR TIEMPO DE DESARROLLO.
                         
                    - LENGUAJE EXPRESIVO DE CONSULTAS.
                            - SIMPLIFICA EL ACCESO NAVEGACIONAL ENTRE OBJETOS Y SUS HERENCIAS.
                            - FÁCIL DE NAVEGAR.
                         
                    - RENDIMIENTO MUY COMPETITIVO.
                            - EN APLICACIONES ORIENTADAS A OBJETOS,
                              EL RENDIMIENTO DE LAS BASES DE DATOS ORIENTADAS A OBJETOS ES SUPERIOR,
                              AL COMPARARLO CON UNA APLICACIÓN ORIENTADA A OBJETOS USANDO ORM, EL MAPEO OBJETO-RELACIONAL.
        
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
                         
            DESVENTAJAS DE DESARROLLAR UNA APLICACIÓN ORIENTADA A OBJETOS CON UNA BASE DE DATOS ORIENTADA A OBJETOS:
                         
                    - FALTA DE UN MODELO DE DATOS UNIVERSAL.
                            -NO EXISTE MODELO DE DATOS UNIVERSALMENTE ACEPTADO
                             Y A LA MAYORÍA DE LOS SISTEMAS GESTORES DE BASES DE DATOS ORIENTADOS A OBJETOS
                             LE FALTA UNA BUENA BASE TEÓRICA.
                         
                    - FALTA EXPERIENCIA.
                            - MADUREZ NO COMPARABLE CON LOS SISTEMAS DE BASES DE DATOS RELACIONALES.
                         
                    - FALTA DE ESTÁNDARES.
                            - NO EXISTE ESTÁNDARES DEFINIDOS COMO TAL.
                            - CADA FABRICANTE LOS CONSTRUYE A SU MANERA.
                         
                    - COMPETENCIA:
                            - COMPETENCIA DESIGUAL FRENTE A LOS SISTEMAS RELACIONALES E INCLUSO A LOS OBJETO-RELACIONALES.
                            - LA COMPETENCIA, TIENEN UN GRAN ESTÁNDAR APROBADO, SQL, UNA BASE TEÓRICA SÓLIDA,
                              Y UN GRAN CONJUNTO DE APLICACIONES DE SOPORTE ALREDEDOR DE ELLAS,
                              ASÍ COMO DE COMUNIDAD DE USUARIOS Y PROGRAMADORES.
                         
                    - LA ENCAPSULACIÓN:
                            - EL DESSARROLLO DE LOS OBJETOS DE FORMA ENCAPSULADA ES PRÁCTICAMENTE UNA OBLIGACIÓN,
                              YA QUE EN LA PRACTICA, ES LA FORMA EN LA QUE ACCEDEREMOS A LA BASE DE DATOS
                              MEDIANTE EL ENCAPSULADO Y EL SISTEMA DE CONSULTAS.
                         
                    - APROBACIÓN DE LA TEORÍA MATEMÁTICA:
                            - EL MODELO DE OBJETOS AÚN NO POSEE UNA APROBACIÓN EN RELACIÓN A LA TEORÍA MATEMÁTICA.
        
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
                         
            PROGRAMACIÓN DE APLICACIONES CON ACCESO OODB:
                         
            DISEÑO DE UNA API: INTERFAZ DE PROGRAMACIÓN DE APLICACIONES:
            API --> APPLICATION PROGRAMMING INTERFACE.
        
            LAS APIS DEFINEN LAS REGLAS A CUMPLIR, PARA CONSUMIR (CONSULTAR, OBTENER) FUNCIONALIDADES DE UN SISTEMA EXTERNO.
                    - HOY EN DÍA, API -> ESTÁ MUY ORIENTADO A LAS APLICACIONES WEB CON PATRON DE DISEÑO REST.
                         
            ¿QUÉ ES UN API?
                    - ES UNA FORMA DE DESCRIBIR LA FORMA EN QUE LOS PROGRAMAS O SITIOS WEBS INTERCAMBIAN DATOS.
                    - EL FORMATO DE INTERCAMBIO DE DATOS NORMALMENTE ES JSON O XML.
                         
            ¿QUÉ SIGNIFICA API REST?
                    - REST -> REPRESENTATIONAL STATE TRANSFER. ->  TRANSFERENCIA DE ESTADO REPRESENTACIONAL.
                    - ES UNA ARQUITECTURA DE DESARROLLO WEB QUE SE APOYA EN EL ESTÁNDAR HTTP. -> NAVEGACIÓN POR INTERNET.
                    - REST SE COMPONE DE UNA LISTA DE REGLAS QUE SE DEBEN CUMPLIR EN EL DISEÑO DE LA ARQUITECTURA DE UNA API.
          
            EL CASO DE UNA API EN TECNOLÍA O PATRÓN DE DISEÑO REST,
            UTILIZARÍA LOS 'EndPoints' DEFINIDOS EN LA ARQUITECTURA DEL PATRÓN DE DISEÑO REST:
                         
                    - 'EndPoints': PUERTAS DE ENTRADA AL CÓDIGO 'back' DE LA APLICACIÓN CON LA QUE HAY QUE CONECTAR AL SERVIDOR.
                    - EL SERVIDOR NOS DARÁ LAS FUNCIONALIDADES O SERVICIOS.
                    - ESAS FUNCIONALIDADES O SERVICIOS HAN DEBIDO SER DEFINIDAS Y ANALIZADAS,
                      PARA CUBRIR LA LÓGICA QUE EL 'back-end' PUEDA DEVOLVER A UN 'front-end'.
                    - SON MÉTODOS DEFINIDOS COMO ENTRADA PARA REALIZAR DICHAS FUNCIONALIDADES VINCULADAS POR UN 'PATH' QUE LOS DENOMINA.
                      'PATH' --> DE LA PÁGINA WEB A LA QUE SE CONECTA.
        
            EN NUESTRO CASO PARTIMOS DE UNA APLICACIÓN QUE ACCEDE A UNA BASE DE DATOS ORIENTADA A OBJETOS:
                    - ANALIZAR Y DISEÑAR UNA API EN LA CAPA DAO (DATA ACCESS OBJECT) CAPA DE LA APLICACIÓN DONDE ACCEDEMOS A LOS DATOS.
                    - DISEÑAR UNA INTERFAZ DE MÉTODOS PARA POBLAR DE TODAS LAS RESPUESTAS NECESARIAS EN CUANTO A DATOS SE REFIERE.
                            - ES DECIR: DEFINIR LOS 'EndPoints' QUE DAN COMO RESPUESTA EL OBJETO/S QUE SE VAN A DEVOLVER.
                                          
            EJEMPLO:
                    SI TENEMOS UNA APLICACIÓN DE GESTIÓN DE CLIENTES CON LAS FUNCIONALIDADES:
                            'crearCliente'
                            'modificarCliente'
                            'eliminarCliente'
                    EN LA API O INTERFAZ DE LA APLICACIÓN HABRÁ 3 'EndPoints'
                    QUE SERÁN LA PUERTA PRINCIPAL AL CÓDIGO 'back-end'.
        
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
                         
        *******************************************        *******************            ****************            ****************
        *                 BACK END                *        *    INTERFACE    *            *  FRONT END   *            *  CLIENT SIDE *
        *******************************************        *******************            ****************            ****************
                                                                                                           PETICIÓN 
                                                           ******************* PETICIÓN   ****************    AL      ****************
                                                           *                 * HTTP A UN  *              * FRONT-END  *              *
        *****************  PETICIÓN A LA APLICACIÓN        *        ********** MÉTODO DE  *              * DE NUESTRA *              *
        *               *  <--------------------------------------  * GET    * LA API     *  NO IMPORTA  *    APP     *              *
        *               *         *****************        *        ********** <--------- *     EL       * <--------- *              *
        *               *  ---->  *               *        *        * POST   *            *  FRAMEWORK   *            *              *
        *  APPLICATION  *         *   DATABASE    *        *   API  **********            * O TECNOLOGÍA *            *    CLIENT    *
        *               *  <----  *               *        *        * PUT    *            *  CON LA QUE  *            *              *
        *               *         *****************        *        ********** ---------> *  PRESENTEMOS * ---------> *              *
        *               *                                  *        * DELETE * RESPUESTA  *              *     EL     *              *
        *               *  ------------------------------> *        ********** DE LA API  *              * FRONT-END  *              *
        *****************  RESPUESTA DE LA APLICACIÓN      *                 * A NUESTRA  *              *  PRESENTA  *              *
                                                           ******************* PETICIÓN   ****************     LA     ****************
                                                                                                        RESPUESTA DE LA API
                                                                                                          A LA PETICIÓN                 
                         
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
                case "12" -> {
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