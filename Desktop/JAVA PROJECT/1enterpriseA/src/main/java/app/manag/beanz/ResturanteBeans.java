/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.manag.beanz;

import entity.enterprise.Restruante;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;

import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author homec
 */

@Named(value="viewresturiant")
@RequestScoped
public class ResturanteBeans implements Serializable  {
    
    private List<Restruante> resturants;
    
    
    //@Inject
    //private BackingResturante Resturantservice;
   
    
    private Integer bookingNum;
    private String amount;
    private String type;
    private String total;
    private String tablesize;
    private String position;
   
    Logger log = LogManager.getRootLogger();
    
    public ResturanteBeans(Integer bookingNum, String amount, String type, String total, String tablesize, String position) {
        this.bookingNum = bookingNum;
        this.amount = amount;
        this.type = type;
        this.total = total;
        this.tablesize = tablesize;
        this.position = position;
    }

    
    public ResturanteBeans(){
        ResturanteBeansList();
    
    };
   
    private void ResturanteBeansList() {
    
     resturants = new ArrayList<>(); 
     resturants.add(new Restruante(2,"tRigh11","ttoll","sgola","ssetta","stiible"));
     resturants.add(new Restruante(13,"coop","nut","glory","goop","lkexx")); 
     resturants.add(new Restruante(1,"lest","oest","fest","shest","yot"));
     resturants.add(new Restruante(3,"esmt","hhst","ppest","dshest","rtoot"));
     resturants.add(new Restruante(4,"aaest","wwest","rtest","vhest","ggoot"));
     resturants.add(new Restruante(5,"ddest","bbest","bnest","jhest","oioot"));
        
        log.info("====================================Asign Resturante Control========================================");
    };
    
    
   
    
    public List<Restruante> getResturants() {
        return resturants;
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

 
 

    public void onRowEdit(RowEditEvent<Restruante> event) {
        FacesMessage msg = new FacesMessage("Resturante Edited", String.valueOf(event.getObject().getBookingNum()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent<Restruante> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", String.valueOf(event.getObject().getBookingNum()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    
   }

    
    
}