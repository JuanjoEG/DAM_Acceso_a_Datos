package Tema_01;

import static Clases.Utilidades.continuar;
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
                               
        **********************************************************************************
        *                              LA CLASE File                                     *
        **********************************************************************************
        *                                                                                *
        *  1. *  INSTANCIAR UN OBJETO DE LA CLASE File.                                  *
        *     *  CREAR DICHO FICHERO.                                                    *
        *     *  PARA LA ELIMINACI�N DEL FICHERO. (FICHEROS Y DIRECTORIOS).              *
        *  2. MOVER UN FICHERO.                                                          *
        *  3. LOS M�TODOS M�S USADOS DE LA CLASE File.                                   *
        *                                                                                *
        **********************************************************************************
        *  0. SALIR.                                                                     *
        **********************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        System.out.println("""
                                                    
                                        INSTANCIAR UN OBJETO DE LA CLASE File:
                                           
                                           File fichero = new File("/carpeta/archivo");
                                                    
                                                    """);
                                            
                   
                        System.out.println("""
                                           
                                        CREAR DICHO FICHERO:
                                           
                                           fichero.createNewFile();
                                           
                                           """);
                        
                    
                        System.out.println("""
                                           
                                        PARA LA ELIMINACI�N DEL FICHERO. (FICHEROS Y DIRECTORIOS):
                                           
                                           fichero.delete();
                                           
                                           """);
                        continuar();
                    }
                    case "2" -> {
                        System.out.println("""
                                           
                                    *******************************************************************************       
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
                                    *******************************************************************************           
                                           
                                           """);
                        continuar();
                    }
                    case "3" -> {
                        System.out.println("""
                                           
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
                                           
                                           """);
                        continuar();
                    }
                    
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