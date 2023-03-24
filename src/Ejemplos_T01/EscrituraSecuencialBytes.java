package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Juan José Estévez González
 */
public class EscrituraSecuencialBytes {
    
    public static void main(String[] args)   {
        
        String ruta = "E:\\TRABAJO\\Ejercicios\\salida.txt";
        String cadena = "Esto es una prueba de escritura";
        OutputStream file;
        
        byte[] arrayBytes = cadena.getBytes();                      // LA CADENA SE CONVIERTE EN UN ARRAY DE BYTES.
        
        try {
            file = new FileOutputStream(ruta);                  // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA.
            
            file.write(arrayBytes);                               // LO ESCRIBIMOS (MÉTODO write) CON EL CONTENIDO DEL ARRAY.
            
            file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS.
            
            System.out.println("Fichero escrito.");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}