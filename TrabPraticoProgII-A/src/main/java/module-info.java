module com.example.trabpraticoprogiia {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.trabpraticoprogiia to javafx.fxml;
    exports com.example.trabpraticoprogiia;
}