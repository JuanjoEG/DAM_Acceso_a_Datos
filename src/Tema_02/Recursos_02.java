package Tema_02;

import static Principal_Main.Main.*;
import static Tema_02.T_02.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_02 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_02 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
       
            LA FORMA M�S HABITUAL DE ACCEDER Y MANEJAR INFORMACI�N EN JAVA NO ES LEYENDO FICHEROS POR COMPLETO,
            SINO QUE ES M�S PARECIDO A LOS BUFFERS, USAREMOS FLUJOS DE DATOS. --> STREAMS.
             
            -. DEFINICI�N:
                         
                    ES UNA SECUENCIA ORDENADA DE INFORMACI�N (FLUJOS DE INFORMACI�N)
                    QUE POSEE UN RECURSO DE ENTRADA (FLUJO DE ENTRADA),
                    Y UN RECURSO DE SALIDA (FLUJO DE SALIDA).

                    LOS STREAMS SON UNIDIRECCIONALES. --> SE USAN S�LO PARA LEER O S�LO PARA ESCRIBIR.
                            
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_02 + """
        ************************************************************************************************************************
                         
            SEG�N EL TIPO DE INFORMACI�N A TRATAR:
                         
                    - TRATAMIENTO DE FICHEROS.
                    - TRATAMIENTO CON BUFFERS.
                    - TRATAMIENTO CON ARRAYS.
                    - TRATAMIENTO CON TUBER�AS.
                    - TRATAMIENTO CON AN�LISIS. (PARSING).
                    - TRATAMIENTO CON BLOQUES DE INFORMACI�N. (TOKENS).
                                
                    CADA UNA DE ESTAS CATEGOR�AS VAN A PODER Y USAR DIFERENTES FUNCIONALIDADES,
                    A TRAV�S DE DIFERENTES CLASES Y M�TODOS,
                    COMO SE MUESTRA EN LA SIGUIENTE TABLA:
                                        
                    ***************************************************************************
                    *       TABLA DE TIPOS DE CLASES DE FLUJOS SEG�N SU FUNCIONALIDAD         *
                    ***************************************************************************
                    *       USABILIDAD      *       BYTES (E/S)      *     CARACTERES (E/S)   *
                    ***************************************************************************
                    *  FICHEROS             *  FileInputStream       *  FiliReader            *
                    *                       *  FileOutputStream      *  FileWriter            *
                    ***************************************************************************
                    *  ARRAYS               *  ByteArrayInputStream  *  CharArrayReader       *
                    *                       *  ByteArrayOutputStream *  CharArrayWriter       *
                    ***************************************************************************
                    *  TUBER�AS             *  PipedInputStream      *  PipedReader           *
                    *                       *  PipedOutputStream     *  PipedWriter           *
                    ***************************************************************************
                    *  BUFFER               *  BufferedInputStream   *  BufferedReader        *
                    *                       *  BufferedOutputStream  *  BufferedWriter        *
                    ***************************************************************************
                    *  AN�LISIS (Parsing)   *  PushbackInputStream   *  PushbackReader        *
                    *                       *  StreamTokenizer       *  LineNumberReader      *
                    ***************************************************************************
                    *  INFORMACI�N          *  DataInputStream       *  PrintWriter           *
                    *                       *  DataOutputStream      *                        *
                    *                       *  PrintStream           *                        *
                    ***************************************************************************
                         
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_03 + """
        ************************************************************************************************************************

            - EL CONCEPTO DE TUBER�AS, ASOCIADO A LOS HILOS (THREADS) ES DISTINTO EN JAVA QUE EN OTROS SISTEMAS:

                    - TUBER�A EN EL LENGUAJE DE PROGRAMACI�N JAVA:
                            - CAPACIDAD DE UTILIZAR DOS THREADS EJECUT�NDOSE EN LA MISMA M�QUINA VIRTUAL. (JVM).
                            - SON HILOS DIFERENTES, PERO PERTENECEN AL MISMO PROCESO.
                            - LAS TUBER�AS EN LOS THREADS PUEDEN SER OR�GENES O DESTINOS DE DATOS, PERO NO A LA VEZ.

                    - TUBER�A EN SISTEMAS UNIX:
                            - DOS PROCESOS QUE SE EJECUTAN EN LUGARES DISTINTOS DE MEMORIA.
                            - LOS PROCESOS PUEDEN COMUNICARSE A TRAV�S DE UNA TUBER�A.

            - EJEMPLO T�PICO DE UTILIZACI�N DE TUBER�AS EN JAVA:

                    - UN PROCESO CON 2 HILOS.
                            - UN HILO ESCRIBIENDO EN UN STREAM.
                            - OTRO HILO LEY�NDOLO.

                    - EN EL ESPACO COM�N A AMBOS THREADS, A NIVEL CLASE.                               
                            - SE CREAR�N PipedOutStream Y PipedInputStream.
                            - CONEXI�N: 
                              LA INSTANCIA DE LA TUBER�A PipedInputStream 
                              UTILIZAR� EL PipedOutStream PREVIAMENTE CREADO.

                                   final PipedOutputStream salida = new PipedOutputStream();
                                   final PipedInputStream entrada = new PipedInputStream(salida);

                            - SE LANZAR�N --> start() --> LOS DOS THREADS.

                    - CADA HILO USAR� UNA DE ELLAS, PERO AMBOS OBJETOS ESTAR�N DEFINIDOS A NIVEL DE CLASES. (SON COMUNES).

                            - EL THREADS QUE ESCRIBE EN LA TUBER�A INSTANCIAR� EL PipedOutputStream, 
                              HACIENDO REFERENCIA A UN OBJETO DE SALIDA.
                                    - PUEDE SER LA ESCRITURA DE UN FICHERO, O DIRECTAMENTE UNA CADENA DE TEXTO.

                            - EL THREADS QUE LEE, TIENE ACCESO A LOS BYTES QUE LLEGAN A LA TUBER�A.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_04 + """
        ************************************************************************************************************************

            - DIVIDIREMOS LAS CLASES BASADAS EN EL FLUJO DE ARRAYS SEG�N EL TIPO DE ACCESO:

                    - ARRAYS DE BYTES:          -->  ByteArrayInputStream   -   ByteArrayOutputStream.

                    - ARRAYS DE CARACTERES:     -->  CharArrayReader        -   CharArrayWriter.
                                                      
            - CharArrayReader: PUEDE LEER ARRAY DE CARACTERES (char) COMO Stream DE CARACTERES.
                    - ES �TIL SI TENEMOS INFORMACI�N EN ARRAYS DE CARACTERES Y HAY QUE PASARLO A ALG�N COMPONENTE
                      QUE SOLO LEE DESDE LA CLASE Reader, O UNA SUBCLASE DE Reader.
                    - EN ESE CASO: ENCAPSULAMOS EL ARRAY NORMAL EN UN  -->  CharArrayReader
                      Y SE PASA AL COMPONENTE:
                    PASOS:                     
                            1. INSTANCIAR UN ARRAY DE CARACTER. (LO LLAMAREMOS 'chars').
                            2. PASAR POR PAR�METROS EL ARRAY AL CREAR UN OBJETO DE LA CLASE   -->  CharArrayReader.
                                      DE ESTA FORMA, TENDR�AMOS EN ESTA CLASE EL CONTENIDO DE TODO EL ARRAY.
                            3. YA TENEMOS LA INFORMACI�N EN EL OBJETO 'charArrayReader' 
                                      --> PODEMOS IR LEYENDO LETRA A LETRA. (char). O LA OERACI�N QUE SE DESEE.
                            4. EJECUTAMOS EL M�TODO close(). -> CERRAR Y LIBERAR RECURSOS.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_05 + """
        ************************************************************************************************************************
                         
            AN�LISIS PREVIO:
            AN�LISIS DE DATOS PREVIO DE UN InputStream:
                                                      
                    PushBackInputStream (A NIVEL DE BYTE)          -->  byte A byte
                    PushbackReader      (A NIVEL DE CARACTERES)

                        - LEEN CONTENIDO CON ANTICIPACI�N PARA SABER QU� SE APROXIMA,
                          PARA AS� PODER INTERPRETAR EL CONTENIDO ACTUAL.

                        - ESTOS CONTENIDOS LE�DOS CON ANTERIORIDAD,
                          SER�N DE NUEVO 'EMPUJADOS' A LA SECUENCIA,
                          PARA LEERLOS POSTERIORMENTE CUANDO SE HAGA DE NUEVO read(). 

                        - unread(data)  --> DEVUELVE AL STREAM DE DATOS EL BYTE QUE HEMOS LE�DO CON ANTERIORIDAD.                     
                                                      
            StreamTokenizer PERMITE ANALIZAR Strem POR tokens.
            TOKEN --> TROZO DEL CONTENIDO DEL FICHERO.
                                                    
                    - EVALUAR LOS TOKENS DETECTA SI SON PALABRAS N�MEROS.

                    - RECONOCE IDENTIFICADORES. (N�MEROS, COMILLAS, ESPACIOS).
                             �TIL EN APLICATIVOS DE AN�LISIS DE FICHEROS SEG�N SU TIPOLOG�A SEA N�MEROS O CARACTERES.                               

                    - DISPONE DE ALGUNOS M�TODOS EST�TICOS QUE DAN INFORMACI�N DE LOS TOKENS:
                            - TT_EOF:     -->  END OF FILE.
                            - TT_EOL:     -->  END OF LINE.
                            - TT_WORD:    -->  TIPO PALABRA.
                            - TT_NUMBER:  -->  TIPO N�MERO.
                                                    
            LineNumberReader  PERMITE ANALIZAR UN Stream POR L�NEAS.
            LineNumberReader  ES UN OBJETO DE TIPO BufferedReader QUE ALMACENA Y CUENTA EL N�MERO DE L�NEAS DE CARACTERES.

                - EST� ORIENTADA A TRABAJAR Y ANALIZAR L�NEAS COMPLETAS.
                - EMPIEZA LEYENDO POR LA PRIMERA L�NEA CON EL CONTADOR A 0.
                - CADA VEZ QUE ENCUENTRA UN RETORNO DE CARRO SUMA 1 A SU VALOR.

                - M�TODOS CLAVE DE ESTA CLASE:
                    - getLineNumber()        DEVUELVE EL N�MERO DE LA L�NEA EN LA QUE ESTEMOS ACTUALMENTE LEYENDO.
                    - setLineNumber()        SE LE PASA COMO PAR�METRO UN ENTERO, Y SE CONVERTIR� EN LA L�NEA ACTUAL.
                    - readLine()             DEVOLVER� UN CONJUNTO DE CARACTERES QUE SE LE DEBE ASIGNAR A UNA VARIABLE STRING.
                    - read()

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_06 + """
        ************************************************************************************************************************
                         
            DataInputStream Y DataOutputStream:  PERMITE PROCESAR TIPOS PRIMITIVOS DE JAVA.  (int, float, long, ETC...)
            ES �TIL CUANDO LA LECTURA EST� ORIENTADA A LOS TIPOS PRIMITIVOS.
            SE USA DataInputStream PARA LEER E INTERPRETAR FICHEROS ESCRITOS CON DataOutputStream.

                - DataInputStream:
                        - INTERPRETA TIPOS PRIMITIVOS DE JAVA,
                          FRENTE A InputStream QUE S�LO LE�A BYTES SIN ASOCIAR NINGUNA TIPOLOG�A.
                        - SUBCLASE DE InputStream --> HEREDA SUS M�TODOS:
                                - DISPONIBLE EL M�TODO read() PARA LEER BYTE A BYTE.
                                - TAMBI�N LA LECTURA CON UN ARRAY DE BYTES.
                        - MUY IMPORTANTE EN ESTA LECTURA SABER QU� TIPO DE DATOS VAMOS A LEER Y QU� ORDEN LLEVAN,
                          PORQUE CON TIPOS PRIMITIVOS LA LECTURA DEL N�MERO (-1) NO SE DISTINGUE DEL FIN DE FLUJO (TAMBI�N -1).

                - DataOutputStream:
                        ESCRIBE EN EL STREAM DISTINTOS TIPOS PRIMITIVOS DE JAVA USANDO DIFERENTES M�TODOS:
                                - writeInt()         INTRODUCIMOS   int,   SOLO ACEPTA COMO PAR�METRO TIPO   int.
                                - writeFloat()       INTRODUCIMOS   float, SOLO ACEPTA COMO PAR�METRO TIPO   float.
                                - writeLong()        INTRODUCIMOS   long,  SOLO ACEPTA COMO PAR�METRO TIPO   long.             

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05);                
                case "6" -> System.out.println(recurso_06);
                case "8" -> {
                    System.out.println(recurso_01);
                    continuar();
                    System.out.println(recurso_02);
                    continuar();
                    System.out.println(recurso_03);
                    continuar();
                    System.out.println(recurso_04);
                    continuar();
                    System.out.println(recurso_05);
                    continuar();
                    System.out.println(recurso_06);                    
                }
            }
            try {                
                menu = miTryRecursos();                
                switch (menu) {                   
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));   
    }
}