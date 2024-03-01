/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author natgonmer
 */
public class Articulo {

    private String nombre;
    private int precio;
    private static double iva = 0.21;
    private int cuantosQuedan;

    public Articulo(String nombre, int precio, int cuantosQuedan) {
        if (iva == 0.21 && precio > 0) {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("ERROR Valores no validos");
        }
    }

    public void imprime() {
        if (this.cuantosQuedan == 0) {
            System.err.println("ERROR Objeto no disponible");
        } else {
            System.out.println(this.getNombre() + " - Precio: " + this.getPrecio() + "€ - IVA: " + getIva() + "% - PVP:" + (this.getPrecio() + (this.getPrecio() * getIva())) + "€");
        }

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the iva
     */
    public static double getIva() {
        return iva;
    }

    /**
     * @param aIva the iva to set
     */
    public static void setIva(double aIva) {
        iva = aIva;
    }

    /**
     * @return the cuantosQuedan
     */
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    /**
     * @param cuantosQuedan the cuantosQuedan to set
     */
    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
}
