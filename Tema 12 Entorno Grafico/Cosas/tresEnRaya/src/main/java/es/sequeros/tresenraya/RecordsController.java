/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.tresenraya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Natha
 */
public class RecordsController implements Initializable {

    @FXML
    private Button secondaryButton;
    @FXML
    private Text dJ1;
    @FXML
    private Text vJ1;
    @FXML
    private Text dJ2;
    @FXML
    private Text vJ2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            actualizarDatos();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void switchToGame(ActionEvent event) throws IOException {
        App.setRoot("tresEnRaya");
    }

    private void actualizarDatos() throws IOException {
        File f = new File("./src/main/resources/es/sequeros/tresenraya/records.txt");
        if (f.exists() == false) {
            f.createNewFile();
            FileWriter escritor = new FileWriter(f, false);
            escritor.write("jugador1");
            escritor.write(",");
            escritor.write("" + 0);
            escritor.write(",");
            escritor.write("" + 0);
            escritor.write("\n");
            escritor.write("jugador2");
            escritor.write(",");
            escritor.write("" + 0);
            escritor.write(",");
            escritor.write("" + 0);
            escritor.close();
        }
        Scanner leer = new Scanner(f);
        int i = 1;
        while (leer.hasNext()) {
            String lineaActual = leer.nextLine();
            String[] datos = lineaActual.split(",");
            int victorias = Integer.parseInt(datos[1]);
            int derrotas = Integer.parseInt(datos[2]);
            if (i == 1) {
                vJ1.setText("" + victorias);
                dJ1.setText("" + derrotas);
                i++;
            } else {
                vJ2.setText("" + victorias);
                dJ2.setText("" + derrotas);
            }

        }
    }

}
