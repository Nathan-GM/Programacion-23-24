/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author natgonmer
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String f = "20/02/2000";
        int dias = 10;
        
        String [] pfecha = f.split("/");
        int dia = Integer.parseInt(pfecha[0]);
        int mes = Integer.parseInt(pfecha[1]);
        int anyo = Integer.parseInt(pfecha[2]);
    }
    
}
