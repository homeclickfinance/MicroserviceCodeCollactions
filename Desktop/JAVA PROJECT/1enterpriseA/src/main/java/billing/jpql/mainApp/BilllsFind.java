/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billing.jpql.mainApp;

import entity.enterprise.Billls;
import entity.enterprise.Restruante;
import entity.enterprise.Staff;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */
public class BilllsFind {

    /**
     * @param args the command line arguments
     */
    
    static Logger log = LogManager.getRootLogger();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterprise");
        EntityManager em = emf.createEntityManager();

        //Start the transcation
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //The list of objects to search for
        System.out.println("====================Print first Searching for Transaction============================");
        Billls billls = em.find(Billls.class, 9);
        System.out.println("====================Print Second Searching for Transaction============================");
        Restruante restruante = em.find(Restruante.class, 10);
        //Staff staff = em.find(Staff.class, 3);
        //Finish the committed objects
        System.out.println("====================Searching oject Commited============================");
        tx.commit();
       
        //The state of the commited object
        System.out.println("====================Print LogDebug of Objects commited============================");
        log.debug("We are found the following billls object:" + billls);
        log.debug("We are found the following Resturante object:" + restruante);
        //log.debug("We are found the following staff object:" + staff);
        
        //The entity manager is close
        em.close();
        emf.close();
    }
    
}
