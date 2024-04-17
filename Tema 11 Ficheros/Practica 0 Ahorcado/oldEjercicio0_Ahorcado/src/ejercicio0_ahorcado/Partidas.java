/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio0_ahorcado;

/**
 *
 * @author natgonmer
 */
public class Partidas {
 private int npartida;
 private String jPone;
 private String jAdivina;
 private String palabra;
 private final int  puntos = 10;
 private String ganador;


    public Partidas(int npartida, String jPone, String jAdivina, String palabra, String ganador) {
        this.npartida = npartida;
        this.jPone = jPone;
        this.jAdivina = jAdivina;
        this.palabra = palabra;
        this.ganador = ganador;
    }
    
    

    public int getNpartida() {
        return npartida;
    }

    public void setNpartida(int npartida) {
        this.npartida = npartida;
    }

    public String getjPone() {
        return jPone;
    }

    public void setjPone(String jPone) {
        this.jPone = jPone;
    }

    public String getjAdivina() {
        return jAdivina;
    }

    public void setjAdivina(String jAdivina) {
        this.jAdivina = jAdivina;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getPuntos() {
        return puntos;
    }


    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        //return "Partidas{" + "npartida=" + npartida + ", jPone=" + jPone + ", jAdivina=" + jAdivina + ", palabra=" + palabra + ", puntos=" + puntos + ", ganador=" + ganador + '}';
        return "Partida Número " + getNpartida() + "\nJugador Elige Palabra: " + getjPone() + "\nJugador que adivina: " + getjAdivina() + "\nPalabra a adivinar: " + getPalabra() + "\nPuntos: " + getPuntos() + "\nGanador: " + getGanador();
    }


 
 
}
