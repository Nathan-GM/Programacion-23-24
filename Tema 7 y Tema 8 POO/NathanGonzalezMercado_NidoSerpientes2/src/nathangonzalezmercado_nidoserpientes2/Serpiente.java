/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nathangonzalezmercado_nidoserpientes2;

/**
 *
 * @author Natha
 */
public class Serpiente {

    private int edad;
    private int tamano;
    private String color;

    public Serpiente(int edad, int tamano, String color) {
        this.edad = edad;
        this.tamano = tamano;
        this.color = color;
    }

    public void nace() {
        this.setEdad(this.getEdad() + 1);
        this.setTamano(this.getTamano() + 1);
        asignaColor();
    }

    //arreglado
    public void mudaColor() {
        this.color = "";
        int ultimo = 0;
        for (int i = 0; i < this.tamano; i++) {
            int random = (int) (Math.random() * 3 + 1);
            if (random != ultimo) {
                switch (random) {
                    case 1:
                        this.color += "R";
                        ultimo = 1;
                        break;
                    case 2:
                        this.color += "A";
                        ultimo = 2;
                        break;
                    case 3:
                        this.color += "N";
                        ultimo = 3;
                        break;
                    default:
                        System.err.println("Algo no salio bien, revisa");
                }
            } else {
                i--;
            }
        }
    }

    //funciona bien
    public void asignaColor() {
        boolean correcto = false;
        int random = 0;
        while (correcto == false) {
            int random1 = (int) (Math.random() * 3 + 1);
            if (random1 == 1 && this.color.endsWith("R")) {
                correcto = false;
            } else if (random1 == 2 && this.color.endsWith("A")) {
                correcto = false;
            } else if (random1 == 3 && this.color.endsWith("N")) {
                correcto = false;
            } else {
                correcto = true;
                random = random1;
            }
        }
        switch (random) {
            case 1:
                this.setColor(this.getColor() + "R");
                break;
            case 2:
                this.setColor(this.getColor() + "A");
                break;
            case 3:
                this.setColor(this.getColor() + "N");
                break;
            default:
                System.err.println("Algo no salio bien, revisa");

        }
    }

    public void imprime(int i) {
        System.out.println("La serpiente " + i + " tiene " + this.edad + " años y tiene " + this.tamano + " anillos con los colores: " + this.color);
    }
    
    public void imprimeColor(int i) {
        System.out.println("Serpiente " + i + ": " + this.color);
    }

    public void vida() {
        //muerto();
        if (this.edad <= 10) {
            int random = (int) (Math.random() * 10 + 1);
            if (random <= 8) {
                this.tamano++;
                asignaColor();
            } else if (random > 8) {
                mudaColor();
            }
        } else if (this.edad > 10) {
            int random = (int) (Math.random() * 10 + 1);
            if (random <= 9) {
                tamano--;
                pierdeAnillo();
            } else if (random > 9) {
                mudaColor();
            }
        }
        this.edad++;
    }

    public boolean muerto() {
        if (this.tamano <= 0) {
            System.out.println("La serpiente ha muerto de vejez (DEP :c )");
            return true;
        }
        int muerte = (int) (Math.random() * 100);
        if (muerte >= 90) {
            int forma = (int) (Math.random() * 100);
            if (forma <= 25) {
                System.out.println("La serpiente ha muerto por accidente (DEP :c )");
                return true;
            } else if (forma > 25 && forma <= 65) {
                System.out.println("La serpiente ha muerto por ataque de mangosta (DEP :c )");
                return true;

            } else {
                System.out.println("La serpiente ha muerto por ataque de un águila (DEP :c )");
                return true;
            }
        } else {
            return false;
        }
    }

    public void pierdeAnillo() {
        if (this.color.length() > 0) {

            this.color = this.color.substring(0, this.color.length() - 1);
        }
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

}
