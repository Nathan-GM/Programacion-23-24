/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

/**
 *
 * @author natgonmer
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo();
        
        articulo1.cod = "001";
        articulo1.titulo = "Lanterns";
        articulo1.formato = "CD";
        articulo1.precio_alquiler = 2.50f;
        
        articulo2.cod = "002";
        articulo2.titulo = "HOTW";
        articulo2.formato = "CD";
        articulo2.precio_alquiler = 3;
        
        System.out.println("Alquiler Art. " + articulo1.cod + ", 1 día:" + articulo1.precio1());
        System.out.println("Alquiler Art. " + articulo1.cod + ", 2 dias:" + articulo1.precio2());
        System.out.println("Alquiler Art. " + articulo1.cod + ", 1 semana:" + articulo1.precioSemana());
        
        System.out.println("Alquiler Art. " + articulo2.cod + ", 1 día:" + articulo2.precio1());
        System.out.println("Alquiler Art. " + articulo2.cod + ", 2 dias:" + articulo2.precio2());
        System.out.println("Alquiler Art. " + articulo2.cod + ", 1 semana:" + articulo2.precioSemana());
    }

}
