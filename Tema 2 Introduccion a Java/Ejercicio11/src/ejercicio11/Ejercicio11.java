package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float d;
        float distancia;
        float distancia2;
        float distancia3;
        float t;
        float area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe los numeros correspondientes a A, B, C y D.");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        distancia = (float) Math.sqrt((Math.pow(c - a, 2)) + Math.pow(d - b , 2));
        distancia2 = (float) Math.sqrt((Math.pow(0 - a, 2)) + Math.pow(0 - b , 2));
        distancia3 = (float) Math.sqrt((Math.pow(c - 0, 2)) + Math.pow(d - 0 , 2));
        System.out.println("La distancia entre P y Q es de " + distancia);
        System.out.println("La distancia entre O y P es de " + distancia2);
        System.out.println("La distancia entre O y Q es de " + distancia3);
        t = (distancia + distancia2 + distancia3) / 2;
        area = (float) Math.sqrt(t*(t-distancia)*(t-distancia2)*(t-distancia3));
        System.out.println("El aréa de este triangulo es de: " + area);
    }
}