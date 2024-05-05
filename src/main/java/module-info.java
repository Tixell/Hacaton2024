module com.example.hacaton2024 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.hacaton2024 to javafx.fxml;
    exports com.example.hacaton2024;
}