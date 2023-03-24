package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class LecturaAleatoriaByte {
    
    public static void main(String[] args) {
        
        char caracter;
        RandomAccessFile file;                                     // ESTA CLASE TIENE EL CIERRE AUTOM�TICO DEL FLUJO.
        String ruta = "E:\\TRABAJO\\Ejercicios\\salida3.txt";
        
        try {
            
            file = new RandomAccessFile (ruta, "r");       // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA Y MODO DE ACCESO.            
            
            file.seek(8);                                       // POSICIONAMOS EL PUNTERO EN EL BYTE N� 8 DE LA CADENA DE TEXTO DEL FICHERO.
                                                                    // ACEPTA COMO PAR�METRO UN OBJETO DE TIPO long (ENTERO DE 8 BYTES).
                                                                    
            long filePointer = file.getFilePointer();               // PODEMOS OBTENER LA POSICI�N DEL PUNTERO EN BYTES.                       
            
            int unByte = file.read();                               // ACCEDEMOS AL BYTE DEL FICHERO. NOS DEVUELVE UN ENTERO.
            
            caracter = (char)unByte;                                // HACEMOS UN CASTING PARA CONVERTIR EL DATO (ENTERO) EN UN CARACTER.
            
            file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS. OPCIONAL.
            
            System.out.println("Caracter N�       --> " + unByte);
            System.out.println("Caracter Valor    --> " + caracter);
            System.out.println("Caracter Posici�n --> " + filePointer);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();        
        } catch (IOException e) {
            e.printStackTrace();   
        }
    }
}