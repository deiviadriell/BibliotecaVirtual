<%-- 
    Document   : cerrarSesion
    Created on : 16/02/2014, 03:56:41 PM
    Author     : Chiting
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cerrando la sesion</title>
    </head>
    <body>
        <% session.invalidate();
        response.sendRedirect("index.jsp");
            %>
    </body>
</html>
