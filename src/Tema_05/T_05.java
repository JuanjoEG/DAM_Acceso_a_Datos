package Tema_05;


import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_05 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""
                               
        *******************************************************************************************************
        *  TEMA 05                            MANEJO DE CONECTORES II                                         *
        *******************************************************************************************************
        *                                                                                                     *
        *  1. GESTORES DE BASES DE DATOS EMBEBIDOS E INDEPENDIENTES.                                          *
        *  2. GESTORES DE BASES DE DATOS EMBEBIDOS I: HyperSQL Y ObjectDB.                                    *
        *  3. GESTORES DE BASES DE DATOS EMBEBIDOS I: Apache Derby, JavaDB Y H2.                              *
        *  4. GESTORES DE BASES DE DATOS INDEPENDIENTES.                                                      *
        *  5. AÑADIR BASE DE DATOS H2 USANDO SPRING BOOT.                                                     *
        *  6. COMPARATIVA.                                                                                    *
        *                                                                                                     *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************                          


                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {

                    case "1" -> GestoresBBDD.main(args);
                    case "2" -> GestoresHyperObject.main(args);
                    case "3" -> GestoresApachJavaH2.main(args);
                    case "4" -> GestoresIndepend.main(args);
                    case "5" -> BaseDatosH2SpringBoot.main(args);
                    case "6" -> Comparativa.main(args);
                    
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