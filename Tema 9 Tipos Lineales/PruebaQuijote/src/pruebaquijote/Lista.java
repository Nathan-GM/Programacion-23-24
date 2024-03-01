/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaquijote;

/**
 *
 * @author natgonmer
 */
public class Lista<Item> {

    private Nodo primero;
    private Nodo ultimo;
    private int tamano;

    public Lista() {
        primero = null;
        ultimo = null;
        tamano = 0;
    }

    public boolean vacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Crear(Item item) {
        Nodo nuevo = new Nodo(item);
        if (vacio() == true) {
            primero = nuevo;
            ultimo = nuevo;
            primero.siguiente = ultimo;
            ultimo.anterior = primero;
            tamano++;
        } else {
            Nodo auxiliar = ultimo;
            ultimo = nuevo;
            ultimo.anterior = auxiliar;
            auxiliar.siguiente = ultimo;
            primero.anterior = ultimo;
            ultimo.siguiente = primero;
            tamano++;
        }
    }

    public void listar() {
        Nodo aux = primero;
        int i = 1;
        while (i <= tamano) {
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
            i++;
        }
    }

    private class Nodo {

        private Nodo anterior;
        private Nodo siguiente;
        private Item valor;

        public Nodo(Item valor) {
            this.valor = valor;
            siguiente = null;
            anterior = null;
        }

        public Nodo getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo anterior) {
            this.anterior = anterior;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Item getValor() {
            return valor;
        }

        public void setValor(Item valor) {
            this.valor = valor;
        }

    }
}
