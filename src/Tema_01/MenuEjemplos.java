package Tema_01;


import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class MenuEjemplos {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 01            INTRODUCCIÓN AL MANEJO DE FICHEROS                          *
        ***********************************************************************************
        *                EJEMPLOS:                                                        *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * 10. ESCRITURA SECUENCIAL BYTES.                                                 *
        * 11. LECTURA   SECUENCIAL BYTES.                                                 *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * 12. ESCRITURA SECUENCIAL CARACTER.                                              *
        * 13. LECTURA   SECUENCIAL CARACTER.                                              *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * 14. ESCRITURA ALEATORIO UN BYTE.                                                *
        * 15. LECTURA   ALEATORIO UN BYTE.                                                *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * 16. ESCRITURA ALEATORIA DE SECUENCIA DE BYTES.                                  *
        * 17.1 LECTURA ALEATORIA DE SECUENCIA CADENA DE BYTES.                            *
        * 17.2 LECTURA ALEATORIA DE SECUENCIA CADENA DE BYTES.                            *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * 18. ESCRITURA CON BUFFER.                                                       *
        * 19. LECTURA   CON BUFFER.                                                       *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * 20. MOVER UN FICHERO.                                                           *
        ***********************************************************************************
        *  0. SALIR.                                                                      *
        ***********************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "10" -> Ejemplos_T01.EscrituraSecuencialBytes.main(args);
                    case "11" -> Ejemplos_T01.LecturaSecuencialBytes.main(args);
                    case "12" -> Ejemplos_T01.EscrituraSecuencialCaracter.main(args);
                    case "13" -> Ejemplos_T01.LecturaSecuencialCaracter.main(args);
                    case "14" -> Ejemplos_T01.EscrituraAleatoriaByte.main(args);
                    case "15" -> Ejemplos_T01.LecturaAleatoriaByte.main(args);
                    case "16" -> Ejemplos_T01.EscrituraAleatoriaDeSecuenciaDeBytes.main(args);
                    case "17.1" -> Ejemplos_T01.LecturaAleatoriaDeSecuenciaDeBytes1.main(args);
                    case "17.2" -> Ejemplos_T01.LecturaAleatoriaDeSecuenciaDeBytes2.main(args);
                    case "18" -> Ejemplos_T01.EscribirConBuffer.main(args);                    
                    case "19" -> Ejemplos_T01.LeerConBuffer.main(args);
                    case "20" -> Ejemplos_T01.MoverFichero.main(args);
                    
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