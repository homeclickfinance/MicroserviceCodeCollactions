/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz.resturante;


import entity.enterprise.Restruante;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author homec
 */
        
@Local        
public interface ResturanteInterfase {
    
    public List<Restruante> findRestruante();
    
    List<Restruante> listar();
    
    public Restruante findBookingNumByID(Restruante restruante);
    
    public void insertRestruante(Restruante restruante);
    
    public void updateRestruante(Restruante restruante);
    
    public void deleteRestruante(Restruante restruante);
    


    
}
