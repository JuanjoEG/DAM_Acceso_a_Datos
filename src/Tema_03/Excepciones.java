package Tema_03;

import static Clases.Utilidades.continuar;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Excepciones {
    
    public static void main(String[] args) {
        
        String menu;
        do {            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                        
                               
                               *****************************************************************************
                               *                                EXCEPCIONES                                *
                               *****************************************************************************
                               *  TRES TIPOS:                                                              *
                               *                                                                           *
                               *       - CHECKED EXCEPTIONS (CON CHEQUEO)                                  *
                               *                            DURANTE LA COMPILACIÓN                         *
                               *                                                                           *
                               *       - UNCHECKED EXCEPTIONS (SIN CHEQUEO)  RunTimeExceptionS             *
                               *                            EN TIEMPO DE EJECUCIÓN                         *
                               *                                                                           *
                               *       - ERRORES (FUERA DEL CONTROL DEL USUARIO Y DESARROLLADOR)           *
                               *                                                                           *
                               *****************************************************************************
                               *   TODAS HEREDAN DE LA CLASE  -->  Throwable  (SUPERCLASE)                 *
                               *                                    | Exception  (SUBCLASE)                *
                               *                                    | Error      (SUBCLASE)                *
                               *                                                                           *
                               *   Throwable IMPLEMENTA LA INTERFAZ SERIALIZABLE                           *
                               *****************************************************************************
                               *   LOS MÉTODOS PRINCIPALES PARA GESTIONAR EXCEPCIONE:                      *
                               *                                                                           *
                               *   getMessage()       -> DEVUELVE MENSAJE DETALLADO SOBRE LA EXCEPCIÓN     *
                               *   getCause()         -> DEVELVE LA CAUSA EN UN OBJETO Throwable           *
                               *   toString()         -> DEVUELVE EL NOMBRE + getMessage()                 *
                               *   printStackTrace()  -> IMPRIME toString() + ERROR DE LA PILA             *
                               *   getStackTrace()    -> DEVUELVE UN ARRAY CON LOS ELEMENTOS DE LA PILA    *
                               *   fillInstackTrace() -> RELLENA LA PILA DEL OBJETO Throwable              *
                               *****************************************************************************                                                      
                               
                               """);
            continuar();
            
            System.out.println("""                       
                                                                                   
                               *****************************************************************************
                               *   FORMAS DE TRATAR UNA EXCEPCIÓN:                                         *
                               *   1º- AÑADIR LA EXCEPCIÓN A LA DEFINICIÓN DEL MÉTODO -> PASA A OTRO NIVEL.*
                               *   2º- CONTRÓL MEDIANTE LOS BLOQUES  -->  try-catch                        *
                               *       LOS BLOQUES  try-catch  SE PONDRÁN EN EL PROGRAMA PRINCIPAL.        *
                               *****************************************************************************
                               *   SI LA EXCEPCIÓN SE DA EN UN MÉTODO  -->  AÑADIR  throws  Y...           *
                               *   LA EJECUCIÓN SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
                               *****************************************************************************
                               *          SI QUEREMOS LANZAR NOSOTROS UNA EXCEPCIÓN:                       *
                               *   thow new MiException(); --> PODEMOS PERSONALIZAR LA EXCEPCIÓN.          *
                               *****************************************************************************
                               *   EN EL PROGRAMA PRINCIPAL:                                               *
                               *                                                                           *
                               *    try {                                                                  *
                               *        BLOQUE QUE PUEDE GENERAR LA EXCEPCIÓN;                             *
                               *        CÓDIGO PROTEGIDO;                                                  *
                               *    } catch (TipoException e) {                                            *
                               *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCIÓN;                        *
                               *        e.printStackTrace();                                               *
                               *        System.out.println("Error: " + e.toString());                      *
                               *        System.out.println("Error: " + e.getMessage());                    *
                               *        System.out.println("La Excepción es: " + e.getClass());            *
                               *    } finaly {                                                             *
                               *        BLOQUE QUE SIEMPRE SE EJECUTA;                                     *
                               *        CIERRE DE RECURSOS.                                                *
                               *    }                                                                      *
                               *                                                                           *
                               *****************************************************************************
                               *   UN try    -->  PUEDE TENER VARIOS catch  -->  MULTICATCH                *
                               *   UN catch  -->  TIENE QUE TENER UN try OBLIGATORIAMENTE                  *
                               *****************************************************************************
                                                       
                               """);
            continuar();
            
            System.out.println("""                          
                               
                               *****************************************************************************
                               *                       EXCEPCIONES PERSONALIZADAS                          *
                               *****************************************************************************
                               *   SU NOMBRE DEBERÁ TERMINAR EN  ...Exception                              *
                               *   TENDRÁ UN CONSTRUCTOR QUE LE LLEGA UN String COMO PARÁMETRO.            *
                               *   String  -->  MENSAJE DE NUESTRO ERROR PERSONALIZADO.                    *
                               *****************************************************************************
                               *   SI SE DAN LAS CONDICIONES REQUERIDAS DE LA EXCEPCIÓN ...                *
                               *   SE LANZA NUESTRA EXCEPCIÓN CON EL CÓDIGO:                               *
                               *                                                                           *
                               *   throw new TipoException(String);                                        *
                               *                                                                           *
                               *****************************************************************************
                               *   SI LA EXCEPCIÓN SE DA EN UN MÉTODO  -->  AÑADIR  throws  Y...           *
                               *   LA EJECUCIÓN SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
                               *                                                                           *
                               *   private static void unMetodo() throws TipoException {                   *
                               *        ...                                                                *
                               *        if (CONDICIÓN) {                                                   *
                               *            throw new TipoException("¡¡¡ No es correcto !!!");             *
                               *        }                                                                  *
                               *        ...                                                                *
                               *   }                                                                       *
                               *                                                                           *
                               *****************************************************************************
                               *   EN LA CLASE EXCEPCIÓN PERSONALIZADA:                                    *
                               *                                                                           *
                               *  public class TipoException extends Exception {                           *
                               *                                                                           *
                               *      public TipoException (String mensajeError) {                         *
                               *          super(mensajeError);                                             *
                               *      }                                                                    *
                               *  }                                                                        *
                               *                                                                           *
                               *****************************************************************************
                               *  0. ATRÁS.                                                                *
                               *****************************************************************************                                                              
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}