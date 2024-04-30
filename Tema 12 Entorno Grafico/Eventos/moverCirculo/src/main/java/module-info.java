module es.sequeros.movercirculo {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.movercirculo to javafx.fxml;
    exports es.sequeros.movercirculo;
}
