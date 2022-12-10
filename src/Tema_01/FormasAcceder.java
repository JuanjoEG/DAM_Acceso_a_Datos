package Tema_01;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class FormasAcceder {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
                        System.out.println("""

********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  1/6                      FORMAS DE ACCEDER A UN FICHERO
********************************************************************************************************************

                            FORMAS DE ACCEDER A UN FICHERO: --> AL CONTENIDO DE ESE FICHERO. --> EL INTERIOR.

         * ACCESO SECUENCIAL --> RECORRE TODA LA SECUENCIA DE CARACTERES O BYTES.
                                 HAY QUE PASAR POR TODOS LOS ANTERIORES. (BYTE A BYTE) O (CARACTER A CARACTER).
                                 PROCESA MÁS INFORMACIÓN -> CONLLEVA MÁS TIEMPO -> CONSUME MÁS RECURSOS.                                            

         * ACCESO ALEATORIO O DIRECTO --> SE ESTABLECE UN PUNTERO (O ÍNDICE) EN BYTES,
                            QUE INDICA LA POSICIÓN EXACTA DE LECTURA O ESCRITURA DENTRO DEL FICHERO.
                            PERMITE ACCEDER A UN REGISTRO O POSICIÓN DETERMINADA DE NUESTRO FICHERO.
                            SE CREA LA NECESIDAD DE GENERAR ESE ÍNDICE O PUNTERO, TIENE QUE EXISTIR.
                            PROCESA MENOS INFORMACIÓN -> CONLLEVA MENOS TIEMPO -> CONSUME MENOS RECURSOS.

********************************************************************************************************************

                            """);
          continuar();
          System.out.println(""" 

********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  2/6                      FORMAS DE ACCEDER A UN FICHERO
********************************************************************************************************************

        * CLASES DE USO DE ACCESO SECUENCIAL CON BYTES:
                           FACILITAN LA LECTURA O ESCRITURA DE UN FICHERO COMO UN 'STREAM' DE BYTES.
                           PRIMERO ES INSTANCIAR EL FICHERO INDICANDO LA RUTA
                           ÚLTIMO ES CERRAR EL FICHERO PARA LIBERAR RECURSOS. --> .close()

                                 - FileInputStream: LECTURA-ENTRADA DE DATOS.
                                      .read() --> PARA LEER UN BYTE.
                                 - FileOutputStream: ESCRITURA-SALIDA DE DATOS.
                                      .write() --> PARA ESCRIBIR UN BYTE.

        * CLASES DE USO DE ACCESO SECUENCIAL CON CARACTERES:  (BLOQUE DE CARACTERES)
                           FACILITAN LA LECTURA O ESCRITURA DE UN FICHERO COMO UN 'STREAM' DE CARACTERES.
                           PRIMERO ES INSTANCIAR EL FICHERO INDICANDO LA RUTA
                           ÚLTIMO ES CERRAR EL FICHERO PARA LIBERAR RECURSOS. --> .close()

                                 - FileReader: LECTURA-ENTRADA DE DATOS.
                                      .read() --> PARA LEER UN CARACTER.
                                 - FileWriter: ESCRITURA-SALIDA DE DATOS.
                                      .write() --> PARA ESCRIBIR UN CARACTER.
                           CON FileWriter --> AL INTANCIAR --> SI NO EXISTE LA RUTA --> SE CREA LA RUTA Y EL FICHERO.
                                           
********************************************************************************************************************
                                                                          
                            """);
          continuar();
          System.out.println(""" 
                                                                                  
********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  3/6                      FORMAS DE ACCEDER A UN FICHERO
********************************************************************************************************************
    OPERACIONES GESTIÓN DE FICHEROS. CLASES ASOCIADAS:
    DIFERENCIAS ACCESO BYTES VS ACCESO CARACTERES.
                             
        - EL ACCESO A NIVEL DE BYTE ES UN ACCESO 'EN BRUTO' AL CONTENIDO DEL FICHERO.
                - LAS CLASES Y LOS MÉTODOS LEEN EL BYTE, QUE SE PODRÁ INTERPRETAR DE DIFERENTES MANERAS. (ENTERO O CARACTER)
                - REQUIERE SOBRE EL PROGRAMADOR LA TAREA DE 'INTERPRETAR' LO QUE HA LEÍDO.
                - PARA ESCRIBIR UNA FRASE EN UN FICHERO A NIVEL BYTES,
                  ANTES HAY QUE TRANSFORMAR LA FRASE A UNA SECUENCIA DE BYTES. 
        - EL ACCESO A NIVEL DE FLUJOS O STREAMS DE CARACTERES ESTÁ MÁS INTERPLETADO.

********************************************************************************************************************
                                                                          
                            """);
          continuar();
          System.out.println(""" 
                                                                                  
********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  4/6                      FORMAS DE ACCEDER A UN FICHERO
********************************************************************************************************************
    OPERACIONES GESTIÓN DE FICHEROS. CLASES ASOCIADAS:
    CLASES DE USO DE ACCESO ALEATORIO: INSTANCIACIÓN Y POSICIONAMIENTO.

        - RandomAccessFile --> PERMITE TRABAJAR CON UN FICHERO DE FORMA ALEATORIA, EN LOS MODOS:
                -   r      --> LECTURA.
                -  rw      --> LECTURA Y ESCRITURA.
                - rwd      --> LECTURA Y ESCRITURA SINCRONIZADA. (DEL CONTENIDO).
                - rws      --> LECTURA Y ESCRITURA SINCRONIZADA. (DEL CONTENIDO + METADATOS).
                               METADATOS --> INFORMACIÓN ADICIONAL AL CONTENIDO DEL FICHERO. (PROPIEDADES)
                             
            - INSTANCIACIÓN:  -->  DOS CONSTRUCTORES:
                    CONSTRUCTOR 1:             
                        - EL PRIMER PARÁMETRO:  --> EL OBJETO File DIRECTAMENTE.
                        - EL SEGUNDO PARÁMETRO: --> ES EL MODO DE ACCESO. --> r, rw, rwd O rws.
                    CONSTRUCTOR 2:             
                        - EL PRIMER PARÁMETRO:  --> LA RUTA DEL FICHERO COMO STRING.
                        - EL SEGUNDO PARÁMETRO: --> ES EL MODO DE ACCESO. --> r, rw, rwd O rws.

            - POSICIONAMIENTO EN EL FICHERO:
                        - MÉTODO seek(POSICIÓN):   --> POSICIONAMOS EN EL PUNTO (EL BYTE) QUE LE INDIQUEMOS DEL FICHERO. (TIPO long).
                        - MÉTODO getFilePointer(): --> DEVUELVE LA POSICIÓN DEL PUNTERO EN BYTES. (TIPO long).
                             
********************************************************************************************************************
                                                                          
                            """);
          continuar();
          System.out.println(""" 
                                                                                  
********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  5/6                      FORMAS DE ACCEDER A UN FICHERO
********************************************************************************************************************
    OPERACIONES GESTIÓN DE FICHEROS. CLASES ASOCIADAS:
    CLASES DE USO DE ACCESO ALEATORIO: LECTURA Y ESCRITURA.
                             
        UNA VEZ POSICIONADOS:
                             
        - LECTURA:
            .read(): HACE LECTURA DE UN BYTE A PARTIR DE LA POSICIÓN ACTUAL DEL PUNTERO.
            .read(array_bytes_destino, posicion, bytes_a_leer):
                PARA LEER MÁS DE UN BYTE SE ESPECIFICA COMO PARÁMETROS UN ARRAY. --> ALMACENA LO LEIDO.
                LA POSICIÓN DE INICIO DE LECTURA Y EL NÚMERO DE BYTES A LEER.
                             
        - ESCRITURA:
            .write(byte_a_escribir): ESCRIBE EL BYTE INDICADO EN LA POSICIÓN ACTUAL DEL PUNTERO.
                UNA VEZ ESCRITO EL CAÁCTER EN EL FICHERO --> LA POSICIÓN DEL PUNTERO AVANZARÁ UNA UNIDAD.

********************************************************************************************************************
                                                                          
                            """);
          continuar();
          System.out.println(""" 
                                                                                  
********************************************************************************************************************
*  TEMA 01                 INTRODUCCIÓN AL MANEJO DE FICHEROS                          
********************************************************************************************************************
*  6/6                      FORMAS DE ACCEDER A UN FICHERO
********************************************************************************************************************
                             
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
    *               ENTRADA (LECTURA)    -->  * FileInputStream       * RandomAccessFile(*)   *
    *                                         *                       *                       *
    *               SALIDA (ESCRITURA)   -->  * FileOutputStream      * RandomAccessFile(*)   *
    *                                         *                       *                       *
    ******************************************************************************************* 
       (*) LA DIFERENCIA ENTRE ENTRADA Y SALIDA SE INDICA EN EL MODO DE APERTURA DEL FICHERO. (r, rw, rwd O rws).


    *****************************************************************  ************************
    *  RandomAcessFile  MODOS DE ACCESO:                            *  *        BUFFER        *
    *****************************************************************  ************************
    * "r"   --> LECTURA                                             *  *  BufferedInputStream *
    * "rw"  --> LECTURA Y ESCRITURA                                 *  *  BufferedOutStream   *
    * "rwd" --> LECTURA Y ESCRITURA -> FORMA SÍNCRONA               *  *  BufferedWriter      *
    * "rws" --> LECTURA Y ESCRITURA -> FORMA SÍNCRONA + METADATOS   *  *  BufferedReader      *
    *****************************************************************  ************************

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
                    default -> System.out.println("\n ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}