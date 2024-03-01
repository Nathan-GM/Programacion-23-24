/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author natgonmer
 */
public class Pila {

    private Nodo tope;
    private int tamanoPila;

    public Pila() {
        this.tope = null;
        this.tamanoPila = 0;
    }

    /**
     * Comprueba si la pila esta vacia o no
     *
     * @return Devuelve verdadero en caso de no tener ningún nodo y falso en
     * caso de tener algun elemento.
     */
    public boolean empty() {
        if (this.tamanoPila == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Nos muestra por pantalla un mensaje que dirá si esta vacia o no en base a
     * la función empty
     */
    public void vaciaono() {
        if (empty() == true) {
            System.out.println("La pila actualmente esta vacia");
        } else if (empty() == false && tamanoPila == 1) {

        } else {
            System.out.println("La pila actualmente tiene " + this.tamanoPila + " elementos");
        }
    }

    public void push(Nodo a) {
        if (empty() == true) {
            this.tope = a;
            this.tamanoPila++;
        } else {
            Nodo aux = new Nodo();
            aux.setObjeto(this.tope.getObjeto());
            aux.setSiguiente(this.tope.getSiguiente());
            a.setSiguiente(aux);
            this.tope = a;
            this.tamanoPila++;
        }
    }

    public void peek() {
        System.out.println("Elemento en la cima: " + this.tope.getObjeto());
    }

    /**
     * Nos devuelve un listado de la lista con todos los elementos hasta que
     * encuentre null.
     */
    public void listarPila() {
        Nodo aux = this.tope;
        int i = getTamanoPila();
        while (aux != null) {
            System.out.println("\tValor nodo " + i + ": " + aux.getObjeto());
            aux = aux.getSiguiente();
            i--;
        }
    }

    public String pop() {
        String aux = this.tope.getObjeto();
        this.tope = this.tope.getSiguiente();
        setTamanoPila(getTamanoPila()-1);
        return aux;
        
    }

    public int getTamanoPila() {
        return tamanoPila;
    }

    public void setTamanoPila(int tamanoPila) {
        this.tamanoPila = tamanoPila;
    }

}
