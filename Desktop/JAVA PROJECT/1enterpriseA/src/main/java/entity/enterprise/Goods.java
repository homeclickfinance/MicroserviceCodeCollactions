/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity.enterprise;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author homec
 */
@Entity
@Table(name = "goods", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Goods.findAll", query = "SELECT g FROM Goods g"),
    @NamedQuery(name = "Goods.findByIdgoods", query = "SELECT g FROM Goods g WHERE g.idgoods = :idgoods"),
    @NamedQuery(name = "Goods.findByRice", query = "SELECT g FROM Goods g WHERE g.rice = :rice"),
    @NamedQuery(name = "Goods.findByFlour", query = "SELECT g FROM Goods g WHERE g.flour = :flour"),
    @NamedQuery(name = "Goods.findByWater", query = "SELECT g FROM Goods g WHERE g.water = :water"),
    @NamedQuery(name = "Goods.findByFish", query = "SELECT g FROM Goods g WHERE g.fish = :fish"),
    @NamedQuery(name = "Goods.findByPork", query = "SELECT g FROM Goods g WHERE g.pork = :pork")})
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idgoods")
    private Integer idgoods;
    @Basic(optional = false)
    @Column(name = "rice")
    private String rice;
    @Basic(optional = false)
    @Column(name = "flour")
    private String flour;
    @Basic(optional = false)
    @Column(name = "water")
    private String water;
    @Basic(optional = false)
    @Column(name = "fish")
    private String fish;
    @Column(name = "pork")
    private String pork;

    public Goods() {
    }

    public Goods(Integer idgoods) {
        this.idgoods = idgoods;
    }

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

    public void setIdgoods(Integer idgoods) {
        this.idgoods = idgoods;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getPork() {
        return pork;
    }

    public void setPork(String pork) {
        this.pork = pork;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgoods != null ? idgoods.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Goods)) {
            return false;
        }
        Goods other = (Goods) object;
        if ((this.idgoods == null && other.idgoods != null) || (this.idgoods != null && !this.idgoods.equals(other.idgoods))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Goods[ idgoods=" + idgoods + " ], [rice=" + rice +"], [flour=" + flour +"], [water=" + water +"]"
                + "[fish=" + fish +"], [pork=" + pork +"]";
    }
    
}
