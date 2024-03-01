/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author natgonmer
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombres = {
            "John Doe", "Jane Smith", "Mike Johnson", "Emily Davis", "Chris Brown",
            "Amanda Wilson", "David Clark", "Sarah Miller", "Ryan Taylor", "Ashley Thomas",
            "Michael Williams", "Jessica Martinez", "Matthew Anderson", "Emma Taylor", "Daniel Garcia",
            "Olivia Rodriguez", "William Hernandez", "Isabella Lopez", "Ethan Gonzalez", "Sophia Perez",
            "Alexander Lee", "Madison Harris", "Liam Clark", "Chloe King", "James Martinez",
            "Amelia White", "Benjamin Hall", "Ava Robinson", "Mason Martinez", "Charlotte Scott",
            "Jackson Green", "Penelope Adams", "Lucas Baker", "Ella Garcia", "Jacob Rodriguez",
            "Luna Hernandez", "Logan Wilson", "Avery Anderson", "Layla Jackson", "Oliver Martinez",
            "Riley Carter", "Emma Thompson", "Sebastian Moore", "Aria Kelly", "Julian Sanchez",
            "Harper Nguyen", "Daniel Smith", "Zoe Davis", "Carter Brown", "Mia Martinez",
            "Elijah Johnson", "Scarlett White", "Noah Hall", "Grace Adams", "Ethan Wilson",
            "Avery Thompson", "Madison Garcia", "Michael Brown", "Emma Lee", "Sophia Martinez",
            "Benjamin Rodriguez", "Mason Nguyen", "Ava Smith", "Isabella Johnson", "James Davis",
            "Charlotte Moore", "William Nguyen", "Ella Anderson"
        };
        System.out.println("Orden inicial: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " ");
        }

        burbuja(nombres);
        System.out.println("");
        System.out.println("");

        System.out.println("\tOrdenado Burbuja: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " ");
        }
    }

    public static void burbuja(String[] nombre) {
        int i, j;
        String aux;
        for (i = 0; i < nombre.length - 1; i++) {
            for (j = 0; j < nombre.length - 1 - i; j++) {
                if (nombre[j].compareTo(nombre[j + 1]) > -1) {
                    aux = nombre[j];
                    nombre[j] = nombre[j + 1];
                    nombre[j + 1] = aux;
                }
            }

        }
    }

}
