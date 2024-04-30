module es.sequeros.eventosraton01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.sequeros.eventosraton01 to javafx.fxml;
    exports es.sequeros.eventosraton01;
}
