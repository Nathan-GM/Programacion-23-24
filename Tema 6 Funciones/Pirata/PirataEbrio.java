/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pirataebrio;

/**
 *
 * @author natgonmer
 */
public class PirataEbrio {

    /**
     * @param args the command line arguments
     */
    //funcion para mostrar el tablero
    public static void mostrartablero(int[][] rampa, int l, int a) {
        //posición inicial pirata;
        rampa[0][2] = 1;
        for (int ancho = 0; ancho < l; ancho++) {
            for (int largo = 0; largo < a; largo++) {
                System.out.printf("%4d", rampa[ancho][largo]);
            }
            System.out.println("");
        }
    }

    //calcula el número aleatorio para el movimiento del pirata
    public static int mov(int mov) {
        mov = (int) (Math.random() * 1000 + 1);
        return mov;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        boolean ahogado = false;
        //tamaño de la matriz
        int largo = 10;
        int ancho = 5;
        //posiciones inicio pirata para marcar limites
        int posL = 0, posA = 2;
        //String para indicar el recorrido que va haciendo el capitan
        String Reco = "";
        int[][] rampa = new int[largo][ancho];
        //contador para llevar la cuenta de los pasos del capitan
        int cont = 0;
        //mientras que las posiciones no se salgan de los limites del array repetira este bucle
        while (posA > -1 && posA < 5 && posL > -1 && posL < 10) {
            int random = 0;
            //movimiento izquierda, divisible entre 5
            if (mov(random) % 5 == 0) {
                posA--;
                Reco = Reco + "I ";
                cont++;
                rampa[posL][posA + 1] = cont;
                
                //movimiento derecha, no divisible entre 5 pero si entre 4
            } else if (mov(random) % 5 != 0 && mov(random) % 4 == 0) {
                posA++;
                Reco = Reco + "D ";
                cont++;
                rampa[posL][posA -   1] = cont;
                //resto de movimientos van hacia delante
            } else {
                posL++;
                Reco = Reco + "A ";
                cont++;
                rampa[posL - 1][posA] = cont;
            }
        }
        mostrartablero(rampa, largo, ancho);
        System.out.println("Recorrido: " + Reco);
        System.out.println("Total de Pasos: " + cont);
        //Nos devuelve el estado final del pirata, Ahogado Babor, Ahogado Estribor, Subio al Barco
        if (posA == -1) {
            System.out.println("Estado: Ahogado por babor en el escalon " + cont);
            ahogado = true;
        } else if (posA == 5) {
            System.out.println("Estado: Ahogado por estribor en el escalon " + cont);
            ahogado = true;
        } else if (posL == 10) {
            System.out.println("Estado: Subio al barco");
        }
        //En caso de ahogarse devuelve un mensaje, si llega devuelve otro
        if (ahogado == true) {
            System.out.println("Descanse en paz capitan :c");
        }
        else {
            System.out.println("Deberias controlar más la bebida capitan");
        }
    }
}
