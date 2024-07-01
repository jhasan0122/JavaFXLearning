module com.example._23_progressbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._23_progressbar to javafx.fxml;
    exports com.example._23_progressbar;
}