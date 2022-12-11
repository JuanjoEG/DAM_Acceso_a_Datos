package Tema_07;

import static Clases.Utilidades.esperar;
import static Clases.Utilidades.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class DefinicMapeoOR {
    
    public static void main(String[] args) {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
********************************************************************************************************************
*  TEMA 07                                     EL MAPEO OBJETO RELACIONAL  
********************************************************************************************************************
*                                       DEFINICI�N DEL MAPEO OBJETO RELACIONAL. ORM.
********************************************************************************************************************

    - JAVA ES UN LENGUAJE DE PROGRAMACI�N ORIENTADO A OBJETOS EL CUAL PUEDE SER REPRESENTADO EN UN DIAGRAMA DE OBJETOS;
      MIENTRAS QUE UNA BASE DE DATOS RELACIONAL SE REPRESENTA EN UN FORMATO TABULAR USANDO FILAS Y COLUMNAS.
           - CUANDO SE TRATA DE GRABAR UN OBJETO EN BASES DE DATOS, EXISTEN ALGUNAS DIFERENCIAS ENTRE ESTOS DOS SISTEMAS,
             QUE PUEDEN DAR LUGAR A PROBLEMAS: PARA SOLVENTARLO TENEMOS LA AYUDA DEL MAPEO OBJETO RELACIONAL. ORM.
                               
   - PODEMOS DEFINIR UN ORM COMO UN FRAMEWORK, UN MARCO DE TRABAJO,
     QUE FACILITA EL ALMACENAMIENTO DE LOS OBJETOS A UNA BASE DE DATOS RELACIONAL.
           - EN CUALQUIER BASE DE DATOS, EL NIVEL DE ELEMENTO M�S ALTO ES LA TABLA,
             DIVIDIDA A SU VEZ EN FILAS Y COLUMNAS.
                   - UNA COLUMNA CONTIENE VALORES EN UN TIPO DE DATO DETERMINADO.
                   - UNA FILA CONTENDR� UN CONJUNTO DE INFORMACI�N DE UNA TABLA DETERMINADA.
                               
           - SE MAPEAR�A UN OBJETO PLANO CON SU 'EQUIVALENTE' EN UNA FILA DE UNA BD RELACIONAL.
                   - DESDE LA BD RELACIONAL SE OBTENDR�A EL OBJETO EN EL OTRO SENTIDO.
                               
           - FLUJO DEL MAPEO OBJETO RELACIONAL:
                   1.- PARTIMOS DE UNA APLICACI�N CON OBJETOS DESARROLLADOS EN JAVA.
                   2.- PASAMOS POR UN FRAMEWORK QUE PREPARA ESOS OBJETOS EN ENTIDADES F�CILES DE PERSISTIR.
                   3.- LAS ENTIDADES SE ALMACENAN EN BASES DE DATOS.
                               
********************************************************************************************************************
*  0. SALIR.
********************************************************************************************************************

                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                  
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}