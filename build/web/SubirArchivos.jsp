<%@page import="Negocio.Libros"%>
<?xml version="1.0"?>
<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<%@ page import="org.apache.commons.fileupload.*, org.apache.commons.fileupload.servlet.ServletFileUpload, org.apache.commons.fileupload.disk.DiskFileItemFactory, org.apache.commons.io.FilenameUtils, java.util.*, java.io.File, java.lang.Exception" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>File Upload Example</title>
</head>
<body>
<h1>Data Received at the Server</h1>
<hr/>
<p>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.*" %>
<%@ page import="java.io.*" %>
 
<%
        /*FileItemFactory es una interfaz para crear FileItem*/
            FileItemFactory file_factory = new DiskFileItemFactory();
 
        /*ServletFileUpload esta clase convierte los input file a FileItem*/
        ServletFileUpload servlet_up = new ServletFileUpload(file_factory);
        /*sacando los FileItem del ServletFileUpload en una lista */
        List items = servlet_up.parseRequest(request);
        ArrayList<String> valores = new ArrayList<String>();
        
        
        for(int i=0;i<items.size();i++){
            /*FileItem representa un archivo en memoria que puede ser pasado al disco duro*/
            FileItem item = (FileItem) items.get(i);
            /*item.isFormField() false=input file; true=text field*/
            if (! item.isFormField()){
                /*cual sera la ruta al archivo en el servidor*/
                File carpeta=new File("c:/Documentos");
                if(carpeta.exists()==false)
                carpeta.mkdirs();   
                        
                File archivo_server = new File(carpeta+"/"+item.getName());
                /*y lo escribimos en el servido*/
                item.write(archivo_server);
                out.print("Nombre --> " + item.getName() );
                out.print("<br> Tipo --> " + item.getContentType());
                out.print("<br> tamaño --> " + (item.getSize()/1240)+ "KB");
                out.print("<br>");
            }
            else
            {
                
                valores.add(item.getString());
                /*String nombreDelCampo = item.getFieldName();
                String valorDelCampo = item.getString();                */
                
            }
            
        }
        for(int i=0;i<valores.size();i++)
            out.write(valores.get(i));
        
        
        Libros unLibro=new Libros(valores.get(0),"",valores.get(1),valores.get(3),valores.get(2));
        if(unLibro.RegistrarLibros(session.getAttribute("usuario").toString()))
        {
            session.setAttribute("estado", "El libro fue registrado correctamente");
            
            
        }
         else
        {
            session.setAttribute("estado", "error al intentar registrar");
         }
        response.sendRedirect("registrarLibros.jsp");
                
        
%>
</p>


</body>
</html> 