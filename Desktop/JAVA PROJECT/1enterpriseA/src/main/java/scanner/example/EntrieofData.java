/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author homec
 */
public class EntrieofData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader brInput = new BufferedReader(input);
        
        System.out.println("Introduce a data");
        try {
            captura = brInput.readLine();
            System.out.println("Data is now introduce:" + captura);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
