module es.sequeros.tresenraya_nathan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.sequeros.tresenraya_nathan to javafx.fxml;
    exports es.sequeros.tresenraya_nathan;
}
