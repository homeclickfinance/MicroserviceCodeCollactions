/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sevlets.redirect;

import entity.enterprise.Restruante;
import interfaz.resturante.ResturanteInterfase;
import jakarta.inject.Inject;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author homec
 */


public class Resturedirect extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Inject
            
    ResturanteInterfase resturanteInterfase; // Declare the interface and inject it and import its package
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         
        List<Restruante> restruante = resturanteInterfase.findRestruante();
        System.out.println("================================= Clintes DB Connection =========================");
        System.out.println("restruante:" + restruante);
        request.setAttribute("restruante", restruante);
        request.getRequestDispatcher("/viewresturante.xhtml").forward(request, response);
    }
    
    
}

