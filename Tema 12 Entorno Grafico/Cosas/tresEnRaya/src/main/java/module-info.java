module es.sequeros.tresenraya {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.sequeros.tresenraya to javafx.fxml;
    exports es.sequeros.tresenraya;
}
