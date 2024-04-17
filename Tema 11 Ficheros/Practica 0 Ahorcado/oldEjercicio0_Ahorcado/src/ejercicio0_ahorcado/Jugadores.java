/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio0_ahorcado;

/**
 *
 * @author natgonmer
 */
public class Jugadores {

    private String nombre;
    private int pganadas;
    private int pperdidas;
    private int puntos;

    public Jugadores(String nombre, int pganadas, int pperdidas, int puntos) {
        this.nombre = nombre;
        this.pganadas = pganadas;
        this.pperdidas = pperdidas;
        this.puntos = puntos;
    }

    public Jugadores(String nombre) {
        this.nombre = nombre;
        this.pganadas = 0;
        this.pperdidas = 0;
        this.puntos = 0;
    }

    public Jugadores() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPganadas() {
        return pganadas;
    }

    public void setPganadas(int pganadas) {
        this.pganadas = pganadas;
    }

    public int getPperdidas() {
        return pperdidas;
    }

    public void setPperdidas(int pperdidas) {
        this.pperdidas = pperdidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Jugador: " + getNombre() + "\nPartidas Ganadas: " + getPganadas() + "\nPartidas Perdidas: " + getPperdidas() + "\nPuntos: " + getPuntos();
    }

}
