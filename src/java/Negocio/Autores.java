/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author ENRIQUE PONCE_2
 */
public class Autores extends Persona{
    private String idAutor;

    public Autores(String nombre, String apellidos, String idAutor) {
        super(nombre, apellidos);
        this.idAutor = idAutor;
    }

    public Autores(String idAutor) {
        this.idAutor = idAutor;
    }
    

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }
    
    
    
}
