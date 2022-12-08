package Tema_09;

import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_09 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        *******************************************************************************************************************************
        *  TEMA 09                                       BASES DE DATOS ORIENTADAS A OBJETOS.                                         *
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
        *  CARACTERÍSTICAS:                                                                                                           *
        *         - PROPORCIONARÁ EL SISTEMA UN IDENTIFICADOR ÚNICO A CADA OBJETO.                                                    *
        *         - RELACIÓN DIRECTA AL MUNDO REAL. (MANTIENEN IDENTIDAD E INTEGRIDAD).                                               *
        *         - FÁCILES DE EXTENDER. AÑADIR DATOS Y REALIZAR OPERACIONES.                                                         *
        *         - PROPORCIONAN ENCAPSULACIÓN. LA INFORMACIÓN Y LAS IMPLEMENTACIONES PUEDEN OCULTAR LAS ENTIDADES EXTERNAS.          *
        *         - PROPORCIONAN HERENCIA. DEFINIR UNA CLASE A PARTIR DE OTRA. REUTILIZACIÓN DE CÓDIGO.                               *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  LAS OODBMS, IGUAL QUE LOS RDBMS, HARÁN USO DE TRANSACCIONES:                                                               *
        *  UNA TRANSACCIÓN ES UN CONJUNTO DE SENTENCIAS QUE FORMARÁN UNA UNIDAD DE TRABAJO.                                           *
        *         - TENDRÁN -> ATOMICIDAD, CONSISTENCIA Y AISLAMIENTO.                                                                *
        *                                                                                                                             *
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
        *  CARACTERÍSTICAS GENÉRICAS DE UN DBMS:                                                                                      *
        *         - CONCURRENCIA.                      -> DIFERENTES USUARIOS ACCEDIENDO A LA VEZ A LA BD.                            *
        *         - PERSISTENCIA.                      -> LA INFORMACIÓN TIENE QUE ESTAR DISPONIBLE DESPUÉS DE REINICAR LA BD.        *
        *         - RECUPERACIÓN DE ERRORES.                                                                                          *
        *         - GESTIÓN DE ALMACENAMIENTO.                                                                                        *
        *         - CONSULTAS.                                                                                                        *
        *                                                                                                                             *
        *  UN OODBMS AÑADE ADEMÁS:                                                                                                    *
        *         - ABSTRACCIÓN.                        -> DEFINIR LAS CARACTERÍSTICAS ESPECÍFICAS DEL OBJETO.                        *
        *         - MODULARIDAD.                        -> PERMITIR DIVIDIR UN PROBLEMA EN OTROS MÁS PEQUÑOS. AGRUPAR, DISTINGUIR.    *
        *         - JERARQUÍA.                          -> DISTINTAS CATEGORÍAS DE OBJETOS. HEREDAN UNAS CLASES DE OTRAS.             *
        *         - ENCAPSULACIÓN.                      -> COHESIÓN EN LOS DATOS QUE FORMAN UN OBJETO.                                *
        *         - TIPOLOGÍA DE OBJETOS.               -> PODREMOS TRABAJAR CON DISTINTOS TIPOS DE OBJETOS.                          *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  UN OODBMS:                                                                                                                 *
        *         - SE FORMA CON UN SISTEMA GESTOR DE ALMACENAMIENTO QUE SOPORTE MODELADO Y CREACIÓN DE DATOS -> COMO OBJETOS.        *
        *         - PERMITE CONCURRENCIA Y LA RECUPERACIÓN DE UNA MANERA EFICIENTE.                                                   *
        *         - NO HAY QUE TRADUCIR FILAS Y COLUMNAS, SINO QUE MANIPULA OBJETOS.                                                  *
        *         - POSEE DATOS RELACIONADOS ENTRE SÍ Y UNA APLICACIÓN/ES RODEANDO DICHA BD CON ACCESO A ELLA.                        *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  LENGUAJE DE CONSULTAS PARA OBJETOS:    OQL  ->  OBJECT QUERY LANGUAGE                                                      *
        *         - LENGUAJE DECLARATIVO DE TIPOLOGÍA SQL.                                                                            *
        *         - PERMITE REALIZAR CONSULTAS A BD ORIENTADAS A OBJETOS Y A SUS ESTRUCTURAS.                                         *
        *         - NO CONTIENE PRIMITIVAS PARA MODIFICAR EL ESTADO DE LOS OBJETOS. ESO SE HARÁ A TRAVÉS DE SUS PROPIOS MÉTODOS       *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  AGREGACIÓN VS ASOCIACIÓN:                                                                                                  *
        *         - LA AGREGACIÓN ES UN TIPO ESPECÍFICO Y DIFERENTE DE LA ASOCIACIÓN.                                                 *
        *         - CUANDO SE BORRA UN OBJETO DE UNA ASOCIACIÓN             --> EL RESTO DE OBJETOS RELACIONADOS A ÉL PERSISTE.       *
        *         - CUANDO SE INSERTA O ELIMINA UN OBJETO DE UNA AGREGACIÓN --> EL RESTO SON AFECTADOS IGUALMENTE.                    *
        *                                                                                                                             *
        *  UN OBJETO QUE PERTENECE A OTRO NO PUEDE SER INTRODUCIDO O BORRADO DE FORMA AISLADA EN LA BD.                               *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  ESPECIALIZACIÓN, GENERALIZACIÓN Y HERENCIA:                                                                                *
        *         - NOS PERMITEN DEFINIR UNA CLASE PARA ORGANIZAR UNA SERIE DE OBJETOS PARECIDOS.                                     *
        *         - LOS OBJETOS DE UNA CLASE PUEDEN SER REAGRUPADOS DE FORMAS DIFERENTES POR EL INTERES DE LA BD.                     *
        *                                                                                                                             *
        *         CONCEPTO DE GENERALIZACIÓN O ESPECIALIZACIÓN:                                                                       *
        *                 - CADA AGRUPACIÓN SON SUBCLASES DE UNA SUPERIOR.                                                            *
        *                 - LA CLASE SUPERIOR COGE EL MANDATO DE SUPERCLASE DEL RESTO DE CLASES.                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  VENTAJAS EN LA UTILIZACIÓN DE OODB:                                                                                        *
        *         - CAPACIDAD MAYOR DE REALIZAR EL MODELADO.                                                                          *
        *                 - LOS OBJETOS ENCAPSULAN TANTO COMPORTAMIENTOS COMO ESTADOS.                                                *
        *                 - LAS RELACIONES DE UN OBJETO PUEDEN SER ALMACENADAS EN SU INTERIOR.                                        *
        *                 - AL AGRUPARSE, LOS OBJETOS FORMAN OBJETOS COMPLEJOS. ES EL CONCEPTO DE LA HERENCIA.                        *
        *         - DISPONEMOS DE UNA FLEXIBILIDAD IMPORTANTE.                                                                        *
        *                 - PODREMOS CONSTRUIR NUEVOS OBJETOS CON TIPOLOGÍAS NUEVAS, PARTIENDO DE LOS QUE YA TENEMOS.                 *
        *                 - SE REDUCE LA REDUNDANCIA. AGRUPAR CARECTERÍSTICAS O PROPIEDADES DE DISTINTAS CLASES EN UNA SUPERCLASE.    *
        *                 - LAS CLASES EXISTENTES U OBJETOS SON REUSABLES. MENOR TIEMPO DE DESARROLLO.                                *
        *         - LENGUAJE EXPRESIVO DE CONSULTAS. ACCESO NAVEGACIONAL ENTRE OBJETOS Y SUS HERENCIAS. FÁCIL DE NAVEGAR.             *
        *         - RENDIMIENTO MUY COMPETITIVO.                                                                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  DESVENTAJAS EN LA UTILIZACIÓN DE OODB:                                                                                     *
        *         - FALTA DE UN MODELO DE DATOS UNIVERSAL. LE FALTA UNA BUENA BASE TEÓRICA.                                           *
        *         - FALTA EXPERIENCIA.                                                                                                *
        *         - FALTA DE ESTÁNDARES.                                                                                              *
        *         - COMPETENCIA DESIGUAL FRENTE A LOS SISTEMAS RELACIONALES.                                                          *
        *         - LA ENCAPSULACIÓN COMO FORMA OBLIGADA DE REALIZAR CONSULTAS.                                                       *
        *         - EL MODELO DE OBJETOS AÚN NO POSEE UNA APROBACIÓN EN RELACIÓN A LA TEORÍA MATEMÁTICA.                              *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  PROGRAMACIÓN DE APLICACIONES CON ACCESO OODB: DISEÑO DE UNA API: INTERFAZ DE PROGRAMACIÓN DE APLICACIONES:                 *
        *                                                                                                                             *
        *  LAS APIS DEFINEN LAS REGLAS A CUMPLIR, PARA CONSUMIR (CONSULTAR, OBTENER) FUNCIONALIDADES DE UN SISTEMA EXTERNO.           *
        *         - HOY EN DÍA, API -> ESTÁ MUY ORIENTADO A LAS APLICACIONES WEB CON PATRON DE DISEÑO REST.                           *
        *  ¿QUÉ ES UN API?                                                                                                            *
        *         - ES UNA FORMA DE DESCRIBIR LA FORMA EN QUE LOS PROGRAMAS O SITIOS WEBS INTERCAMBIAN DATOS.                         *
        *         - EL FORMATO DE INTERCAMBIO DE DATOS NORMALMENTE ES JSON O XML.                                                     *
        *  ¿QUÉ SIGNIFICA API REST?                                                                                                   *
        *         - REST -> REPRESENTATIONAL STATE TRANSFER. ->  TRANSFERENCIA DE ESTADO REPRESENTACIONAL.                            *
        *         - ES UNA ARQUITECTURA DE DESARROLLO WEB QUE SE APOYA EN EL ESTÁNDAR HTTP. -> NAVEGACIÓN POR INTERNET.               *
        *         - REST SE COMPONE DE UNA LISTA DE REGLAS QUE SE DEBEN CUMPLIR EN EL DISEÑO DE LA ARQUITECTURA DE UNA API.           *
        *                                                                                                                             *
        *  EL CASO DE UNA API EN TECNOLÍA O PATRÓN DE DISEÑO REST, UTILIZARÍA LOS ENDPOINTS DEFINIDOS EN LA ARQUITECTURA REST.        *
        *         - ENDPOINTS: PUERTAS DE ENTRADA AL CÓDIGO BACK DE LA APLICACIÓN CON LA QUE HAY QUE CONECTAR AL SERVIDOR.            *
        *         - EL SERVIDOR NOS DARÁ LAS FUNCIONALIDADES O SERVICIOS.                                                             *
        *         - ESAS FUNC. O SERV. HAN DEBIDO SER DEFINIDAS Y ANALIZADAS, PARA QUE EL BACK-END PUEDA DEVOLVER AL FRONT-END.       *
        *         - SON MÉTODOS DEFINIDOS COMO ENTRADA PARA REALIZAR DICHAS FUNCIONALIDADES VINCULADAS POR UN PATH QUE LOS DENOMINA.  *
        *                                                                                                                             *
        *  EN NUESTRO CASO PARTIMOS DE UNA APLICACIÓN QUE ACCEDE A UNA BASE DE DATOS ORIENTADA A OBJETOS:                             *
        *         - ANALIZAR Y DISEÑAR UNA API EN LA CAPA DAO (DATA ACCESS OBJECT) CAPA DE LA APLICACIÓN DONDE ACCEDEMOS A LOS DATOS. *
        *         - DISEÑAR UNA INTERFAZ DE MÉTODOS PARA POBLAR DE TODAS LAS RESPUESTAS NECESARIAS EN CUANTO A DATOS SE REFIERE.      *
        *                  - ES DECIR: DEFINIR LOS ENDPOINTS QUE DAN COMO RESPUESTA EL OBJETO/S QUE SE VAN A DEVOLVER.                *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  0. SALIR.                                                                                                                  *
        *******************************************************************************************************************************

                               """);
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