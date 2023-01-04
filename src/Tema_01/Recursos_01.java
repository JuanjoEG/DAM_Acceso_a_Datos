package Tema_01;

import static Principal_Main.Main.*;
import static Tema_01.T_01.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_01 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_01 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        ************************************************************************************************************************
                         
            -. DEFINICI�N Y TIPOS DE FICHEROS.
                    DEFINIMOS UN FICHERO COMO LA SUCESI�N DE bits QUE FINALMENTE
                    SON ALMACENADOS EN UN DETERMINADO DISPOSITIVO.
                    SE COMPONE DE NOMBRE Y EXTENSI�N.
               LOS METADATOS SER�N LAS PROPIEDADES DEL FICHERO.
          
                            2 GRANDES FAMILIAS:    * DE TEXTO (ASCII)
                                                   * BINARIOS              
                         
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
                       
            LA CLASE FILE --> java.io.File
            ES LA QUE CONTIENE LOS M�TODOS PARA LA GESTI�N DE FICHEROS:

                    *  INSTANCIAR UN OBJETO DE LA CLASE File.  (NO CONFUNDIR CON CREAR)
                              File fichero = new File("/carpeta/archivo");

                    *  CREAR FICHERO PREVIAMENTE INSTANCIADO.
                              fichero.createNewFile();

                    *  BORRADO DE UN FICHERO PREVIAMENTE INSTANCIADO. (Y DIRECTORIO)
                         fichero.delete();
                                                 
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
                       
            MOVER UN FICHERO. --> renameTo().

                    try {
                        File fileOrigen = new File("C:\\temp\\pruebas1.txt");
                        File fileDestino = new File("C:\\temp\\pruebas\\pruebas2.txt");

                        if (fileOrigen.renameTo(fileDestino)) {
                           System.out.println("El fichero se movi� correctamente!");
                        } else {
                           System.out.println("El fichero no pudo moverse!");
                    } catch (Exception e) {
                         e.printStackTrace();
                    }

                    USAR SIEMPRE BLOQUE try/catch  --> PARA TRABAJAR CON FICHEROS.
                   FICHERO ORIGEN Y DESTINO DEBEN EXISTIR  --> INSTANCIADOS + YA CREADO FICHERO 1 + RUTAS           
                         
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
                       
            LOS M�TODOS M�S USADOS DE LA CLASE File.
            
                        M � T O D O                     D E S C R I P C I � N

                    createNewFile()                 GENERA EL FICHERO INDICADO.
                    delete()                        BORRA EL FICHERO.
                    mkdirs()                        CREA DIRECTORIO INDICADO.
                    getName()                       DEVUELVE String CON NOMBRE DEL FICHERO.
                    getPath(),getAbsolutePath()     DEVUELVE LA RUTA RELATIVA Y ABSOLUTA.
                    getParent()                     DEVUELVE EL DIRECTORIO SUPERIOR.
                    renameTo()                      ACEPTA COMO PAR�METRO UN NUEVO File, EL CUAL SER� LA NUEVA RUTA DEL FICHERO.
                    canWrite(), canRead()           COMPRUEBA SI PUEDE SER ESCRITO O LE�DO.
                    listFiles()                     DEVUELVE UN ARRAY CON LOS FICHEROS DEL DIRECTORIO INDICADO.
                    lastModified()                  DEVUELVE LA FECHA DE LA �LTIMA MODIFICACI�N.
                         
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

            FORMAS DE ACCEDER A UN FICHERO: --> AL CONTENIDO DE ESE FICHERO. --> EL INTERIOR.

                    * ACCESO SECUENCIAL --> RECORRE TODA LA SECUENCIA DE CARACTERES O BYTES.
                                            HAY QUE PASAR POR TODOS LOS ANTERIORES. (BYTE A BYTE) O (CARACTER A CARACTER).
                                            PROCESA M�S INFORMACI�N -> CONLLEVA M�S TIEMPO -> CONSUME M�S RECURSOS.                                            

                    * ACCESO ALEATORIO O DIRECTO --> SE ESTABLECE UN PUNTERO (O �NDICE) EN BYTES,
                                       QUE INDICA LA POSICI�N EXACTA DE LECTURA O ESCRITURA DENTRO DEL FICHERO.
                                       PERMITE ACCEDER A UN REGISTRO O POSICI�N DETERMINADA DE NUESTRO FICHERO.
                                       SE CREA LA NECESIDAD DE GENERAR ESE �NDICE O PUNTERO, TIENE QUE EXISTIR.
                                       PROCESA MENOS INFORMACI�N -> CONLLEVA MENOS TIEMPO -> CONSUME MENOS RECURSOS.
                         
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

            * CLASES DE USO DE ACCESO SECUENCIAL CON BYTES:
                         
                               FACILITAN LA LECTURA O ESCRITURA DE UN FICHERO COMO UN 'STREAM' DE BYTES.
                               PRIMERO ES INSTANCIAR EL FICHERO INDICANDO LA RUTA
                               �LTIMO ES CERRAR EL FICHERO PARA LIBERAR RECURSOS. --> .close()

                                     - FileInputStream: LECTURA-ENTRADA DE DATOS.
                                          .read() --> PARA LEER UN BYTE.
                                     - FileOutputStream: ESCRITURA-SALIDA DE DATOS.
                                          .write() --> PARA ESCRIBIR UN BYTE.

            * CLASES DE USO DE ACCESO SECUENCIAL CON CARACTERES:  (BLOQUE DE CARACTERES)
                         
                               FACILITAN LA LECTURA O ESCRITURA DE UN FICHERO COMO UN 'STREAM' DE CARACTERES.
                               PRIMERO ES INSTANCIAR EL FICHERO INDICANDO LA RUTA
                               �LTIMO ES CERRAR EL FICHERO PARA LIBERAR RECURSOS. --> .close()

                                     - FileReader: LECTURA-ENTRADA DE DATOS.
                                          .read() --> PARA LEER UN CARACTER.
                                     - FileWriter: ESCRITURA-SALIDA DE DATOS.
                                          .write() --> PARA ESCRIBIR UN CARACTER.
                               CON FileWriter --> AL INTANCIAR --> SI NO EXISTE LA RUTA --> SE CREA LA RUTA Y EL FICHERO.
                                                                  
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_07 + """
        ************************************************************************************************************************
                         
            OPERACIONES GESTI�N DE FICHEROS. CLASES ASOCIADAS:
                    DIFERENCIAS ACCESO BYTES VS ACCESO CARACTERES.

                        - EL ACCESO A NIVEL DE BYTE ES UN ACCESO 'EN BRUTO' AL CONTENIDO DEL FICHERO.
                                - LAS CLASES Y LOS M�TODOS LEEN EL BYTE, QUE SE PODR� INTERPRETAR DE DIFERENTES MANERAS. (ENTERO O CARACTER)
                                - REQUIERE SOBRE EL PROGRAMADOR LA TAREA DE 'INTERPRETAR' LO QUE HA LE�DO.
                                - PARA ESCRIBIR UNA FRASE EN UN FICHERO A NIVEL BYTES,
                                  ANTES HAY QUE TRANSFORMAR LA FRASE A UNA SECUENCIA DE BYTES. 

                        - EL ACCESO A NIVEL DE FLUJOS O STREAMS DE CARACTERES EST� M�S INTERPLETADO.

            CLASES DE USO DE ACCESO ALEATORIO: INSTANCIACI�N Y POSICIONAMIENTO.

                    - RandomAccessFile --> PERMITE TRABAJAR CON UN FICHERO DE FORMA ALEATORIA, EN LOS MODOS:
                            -   r      --> LECTURA.
                            -  rw      --> LECTURA Y ESCRITURA.
                            - rwd      --> LECTURA Y ESCRITURA SINCRONIZADA. (DEL CONTENIDO).
                            - rws      --> LECTURA Y ESCRITURA SINCRONIZADA. (DEL CONTENIDO + METADATOS).
                                           METADATOS --> INFORMACI�N ADICIONAL AL CONTENIDO DEL FICHERO. (PROPIEDADES)

                    - INSTANCIACI�N:  -->  DOS CONSTRUCTORES:
                            CONSTRUCTOR 1:             
                                - EL PRIMER PAR�METRO:  --> EL OBJETO File DIRECTAMENTE.
                                - EL SEGUNDO PAR�METRO: --> ES EL MODO DE ACCESO. --> r, rw, rwd O rws.
                            CONSTRUCTOR 2:             
                                - EL PRIMER PAR�METRO:  --> LA RUTA DEL FICHERO COMO STRING.
                                - EL SEGUNDO PAR�METRO: --> ES EL MODO DE ACCESO. --> r, rw, rwd O rws.

                    - POSICIONAMIENTO EN EL FICHERO:
                            - M�TODO seek(POSICI�N):   --> POSICIONAMOS EN EL PUNTO (EL BYTE) QUE LE INDIQUEMOS DEL FICHERO. (TIPO long).
                            - M�TODO getFilePointer(): --> DEVUELVE LA POSICI�N DEL PUNTERO EN BYTES. (TIPO long).

            CLASES DE USO DE ACCESO ALEATORIO: LECTURA Y ESCRITURA.

                    UNA VEZ POSICIONADOS:

                    - LECTURA:
                        .read(): HACE LECTURA DE UN BYTE A PARTIR DE LA POSICI�N ACTUAL DEL PUNTERO.
                        .read(array_bytes_destino, posicion, bytes_a_leer):
                            PARA LEER M�S DE UN BYTE SE ESPECIFICA COMO PAR�METROS UN ARRAY. --> ALMACENA LO LEIDO.
                            LA POSICI�N DE INICIO DE LECTURA Y EL N�MERO DE BYTES A LEER.

                    - ESCRITURA:
                        .write(byte_a_escribir): ESCRIBE EL BYTE INDICADO EN LA POSICI�N ACTUAL DEL PUNTERO.
                            UNA VEZ ESCRITO EL CA�CTER EN EL FICHERO --> LA POSICI�N DEL PUNTERO AVANZAR� UNA UNIDAD.
                         
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_08 + """
        ************************************************************************************************************************
                             
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
                    * "rwd" --> LECTURA Y ESCRITURA -> FORMA S�NCRONA               *  *  BufferedWriter      *
                    * "rws" --> LECTURA Y ESCRITURA -> FORMA S�NCRONA + METADATOS   *  *  BufferedReader      *
                    *****************************************************************  ************************
                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_09 + """
        ************************************************************************************************************************

            UTILIZACI�N DE BUFFER --> MEMORIA INTERNA / MEMORIA INTERMEDIA)

                    - TODAS ESTAS CLASES DE TRATAMIENTO DE INFORMACI�N DE FICHEROS,
                      REALIZAN LAS OPERACIONES DE LECTURA O ESCRITURA CAPTURANDO BYTES DEL DISCO.

                    - OTRA POSIBILIDAD PARA EL ACCESO A LA INFORMACI�N DE LOS FICHEROS ES A TRAV�S DE BUFFERS:
                      LA INFORMACI�N SE ALMACENA EN BLOQUES DE BYTES COMPLETOS (BUFFER) EN MEMORIA INTERNA RAM.

                            - EL ACCESO A LA MEMORIA INTERNA ES MUCHO M�S R�PIDO QUE A DISCO,
                              A TRAV�S DEL BUFFER SE CONSIGUE M�S RAPIDEZ EN EL PROCESO.

                            - CUANDO TODA LA INFORMACI�N DEL BUFFER YA SE HA UTILIZADO Y SE NECESITA M�S DATOS,
                              SE VUELVE A VOLCAR OTRO BLOQUE DE BYTES A LA MEMORIA BUFFER.

                            - LA CANTIDAD DE MEMORIA INTERNA ES LIMITADA,
                              ES IMPORTANTE HACER UNA GESTI�N ADECUADA DE LOS RECURSOS.

            CLASES PARA LA REALIZACI�N DE OPERACIONES CON BUFFER:

                    - BufferedInputStream    
                    - BufferedOutputStream    
                    - BufferedWriter          
                    - BufferedReader                     

            PERMITEN LEER Y ESCRIBIR INFORMACI�N MEJORANDO EL RENDIMIENTO,
            EN COMPARACI�N CON FileInputStream O FileOutStream.

            LAS OPERACIONES DE ESCRITURA EN BUFFER SE REALIZAN EN MEMORIA RAM. PARA HACERLAS EFECTIVAS:
            .close()  -->  EL CONTENIDO DEL BUFFER SE VUELCA AL FICHERO. --> LIBERAS EL RECURSO.

        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_10 + """
        ************************************************************************************************************************

                    *******************************************************************************************
                    *        ESCRITURA SECUENCIAL BYTES.                FileOutputStream                      *
                    *******************************************************************************************               
                    *                                                                                         *
                    *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                    *     INSTANCIAR FICHERO (RUTA);                                                          *
                    *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                    *     CERRAR   --> FICHERO.close();                                                       *
                    *                                                                                         *
                    *******************************************************************************************

                    *******************************************************************************************
                    *        LECTURA   SECUENCIAL BYTES.                FileInputStream                       *
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
                         
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_11 + """
        ************************************************************************************************************************

                    *******************************************************************************************
                    *        ESCRITURA SECUENCIAL CARACTER.             FileWriter                            *
                    *******************************************************************************************               
                    *                                                                                         *
                    *     INSTANCIAR FICHERO (RUTA);                                                          *
                    *     ESCRIBIR --> FICHERO.write(STRING);                                                 *
                    *     CERRAR   --> FICHERO.close();                                                       *
                    *                                                                                         *
                    *******************************************************************************************

                    *******************************************************************************************
                    *        LECTURA   SECUENCIAL CARACTER.             FileReader                            *
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
                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_12 + """
        ************************************************************************************************************************

                    *******************************************************************************************
                    *        ESCRITURA ALEATORIO UN BYTE.               RandomAcessFile                       *
                    *******************************************************************************************               
                    *                                                                                         *
                    *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                    *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                    *     ESCRIBIR --> FICHERO.write(BYTE);                                                   *
                    *     CERRAR   --> FICHERO.close();                                                       *
                    *                                                                                         *
                    *******************************************************************************************

                    *******************************************************************************************
                    *        LECTURA   ALEATORIO UN BYTE.               RandomAcessFile                       *
                    *******************************************************************************************               
                    *                                                                                         *
                    *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                    *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                    *     LEER     --> BYTE = FICHERO.read();                                                 *
                    *     CASTING  --> CONTENIDO = (char)BYTE;                                                *
                    *     CERRAR   --> FICHERO.close();                                                       *
                    *                                                                                         *
                    *******************************************************************************************
                       
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_13 + """
        ************************************************************************************************************************

                    *******************************************************************************************
                    *        ESCRITURA ALEATORIA DE SECUENCIA DE BYTES.             RandomAcessFile           *
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
                    *       LECTURA ALEATORIA DE SECUENCIA CADENA DE BYTES.          RandomAcessFile          *
                    *******************************************************************************************               
                    *                                                                                         *
                    *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                    *     PUNTERO  --> FICHERO.seek(POSICION);                                                *
                    *     BYTE = FICHERO.read();                        LEER                                  *
                    *     BUCLE while |                                                                       *
                    *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                    *                 | BYTE = FICHERO.read();          LEER                                  *
                    *                 | if (CONTADOR==TAMA�O) break;    L�MITE                                *
                    *     CERRAR   --> FICHERO.close();                                                       *
                    *                                                                                         *
                    *******************************************************************************************
                             
        ************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """  
        ************************************************************************************************************************
        """ + punto_14 + """
        ************************************************************************************************************************

                    *******************************************************************************************
                    *        ESCRITURA CON BUFFER..                 BufferedOutputStream - FileOutputStream   *
                    *******************************************************************************************               
                    *                                                                                         *
                    *     PASAR STRING  -->  A UN ARRAY DE BYTES                                              *
                    *     INSTANCIAR FICHERO (RUTA, MODO);                                                    *
                    *     ESCRIBIR --> FICHERO.write(ARRAY);                                                  *
                    *     CERRAR   --> FICHERO.close();                                                       *
                    *                                                                                         *
                    *******************************************************************************************

                    *******************************************************************************************
                    *        LECTURA   CON BUFFER.                  BufferedInputStream - FileInputStream     *
                    *******************************************************************************************               
                    *                                                                                         *
                    *     INSTANCIAR FICHERO (RUTA, TAMA�O_BUFFER);                                           *
                    *     BYTE = FICHERO.read();                        LEER                                  *
                    *     BUCLE while |                                                                       *
                    *                 | CONTENIDO += (char)BYTE;        CASTING                               *
                    *                 | BYTE = FICHERO.read();          LEER                                  *
                    *     CERRAR   --> FICHERO.close();                                                       *
                    *                                                                                         *
                    *******************************************************************************************
                                                      
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
                case "7" -> System.out.println(recurso_07);
                case "8" -> System.out.println(recurso_08);
                case "9" -> System.out.println(recurso_09);
                case "10" -> System.out.println(recurso_10);
                case "11" -> System.out.println(recurso_11);
                case "12" -> System.out.println(recurso_12);
                case "13" -> System.out.println(recurso_13);
                case "14" -> System.out.println(recurso_14);
                
                case "16" -> {
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
                    continuar();
                    System.out.println(recurso_07);
                    continuar();
                    System.out.println(recurso_08);
                    continuar();
                    System.out.println(recurso_09);
                    continuar();
                    System.out.println(recurso_10);
                    continuar();
                    System.out.println(recurso_11);
                    continuar();
                    System.out.println(recurso_12);
                    continuar();
                    System.out.println(recurso_13);
                    continuar();
                    System.out.println(recurso_14);
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