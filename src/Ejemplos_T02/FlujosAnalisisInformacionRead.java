package Ejemplos_T02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Juan José Estévez González
 */
public class FlujosAnalisisInformacionRead {
    
    public static void main(String[] args) {
        
        String ruta = "E:\\TRABAJO\\Ejercicios\\salida65.data";
        
        try {
        
            FileInputStream fileInputStream = new FileInputStream(ruta);
            
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            
            byte aByte = dataInputStream.readByte();
            int anInt = dataInputStream.readInt();
            float aFloat = dataInputStream.readFloat();
            long aLong = dataInputStream.readLong();
            double aDouble = dataInputStream.readDouble();
            
            dataInputStream.close();
            
            System.out.println("BYTE   : " + aByte);
            System.out.println("INT    : " + anInt);
            System.out.println("FLOAT  : " + aFloat);
            System.out.println("LONG   : " + aLong);
            System.out.println("DOUBLE : " + aDouble);
            
        } catch (FileNotFoundException e) {
        
            e.printStackTrace();
            
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    }    
}