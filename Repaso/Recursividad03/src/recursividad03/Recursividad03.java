/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad03;

/**
 *
 * @author natgonmer
 */
public class Recursividad03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n[] = {6, 3, 5, 6, 8, 10, 4};
        /* 
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random()*10+1);
        }
         */
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        int posIni = 1;
        int posFin = 6;
        System.out.println("");
        System.out.println("Se comprobará el array desde la posición " + posIni + " (" + n[posIni] + ") hasta la posición " + posFin + " (" + n[posFin] + ")");
        if (ordenacionParcial(n, posIni, posFin) == true) {
            System.out.println("Esta ordenado parcialmente");
        } else {
            System.out.println("No esta ordenado parcialmente");
        }

    }

    public static boolean ordenacionParcial(int[] numeros, int posInicial, int posFinal) {
        boolean ordenado = true;
        if (posInicial == posFinal) {
            return true;
        }
        if (numeros[posInicial] <= numeros[posInicial + 1]) {
            return ordenacionParcial(numeros, posInicial + 1, posFinal);
        } else {
            ordenado = false;
        }
        return ordenado;
    }
}
