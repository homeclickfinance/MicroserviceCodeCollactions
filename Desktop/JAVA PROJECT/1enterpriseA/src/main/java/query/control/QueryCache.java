/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package query.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;




/**
 *
 * @author homec
 */
public class QueryCache {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterprise");        				
    //Statistics stats = emf.unwrap(SessionFactory.class).getStatistics();
    //stats.setStatisticsEnabled(true);
				
    EntityManager em1 = emf.createEntityManager();
    em1.getTransaction().begin();
    
    /*
    Guide guide1 = (Guide) em1.createQuery("select guide from Guide guide where guide.name = :name")
										.setParameter("name", "Ian Lamb")
										.setHint("org.hibernate.cacheable", true)											  
										.getSingleResult();	
    System.out.println(guide1.getSalary());
				
    em1.getTransaction().commit();
    em1.close(); 

    EntityManager em2 = emf.createEntityManager();
    em2.getTransaction().begin();

    Guide guide2 = em2.find(Guide.class, 2L);
    guide2.setSalary(5000);
				
    em2.getTransaction().commit();		
    em2.close(); 			
				
    EntityManager em3 = emf.createEntityManager();
    em3.getTransaction().begin();

    Guide guide3 = (Guide) em3.createQuery("select guide from Guide guide where guide.name = :name")
										.setParameter("name", "Ian Lamb")
										.setHint("org.hibernate.cacheable", true)											  
										.getSingleResult();	
    System.out.println(guide3.getSalary());
				
   em3.getTransaction().commit();		
   em3.close(); 
   */
    }
    
}
