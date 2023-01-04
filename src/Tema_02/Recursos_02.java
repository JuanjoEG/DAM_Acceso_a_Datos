package Tema_02;

import static Principal_Main.Main.*;
import static Tema_02.T_02.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_02 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_02 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
       
            LA FORMA MÁS HABITUAL DE ACCEDER Y MANEJAR INFORMACIÓN EN JAVA NO ES LEYENDO FICHEROS POR COMPLETO,
            SINO QUE ES MÁS PARECIDO A LOS BUFFERS, USAREMOS FLUJOS DE DATOS. --> STREAMS.
             
            -. DEFINICIÓN:
                         
                    ES UNA SECUENCIA ORDENADA DE INFORMACIÓN (FLUJOS DE INFORMACIÓN)
                    QUE POSEE UN RECURSO DE ENTRADA (FLUJO DE ENTRADA),
                    Y UN RECURSO DE SALIDA (FLUJO DE SALIDA).

                    LOS STREAMS SON UNIDIRECCIONALES. --> SE USAN SÓLO PARA LEER O SÓLO PARA ESCRIBIR.
                            
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
                         
            SEGÚN EL TIPO DE INFORMACIÓN A TRATAR:
                         
                    - TRATAMIENTO DE FICHEROS.
                    - TRATAMIENTO CON BUFFERS.
                    - TRATAMIENTO CON ARRAYS.
                    - TRATAMIENTO CON TUBERÍAS.
                    - TRATAMIENTO CON ANÁLISIS. (PARSING).
                    - TRATAMIENTO CON BLOQUES DE INFORMACIÓN. (TOKENS).
                                
                    CADA UNA DE ESTAS CATEGORÍAS VAN A PODER Y USAR DIFERENTES FUNCIONALIDADES,
                    A TRAVÉS DE DIFERENTES CLASES Y MÉTODOS,
                    COMO SE MUESTRA EN LA SIGUIENTE TABLA:
                                        
                    ***************************************************************************
                    *       TABLA DE TIPOS DE CLASES DE FLUJOS SEGÚN SU FUNCIONALIDAD         *
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

            - EL CONCEPTO DE TUBERÍAS, ASOCIADO A LOS HILOS (THREADS) ES DISTINTO EN JAVA QUE EN OTROS SISTEMAS:

                    - TUBERÍA EN EL LENGUAJE DE PROGRAMACIÓN JAVA:
                            - CAPACIDAD DE UTILIZAR DOS THREADS EJECUTÁNDOSE EN LA MISMA MÁQUINA VIRTUAL. (JVM).
                            - SON HILOS DIFERENTES, PERO PERTENECEN AL MISMO PROCESO.
                            - LAS TUBERÍAS EN LOS THREADS PUEDEN SER ORÍGENES O DESTINOS DE DATOS, PERO NO A LA VEZ.

                    - TUBERÍA EN SISTEMAS UNIX:
                            - DOS PROCESOS QUE SE EJECUTAN EN LUGARES DISTINTOS DE MEMORIA.
                            - LOS PROCESOS PUEDEN COMUNICARSE A TRAVÉS DE UNA TUBERÍA.

            - EJEMPLO TÍPICO DE UTILIZACIÓN DE TUBERÍAS EN JAVA:

                    - UN PROCESO CON 2 HILOS.
                            - UN HILO ESCRIBIENDO EN UN STREAM.
                            - OTRO HILO LEYÉNDOLO.

                    - EN EL ESPACO COMÚN A AMBOS THREADS, A NIVEL CLASE.                               
                            - SE CREARÁN PipedOutStream Y PipedInputStream.
                            - CONEXIÓN: 
                              LA INSTANCIA DE LA TUBERÍA PipedInputStream 
                              UTILIZARÁ EL PipedOutStream PREVIAMENTE CREADO.

                                   final PipedOutputStream salida = new PipedOutputStream();
                                   final PipedInputStream entrada = new PipedInputStream(salida);

                            - SE LANZARÁN --> start() --> LOS DOS THREADS.

                    - CADA HILO USARÁ UNA DE ELLAS, PERO AMBOS OBJETOS ESTARÁN DEFINIDOS A NIVEL DE CLASES. (SON COMUNES).

                            - EL THREADS QUE ESCRIBE EN LA TUBERÍA INSTANCIARÁ EL PipedOutputStream, 
                              HACIENDO REFERENCIA A UN OBJETO DE SALIDA.
                                    - PUEDE SER LA ESCRITURA DE UN FICHERO, O DIRECTAMENTE UNA CADENA DE TEXTO.

                            - EL THREADS QUE LEE, TIENE ACCESO A LOS BYTES QUE LLEGAN A LA TUBERÍA.

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

            - DIVIDIREMOS LAS CLASES BASADAS EN EL FLUJO DE ARRAYS SEGÚN EL TIPO DE ACCESO:

                    - ARRAYS DE BYTES:          -->  ByteArrayInputStream   -   ByteArrayOutputStream.

                    - ARRAYS DE CARACTERES:     -->  CharArrayReader        -   CharArrayWriter.
                                                      
            - CharArrayReader: PUEDE LEER ARRAY DE CARACTERES (char) COMO Stream DE CARACTERES.
                    - ES ÚTIL SI TENEMOS INFORMACIÓN EN ARRAYS DE CARACTERES Y HAY QUE PASARLO A ALGÚN COMPONENTE
                      QUE SOLO LEE DESDE LA CLASE Reader, O UNA SUBCLASE DE Reader.
                    - EN ESE CASO: ENCAPSULAMOS EL ARRAY NORMAL EN UN  -->  CharArrayReader
                      Y SE PASA AL COMPONENTE:
                    PASOS:                     
                            1. INSTANCIAR UN ARRAY DE CARACTER. (LO LLAMAREMOS 'chars').
                            2. PASAR POR PARÁMETROS EL ARRAY AL CREAR UN OBJETO DE LA CLASE   -->  CharArrayReader.
                                      DE ESTA FORMA, TENDRÍAMOS EN ESTA CLASE EL CONTENIDO DE TODO EL ARRAY.
                            3. YA TENEMOS LA INFORMACIÓN EN EL OBJETO 'charArrayReader' 
                                      --> PODEMOS IR LEYENDO LETRA A LETRA. (char). O LA OERACIÓN QUE SE DESEE.
                            4. EJECUTAMOS EL MÉTODO close(). -> CERRAR Y LIBERAR RECURSOS.

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
                         
            ANÁLISIS PREVIO:
            ANÁLISIS DE DATOS PREVIO DE UN InputStream:
                                                      
                    PushBackInputStream (A NIVEL DE BYTE)          -->  byte A byte
                    PushbackReader      (A NIVEL DE CARACTERES)

                        - LEEN CONTENIDO CON ANTICIPACIÓN PARA SABER QUÉ SE APROXIMA,
                          PARA ASÍ PODER INTERPRETAR EL CONTENIDO ACTUAL.

                        - ESTOS CONTENIDOS LEÍDOS CON ANTERIORIDAD,
                          SERÁN DE NUEVO 'EMPUJADOS' A LA SECUENCIA,
                          PARA LEERLOS POSTERIORMENTE CUANDO SE HAGA DE NUEVO read(). 

                        - unread(data)  --> DEVUELVE AL STREAM DE DATOS EL BYTE QUE HEMOS LEÍDO CON ANTERIORIDAD.                     
                                                      
            StreamTokenizer PERMITE ANALIZAR Strem POR tokens.
            TOKEN --> TROZO DEL CONTENIDO DEL FICHERO.
                                                    
                    - EVALUAR LOS TOKENS DETECTA SI SON PALABRAS NÚMEROS.

                    - RECONOCE IDENTIFICADORES. (NÚMEROS, COMILLAS, ESPACIOS).
                             ÚTIL EN APLICATIVOS DE ANÁLISIS DE FICHEROS SEGÚN SU TIPOLOGÍA SEA NÚMEROS O CARACTERES.                               

                    - DISPONE DE ALGUNOS MÉTODOS ESTÁTICOS QUE DAN INFORMACIÓN DE LOS TOKENS:
                            - TT_EOF:     -->  END OF FILE.
                            - TT_EOL:     -->  END OF LINE.
                            - TT_WORD:    -->  TIPO PALABRA.
                            - TT_NUMBER:  -->  TIPO NÚMERO.
                                                    
            LineNumberReader  PERMITE ANALIZAR UN Stream POR LÍNEAS.
            LineNumberReader  ES UN OBJETO DE TIPO BufferedReader QUE ALMACENA Y CUENTA EL NÚMERO DE LÍNEAS DE CARACTERES.

                - ESTÁ ORIENTADA A TRABAJAR Y ANALIZAR LÍNEAS COMPLETAS.
                - EMPIEZA LEYENDO POR LA PRIMERA LÍNEA CON EL CONTADOR A 0.
                - CADA VEZ QUE ENCUENTRA UN RETORNO DE CARRO SUMA 1 A SU VALOR.

                - MÉTODOS CLAVE DE ESTA CLASE:
                    - getLineNumber()        DEVUELVE EL NÚMERO DE LA LÍNEA EN LA QUE ESTEMOS ACTUALMENTE LEYENDO.
                    - setLineNumber()        SE LE PASA COMO PARÁMETRO UN ENTERO, Y SE CONVERTIRÁ EN LA LÍNEA ACTUAL.
                    - readLine()             DEVOLVERÁ UN CONJUNTO DE CARACTERES QUE SE LE DEBE ASIGNAR A UNA VARIABLE STRING.
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
            ES ÚTIL CUANDO LA LECTURA ESTÉ ORIENTADA A LOS TIPOS PRIMITIVOS.
            SE USA DataInputStream PARA LEER E INTERPRETAR FICHEROS ESCRITOS CON DataOutputStream.

                - DataInputStream:
                        - INTERPRETA TIPOS PRIMITIVOS DE JAVA,
                          FRENTE A InputStream QUE SÓLO LEÍA BYTES SIN ASOCIAR NINGUNA TIPOLOGÍA.
                        - SUBCLASE DE InputStream --> HEREDA SUS MÉTODOS:
                                - DISPONIBLE EL MÉTODO read() PARA LEER BYTE A BYTE.
                                - TAMBIÉN LA LECTURA CON UN ARRAY DE BYTES.
                        - MUY IMPORTANTE EN ESTA LECTURA SABER QUÉ TIPO DE DATOS VAMOS A LEER Y QUÉ ORDEN LLEVAN,
                          PORQUE CON TIPOS PRIMITIVOS LA LECTURA DEL NÚMERO (-1) NO SE DISTINGUE DEL FIN DE FLUJO (TAMBIÉN -1).

                - DataOutputStream:
                        ESCRIBE EN EL STREAM DISTINTOS TIPOS PRIMITIVOS DE JAVA USANDO DIFERENTES MÉTODOS:
                                - writeInt()         INTRODUCIMOS   int,   SOLO ACEPTA COMO PARÁMETRO TIPO   int.
                                - writeFloat()       INTRODUCIMOS   float, SOLO ACEPTA COMO PARÁMETRO TIPO   float.
                                - writeLong()        INTRODUCIMOS   long,  SOLO ACEPTA COMO PARÁMETRO TIPO   long.             

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