/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author natgonmer
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Producto p1 = new Producto("Manzana", 1);
        Producto p2 = new Producto("Limón", 2);
        Producto p3 = new Producto("Naranja", 3);
        Producto p4 = new Producto("Kiwi", 4);
        Producto p5 = new Producto("Tomate", 5);

        ArrayList productos = new ArrayList();

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        for (Iterator lista = productos.iterator(); lista.hasNext();) {
            Producto lis = (Producto) lista.next();
            System.out.println(lis.toString());
        }
        System.out.println("");
        System.out.println("\tEliminaste los productos: Naranja y Tomate");
        productos.remove(4);
        productos.remove(2);

        System.out.println("");

        Producto p6 = new Producto("Pera", 6);
        productos.add(2, p6);

        System.out.println("\tAñadiste el producto: Pera");
        System.out.println("");
        for (Iterator lista = productos.iterator(); lista.hasNext();) {
            Producto lis = (Producto) lista.next();
            System.out.println(lis.toString());
        }
        
        productos.clear();
        System.out.println("");
        System.out.println("\t Eliminaste todos los productos de la lista");

    }

}
