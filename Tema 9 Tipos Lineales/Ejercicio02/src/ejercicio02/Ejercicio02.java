/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

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
        System.out.println("Deque Creado");
        Deque deque = new Deque();
        System.out.println("------------------------------------------");
        System.out.println("Estado del deque actualmente:");
        deque.estado();
        System.out.println("------------------------------------------");
        System.out.println("Se agregara el primer nodo al deque");
        deque.enqueue("Hannah");
        System.out.println("------------------------------------------");
        System.out.println("Estado del deque actualmente:");
        deque.estado();

        System.out.println("------------------------------------------");
        System.out.println("Se agregará el segundo y tercer nodo al deque");
        deque.enqueue("Elize");
        deque.enqueue("Lulu");

        System.out.println("------------------------------------------");
        System.out.println("Estado del deque actualmente:");
        deque.estado();
        System.out.println("------------------------------------------");
        System.out.println("Se agrega al deque el nodo Elle");
        deque.enqueue("Elle");
        System.out.println("------------------------------------------");
        System.out.println("Estado del deque actualmente:");
        deque.estado();
        System.out.println("------------------------------------------");
        System.out.println("Se agregará uno con push bajo el nombre de Kate");
        deque.push("Kate");
        System.out.println("------------------------------------------");
        System.out.println("Estado del deque actualmente:");
        deque.estado();
        System.out.println("------------------------------------------");
        System.out.println("Lista del deque");
        deque.listarDeque();
        System.out.println("Pop");
        System.out.println(deque.pop());
        System.out.println("------------------------------------------");
        System.out.println("Lista del deque");
        deque.listarDeque();

    }

}
