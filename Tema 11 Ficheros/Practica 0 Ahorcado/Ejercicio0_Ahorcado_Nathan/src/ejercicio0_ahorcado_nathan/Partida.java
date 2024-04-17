/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio0_ahorcado_nathan;

/**
 *
 * @author natgonmer
 */
public class Partida {

    private int idpartida;
    private String jPone;
    private String jAdivina;
    private String palabra;
    private final int puntos = 10;
    private String ganador;

    public Partida(int idpartida, String jPone, String jAdivina, String palabra, String ganador) {
        this.idpartida = idpartida;
        this.jPone = jPone;
        this.jAdivina = jAdivina;
        this.palabra = palabra;
        this.ganador = ganador;
    }

    public int getIdpartida() {
        return idpartida;
    }

    public void setIdpartida(int idpartida) {
        this.idpartida = idpartida;
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

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        //return "Partida{" + "idpartida=" + idpartida + ", jPone=" + jPone + ", jAdivina=" + jAdivina + ", palabra=" + palabra + ", puntos=" + puntos + ", ganador=" + ganador + '}';
        return "Partida Número " + getIdpartida() + "\nJugador Elige Palabra: " + getjPone() + "\nJugador que adivina: " + getjAdivina() + "\nPalabra a adivinar: " + getPalabra() + "\nPuntos: " + getPuntos()+ "\nGanador: " + getGanador();
    }

}
