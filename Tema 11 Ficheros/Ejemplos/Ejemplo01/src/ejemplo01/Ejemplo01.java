/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo01;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author natgonmer
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    
    public static final int numValores = 10;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            File f = new File ("Enteros.txt");
            Scanner lector = new Scanner(f);
            
            for (int i = 0; i < numValores; i++) {
                int valor = lector.nextInt();
                System.out.println("El valor leido es " + valor);
            }
            lector.close();
            
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            //e.printStackTrace();
        }
        
    }
    
}
