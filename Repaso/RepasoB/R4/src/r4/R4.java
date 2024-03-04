/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r4;

/**
 *
 * @author Natha
 */
public class R4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1234567890;
        String n2 = "" + n;
        int inicio = 0;
        int fin = n2.length() - 1;

        System.out.println("Números usados:" + n);
        System.out.println("Número a texto: " + nal(n2, inicio, fin));

    }
 
    public static String nal(String n2, int inicio, int fin) {
        String a = "";
        if (inicio == fin) {
            switch (n2.charAt(inicio)) {
                case '1':
                    return a + "Uno";
                case '2':
                    return a + "Dos";
                case '3':
                    return a + "Tres";
                case '4':
                    return a + "Cuatro";
                case '5':
                    return a + "Cinco";
                    
                case '6':
                    return a + "Seis";
                case '7':
                    return a + "Siete";
                case '8':
                    return a + "Ocho";
                case '9':
                    return a + "Nueve";
                case '0':
                    return  a + "Cero";
            }
        }
        else{
            switch (n2.charAt(inicio)) {
                case '1':
                    return a + "Uno " + nal(n2, inicio+1, fin);
                case '2':
                    return a + "Dos " + nal(n2, inicio+1, fin);
                case '3':
                    return a + "Tres " + nal(n2, inicio+1, fin);
                case '4':
                    return a + "Cuatro " + nal(n2, inicio+1, fin);
                case '5':
                    return a + "Cinco " + nal(n2, inicio+1, fin);
                case '6':
                    return a + "Seis " + nal(n2, inicio+1, fin);
                case '7':
                    return a + "Siete " + nal(n2, inicio+1, fin);
                case '8':
                    return a + "Ocho " + nal(n2, inicio+1, fin);
                case '9':
                    return a + "Nueve " + nal(n2, inicio+1, fin);
                case '0':
                    return  a + "Cero " + nal(n2, inicio+1, fin);
            }
        }
        return a;
    }

}
    

