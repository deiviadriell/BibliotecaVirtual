/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author ENRIQUE PONCE_2
 */
public class Roles {
    String idRol;
    String Descripcion;

    public Roles(String idRol, String Descripcion) {
        this.idRol = idRol;
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getIdRol() {
        return idRol;
    }
    
    
}
