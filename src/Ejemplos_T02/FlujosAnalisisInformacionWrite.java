package Ejemplos_T02;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Juan José Estévez González
 */
public class FlujosAnalisisInformacionWrite {
    
    public static void main(String[] args) {
        
        String ruta = "J:\\Ejercicios\\salida65.data";
        
        try {
            
            FileOutputStream fileOutputStream = new FileOutputStream(ruta);
            
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            
            dataOutputStream.writeByte(1);
            dataOutputStream.writeInt(682);
            dataOutputStream.writeFloat(123.45F);
            dataOutputStream.writeLong(789);
            dataOutputStream.writeDouble(35214.14);
            
            dataOutputStream.close();
        
        } catch (FileNotFoundException e) {
        
            e.printStackTrace();
            
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    }
    
}
