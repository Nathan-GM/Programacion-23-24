package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float t;
        float area;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe el lado A, lado B y lado C del triangulo");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        t = (a + b +c) / 2;
        area = (float) Math.sqrt(t*(t-a)*(t-b)*(t-c));
        System.out.println("El area es " + area );
    }
    
}
