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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */
public class StaffActualize {

    /**
     * @param args the command line arguments
     */
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        // TODO code application logic here
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterprise");
       EntityManager em = emf.createEntityManager();
        

        //Start the transaction
       EntityTransaction tx = em.getTransaction();
       tx.begin();

       //Exacute the SQL selection type
       System.out.println("====================Bigin to Actulize Transaction============================");
       //Find the ID the exist in the database  
       System.out.println("====================Actulize Staff Transaction============================");
       Staff staff = em.find(Staff.class, 5);
                        System.out.println("==============Before Updation=================");  
                        System.out.println("Getting Staff id Number = "+ staff.getNumbers());
       
       //Finish the transaction
       System.out.println("====================Comitted Actualized Transaction============================");
       tx.commit();
       
       //the object that was found in the database
       log.debug("Object recovered from the database:" + staff); 
       
       
       //the value (SETvalue) that is set to the new (object Value) 
       System.out.println("====================Object that will be actualized============================");
       staff.setNumbers(100);
                        System.out.println("==================After Updation======================"); 
                        System.out.println("Getting Staff id Number upgrade  = "+ staff.getNumbers());
       
       
    
       //The object that is modify after the change 
       em.merge(staff);
       
       //finish the change made in the database
       //the state of the object the was modify in the database
       System.out.println("====================List of Object that where the Transaction Actualized============================");
       log.debug("Object actualize in the databse:" + staff);
        
        //Close the entity manager
       em.close();
       emf.close();
   
    }
    
}
