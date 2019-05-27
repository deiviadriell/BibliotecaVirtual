/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Clases.Conexion;
import Negocio.Autores;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ENRIQUE PONCE_2
 */
public class Libros {
    private String nombre;
    private String idLibro;
    private String categoria;
    private String idTema;
    private String idAutor;
    private Conexion unaConexion;
    private String estado;
    
    public Libros(String categoria) {
        this.categoria = categoria;
        unaConexion=new Conexion();
    }

    public Libros() {
        unaConexion=new Conexion();
    }

    public Libros(String nombre, String idLibro, String categoria, String idTema, String idAutor) {
        this.nombre = nombre;
        this.idLibro = idLibro;
        this.categoria = categoria;
        this.idTema = idTema;
        this.idAutor = idAutor;
        unaConexion=new Conexion();
    }
    
    public String obtenerIdCategoria()
    {
        String aRetornar="";
        ResultSet ur=null;
        
        try
        {
            ur=unaConexion.Consulta("SELECT COUNT(idCategoria) from categoria;");
             if(ur.next())
            {
                aRetornar=ur.getString(1);                
                estado=unaConexion.getEstado();
               
            }
             else
             {
                 aRetornar="1";
             }
            
        }
        catch(Exception ex)
        {
            aRetornar="nada";
            estado=unaConexion.getEstado()+ex.getMessage();           
        }
            
        return aRetornar;
    }

    public String getEstado() {
        return estado;
    }
    public ResultSet obtenerCategorias()
    {
        ResultSet ur = null;
        try
        {
            ur=unaConexion.Consulta("SELECT * FROM categoria");
            estado="ok";
        }
        catch(Exception ex)
        {
            estado=unaConexion.getEstado()+" "+ex.getMessage();
        }
        return ur;
        
    }
    public ResultSet obtenerAutores()
    {
        ResultSet ur = null;
        try
        {
            ur=unaConexion.Consulta("SELECT * FROM autor;");
            estado="ok";
        }
        catch(Exception ex)
        {
            estado=unaConexion.getEstado()+" "+ex.getMessage();
        }
        return ur;
    }
    
    public ResultSet obtenerTemas()
    {
        ResultSet ur = null;
        try
        {
            ur=unaConexion.Consulta("SELECT * FROM tema;");
            estado="ok";
        }
        catch(Exception ex)
        {
            estado=unaConexion.getEstado()+" "+ex.getMessage();
        }
        return ur;
    }
    public boolean RegistrarLibros(String usuario)
    {
        try
        {
        unaConexion.Insertar("INSERT INTO libros (idLibros, Nombres, Categoria_idCategoria, Autor_idAutor, Tema_idTema, Usuario_idUsuario, Estado) VALUES ("+obtenerIdLibro()+", '"+nombre+"', '"+categoria+"', '"+idAutor+"', "+idTema+", '"+usuario+"', 'ACTIVO');");
        return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
    public String obtenerIdLibro()
    {
         ResultSet ur = null;
         String idLibro="";
        try
        {
            ur=unaConexion.Consulta("Select count(idLibros)+1 from Libros");
            estado="ok";
            while(ur.next())
            {
                idLibro=ur.getString(1);
            }
        }
        catch(Exception ex)
        {
            estado=unaConexion.getEstado()+" "+ex.getMessage();
        }
        
        return idLibro;
    }
    
    
    
}
