/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity.enterprise;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author homec
 */
@Entity
@Table(name = "billls", catalog = "", schema = "") 
@NamedQueries({
    @NamedQuery(name = "Billls.findAll", query = "SELECT b FROM Billls b"),
    @NamedQuery(name = "Billls.findByIdbillls", query = "SELECT b FROM Billls b WHERE b.idbillls = :idbillls"),
    @NamedQuery(name = "Billls.findByLightbill", query = "SELECT b FROM Billls b WHERE b.lightbill = :lightbill"),
    @NamedQuery(name = "Billls.findByWaterbill", query = "SELECT b FROM Billls b WHERE b.waterbill = :waterbill"),
    @NamedQuery(name = "Billls.findByUtilitiesbills", query = "SELECT b FROM Billls b WHERE b.utilitiesbills = :utilitiesbills")})
    
public class Billls implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idbillls")
    private Integer idbillls;
    @Basic(optional = false)
    @Column(name = "lightbill")
    private String lightbill;
    @Basic(optional = false)
    @Column(name = "waterbill")
    private String waterbill;
    @Basic(optional = false)
    @Column(name = "utilitiesbills")
    private String utilitiesbills;
  
    
    // Many to many leyout details
   
    @ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "APP_BILL_REST", 
             joinColumns = { @JoinColumn(name = "cost_billls") }, //this will be the owner or the billls colums
             inverseJoinColumns = { @JoinColumn(name = "cost_rest") })
    private List<Restruante> restruantex;

    public List<Restruante> getRestruantex() {
        return restruantex;
    }

  
     // Many to many leyout details
    
    

    public Billls() {
    }

    public Billls(Integer idbillls) {
        this.idbillls = idbillls;
    }

    public Billls(Integer idbillls, String lightbill, String waterbill, String utilitiesbills) {
        this.idbillls = idbillls;
        this.lightbill = lightbill;
        this.waterbill = waterbill;
        this.utilitiesbills = utilitiesbills;
       
    }



    public Integer getIdbillls() {
        return idbillls;
    }

    public void setIdbillls(Integer idbillls) {
        this.idbillls = idbillls;
    }

    public String getLightbill() {
        return lightbill;
    }

    public void setLightbill(String lightbill) {
        this.lightbill = lightbill;
    }

    public String getWaterbill() {
        return waterbill;
    }

    public void setWaterbill(String waterbill) {
        this.waterbill = waterbill;
    }

    public String getUtilitiesbills() {
        return utilitiesbills;
    }

    public void setUtilitiesbills(String utilitiesbills) {
        this.utilitiesbills = utilitiesbills;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbillls != null ? idbillls.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billls)) {
            return false;
        }
        Billls other = (Billls) object;
        if ((this.idbillls == null && other.idbillls != null) || (this.idbillls != null && !this.idbillls.equals(other.idbillls))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Billls[ idbillls=" + idbillls + " ], [lightbill=" + lightbill +"], [waterbill=" + waterbill +"], [utilitiesbills=" + utilitiesbills +"]";
    }
    
}
