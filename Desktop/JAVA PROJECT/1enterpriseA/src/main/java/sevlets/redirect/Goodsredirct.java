/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sevlets.redirect;

import entity.enterprise.Goods;
import interfez.goods.GoodsInterfase;
import jakarta.inject.Inject;

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
@WebServlet("/staffs")
public class Goodsredirct extends HttpServlet {

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
    GoodsInterfase goodsInterfase; // Declare the interface and inject it and import its package
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
        List<Goods> goods = goodsInterfase.findGoods();
        System.out.println("================================= Clintes DB Connection =========================");
        System.out.println("goods:" + goods);
        request.setAttribute("goods", goods);
        request.getRequestDispatcher("/viewgoods.xhtml").forward(request, response);
    }
    
    
}
