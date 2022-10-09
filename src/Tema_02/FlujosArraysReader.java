package Tema_02;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 *
 * @author Juan José Estévez González
 */
public class FlujosArraysReader {
    
    public static void main(String[] args) {
        
        char[] chars = "Hola amigo, conectate al juego.".toCharArray();
        
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        int data = 0;
        try {
        
            data = charArrayReader.read();
            while (data!=-1) {
            
                //OPERACIONES
                System.out.print((char)data);
                data = charArrayReader.read();
            }
        } catch (IOException e) {
        
            e.printStackTrace();
        }
        charArrayReader.close();
    }    
}