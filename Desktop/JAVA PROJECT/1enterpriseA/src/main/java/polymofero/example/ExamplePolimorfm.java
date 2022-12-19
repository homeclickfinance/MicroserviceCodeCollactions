/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymofero.example;

import entity.enterprise.Billls;
import entity.enterprise.Restruante;

/**
 *
 * @author homec
 */
public class ExamplePolimorfm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* geting the method from the class database*/
        
        Restruante  restruante = new  Restruante(5,"Juan","got " ,"got " ,"got ","got " );
        printDetalles(restruante);
        
        //Billls  billls = new  Billls(5,"Juan","got " ,"got ");
        //printDetalles(billls);
        
       
      
    }
    
    public static void printDetalles(Restruante restruante){
        System.out.println("Restruante = " + restruante.obtenerDetalles());
        
    }
    
    
}
