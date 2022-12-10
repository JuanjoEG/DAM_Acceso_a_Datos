package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class LecturaAleatoriaDeSecuenciaDeBytes2 {
    
    public static void main(String[] args) {
        
        char caracter;
        RandomAccessFile file;                                     // ESTA CLASE TIENE EL CIERRE AUTOM�TICO DEL FLUJO.
        String ruta = "J:\\Ejercicios\\salida4.txt";
        int inicioPuntero = 8;
        int size = 9;
        byte[] arrayBytes = new byte[size+inicioPuntero];        // CREAMOS UN ARRAY DE TAMA�O SUFICIENTE PARA GUARDAR LA LECTURA DEL FICHERO.
                                                                 // NECESITAMOS OBLIGATORIAMENTE CREARLO DE TAMA�O 9+8
                                                                 // EL PUNTERO CUANDO APUNTA AL PRIMER BYTE LO GUARDA EN LA POSICI�N 8 DEL ARRAY.
                                                                 // Y CUANDO APUNTA A LA �LTIMA POSICI�N LO GUARDA EN LA 17.
                                                                 // SOLO TENDR� 10 ELEMENTOS, PERO ESTAR�N OCUPANDO LAS 9 ULTIMAS POSICIONES DE LAS 17.
        try {
            
            file = new RandomAccessFile (ruta, "r");       // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA Y MODO DE ACCESO.            
            
            file.seek(inicioPuntero);                           // POSICIONAMOS EL PUNTERO EN EL BYTE N� 8 DE LA CADENA DE TEXTO DEL FICHERO.
                                                                    // ACEPTA COMO PAR�METRO UN OBJETO DE TIPO long (ENTERO DE 8 BYTES).
                                                                    // TAMBI�N DE TIPO ENTERO TIPO int.                                 
            
            int bytesLeidos = file.read(arrayBytes, inicioPuntero, size);  // ACCEDEMOS A LOS BYTES DEL FICHERO. NOS DEVUELVE UN ENTERO.         
                                                                                    // METE EN EN ARRAY LOS BYTES DEL N� 8 AL N� 17.
                                                                                    
            System.out.println("Bytes Leidos      --> " + bytesLeidos);             // POR TANTO LOS BYTES LEIDOS SON 9.
            
           for (byte i : arrayBytes) {                             // RECORREMOS EL ERRAY.
                caracter = (char)i;                                // HACEMOS UN CASTING PARA CONVERTIR EL DATO (ENTERO) EN UN CARACTER.
                System.out.print(caracter);                      // SACAMOS POR PANTALLA LOS CARACTERES.
                                                                   // SOLO SACAR� LOS CARACTERES V�LIDOS. (LOS 9 �LTIMOS).
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