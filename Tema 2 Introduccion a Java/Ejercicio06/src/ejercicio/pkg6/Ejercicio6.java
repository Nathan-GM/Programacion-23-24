/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float precio;
        float preciofinal;
        float descuento;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el precio del articulo");
        precio = teclado.nextInt();
        
        System.out.println("Escribe el precio final del articulo");
        preciofinal = teclado.nextInt();
        
        descuento = (precio - preciofinal) * 100 / precio;
        System.out.println("El descuento aplicado es de " + descuento +"%");
    }
    
}
