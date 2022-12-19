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
@Table(name = "staff", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s"),
    @NamedQuery(name = "Staff.findByNumbers", query = "SELECT s FROM Staff s WHERE s.numbers = :numbers"),
    @NamedQuery(name = "Staff.findByFirstname", query = "SELECT s FROM Staff s WHERE s.firstname = :firstname"),
    @NamedQuery(name = "Staff.findByLasttname", query = "SELECT s FROM Staff s WHERE s.lasttname = :lasttname"),
    @NamedQuery(name = "Staff.findByDepartments", query = "SELECT s FROM Staff s WHERE s.departments = :departments"),
    @NamedQuery(name = "Staff.findByPosition", query = "SELECT s FROM Staff s WHERE s.position = :position")})
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "numbers")
    private Integer numbers;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lasttname")
    private String lasttname;
    @Basic(optional = false)
    @Column(name = "departments")
    private String departments;
    @Basic(optional = false)
    @Column(name = "position")
    private String position;

    public Staff() {
    }

    public Staff(Integer numbers) {
        this.numbers = numbers;
    }

    public Staff(Integer numbers, String firstname, String lasttname, String departments, String position) {
        this.numbers = numbers;
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.departments = departments;
        this.position = position;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
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
        hash += (numbers != null ? numbers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.numbers == null && other.numbers != null) || (this.numbers != null && !this.numbers.equals(other.numbers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Staff[ numbers=" + numbers + " ], [ firstname=" + firstname + " ], [ lasttname=" + lasttname + " ], [ departments=" + departments + " ]"
                + "[ position=" + position + " ]";
    }
    
}
