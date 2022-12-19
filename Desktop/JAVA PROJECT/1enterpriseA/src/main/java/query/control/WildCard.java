/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package query.control;

import entily.jutil.JpaUtiles;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.sql.SQLException;

/**
 *
 * @author homec
 */
public class WildCard {

    /**
     * @param args the command line arguments
     */
       
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("enterprise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
        
    EntityManager em = JpaUtiles.getEntityManager();
    
       
    System.out.println("==========================  WILD CARD ENTITIES FUNCTIONS FROM THE DATABASE DATABASE ===========");        
    
    /*
    Query query = em.createQuery("select guide from Guide guide where guide.name like 'm%'");
    List<Guide> guides = query.getResultList();
    for (Guide guide : guides) {
    System.out.println(guide);
    }
			
    */
        
    System.out.println("===================================== End  ======================================================"); 
    //entityManager.close();  
    
    
    }
    
}
