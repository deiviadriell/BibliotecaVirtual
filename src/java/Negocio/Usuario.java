/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Clases.Conexion;
import Negocio.Persona;
import java.lang.String;
import Negocio.Roles;

/**
 *
 * @author ENRIQUE PONCE_2
 */
public class Usuario extends Persona {
    protected String idUsuario;
    private Roles unRol;
    private Conexion unaConexion;
    private String clave;

    public Usuario(String nombre, String apellidos, String Email, String idUsuario, Roles unRol,String clave) {
        super(nombre, apellidos, Email);
        this.idUsuario = idUsuario;
        this.unRol = unRol;
        this.clave=clave;
    }

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String Email,String clave) {
        super(nombre, apellidos, Email);
        this.clave=clave;
        
    }
    

    public Usuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String RegistrarUsuario()
    {
        unaConexion=new Conexion();
        //unaConexion.Insertar("INSERT INTO usuario (idUsuario, Clave, Nombres, Apellidos, Email, Roles_idRoles) VALUES ('"+idUsuario+"', '"+clave+"', '"+nombre+"', '"+apellidos+"', '"+Email+"', "+unRol.getIdRol()+");");
        return "";
        
    }

   
    
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
   
    }
    public String ActualizarDatos()
    {
      unaConexion=new Conexion();  
      unaConexion.Actualizar("UPDATE Usuario SET Clave='"+""+"', Nombres='',Apellidos='',Email='' WHERE idUsuario='';");
      return unaConexion.getEstado();  
    }
    
    
   
    

    
    
    
    
}
