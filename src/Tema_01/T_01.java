package Tema_01;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_01 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 01            INTRODUCCI�N AL MANEJO DE FICHEROS                          *
        ***********************************************************************************
        *                                                                                 *
        *  -. DEFINICI�N Y TIPOS DE FICHEROS.                                             *
        *        DEFINIMOS UN FICHERO COMO LA SUCESI�N DE bits QUE FINALMENTE             *
        *        SON ALMACENADOS EN UN DETERMINADO DISPOSITIVO.                           *
        *        SE COMPONE DE NOMBRE Y EXTENSI�N.                                        *
        *     LOS METADATOS SER�N LAS PROPIEDADES DEL FICHERO.                            *
        *                                                                                 *
        *                 2 GRANDES FAMILIAS:    * DE TEXTO (ASCII)                       *
        *                                        * BINARIOS                               *
        *  1. LA CLASE File (Java.io.File).                                               *
        *  2. FORMAS DE ACCEDER A UN FICHERO.                                             *
        *  3. OPERACIONES CON BUFFER.                                                     *
        *  4. ESQUEMAS.                                                                   *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  5. EJEMPLOS.                                                                   *
        ***********************************************************************************
        *  0. SALIR.                                                                      *
        ***********************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1" -> ClaseFile.main(args);
                    case "2" -> FormasAcceder.main(args);
                    case "3" -> OperacioneBuffer.main(args);
                    case "4" -> Esquemas.main(args);                    
                    case "5" -> Tema_01.MenuEjemplos.main(args);
                    
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