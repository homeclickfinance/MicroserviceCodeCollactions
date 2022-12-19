/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goods.jpql.mainApp;

import entity.enterprise.Goods;
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
public class GoodsFind {

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
        Goods goods = em.find(Goods.class, 4);
        
        //Finish the committed objects
        System.out.println("====================Searching oject Commited============================");
        tx.commit();
       
        //The state of the commited object
        System.out.println("====================Print LogDebug of Objects commited============================");
        log.debug("We are found the following object:" + goods);
        
        //The entity manager is close
        em.close();
        emf.close();

    }
}
