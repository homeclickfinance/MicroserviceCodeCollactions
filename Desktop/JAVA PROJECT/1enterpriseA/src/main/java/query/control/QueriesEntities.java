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
public class QueriesEntities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("enterprise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
        
    EntityManager em = JpaUtiles.getEntityManager();
    
    /*   
    System.out.println("==========================  QUERY ENTITIES FUNCTIONS FROM THE DATABASE DATABASE ===========");        
    Query query = em.createQuery("SELECT b FROM Billls b");
    List<Billls> billls = query.getResultList();
    for (Billls billlss : billls) {
	      System.out.println(billlss);}   
			     	
			
			
    Query query1 = em.createQuery("select idbillls from Billls idbillls");
    List<Billls> idbillls = query.getResultList();
    for (Billls idbilllss : idbillls) {
             System.out.println(idbilllss);}
    */    
    System.out.println("===================================== End  ======================================================"); 
    //entityManager.close();  
    
    }
    
}
