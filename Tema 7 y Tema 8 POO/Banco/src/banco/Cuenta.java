/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import static java.lang.Math.abs;
/**
 *
 * @author natgonmer
 */
public class Cuenta {

    private final String iban;
    private final String titular;

    private double saldo;
    private double[] movimientos;
    private int nMovimientos;

    private static final int MaxMov = 100;
    private static final double SaldoMin = -50.0;
    private static final double Aviso = 3000.0;

    private boolean valida;

    public Cuenta(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;

        this.saldo = 0.0;
        this.movimientos = new double[MaxMov];
        this.nMovimientos = 0;
        if (!iban.matches("^[A-Z]{2}\\d{22}")) {
            System.err.println("ERROR: el formato del IBAN no es correcto");
            this.valida = false;
        } else {
            this.valida = true;
        }
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getValida() {
        return valida;
    }

    public boolean ingresar(double cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        return operar(cantidad);
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        return operar(-cantidad);
    }
    private boolean operar (double cantidad) {
        if ((saldo + cantidad < SaldoMin) || (nMovimientos >= MaxMov)) {
            return false;
        }
        
        saldo += cantidad;
        movimientos[nMovimientos] = cantidad;
        nMovimientos++;
        
        if (saldo < 0.0) {
            System.err.println("AVISO: Saldo negativo");
        }
        if (abs(cantidad) > Aviso) {
            System.err.println("AVISO: Notificar a Hacienda");
        }
        
        return true;
    }
    
    public void imprimirDatos() {
        System.out.println("IBAN: " + getIban() + " - Titular: " + getTitular() + " - Saldo: " +getSaldo() );
    }

}
