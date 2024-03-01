/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author natgonmer
 */
public class Articulo {
    String cod;
    String titulo;
    String formato;
    float precio_alquiler;
    
    float precio1() {
        return (precio_alquiler);
    }
    float precio2() {
        float precioTotal;
        
        precioTotal = precio_alquiler * 1.6f;
        
        return (precioTotal);
    }
    
    float precioSemana() {
        float precioTotal;
        
        precioTotal = precio_alquiler * 5;
        
        return (precioTotal);
    }
    
    public void modificaValores(String cod_p, String titulo_p, String formato_p, float precio_p) {
        cod = cod_p;
        titulo = titulo_p;
        formato = formato_p;
        precio_alquiler = precio_p;
    }
    
    public String getCod() {
        return cod;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public float getPrecio_alquiler() {
        return precio_alquiler;
    }
}
