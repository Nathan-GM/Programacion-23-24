/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

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
        Pila pila = new Pila();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Estado actual de la pila:");
        pila.vaciaono();
        System.out.println("------------------------------------------");
        System.out.println("Creamos el primer nodo");
        Nodo primero = new Nodo();
        System.out.println("Asigna el valor que tendrá el nodo(String)");
        String valor = teclado.nextLine();
        primero.setObjeto(valor);
        pila.push(primero);
        System.out.println("------------------------------------------");
        System.out.println("Valores nodo 1:");
        System.out.println("\tValor: " + primero.getObjeto());
        System.out.println("\tSiguiente: " + primero.getSiguiente());
        System.out.println("------------------------------------------");
        System.out.println("Asignado el valor y agregado a la pila, comprobando estado actual");
        pila.vaciaono();
        System.out.println("------------------------------------------");
        System.out.println("Peek");
        pila.peek();
        System.out.println("------------------------------------------");
        System.out.println("Creamos el nodo 2");
        Nodo segundo = new Nodo();
        System.out.println("Asigna el valor que tendrá el nodo(String)");
        valor = teclado.nextLine();
        segundo.setObjeto(valor);
        pila.push(segundo);
        System.out.println("------------------------------------------");
        System.out.println("Valores nodo 2:");
        System.out.println("\tValor: " + segundo.getObjeto());
        System.out.println("\tSiguiente: " + segundo.getSiguiente().getObjeto());
        System.out.println("------------------------------------------");
        System.out.println("Peek");
        pila.peek();
        System.out.println("------------------------------------------");
        System.out.println("Creamos el tercer nodo");
        Nodo tercero = new Nodo();
        System.out.println("Asigna el valor que tendrá el nodo(String)");
        valor = teclado.nextLine();
        tercero.setObjeto(valor);
        pila.push(tercero);
        System.out.println("------------------------------------------");
        System.out.println("Peek");
        pila.peek();
        System.out.println("------------------------------------------");
        System.out.println("Lista de la Pila con tamaño " + pila.getTamanoPila());
        pila.listarPila();
        System.out.println("------------------------------------------");
        System.out.println("Pop");
        System.out.println("Elemento que habia en la cima: " + pila.pop());
        System.out.println("------------------------------------------");
        System.out.println("Lista de la Pila con tamaño " + pila.getTamanoPila());
        pila.listarPila();
        System.out.println("------------------------------------------");

    }

}
