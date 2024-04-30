package es.sequeros.ejemplosegundo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import javafx.scene.control.Button;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public void start(Stage stage) {
        Circle cara = new Circle (125,125,80);
        cara.setFill(Color.YELLOW);
        cara.setStroke(Color.RED);
        
        Circle ojoDerecho = new Circle(86, 100, 10);
        ojoDerecho.setFill(Color.RED);
        ojoDerecho.setStroke(Color.BLUE);
        
        Circle ojoIzquierdo = new Circle(162, 100, 10);
        ojoIzquierdo.setFill(Color.RED);
        ojoIzquierdo.setStroke(Color.BLUE);
        
        Arc boca = new Arc(125,150,45,35,0,-180);
        boca.setFill(Color.YELLOW);
        boca.setStroke(Color.BLUE);
        boca.setType(ArcType.OPEN);
        
        Group caraSonriente = new Group(cara, ojoDerecho, ojoIzquierdo, boca);
        
        Scene scene = new Scene(caraSonriente, 250, 275, Color.YELLOW);
        
        stage.setScene(scene);
        
        stage.setTitle("Cara Sonriente");
        
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}