module es.sequeros.ejerciciologin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.sequeros.ejerciciologin to javafx.fxml;
    exports es.sequeros.ejerciciologin;
}
