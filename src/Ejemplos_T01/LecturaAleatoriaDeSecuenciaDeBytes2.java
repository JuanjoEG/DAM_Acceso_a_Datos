package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan José Estévez González
 */
public class LecturaAleatoriaDeSecuenciaDeBytes2 {
    
    public static void main(String[] args) {
        
        char caracter;
        RandomAccessFile file;                                     // ESTA CLASE TIENE EL CIERRE AUTOMÁTICO DEL FLUJO.
        String ruta = "J:\\Ejercicios\\salida4.txt";
        int inicioPuntero = 8;
        int size = 9;
        byte[] arrayBytes = new byte[size+inicioPuntero];        // CREAMOS UN ARRAY DE TAMAÑO SUFICIENTE PARA GUARDAR LA LECTURA DEL FICHERO.
                                                                 // NECESITAMOS OBLIGATORIAMENTE CREARLO DE TAMAÑO 9+8
                                                                 // EL PUNTERO CUANDO APUNTA AL PRIMER BYTE LO GUARDA EN LA POSICIÓN 8 DEL ARRAY.
                                                                 // Y CUANDO APUNTA A LA ÚLTIMA POSICIÓN LO GUARDA EN LA 17.
                                                                 // SOLO TENDRÁ 10 ELEMENTOS, PERO ESTARÁN OCUPANDO LAS 9 ULTIMAS POSICIONES DE LAS 17.
        try {
            
            file = new RandomAccessFile (ruta, "r");       // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA Y MODO DE ACCESO.            
            
            file.seek(inicioPuntero);                           // POSICIONAMOS EL PUNTERO EN EL BYTE Nº 8 DE LA CADENA DE TEXTO DEL FICHERO.
                                                                    // ACEPTA COMO PARÁMETRO UN OBJETO DE TIPO long (ENTERO DE 8 BYTES).
                                                                    // TAMBIÉN DE TIPO ENTERO TIPO int.                                 
            
            int bytesLeidos = file.read(arrayBytes, inicioPuntero, size);  // ACCEDEMOS A LOS BYTES DEL FICHERO. NOS DEVUELVE UN ENTERO.         
                                                                                    // METE EN EN ARRAY LOS BYTES DEL Nº 8 AL Nº 17.
                                                                                    
            System.out.println("Bytes Leidos      --> " + bytesLeidos);             // POR TANTO LOS BYTES LEIDOS SON 9.
            
           for (byte i : arrayBytes) {                             // RECORREMOS EL ERRAY.
                caracter = (char)i;                                // HACEMOS UN CASTING PARA CONVERTIR EL DATO (ENTERO) EN UN CARACTER.
                System.out.print(caracter);                      // SACAMOS POR PANTALLA LOS CARACTERES.
                                                                   // SOLO SACARÁ LOS CARACTERES VÁLIDOS. (LOS 9 ÚLTIMOS).
            }
           
           file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS. OPCIONAL.
            System.out.println("");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();        
        } catch (IOException e) {
            e.printStackTrace();   
        }
    }
}