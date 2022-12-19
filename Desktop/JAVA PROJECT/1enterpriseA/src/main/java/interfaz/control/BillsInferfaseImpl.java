/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz.control;

import entity.enterprise.Billls;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author homec
 */

@Stateless
public class BillsInferfaseImpl implements Billsinterfase {
    
    EntityManager em;
    

 
    @Override
    public List<Billls> findBillls() {
         return em.createNamedQuery("Billls.findAll").getResultList();
    }
    
    @Override
    public List<Billls> listar() {
        return em.createQuery("SELECT b FROM Billls b", Billls.class).getResultList();
    }

    @Override
    public Billls findBilllsByID(Billls billls) {
        
         return em.find(Billls.class, billls.getIdbillls());
    
    }

    @Override
    public void insertBillls(Billls billls) {
         
       em.persist(billls); 
    }

    @Override
    public void updateBillls(Billls billls) {
        
        em.merge(billls);    
    }

    @Override
    public void deleteBillls(Billls billls) {
        em.remove(em.merge(billls));
    }
    
}
