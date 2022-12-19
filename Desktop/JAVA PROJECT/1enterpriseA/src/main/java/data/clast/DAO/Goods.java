/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.clast.DAO;

/**
 *
 * @author homec
 */
public class Goods {
    
    private Integer idgoods;
    private String rice;
    private String flour;
    private String water;
    private String fish;
    private String pork;
    
    public Goods(Integer idgoods, String rice, String flour, String water, String fish, String pork) {
        this.idgoods = idgoods;
        this.rice = rice;
        this.flour = flour;
        this.water = water;
        this.fish = fish;
        this.pork = pork;
    }

    public Integer getIdgoods() {
        return idgoods;
    }

    public String getRice() {
        return rice;
    }

    public String getFlour() {
        return flour;
    }

    public String getWater() {
        return water;
    }

    public String getFish() {
        return fish;
    }

    public String getPork() {
        return pork;
    }

    public void setIdgoods(Integer idgoods) {
        this.idgoods = idgoods;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public void setPork(String pork) {
        this.pork = pork;
    }

    @Override
    public String toString() {
        return "Goods{" + "idgoods=" + idgoods + ", rice=" + rice + ", flour=" + flour + ", water=" + water + ", fish=" + fish + ", pork=" + pork + '}';
    }
    
    
    
}
