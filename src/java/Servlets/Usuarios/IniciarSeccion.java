/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets.Usuarios;

import Clases.Conexion;
import Negocio.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "IniciarSeccion", urlPatterns = {"/IniciarSeccion"})
public class IniciarSeccion extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IniciarSeccion</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IniciarSeccion at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             *
             */
//            String usuario,clave;
//            ResultSet uR;
//            usuario=request.getParameter("txtUsuario");
//            clave=request.getParameter("txtClave");
//            
//            if(!"".equals(usuario)&&!"".equals(clave))
//            {
//                Conexion unaConexion=new Conexion();                
//                uR=unaConexion.Consulta("SELECT * FROM Usuario WHere idUsuario='"+usuario+"'and Clave='"+clave+"'");
//               try
//               {
//                   if(uR.getRow()!=0)
//                   {
//                       //Obtengo la session
//                      HttpSession session=request.getSession();
//                      //Asigno el usuario a la session
//                      session.setAttribute("Usuario", usuario);
//                      response.sendRedirect("index.jsp");
//                   }
//               }
//               catch(Exception ex)
//               {
//                   out.write(ex.getMessage().toString());
//               }
//            
//            }
            response.sendRedirect("banner.jsp");
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
