module es.sequeros.ejemplosegundo {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.ejemplosegundo to javafx.fxml;
    exports es.sequeros.ejemplosegundo;
}
