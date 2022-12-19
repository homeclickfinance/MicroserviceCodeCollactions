/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staff.jpql.mainApp;

import entity.enterprise.Staff;
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
public class StaffPersist {

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
       Staff staff1 = new Staff();
       //staff1.setNumbers( 10 );
       staff1.setFirstname("test1");
       staff1.setLasttname("best1");
       staff1.setDepartments("cry1");
       staff1.setPosition("does");
 
       System.out.println("====================Print Persist============================"); 
        //EXecute the Query
       em.persist(staff1);
        
        
       System.out.println("====================Print if perisit============================");
       log.debug("Object persist - with out commit:" + staff1);
         
         
        
        
        //Make the change either commit or rollback
        System.out.println("====================Print commit============================");
        tx.commit();
        log.debug("Object is comited and - and data is save:" + staff1);
        
        
        
        
        //Close conection
        System.out.println("====================Print Close entity manager============================");
        em.close();
        emf.close(); 
   
        
    }
    
}