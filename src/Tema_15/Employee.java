package Tema_15;

/**
 * ESTA CLASE ES UN EJEMPLO DE UN POJO JAVA,
 * PERO NO ES UN JAVA BEANS.
 * 
 * VEAMOS DIFERENCIAS CON LOS BEANS.
 * 
 * TODOS LOS BEANS SON TAMBIÉN POJOS, PERO NO TODOS LOS POJOS TIENEN QUE SER BEANS.
 * 
 * ESTA CLASE POJO NO ES SERIALIZABLE.
 * ESTA CLASE POJO NO TIENE TODOS LOS ATRIBUTOS PRIVADOS.
 * ESTA CLASE POJO NO TIENE CONSTRUCTOR SIN PARÁMETROS.
 * ESTA CLASE POJO NO TIENE DEFINIDOS TODOS LOS SETTERS Y GETTERS.
 * ESTA CLASE POJO NO TIENE UNA NOMENCLATURA FIJA PARA LOS SETTERS Y GETTERS. 
 * 
 * ESTA CLASE POJO --> NO ES UNA CLASE JAVA BEAN.
 * 
 * @author Juan José Estévez González
 */
public class Employee {                     // LOS BEANS IMPLEMENTAN LA INTERFAZ SERIALIZABLE.
                                            // LOS ATRIBUTOS DE LOS BEANS TIENEN QUE SER TODOS PRIVADOS.
    // ATRIBUTOS:                           // PARA ACCEDER A LOS ATRIBUTOS ES OBLIGATORIO HACERLO CON LOS GETTERS Y SETTERS.
    // CAMPO POR DEFECTO.                   // POR TANTO, LOS GETTERS Y SETTERS TIENEN QUE SER PÚBLICOS.
    String nombre;
    
    //CAMPO PÚBLICO.
    public String id;
    
    // CAMPO PRIVADO.
    private double salary;

    // CONSTRUCTOR CON PARÁMETROS PARA INICIALIZAR LOS CAMPOS.
    public Employee(String nombre, String id, double salary) {
        this.nombre = nombre;
        this.id = id;
        this.salary = salary;
    }

    // LOS JAVA BEANS DEBEN DE TENER UN CONSTRUCTOR SIN PARÁMETROS.
    
    
    // GETTERS.
    public String muestraNombre() {
        return nombre;
    }
     public double muestraSalary() {
        return salary;
    }
    
    // SETTERS.
    public void modificaNombre(String nombre) {
        this.nombre = nombre;
    }
    public void modificaSalary(double salary) {
        this.salary = salary;
    }
    
    // TOSTRING.
    @Override
    public String toString() {
        return "Employee{" + "nombre=" + nombre + ", id=" + id + ", salary=" + salary + '}';
    }
}