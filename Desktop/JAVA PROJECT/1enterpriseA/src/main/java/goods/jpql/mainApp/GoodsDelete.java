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
public class GoodsDelete {

    /**
     * @param args the command line arguments
     */
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterprise");
        EntityManager em = emf.createEntityManager();

        //Starting of the transaction
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Execute SQL type selected 
        System.out.println("====================Print first Start delete============================");
        Goods goods = em.find(Goods.class, 6);
        
        
        // the state of the object detached
        log.debug("object found is:" + goods);
        
                //The Sql is remove and deleted
        System.out.println("====================Romove starting============================");
        em.remove(goods);
        
        //Terminate transaction
        System.out.println("====================Delete Transcation commited============================");
        tx.commit();
        
         
        //the object is commit and eliminated
        System.out.println("====================Print Debug Delete Transactions============================");
        log.debug("the state of the object is complete:" + goods);
        
        //Transcation is closed
        System.out.println("====================Closing transcation finished============================");
        em.close();
        emf.close();
    }
    
}
