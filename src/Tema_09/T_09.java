package Tema_09;

import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
        *  API    -> INTERFAZ DE PROGRAMACI�N DE APLICACIONES             -> APPLICATION PROGRAMMING INTERFACE                        *
        *  REST   -> TRANSFERENCIA DE ESTADO REPRESENTACIONAL             -> REPRESENTATIONAL STATE TRANSFER.                         *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  CARACTER�STICAS:                                                                                                           *
        *         - PROPORCIONAR� EL SISTEMA UN IDENTIFICADOR �NICO A CADA OBJETO.                                                    *
        *         - RELACI�N DIRECTA AL MUNDO REAL. (MANTIENEN IDENTIDAD E INTEGRIDAD).                                               *
        *         - F�CILES DE EXTENDER. A�ADIR DATOS Y REALIZAR OPERACIONES.                                                         *
        *         - PROPORCIONAN ENCAPSULACI�N. LA INFORMACI�N Y LAS IMPLEMENTACIONES PUEDEN OCULTAR LAS ENTIDADES EXTERNAS.          *
        *         - PROPORCIONAN HERENCIA. DEFINIR UNA CLASE A PARTIR DE OTRA. REUTILIZACI�N DE C�DIGO.                               *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  LAS OODBMS, IGUAL QUE LOS RDBMS, HAR�N USO DE TRANSACCIONES:                                                               *
        *  UNA TRANSACCI�N ES UN CONJUNTO DE SENTENCIAS QUE FORMAR�N UNA UNIDAD DE TRABAJO.                                           *
        *         - TENDR�N -> ATOMICIDAD, CONSISTENCIA Y AISLAMIENTO.                                                                *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  LOS OBJETOS DISPONEN DE:                                                                                                   *
        *         - ATRIBUTOS. - CARACTERISTICAS DE LOS OBJETOS. VARIABLES DE INSTANCIA.                                              *
        *                      - ESTADO DE UN OBJETO. SE DETERMINA POR LOS VALORES DE SUS ATRIBUTOS EN UN MOMENTO DETERMINADO.        *
        *         - OBJETO.    - ES LA REPRESENTACI�N ABSTRACTA DE UNA ENTIDAD EN EL MUNDO REAL.                                      *
        *                      - TIENE LA CAPACIDAD DE INTERACTUAR CON OTROS OBJETOS.                                                 *
        *         - IDENTIDAD. - ES UN IDENTIFICADOR EXTERNO. SE MANTIENE POR CADA OBJETO.                                            *
        *                      - ES UN ID DEL OBJETO PUESTO POR EL SISTEMA AL SER CREADO. NO SE PUEDE CAMBIAR.                        *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  CARACTER�STICAS GEN�RICAS DE UN DBMS:                                                                                      *
        *         - CONCURRENCIA.                      -> DIFERENTES USUARIOS ACCEDIENDO A LA VEZ A LA BD.                            *
        *         - PERSISTENCIA.                      -> LA INFORMACI�N TIENE QUE ESTAR DISPONIBLE DESPU�S DE REINICAR LA BD.        *
        *         - RECUPERACI�N DE ERRORES.                                                                                          *
        *         - GESTI�N DE ALMACENAMIENTO.                                                                                        *
        *         - CONSULTAS.                                                                                                        *
        *                                                                                                                             *
        *  UN OODBMS A�ADE ADEM�S:                                                                                                    *
        *         - ABSTRACCI�N.                        -> DEFINIR LAS CARACTER�STICAS ESPEC�FICAS DEL OBJETO.                        *
        *         - MODULARIDAD.                        -> PERMITIR DIVIDIR UN PROBLEMA EN OTROS M�S PEQU�OS. AGRUPAR, DISTINGUIR.    *
        *         - JERARQU�A.                          -> DISTINTAS CATEGOR�AS DE OBJETOS. HEREDAN UNAS CLASES DE OTRAS.             *
        *         - ENCAPSULACI�N.                      -> COHESI�N EN LOS DATOS QUE FORMAN UN OBJETO.                                *
        *         - TIPOLOG�A DE OBJETOS.               -> PODREMOS TRABAJAR CON DISTINTOS TIPOS DE OBJETOS.                          *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  UN OODBMS:                                                                                                                 *
        *         - SE FORMA CON UN SISTEMA GESTOR DE ALMACENAMIENTO QUE SOPORTE MODELADO Y CREACI�N DE DATOS -> COMO OBJETOS.        *
        *         - PERMITE CONCURRENCIA Y LA RECUPERACI�N DE UNA MANERA EFICIENTE.                                                   *
        *         - NO HAY QUE TRADUCIR FILAS Y COLUMNAS, SINO QUE MANIPULA OBJETOS.                                                  *
        *         - POSEE DATOS RELACIONADOS ENTRE S� Y UNA APLICACI�N/ES RODEANDO DICHA BD CON ACCESO A ELLA.                        *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  LENGUAJE DE CONSULTAS PARA OBJETOS:    OQL  ->  OBJECT QUERY LANGUAGE                                                      *
        *         - LENGUAJE DECLARATIVO DE TIPOLOG�A SQL.                                                                            *
        *         - PERMITE REALIZAR CONSULTAS A BD ORIENTADAS A OBJETOS Y A SUS ESTRUCTURAS.                                         *
        *         - NO CONTIENE PRIMITIVAS PARA MODIFICAR EL ESTADO DE LOS OBJETOS. ESO SE HAR� A TRAV�S DE SUS PROPIOS M�TODOS       *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  AGREGACI�N VS ASOCIACI�N:                                                                                                  *
        *         - LA AGREGACI�N ES UN TIPO ESPEC�FICO Y DIFERENTE DE LA ASOCIACI�N.                                                 *
        *         - CUANDO SE BORRA UN OBJETO DE UNA ASOCIACI�N             --> EL RESTO DE OBJETOS RELACIONADOS A �L PERSISTE.       *
        *         - CUANDO SE INSERTA O ELIMINA UN OBJETO DE UNA AGREGACI�N --> EL RESTO SON AFECTADOS IGUALMENTE.                    *
        *                                                                                                                             *
        *  UN OBJETO QUE PERTENECE A OTRO NO PUEDE SER INTRODUCIDO O BORRADO DE FORMA AISLADA EN LA BD.                               *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  ESPECIALIZACI�N, GENERALIZACI�N Y HERENCIA:                                                                                *
        *         - NOS PERMITEN DEFINIR UNA CLASE PARA ORGANIZAR UNA SERIE DE OBJETOS PARECIDOS.                                     *
        *         - LOS OBJETOS DE UNA CLASE PUEDEN SER REAGRUPADOS DE FORMAS DIFERENTES POR EL INTERES DE LA BD.                     *
        *                                                                                                                             *
        *         CONCEPTO DE GENERALIZACI�N O ESPECIALIZACI�N:                                                                       *
        *                 - CADA AGRUPACI�N SON SUBCLASES DE UNA SUPERIOR.                                                            *
        *                 - LA CLASE SUPERIOR COGE EL MANDATO DE SUPERCLASE DEL RESTO DE CLASES.                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  VENTAJAS EN LA UTILIZACI�N DE OODB:                                                                                        *
        *         - CAPACIDAD MAYOR DE REALIZAR EL MODELADO.                                                                          *
        *                 - LOS OBJETOS ENCAPSULAN TANTO COMPORTAMIENTOS COMO ESTADOS.                                                *
        *                 - LAS RELACIONES DE UN OBJETO PUEDEN SER ALMACENADAS EN SU INTERIOR.                                        *
        *                 - AL AGRUPARSE, LOS OBJETOS FORMAN OBJETOS COMPLEJOS. ES EL CONCEPTO DE LA HERENCIA.                        *
        *         - DISPONEMOS DE UNA FLEXIBILIDAD IMPORTANTE.                                                                        *
        *                 - PODREMOS CONSTRUIR NUEVOS OBJETOS CON TIPOLOG�AS NUEVAS, PARTIENDO DE LOS QUE YA TENEMOS.                 *
        *                 - SE REDUCE LA REDUNDANCIA. AGRUPAR CARECTER�STICAS O PROPIEDADES DE DISTINTAS CLASES EN UNA SUPERCLASE.    *
        *                 - LAS CLASES EXISTENTES U OBJETOS SON REUSABLES. MENOR TIEMPO DE DESARROLLO.                                *
        *         - LENGUAJE EXPRESIVO DE CONSULTAS. ACCESO NAVEGACIONAL ENTRE OBJETOS Y SUS HERENCIAS. F�CIL DE NAVEGAR.             *
        *         - RENDIMIENTO MUY COMPETITIVO.                                                                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  DESVENTAJAS EN LA UTILIZACI�N DE OODB:                                                                                     *
        *         - FALTA DE UN MODELO DE DATOS UNIVERSAL. LE FALTA UNA BUENA BASE TE�RICA.                                           *
        *         - FALTA EXPERIENCIA.                                                                                                *
        *         - FALTA DE EST�NDARES.                                                                                              *
        *         - COMPETENCIA DESIGUAL FRENTE A LOS SISTEMAS RELACIONALES.                                                          *
        *         - LA ENCAPSULACI�N COMO FORMA OBLIGADA DE REALIZAR CONSULTAS.                                                       *
        *         - EL MODELO DE OBJETOS A�N NO POSEE UNA APROBACI�N EN RELACI�N A LA TEOR�A MATEM�TICA.                              *
        *                                                                                                                             *
        *******************************************************************************************************************************
        *  PROGRAMACI�N DE APLICACIONES CON ACCESO OODB: DISE�O DE UNA API: INTERFAZ DE PROGRAMACI�N DE APLICACIONES:                 *
        *                                                                                                                             *
        *  LAS APIS DEFINEN LAS REGLAS A CUMPLIR, PARA CONSUMIR (CONSULTAR, OBTENER) FUNCIONALIDADES DE UN SISTEMA EXTERNO.           *
        *         - HOY EN D�A, API -> EST� MUY ORIENTADO A LAS APLICACIONES WEB CON PATRON DE DISE�O REST.                           *
        *  �QU� ES UN API?                                                                                                            *
        *         - ES UNA FORMA DE DESCRIBIR LA FORMA EN QUE LOS PROGRAMAS O SITIOS WEBS INTERCAMBIAN DATOS.                         *
        *         - EL FORMATO DE INTERCAMBIO DE DATOS NORMALMENTE ES JSON O XML.                                                     *
        *  �QU� SIGNIFICA API REST?                                                                                                   *
        *         - REST -> REPRESENTATIONAL STATE TRANSFER. ->  TRANSFERENCIA DE ESTADO REPRESENTACIONAL.                            *
        *         - ES UNA ARQUITECTURA DE DESARROLLO WEB QUE SE APOYA EN EL EST�NDAR HTTP. -> NAVEGACI�N POR INTERNET.               *
        *         - REST SE COMPONE DE UNA LISTA DE REGLAS QUE SE DEBEN CUMPLIR EN EL DISE�O DE LA ARQUITECTURA DE UNA API.           *
        *                                                                                                                             *
        *  EL CASO DE UNA API EN TECNOL�A O PATR�N DE DISE�O REST, UTILIZAR�A LOS ENDPOINTS DEFINIDOS EN LA ARQUITECTURA REST.        *
        *         - ENDPOINTS: PUERTAS DE ENTRADA AL C�DIGO BACK DE LA APLICACI�N CON LA QUE HAY QUE CONECTAR AL SERVIDOR.            *
        *         - EL SERVIDOR NOS DAR� LAS FUNCIONALIDADES O SERVICIOS.                                                             *
        *         - ESAS FUNC. O SERV. HAN DEBIDO SER DEFINIDAS Y ANALIZADAS, PARA QUE EL BACK-END PUEDA DEVOLVER AL FRONT-END.       *
        *         - SON M�TODOS DEFINIDOS COMO ENTRADA PARA REALIZAR DICHAS FUNCIONALIDADES VINCULADAS POR UN PATH QUE LOS DENOMINA.  *
        *                                                                                                                             *
        *  EN NUESTRO CASO PARTIMOS DE UNA APLICACI�N QUE ACCEDE A UNA BASE DE DATOS ORIENTADA A OBJETOS:                             *
        *         - ANALIZAR Y DISE�AR UNA API EN LA CAPA DAO (DATA ACCESS OBJECT) CAPA DE LA APLICACI�N DONDE ACCEDEMOS A LOS DATOS. *
        *         - DISE�AR UNA INTERFAZ DE M�TODOS PARA POBLAR DE TODAS LAS RESPUESTAS NECESARIAS EN CUANTO A DATOS SE REFIERE.      *
        *                  - ES DECIR: DEFINIR LOS ENDPOINTS QUE DAN COMO RESPUESTA EL OBJETO/S QUE SE VAN A DEVOLVER.                *
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