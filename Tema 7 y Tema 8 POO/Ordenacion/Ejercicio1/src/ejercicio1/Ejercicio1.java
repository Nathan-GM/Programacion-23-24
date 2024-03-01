/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author natgonmer
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100+1);
        }
        
        mostrar(numeros);
        /*
        System.out.println("Ahora se ordenara mediante metodo burbuja");
        System.out.println("");
        burbuja(numeros);
        System.out.println("");
        System.out.println("Se mostrará para comprobar que se ordenaron correctamente");
        mostrar(numeros);
        */
        
        System.out.println("Ahora se mostraran ordenados en seleccion");
        seleccion(numeros);
        System.out.println("");
        mostrar(numeros);
    }
    
    public static void mostrar(int [] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
    
    public static void inserccion(int[] numero){
        //declaramos las variables necesarias
        int i,j, aux;
        //i corresponde a la posicion actual
        //j corresponde a la posicion anterior a la actual
        //aux corresponde al número que se encuentra en la posición I.
        
        //recorremos el array
        for (i = 1; i < numero.length; i++) {
            //marcamos el numero que se encuentra en la posicion I
            aux = numero[i];
            for (j = i-1;  j >= 0 && aux < numero[j]; j--) {
                numero[j+1] = numero[j];
            }
            numero[j+1] = aux;
        }
    }
    
    public static void burbuja(int[] numero) {
        int i, j, aux;
        for (i = 0; i < numero.length - 1; i++) {
            for(j = 0; j < numero.length - 1 - i; j++) {
                if (numero[j] > numero[j + 1]) {
                    aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                }
            }
            
        }
    }
    
    public static void seleccion(int [] a) {
        //reclaramos variables
        int i, j, aux, minimo;
        /*
        i corresponde a la posición del array
        j corresponde a la posicion siguiente de i.
        aux corresponde al valor que haya en la posicion i del array
        minimo hace referencia a la posicion de i
        */
        
        
        
        //recorremos el array
        for (i = 0; i < a.length -1; i++) {
            minimo = i;
            //recorremos el array nuevamente desde la posición siguiente a la i
            for (j = i+1; j < a.length; j++) {
                //si el nº de la posicion de j es menor que el de la posicion de minimo
                if (a[j] < a[minimo]) {
                    //entonces minimo se convierte en j
                    minimo = j;
                }
            }
            
            aux = a[i];
            a[i] = a[minimo];
            a[minimo] = aux;
        }
    }
    
}
