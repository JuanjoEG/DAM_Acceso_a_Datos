package Tema_02;


import static Clases.Utilidades.continuar;
import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
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
                               
        *******************************************************************************************************
        *  TEMA 02                                       FLUJOS  -  STREAMS                                   *
        *******************************************************************************************************
        *                                                                                                     *
        *  -. DEFINICIÓN:                                                                                     *
        *        ES UNA SECUENCIA ORDENADA DE INFORMACIÓN QUE POSEE UN RECURSO DE ENTRADA (FLUJO DE ENTRADA)  *
        *        Y UN RECURSO DE SALIDA (FLUJO DE SALIDA).                                                    *
        *        LOS STREAMS SON UNIDIRECCIONALES. --> SE USAN SÓLO PARA LEER O SÓLO PARA ESCRIBIR.           *
        *                                                                                                     *
        *  2. TABLA DE TIPOS DE CLASES DE FLUJOS SEGÚN SU FUNCIONALIDAD:                                      *
        *                                                                                                     *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *                EJEMPLOS:                                                                            *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  10. FLUJO DE TUBERIAS                                                                              *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  11. FLUJO DE ARRAYS READER                                                                         *
        *  12. FLUJP DE ARRAYS READER WRITER                                                                  *
        *******************************************************************************************************
        *  0. SALIR.                                                                                          *
        *******************************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "2" -> {
                        System.out.println("""
                                           
                            ***************************************************************************
                            *       USABILIDAD      *       BYTES (E/S)      *     CARACTERES (E/S)   *
                            ***************************************************************************
                            *  FICHEROS             *  FileInputStream       *  FiliReader            *
                            *                       *  FileOutputStream      *  FileWriter            *
                            ***************************************************************************
                            *  ARRAYS               *  ByteArrayInputStream  *  CharArrayReader       *
                            *                       *  ByteArrayOutputStream *  CharArrayWriter       *
                            ***************************************************************************
                            *  TUBERÍAS             *  PipedInputStream      *  PipedReader           *
                            *                       *  PipedOutputStream     *  PipedWriter           *
                            ***************************************************************************
                            *  BUFFER               *  BufferedInputStream   *  BufferedReader        *
                            *                       *  BufferedOutputStream  *  BufferedWriter        *
                            ***************************************************************************
                            *  ANÁLISIS (Parsing)   *  PushbackInputStream   *  PushbackReader        *
                            *                       *  StreamTokenizer       *  LineNumberReader      *
                            ***************************************************************************
                            *  INFORMACIÓN          *  DataInputStream       *  PrintWriter           *
                            *                       *  DataOutputStream      *                        *
                            *                       *  PrintStream           *                        *
                            ***************************************************************************
                                           
                                           """);
                    continuar();
                    }
                    
                    case "11" -> FlujosArraysReader.main(args);
                    case "12" -> FlujosArraysReaderWriter.main(args);
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