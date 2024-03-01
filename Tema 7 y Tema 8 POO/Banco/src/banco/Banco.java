/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void mostrarMenu() {
        System.out.println("Elije una opción:");
        System.out.println("1. Datos de la cuenta.");
        System.out.println("2. IBAN.");
        System.out.println("3. Titular.");
        System.out.println("4. Saldo.");
        System.out.println("5. Ingreso.");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos.");
        System.out.println("8. Salir.");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double cantidad;
        String iban;
        String titular;
        Cuenta cuenta;

        do {
            System.out.print("Introduce el número IBAN:");
            iban = teclado.nextLine();
            System.out.print("Introduce el titular de la cuenta: ");
            titular = teclado.nextLine();
            cuenta = new Cuenta(iban, titular);
        }
        while(!cuenta.getValida());
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    cuenta.imprimirDatos();
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo en cuenta: " + cuenta.getSaldo());
                    break;
                case 5:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    cantidad = teclado.nextDouble();
                    if (cuenta.ingresar(cantidad)) {
                        System.out.println("Ingreso: Correcto");
                    }
                    else {
                        System.err.println("Ingreso: ERROR");
                    }
                    break;
                case 6:
                    System.out.print("Introduce la cantidad a retirar: ");
                    cantidad = teclado.nextDouble();
                    if (cuenta.retirar(cantidad)) {
                        System.out.println("Retirar: Correcto");
                    }
                    else {
                        System.err.println("Retirar: ERROR");
                    }
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Acaba");
                    break;
                default:
                    System.err.println("No valido, introduce de nuevo.");
            }
        } while (opcion != 8);
        
        teclado.close();
    }

}
