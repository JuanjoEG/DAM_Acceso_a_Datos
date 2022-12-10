package Ejemplos_T02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 *
 * @author Juan José Estévez González
 */
public class FlujosAnalisisPushback {
    
    public static void main(String[] args) {
        
        // VAMOS A LEER UN DATO CON ANTICIPACIÓN PARA SABER QUÉ SE APROXIMA.
        
        String ruta = "J:\\Ejercicios\\salida5.txt";  // EL PRIMER CARACTER ES UNA "E".
        
        try {
            
            // INSTANCIAMOS UN OBJETO FileReader Y LE PASAMOS LA RUTA
            FileReader fileReader = new FileReader(ruta);
        
            // INSTANCIAMOS UN OBLETO PushbackReader Y LE PASAMOS EL OBJETO FileReader.
            PushbackReader pushbackReader = new PushbackReader( fileReader );
            
            // EN UN SÓLO PASO.
            // INSTANCIAMOS UN OBJETO PushbackReader PASANDOLE UNA INSTANCIA DE FileReader A LA QUE LE PASAMOS LA RUTA.
            
            // PushbackReader pushbackReader = new PushbackReader( new FileReader(ruta) );
            
            int data = pushbackReader.read();  // USAMOS EL MÉTODO READ PARA LEER EL PRIMER CARACTER.
            System.out.println((char)data);    // Y LO PINTAMOS.
            
            pushbackReader.unread(data);    // USAMOS EL MÉTODO UNREAD --> DEVUELVE AL STREAM/FLUJO DE DATOS EL BYTE ANTERIOR.
            
            data = pushbackReader.read();     // SI VOLVEMOS A HACER UN READ NOS DARÍA EL MISMO BYTE.
            System.out.println((char)data);
            
            pushbackReader.close();          // Y LIBERAMOS RECURSOS
            
        } catch (FileNotFoundException e) {
        
            e.printStackTrace();
        } catch (IOException e) {
        
            e.printStackTrace();
        }        
    }    
}