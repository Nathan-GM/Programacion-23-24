/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartas;

/**
 *
 * @author natgonmer
 */
public class JuegoCartas {

    /**
     * @param args the command line arguments
     */
    public static int basica(int j[]) {
        int ptos = 0;
        int ant = 0;
        for (int i = 0; i < j.length; i++) {
            if (i == 0) {
                ptos = i;
            }
            if (j[i] > ant) {
                ptos = ptos + j[i];
            }
            if (j[i] < ant) {
                ptos = ptos - j[i];
            }
            if (j[i] == ant) {
                ptos = ptos;
            }
            ant = j[i];
        }
        return ptos;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] jugador1 = new int[5];
        int[] jugador2 = new int[5];
        System.out.println("Cartas de jugador 1 (Copas)");
        for (int i = 0; i < jugador1.length; i++) {
            jugador1[i] = (int) (Math.random() * 12 + 1);
            System.out.println(jugador1[i]);
        }
        int puntos1 = basica(jugador1);
        System.out.println("Puntos totales de Jugador 1: " + puntos1);
        System.out.println("");
        basica(jugador2);

        System.out.println("Cartas de Jugador 2 (Bastos)");
        for (int i = 0; i < jugador2.length; i++) {
            jugador2[i] = (int) (Math.random() * 12 + 1);
            System.out.println(jugador2[i]);
        }
        int puntos2 = basica(jugador2);
        System.out.println("Puntos totales de Jugador 2: " + puntos2);
        if (puntos1 > puntos2) {
            System.out.println("Ganan Copas");
        }
        else {
            System.out.println("Ganan Bastos");
        }
    }

}

