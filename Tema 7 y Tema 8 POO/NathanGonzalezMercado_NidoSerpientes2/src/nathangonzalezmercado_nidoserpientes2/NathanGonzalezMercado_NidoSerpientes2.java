/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nathangonzalezmercado_nidoserpientes2;

/**
 *
 * @author Natha
 */
public class NathanGonzalezMercado_NidoSerpientes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        int totalSerpientes = (int) (Math.random() * 10 + 10);
        Serpiente ser[] = new Serpiente[totalSerpientes];
       
        boolean fin = false;
        System.out.println("Nacen " + totalSerpientes + " serpientes");
        System.out.println("Por ellos todas tienen 1 año y un anillo con un primer color aleatorio");
        for (int i = 0; i < totalSerpientes; i++) {
            ser[i] = new Serpiente(0, 0, "");
            ser[i].nace();
            ser[i].imprimeColor(i);
        }
        
        System.out.println("Seguimiento de su vida");
        for (int i = 0; i < totalSerpientes; i++) {
            fin = false;
            System.out.println("--------------------------------------------------------------");
            System.out.println("Serpiente " + i);
            while (fin == false) {
                ser[i].vida();
                ser[i].imprime(i);
                System.out.println("");
                if (ser[i].muerto() == true) {
                    fin = true;
                    break;
                }
            }
            System.out.println("");
        }

        System.out.println("Han muerto todas las serpientes");
    }

}
