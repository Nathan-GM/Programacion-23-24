/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Natha
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pal = "Luz azul";
        String pal2 = pal.replace(" ", "").toLowerCase();
        
        int inicio = 0;
        int fin = pal2.length()-1;
        
        System.out.println("La frase " + pal);
        
        if (palindroma(pal2, inicio, fin) == true) {
            System.out.println("Es palindroma");
        }
        else {
            System.out.println("No es palindroma");
        }
    }
    
    public static boolean palindroma(String pal2, int inicio, int fin) {
        if (inicio > fin) {
            return true;
        }
        else {
            if (pal2.charAt(inicio) == pal2.charAt(fin)) {
                return palindroma(pal2, inicio+1, fin-1);
            }
            else {
                return false;
            }
        }
    }
    
}
