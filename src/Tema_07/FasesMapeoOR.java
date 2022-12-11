package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class FasesMapeoOR {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 07                                     EL MAPEO OBJETO RELACIONAL  
********************************************************************************************************************
*                                          FASES DE MAPEO OBJETO RELACIONAL.
********************************************************************************************************************
                               
                        **********************************************************************
                        *           DENTRO DE LA APLICACI�N           *        EXTERNA       *
                        **********************************************************************
                        *        FASE 1        *        FASE 2        *        FASE 3        *
                        *----------------------*----------------------*----------------------*
                        *   CAPA DE SERVICIO   *      OBJECT GRID     *                      *
                        *         POJO         *      JPA LOADER      *                      *
                        *       ENTIDADES      *  ARCHIVO ASIGNACI�N  *         BDD          *
                        *         DAO          *     JPA PROVIDER     *                      *
                        *                      *        MAPPING       *                      *
                        **********************************************************************

    - FASE 1:
           - CENTRADA EN LOS DATOS DEL OBJETO Y DE TODO EL MODELO DE OBJETOS.
           - POJO -> PLAIN OLD JAVA OBJECT
           - CLASES SIMPLES DE JAVA Y CLASES DE IMPLEMENTACI�N, CON SUS DTO (DIAGRAMAS DE ESTADO), ETC...
           - CLASES E INTERFACES CON SU CORRESPONDIENTE CAPA DE NEGOCIO DE CADA APLICATIVO.
                   - LLAMADA CAPA DE SERVICIO
                   - ESTAR�N TAMBI�N LAS CLASES DAO --> CLASES DE ACCESO A DATOS. --> DATA ACCESS OBJECT.
           - CLASES ORIENTADAS A CAPA DE DATOS: M�TODOS COMO:
                   - crearObjeto()
                   - encontrarObjeto()
                   - borrarObjeto()
                   - ETC...            
                        
    - FASE 2:
           - LLAMADA FASE DE PERSISTENCIA O MAPEO.
           - PROVEEDOR JPA: PROVEEDOR DE ACCESO A DATOS DE JAVA:
                   - LIBRER�A QUE HACE POSIBLE TODA LA FUNCIONALIDAD DE JPA:  --> javax.persistence
           - ARCHIVOS DE ASIGNACI�N: FICHERO XML DONDE SE ALMACENA LA CONFIGURACI�N DE LA ASIGNACI�N
             DE LOS DATOS DE UNA CLASE JAVA POJO Y LOS DATOS REALES DE LA BASE DE DATOS RELACIONAL.
                   - EL MAPEO DEBE RECOGER LA ESTRUCTURA DE LA BASE DE DATOS,
                     CON LOS NOMBRES EXASTOS QUE TENGAN LAS TABLAS, Y SUS CAMPOS, EN LA BASE DE DATOS.
           - JPA CARGADOR: MEMORIA CACH� CON LOS DATOS DE LA BASE DE DATOS PROPORCIONANDO 'UNA COPIA EN MEMORIA RAM';
             PARA REALIZAR INTERACCIONES R�PIDAS CON LAS CLASES DE SERVICIO.
           - REJA DE OBJETO: DONDE SE ALMACENAN TEMPORALMENTE 'LA COPIA EN MEMORIA RAM'
             DE LOS DATOS DE MUESTRA DE BASE DE DATOS RELACIONAL.
             LLAMADA 'OBJETO GRID' POR LO QUE TODAS LAS CONSULTAS PASAR�N POR ESTE PUNTO,
             Y UNA VEZ REALIZADAS LAS VERIFICACIONES PASAR� A LA BASE DE DATOS PRINCIPAL.
                               
    - FASE 3:
           - LLAMADA FASE DE DATOS RELACIONALES.
           - UNA VEZ PASADA LA REJA DE OBJETOS Y TODO HA IDO BIEN, SE IR� DIRECTAMENTE A BD.
           - HASTA ENTONCES, COMO HEMOS MENCIONADO, PERMANECER� TEMPORALMENTE EN LA CACH�.  
                               
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