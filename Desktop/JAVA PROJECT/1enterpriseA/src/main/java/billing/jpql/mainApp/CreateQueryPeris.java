/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billing.jpql.mainApp;

import entity.enterprise.Billls;
import entity.enterprise.Staff;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author homec
 */
public class CreateQueryPeris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
                
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterprise");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction(); 
       
       
       
       tx.begin(); // Bigin the execution
       
       //Billls billls = new Billls(); 
        

         
    // Here is where the JPQL query will be use and the related statements      
       /*Query query = em.createNativeQuery("INSERT INTO billls (idbillls,lightbill,waterbill,utilitiesbills) VALUES (?,?,?,?)");
                query.setParameter(1, 1);
                query.setParameter(2, "third");
                query.setParameter(3, "Wthud");
                query.setParameter(4, "goop");
                query.executeUpdate();
        */        
      
    
                
     em.close();  
    }
    
}
