module com.example._5_radiobutton {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._5_radiobutton to javafx.fxml;
    exports com.example._5_radiobutton;
}