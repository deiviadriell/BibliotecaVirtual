<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<head>
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
	<!-- Login -->
        
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
                            out.write(session.getAttribute("nombreUsuario")+" "+ session.getAttribute("apellidoUsuario"));  
                            
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
                                <li><a href="">Aki algo mas para amagar</a></li>     
				<li><a href="registrarse.jsp">Registrarse</a> </li>
                                <%
                                if(session.getAttribute("usuario")!=null)
                         if(session.getAttribute("rol").equals("Administrador"))
                         { 
                             %>
                             <li><a href="">Administraci&oacute;n</a>
					<ul>
						<li><a href="">Registros</a>
							<ul>
								<li><a href="registrarCategoria.jsp">Categorias</a></li>		
								<li><a href="pruebas.jsp">Editoriales</a></li>		
								<li><a href="">Temas</a></li>			
                                                                <li ><a href="registrarLibros.jsp">Libros</a></li>				
								<li><a href="">Videos</a></li>				
								<li><a href="">Diapositivas</a></li>		
							</ul>	
						</li>	
													
					</ul>

				</li>
                             <%
                             
                         }
                         else
                         {
                
                            
                         }
            
%>                                   
				
			</ul>
			<!-- /#main-nav --> 
		</nav>
	<div id="contenedorCentral">
		<article class="post clearfix">

			<header>
				<h1 class="post-title"><a href="#">Just a Post Title</a></h1>
				<p class="post-meta"><time class="post-date" datetime="2011-05-08" pubdate>May 8, 2011</time> <em>in</em> <a href="#">Category</a></p>
			</header>
			<figure class="post-image"> 
				<img src="images/sample-image.jpg" /> 
			</figure>
			<p>Fusce ut sem est. In eu sagittis felis. In gravida arcu ut neque ornare vitae rutrum turpis vehicula. Nunc ultrices sem mollis metus rutrum non malesuada metus fermentum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque interdum rutrum quam, a pharetra est pulvinar ac. Vestibulum congue nisl magna. Ut vulputate odio id dui convallis in adipiscing libero condimentum. Nunc et pharetra enim. Praesent pharetra, neque et luctus tempor, leo sapien faucibus leo, a dignissim turpis ipsum sed libero. Sed sed luctus purus. Aliquam faucibus turpis at libero consectetur euismod. Nam nunc lectus, congue non egestas quis, condimentum ut arcu. Nulla placerat, tortor non egestas rutrum, mi turpis adipiscing dui, et mollis turpis tortor vel orci. Cras a fringilla nunc. Suspendisse volutpat, eros congue scelerisque iaculis, magna odio sodales dui, vitae vulputate elit metus ac arcu. Mauris consequat rhoncus dolor id sagittis. Cras tortor elit, aliquet quis tincidunt eget, dignissim non tortor.</p>


			

		</article>
		<!-- /.post -->

	</div>
	<!-- /#content --> 
	
	
	<aside id="barraLaterals">

		<section class="widget">
			<h4 class="widgettitle">Buscar Libros por</h4>
			<ul>				
				<li><a href=""> Autores</a></li>
				<li><a href="">Cateorias</a></li>
				<li><a href="">Temas</a></li>
				<li><a href="">Nombres</a></li>
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
