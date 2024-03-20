/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg01;

/**
 *
 * @author natgonmer
 */
public class NumeroFueraDeRango extends Exception{
    private int numero;

    NumeroFueraDeRango(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "El número " + this.numero + " se encuentra fuera del rango";
    }
    
    
    
    
    
}
