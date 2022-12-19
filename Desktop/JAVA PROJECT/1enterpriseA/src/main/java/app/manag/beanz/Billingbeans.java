/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.manag.beanz;

import entity.enterprise.Billls;
import interfaz.control.Billsinterfase;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */

@Named(value="Billingbeans")
@RequestScoped
public class Billingbeans implements Serializable {
    
    //===========================================================

    private List<Billls> billv;
    
    //===========================================================
    
    private Integer idbillls;
    private String lightbill;
    private String waterbill;
    private String utilitiesbills;
    
    Logger log = LogManager.getRootLogger();
   
    public Billingbeans (Integer idbillls, String lightbill, String waterbill, String utilitiesbills) {
        this.idbillls = idbillls;
        this.lightbill = lightbill;
        this.waterbill = waterbill;
        this.utilitiesbills = utilitiesbills;
        
        log.info("====================================Asign value list from the database========================================");
    }
  
    
    //========================================================================================
    
    public Billingbeans(){
         BillArray(); //this is the control that will be use to code the get Arrays
         log.info("==========================================Contol=Billingbeans===============================================");
    };
    
    private void BillArray() {
        
       billv = new ArrayList<>();
       
               billv.add(new Billls(1, "light bills", "water bills", "Product utitiles"));
               billv.add(new Billls(12, "light cost", "warter cost", "Product utilites cost"));
               /*
               billv.add.getIdbillls();
               billv.add(new Billls.findByIdbillls));
               billv.add.getIdbillls();*/
    }
    
    //========================================================================================
    
    
    
    public List<Billls> getBillv() {
        return billv;
    }

    public void setBillv(List<Billls> billv) {
        this.billv = billv;
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

    
    
    
    
    
}

