/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz.staffs;

import entity.enterprise.Staff;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author homec
 */

@Local 
public interface StaffInterfase {
    
    public List<Staff> findStaff();
    
    List<Staff> listar();
    
    public Staff findnumbersByID(Staff staff);
    
    public void insertStaff(Staff staff);
    
    public void updateStaff(Staff staff);
    
    public void deleteStaff(Staff staff);
    
}
