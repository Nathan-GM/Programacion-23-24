/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio0_ahorcado_nathan;

/**
 *
 * @author natgonmer
 */
public class Jugadores {
    private String nombre;
    private int ganadas;
    private int perdidas;
    private int puntuacion;

    public Jugadores(String nombre) {
        this.nombre = nombre;
        this.ganadas = 0;
        this.perdidas = 0;
        this.puntuacion = 0;
    }

    public Jugadores(String nombre, int ganadas, int perdidas, int puntuacion) {
        this.nombre = nombre;
        this.ganadas = ganadas;
        this.perdidas = perdidas;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", ganadas=" + ganadas + ", perdidas=" + perdidas + ", puntuacion=" + puntuacion + '}';
    }
    
    
    
    
}
