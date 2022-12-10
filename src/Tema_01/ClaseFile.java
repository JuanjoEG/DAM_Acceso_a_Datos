package Tema_01;

import static Clases.Utilidades.continuar;
import static Clases.Utilidades.meterEspacios;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class ClaseFile {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ********************************************************************************************************************
        *  TEMA 01            INTRODUCCI�N AL MANEJO DE FICHEROS                          
        ********************************************************************************************************************
        *  1/3                            LA CLASE File
        ********************************************************************************************************************
        *
        *  LA CLASE FILE --> java.io.File
        *  ES LA QUE CONTIENE LOS M�TODOS PARA LA GESTI�N DE FICHEROS:
        *
        *     *  INSTANCIAR UN OBJETO DE LA CLASE File.  (NO CONFUNDIR CON CREAR)
        *               File fichero = new File("/carpeta/archivo");
        *
        *     *  CREAR FICHERO PREVIAMENTE INSTANCIADO.
        *               fichero.createNewFile();
        *
        *     *  BORRADO DE UN FICHERO PREVIAMENTE INSTANCIADO. (Y DIRECTORIO)
        *               fichero.delete();
        *
        ********************************************************************************************************************
                               
                              """);
            continuar();
            System.out.println("""
                               
        ********************************************************************************************************************
        *  TEMA 01            INTRODUCCI�N AL MANEJO DE FICHEROS                          
        ********************************************************************************************************************
        *  2/3                            LA CLASE File
        ********************************************************************************************************************
        *     MOVER UN FICHERO. --> renameTo()
        *
        *   try {
        *       File fileOrigen = new File("C:\\temp\\pruebas1.txt");
        *       File fileDestino = new File("C:\\temp\\pruebas\\pruebas2.txt");
        *
        *       if (fileOrigen.renameTo(fileDestino)) {
        *          System.out.println("El fichero se movi� correctamente!");
        *       } else {
        *          System.out.println("El fichero no pudo moverse!");
        *   } catch (Exception e) {
        *        e.printStackTrace();
        *   }
        *
        *   USAR SIEMPRE BLOQUE try/catch  --> PARA TRABAJAR CON FICHEROS.
        *   FICHERO ORIGEN Y DESTINO DEBEN EXISTIR  --> INSTANCIADOS + YA CREADO FICHERO 1 + RUTAS 
        ********************************************************************************************************************
                               
                                      """);
                    continuar();
                    System.out.println(""" 
                                       
        ********************************************************************************************************************
        *  TEMA 01            INTRODUCCI�N AL MANEJO DE FICHEROS                          
        ********************************************************************************************************************
        *  3/3                            LA CLASE File
        ********************************************************************************************************************
        *   LOS M�TODOS M�S USADOS DE LA CLASE File.
        *
        *     M � T O D O                     D E S C R I P C I � N
        *
        *   createNewFile()                 GENERA EL FICHERO INDICADO.
        *   delete()                        BORRA EL FICHERO.
        *   mkdirs()                        CREA DIRECTORIO INDICADO.
        *   getName()                       DEVUELVE String CON NOMBRE DEL FICHERO.
        *   getPath(),getAbsolutePath()     DEVUELVE LA RUTA RELATIVA Y ABSOLUTA.
        *   getParent()                     DEVUELVE EL DIRECTORIO SUPERIOR.
        *   renameTo()                      ACEPTA COMO PAR�METRO UN NUEVO File, EL CUAL SER� LA NUEVA RUTA DEL FICHERO.
        *   canWrite(), canRead()           COMPRUEBA SI PUEDE SER ESCRITO O LE�DO.
        *   listFiles()                     DEVUELVE UN ARRAY CON LOS FICHEROS DEL DIRECTORIO INDICADO.
        *   lastModified()                  DEVUELVE LA FECHA DE LA �LTIMA MODIFICACI�N.
        *
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
                    default -> System.out.println("\n ��� LA OPCI�N NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}