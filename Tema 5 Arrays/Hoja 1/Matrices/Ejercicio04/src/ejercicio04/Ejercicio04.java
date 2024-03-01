/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author damtarde
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int al = 4;
        int not = 6;
        int [][] mat = new int [al][not];
        
        //Alumno
        for (int i = 0; i < mat.length; i++) {
            //notas
            for (int j = 0; j < mat[i].length; j++) {
                mat [i][j] = (int) (Math.random()*10);
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }
    
}
