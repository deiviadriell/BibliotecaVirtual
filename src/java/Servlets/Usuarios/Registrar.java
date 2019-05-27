/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets.Usuarios;

import Clases.Conexion;
import Negocio.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "RegistrarUsuario", urlPatterns = {"/RegistrarUsuario"})
public class Registrar extends HttpServlet {

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
            out.println("<title>Servlet RegistrarUsuario</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarUsuario at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
            HttpSession session = request.getSession();
            String idUsuario,clave,nombres,apellidos,email,rol;
            idUsuario=request.getParameter("txtIdUsuario");
            clave=request.getParameter("txtClave");
            nombres=request.getParameter("txtNombres");
            apellidos=request.getParameter("txtApellidos");
            email=request.getParameter("txtEmail");
            rol="1";
            
            //Usuario unUsuario=new Usuario(nombres,apellidos,email,idUsuario,email,clave);
            Conexion unaConexion =new Conexion();
            try
            {
            
            unaConexion.Insertar("INSERT INTO `bdbibliotecavirtual`.`usuario` (`idUsuario`, `Clave`, `Nombres`, `Apellidos`, `Email`, `Roles_idRoles`) VALUES ('"+idUsuario+"', '"+clave+"', '"+nombres+"', '"+apellidos+"', '"+email+"', "+rol+");");
            session.setAttribute("nombreUsuario", nombres);        
                  session.setAttribute("apellidoUsuario", apellidos);   
                  response.sendRedirect("index.jsp");
            }
            catch(Exception ex)
            {
                out.write(unaConexion.getEstado());
            }
            
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
