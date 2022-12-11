package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class EjecSentDefin01 {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 06                                 MANEJO DE CONECTORES III: SENTENCIAS
********************************************************************************************************************
*                         EJECUCIÓN DE SENTENCIAS DE DEFINICIÓN DE DATOS I. CREACIÓN DE BASE DE DATOS
********************************************************************************************************************

    - CREATE DATABASE:
            - CREACIÓN DE UNA NUEVA BASE DE DATOS.
            - ES NECESARIO DISPONER DEL PERMISO CREATE.
            - CON 'create:specification' SE ESTABLECERÁN LAS DISTINTAS CARACTERÍSTICAS DE LA BASE DE DATOS.
            - CON LA CLÁUSULA 'character set', SE ESPECIFICARÁ EL SET DE CARACTERES
              POR DEFECTO DE DICHA BASE DE DATOS QUE SE ESTÁ CREANDO.
                               
    - DROP DATABASE:
            - USAREMOS ESTE COMANDO PARA REALIZAR UN BORRADO PERMANENTE DE TODAS LAS TABLAS
              DE NUESTRA BASE DE DATOS Y BORRAR, ASÍ, DICHA BASE DE DATOS.
            - ES UN COMANDO MUY PELIGROSO: TENDREMOS QUE TENER ESPECÍFICAMENTE HABILITADO EL PERMISO DE DROP.
            - SI LA BASE DE DATOS QUE ESTAMOS BORRANDO ESTÁ ENLAZADA SIMBÓLICAMENTE, SE BORRARÁN AMBOS OBJETOS.
                               
    - ALTER DATABASE:
            - ESTE COMANDO FACILITA CAMBIAR CARACTERÍSTICAS GENERALES DE UNA BASE DE DATOS.
            - PARA USAR ESTE COMANDO SE NECESITA EL PERMISO ALTER.
                               
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