/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package query.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import query.control.DynamicBillls;

/**
 *
 * @author homec
 */
public class MainfindALLbills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("enterprise");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       
       //================================================= JPQL NAME QUERY GOES HERE ( Static Query type ) ==========================================="
       /*
       System.out.println("================================= Get All Result from the DataBase =========================");
       List<entity.enterprise.Billls> resultList =  entityManager.createNamedQuery("Billls.findAll")
               .getResultList();
               System.out.println(resultList);
       
       
       System.out.println("================================= Get result from the  ID bills colum ============================");
       List<entity.enterprise.Billls> resultList1 =  entityManager.createNamedQuery("Billls.findByIdbillls")
               .setParameter("idbillls", 1)
               .getResultList();
               System.out.println(resultList1);
       
       System.out.println("================================= Get result from the lightbill colum =========================");
       List<entity.enterprise.Billls> resultList2 =  entityManager.createNamedQuery("Billls.findByLightbill")
               .setParameter("lightbill","lightbill0")
               .getResultList();
               System.out.println(resultList2);
       
       System.out.println("================================= Get result from the Waterbill colum =========================");
       List<entity.enterprise.Billls> resultList3 =  entityManager.createNamedQuery("Billls.findByWaterbill")
               .setParameter("waterbill","waterbill0")
               .getResultList();
               System.out.println(resultList3);
       
       System.out.println("================================= Get result from the utilitiesbills colum =========================");
       List<entity.enterprise.Billls> resultList4 =  entityManager.createNamedQuery("Billls.findByUtilitiesbills")
               .setParameter("utilitiesbills","utilitiesbills0")
               .getResultList();
                System.out.println(resultList4);
       */
       
       /*
       System.out.println("================================= Get result from the total cost colum =========================");
       List<entity.enterprise.Billls> resultList5 =  entityManager.createNamedQuery("Billls.findByCost")
               .setParameter("cost","cost0")
               .getResultList();
               System.out.println(resultList5);
       */
       System.out.println("============================= Complete getting all the query from the database =========================");
       
    
       

       

      
      
      
       //entityManager.close();
       
      
        
    
        
    }
    
}