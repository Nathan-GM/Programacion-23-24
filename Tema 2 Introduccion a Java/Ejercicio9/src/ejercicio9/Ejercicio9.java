package ejercicio9;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float d;
        float e;
        float f;
        float x;
        float y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número para A");
        a = teclado.nextInt();
        System.out.println("Escribe un número para B");
        b = teclado.nextInt();
        System.out.println("Escribe un número para C");
        c = teclado.nextInt();
        System.out.println("Escribe un número para D");
        d = teclado.nextInt();
        System.out.println("Escribe un número para E");
        e = teclado.nextInt();
        System.out.println("Escribe un número para F");
        f = teclado.nextInt();
        x = (c * e) - (b * f) / (a * e) - (b * d);
        y = (a * f) - (c * d) / (a * e) - (b * d);
        System.out.println("X =" + x);
        System.out.println("Y =" + y);
    }
    
}
