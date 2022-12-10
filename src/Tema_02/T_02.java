package Tema_02;


import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_02 {
    
    public static void main(String[] args) {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ********************************************************************************************************************
        *  TEMA 02                                       FLUJOS  -  STREAMS  
        ********************************************************************************************************************
        *
        *   LA FORMA MÁS HABITUAL DE ACCEDER Y MANEJAR INFORMACIÓN EN JAVA NO ES LEYENDO FICHEROS POR COMPLETO,
        *   SINO QUE ES MÁS PARECIDO A LOS BUFFERS, USAREMOS FLUJOS DE DATOS. --> STREAMS.
        *
        *  -. DEFINICIÓN:
        *        ES UNA SECUENCIA ORDENADA DE INFORMACIÓN (FLUJOS DE INFORMACIÓN)
        *        QUE POSEE UN RECURSO DE ENTRADA (FLUJO DE ENTRADA),
        *        Y UN RECURSO DE SALIDA (FLUJO DE SALIDA).
        *
        *        LOS STREAMS SON UNIDIRECCIONALES. --> SE USAN SÓLO PARA LEER O SÓLO PARA ESCRIBIR.
        *    
        *  2. CLASIFICACIÓN DE FLUJOS.
        *  3. CLASES DE FLUJOS BASADOS EN TUBERÍAS. (PIPE).
        *  4. CLASES DE FLUJOS BASADOS EN ARRAYS.
        *  5. CLASES DE ANÁLISIS PARA FLUJOS DE DATOS.
        *  6. CLASES PARA EL TRATAMIENTO DE LA INFORMACIÓN.
        *  
        ********************************************************************************************************************
        *  7. EJEMPLOS:
        ********************************************************************************************************************
        *  0. SALIR.
        ********************************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    case "2" -> TiposFlujos.main(args);
                    case "3" -> Flujos_Tuberias.main(args);
                    case "4" -> Flujos_Arrays.main(args);
                    case "5" -> Flujos_Analisis.main(args);
                    case "6" -> Tratamiento_Info.main(args);
                    case "7" -> Tema_02.MenuEjemplos.main(args);
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