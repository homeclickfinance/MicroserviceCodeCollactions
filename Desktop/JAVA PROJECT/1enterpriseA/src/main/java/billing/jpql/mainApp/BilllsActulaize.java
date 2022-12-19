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
public class BilllsActulaize {
 
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
       System.out.println("====================Actulize first Transaction============================");
       Billls billls = em.find(Billls.class, 1);
                        System.out.println("=============Before Updation========");  
                        System.out.println("IdBils id = "+ billls.getIdbillls());  
         
       
       System.out.println("====================Actulize Second Transcation============================");
       Restruante restruante = em.find(Restruante.class, 2);
                        System.out.println("=================Before Updation============");  
                        System.out.println("Resturante amount = "+ restruante.getAmount());  
       //Staff staff = em.find(Staff.class, 1);
       //Finish the transaction
       System.out.println("====================Comitted Actualized Transaction============================");
       tx.commit();
       
       //the object that was found in the database
       log.debug("Object recovered from the database:" + billls); 
       log.debug("Object recovered from the database:" + restruante);
       //log.debug("Object recovered from the database:" + staff);
       
       //the value (SETvalue) that is set to the new (object Value) 
       System.out.println("====================Object that will be actualized============================");
       billls.setIdbillls(100);
                        System.out.println("=============After Updation=========="); 
                        System.out.println("IdBils id = "+ billls.getIdbillls());
       
       restruante.setAmount("actity");
                        System.out.println("==================After Updation==========="); 
                        System.out.println("Resturante amount = "+ restruante.getAmount());
       
    
       
       
       //The object that is modify after the change
       em.merge(billls);
       em.merge(restruante);
       //em.merge(staff);
       
       //finish the change made in the database
       
       System.out.println("====================List of Object that where the Transaction Actualized============================");
       //the state of the object the was modify in the database
       log.debug("Object actualize in the billls databse:" + billls);
       log.debug("Object actualize in the resturantes databse:" + restruante); 
       //log.debug("Object actualize in the staff databse:" + staff);
        //Close the entity manager
       em.close();
       emf.close();
    }
    
}
