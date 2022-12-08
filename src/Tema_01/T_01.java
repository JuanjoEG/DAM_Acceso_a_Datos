package Tema_01;

import static Clases.Utilidades.continuar;
import static Principal.Main.esperar;
import static Principal.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_01 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 01            INTRODUCCIÓN AL MANEJO DE FICHEROS                          *
        ***********************************************************************************
        *                                                                                 *
        *  -. DEFINICIÓN Y TIPOS DE FICHEROS.                                             *
        *        DEFINIMOS UN FICHERO COMO LA SUCESIÓN DE bits QUE FINALMENTE             *
        *        SON ALMACENADOS EN UN DETERMINADO DISPOSITIVO.                           *
        *        SE COMPONE DE NOMBRE Y EXTENSIÓN.                                        *
        *                                                                                 *
        *                 2 GRANDES FAMILIAS:    * DE TEXTO (ASCII)                       *
        *                                        * BINARIOS                               *
        *  2. LA CLASE File (Java.io.File).                                               *
        *  3. FORMAS DE ACCEDER A UN FICHERO.                                             *
        *  4. ESQUEMA.                                                                    *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
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
                switch (menu) {
                    
                    case "2" -> ClaseFile.main(args);
                    case "3" -> {
                        System.out.println("""
                                           
                                           FORMAS DE ACCEDER A UN FICHERO
                                           
                        * ACCESO SECUENCIAL --> RECORRE TODA LA SECUENCIA DE CARACTERES O BYTES.
                                           
                        * ACCESO ALEATORIO O DIRECTO --> SE ESTABLECE UN PUNTERO QUE INDICA LA POSICIÓN DE LECTURA O ESCRITURA.
                                           
                            *******************************************************************************************
                            *    ACCESO BASADO EN CARACTERES:         *      SECUENCIAL       *       ALEATORIA       *
                            *******************************************************************************************               
                            *                                         *                       *                       *
                            *               ENTRADA (LECTURA)    -->  * FileReader            *          N / C        *
                            *                                         *                       *                       *
                            *               SALIDA (ESCRITURA)   -->  * FileWriter            *          N / C        *
                            *                                         *                       *                       *
                            *******************************************************************************************
                            *    ACCESO BASADO EN Bytes:              *      SECUENCIAL       *       ALEATORIA       *
                            *******************************************************************************************
                            *                                         *                       *                       *
                            *               ENTRADA (LECTURA)    -->  * FileInputStream       * RandomAccessFile      *
                            *                                         *                       *                       *
                            *               SALIDA (ESCRITURA)   -->  * FileOutputStream      * RandomAccessFile      *
                            *                                         *                       *                       *
                            *******************************************************************************************                                
                            
                                           
                            *****************************************************************  ************************
                            *  RandomAcessFile  MODOS DE ACCESO:                            *  *        BUFFER        *
                            *****************************************************************  ************************
                            * "r"   --> LECTURA                                             *  *  BufferedInputStream *
                            * "rw"  --> LECTURA Y ESCRITURA                                 *  *  BufferedOutStream   *
                            * "rwd" --> LECTURA Y ESCRITURA -> FORMA SÍNCRONA               *  *  BufferedWriter      *
                            * "rws" --> LECTURA Y ESCRITURA -> FORMA SÍNCRONA + METADATOS   *  *  BufferedReader      *
                            *****************************************************************  ************************
                                           
                                           
                                                         """);
                        
                        continuar();
                    }
                    
                    case "4" -> {
                        System.out.println("""
                                           
                                           
                            *******************************************************************************************
                            *    10. ESCRITURA SECUENCIAL BYTES.                FileOutputStream                      *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                            *     INSTANCIAR FICHERO (RUTA);                                                          *
                            *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                            
                            *******************************************************************************************
                            *    11. LECTURA   SECUENCIAL BYTES.                FileInputStream                       *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     INSTANCIAR FICHERO (RUTA);                                                          *
                            *     BYTE = FICHERO.read();                        LEER                                  *
                            *     BUCLE while |                                                                       *
                            *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                            *                 | BYTE = FICHERO.read();          LEER                                  *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                                           
                                           
                                                         """);
                        
                        continuar();
                        
                        System.out.println("""
                                           
                                           
                            *******************************************************************************************
                            *    12. ESCRITURA SECUENCIAL CARACTER.             FileWriter                            *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     INSTANCIAR FICHERO (RUTA);                                                          *
                            *     ESCRIBIR --> FICHERO.write(STRING);                                                 *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                            
                            *******************************************************************************************
                            *    13. LECTURA   SECUENCIAL CARACTER.             FileReader                            *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     INSTANCIAR FICHERO (RUTA);                                                          *
                            *     BYTE = FICHERO.read();                        LEER                                  *
                            *     BUCLE while |                                                                       *
                            *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                            *                 | BYTE = FICHERO.read();          LEER                                  *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                                           
                                           
                                                         """);
                        
                        continuar();
                        
                        System.out.println("""
                                           
                                           
                            *******************************************************************************************
                            *    14. ESCRITURA ALEATORIO UN BYTE.               RandomAcessFile                       *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                            *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                            *     ESCRIBIR --> FICHERO.write(BYTE);                                                   *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                            
                            *******************************************************************************************
                            *    15. LECTURA   ALEATORIO UN BYTE.               RandomAcessFile                       *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                            *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                            *     LEER     --> BYTE = FICHERO.read();                                                 *
                            *     CASTING  --> CONTENIDO = (char)BYTE;                                                *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                                           
                                           
                                                         """);
                        
                        continuar();
                        
                        System.out.println("""
                                           
                                           
                            *******************************************************************************************
                            *    16. ESCRITURA ALEATORIA DE SECUENCIA DE BYTES.             RandomAcessFile           *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                            *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                            *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                            *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                            
                            *******************************************************************************************
                            *    17 LECTURA ALEATORIA DE SECUENCIA CADENA DE BYTES.          RandomAcessFile          *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                            *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                            *     BYTE = FICHERO.read();                        LEER                                  *
                            *     BUCLE while |                                                                       *
                            *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                            *                 | BYTE = FICHERO.read();          LEER                                  *
                            *                 | if (CONTADOR==TAMAÑO) break;    LÍMITE                                *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                                           
                                           
                                                         """);
                        
                        continuar();
                        
                        System.out.println("""
                                           
                                           
                            *******************************************************************************************
                            *    18. ESCRITURA CON BUFFER..                 BufferedOutputStream - FileOutputStream   *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                            *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                            *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                            
                            *******************************************************************************************
                            *    19. LECTURA   CON BUFFER.                  BufferedInputStream - FileInputStream     *
                            *******************************************************************************************               
                            *                                                                                         *
                            *     INSTANCIAR FICHERO (RUTA, TAMAÑO_BUFFER);                                           *
                            *     BYTE = FICHERO.read();                        LEER                                  *
                            *     BUCLE while |                                                                       *
                            *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                            *                 | BYTE = FICHERO.read();          LEER                                  *
                            *     CERRAR   --> FICHERO.close();                                                       *
                            *                                                                                         *
                            *******************************************************************************************
                                           
                                           
                                                         """);
                        
                        continuar();
                    }
                    
                    case "10" -> EscrituraSecuencialBytes.main(args);
                    case "11" -> LecturaSecuencialBytes.main(args);
                    
                    case "12" -> EscrituraSecuencialCaracter.main(args);
                    case "13" -> LecturaSecuencialCaracter.main(args);
                    
                    case "14" -> EscrituraAleatoriaByte.main(args);
                    case "15" -> LecturaAleatoriaByte.main(args);
                    
                    case "16" -> EscrituraAleatoriaDeSecuenciaDeBytes.main(args);
                    case "17.1" -> LecturaAleatoriaDeSecuenciaDeBytes1.main(args);
                    case "17.2" -> LecturaAleatoriaDeSecuenciaDeBytes2.main(args);
                    
                    case "18" -> EscribirConBuffer.main(args);                    
                    case "19" -> LeerConBuffer.main(args);
                    
                    case "20" -> MoverFichero.main(args);
                    
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