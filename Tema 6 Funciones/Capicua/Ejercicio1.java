/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static boolean capicua(int numerop) {
        //Declaración de Variables
        boolean es = false;
        int reves = 0;
        int original = numerop;
        int digito = 0;

        //mientras la variable original sea mayor a 0 se iran añadiendo sus digitos a la variable reves
        while (original > 0) {
            digito = original % 10;
            reves = reves * 10 + digito;
            original = original / 10;
        }

        //si numerop, que es el numero que damos es igual a reves, entonces es capicua
        if (numerop == reves) {
            es = true;
        } else {
            es = false;
        }
        return es;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        //declarar variables
        Scanner teclado = new Scanner(System.in);
        int dig = 0;
        int cont = 0;
        boolean valido = false;
        boolean fin = false;
        //el programa se repetira hasta que sea 0
        do {
            //Introducir los digitos y en caso incorrecto se repite hasta que sea correcto
            do {
                System.out.println("Introduce el número de dígitos");
                System.out.println("Debe ser entre 0 y 10");
                dig = teclado.nextInt();
                System.out.println("");
                //si introducimos un valor mayor que 10 no será valido y deberemos repetir el introducir números
                if (dig > 10) {
                    System.out.println("No es valido");
                    System.out.println("");
                    valido = false;
                    //Si nos da 0 sale del programa
                } else if (dig == 0) {
                    valido = true;
                    fin = true;
                    //si no es ni 0 ni 10, el programa continuará a hacer los cálculos
                } else {
                    valido = true;
                }
            } while (valido == false);

            //recorrido para mostrar los números capicuas
            //generamos array del tamaño necesario que almacena TODOS los números, de forma que cada vez que se repita el array tomará el tamaño necesario para cada dígito
            int[] arr = new int[(int)Math.pow(10, dig) - 1];

            //si anteriormente el número devuelto marco el booleano como valido y el digito no es 0 empezará a realizar las operaciones
            if (valido == true && dig != 0) {
                //asignamos al contador el valor de 0 para que cuente los capicua
                cont = 0;
                System.out.println("Capicúas entre " + (int) Math.pow(10, dig - 1) + " y " + (int) (Math.pow(10, dig) - 1));
                for (int i = (int) Math.pow(10, dig - 1); i <= Math.pow(10, dig) - 1; i++) {
                    //si el número es capicua añadira al contador y mostrará por pantalla el número
                    if (capicua(i) == true) {
                        arr[cont] = i;
                        cont++;
                    }
                }
                //aquí mostraremos aquellos números que sean capicuas
                for (int i = 0; i < cont; i++) {
                    //si el dígito corresponde a 1 o 2, nos mostrará todos sus digitos pues no son mayores a 10
                    if (dig < 3) {
                        System.out.println(arr[i]);
                    }
                    //en caso contrario hará lo siguiente
                    else {
                        //si i es menor a 5 o mayor o igual a contador -5 nos mostrará los números correspondientes a los 5 primeros y los 5 últimos capicuas.
                        if (i < 5 || i >= cont - 5) {
                            System.out.println(arr[i]);
                        }
                        //aquí nos mostrará en la 5 posición una linea de separación entre los primeros y los 5 últimos.
                        if (i == 5) {
                            System.out.println("------");
                        }
                    }

                }
                System.out.println("Capicuas de " + dig + " cifras: " + cont);
                System.out.println("");
            }
        } while (fin == false);
        System.out.println("Fin de Ejecución");
    }

}
