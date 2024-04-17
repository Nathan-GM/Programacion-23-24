/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio0_ahorcado_nathan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author natgonmer
 */
public class Juego {
    private Jugadores j1;
    private Jugadores j2;
    private String palabra;
    private ArrayList<Letra>pObjetivo;
    private ArrayList<Character> letraCorrecta;
    private ArrayList<Character> letraFallida;
    private int intentos;

    public Juego(Jugadores j1, Jugadores j2, String palabra) {
        this.j1 = j1;
        this.j2 = j2;
        this.palabra = palabra;
        this.pObjetivo = ocultar(palabra);
        this.letraCorrecta = new ArrayList<>();
        this.letraFallida = new ArrayList<>();
        this.intentos = 6;
    }
    
    
    public void jueguito() {
        Scanner teclado = new Scanner(System.in);
        char caracter = '\0';
        while (this.intentos > 0) {
            do {
                mostrar();
                System.out.print("Introduce una letra: ");
                caracter = teclado.next().charAt(0);
                comprobarLetra(caracter);
            }while (!Character.isLetter(caracter));
        }
    }
    
    
    public ArrayList<Letra> ocultar(String palabra) {
        ArrayList<Letra> aux = new ArrayList<>();
        for (Character c : palabra.toCharArray()) {
            Letra nueva = new Letra(c, false);
            aux.add(nueva);
        }
        return aux;
    }
    
    public void mostrar() {
        for (Letra c : pObjetivo) {
            System.out.print(c.visualizar() + " ");
        }
        System.out.println("");
    }
    
    public void comprobarLetra(Character c) {
        boolean AoF;
        int AoFp = 0;
        for (int i = 0; i < pObjetivo.size(); i++) {
            if (pObjetivo.get(i).getLetra().equals(c)) {
                pObjetivo.get(i).setVisible(true);
                if (AoFp <= 0) {
                    AoFp = 1;
                    letraCorrecta.add(c);
                }
            }
            else {
                if (AoFp <= 0) {
                    AoFp = 1;
                    letraFallida.add(c);
                    this.intentos--;
                }
            }
        }
    }
    
    
    
}
