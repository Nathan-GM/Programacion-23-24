/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.tresenraya_nathan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Natha
 */
public class PrimaryController implements Initializable {

    @FXML
    private Button btUno;
    @FXML
    private Button btCuatro;
    @FXML
    private Button btDos;
    @FXML
    private Button btTres;
    @FXML
    private Button btCinco;
    @FXML
    private Button btSeis;
    @FXML
    private Button btSiete;
    @FXML
    private Button btOcho;
    @FXML
    private Button btNueve;
    @FXML
    private Text temp;
    @FXML
    private Button btLimpiar;
    @FXML
    private Button btIniciar;
    @FXML
    private Text J1;
    @FXML
    private Text J2;

    boolean jugadorUno;

    boolean noGanador;
    @FXML
    private Text vJ1;
    @FXML
    private Text dJ1;
    @FXML
    private Text vJ2;
    @FXML
    private Text dJ2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            cargarDatos();
        } catch (IOException e) {
            e.getMessage();
        }
        noGanador = true;
        btIniciar.setOnAction(inicio -> {
            btUno.setText("");
            btDos.setText("");
            btTres.setText("");
            btCuatro.setText("");
            btCinco.setText("");
            btSeis.setText("");
            btSiete.setText("");
            btOcho.setText("");
            btNueve.setText("");
            //temp.setVisible(false);
            temp.setText("Verde jugador actual.");
            J1.setFill(Color.GREEN);
            jugadorUno = true;
            noGanador = false;
        });

        btLimpiar.setOnAction(limpieza -> {
            btUno.setText("");
            btDos.setText("");
            btTres.setText("");
            btCuatro.setText("");
            btCinco.setText("");
            btSeis.setText("");
            btSiete.setText("");
            btOcho.setText("");
            btNueve.setText("");
            J1.setFill(Color.BLACK);
            J2.setFill(Color.BLACK);
            noGanador = true;
            temp.setText("Pulsa Iniciar para empezar a Jugar");
        });
    }

    @FXML
    private void jugar(ActionEvent event) {
        String botonPulsado = ((Button) event.getSource()).getId();
        if (!noGanador) {
            if (jugadorUno) {
                switch (botonPulsado) {
                    case "btUno":
                        if (btUno.getText() == "") {
                            btUno.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btDos":
                        if (btDos.getText() == "") {
                            btDos.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btTres":
                        if (btTres.getText() == "") {
                            btTres.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btCuatro":
                        if (btCuatro.getText() == "") {
                            btCuatro.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btCinco":
                        if (btCinco.getText() == "") {
                            btCinco.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btSeis":
                        if (btSeis.getText() == "") {
                            btSeis.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btSiete":
                        if (btSiete.getText() == "") {
                            btSiete.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btOcho":
                        if (btOcho.getText() == "") {
                            btOcho.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                    case "btNueve":
                        if (btNueve.getText() == "") {
                            btNueve.setText("X");
                            J1.setFill(Color.BLACK);
                            J2.setFill(Color.GREEN);
                            jugadorUno = false;
                            ganaJugadorUno();
                        }
                        break;
                }
            } else {
                switch (botonPulsado) {
                    case "btUno":
                        if (btUno.getText() == "") {
                            btUno.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btDos":
                        if (btDos.getText() == "") {
                            btDos.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btTres":
                        if (btTres.getText() == "") {
                            btTres.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btCuatro":
                        if (btCuatro.getText() == "") {
                            btCuatro.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btCinco":
                        if (btCinco.getText() == "") {
                            btCinco.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btSeis":
                        if (btSeis.getText() == "") {
                            btSeis.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btSiete":
                        if (btSiete.getText() == "") {
                            btSiete.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btOcho":
                        if (btOcho.getText() == "") {
                            btOcho.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                    case "btNueve":
                        if (btNueve.getText() == "") {
                            btNueve.setText("O");
                            J1.setFill(Color.GREEN);
                            J2.setFill(Color.BLACK);
                            jugadorUno = true;
                            ganaJugadorDos();
                        }
                        break;
                }
            }
        }
        empate();
    }

    private boolean comprobarGanadorJ1() {
        boolean gana = false;
        //123
        if (btUno.getText().equals("X") && btDos.getText().equals("X") && btTres.getText().equals("X")) {
            gana = true;
        } //147 
        else if (btUno.getText().equals("X") && btCuatro.getText().equals("X") && btSiete.getText().equals("X")) {
            gana = true;
        }//159
        else if (btUno.getText().equals("X") && btCinco.getText().equals("X") && btNueve.getText().equals("X")) {
            gana = true;
        } //258
        else if (btDos.getText().equals("X") && btCinco.getText().equals("X") && btOcho.getText().equals("X")) {
            gana = true;
        } //369
        else if (btTres.getText().equals("X") && btSeis.getText().equals("X") && btNueve.getText().equals("X")) {
            gana = true;
        } //456
        else if (btCuatro.getText().equals("X") && btCinco.getText().equals("X") && btSeis.getText().equals("X")) {
            gana = true;
        } //789
        else if (btSiete.getText().equals("X") && btOcho.getText().equals("X") && btNueve.getText().equals("X")) {
            gana = true;
        } //753
        else if (btSiete.getText().equals("X") && btCinco.getText().equals("X") && btTres.getText().equals("X")) {
            gana = true;
        }

        return gana;
    }

    private boolean comprobarGanadorJ2() {
        boolean gana = false;
        //123
        if (btUno.getText().equals("O") && btDos.getText().equals("O") && btTres.getText().equals("O")) {
            gana = true;
        }//147
        else if (btUno.getText().equals("O") && btCuatro.getText().equals("O") && btSiete.getText().equals("O")) {
            gana = true;
        } //159
        else if (btUno.getText().equals("O") && btCinco.getText().equals("O") && btNueve.getText().equals("O")) {
            gana = true;
        } //258
        else if (btDos.getText().equals("O") && btCinco.getText().equals("O") && btOcho.getText().equals("O")) {
            gana = true;
        } //369
        else if (btTres.getText().equals("O") && btSeis.getText().equals("O") && btNueve.getText().equals("O")) {
            gana = true;
        } //456
        else if (btCuatro.getText().equals("O") && btCinco.getText().equals("O") && btSeis.getText().equals("O")) {
            gana = true;
        } //789
        else if (btSiete.getText().equals("O") && btOcho.getText().equals("O") && btNueve.getText().equals("O")) {
            gana = true;
        } //753
        else if (btSiete.getText().equals("O") && btCinco.getText().equals("O") && btTres.getText().equals("O")) {
            gana = true;
        }
        return gana;
    }

    private void ganaJugadorUno() {
        if (comprobarGanadorJ1()) {
            btUno.setText("");
            btDos.setText("");
            btTres.setText("");
            btCuatro.setText("HA");
            btCinco.setText("GANADO");
            btSeis.setText("JUGADOR 1");
            btSiete.setText("");
            btOcho.setText("");
            btNueve.setText("");
            temp.setText("Pulsa Iniciar para empezar a Jugar");
            J1.setFill(Color.BLACK);
            J2.setFill(Color.BLACK);
            jugadorUno = false;
            noGanador = true;
            actualizarDatosVJ1();
        }
    }

    private void ganaJugadorDos() {
        if (comprobarGanadorJ2()) {
            btUno.setText("");
            btDos.setText("");
            btTres.setText("");
            btCuatro.setText("HA");
            btCinco.setText("GANADO");
            btSeis.setText("JUGADOR 2");
            btSiete.setText("");
            btOcho.setText("");
            btNueve.setText("");
            temp.setText("Pulsa Iniciar para empezar a Jugar");
            J1.setFill(Color.BLACK);
            J2.setFill(Color.BLACK);
            jugadorUno = false;
            noGanador = true;
            actualizarDatosVJ2();
        }
    }

    private void empate() {
        if (!comprobarGanadorJ1() && !comprobarGanadorJ2()) {
            if (btUno.getText() != "" && btDos.getText() != "" && btTres.getText() != ""
                    && btCuatro.getText() != "" && btCinco.getText() != "" && btSeis.getText() != ""
                    && btSiete.getText() != "" && btOcho.getText() != "" && btNueve.getText() != "") {
                btUno.setText("");
                btDos.setText("");
                btTres.setText("");
                btCuatro.setText("");
                btCinco.setText("EMPATE");
                btSeis.setText("");
                btSiete.setText("");
                btOcho.setText("");
                btNueve.setText("");
                J1.setFill(Color.BLACK);
                J2.setFill(Color.BLACK);
                temp.setText("Pulsa Iniciar para empezar a Jugar");
                jugadorUno = false;
                noGanador = true;
            }
        }
    }

    private void actualizarDatosVJ1() {

        int vAcJ1 = Integer.parseInt(vJ1.getText());
        int dAcJ2 = Integer.parseInt(dJ2.getText());

        vAcJ1++;
        dAcJ2++;
        vJ1.setText("" + vAcJ1);
        dJ2.setText("" + dAcJ2);

        File f = new File("./src/main/resources/es/sequeros/tresenraya_nathan/puntuaciones.txt");
        if (!f.exists()) {
            try {
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
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        int vActualJ1 = 0;
        int dActualJ1 = 0;
        int vActualJ2 = 0;
        int dActualJ2 = 0;

        try {
            Scanner lector = new Scanner(f);
            int i = 1;
            while (lector.hasNext()) {
                String lineaActual = lector.nextLine();
                String[] datos = lineaActual.split(",");
                int victorias = Integer.parseInt(datos[1]);
                int derrotas = Integer.parseInt(datos[2]);
                if (i == 1) {
                    vActualJ1 = victorias;
                    dActualJ1 = derrotas;
                    i++;
                } else {
                    vActualJ2 = victorias;
                    dActualJ2 = derrotas;
                }

            }
        } catch (IOException error) {
            error.getMessage();
        }
        vActualJ1 = vActualJ1 + 1;
        dActualJ2 = dActualJ2 + 1;
        try {
            FileWriter escritor = new FileWriter(f, false);
            escritor.write("jugador1");
            escritor.write(",");
            escritor.write("" + vActualJ1);
            escritor.write(",");
            escritor.write("" + dActualJ1);
            escritor.write("\n");
            escritor.write("jugador2");
            escritor.write(",");
            escritor.write("" + vActualJ2);
            escritor.write(",");
            escritor.write("" + dActualJ2);
            escritor.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private void actualizarDatosVJ2() {

        int vAcJ2 = Integer.parseInt(vJ2.getText());
        int dAcJ1 = Integer.parseInt(dJ1.getText());

        vAcJ2++;
        dAcJ1++;
        vJ2.setText("" + vAcJ2);
        dJ1.setText("" + dAcJ1);

        File f = new File("./src/main/resources/es/sequeros/tresenraya_nathan/puntuaciones.txt");
        if (!f.exists()) {
            try {
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
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        int vActualJ1 = 0;
        int dActualJ1 = 0;
        int vActualJ2 = 0;
        int dActualJ2 = 0;

        try {
            Scanner lector = new Scanner(f);
            int i = 1;
            while (lector.hasNext()) {
                String lineaActual = lector.nextLine();
                String[] datos = lineaActual.split(",");
                int victorias = Integer.parseInt(datos[1]);
                int derrotas = Integer.parseInt(datos[2]);
                if (i == 1) {
                    vActualJ1 = victorias;
                    dActualJ1 = derrotas;
                    i++;
                } else {
                    vActualJ2 = victorias;
                    dActualJ2 = derrotas;
                }

            }
        } catch (IOException error) {
            error.getMessage();
        }
        vActualJ2 = vActualJ2 + 1;
        dActualJ1 = dActualJ1 + 1;
        try {
            FileWriter escritor = new FileWriter(f, false);
            escritor.write("jugador1");
            escritor.write(",");
            escritor.write("" + vActualJ1);
            escritor.write(",");
            escritor.write("" + dActualJ1);
            escritor.write("\n");
            escritor.write("jugador2");
            escritor.write(",");
            escritor.write("" + vActualJ2);
            escritor.write(",");
            escritor.write("" + dActualJ2);
            escritor.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private void cargarDatos() throws IOException {
        File f = new File("./src/main/resources/es/sequeros/tresenraya_nathan/puntuaciones.txt");
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