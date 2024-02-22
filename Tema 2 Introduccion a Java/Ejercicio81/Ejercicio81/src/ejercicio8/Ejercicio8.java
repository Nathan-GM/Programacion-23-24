package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float d;
        float resultado; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero para A");
        a = teclado.nextInt();
        System.out.println("Escribe un numero para B");
        b = teclado.nextInt();
        System.out.println("Escribe un numero para C");
        c = teclado.nextInt();
        System.out.println("Escribe un numero para D");
        d = teclado.nextInt();
        
        resultado = (a / b) + 1;
        System.out.println("El resultado de A es " + resultado);
        resultado = (a + b) / (c - d);
        System.out.println("El resultado de B es " + resultado);
        resultado = a + (b / c);
        System.out.println("El resultado de C es " + resultado);
        resultado = a / (b + c);
        System.out.println("El resultado de D es " + resultado);
        resultado = (a + b) * (c / d);
        System.out.println("El resultado de E es " + resultado);
        resultado = (float) Math.pow(Math.pow(a+b, 2), 2);
        System.out.println("El resultado de F es " + resultado);
        resultado = (a + b) / (1 - 4 * a);
        System.out.println("El resultado de G es " + resultado);
        resultado = (float) (Math.pow(a+b,2) * (a-b));
        System.out.println("El resultado de H es " + resultado);
    }  
}