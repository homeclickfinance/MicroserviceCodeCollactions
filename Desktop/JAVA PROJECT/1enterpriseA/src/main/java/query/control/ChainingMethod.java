/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package query.control;

import entily.jutil.JpaUtiles;
import entity.enterprise.Billls;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author homec
 */
public class ChainingMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("enterprise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
        
    EntityManager em = JpaUtiles.getEntityManager();
    
       
    System.out.println("==========================  CHAINING METHOD ENTITIES FUNCTIONS FROM THE DATABASE DATABASE ===========");        
    /*
    Guide guide = (Guide) em.createQuery("select guide from Guide guide where guide.name = :name").
    .setParameter("name", "Ian Lamb")
    .getSingleResult();
    System.out.println(guide);
    */	
        
    System.out.println("===================================== End  ======================================================"); 
    entityManager.close();  
    
    
    }
    
}
