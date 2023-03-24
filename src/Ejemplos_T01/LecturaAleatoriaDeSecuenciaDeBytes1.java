package Ejemplos_T01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class LecturaAleatoriaDeSecuenciaDeBytes1 {
    
    public static void main(String[] args) {
        
        char caracter;
        int unByte = 0;
        String contenido = "";
        RandomAccessFile file;                                     // ESTA CLASE TIENE EL CIERRE AUTOM�TICO DEL FLUJO.
        String ruta = "E:\\TRABAJO\\Ejercicios\\salida4.txt";
        int inicioPuntero = 8;
        int size = 9;
        int contador = 0;
        
        
        try {
            
            file = new RandomAccessFile (ruta, "r");       // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA Y MODO DE ACCESO.            
            
            file.seek(inicioPuntero);                           // POSICIONAMOS EL PUNTERO EN EL BYTE N� 8 DE LA CADENA DE TEXTO DEL FICHERO.
                                                                    // ACEPTA COMO PAR�METRO UN OBJETO DE TIPO long (ENTERO DE 8 BYTES).
                                                                    // TAMBI�N DE TIPO ENTERO TIPO int.                                 
            
            unByte = file.read();                                   // ACCEDEMOS AL PRIMER BYTE DEL FICHERO. NOS DEVUELVE UN ENTERO.
            
            while (unByte!=-1) {                                    // AL LLEGAR AL CAR�CTER DE C�DIGO -1 RECONOCE EL FINAL DEL FICHERO.
                
                contenido += (char)unByte;                          // VAMOS BYTE A BYTE MONTANDO EL CONTENIDO.
                                                                    // HACEMOS UN CASTING PARA CONVERTIR EL DATO (ENTERO) EN UN CARACTER.
                unByte = file.read();
                contador ++;
                if (contador==size) break;                          // LIMITAMOS LA LECTURA A UN TAMA�O.
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
