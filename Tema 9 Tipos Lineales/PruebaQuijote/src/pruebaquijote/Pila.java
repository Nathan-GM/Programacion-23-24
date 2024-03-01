/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaquijote;

/**
 *
 * @author natgonmer
 */
public class Pila<Item> {

    private Nodo cima;
    private int tamano;

    public Pila() {
        this.cima = null;
        this.tamano = 0;
    }

    public boolean isEmpty() {
        if (this.tamano == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Crear(String texto) {
        Nodo nuevo = new Nodo(texto);
        if (isEmpty() == true) {
            this.cima = nuevo;
            this.tamano++;
        } else {
            Nodo aux = this.cima;
            nuevo.setSiguiente(aux);
            this.cima = nuevo;
            this.tamano++;
        }
    }
    
    public void listarPila() {
        Nodo aux = this.cima;
        int i = getTamano();
        while (aux != null) {
            System.out.println(aux.getObjeto());
            aux = aux.getSiguiente();
            i--;
        }

    }

    @Override
    public String toString() {
        //return "Pila{" + "cima=" + cima + ", tamano=" + tamano + '}';
        Nodo aux = cima;
        String texto = "";
        while (aux != null) {
            texto = texto + aux.getObjeto() + " ";
            aux = aux.siguiente;
        }
        return texto;
    }
    
    

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    
    
    private class Nodo {

        private String objeto;
        private Nodo siguiente;

        public Nodo(String objeto) {
            this.objeto = objeto;
            this.siguiente = null;
        }

        public String getObjeto() {
            return objeto;
        }

        public void setObjeto(String objeto) {
            this.objeto = objeto;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

    }
}
