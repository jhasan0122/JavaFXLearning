module com.example._11_mouseevent {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._11_mouseevent to javafx.fxml;
    exports com.example._11_mouseevent;
}