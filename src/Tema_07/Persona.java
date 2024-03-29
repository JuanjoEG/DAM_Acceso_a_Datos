package Tema_07;



import java.io.Serializable;
// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name = "persona")


/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Persona implements Serializable {
    
//    @Column(name="id_persona")
//    @Id    
    private int idPersona;
    
    private String nombre;
    
    private String apellido;
    
    private String email;
    
    private String telefono;
    
    public Persona(){}

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        
        String tit = ("\nTABLA PERSONA:");
        String idP = ("\n Persona ID:  " + idPersona);
        String noP = ("\n Nombre    :  " + nombre);
        String apP = ("\n Apellido  :  " + apellido);
        String emP = ("\n Email     :  " + email);
        String teP = ("\n Telefono  :  " + telefono);       
        
        return tit + idP + noP + apP + emP + teP;
    }   
}