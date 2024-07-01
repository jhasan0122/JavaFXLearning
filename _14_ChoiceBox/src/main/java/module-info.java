module com.example._14_choicebox {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._14_choicebox to javafx.fxml;
    exports com.example._14_choicebox;
}