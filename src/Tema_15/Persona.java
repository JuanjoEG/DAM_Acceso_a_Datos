package Tema_15;

import java.io.Serializable;

/**
 * EJEMPLO DE CLASE JAVA BEANS,
 * Y POR TANTO, TAMBI�N ES UN POJO.
 * 
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Persona  implements Serializable {                         // LOS BEANS IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                                                                        // LOS ATRIBUTOS DE LOS BEANS TIENEN QUE SER TODOS PRIVADOS.
    // ATRIBUTOS.                                                       // PARA ACCEDER A LOS ATRIBUTOS ES OBLIGATORIO HACERLO CON LOS GETTERS Y SETTERS.
    private String nombre;                                              // POR TANTO, LOS GETTERS Y SETTERS TIENEN QUE SER P�BLICOS.
    private String apellidos;
    private int edad;
    
    // CONSTRUCTOR CON PAR�METROS PARA INICIALIZAR LOS CAMPOS.          // LOS CONSTRUCTORES TIENEN QUE SER P�BLUCOS.
    public Persona(String nombre, String apellidos, int edad) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    // CONSTRUCTOR SIN PAR�METROS.                                      // LOS JAVA BEANS DEBEN DE TENER UN CONSTRUCTOR SIN PAR�METROS Y P�BLICO.
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