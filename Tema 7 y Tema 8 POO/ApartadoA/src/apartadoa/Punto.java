/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartadoa;

/**
 *
 * @author natgonmer
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //B1 generamos los getter de X y de Y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //B1: Generamos los setter de X y de Y.
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //Nos muestra por pantalla los valores de X y de Y
    public void imprime() {
        System.out.println("Coordenadas (" + this.x + "," + this.y + ")");
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        
        this.y = y;
    }
    
    public void desplaza(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public int distancia (Punto p) {
        int distancia = (int) Math.sqrt((Math.pow(this.x - p.x, 2) + (Math.pow(this.y -  p.y, 2))));
        return distancia;
    }
    
    public static Punto creaPuntoAleatorio() {
        int vx = (int) (Math.random()*200);
        int vy = (int) (Math.random()*200);
        return new Punto(vx,vy);
    }
}
