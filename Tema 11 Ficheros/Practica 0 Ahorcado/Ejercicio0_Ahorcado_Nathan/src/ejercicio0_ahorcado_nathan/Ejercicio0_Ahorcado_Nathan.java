/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio0_ahorcado_nathan;

/**
 *
 * @author natgonmer
 */
public class Ejercicio0_Ahorcado_Nathan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugadores j1 = new Jugadores("Sara", 0, 0, 0);
        Jugadores j2 = new Jugadores("Rosie", 0, 0, 0);
        String palabra = "cubito";
        Juego j = new Juego(j1, j2, palabra);
        j.jueguito();
    }
    
}
