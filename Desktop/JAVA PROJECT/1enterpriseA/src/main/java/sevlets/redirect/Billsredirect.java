/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sevlets.redirect;

import billing.clients.BillingServices;
import entity.enterprise.Billls;
import interfaz.control.Billsinterfase;
import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.util.Collections.list;
import java.util.List;
/**
 *
 * @author homec
 */


public class Billsredirect extends HttpServlet {

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
       
        System.out.println(" hi ..." + new java.util.Date()); 
        List<Billls> listbills = BillingServices.getBilllsDetails();
        
        if (!listbills.isEmpty()){
            request.setAttribute("billls", listbills);
            ServletContext sc = getServletContext();
                    RequestDispatcher rd = sc.getRequestDispatcher("/viewbills.xhtml");
                    rd.forward(request, response);
        }
        
        System.out.println("================================= Clintes DB Connection =========================");
        System.out.println("billls:" + listbills);
        request.setAttribute("billls", listbills);
        
    }
    
    
}

