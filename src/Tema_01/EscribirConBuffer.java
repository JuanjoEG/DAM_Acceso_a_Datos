package Tema_01;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Juan José Estévez González
 */
public class EscribirConBuffer {
    
    public static void main(String[] args) {
        
        try {    
            int bufferSize = 8;                                        // TAMAÑO DEL BUFFER
            
            String cadena = "Esto es una prueba de escritura";
            String ruta = "J:\\Ejercicios\\salida5.txt";
            
            byte[] arrayBytes = cadena.getBytes();                      // LA CADENA SE CONVIERTE EN UN ARRAY DE BYTES.

            BufferedOutputStream file = new BufferedOutputStream(new FileOutputStream(ruta), bufferSize);  // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA.          

            file.write(arrayBytes);                               // LO ESCRIBIMOS (MÉTODO write) CON EL CONTENIDO DEL ARRAY.
            
            file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS.                
                        
            System.out.println("Fichero escrito.");            
            
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}