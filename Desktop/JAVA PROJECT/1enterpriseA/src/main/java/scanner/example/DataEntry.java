/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner.example;

import java.util.Scanner;

/**
 *
 * @author homec
 */
public class DataEntry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String captura = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a data:");
        captura = scanner.nextLine();
        while(!"salir".equals(captura)){
            System.out.println("Data is now introduce:" + captura);
            captura = scanner.nextLine();
        }
    }
    
}
