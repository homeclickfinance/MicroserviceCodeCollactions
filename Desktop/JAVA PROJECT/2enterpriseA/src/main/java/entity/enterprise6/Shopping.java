/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity.enterprise6;

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
@Table(name = "shopping", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Shopping.findAll", query = "SELECT s FROM Shopping s"),
    @NamedQuery(name = "Shopping.findByIdshopping", query = "SELECT s FROM Shopping s WHERE s.idshopping = :idshopping"),
    @NamedQuery(name = "Shopping.findByBook", query = "SELECT s FROM Shopping s WHERE s.book = :book"),
    @NamedQuery(name = "Shopping.findByWashingmachine", query = "SELECT s FROM Shopping s WHERE s.washingmachine = :washingmachine"),
    @NamedQuery(name = "Shopping.findByComputers", query = "SELECT s FROM Shopping s WHERE s.computers = :computers"),
    @NamedQuery(name = "Shopping.findByStove", query = "SELECT s FROM Shopping s WHERE s.stove = :stove"),
    @NamedQuery(name = "Shopping.findByMeat", query = "SELECT s FROM Shopping s WHERE s.meat = :meat"),
    @NamedQuery(name = "Shopping.findByCloths", query = "SELECT s FROM Shopping s WHERE s.cloths = :cloths"),
    @NamedQuery(name = "Shopping.findByCost", query = "SELECT s FROM Shopping s WHERE s.cost = :cost")})
public class Shopping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idshopping")
    private Integer idshopping;
    @Basic(optional = false)
    @Column(name = "book")
    private String book;
    @Basic(optional = false)
    @Column(name = "washingmachine")
    private String washingmachine;
    @Basic(optional = false)
    @Column(name = "computers")
    private String computers;
    @Basic(optional = false)
    @Column(name = "stove")
    private String stove;
    @Basic(optional = false)
    @Column(name = "meat")
    private String meat;
    @Basic(optional = false)
    @Column(name = "cloths")
    private String cloths;
    @Basic(optional = false)
    @Column(name = "cost")
    private String cost;

    public Shopping() {
    }

    public Shopping(Integer idshopping) {
        this.idshopping = idshopping;
    }

    public Shopping(Integer idshopping, String book, String washingmachine, String computers, String stove, String meat, String cloths, String cost) {
        this.idshopping = idshopping;
        this.book = book;
        this.washingmachine = washingmachine;
        this.computers = computers;
        this.stove = stove;
        this.meat = meat;
        this.cloths = cloths;
        this.cost = cost;
    }

    public Integer getIdshopping() {
        return idshopping;
    }

    public void setIdshopping(Integer idshopping) {
        this.idshopping = idshopping;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getWashingmachine() {
        return washingmachine;
    }

    public void setWashingmachine(String washingmachine) {
        this.washingmachine = washingmachine;
    }

    public String getComputers() {
        return computers;
    }

    public void setComputers(String computers) {
        this.computers = computers;
    }

    public String getStove() {
        return stove;
    }

    public void setStove(String stove) {
        this.stove = stove;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCloths() {
        return cloths;
    }

    public void setCloths(String cloths) {
        this.cloths = cloths;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idshopping != null ? idshopping.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shopping)) {
            return false;
        }
        Shopping other = (Shopping) object;
        if ((this.idshopping == null && other.idshopping != null) || (this.idshopping != null && !this.idshopping.equals(other.idshopping))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shopping[ idshopping=" + idshopping + " ], [ book=" + book + " ], [ washingmachine=" + washingmachine + " ]"
                + "[ computers=" + computers + " ], [ stove=" + stove + " ], [ meat=" + meat + " ]"
                + "[ cloths=" + cloths + " ], [ cost=" + cost + " ]";
    }
    
}

//Meny to one goes here


 