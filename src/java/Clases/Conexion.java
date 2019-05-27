/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ENRIQUE PONCE_2
 */
public class Conexion 
{
    private Connection uC;
    private Statement uS;
    private ResultSet uR;
    private String estado;
    private String usuario="root";
    private String clave="1234";
    
    public Conexion ()
    {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            uC=DriverManager.getConnection("jdbc:mysql://localhost/bdbibliotecavirtual",usuario,clave);
            uS=uC.createStatement();
            uR=null;
            estado="Conexion exitosa....!";
        }
        catch(Exception ex)
        {
            estado="Error en: "+ex.getMessage().toString();
        }
    }

    public String getEstado() {
        return estado;
    }
    public void Insertar(String consulta)
    {
        try
        {
            uS.execute(consulta);
            estado="ok";
        }
        catch(Exception ex)
        {
            estado=ex.getMessage().toString();
        
        }
    }
    public ResultSet Consulta(String consulta)
    {
        try
        {
            uR=uS.executeQuery(consulta);
            estado="Consulta ok";
            return uR;
        }
        catch(Exception ex)
        {
            estado="Consulta error en "+ex.getMessage().toString();
            return null;
        }
        
    
    }
    
    public void Actualizar(String sentenciaSql)
    {
        try
        {
            uS.executeUpdate(sentenciaSql); 
            estado="Actualización ok";
            
        }
        catch(Exception ex)
        {
            estado="Actualizacion error en "+ex.getMessage().toString();        
        }
    
    }
    
    
}
