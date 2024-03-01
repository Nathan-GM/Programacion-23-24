/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguasnilo;

import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class AguasNilo {

    /**
     * @param args the command line arguments
     */
    static int inundada = 1; //variable que nos indica la cantidad de casillas que estan inundadas, comenzando en 1 dado que siempre contaremos con una inundada.
    //al crearla de esta forma, podrá ser utilizado por todos.

    //nos va a mostrar la matriz en el estado en el que se encuentre.
    public static void mostrar(int[][] superficie, int filas, int columnas) {
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.printf("%4d", superficie[i][j]);
            }
            System.out.println("");
        }
    }

    //comprobará las casillas 
    public static void comp(int contador, int[][] superficie, int fila, int columna) {
        if (superficie[fila][columna] <= contador) {
            superficie[fila][columna] = 22;
            inundada++;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //Declaración de variables
        int p = 0; //ancho
        int f = 0; //alto
        int n0 = 0; //la mitad para indicar el 0
        int cont = 0; //contador que nos indicará hasta donde ha llegado el agua (que altura tiene la crecida)
        int mitad = 0; //Indica la mitad de las casillas que se deben inundar.

        //Daremos valores al ancho y al alto teniendo en cuenta los limites
        //Es decir, que no sea mayor a 100 ni menor a 1 y que el alto sea impar.
        do {
            System.out.print("Escribe el ancho del terreno: ");
            p = teclado.nextInt();
            System.out.print("Escribe el alto del terreno, debe ser impar: ");
            f = teclado.nextInt();
            if (p < 1 || p > 100 || f < 1 || f > 100 || f % 2 == 0) {
                System.out.println("Los números introducidos no son validos");
            }
        } while (p < 1 || p > 100 || f < 1 || f > 100 || f % 2 == 0);

        //crearemos la matriz que indicará el ancho y el alto especificado anteriormente.
        int[][] superficie = new int[f][p];

        //asignaremos para cada uno de los huecos de la matriz un valor aleatorio entre 0 y 10.
        for (int filas = 0; filas < f; filas++) {
            for (int columnas = 0; columnas < p; columnas++) {
                superficie[filas][columnas] = (int) (Math.random() * 10);
            }
        }
        //calculamos e indicamos donde se encontrará el 0 en base a la información proporcionada
        //Es decir, el alto / 2 para inidcar la mitad.
        n0 = f / 2;
        superficie[n0][0] = 0;
        mostrar(superficie, p, f);
        mitad = ((p * f) / 2);
        //a continuación, cambiaremos los valores que se vayan inundando por otro número, en este caso, el 22.
        superficie[n0][0] = 22;
        //haremos un bucle que comprobará todas las casillas siempre que el contador sea menor o igual a 10 Y que las casillas inundadas sean menores o iguales a la mitad.
        while (cont <= 10 && inundada <= mitad) {
            for (int filas = 0; filas < f; filas++) { //alto
                for (int columnas = 0; columnas < p; columnas++) { //ancho
                    //si la posición en la que nos encontramos esta inundada, la que hemos indicado como 22 revisará en las direcciones si hay alguna casilla posible de inundar.
                    if (superficie[filas][columnas] == 22) {
                        //Comprobación a su izquierda
                        if (columnas - 1 >= 0) {
                            comp(cont, superficie, filas, (columnas - 1));
                        }
                        //Comprobación a la derecha
                        if (columnas + 1 < p) {
                            comp(cont, superficie, filas, (columnas + 1));
                        }
                       
                        //comprobación hacia arriba
                        if (filas - 1 >= 0) {
                            comp(cont, superficie, (filas - 1), columnas);
                        }
                         
                        //comrpobación hacia abajo
                        if (filas + 1 < f) {
                            comp(cont, superficie, (filas + 1), columnas);
                        }

                    }
                }
            }
            //aumentamos la cantidad del agua que hay
            cont++;
        }
        System.out.println("");
        System.out.println("Hay " + inundada + " casillas que estan inundadas");
        System.out.println("El nivel de agua necesario para inundar la mitad de la superficie es " + cont);
        System.out.println("Resultado final:");
        System.out.println("");
        mostrar(superficie, p, f);
    }

}
