package Ejemplos_T03;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class PruebaUnitaria {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prueba manual tradicional
        Calculadora objeto = new Calculadora();
        int resultado = objeto.sumarNumeros(3,3);
        
        System.out.println(resultado);                      
    }    
}