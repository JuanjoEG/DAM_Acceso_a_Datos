package Tema_05;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class GestoresApachJavaH2 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 05                                       MANEJO DE CONECTORES II
********************************************************************************************************************
*                               GESTORES DE BASES DE DATOS EMBEBIDOS I: Apache Derby, JavaDB Y H2
********************************************************************************************************************

   - Apache Derby:
           - PUEDE SER DESPLEGADA EN MODO SIMPLE EMBEBIDO Y TAMBI�N EN MODO CLIENTE/SERVIDOR.
           - ESCRITA POR COMPLETO EN JAVA, PUEDE SER INCLUIDA EN CUALQUIER APLICACI�N JAVA.
           - SOPORTA TODAS LAS FUNCIONALIDADES EST�NDAR DE UNA BASE DE DATOS RELACIONAL.
           - PARA EMBEBER UNA BD DERBY EN NUESTRA APLICACI�N JAVA,
             HAY QUE INCLUIR EN EL PROYECTO JAVA EL FICHERO 'derby.jar' DEL DIRECTORIO /lib.
                    - ESTE FICHERO CONTIENE EL MOTOR DE LA BASE DE DATOS
                      Y LOS CONECTORES PARA LA CONEXI�N CON EL DRIVER JDBC.           
                               
   - JavaDB:
           - JAVADB EST� CONTRUIDA SOBRE EL MOTOR DE LA BASE DE DATOS DERBY.
                               
   - H2 Database:
           - CONTIENE MODO CLIENTE/SERVIDOR, MODO EMBEBIDO Y MODO DESPLEGABLE EN MEMORIA.
           - ES MUY R�PIDA, DE C�DIGO ABIERTO, JDBC API.
           - SE PUEDE USAR PERFECTAMENTE PARA APLICACIONES WEB.
           - MUY MANEJABLE Y TRANSPORTABLE, EL FICHERO .jar OCUPA 2MB DE ESPACIO TOTAL.
           - SOPORTA MVCC -> MULTIVERSION CONCURRENCY CONTROL.
           - PARA CONECTARSE PUEDE USAR Postgress OBDC DRIVER.

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