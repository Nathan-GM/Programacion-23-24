/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IEUser
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            limpiar();
        } catch (IOException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }

        portada();
        adios();
        
        dibujarHorca(6);

    }

    public static void limpiar() throws IOException {
        /*
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            Runtime.getRuntime().exec("cls");
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
         */
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void portada() {
        System.out.println("\n"
                + "8888888888 888\n"
                + "888        888                     __________\n"
                + "888        888                    |         |\n"
                + "8888888    888                    |         0\n"
                + "888        888                    |        /|\\\n"
                + "888        888                    |        / \\\n"
                + "888        888                    |\n"
                + "8888888888 888                  __|__\n"
                + "\n"
                + "\n"
                + "         888                                             888\n"
                + "         888                                             888\n"
                + "         888                                             888\n"
                + " 8888b.  88888b.   .d88b.  888d888 .d8888b  8888b.   .d88888  .d88b.\n"
                + "    '88b 888 '88b d88''88b 888P'  d88P'        '88b d88' 888 d88''8b\n"
                + ".d888888 888  888 888  888 888    888      .d888888 888  888 888  888\n"
                + "888  888 888  888 Y88..88P 888    Y88b.    888  888 Y88b 888 Y88..88P\n"
                + "'Y888888 888  888  'Y88P'  888     'Y8888P' Y888888  'Y88888  'Y88P\n"
                + "\n"
                + "");
    }

    public static void adios() {
        System.out.println("""
                                                          888
                                                          888  O                     
                                                          888                      
                                             8888b.   .d88888 d8b  .d88b.    .d8888
                                                "88b d88" 888 888 d88""88b  88
                                            .d888888 888  888 888 888  888  "8888b.
                                            888  888 Y88b 888 888 Y88..88P       88
                                            "Y888888  "Y88888 888  "Y88P"   888888"                           
                           """);
    }

    public static void dibujarHorca(int intentos) {
        String[] horca = {
            """
            
                     __________
                    |         |
                    |         0
                    |        /|\\
                    |        / \\
                    |
                  __|__
            """,
            """
            
                     __________
                    |         |
                    |         0
                    |        /|
                    |        / \\
                    |
                  __|__
            """,
            """
            
                     __________
                    |         |
                    |         0
                    |         |
                    |        / \\
                    |
                  __|__
            """,
            """
            
                     __________
                    |         |
                    |         0
                    |         |
                    |        / 
                    |
                  __|__
            """,
            """
            
                     __________
                    |         |
                    |         0
                    |         |
                    |         
                    |
                  __|__
            """,
            """
            
                     __________
                    |         |
                    |         0
                    |        
                    |         
                    |
                  __|__
            """,
            """
            
                     __________
                    |         |
                    |         
                    |        
                    |        
                    |
                  __|__
            """
        };
        System.out.println(horca[intentos]);
    }
}
