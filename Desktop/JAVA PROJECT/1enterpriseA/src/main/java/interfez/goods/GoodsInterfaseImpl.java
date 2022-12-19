/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfez.goods;

import entity.enterprise.Goods;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author homec
 */

@Stateless
public class GoodsInterfaseImpl implements GoodsInterfase {
    
    EntityManager em;

    @Override
    public List<Goods> findGoods() {
        return em.createNamedQuery("Goods.findAll").getResultList();
    }

    @Override
    public List<Goods> lists() {
        return em.createQuery("SELECT g FROM Goods g", Goods.class).getResultList();
    }

    @Override
    public Goods findByIdgoods(Goods goods) {
        return em.find(Goods.class, goods.getIdgoods());
    }

    @Override
    public void insertGoods(Goods goods) {
        em.persist(goods);
    }

    @Override
    public void updateGoods(Goods goods) {
        em.merge(goods);
    }

    @Override
    public void deleteGoods(Goods goods) {
         em.remove(em.merge(goods));  // Can be use to merge or delete data from the database
    }
    
}
