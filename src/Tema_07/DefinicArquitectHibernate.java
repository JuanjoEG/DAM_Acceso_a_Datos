package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class DefinicArquitectHibernate {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 07                                     EL MAPEO OBJETO RELACIONAL  
********************************************************************************************************************
*                                       DEFINICI�N DE LA ARQUITECTURA DE HIBERNATE.
********************************************************************************************************************

    - LA ARQUITECTURA HIBERNATE INCLUYE, ENTRE OTROS:
            - OBJETOS DE PERSISTENCIA.
            - OBJETOS DE SESIONES.
            - TRANSACCIONES.
                               
    - HIBERNATE USA EL PRINCIPIO DE REFLEXI�N JAVA, QUE PERMITE AL AN�LISIS Y MODIFICACI�N DE ATRIBUTOS 
      Y CARACTER�STICAS DE LAS DISTINTAS CLASES EN TIEMPO DE EJECUCI�N.
    
    - LAS CAPAS DE APLICACI�N E HIBERNATE EST�N UNIDAS POR LOS OBJETOS DE PERSISTENCIA.
            - MOTIVO: EN UNA PARTE ESPEC�FICA DE LA APLICACI�N SE DA CIERTA CONVERSI�N (FICHERO DE MAPEO),
              DONDE LA INFORMACI�N FLUYE Y ES MAPEADA DESDE DICHOS FICHEROS PERSISTENTES A LA BASE DE DATOS.
                               
    - LA CAPA HIBERNATE ES DONDE SE REALIZA LA CONEXI�N CON EL DRIVER,
      TAMBI�N DONDE SE CARGAN TANTO LAS DISTINTAS CONFIGURACIONES HIBERNATE,
      COMO TODAS LAS ENTIDADES PREVIAMENTE DISE�ADAS.
                               
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