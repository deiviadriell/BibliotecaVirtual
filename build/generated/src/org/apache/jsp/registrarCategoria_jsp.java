package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Negocio.Libros;

public final class registrarCategoria_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"niceforms.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"niceforms-default.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        Libros unLibro=new Libros();
        try
                               {
        String id="";
        
            
            id=String.valueOf(unLibro.obtenerIdCategoria());
                       }
        catch(Exception ex)
        {
            out.write(ex.getMessage());
            out.write(unLibro.getEstado());
        }
        
      out.write("\n");
      out.write("        <form action=\"registrarCategorias\" method=\"post\" class=\"niceform\">\n");
      out.write("\t<fieldset>\n");
      out.write("            <legend>Informaci&oacute;n de Categorias</legend>\n");
      out.write("        <dl>\n");
      out.write("        \t<dt><label for=\"email\">C&oacute;digo:</label></dt>\n");
      out.write("            <dd><input type=\"text\" name=\"txtCodigo\" value=\"");
out.write(id);
      out.write("\" id=\"email\" size=\"32\" maxlength=\"128\" required=\"\" /></dd>\n");
      out.write("        </dl>\n");
      out.write("        <dl>\n");
      out.write("            <dt><label for=\"password\">Descripci&oacute;n:</label></dt>\n");
      out.write("            <dd><input type=\"text\" name=\"txtDescripcion\" id=\"password\" size=\"32\" maxlength=\"32\" required=\"\" /></dd>\n");
      out.write("        </dl>\n");
      out.write("        \n");
      out.write("    </fieldset>\n");
      out.write("            <fieldset class=\"action\">\n");
      out.write("    \t<input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Registrar\" />\n");
      out.write("    </fieldset>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
