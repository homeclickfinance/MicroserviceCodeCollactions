/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfez.goods;

import entity.enterprise.Goods;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author homec
 */

@Local 
public interface GoodsInterfase {
    
    public List<Goods> findGoods();
    
    List<Goods> lists();
    
    public Goods findByIdgoods(Goods goods);
    
    public void insertGoods(Goods goods);
    
    public void updateGoods(Goods goods);
    
    public void deleteGoods(Goods goods);
    
}
