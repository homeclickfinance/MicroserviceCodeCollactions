/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.clast.DAO;

/**
 *
 * @author homec
 */
public class Restruante {
    
    private Integer bookingNum;
    private String amount;
    private String type;
    private String total;
    private String tablesize;
    private String position;
  
    
    public Restruante(Integer bookingNum, String amount, String type, String total, String tablesize, String position) {
        this.bookingNum = bookingNum;
        this.amount = amount;
        this.type = type;
        this.total = total;
        this.tablesize = tablesize;
        this.position = position;
       
    }
    
    /* polyforism
    String obtenerDetalles() {
        return "Restruante{" + "bookingNum=" + this.bookingNum + ", amount=" + this.amount + ", type=" + this.type + ", total=" + this.total + ", tablesize=" + this.tablesize + ", position=" + this.position + '}';
    }
    */

   

    public Integer getBookingNum() {
        return bookingNum;
    }

    public String getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getTotal() {
        return total;
    }

    public String getTablesize() {
        return tablesize;
    }

    public String getPosition() {
        return position;
    }

    

    public void setBookingNum(Integer bookingNum) {
        this.bookingNum = bookingNum;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setTablesize(String tablesize) {
        this.tablesize = tablesize;
    }

    public void setPosition(String position) {
        this.position = position;
    }
  
    

    @Override
    public String toString() {
        return "Restruante{" +
                "  bookingNum='" + bookingNum + '\'' +
                ", amount='" + amount + '\'' +
                ", type='" + type + '\'' +
                ", total='" + total + '\'' +
                ", tablesize='" + tablesize + '\'' +
                ", position='" + position + '\'' +
               
                '}';
    }


    
    
}
