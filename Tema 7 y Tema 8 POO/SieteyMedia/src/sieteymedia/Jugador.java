/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sieteymedia;

import java.util.ArrayList;

/**
 *
 * @author natgonmer
 */
public class Jugador {

    private int id;
    private int saldo;
    private ArrayList<Jugador> jugadores;
    private double puntuacion;

    public Jugador(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
        this.puntuacion = 0;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarJugadores() {
        for (Jugador jugadores : jugadores) {
            System.out.println("\tID: " + jugadores.getId());
            System.out.println("\tSaldo: " + jugadores.getSaldo());
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
