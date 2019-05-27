<%-- 
    Document   : registrarse
    Created on : 04/03/2014, 08:45:18 PM
    Author     : Usuario
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Negocio.Libros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="javascript" type="text/javascript" src="niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all" href="niceforms-default.css" />

<title>Show/hide Login and Signup Panel using Mootools 1.2</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />

	<!-- The main style sheet -->
  	<link rel="stylesheet" href="style.css" type="text/css" media="screen" />

	<!-- START Fx.Slide -->
	<!-- The CSS -->
  	<link rel="stylesheet" href="fx.slide.css" type="text/css" media="screen" />
    <!-- Mootools - the core -->
	<script type="text/javascript" src="js/mootools-1.2-core-yc.js"></script>
    <!--Toggle effect (show/hide login form) -->
	<script type="text/javascript" src="js/mootools-1.2-more.js"></script>
	<script type="text/javascript" src="js/fx.slide.js"></script>
	<!-- END Fx.Slide -->

    </head>
    <body>
        <%
       
        if(session.getAttribute("estado")!=(null))
                         { 
                            out.write("<script>");
                            out.write("alert('"+session.getAttribute("estado") +"');");                          
                             out.write("</script>");                             
                             session.setAttribute("estado", null);
                         }
                         


        %>
         <script>
        function mostrar(){        
            var x =document.getElementById("inicioSesion");
            var y =document.getElementById("sessionOk");
            <%
            if(session.getAttribute("nombreUsuario")==(null))
                { %>
                x.style.display = 'block'; 
                y.style.display = 'none'; 
              <%}  
            else 
            { %>                      
                x.style.display = 'none'; 
                y.style.display = 'block'; 
            <%}%>
                }
    </script>
	<div id="login">
		<div class="loginContent">
			<form action="CheckLogin" method="post">
				<label for="log"><b>Usuario: </b></label>
				<input class="field" type="text" name="log" id="log" value="" size="23" />
				<label for="pwd"><b>Clave:</b></label>
				<input class="field" type="password" name="pwd" id="pwd" size="23" />
				<input type="submit" name="submit" value="" class="button_login" />
				<input type="hidden" name="redirect_to" value=""/>
			</form>
			<div class="left">
            	<label for="rememberme"><input name="rememberme" id="rememberme" class="rememberme" type="checkbox" checked="checked" value="forever" />Recordar</label></div>
			<div class="right">Not a member? <a href="#">Register</a> | <a href="#">Lost your password?</a></div>
		</div>
		<div class="loginClose"><a href="#" id="closeLogin">Cerrar Panel</a></div>
	</div> <!-- /login -->

    <div id="contenedorLogin">
		<div id="top">
		<!-- login -->
			<ul class="login">
		    	<li class="left">&nbsp;</li>
                        <li><%
                         if(session.getAttribute("nombreUsuario")==(null))
                         { 
                             out.write("Iniciar Sessi&oacute;n");
                         }
                         else
                         {
                            out.print(session.getAttribute("nombreUsuario")+" "+ session.getAttribute("apellidoUsuario"));  
                         }
                         

%>                       

  </li>
				<li>|</li>
				<li><a id="toggleLogin" href="#">
                            <%
                         if(session.getAttribute("nombreUsuario")==(null))
                         { 
                             out.write("Ingresar");
                         }
                         else
                         {
                            out.print("<a href='cerrarSesion.jsp'> Cerrar Sessi&oacute;n </a>");                             
                         }
            
%>                                   
                                        </a></li>
			</ul> <!-- / login -->
		</div> <!-- / top -->
		<div id="contenedorPrincipal">
		
		<header id="cabecera">

		<hgroup>
			<h1 id="site-logo"><a href="#">Demo</a></h1>
			<h2 id="site-description">Site Description</h2>
		</hgroup>

		

		
	</header>
	<!-- /#header -->
	<nav>
			<ul id="main-nav" class="clearfix">
				<li><a href="index.jsp">Inicio</a></li>
				<li><a href="mision.jsp">Misi&oacute;n y Visi&oacute;n</a></li>
				<li><a href="registrarse.jsp">Registrarse</a> </li>
				<li><a href="">Administraci&oacute;n</a>
					<ul>
						<li><a href="">Registros</a>
							<ul>
								<li><a href="">Categorias</a></li>		
								<li><a href="">Editoriales</a></li>		
								<li><a href="">Temas</a></li>			
								<li><a href="">Libros</a></li>				
								<li><a href="">Videos</a></li>				
								<li><a href="">Diapositivas</a></li>		
							</ul>	
						</li>	
						<li><a href="">Dar de Bajas</a>
							<ul>
								<li><a href="">Categorias</a></li>		
								<li><a href="">Editoriales</a></li>		
								<li><a href="">Temas</a></li>			
								<li><a href="">Libros</a></li>				
								<li><a href="">Videos</a></li>				
								<li><a href="">Diapositivas</a></li>		
							</ul>	
						</li>	

								
					</ul>

				</li>
			</ul>
			<!-- /#main-nav --> 
		</nav>
	<div id="contenedorCentral">
            <br>
		 <form action="SubirArchivos.jsp" method="post" enctype="multipart/form-data" class="niceform">
	

