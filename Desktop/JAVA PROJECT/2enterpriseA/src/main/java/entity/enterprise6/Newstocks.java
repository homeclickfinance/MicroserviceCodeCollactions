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
@Table(name = "newstocks", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Newstocks.findAll", query = "SELECT n FROM Newstocks n"),
    @NamedQuery(name = "Newstocks.findByIdnewstocks", query = "SELECT n FROM Newstocks n WHERE n.idnewstocks = :idnewstocks"),
    @NamedQuery(name = "Newstocks.findByProducts", query = "SELECT n FROM Newstocks n WHERE n.products = :products"),
    @NamedQuery(name = "Newstocks.findByTypes", query = "SELECT n FROM Newstocks n WHERE n.types = :types"),
    @NamedQuery(name = "Newstocks.findByPrice", query = "SELECT n FROM Newstocks n WHERE n.price = :price")})
public class Newstocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnewstocks")
    private Integer idnewstocks;
    @Basic(optional = false)
    @Column(name = "products")
    private String products;
    @Basic(optional = false)
    @Column(name = "types")
    private String types;
    @Basic(optional = false)
    @Column(name = "price")
    private int price;

    public Newstocks() {
    }

    public Newstocks(Integer idnewstocks) {
        this.idnewstocks = idnewstocks;
    }

    public Newstocks(Integer idnewstocks, String products, String types, int price) {
        this.idnewstocks = idnewstocks;
        this.products = products;
        this.types = types;
        this.price = price;
    }

    public Integer getIdnewstocks() {
        return idnewstocks;
    }

    public void setIdnewstocks(Integer idnewstocks) {
        this.idnewstocks = idnewstocks;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnewstocks != null ? idnewstocks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Newstocks)) {
            return false;
        }
        Newstocks other = (Newstocks) object;
        if ((this.idnewstocks == null && other.idnewstocks != null) || (this.idnewstocks != null && !this.idnewstocks.equals(other.idnewstocks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Newstocks[ idnewstocks=" + idnewstocks + " ], [ products=" + products + " ], [ types=" + types + " ]"
                + "[ price=" + price + " ]";
    }
    
}
