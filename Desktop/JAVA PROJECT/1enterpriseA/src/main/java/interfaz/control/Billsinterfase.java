/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz.control;

import entity.enterprise.Billls;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author homec
 */

@Local 
public interface Billsinterfase {
    
    public List<Billls> findBillls();
    
    List<Billls> listar();
    
    public Billls findBilllsByID(Billls billls);
    
    public void insertBillls(Billls billls);
    
    public void updateBillls(Billls Billls);
    
    public void deleteBillls(Billls billls);
    
}
