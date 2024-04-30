package es.sequeros.controlsizecirculo_nathan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.MouseButton;

import java.io.IOException;
import javafx.geometry.Pos;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        StackPane pane = new StackPane();
        Circle circle = new Circle(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btAumentar = new Button("Aumentar");
        Button btDisminuir = new Button("Disminuir");
        hBox.getChildren().add(btAumentar);
        hBox.getChildren().add(btDisminuir);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        borderPane.setAlignment(hBox, Pos.CENTER);
        
        Scene scene = new Scene(borderPane, 350, 250);
        primaryStage.setTitle("Control de Circulo - Nathan");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btAumentar.setOnAction(click -> incremento(circle));
        btDisminuir.setOnAction(click -> decrecimiento(circle));
        
        circle.setOnMouseClicked(clickRaton -> {
            if (clickRaton.getButton() == MouseButton.PRIMARY) {
                incremento(circle);
            } else if (clickRaton.getButton() == MouseButton.SECONDARY) {
                decrecimiento(circle);
            }
        });
    }
    
    private void incremento(Circle circle) {
        circle.setRadius(circle.getRadius() + 10);
    }
    
    private void decrecimiento(Circle circle) {
        if (circle.getRadius() > 10) {
            circle.setRadius(circle.getRadius() - 10);
        }
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}