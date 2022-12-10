package Ejemplos_T02;

import java.io.IOException; // Para el trabajo con tuberias
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class FlujosTuberias {
    
    public static void main(String[] args) throws IOException{
        
            // LAS TUBERIAS EN JAVA PROPORCIONAN LA CAPACIDAD DE EJECUTAR DOS HILOS (THREADS) EN LA MISMA M�QUINA VIRTUAL (JVM).
            // LAS PARTES QUE SE EJECUTAN DEBEN PERTENECER AL MISMO PROCESO Y DEBEN SER HILOS DIFERENTES.
        
        final PipedOutputStream salida = new PipedOutputStream(); 
            // Instanciaremos la tuberia de entrada pasandole por parametro la de salida que acabamos de crear
            // De esta forma, la tuberia quedara conectada, y tendremos acceso a la salida que esta haciendo la escritura.
        final PipedInputStream entrada = new PipedInputStream(salida); 
            // Otra forma de hacer esta conexion entre las tuberias es la siguiente:
            //final PipedInputStream entrada = new PipedInputStream();
            //entrada.connect(salida);
        
            // Creamos el hilo para escribir (dejar) datos en la tuberia
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    salida.write("Hola por aqui!".getBytes());
                } catch (IOException e) {
                } 
            }
        });	    
            // Creamos el hilo para leer datos de la tuberia (y sacarlos por pantalla)
        Thread thread2 = new Thread(new Runnable() { 
            @Override
            public void run() {
                try {
                    int unByte = entrada.read(); 
                    while(unByte!= -1){
                        System.out.print((char) unByte);
                        unByte = entrada.read(); 
                    }
                } catch (IOException e) {
                } 
            }
        });
            // Iniciamos los hilos
        thread1.start(); 
        thread2.start();
    }
}