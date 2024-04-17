/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio0_ahorcado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class JuegoAhorcado {

    private int numeroJugadores;
    private Jugadores j1;
    private Jugadores j2;
    private String palabra;
    private ArrayList<Letra> objetivo;
    private ArrayList<Character> letraCorrecta;
    private ArrayList<Character> letraFallida;
    private int intentos;

    public JuegoAhorcado(Jugadores j1, Jugadores j2, String palabra) {
        this.j1 = j1;
        this.j2 = j2;
        this.palabra = palabra;
        this.objetivo = oculta(palabra);
        this.letraCorrecta = new ArrayList<>();
        this.letraFallida = new ArrayList<>();
        this.intentos = 6;
    }

    public void juego() {
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        char caracter = '\0'; // '\0' implica que es 0
        while (this.intentos > 0 || correcto == true) {
            System.out.println("---------------------------------");
            do {
                System.out.println("Palabra a adivinar:");
                mostrarLetras();
                mostrarAciertos();
                System.out.println("");
                mostrarFallos();
                dibujito(intentos);
                System.out.println("");
                System.out.print("Introduce una letra: ");
                caracter = teclado.next().charAt(0);
                comprobarUsado(caracter);
                if (comprobarUsado(caracter) == true) {
                    System.out.println("La letra " + caracter + " ya ha sido introducida");
                }
                else {
                 comprobarLetra(caracter);   
                }
                correcto = palabra();
                System.out.println("---------------------------------");
            } while (!Character.isLetter(caracter));

        }
    }

    @Override
    public String toString() {
        return "JuegoAhorcado{" + "numeroJugadores=" + numeroJugadores + ", j1=" + j1.getNombre() + ", j2=" + j2.getNombre() + ", palabra=" + palabra + ", letraCorrecta=" + letraCorrecta + ", letraFallida=" + letraFallida + ", intentos=" + intentos + '}';
    }

    public ArrayList<Letra> oculta(String palabra) {
        ArrayList<Letra> auxiliar = new ArrayList<>();
        for (Character c : palabra.toCharArray()) {
            Letra l = new Letra(c, false);
            auxiliar.add(l);
        }
        return auxiliar;
    }

    public void mostrarLetras() {
        for (Letra c : objetivo) {
            System.out.print(c.visualizar() + " ");
        }
        System.out.println("");
    }
    
    public boolean palabra() {
        boolean letras = true;
        for (Letra l : objetivo) {
            letras = letras && l.isVisible();
        }
        return letras;
    }

    public void comprobarLetra(Character c) {
        boolean AoF = false;
        for (int i = 0; i < objetivo.size(); i++) {
            if (objetivo.get(i).getLetra().equals(c)) {
                objetivo.get(i).setVisible(true);
                AoF = true;
        }
    }
        if (AoF == true) {
            letraCorrecta.add(c);
        }
        else {
            letraFallida.add(c);
            this.intentos--;
        }
    }
    
    public boolean comprobarUsado(Character c) {
        boolean usado = false;
        for (Character l : letraCorrecta) {
            if (l.equals(c)) {
                usado = true;
                break;
            }
        }
        if (usado = false) {
            for(Character ll : letraFallida) {
                if (ll.equals(c)) {
                    usado = true;
                    break;
                }
            }
        }
        return usado;
    }

    public static void dibujito(int intento) {
        switch (intento) {
            case 0:
                System.out.println("            \n" +
"                     __________\n" +
"                    |         |\n" +
"                    |         0\n" +
"                    |        /|\\\\\n" +
"                    |        / \\\\\n" +
"                    |\n" +
"                  __|__");
                break;
            case 1:
                System.out.println("            \n" +
"                     __________\n" +
"                    |         |\n" +
"                    |         0\n" +
"                    |        /|\n" +
"                    |        / \\\\\n" +
"                    |\n" +
"                  __|__");
                break;
            case 2:
                System.out.println("            \n" +
"                     __________\n" +
"                    |         |\n" +
"                    |         0\n" +
"                    |         |\n" +
"                    |        / \\\\\n" +
"                    |\n" +
"                  __|__");
                break;
            case 3:
                System.out.println("            \n" +
"                     __________\n" +
"                    |         |\n" +
"                    |         0\n" +
"                    |         |\n" +
"                    |        / \n" +
"                    |\n" +
"                  __|__");
                break;
            case 4:
                System.out.println("            \n" +
"                     __________\n" +
"                    |         |\n" +
"                    |         0\n" +
"                    |         |\n" +
"                    |         \n" +
"                    |\n" +
"                  __|__");
                break;
            case 5:
                System.out.println("            \n" +
"                     __________\n" +
"                    |         |\n" +
"                    |         0\n" +
"                    |        \n" +
"                    |         \n" +
"                    |\n" +
"                  __|__");
                break;
            case 6:
                System.out.println("            \n"
                        + "                     __________\n"
                        + "                    |         |\n"
                        + "                    |         \n"
                        + "                    |        \n"
                        + "                    |        \n"
                        + "                    |\n"
                        + "                  __|__");
                break;
        }
    }

    public void mostrarAciertos() {
        if (letraCorrecta.size() == 0) {
            System.out.println("");
        } else {
            System.out.print("Letras acertadas: ");
            for (int i = 0; i < letraCorrecta.size(); i++) {
                System.out.print(letraCorrecta.get(i) + " ");
            }
        }

    }

    public void mostrarFallos() {
        if (letraFallida.size() == 0) {
            System.out.println("");
        } else {
            System.out.print("Letras incorrectas: ");
            for (int i = 0; i < letraFallida.size(); i++) {
                System.out.print(letraFallida.get(i) + " ");
            }
        }

    }

}
