/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author natgonmer
 */
public class Cola<Item> {

    private Nodo primero;
    private Nodo ultimo;
    private int tamano;

    public Cola() {
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

    public void estaVacia() {
        if (vacio() == true) {
            System.out.println("La cola no tiene elementos");
        } else {
            System.out.println("La cola tiene " + getTamano() + " nodos");
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

    public void listar(int totalNodos) {
        Nodo aux = primero;
        int i = 1;
        while (i <= totalNodos) {
            System.out.println("\tValor nodo " + i + ": " + aux.getValor());
            aux = aux.getSiguiente();
            i++;
        }
    }

    public void descubrirUltimo(int saltos, int maxNodos) {
        while (tamano != 1) {
            for (int i = 1; i <= maxNodos;) {
                if (i == saltos) {
                    System.out.println(pop());
                    break;
                } else {
                    primero = primero.getSiguiente();
                    i++;
                }
            }
        }
    }

    public Item pop() {
        Item devolver = primero.getValor();
        primero.anterior.siguiente = primero.siguiente;
        primero.siguiente.anterior = primero.anterior;
        primero = primero.siguiente;
        tamano--;
        return devolver;

    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    //Clase Nodo
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
