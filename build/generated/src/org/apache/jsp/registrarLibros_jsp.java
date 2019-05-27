package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarLibros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"niceforms.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"niceforms-default.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <fieldset>\n");
      out.write("    \t<legend>Personal Info</legend>\n");
      out.write("        <dl>\n");
      out.write("        \t<dt><label for=\"email\">Email Address:</label></dt>\n");
      out.write("            <dd><input type=\"text\" name=\"email\" id=\"email\" size=\"32\" maxlength=\"128\" /></dd>\n");
      out.write("        </dl>\n");
      out.write("        <dl>\n");
      out.write("        \t<dt><label for=\"password\">Password:</label></dt>\n");
      out.write("            <dd><input type=\"password\" name=\"password\" id=\"password\" size=\"32\" maxlength=\"32\" /></dd>\n");
      out.write("        </dl>\n");
      out.write("        <dl>\n");
      out.write("        \t<dt><label for=\"gender\">Gender:</label></dt>\n");
      out.write("            <dd>\n");
      out.write("            \t<select size=\"1\" name=\"gender\" id=\"gender\">\n");
      out.write("                    <option value=\"Guy\">Guy</option>\n");
      out.write("                    <option value=\"Girl\">Girl</option>\n");
      out.write("                    <option value=\"Dude\">Dude</option>\n");
      out.write("                    <option value=\"Chic\">Chic</option>\n");
      out.write("                    <option value=\"Gentleman\">Gentleman</option>\n");
      out.write("                    <option value=\"Lady\">Lady</option>\n");
      out.write("                    <option value=\"Male\">Male</option>\n");
      out.write("                    <option value=\"Female\">Female</option>\n");
      out.write("                    <option value=\"Don't Ask\">Don't Ask</option>\n");
      out.write("            \t</select>\n");
      out.write("            </dd>\n");
      out.write("        </dl>\n");
      out.write("        <dl>\n");
      out.write("        \t<dt><label for=\"dobMonth\">Date of Birth:</label></dt>\n");
      out.write("            <dd>\n");
      out.write("            \t<select size=\"1\" name=\"dobMonth\" id=\"dobMonth\">\n");
      out.write("                \t<option value=\"Jan\">Jan</option>\n");
      out.write("                    <option value=\"Feb\">Feb</option>\n");
      out.write("                    <option value=\"Mar\">Mar</option>\n");
      out.write("                    <option value=\"Apr\">Apr</option>\n");
      out.write("                    <option value=\"May\">May</option>\n");
      out.write("                    <option value=\"Jun\">Jun</option>\n");
      out.write("                    <option value=\"Jul\">Jul</option>\n");
      out.write("                    <option value=\"Aug\">Aug</option>\n");
      out.write("                    <option value=\"Sep\">Sep</option>\n");
      out.write("                    <option value=\"Oct\">Oct</option>\n");
      out.write("                    <option value=\"Nov\">Nov</option>\n");
      out.write("                    <option value=\"Dec\">Dec</option>\n");
      out.write("                </select>\n");
      out.write("                <select size=\"1\" name=\"dobDay\" id=\"dobDay\">\n");
      out.write("                \t<option value=\"01\">01</option>\n");
      out.write("                    <option value=\"02\">02</option>\n");
      out.write("                    <option value=\"03\">03</option>\n");
      out.write("                    <option value=\"04\">04</option>\n");
      out.write("                    <option value=\"05\">05</option>\n");
      out.write("                    <option value=\"06\">06</option>\n");
      out.write("                    <option value=\"07\">07</option>\n");
      out.write("                    <option value=\"08\">08</option>\n");
      out.write("                    <option value=\"09\">09</option>\n");
      out.write("                    <option value=\"10\">10</option>\n");
      out.write("                    <option value=\"11\">11</option>\n");
      out.write("                    <option value=\"12\">12</option>\n");
      out.write("                    <option value=\"13\">13</option>\n");
      out.write("                    <option value=\"14\">14</option>\n");
      out.write("                    <option value=\"15\">15</option>\n");
      out.write("                    <option value=\"16\">16</option>\n");
      out.write("                    <option value=\"17\">17</option>\n");
      out.write("                    <option value=\"18\">18</option>\n");
      out.write("                    <option value=\"19\">19</option>\n");
      out.write("                    <option value=\"20\">20</option>\n");
      out.write("                    <option value=\"21\">21</option>\n");
      out.write("                    <option value=\"22\">22</option>\n");
      out.write("                    <option value=\"23\">23</option>\n");
      out.write("                    <option value=\"24\">24</option>\n");
      out.write("                    <option value=\"25\">25</option>\n");
      out.write("                    <option value=\"26\">26</option>\n");
      out.write("                    <option value=\"27\">27</option>\n");
      out.write("                    <option value=\"28\">28</option>\n");
      out.write("                    <option value=\"29\">29</option>\n");
      out.write("                    <option value=\"30\">30</option>\n");
      out.write("                    <option value=\"31\">31</option>\n");
      out.write("                </select>\n");
      out.write("                <select size=\"1\" name=\"dobYear\" id=\"dobYear\">\n");
      out.write("                \t<option value=\"2000\">2000</option>\n");
      out.write("                    <option value=\"1999\">1999</option>\n");
      out.write("                    <option value=\"1998\">1998</option>\n");
      out.write("                    <option value=\"1997\">1997</option>\n");
      out.write("                    <option value=\"1996\">1996</option>\n");
      out.write("                    <option value=\"1995\">1995</option>\n");
      out.write("\t\t\t\t\t<option value=\"1994\">1994</option>\n");
      out.write("\t\t\t\t\t<option value=\"1993\">1993</option>\n");
      out.write("\t\t\t\t\t<option value=\"1992\">1992</option>\n");
      out.write("\t\t\t\t\t<option value=\"1991\">1991</option>\n");
      out.write("\t\t\t\t\t<option value=\"1990\">1990</option>\n");
      out.write("\t\t\t\t\t<option value=\"1989\">1989</option>\n");
      out.write("\t\t\t\t\t<option value=\"1988\">1988</option>\n");
      out.write("\t\t\t\t\t<option value=\"1987\">1987</option>\n");
      out.write("\t\t\t\t\t<option value=\"1986\">1986</option>\n");
      out.write("\t\t\t\t\t<option value=\"1985\">1985</option>\n");
      out.write("\t\t\t\t\t<option value=\"1984\">1984</option>\n");
      out.write("\t\t\t\t\t<option value=\"1983\">1983</option>\n");
      out.write("\t\t\t\t\t<option value=\"1982\">1982</option>\n");
      out.write("\t\t\t\t\t<option value=\"1981\">1981</option>\n");
      out.write("\t\t\t\t\t<option value=\"1980\">1980</option>\n");
      out.write("\t\t\t\t\t<option value=\"1979\">1979</option>\n");
      out.write("\t\t\t\t\t<option value=\"1978\">1978</option>\n");
      out.write("\t\t\t\t\t<option value=\"1977\">1977</option>\n");
      out.write("\t\t\t\t\t<option value=\"1976\">1976</option>\n");
      out.write("\t\t\t\t\t<option value=\"1975\">1975</option>\n");
      out.write("\t\t\t\t\t<option value=\"1974\">1974</option>\n");
      out.write("\t\t\t\t\t<option value=\"1973\">1973</option>\n");
      out.write("\t\t\t\t\t<option value=\"1972\">1972</option>\n");
      out.write("\t\t\t\t\t<option value=\"1971\">1971</option>\n");
      out.write("\t\t\t\t\t<option value=\"1970\">1970</option>\n");
      out.write("\t\t\t\t\t<option value=\"1969\">1969</option>\n");
      out.write("\t\t\t\t\t<option value=\"1968\">1968</option>\n");
      out.write("\t\t\t\t\t<option value=\"1967\">1967</option>\n");
      out.write("\t\t\t\t\t<option value=\"1966\">1966</option>\n");
      out.write("\t\t\t\t\t<option value=\"1965\">1965</option>\n");
      out.write("\t\t\t\t\t<option value=\"1964\">1964</option>\n");
      out.write("\t\t\t\t\t<option value=\"1963\">1963</option>\n");
      out.write("\t\t\t\t\t<option value=\"1962\">1962</option>\n");
      out.write("\t\t\t\t\t<option value=\"1961\">1961</option>\n");
      out.write("\t\t\t\t\t<option value=\"1960\">1960</option>\n");
      out.write("\t\t\t\t\t<option value=\"1959\">1959</option>\n");
      out.write("\t\t\t\t\t<option value=\"1958\">1958</option>\n");
      out.write("\t\t\t\t\t<option value=\"1957\">1957</option>\n");
      out.write("\t\t\t\t\t<option value=\"1956\">1956</option>\n");
      out.write("\t\t\t\t\t<option value=\"1955\">1955</option>\n");
      out.write("\t\t\t\t\t<option value=\"1954\">1954</option>\n");
      out.write("\t\t\t\t\t<option value=\"1953\">1953</option>\n");
      out.write("\t\t\t\t\t<option value=\"1952\">1952</option>\n");
      out.write("\t\t\t\t\t<option value=\"1951\">1951</option>\n");
      out.write("\t\t\t\t\t<option value=\"1950\">1950</option>\n");
      out.write("                </select>\n");
      out.write("            </dd>\n");
      out.write("        </dl>\n");
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
