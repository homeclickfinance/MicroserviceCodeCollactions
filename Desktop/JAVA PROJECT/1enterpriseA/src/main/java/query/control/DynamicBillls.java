/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package query.control;

import entily.jutil.JpaUtiles;
import entity.enterprise.Billls;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author homec
 */
public class DynamicBillls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    // TODO code application logic here
                                            
        //========================= JPQL CREATE QUERY CODE TYPE HERE  (dynamic queries types)==============================="
       /* 
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("enterprise");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
        
       EntityManager em = JpaUtiles.getEntityManager(); 
        
        System.out.println("=========== CREATE ALL THE QUERY NEEDED FROM THE DATABASE ==========");
        List<Billls> billls = em.createQuery("SELECT b FROM Billls b", Billls.class)
                .getResultList();
                billls.forEach(System.out::println);
                
        System.out.println("========== GET ALL QUERY FROM THE UNIQUE ID FORM IDBILLLS DATABASE ===========");
        Query query = em.createQuery("SELECT b FROM Billls b WHERE b.idbillls = :idbillls");
                query.setParameter("idbillls", 1);
                Billls idbillls = (Billls) query.getSingleResult();
                System.out.println(idbillls);
                
        System.out.println("========== GET ALL QUERY FROM THE LIGHTBILL DATABASE ===========");
        Query query1 = em.createQuery("SELECT b FROM Billls b WHERE b.lightbill = :lightbill");
                query1.setParameter("lightbill","x");
                query1.setParameter("lightbill","y");
                Billls lightbill = (Billls) query.getSingleResult();
                System.out.println(lightbill);
                
                
        System.out.println("========== GET ALL QUERY FROM THE WATERBILL DATABASE ===========");
        Query query2 = em.createQuery("SELECT b FROM Billls b WHERE b.waterbill = :waterbill");
                query2.setParameter("waterbill","");
                Billls waterbill = (Billls) query.getSingleResult();
                System.out.println(waterbill);
                
                
        System.out.println("========== GET ALL QUERY FROM THE UTILITIESBILLS DATABASE ===========");
        Query query3 = em.createQuery("SELECT b FROM Billls b WHERE b.utilitiesbills = :utilitiesbills");
                query3.setParameter("utilitiesbills","");
                Billls utilitiesbills = (Billls) query.getSingleResult();
                System.out.println(utilitiesbills);
        
        */
       
        /*
        System.out.println("========================== GET ALL QUERY FROM THE COST DATABASE ===========");
        Query query4 = em.createQuery("SELECT b FROM Billls b WHERE b.cost = :cost");
                query4.setParameter("cost","");
                Billls cost = (Billls) query.getSingleResult();
                System.out.println(cost);
        */        
        System.out.println("===================================== End  ======================================================"); 
        
        //entityManager.close();
	
	}

}