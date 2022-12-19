/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.clast.DAO;

/**
 *
 * @author homec
 */
public class Staff {
    
    private Integer numbers;
    private String firstname;
    private String lasttname;
    private String departments;
    private String position;
    
      public Staff() {
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

    public String getFirstname() {
        return firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public String getDepartments() {
        return departments;
    }

    public String getPosition() {
        return position;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return "{" +
                "  numbers='" + numbers + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lasttname='" + lasttname + '\'' +
                ", departments='" + departments + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
    
}
