package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 *
 * @author Juan José Estévez González
 */
public class EscrituraAleatoriaDeSecuenciaDeBytes {
    
    public static void main(String[] args) {
        
        try {
        
            String ruta = "J:\\Ejercicios\\salida.txt";
            String cadena = "Esto es una prueba de escritura";
            int inicioPuntero = 8;
            RandomAccessFile file;
        
            byte[] arrayBytes = cadena.getBytes();                  // LA CADENA SE CONVIERTE EN UN ARRAY DE BYTES.        
        
            file = new RandomAccessFile(ruta, "rw");       // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA Y MODO DE ACCESO.
            
            file.seek(inicioPuntero);                           // POSICIONAMOS EL PUNTERO EN EL BYTE Nº 8 DE LA CADENA DE TEXTO DEL FICHERO.
            
            file.write(arrayBytes);                               // LO ESCRIBIMOS (MÉTODO write) CON EL CONTENIDO DEL ARRAY.
            
            file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS. OPCIONAL.
            
            System.out.println("Fichero escrito.");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}