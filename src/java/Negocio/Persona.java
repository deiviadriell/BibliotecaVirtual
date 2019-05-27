/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author ENRIQUE PONCE_2
 */
public class Persona 
{
    private String nombre;
    private String apellidos;
    private String Email;
    private String telefono;

    public Persona(String nombre, String apellidos, String Email, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Email = Email;
        this.telefono = telefono;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }    

    public Persona(String nombre, String apellidos, String Email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Email = Email;
    }
    public Persona()
    {}
    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
    
}
