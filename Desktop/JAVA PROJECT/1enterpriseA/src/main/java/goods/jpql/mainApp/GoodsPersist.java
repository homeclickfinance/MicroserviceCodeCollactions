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
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */
public class GoodsPersist {

    /**
     * @param args the command line arguments
     */
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterprise");
       EntityManager em = emf.createEntityManager();
       EntityTransaction tx = em.getTransaction();
       tx.begin(); // Bigin the execution
       
       System.out.println("====================Print first Start============================");
       //The list of Object that will be perisit and entered into the database  
       Goods goods1 = new Goods();
       //goods1.setIdgoods(10);
       goods1.setRice("ipoung");
       goods1.setFlour("tuti");
       goods1.setWater("pipe");
       goods1.setFish("whale");
       goods1.setPork("lean");
       
       System.out.println("====================Print Persist============================"); 
        //EXecute the Query
       em.persist(goods1);
        
        
       System.out.println("====================Print if perisit============================");
       log.debug("Object persist - with out commit:" + goods1);
         
         
        
        
        //Make the change either commit or rollback
        System.out.println("====================Print commit============================");
        tx.commit();
        log.debug("Object is comited and - and data is save:" + goods1);
        
        
        
        
        //Close conection
        System.out.println("====================Print Close entity manager============================");
        em.close();
        emf.close(); 
    }
    
}