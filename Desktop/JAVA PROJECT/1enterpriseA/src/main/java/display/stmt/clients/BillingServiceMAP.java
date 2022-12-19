/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package display.stmt.clients;

import billing.clients.BillingServices;
import billing.clients.Goodservice;
import billing.clients.ResturanteService;
import billing.clients.Staffservice;
import entily.jutil.JpaUtiles;
import entity.enterprise.Billls;
import entity.enterprise.Goods;
import entity.enterprise.Restruante;
import entity.enterprise.Staff;
import jakarta.persistence.EntityManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author homec
 */
public class BillingServiceMAP {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
        
        BillingServices billingServices = new BillingServices(); // This is the Backend JPQL code and Asociation of Ojects.
        ResturanteService resturanteService = new ResturanteService();
        Staffservice staffservice = new Staffservice();
        Goodservice goodservice = new Goodservice();
        
        
        Billls billlsj = new Billls();                 
        Restruante restruantej = new Restruante();
        Goods goodss  = new Goods();                 
        Staff staffez = new Staff();
        
        
        
        

        
        System.out.println("Data that is persisted form the billls object" + billlsj); 
        System.out.println("Data that is persisted from the resturante objects" + restruantej);
                System.out.println("Data that is persisted form the billls object" + goodss); 
        System.out.println("Data that is persisted from the resturante objects" + staffez);
                
        System.out.println("Backends data coming Billls JPQL code" + billingServices);
        System.out.println("Backends data coming Resturante JPQL code" + resturanteService);
        System.out.println("Backends data coming Billls JPQL code" + staffservice);
        System.out.println("Backends data coming Resturante JPQL code" + goodservice);
        
                
                
    }
    
}