<fieldset>
    	<legend>Información de Los Libros</legend>
        
        <dl>
        	<dt><label for="nombre">Nombre:</label></dt>
            <dd><input type="text" name="txtNombreLibro" id="txtNombreLibro" size="32" maxlength="128" required="" /></dd>
        </dl>
        
        <dl>
        	<dt><label for="gender">Categoria:</label></dt>
            <dd>
                <select size="1" name="cboCategoria" id="gender">
                <%
                Libros unLibro=new Libros();
                ResultSet ur=unLibro.obtenerCategorias();
                    try
                    {
                        while(ur.next())
                        {
                                           %>
                                <option value="<%out.write(ur.getString(1));%>"><%out.write(ur.getString(2));%></option>
                                <%
                        }
                    }
                    catch(Exception ex)
                    {
                        out.write(unLibro.getEstado());
                    }
                    %>
            	</select>
            </dd>
        </dl>
        <dl>
            <dl>
        	<dt><label for="gender">Autor:</label></dt>
            <dd>
            	<select size="1" name="cboAutor" id="gender">
                     <%
                                    
                        ur=unLibro.obtenerAutores();
                    try
                    {
                        while(ur.next())
                        {
                                           %>
                                <option value="<%out.write(ur.getString(1));%>"><%out.write(ur.getString(3)+" "+ur.getString(2));%></option>
                                <%
                        }
                    }
                    catch(Exception ex)
                    {
                        out.write(unLibro.getEstado());
                    }
                    %>
            	</select>
            </dd>
        </dl>
        <dl>
            
            
            <dl>
        	<dt><label for="gender">Tema:</label></dt>
            <dd>
            	<select size="1" name="cboTema" id="gender">
                    <%
                                    
                        ur=unLibro.obtenerTemas();
                    try
                    {
                        while(ur.next())
                        {
                                           %>
                                <option value="<%out.write(ur.getString(1));%>"><%out.write(ur.getString(2));%></option>
                                <%
                        }
                    }
                    catch(Exception ex)
                    {
                        out.write(unLibro.getEstado());
                    }
                    %>
            	</select>
            </dd>
        </dl>
        
            
           <dl>
        	<dt><label for="upload">Subir archivo:</label></dt>
            <dd><input type="file" name="upload" id="upload" required=""/></dd>
        </dl>
    </fieldset>
        
        
    
            <fieldset class="action">
    	<input type="submit" name="submit" id="submit" value="Registrar" />
    </fieldset>
	</div>
	<!-- /#content --> 
	
	
	<aside id="barraLaterals">

		<section class="widget">
			<h4 class="widgettitle">Categorias</h4>
			<ul>
				<li><a href="">Editoriales</a></li>
				<li><a href=""> Autores</a></li>
				<li><a href="">Proyectos</a></li>
				<li><a href="">Tesis</a></li>
				<li><a href="">Tutoriales</a></li>
				<li><a href="">Diapositivas</a></li>		
				
				
				
			</ul>
		</section>
		<!-- /.widget -->

		<section class="widget clearfix">
			<h4 class="widgettitle">Flickr</h4>
			<script type="text/javascript" src="http://www.flickr.com/badge_code_v2.gne?count=8.&display=latest&size=s&layout=x&source=user&user=52839779@N02"></script> 
		</section>
		<!-- /.widget -->
						
	</aside>
	<!-- /#sidebar -->

	<footer id="pieDePagina">
	
		<p>Tutorial by <a href="http://webdesignerwall.com">Web Designer Wall</a></p>

	</footer>
	<!-- /#footer --> 
			
		</div><!-- / content -->
       
	</div><!-- / container -->

       
    </body>
</html>
