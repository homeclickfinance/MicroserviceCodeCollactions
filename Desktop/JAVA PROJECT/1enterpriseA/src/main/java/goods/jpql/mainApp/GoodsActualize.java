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
public class GoodsActualize {

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
       Goods goods = em.find(Goods.class, 6);
                        System.out.println("=============Before Updation================");  
                        System.out.println("Getting Goods id Number = "+ goods.getIdgoods());
       
       //Finish the transaction
       System.out.println("====================Comitted Actualized Transaction============================");
       tx.commit();
       
       //the object that was found in the database
       log.debug("Object recovered from the database:" + goods); 
       
       
       //the value (SETvalue) that is set to the new (object Value) 
       System.out.println("====================Object that will be actualized============================");
       goods.setIdgoods(10);
                        System.out.println("=================After Updation======================="); 
                        System.out.println("Getting goods id Number upgrade  = "+ goods.getIdgoods());
       
       
    
       //The object that is modify after the change 
       em.merge(goods);
       
       //finish the change made in the database
       //the state of the object the was modify in the database
       System.out.println("====================List of Object that where the Transaction Actualized============================");
       log.debug("Object actualize in the databse:" + goods);
        
        //Close the entity manager
       em.close();
       emf.close();
     
    }
    
}
