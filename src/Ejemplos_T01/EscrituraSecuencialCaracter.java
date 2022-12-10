package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Juan José Estévez González
 */
public class EscrituraSecuencialCaracter {
    
    public static void main(String[] args)   {
        
        String ruta = "J:\\Ejercicios\\salida2.txt";
        String cadena = "Esto es una prueba de escritura";
        Writer file;
        
        try {
            file = new FileWriter(ruta);                    // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA.
            
            file.write(cadena);                                 // LO ESCRIBIMOS (MÉTODO write).
            
            file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS.
            
            System.out.println("Fichero escrito.");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}