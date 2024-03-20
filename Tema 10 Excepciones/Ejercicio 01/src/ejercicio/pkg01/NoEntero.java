/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg01;

/**
 *
 * @author natgonmer
 */
public class NoEntero extends Exception{
    private String noEsEntero;

    public NoEntero(String noEsEntero) {
        this.noEsEntero = noEsEntero;
    }

    @Override
    public String toString() {
        return "El elemento " + this.noEsEntero + " no es un entero";
    }
    
    
    
    
    
    
}
