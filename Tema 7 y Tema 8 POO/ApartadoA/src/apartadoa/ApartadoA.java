/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartadoa;

/**
 *
 * @author natgonmer
 */
public class ApartadoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Ejercicio A1
        System.out.println("Estado Actual: D1");

        //creamos los 3 objetos correspondientes a los puntos
        //B1: Ahora es obligatorio crearlo indicandole los valores
        Punto obj1 = new Punto(5, 0);
        Punto obj2 = new Punto(10, 10);
        Punto obj3 = new Punto(-3, 7);

        //Asignamos valores a los 3 puntos A1
        //B1 Al asignar los valores en la creación esto termina por ser no necesario.
        /*
        obj1.x = 5;
        obj1.y = 0;

        obj2.x = 10;
        obj2.y = 10;

        obj3.x = -3;
        obj3.y = 7;

         */
        //a1: mostramos los 3 puntos.
        //c1: Ahora los mostramos con los getter
        System.out.println("Coordenadas punto 1: (" + obj1.getX() + "," + obj1.getY() + ")");
        System.out.println("Coordenadas punto 2: (" + obj2.getX() + "," + obj2.getY() + ")");
        System.out.println("Coordenadas punto 3: (" + obj3.getX() + "," + obj3.getY() + ")");

        //A1: A continuación modificamos las coordenadas
        /*
        obj1.x -= 2;
        obj1.y += 9;

        obj2.x /= 5;
        obj2.y = 10;

        obj3.x += 4;
        obj3.y *= 4;

         */
        //C1 le damos distintos valores mediante el setter
        obj1.setX(obj1.getX() - 3);
        obj1.setY(obj1.getY() + 9);

        obj2.setX(obj2.getX() / 5);
        obj2.setY(10);

        obj3.setX(obj3.getX() + 4);
        obj3.setY(obj3.getY() * 6);

        //a1: mostramos los 3 puntos ya modificados.
        //c1: Ahora los mostramos con los getter
        System.out.println("");
        System.out.println("Coordenadas punto 1: (" + obj1.getX() + "," + obj1.getY() + ")");
        System.out.println("Coordenadas punto 2: (" + obj2.getX() + "," + obj2.getY() + ")");
        System.out.println("Coordenadas punto 3: (" + obj3.getX() + "," + obj3.getY() + ")");
        System.out.println("");
        
        //Apartado D1
        System.out.println("D1");

        //Probamos a desplazar el obj1
        obj1.desplaza(2, 5);
        //Imprimimos las coordenadas del obj1.
        obj1.imprime();

        //Asignamos con SetXY nuevos valores, valores colocados para funcionar la distancia.
        obj1.setXY(4, 1);
        obj2.setXY(7, 5);
        
        //Comprobamos que la distancia es correcta entre obj2 y 1 (En el ejemplo el resultado debe dar 5)
        System.out.println("Distancia entre (" + obj1.getX() + "," + obj1.getY() + ") y (" + obj2.getX() + "," + obj2.getY() + ") es igual a " + obj2.distancia(obj1));
        
        System.out.println("");
        
        System.out.println("E1");
        //Apartado E1
        Punto p3;
    }

}
