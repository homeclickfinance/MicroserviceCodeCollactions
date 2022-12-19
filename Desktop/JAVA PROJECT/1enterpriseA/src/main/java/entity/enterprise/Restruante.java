/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity.enterprise;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author homec
 */
@Entity
@Table(name = "restruante", catalog = "", schema = "")   // Meny to one
@NamedQueries({
    @NamedQuery(name = "Restruante.findAll", query = "SELECT r FROM Restruante r"),
    @NamedQuery(name = "Restruante.findByBookingNum", query = "SELECT r FROM Restruante r WHERE r.bookingNum = :bookingNum"),
    @NamedQuery(name = "Restruante.findByAmount", query = "SELECT r FROM Restruante r WHERE r.amount = :amount"),
    @NamedQuery(name = "Restruante.findByType", query = "SELECT r FROM Restruante r WHERE r.type = :type"),
    @NamedQuery(name = "Restruante.findByTotal", query = "SELECT r FROM Restruante r WHERE r.total = :total"),
    @NamedQuery(name = "Restruante.findByTablesize", query = "SELECT r FROM Restruante r WHERE r.tablesize = :tablesize"),
    @NamedQuery(name = "Restruante.findByPosition", query = "SELECT r FROM Restruante r WHERE r.position = :position")})


public class Restruante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "booking_num")
    private Integer bookingNum;
    @Basic(optional = false)
    @Column(name = "amount")
    private String amount;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "total")
    private String total;
    @Basic(optional = false)
    @Column(name = "tablesize")
    private String tablesize;
    @Basic(optional = false)
    @Column(name = "position")
    private String position;
    
    //utility methods - synchronizing both sides (owner and inverse-end) of the relationship when you add and remove a Movie from an Actor
 
    // Many to many leyout details
    /*@ManyToMany(targetEntity=Billls.class)
    private List<Billls> billlsx;*/
    
    // Many to many leyout details
    @ManyToMany(mappedBy = "restruantex")//provide the name of the field, which maps the relationship
    private List<Billls> billlsx;

    public List<Billls> getBilllsx() {
        return billlsx;
    }

 
    // Many to many leyout details
    
    
    
    public Restruante() {
    }
    
    public Restruante(Integer bookingNum) {
        this.bookingNum = bookingNum;
    }

    public Restruante(Integer bookingNum, String amount, String type, String total, String tablesize, String position) {
        this.bookingNum = bookingNum;
        this.amount = amount;
        this.type = type;
        this.total = total;
        this.tablesize = tablesize;
        this.position = position;
        
    }
    
    
    /* Polymorphism example starter*/
    public String obtenerDetalles() {
        return "Restruante{" + "bookingNum=" + this.bookingNum + ", amount=" + this.amount + ", type=" + this.type + ", total=" + this.total + ", tablesize=" + this.tablesize + ", position=" + this.position + '}';
    }
    
  

    public Integer getBookingNum() {
        return bookingNum;
    }

    public void setBookingNum(Integer bookingNum) {
        this.bookingNum = bookingNum;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTablesize() {
        return tablesize;
    }

    public void setTablesize(String tablesize) {
        this.tablesize = tablesize;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingNum != null ? bookingNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restruante)) {
            return false;
        }
        Restruante other = (Restruante) object;
        if ((this.bookingNum == null && other.bookingNum != null) || (this.bookingNum != null && !this.bookingNum.equals(other.bookingNum))) {
            return false;
        }
        return true;
    }

    @Override 
    public String toString() {
        return "Restruante[ bookingNum=" + bookingNum + " ], [amount=" + amount +"], [type=" + type +"], [total=" + total +"]"
                + "[tablesize=" + tablesize +"], [position=" + position +"] ";
    }

   
    
}
