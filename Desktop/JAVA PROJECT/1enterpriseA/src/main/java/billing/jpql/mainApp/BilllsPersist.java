/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billing.jpql.mainApp;


import entity.enterprise.Billls;
import entity.enterprise.Restruante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//import org.apache.logging.log4j.*;


/**
 *
 * @author homec
 */
public class BilllsPersist   {

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
       //The list of Object that will be perisit and entered into the database
       
       System.out.println("====================Print first Start============================");
       
       Billls billls1 = new Billls();
       //billls1.setIdbillls(100);
       billls1.setLightbill("amout");
       billls1.setWaterbill("loco");
       billls1.setUtilitiesbills("foro");       
       
       Restruante restruante1 = new Restruante();
       //restruante1.setBookingNum(10);
       restruante1.setAmount("coop");
       restruante1.setType("nut");
       restruante1.setTotal("glory");
       restruante1.setTablesize("goop");
       restruante1.setPosition("lkexx");        
               
       
       System.out.println("====================Print Persist============================");
        //EXecute the Query it not needed to add data to persist data to the database
       em.persist(billls1);
       em.persist(restruante1);
        
        
       System.out.println("====================Print if perisit============================");
       log.debug("Object persist - with out commit:" + billls1);
       log.debug("Object persist - with out commit:" + restruante1); 
       
        
        
        //Make the change either commit or rollback
       tx.commit();
       log.debug("Object is comited and - and data is billls save:" + billls1);
       log.debug("Object is comited and - and data is resturante save:" + restruante1);
       
        
        
        //Close conection
        System.out.println("====================Print commit============================");
        em.close();
        emf.close(); 
        
        
    }
    
}
