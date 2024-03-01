/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sieteymedia;
import java.util.Scanner;
/**
 *
 * @author natgonmer
 */
public class SieteyMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int totalJugadores = 0;
        System.out.println("¿Cuántos jugadores son?");
        totalJugadores = teclado.nextInt();
        Jugador mostrar = new Jugador(0, 0);
        for (int i = 0; i < totalJugadores; i++) {
            Jugador jugador = new Jugador(i, 1000);
            jugador.addJugador(jugador);
        }
        System.out.println("Muestra jugadores.");
        mostrar.mostrarJugadores();
    }
    
}
