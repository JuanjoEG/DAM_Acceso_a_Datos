package Ejemplos_T01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Juan José Estévez González
 */
public class LecturaSecuencialBytes {
    
    public static void main(String[] args) {
        
        int unByte = 0;
        String contenido = "";
        String ruta = "E:\\TRABAJO\\Ejercicios\\salida1.txt";
        InputStream file;
        
        try {
            file = new FileInputStream(ruta);                           // INSTANCIAMOS EL FICHERO E INDICAMOS LA RUTA.
            
            unByte = file.read();                                             // ACCEDEMOS AL PRIMER BYTE DEL FICHERO. NOS DEVUELVE UN ENTERO.
            
            while (unByte!=-1) {                                              // AL LLEGAR AL CARÁCTER DE CÓDIGO -1 RECONOCE EL FINAL DEL FICHERO.
                               
                contenido += (char)unByte;                                    // VAMOS BYTE A BYTE MONTANDO EL CONTENIDO.
                                                                            // HACEMOS UN CASTING PARA CONVERTIR EL DATO (ENTERO) EN UN CARACTER.
                unByte = file.read();
            }
            
            file.close();                                                   // CERRAMOS EL FLUJO. LIBERAMOS LOS RECURSOS.
            
            System.out.println(contenido);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}