/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.ejercicio4convertidor_nathan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.util.converter.NumberStringConverter;
import javafx.fxml.FXML;
import javafx.beans.binding.Bindings;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import static java.lang.String.format;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author natgonmer
 */
public class ConvertidorController implements Initializable {

    @FXML
    private Slider slider;
    @FXML
    private Text textoConversion;
    @FXML
    private TextField input;
    @FXML
    private TextField output;
    @FXML
    private CheckBox automatica;
    @FXML
    private Button convertir;
    @FXML
    private Button limpiar;
    @FXML
    private Text textoConversionVerde;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //limpiar valores
        limpiar.setOnAction(e -> {
            output.setText("");
            input.setText("");
            input.setPromptText("");
            slider.setValue(0);
        });

        //Asignar el número del slider
        textoConversionVerde.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
        slider.valueProperty().addListener(
                (observable, oldVal, newVal) -> {
                    Double aux = (Double) newVal;
                    textoConversion.setText(format("%.2f", Math.round(aux * 100.0) / 100.0));
                    if (automatica.isSelected()) {
                        hacerCalculos();
                    }
                });

        //Realizar calculos
        convertir.setOnAction(e -> {
            if (input.getText().isEmpty()) {
                input.setPromptText("Introduce un numero");
            }
            hacerCalculos();
        });
        
                //indicamos que se deshabilite el convertir si automatico esta marcado.
        automatica.setOnAction(e -> {
            if (automatica.isSelected()) {
                convertir.setDisable(true);
            } else {
                convertir.setDisable(false);
            }
        });

    }


    private void hacerCalculos() {
        try {
            double num1 = Double.parseDouble(input.getText().replace(",", "."));
            double num2 = Double.parseDouble(textoConversion.getText().replace(",", "."));
            double resultado = num1 * num2;
            output.setText(format("%.2f", Math.round(resultado * 100.0) / 100.0));
        } catch (NumberFormatException error) {
            input.setText("");
            input.setPromptText("Introduce un número");
        }
    }

}
