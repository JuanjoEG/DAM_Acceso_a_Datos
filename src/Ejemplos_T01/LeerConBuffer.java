package Ejemplos_T01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Juan José Estévez González
 */
public class LeerConBuffer {
    
    public static void main(String[] args) {
        
        try {    
            int bufferSize = 8;
            int unByte = 0;
            String contenido = "";
            String ruta = "E:\\TRABAJO\\Ejercicios\\salida5.txt";

            BufferedInputStream file = new BufferedInputStream(new FileInputStream(ruta), bufferSize);            

            unByte = file.read();
            
            while (unByte != -1) {
                
                contenido += (char)unByte;
                unByte = file.read();                
            }
            
            file.close();
            
            System.out.println(contenido);
            
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}