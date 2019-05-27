<%-- 
    Document   : registrarse
    Created on : 04/03/2014, 08:45:18 PM
    Author     : Usuario
--%>

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
                 if(session.getAttribute("usuario")!=null)
                {
                    session.setAttribute("estado", "Usted ya se encuentra registrado.....!");                    
                    response.sendRedirect("index.jsp");
                                         }
                             %>
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
		 <form action="RegistrarUsuario" method="post" class="niceform">
	<fieldset>
    	<legend>Informaci&oacute;n Personal</legend>
        <dl>
        	<dt><label for="usuario">Usuario:</label></dt>
            <dd><input type="text" name="txtIdUsuario" id="txtUsuario" size="32" maxlength="128" placeholder="Escribe tu nombre de Usuario" required="" /></dd>
        </dl>
        
        <dl>
        	<dt><label for="password">Contraseña:</label></dt>
            <dd><input type="password" name="txtClave" id="password" size="32" maxlength="32" required="" /></dd>
        </dl>
        
        <dl>
        	<dt><label for="usuario">Nombres:</label></dt>
            <dd><input type="text" name="txtNombres" id="txtUsuario" size="32" maxlength="128" placeholder="Escribe tus nombres" required="" /></dd>
        </dl>
        <dl>
        	<dt><label for="usuario">Apellidos:</label></dt>
            <dd><input type="text" name="txtApellidos" id="txtUsuario" size="32" maxlength="128" placeholder="Escribe tus Apellidos" required="" /></dd>
        </dl>
        <dl>
        	<dt><label for="email">Email:</label></dt>
            <dd><input type="text" name="txtEmail" id="email" size="32" maxlength="128" placeholder="email@ejemplo.com" required="" /></dd>
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
