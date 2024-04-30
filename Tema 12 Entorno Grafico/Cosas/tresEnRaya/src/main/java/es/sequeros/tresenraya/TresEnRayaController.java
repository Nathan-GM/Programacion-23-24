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
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * FXML Controller class
 *
 * @author Natha
 */
public class TresEnRayaController implements Initializable {

    boolean j1 = false;
    boolean j2 = false;

    @FXML
    private Button boton1;
    @FXML
    private Button boton2;
    @FXML
    private Button boton3;
    @FXML
    private Button boton4;
    @FXML
    private Button boton7;
    @FXML
    private Button boton5;
    @FXML
    private Button boton8;
    @FXML
    private Button boton6;
    @FXML
    private Button boton9;
    @FXML
    private Text turnoJugador1;
    @FXML
    private Button inicio;
    @FXML
    private Button record;
    @FXML
    private Text turnoJugador2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void iniciar(ActionEvent event) {
        j1 = true;
        turnoJugador1.setText("Tu Turno (X)");
        boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");
        boton7.setText("");
        boton8.setText("");
        boton9.setText("");
    }

    @FXML
    private void pantallaRecords(ActionEvent event) throws IOException {
        App.setRoot("records");
    }

    @FXML
    private void seleccionarb1(ActionEvent event) {
        boolean usada = false;
        if (boton1.getText().equals("X") || boton1.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton1.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton1.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb2(ActionEvent event) {
        boolean usada = false;
        if (boton2.getText().equals("X") || boton2.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton2.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton2.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb3(ActionEvent event) {
        boolean usada = false;
        if (boton3.getText().equals("X") || boton3.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton3.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton3.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb4(ActionEvent event) {
        boolean usada = false;
        if (boton4.getText().equals("X") || boton4.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton4.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                j1 = false;
                j2 = false;
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton4.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb7(ActionEvent event) {
        boolean usada = false;
        if (boton7.getText().equals("X") || boton7.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton7.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                j1 = false;
                j2 = false;
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton7.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb5(ActionEvent event) {
        boolean usada = false;
        if (boton5.getText().equals("X") || boton5.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton5.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton5.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb8(ActionEvent event) {
        boolean usada = false;
        if (boton8.getText().equals("X") || boton8.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton8.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton8.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb6(ActionEvent event) {
        boolean usada = false;
        if (boton6.getText().equals("X") || boton6.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton6.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton6.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }
        }
    }

    @FXML
    private void seleccionarb9(ActionEvent event) {
        boolean usada = false;
        if (boton9.getText().equals("X") || boton9.getText().equals("O")) {
            usada = true;
        }
        if (j1 == true && usada == false) {
            boton9.setText("X");
            j2 = true;
            j1 = false;
            if (!comprobarVictoriaJ1()) {
                turnoJugador1.setText("");
                turnoJugador2.setText("Tu Turno (O)");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 1");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ1();
            }
        } else if (j2 == true && usada == false) {
            boton9.setText("O");
            j2 = false;
            j1 = true;
            if (!comprobarVictoriaJ2()) {
                turnoJugador1.setText("Tu turno (X)");
                turnoJugador2.setText("");
            } else {
                boton1.setText("");
                boton2.setText("");
                boton3.setText("");
                boton4.setText("HA");
                boton5.setText("GANADO");
                boton6.setText("JUGADOR 2");
                boton7.setText("");
                boton8.setText("");
                boton9.setText("");
                turnoJugador1.setText("");
                turnoJugador2.setText("");
                j1 = false;
                j2 = false;
                actualizarDatosVJ2();
            }

        }
    }

    private boolean comprobarVictoriaJ1() {
        boolean gana = false;
        // 123
        if (boton1.getText().equals("X") && boton2.getText().equals("X") && boton3.getText().equals("X")) {
            gana = true;
        } // 147
        else if (boton1.getText().equals("X") && boton4.getText().equals("X") && boton7.getText().equals("X")) {
            gana = true;
        } // 159
        else if (boton1.getText().equals("X") && boton5.getText().equals("X") && boton9.getText().equals("X")) {
            gana = true;
        } // 258
        else if (boton2.getText().equals("X") && boton5.getText().equals("X") && boton8.getText().equals("X")) {
            gana = true;
        } // 369
        else if (boton3.getText().equals("X") && boton6.getText().equals("X") && boton9.getText().equals("X")) {
            gana = true;
        } // 456
        else if (boton4.getText().equals("X") && boton5.getText().equals("X") && boton6.getText().equals("X")) {
            gana = true;
        } // 789
        else if (boton7.getText().equals("X") && boton8.getText().equals("X") && boton9.getText().equals("X")) {
            gana = true;
        } // 753
        else if (boton7.getText().equals("X") && boton5.getText().equals("X") && boton3.getText().equals("X")) {
            gana = true;
        }
        return gana;
    }

    private boolean comprobarVictoriaJ2() {
        boolean gana = false;
        // 123
        if (boton1.getText().equals("O") && boton2.getText().equals("O") && boton3.getText().equals("O")) {
            gana = true;
        } // 147
        else if (boton1.getText().equals("O") && boton4.getText().equals("O") && boton7.getText().equals("O")) {
            gana = true;
        } // 159
        else if (boton1.getText().equals("O") && boton5.getText().equals("O") && boton9.getText().equals("O")) {
            gana = true;
        } // 258
        else if (boton2.getText().equals("O") && boton5.getText().equals("O") && boton8.getText().equals("O")) {
            gana = true;
        } // 369
        else if (boton3.getText().equals("O") && boton6.getText().equals("O") && boton9.getText().equals("O")) {
            gana = true;
        } // 456
        else if (boton4.getText().equals("O") && boton5.getText().equals("O") && boton6.getText().equals("O")) {
            gana = true;
        } // 789
        else if (boton7.getText().equals("O") && boton8.getText().equals("O") && boton9.getText().equals("O")) {
            gana = true;
        } // 753
        else if (boton7.getText().equals("O") && boton5.getText().equals("O") && boton3.getText().equals("O")) {
            gana = true;
        }
        return gana;
    }

    private void actualizarDatosVJ1() {
        File f = new File("./src/main/resources/es/sequeros/tresenraya/records.txt");
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
        int victoriasActualesJ1 = 0;
        int derrotasActualesJ1 = 0;
        int victoriasActualesJ2 = 0;
        int derrotasActualesJ2 = 0;
        try {
            Scanner lector = new Scanner(f);
            int i = 1;
            while (lector.hasNext()) {
                String lineaActual = lector.nextLine();
                String[] datos = lineaActual.split(",");
                int victorias = Integer.parseInt(datos[1]);
                int derrotas = Integer.parseInt(datos[2]);
                if (i == 1) {
                    victoriasActualesJ1 = victorias;
                    derrotasActualesJ1 = derrotas;
                    i++;
                } else {
                    victoriasActualesJ2 = victorias;
                    derrotasActualesJ2 = derrotas;
                }

            }
        } catch (IOException error) {
            error.getMessage();
        }
        victoriasActualesJ1 = victoriasActualesJ1 + 1;
        derrotasActualesJ2 = derrotasActualesJ2 + 1;
        try {
            FileWriter escritor = new FileWriter(f, false);
            escritor.write("jugador1");
            escritor.write(",");
            escritor.write("" + victoriasActualesJ1);
            escritor.write(",");
            escritor.write("" + derrotasActualesJ1);
            escritor.write("\n");
            escritor.write("jugador2");
            escritor.write(",");
            escritor.write("" + victoriasActualesJ2);
            escritor.write(",");
            escritor.write("" + derrotasActualesJ2);
            escritor.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void actualizarDatosVJ2() {
        File f = new File("./src/main/resources/es/sequeros/tresenraya/records.txt");
        if (!f.exists()) {
            FileWriter creador;
            try {
                creador = new FileWriter(f, false);
                creador.write("jugador1");
                creador.write(",");
                creador.write("" + 0);
                creador.write(",");
                creador.write("" + 0);
                creador.write("\n");
                creador.write("jugador2");
                creador.write(",");
                creador.write("" + 0);
                creador.write(",");
                creador.write("" + 0);
                creador.close();
            } catch (IOException ex) {
                ex.getMessage();
            }

        }
        int victoriasActualesJ1 = 0;
        int derrotasActualesJ1 = 0;
        int victoriasActualesJ2 = 0;
        int derrotasActualesJ2 = 0;
        try {
            Scanner lector = new Scanner(f);
            int i = 1;
            while (lector.hasNext()) {
                String lineaActual = lector.nextLine();
                String[] datos = lineaActual.split(",");
                int victorias = Integer.parseInt(datos[1]);
                int derrotas = Integer.parseInt(datos[2]);
                if (i == 1) {
                    victoriasActualesJ1 = victorias;
                    derrotasActualesJ1 = derrotas;
                    i++;
                } else {
                    victoriasActualesJ2 = victorias;
                    derrotasActualesJ2 = derrotas;
                }

            }
        } catch (IOException error) {
            error.getMessage();
        }
        victoriasActualesJ2 = victoriasActualesJ2 + 1;
        derrotasActualesJ1 = derrotasActualesJ1 + 1;
        try {
            FileWriter escritor = new FileWriter(f, false);
            escritor.write("jugador1");
            escritor.write(",");
            escritor.write("" + victoriasActualesJ1);
            escritor.write(",");
            escritor.write("" + derrotasActualesJ1);
            escritor.write("\n");
            escritor.write("jugador2");
            escritor.write(",");
            escritor.write("" + victoriasActualesJ2);
            escritor.write(",");
            escritor.write("" + derrotasActualesJ2);
            escritor.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
