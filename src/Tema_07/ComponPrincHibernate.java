package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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

    -  SessionFactory Object  --> NOS PERMITE USAR OBJETOS TIPO Session  (UNO POR CADA BDD)           INSTANCIAR LA SESIÓN
                               
             - ES EL QUE SE PERMITIRÁ EL USO DE OBJETOS DE TIPO Session.
             - ESTE OBJETO JAVA SE PUEDE INSTANCIAR DE DIFERENTES FORMAS:
                    - NORMALMENTE COGE LA CONFIGURACIÓN DEL FICHERO DE CONFIGURACIÓN POR DEFECTO.
             - UTILIZAREMOS UN OBJETO SessionFactory POR CADA BASE DE DATOS QUE TENGAMOS EN LA APLICACIÓN.
                               
    -  Session Object         --> NOS PERMITE INSTANCIAR UNA CONEXIÓN DIRECTA A LA BDD RELACIONAL   INSTANCIAR LA CONEXIÓN
                               
             - UTILIZAREMOS DICHO OBJETO PARA INSTANCIAR UNA CONEXIÓN DIRECTA CON NUESTRA BASE DE DATOS RELACIONAL.
             - ES UN OBJETO NO MUY PESADO Y SU FUNCIÓN PRINCIPAL ES INTERACTUAR CON LA BASE DE DATOS.
             - ESTE TIPO DE OBJETOS NO DEBEN PERMANECER ABIERTOS MUCHO TIEMPO POR TEMAS DE SEGURIDAD.
                               
    -  Transaction Object     --> NOS PERMITE MANEJAR TRANSACCTIÓN --> ENTRE COMMIT Y COMMIT (OPCIONAL)
                               
             - MANEJA LAS TRANSACCIONES DIRECTAMENTE CON LAS BASES DE DATOS RELACIONALES.
             - ES UN OBJETO OPCIONAL: SI NO SE QUIERE HACER USO DE ÉL, 
               PODEMOS INDICAR MANUALMENTE AQUELLOS BLOQUES QUE QUEREMOS SEAN TRANSACCIONALES.
                    - RECORDEMOS LA DEFINICIÓN DE TRANSACCIÓN, ORIENTADA A BLOQUE DE OPERACIÓN/ES:
                      PERSISTIR TODAS Y CADA UNA DE LAS OPERACIONES DEL BLOQUE, 
                      O POR EL CONTRARIO, REALIZAR ROLLBACK (MARCHA ATRÁS) EN DICHA OPERACIÓN.
                               
    -  Query Object           --> NOS PERMITE HACER CONSULTAS SQL Y HQL                          EJECUTAR LAS INSTRUCCIONE
                               
             - EN HIBERNATE DISPONEMOS DE VARIAS FORMAS DE REALIZAR CONSULTAS A LA BASE DE DATOS.
             - ESTE TIPO DE OBJETOS UTILIZAN CONSULTAS DE TIPO SQL O DE TIPO HIBERNATE QUERY (HQL).
             - CON ESTE TIPO DE OBJETOS ENLAZAREMOS LOS DISTINTOS PARÁMETROS DE NUESTRA CONSULTA, TAMBIÉN
               PODREMOS REALIZAR CIERTAS RESTRICCIONES COMO CONTROLAR EL NÚMERO DE RESULTADOS, Y EJECUTAR LA CONSULTA.
             - ES UN MODO DE REALIZAR CONSULTAS MUCHO MÁS DINÁMICO QUE LAS CONSULTAS NATIVAS.
                               
    -  Criteria Object        --> NOS PERMITE HACER CONSULTAS JAVA                                  FILTRAR USANDO OBJETOS 
                               
             - DESAPARECERÁ EL LENGUAJE NATIVO DE SQL PARA DAR PASO A LAS CONSULTAS POR MEDIO DE OBJETOS JAVA,
               Y POR MEDIO DE LAS FUNCIONES QUE NOS OFRECE HIBERNATE, QUE MÁS TARDE SERÁM TRADUCIDAS A SENTENCIAS SQL.
                               
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