/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartasavanzado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class JuegoCartasAvanzado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //Declarar variables
        boolean ok = false;
        int jugadores = 0;
        int canCar = 0;
        int num = 5;
        int puntosganador = 0;
        int ganador = 0;
//array con todas las cartas necesarias
        int[] cartas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, //espadas
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, //bastos
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, //copas
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};//oros
//array con el valor de las cartas
        String[] valcar = {"As de Espadas", "2 Espadas", "3 espadas", "4 espadas", "5 espadas", "6 espadas", "7 espadas", "8 espadas", "9 espadas", "Sota de espadas", "Caballo de espadas", "Rey de espadas",
            "As de bastos", "2 bastos", "3 bastos", "4 bastos", "5 bastos", "6 bastos", "7 bastos", "8 bastos", "9 bastos", "Sota de bastos", "Caballo de bastos", "Rey de bastos",
            "As de copas", "2 copas", "3 copas", "4 copas", "5 copas", "6 copas", "7 copas", "8 copas", "9 copas", "Sota de copas", "Caballo de copas", "Rey de copas",
            "As de oros", "2 oros", "3 oros", "4 oros", "5 oros", "6 oros", "7 oros", "8 oros", "9 oros", "Sota de oros", "Caballo de oros", "Rey de oros"};
        //asignamos jugadores
        do {
            System.out.println("Introduce el número de jugadores");
            jugadores = teclado.nextInt();
            //si se sale de los limites deberemos escribir de nuevo
            if (jugadores < 2 || jugadores > 6) {
                System.out.println("Cantidad no validad");
                System.out.println("Debe ser entre 2 y 6");
                ok = false;
            } else {
                ok = true;
            }
        } while (ok == false);

        //si las cartas no son validas para la cantidad de jugadores se volveran a introducir.
        do {
            System.out.println("Introduce el número de Cartas a repartir");
            canCar = teclado.nextInt();
            ok = false;
            switch (jugadores) {
                case 2:
                    if (canCar < 0 || canCar > 24) {
                        System.out.println("No válido");
                        ok = false;
                    } else {
                        ok = true;
                    }
                    break;
                case 3:
                    if (canCar < 0 || canCar > 16) {
                        System.out.println("No válido");
                        ok = false;
                        break;
                    } else {
                        ok = true;
                    }
                    break;
                case 4:
                    if (canCar < 0 || canCar > 12) {
                        System.out.println("No válido");
                        ok = false;
                        break;
                    } else {
                        ok = true;
                    }
                    break;
                case 5:
                    if (canCar < 0 || canCar > 9) {
                        System.out.println("No válido");
                        ok = false;
                        break;
                    } else {
                        ok = true;
                    }
                case 6:
                    if (canCar < 0 || canCar > 8) {
                        System.out.println("No válido");
                        ok = false;
                        break;
                    } else {
                        ok = true;
                    }
            }
        } while (ok == false);
        //para cada jugador sacaremos X cartas
        int puntuacion[] = new int[jugadores + 1];
        for (int jug = 1; jug <= jugadores; jug++) {
            System.out.println("");
            System.out.println("Cartas de jugador " + jug);
            System.out.println("");
            int puntos = 0;
            int anterior = 0;

            //indicará las cartas para cada jugador
            for (int car = 0; car < canCar; car++) {
                //saca un número aleatorio entre 0 y 47 (cantidad de cartas)
                num = (int) (Math.random() * 48);
                //si el valor en el array de cartas de dicha carta NO es 0 (es decir, no se ha usado)
                if (cartas[num] != 0) {
                    System.out.print(valcar[num] + "    ");
                    if (car == 0) {
                        puntos = cartas[num];
                    } else {
                        if (cartas[num] > anterior) {
                            puntos = puntos + cartas[num];
                        }
                        if (cartas[num] < anterior) {
                            puntos = puntos - cartas[num];

                        }
                        if (cartas[num] == anterior) {
                            puntos = puntos;
                        }
                    }
                    anterior = cartas[num];
                    cartas[num] = 0;

                } else if (cartas[num] == 0) {
                    car--;
                }
            }
            System.out.println("");
            System.out.println("");
            puntuacion[jug] = puntos;
            System.out.println("El jugador " + jug + " tiene una puntuacion de " + puntuacion[jug]);
        }
        for (int i = 1; i < puntuacion.length; i++) {
            if (puntuacion[i] > puntosganador) {
                puntosganador = puntuacion[i];
                ganador = i;
            }
        }
        System.out.println("");
        System.out.println("El ganador es el jugador " + ganador + " con una puntuacion de " + puntosganador);
    }
}
