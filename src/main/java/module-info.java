module com.example.gestaoimo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.gestaoimo to javafx.fxml;
    exports com.example.gestaoimo;
}