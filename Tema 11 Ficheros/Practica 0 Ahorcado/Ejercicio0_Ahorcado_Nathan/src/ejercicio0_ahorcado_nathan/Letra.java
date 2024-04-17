/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio0_ahorcado_nathan;

/**
 *
 * @author natgonmer
 */
public class Letra {
    private Character letra;
    private boolean visible;

    public Letra(Character letra, boolean visible) {
        this.letra = letra;
        this.visible = visible;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public Character visualizar() {
        if (this.visible == true) {
            return getLetra();
        }
        else {
            return '_';
        }
    }
}
