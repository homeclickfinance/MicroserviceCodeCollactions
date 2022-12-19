/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sevlets.redirect;

import billing.clients.Staffservice;
import entity.enterprise.Staff;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author homec
 */

@WebServlet("/Staffcontroleres")
public class Staffcontrol extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
        System.out.println(" hi staffs ..." + new java.util.Date());
        List<Staff> staffes = new Staffservice().listar(); // This comes comes from the staff service and listar con the same class package
        System.out.println("staffs = " + staffes);
        request.setAttribute("staffs", staffes);
        request.getRequestDispatcher("/viewstaff.xhtml").forward(request, response);
    }
    
}




   