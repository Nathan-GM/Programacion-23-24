/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author natgonmer
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList astros = new ArrayList();
        
        for (Iterator lista = astros.iterator(); lista.hasNext();) {
            Astros lis = (Astros) lista.next();
            System.out.println(lis.toString());
        }
        
    }
    
}
