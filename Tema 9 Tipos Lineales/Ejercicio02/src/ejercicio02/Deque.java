/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author natgonmer
 */
public class Deque<Item> {

    private Nodo primero;
    private Nodo ultimo;
    private int cantidadNodos;

    public Deque() {
        this.primero = null;
        this.ultimo = null;
        cantidadNodos = 0;
    }

    private class Nodo {

        private Item dato;
        private Nodo siguiente;
        private Nodo anterior;

        public Nodo(Item dato) {
            this.dato = dato;
            siguiente = null;
            anterior = null;
        }

        public Item getDato() {
            return dato;
        }

        public void setDato(Item dato) {
            this.dato = dato;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Nodo getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo anterior) {
            this.anterior = anterior;
        }

    }

    public boolean isEmpty() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Item item) {
        Nodo nuevoNodo = new Nodo(item);
        if (isEmpty() == true) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            primero.siguiente = ultimo;
            ultimo.anterior = primero;
            cantidadNodos++;
        } else {
            Nodo auxiliar = ultimo;
            ultimo = nuevoNodo;
            ultimo.anterior = auxiliar;
            auxiliar.siguiente = ultimo;
            cantidadNodos++;

        }
    }

    public void push(Item item) {
        Nodo nuevoNodo = new Nodo(item);
        Nodo aux = primero;
        primero = nuevoNodo;
        primero.siguiente = aux;
        cantidadNodos++;
    }
    
    public Item pop() {
        Item devolver = primero.getDato();
        primero = primero.siguiente;
        return devolver;
    }

    public void estado() {
        if (isEmpty() == true) {
            System.out.println("El deque no tiene ningún nodo actualmente");
        } else {
            System.out.println("El deque tiene " + cantidadNodos + " nodos");
            System.out.println("Donde:");
            System.out.println("\tEl primer nodo es: " + primero.getDato());
            System.out.println("\tEl ultimo nodo es: " + ultimo.getDato());

        }
    }

    public void listarDeque() {
        Nodo aux = primero;
        int i = 1;
        while (aux != null) {
            System.out.println("\tValor nodo " + i + ": " + aux.getDato());
            aux = aux.getSiguiente();
            i++;
        }
    }
}
