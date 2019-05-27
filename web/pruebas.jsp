<%-- 
    Document   : pruebas
    Created on : 08/03/2014, 12:08:45 PM
    Author     : Usuario
--%>

<%@page import="Negocio.Libros"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
                    Libros unLibro=new Libros();
                    try
                    
                   {                     
                      ResultSet ur=unLibro.obtenerCategorias();
                      while(ur.next())
                      {
                          out.write(ur.getString(1));
                      }
                    }
                    catch (Exception ex)                                                      
                    {
                        out.write(unLibro.getEstado());
                        out.write(ex.getMessage());
                    
                    }
                    %>
    </body>
</html>
