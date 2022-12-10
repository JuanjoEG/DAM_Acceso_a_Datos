package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan José Estévez González
 */
public class EscrituraAleatoriaByte {
    
    public static void main(String[] args) {
        
        long posicion = 8;
        int unByte = 68;
        char caracter;
        RandomAccessFile file;                                     // ESTA CLASE TIENE EL CIERRE AUTOMÁTICO DEL FLUJO.
        String ruta = "J:\\Ejercicios\\salida3.txt";
        
        try {
            
            file = new RandomAccessFile (ruta, "rw");      // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA Y MODO DE ACCESO.            
            
            file.seek(posicion);                                // POSICIONAMOS EL PUNTERO EN EL BYTE Nº 8 DE LA CADENA DE TEXTO DEL FICHERO.
                                                                    // ACEPTA COMO PARÁMETRO UN OBJETO DE TIPO long (ENTERO DE 8 BYTES).
                                                                    
            long filePointer = file.getFilePointer();               // PODEMOS OBTENER LA POSICIÓN DEL PUNTERO EN BYTES.                       
            
            file.write(unByte);                                   // ESCRIBIMOS EN LA POSICIÓN 8 EL CARACTER 68 ->(D). 
                                                                    // ACEPTA COMO PARÁMETRO UN OBJETO DE TIPO int.
                                                                    // UNA VEZ ESCRITO --> EL PUNTERO AVANZA UNA POSICIÓN.
                                                                    
            long filePointer2 = file.getFilePointer();              // PODEMOS OBTENER LA NUEVA POSICIÓN DEL PUNTERO EN BYTES.
            
            caracter = (char)unByte;                                // HACEMOS UN CASTING PARA CONVERTIR EL DATO (ENTERO) EN UN CARACTER.
            
            file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS. OPCIONAL.
            
            System.out.println("Caracter Nº         --> " + unByte);
            System.out.println("Caracter Valor      --> " + caracter);
            System.out.println("Caracter Posición 1 --> " + filePointer);
            System.out.println("Caracter Posición 2 --> " + filePointer2);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();        
        } catch (IOException e) {
            e.printStackTrace();   
        }
    }
}