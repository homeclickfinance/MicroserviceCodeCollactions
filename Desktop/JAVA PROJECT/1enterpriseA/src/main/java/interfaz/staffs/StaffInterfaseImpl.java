/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz.staffs;


import entity.enterprise.Staff;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author homec
 */

@Stateless
public class StaffInterfaseImpl implements StaffInterfase {
    
    EntityManager em;

    @Override
    public List<Staff> findStaff() {
        return em.createNamedQuery("Staff.findAll").getResultList();
    }

    @Override
    public List<Staff> listar() {
        return em.createQuery("SELECT s FROM Staff s", Staff.class).getResultList();
    }

    @Override
    public Staff findnumbersByID(Staff staff) {
        return em.find(Staff.class, staff.getNumbers());
    }

    @Override
    public void insertStaff(Staff staff) {
        em.persist(staff);
    }

    @Override
    public void updateStaff(Staff staff) {
       em.merge(staff);  
    }

    @Override
    public void deleteStaff(Staff staff) {
        
    em.remove(em.merge(staff));
    }
}
