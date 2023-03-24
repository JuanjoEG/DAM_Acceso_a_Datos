
package Ejemplos_T01;

import java.io.File;

/**
 *
 * @author Juan José Estévez González
 */

public class MoverFichero {
    
    public static void main(String[] args) {
        
        try {    
            File fileOrig = new File ("E:\\TRABAJO\\Ejercicios\\salida.txt");
            File fileDest = new File ("E:\\TRABAJO\\Ejercicios\\salida3.txt");

            if (fileOrig.renameTo(fileDest)) {
                System.out.println("El Fichero se movió correctamente!");
            } else {
                System.out.println("El Fichero no pudo moverse!");
                System.out.println("Es posible que el Fichero de Destino ya existiera!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}