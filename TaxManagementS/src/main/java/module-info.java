module com.example.taxmaneger {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.taxmaneger to javafx.fxml;
    exports com.example.taxmaneger;
}