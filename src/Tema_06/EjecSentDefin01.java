package Tema_06;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
*                         EJECUCI�N DE SENTENCIAS DE DEFINICI�N DE DATOS I. CREACI�N DE BASE DE DATOS
********************************************************************************************************************

    - CREATE DATABASE:
            - CREACI�N DE UNA NUEVA BASE DE DATOS.
            - ES NECESARIO DISPONER DEL PERMISO CREATE.
            - CON 'create:specification' SE ESTABLECER�N LAS DISTINTAS CARACTER�STICAS DE LA BASE DE DATOS.
            - CON LA CL�USULA 'character set', SE ESPECIFICAR� EL SET DE CARACTERES
              POR DEFECTO DE DICHA BASE DE DATOS QUE SE EST� CREANDO.
                               
    - DROP DATABASE:
            - USAREMOS ESTE COMANDO PARA REALIZAR UN BORRADO PERMANENTE DE TODAS LAS TABLAS
              DE NUESTRA BASE DE DATOS Y BORRAR, AS�, DICHA BASE DE DATOS.
            - ES UN COMANDO MUY PELIGROSO: TENDREMOS QUE TENER ESPEC�FICAMENTE HABILITADO EL PERMISO DE DROP.
            - SI LA BASE DE DATOS QUE ESTAMOS BORRANDO EST� ENLAZADA SIMB�LICAMENTE, SE BORRAR�N AMBOS OBJETOS.
                               
    - ALTER DATABASE:
            - ESTE COMANDO FACILITA CAMBIAR CARACTER�STICAS GENERALES DE UNA BASE DE DATOS.
            - PARA USAR ESTE COMANDO SE NECESITA EL PERMISO ALTER.
                               
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