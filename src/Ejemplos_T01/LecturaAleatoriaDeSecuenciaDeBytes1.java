package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan José Estévez González
 */
public class LecturaAleatoriaDeSecuenciaDeBytes1 {
    
    public static void main(String[] args) {
        
        char caracter;
        int unByte = 0;
        String contenido = "";
        RandomAccessFile file;                                     // ESTA CLASE TIENE EL CIERRE AUTOMÁTICO DEL FLUJO.
        String ruta = "E:\\TRABAJO\\Ejercicios\\salida4.txt";
        int inicioPuntero = 8;
        int size = 9;
        int contador = 0;
        
        
        try {
            
            file = new RandomAccessFile (ruta, "r");       // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA Y MODO DE ACCESO.            
            
            file.seek(inicioPuntero);                           // POSICIONAMOS EL PUNTERO EN EL BYTE Nº 8 DE LA CADENA DE TEXTO DEL FICHERO.
                                                                    // ACEPTA COMO PARÁMETRO UN OBJETO DE TIPO long (ENTERO DE 8 BYTES).
                                                                    // TAMBIÉN DE TIPO ENTERO TIPO int.                                 
            
            unByte = file.read();                                   // ACCEDEMOS AL PRIMER BYTE DEL FICHERO. NOS DEVUELVE UN ENTERO.
            
            while (unByte!=-1) {                                    // AL LLEGAR AL CARÁCTER DE CÓDIGO -1 RECONOCE EL FINAL DEL FICHERO.
                
                contenido += (char)unByte;                          // VAMOS BYTE A BYTE MONTANDO EL CONTENIDO.
                                                                    // HACEMOS UN CASTING PARA CONVERTIR EL DATO (ENTERO) EN UN CARACTER.
                unByte = file.read();
                contador ++;
                if (contador==size) break;                          // LIMITAMOS LA LECTURA A UN TAMAÑO.
            }
            
            file.close();                                           // CERRAMOS EL FLUJO, LIBERAMOS LOS RECURSOS. OPCIONAL.
            
            System.out.println(contenido);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();        
        } catch (IOException e) {
            e.printStackTrace();   
        }
    }
    
}
