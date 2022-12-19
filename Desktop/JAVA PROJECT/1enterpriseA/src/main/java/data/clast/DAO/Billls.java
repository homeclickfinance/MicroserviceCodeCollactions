/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.clast.DAO;

/**
 *
 * @author homec
 */

//public class Billls extends Restruante {
public class Billls {
    
    private Integer idbillls;
    private String lightbill;
    private String waterbill;
    private String utilitiesbills;
 
    public Billls (Integer idbillls, String lightbill, String waterbill, String utilitiesbills) {
        this.idbillls = idbillls;
        this.lightbill = lightbill;
        this.waterbill = waterbill;
        this.utilitiesbills = utilitiesbills;
      
    }
    
    //Sobreescribimos el metodo padre heredado
   /* @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()
                + "idbillls=" + this.idbillls + ", lightbill=" + this.lightbill + ", waterbill=" + this.waterbill + ", utilitiesbills=" + this.utilitiesbills ;
        //return "Billls{" + "idbillls=" + idbillls + ", lightbill=" + lightbill + ", waterbill=" + waterbill + ", utilitiesbills=" + utilitiesbills + '}';
        
               
        
    }
    */
    
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
    public String toString() {
        return "{" +
                "idbillls='" + idbillls + '\'' +
                ", lightbill='" + lightbill + '\'' +
                ", waterbill='" + waterbill + '\'' +
                ", utilitiesbills='" + utilitiesbills + '\'' +
                
                '}';
    }
    
}
