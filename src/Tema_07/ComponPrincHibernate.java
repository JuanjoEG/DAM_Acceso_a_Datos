package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class ComponPrincHibernate {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 07                                     EL MAPEO OBJETO RELACIONAL  
********************************************************************************************************************
*                                         COMPONENTES PRINCIPALES DE HIBERNATE.
********************************************************************************************************************

    -  SessionFactory Object  --> NOS PERMITE USAR OBJETOS TIPO Session  (UNO POR CADA BDD)           INSTANCIAR LA SESI�N
                               
             - ES EL QUE SE PERMITIR� EL USO DE OBJETOS DE TIPO Session.
             - ESTE OBJETO JAVA SE PUEDE INSTANCIAR DE DIFERENTES FORMAS:
                    - NORMALMENTE COGE LA CONFIGURACI�N DEL FICHERO DE CONFIGURACI�N POR DEFECTO.
             - UTILIZAREMOS UN OBJETO SessionFactory POR CADA BASE DE DATOS QUE TENGAMOS EN LA APLICACI�N.
                               
    -  Session Object         --> NOS PERMITE INSTANCIAR UNA CONEXI�N DIRECTA A LA BDD RELACIONAL   INSTANCIAR LA CONEXI�N
                               
             - UTILIZAREMOS DICHO OBJETO PARA INSTANCIAR UNA CONEXI�N DIRECTA CON NUESTRA BASE DE DATOS RELACIONAL.
             - ES UN OBJETO NO MUY PESADO Y SU FUNCI�N PRINCIPAL ES INTERACTUAR CON LA BASE DE DATOS.
             - ESTE TIPO DE OBJETOS NO DEBEN PERMANECER ABIERTOS MUCHO TIEMPO POR TEMAS DE SEGURIDAD.
                               
    -  Transaction Object     --> NOS PERMITE MANEJAR TRANSACCTI�N --> ENTRE COMMIT Y COMMIT (OPCIONAL)
                               
             - MANEJA LAS TRANSACCIONES DIRECTAMENTE CON LAS BASES DE DATOS RELACIONALES.
             - ES UN OBJETO OPCIONAL: SI NO SE QUIERE HACER USO DE �L, 
               PODEMOS INDICAR MANUALMENTE AQUELLOS BLOQUES QUE QUEREMOS SEAN TRANSACCIONALES.
                    - RECORDEMOS LA DEFINICI�N DE TRANSACCI�N, ORIENTADA A BLOQUE DE OPERACI�N/ES:
                      PERSISTIR TODAS Y CADA UNA DE LAS OPERACIONES DEL BLOQUE, 
                      O POR EL CONTRARIO, REALIZAR ROLLBACK (MARCHA ATR�S) EN DICHA OPERACI�N.
                               
    -  Query Object           --> NOS PERMITE HACER CONSULTAS SQL Y HQL                          EJECUTAR LAS INSTRUCCIONE
                               
             - EN HIBERNATE DISPONEMOS DE VARIAS FORMAS DE REALIZAR CONSULTAS A LA BASE DE DATOS.
             - ESTE TIPO DE OBJETOS UTILIZAN CONSULTAS DE TIPO SQL O DE TIPO HIBERNATE QUERY (HQL).
             - CON ESTE TIPO DE OBJETOS ENLAZAREMOS LOS DISTINTOS PAR�METROS DE NUESTRA CONSULTA, TAMBI�N
               PODREMOS REALIZAR CIERTAS RESTRICCIONES COMO CONTROLAR EL N�MERO DE RESULTADOS, Y EJECUTAR LA CONSULTA.
             - ES UN MODO DE REALIZAR CONSULTAS MUCHO M�S DIN�MICO QUE LAS CONSULTAS NATIVAS.
                               
    -  Criteria Object        --> NOS PERMITE HACER CONSULTAS JAVA                                  FILTRAR USANDO OBJETOS 
                               
             - DESAPARECER� EL LENGUAJE NATIVO DE SQL PARA DAR PASO A LAS CONSULTAS POR MEDIO DE OBJETOS JAVA,
               Y POR MEDIO DE LAS FUNCIONES QUE NOS OFRECE HIBERNATE, QUE M�S TARDE SER�M TRADUCIDAS A SENTENCIAS SQL.
                               
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