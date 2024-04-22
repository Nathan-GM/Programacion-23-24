module es.sequeros.temp {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.temp to javafx.fxml;
    exports es.sequeros.temp;
}
