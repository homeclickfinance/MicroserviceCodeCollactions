/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz.resturante;


import entity.enterprise.Restruante;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author homec
 */
@Stateless
public class ResturanteInterfaseImpl implements ResturanteInterfase {
    
EntityManager em;
    

 
    @Override
    public List<Restruante> findRestruante() {
         return em.createNamedQuery("Restruante.findAll").getResultList();
    }
    
    @Override
    public List<Restruante> listar() {
        return em.createQuery("SELECT r FROM Restruante r", Restruante.class).getResultList();
    }

    @Override
    public Restruante findBookingNumByID(Restruante restruante) {
        
         return em.find(Restruante.class, restruante.getBookingNum());
    
    }

    @Override
    public void insertRestruante(Restruante restruante) {
         
       em.persist(restruante); 
    }

    @Override
    public void updateRestruante(Restruante restruante) {
        
        em.merge(restruante);    
    }

    @Override
    public void deleteRestruante(Restruante restruante) {
        em.remove(em.merge(restruante));
    }
    
}
