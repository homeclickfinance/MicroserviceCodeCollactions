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
@Table(name = "discounts", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Discounts.findAll", query = "SELECT d FROM Discounts d"),
    @NamedQuery(name = "Discounts.findByIddiscounts", query = "SELECT d FROM Discounts d WHERE d.iddiscounts = :iddiscounts"),
    @NamedQuery(name = "Discounts.findByCloths", query = "SELECT d FROM Discounts d WHERE d.cloths = :cloths"),
    @NamedQuery(name = "Discounts.findByMeats", query = "SELECT d FROM Discounts d WHERE d.meats = :meats"),
    @NamedQuery(name = "Discounts.findByComputers", query = "SELECT d FROM Discounts d WHERE d.computers = :computers")})
public class Discounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddiscounts")
    private Integer iddiscounts;
    @Basic(optional = false)
    @Column(name = "cloths")
    private String cloths;
    @Basic(optional = false)
    @Column(name = "meats")
    private String meats;
    @Basic(optional = false)
    @Column(name = "computers")
    private String computers;

    public Discounts() {
    }

    public Discounts(Integer iddiscounts) {
        this.iddiscounts = iddiscounts;
    }

    public Discounts(Integer iddiscounts, String cloths, String meats, String computers) {
        this.iddiscounts = iddiscounts;
        this.cloths = cloths;
        this.meats = meats;
        this.computers = computers;
    }

    public Integer getIddiscounts() {
        return iddiscounts;
    }

    public void setIddiscounts(Integer iddiscounts) {
        this.iddiscounts = iddiscounts;
    }

    public String getCloths() {
        return cloths;
    }

    public void setCloths(String cloths) {
        this.cloths = cloths;
    }

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public String getComputers() {
        return computers;
    }

    public void setComputers(String computers) {
        this.computers = computers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddiscounts != null ? iddiscounts.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discounts)) {
            return false;
        }
        Discounts other = (Discounts) object;
        if ((this.iddiscounts == null && other.iddiscounts != null) || (this.iddiscounts != null && !this.iddiscounts.equals(other.iddiscounts))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Discounts[ iddiscounts=" + iddiscounts + " ], [ cloths=" + cloths + " ], [ meats=" + meats + " ], [ computers=" + computers + " ]";
    }
    
}
