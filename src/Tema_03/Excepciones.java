package Tema_03;

import static Clases.Utilidades.continuar;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                               *                            DURANTE LA COMPILACI�N                         *
                               *                                                                           *
                               *       - UNCHECKED EXCEPTIONS (SIN CHEQUEO)  RunTimeExceptionS             *
                               *                            EN TIEMPO DE EJECUCI�N                         *
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
                               *   LOS M�TODOS PRINCIPALES PARA GESTIONAR EXCEPCIONE:                      *
                               *                                                                           *
                               *   getMessage()       -> DEVUELVE MENSAJE DETALLADO SOBRE LA EXCEPCI�N     *
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
                               *   FORMAS DE TRATAR UNA EXCEPCI�N:                                         *
                               *   1�- A�ADIR LA EXCEPCI�N A LA DEFINICI�N DEL M�TODO -> PASA A OTRO NIVEL.*
                               *   2�- CONTR�L MEDIANTE LOS BLOQUES  -->  try-catch                        *
                               *       LOS BLOQUES  try-catch  SE PONDR�N EN EL PROGRAMA PRINCIPAL.        *
                               *****************************************************************************
                               *   SI LA EXCEPCI�N SE DA EN UN M�TODO  -->  A�ADIR  throws  Y...           *
                               *   LA EJECUCI�N SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
                               *****************************************************************************
                               *          SI QUEREMOS LANZAR NOSOTROS UNA EXCEPCI�N:                       *
                               *   thow new MiException(); --> PODEMOS PERSONALIZAR LA EXCEPCI�N.          *
                               *****************************************************************************
                               *   EN EL PROGRAMA PRINCIPAL:                                               *
                               *                                                                           *
                               *    try {                                                                  *
                               *        BLOQUE QUE PUEDE GENERAR LA EXCEPCI�N;                             *
                               *        C�DIGO PROTEGIDO;                                                  *
                               *    } catch (TipoException e) {                                            *
                               *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCI�N;                        *
                               *        e.printStackTrace();                                               *
                               *        System.out.println("Error: " + e.toString());                      *
                               *        System.out.println("Error: " + e.getMessage());                    *
                               *        System.out.println("La Excepci�n es: " + e.getClass());            *
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
                               *   SU NOMBRE DEBER� TERMINAR EN  ...Exception                              *
                               *   TENDR� UN CONSTRUCTOR QUE LE LLEGA UN String COMO PAR�METRO.            *
                               *   String  -->  MENSAJE DE NUESTRO ERROR PERSONALIZADO.                    *
                               *****************************************************************************
                               *   SI SE DAN LAS CONDICIONES REQUERIDAS DE LA EXCEPCI�N ...                *
                               *   SE LANZA NUESTRA EXCEPCI�N CON EL C�DIGO:                               *
                               *                                                                           *
                               *   throw new TipoException(String);                                        *
                               *                                                                           *
                               *****************************************************************************
                               *   SI LA EXCEPCI�N SE DA EN UN M�TODO  -->  A�ADIR  throws  Y...           *
                               *   LA EJECUCI�N SE VA AL catsh DEL PROGRAMA PRINCIPAL.                     *
                               *                                                                           *
                               *   private static void unMetodo() throws TipoException {                   *
                               *        ...                                                                *
                               *        if (CONDICI�N) {                                                   *
                               *            throw new TipoException("��� No es correcto !!!");             *
                               *        }                                                                  *
                               *        ...                                                                *
                               *   }                                                                       *
                               *                                                                           *
                               *****************************************************************************
                               *   EN LA CLASE EXCEPCI�N PERSONALIZADA:                                    *
                               *                                                                           *
                               *  public class TipoException extends Exception {                           *
                               *                                                                           *
                               *      public TipoException (String mensajeError) {                         *
                               *          super(mensajeError);                                             *
                               *      }                                                                    *
                               *  }                                                                        *
                               *                                                                           *
                               *****************************************************************************
                               *  0. ATR�S.                                                                *
                               *****************************************************************************                                                              
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}