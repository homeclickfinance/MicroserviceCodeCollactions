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
@Table(name = "ecomerce", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ecomerce.findAll", query = "SELECT e FROM Ecomerce e"),
    @NamedQuery(name = "Ecomerce.findByIDecomerce", query = "SELECT e FROM Ecomerce e WHERE e.iDecomerce = :iDecomerce"),
    @NamedQuery(name = "Ecomerce.findByProducts", query = "SELECT e FROM Ecomerce e WHERE e.products = :products"),
    @NamedQuery(name = "Ecomerce.findByTotal", query = "SELECT e FROM Ecomerce e WHERE e.total = :total"),
    @NamedQuery(name = "Ecomerce.findByStocks", query = "SELECT e FROM Ecomerce e WHERE e.stocks = :stocks"),
    @NamedQuery(name = "Ecomerce.findByCost", query = "SELECT e FROM Ecomerce e WHERE e.cost = :cost")})
public class Ecomerce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDecomerce")
    private Integer iDecomerce;
    @Basic(optional = false)
    @Column(name = "products")
    private String products;
    @Basic(optional = false)
    @Column(name = "total")
    private String total;
    @Basic(optional = false)
    @Column(name = "stocks")
    private String stocks;
    @Basic(optional = false)
    @Column(name = "cost")
    private String cost;

    public Ecomerce() {
    }

    public Ecomerce(Integer iDecomerce) {
        this.iDecomerce = iDecomerce;
    }

    public Ecomerce(Integer iDecomerce, String products, String total, String stocks, String cost) {
        this.iDecomerce = iDecomerce;
        this.products = products;
        this.total = total;
        this.stocks = stocks;
        this.cost = cost;
    }

    public Integer getIDecomerce() {
        return iDecomerce;
    }

    public void setIDecomerce(Integer iDecomerce) {
        this.iDecomerce = iDecomerce;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
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
        hash += (iDecomerce != null ? iDecomerce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ecomerce)) {
            return false;
        }
        Ecomerce other = (Ecomerce) object;
        if ((this.iDecomerce == null && other.iDecomerce != null) || (this.iDecomerce != null && !this.iDecomerce.equals(other.iDecomerce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ecomerce[ iDecomerce=" + iDecomerce + " ], [ products=" + products + " ], [ total=" + total + " ]"
                + "[ stocks=" + stocks + " ], [ cost=" + cost + " ]";
    }
    
}
//Meny to one goes here