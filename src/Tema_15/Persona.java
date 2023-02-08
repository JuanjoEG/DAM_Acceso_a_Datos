package Tema_15;

import java.io.Serializable;

/**
 * EJEMPLO DE CLASE JAVA BEANS,
 * Y POR TANTO, TAMBIÉN ES UN POJO.
 * 
 * @author Juan José Estévez González
 */
public class Persona  implements Serializable {                         // LOS BEANS IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                                                                        // LOS ATRIBUTOS DE LOS BEANS TIENEN QUE SER TODOS PRIVADOS.
    // ATRIBUTOS.                                                       // PARA ACCEDER A LOS ATRIBUTOS ES OBLIGATORIO HACERLO CON LOS GETTERS Y SETTERS.
    private String nombre;                                              // POR TANTO, LOS GETTERS Y SETTERS TIENEN QUE SER PÚBLICOS.
    private String apellidos;
    private int edad;
    
    // CONSTRUCTOR CON PARÁMETROS PARA INICIALIZAR LOS CAMPOS.          // LOS CONSTRUCTORES TIENEN QUE SER PÚBLUCOS.
    public Persona(String nombre, String apellidos, int edad) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    // CONSTRUCTOR SIN PARÁMETROS.                                      // LOS JAVA BEANS DEBEN DE TENER UN CONSTRUCTOR SIN PARÁMETROS Y PÚBLICO.
    public Persona() {
        super();
    }
    
    // GETTERS. 
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getEdad() {
        return edad;
    }
    
    // SETTERS.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}