<%-- 
    Document   : registrarCategoria
    Created on : 05/03/2014, 10:09:29 AM
    Author     : PC-FCI-07
--%>

<%@page import="Negocio.Libros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script language="javascript" type="text/javascript" src="niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all" href="niceforms-default.css" />
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="registrarCategorias" method="post" class="niceform">
            <%
                   Libros unLibro=new Libros();
                    String id="";
                try
                {
                id=unLibro.obtenerIdCategoria();
                out.write(unLibro.getEstado()+"hola mundo");
        }
        catch(Exception ex)
        {
            out.write(ex.getMessage());
            out.write(unLibro.getEstado());
        }
        %>
	<fieldset>
            <legend>Informaci&oacute;n de Categorias</legend>
        <dl>
        	<dt><label for="email">C&oacute;digo:</label></dt>
            <dd><input type="text" name="txtCodigo" value="<%out.write(id+"dsds");%>" id="email" size="32" maxlength="128" required="" /></dd>
        </dl>
        <dl>
            <dt><label for="password">Descripci&oacute;n:</label></dt>
            <dd><input type="text" name="txtDescripcion" id="password" size="32" maxlength="32" required="" /></dd>
        </dl>
        
    </fieldset>
            <fieldset class="action">
    	<input type="submit" name="submit" id="submit" value="Registrar" />
    </fieldset>
    </body>
</html>
