/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

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
        Scanner teclado = new Scanner(System.in);
        int n = 2; //posiciones que se van pasando
        int m = 7; //nodos en la cola
        int valor = 0; //valores del nodo
        Cola cola = new Cola();
        System.out.println("Estado de la cola: ");
        cola.estaVacia();
        System.out.println("------------------------------------------");
        System.out.println("Se crearan " + m + " elementos");
        for (int i = 0; i < m; i++) {
            cola.Crear(i);
        }
        System.out.println("------------------------------------------");
        cola.estaVacia();
        System.out.println("------------------------------------------");
        System.out.println("Recorrido cola");
        cola.listar(m);
        System.out.println("------------------------------------------");
        System.out.println("Cada " + n + " nodos se borrará el nodo que se encuentre en esa posición");
        cola.descubrirUltimo(n, m);
        System.out.println("------------------------------------------");
        System.out.println("El último elemento que quedará corresponde a " + cola.pop());

    }

}
