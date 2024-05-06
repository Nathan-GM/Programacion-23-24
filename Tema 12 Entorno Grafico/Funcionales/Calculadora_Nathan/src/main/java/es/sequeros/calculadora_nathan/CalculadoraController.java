/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.calculadora_nathan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Natha
 */
public class CalculadoraController implements Initializable {

    double num1 = 0;
    double num2 = 0;
    String operacion;

    @FXML
    private Button numSiete;
    @FXML
    private Button numOcho;
    @FXML
    private Button numNueve;
    @FXML
    private Button numCuatro;
    @FXML
    private Button numCinco;
    @FXML
    private Button numSeis;
    @FXML
    private Button numUno;
    @FXML
    private Button numDos;
    @FXML
    private Button numTres;
    @FXML
    private Button numCero;
    @FXML
    private TextField pantalla;
    @FXML
    private Button botonIgual;
    @FXML
    private Button botonSumar;
    @FXML
    private Button borrado;
    @FXML
    private Button botonDividir;
    @FXML
    private Button botonMultiplicar;
    @FXML
    private Button botonRestar;
    @FXML
    private Button botonComa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void anyadirDecimales(ActionEvent event) {
        if (error() || pantalla.getText().isEmpty()) {
            pantalla.setText(numCero.getText() + botonComa.getText());
        } else {
            pantalla.setText(pantalla.getText() + botonComa.getText());
        }
    }

    @FXML
    private void resolver(ActionEvent event) {
        try {
            num2 = Double.parseDouble(pantalla.getText());
            if (operacion == "/" && num2 == 0) {
                pantalla.setText("ERR");
            } else {
                String resultado = "" + operacion(num1, num2, operacion);
                pantalla.setText(resultado);
            }
        } catch (NumberFormatException e) {
            pantalla.setText("ERR");
        }
    }

    @FXML
    private void operacionSumar(ActionEvent event) {
        try {
            num1 = Double.parseDouble(pantalla.getText());
            //pantalla.setText(pantalla.getText() + botonSumar.getText());
            operacion = "+";
            pantalla.setText("");
        } catch (NumberFormatException e) {
            pantalla.setText("ERR");
        }
    }

    @FXML
    private void borrarTodo(ActionEvent event) {
        pantalla.setText("");
        num1 = 0;
        num2 = 0;
        operacion = "";
    }

    @FXML
    private void operacionDivision(ActionEvent event) {
        try {
            num1 = Double.parseDouble(pantalla.getText());
            operacion = "/";
            pantalla.setText("");
        } catch (NumberFormatException e) {
            pantalla.setText("ERR");
        }
    }

    @FXML
    private void operacionMultiplicar(ActionEvent event) {
        try {
            num1 = Double.parseDouble(pantalla.getText());
            operacion = "X";
            pantalla.setText("");
        } catch (NumberFormatException e) {
            pantalla.setText("ERR");
        }
    }

    @FXML
    private void operacionRestar(ActionEvent event) {
        try {
            num1 = Double.parseDouble(pantalla.getText());
            operacion = "-";
            pantalla.setText("");
        } catch (NumberFormatException e) {
            pantalla.setText("ERR");
        }
    }

    public double operacion(double num1, double num2, String operacion) {
        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "X":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }

    public boolean error() {
        if (pantalla.getText().equals("ERR")) {
            return true;
        } else {
            return false;
        }
    }

    @FXML
    /**
     * Agregará los numeros a la pantalla en base al boton pulsado Se tendrá en
     * cuenta si anteriormente la pantalla mostró error Y en caso de haberlo
     * mostrado, se vaciara la pantalla y se introducira ese boton.
     */
    private void anyadirNum(ActionEvent event) {
        String n = ((Button) event.getSource()).getText();
        if (!error()) {
            switch (n) {
                case "0":
                    pantalla.setText(pantalla.getText() + numCero.getText());
                    break;
                case "1":
                    pantalla.setText(pantalla.getText() + numUno.getText());
                    break;
                case "2":
                    pantalla.setText(pantalla.getText() + numDos.getText());
                    break;
                case "3":
                    pantalla.setText(pantalla.getText() + numTres.getText());
                    break;
                case "4":
                    pantalla.setText(pantalla.getText() + numCuatro.getText());
                    break;
                case "5":
                    pantalla.setText(pantalla.getText() + numCinco.getText());
                    break;
                case "6":
                    pantalla.setText(pantalla.getText() + numSeis.getText());
                    break;
                case "7":
                    pantalla.setText(pantalla.getText() + numSiete.getText());
                    break;
                case "8":
                    pantalla.setText(pantalla.getText() + numOcho.getText());
                    break;
                case "9":
                    pantalla.setText(pantalla.getText() + numNueve.getText());
                    break;
            }
        } else {
            switch (n) {
                case "0":
                    pantalla.setText(numCero.getText());
                    break;
                case "1":
                    pantalla.setText(numUno.getText());
                    break;
                case "2":
                    pantalla.setText(numDos.getText());
                    break;
                case "3":
                    pantalla.setText(numTres.getText());
                    break;
                case "4":
                    pantalla.setText(numCuatro.getText());
                    break;
                case "5":
                    pantalla.setText(numCinco.getText());
                    break;
                case "6":
                    pantalla.setText(numSeis.getText());
                    break;
                case "7":
                    pantalla.setText(numSiete.getText());
                    break;
                case "8":
                    pantalla.setText(numOcho.getText());
                    break;
                case "9":
                    pantalla.setText(numNueve.getText());
                    break;
            }
        }

    }

}
