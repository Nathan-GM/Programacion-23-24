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
    private void anyadirSiete(ActionEvent event) {
        if (error()) {
            pantalla.setText(numSiete.getText());
        } else {
            pantalla.setText(pantalla.getText() + numSiete.getText());
        }
    }

    @FXML
    private void anyadirOcho(ActionEvent event) {
        if (error()) {
            pantalla.setText(numOcho.getText());
        } else {
            pantalla.setText(pantalla.getText() + numOcho.getText());
        }

    }

    @FXML
    private void anyadirNueve(ActionEvent event) {
        if (error()) {
            pantalla.setText(numNueve.getText());
        } else {
            pantalla.setText(pantalla.getText() + numNueve.getText());
        }

    }

    @FXML
    private void anyadirCuatro(ActionEvent event) {
        if (error()) {
            pantalla.setText(numCuatro.getText());
        } else {
            pantalla.setText(pantalla.getText() + numCuatro.getText());
        }
    }

    @FXML
    private void anyadirCinco(ActionEvent event) {
        if (error()) {
            pantalla.setText(numCinco.getText());
        } else {
            pantalla.setText(pantalla.getText() + numCinco.getText());
        }
    }

    @FXML
    private void anyadirSeis(ActionEvent event) {
        if (error()) {
            pantalla.setText(numSeis.getText());
        } else {
            pantalla.setText(pantalla.getText() + numSeis.getText());
        }
    }

    @FXML
    private void anyadirUno(ActionEvent event) {
        if (error()) {
            pantalla.setText(numUno.getText());
        } else {
            pantalla.setText(pantalla.getText() + numUno.getText());
        }
    }

    @FXML
    private void anyadirDos(ActionEvent event) {
        if (error()) {
            pantalla.setText(numDos.getText());
        } else {
            pantalla.setText(pantalla.getText() + numDos.getText());
        }
    }

    @FXML
    private void anyadirTres(ActionEvent event) {
        if (error()) {
            pantalla.setText(numTres.getText());
        } else {
            pantalla.setText(pantalla.getText() + numTres.getText());
        }
    }

    @FXML
    private void anyadirCero(ActionEvent event) {
        if (error()) {
            pantalla.setText(numCero.getText());
        } else {
            pantalla.setText(pantalla.getText() + numCero.getText());
        }
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
        num2 = Double.parseDouble(pantalla.getText());
        if (operacion == "/" && num2 == 0) {
            pantalla.setText("ERR");
        } else {
            String resultado = "" + operacion(num1, num2, operacion);
            pantalla.setText(resultado);
        }

    }

    @FXML
    private void operacionSumar(ActionEvent event) {
        num1 = Double.parseDouble(pantalla.getText());
        //pantalla.setText(pantalla.getText() + botonSumar.getText());
        operacion = "+";
        pantalla.setText("");
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
        num1 = Double.parseDouble(pantalla.getText());
        operacion = "/";
        pantalla.setText("");
    }

    @FXML
    private void operacionMultiplicar(ActionEvent event) {
        num1 = Double.parseDouble(pantalla.getText());
        operacion = "X";
        pantalla.setText("");
    }

    @FXML
    private void operacionRestar(ActionEvent event) {
        num1 = Double.parseDouble(pantalla.getText());
        operacion = "-";
        pantalla.setText("");
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

}
