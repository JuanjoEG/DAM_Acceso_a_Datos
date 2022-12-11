package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
*                                       DEFINICIÓN DE LA ARQUITECTURA DE HIBERNATE.
********************************************************************************************************************

    - LA ARQUITECTURA HIBERNATE INCLUYE, ENTRE OTROS:
            - OBJETOS DE PERSISTENCIA.
            - OBJETOS DE SESIONES.
            - TRANSACCIONES.
                               
    - HIBERNATE USA EL PRINCIPIO DE REFLEXIÓN JAVA, QUE PERMITE AL ANÁLISIS Y MODIFICACIÓN DE ATRIBUTOS 
      Y CARACTERÍSTICAS DE LAS DISTINTAS CLASES EN TIEMPO DE EJECUCIÓN.
    
    - LAS CAPAS DE APLICACIÓN E HIBERNATE ESTÁN UNIDAS POR LOS OBJETOS DE PERSISTENCIA.
            - MOTIVO: EN UNA PARTE ESPECÍFICA DE LA APLICACIÓN SE DA CIERTA CONVERSIÓN (FICHERO DE MAPEO),
              DONDE LA INFORMACIÓN FLUYE Y ES MAPEADA DESDE DICHOS FICHEROS PERSISTENTES A LA BASE DE DATOS.
                               
    - LA CAPA HIBERNATE ES DONDE SE REALIZA LA CONEXIÓN CON EL DRIVER,
      TAMBIÉN DONDE SE CARGAN TANTO LAS DISTINTAS CONFIGURACIONES HIBERNATE,
      COMO TODAS LAS ENTIDADES PREVIAMENTE DISEÑADAS.
                               
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