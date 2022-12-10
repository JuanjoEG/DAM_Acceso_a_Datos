package Ejemplos_T02;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 *
 * @author Juan José Estévez González
 */
public class FlujosArraysReaderWriter {
    
    public static void main(String[] args) {
        
        String chars1 = "Hola amigo, conectate al juego.";
        String chars2 = "Hola, estoy cenando ahora.";
        
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        CharArrayReader charArrayReader;
        
        int data = 0;
        try {
        
           charArrayWriter.write(chars1);                                       // LE PASAMOS LOS STRINGS QUE NECESITEMOS ALMACENAR.
           charArrayWriter.write(chars2);
           charArrayWriter.close();                                                 // YA POSEMOS CERRAR EL FLUJO DE ESCRITURA.
           
           // INSTANCIAMOS EL FLUJO DE LECTURA PASANDOLE UN ARRAY. --> EL FLUJO DE ESCRITURA LO PASAMOS A ARRAY DE CARACTERES.
           charArrayReader = new CharArrayReader(charArrayWriter.toCharArray());
           data = charArrayReader.read();
           
            while (data!=-1) {
            
                //OPERACIONES
                System.out.print((char)data);
                data = charArrayReader.read();
            }
            charArrayReader.close();
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    }
}