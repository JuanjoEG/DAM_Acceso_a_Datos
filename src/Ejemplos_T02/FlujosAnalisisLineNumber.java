package Ejemplos_T02;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author Juan José Estévez González
 */
public class FlujosAnalisisLineNumber {
    
    public static void main(String[] args) {
        
        String ruta = "J:\\Ejercicios\\salida5.txt";
        try {
        
            FileReader fileReader = new FileReader(ruta);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            
            String line = lineNumberReader.readLine();
            
            while(line !=null) {
            
                System.out.println("Contenido de la línea número: " + lineNumberReader.getLineNumber());
                System.out.println(line);
                line = lineNumberReader.readLine();
            }
            lineNumberReader.close();
        }catch (IOException e) {
        
            e.printStackTrace();
        }
    }    
}