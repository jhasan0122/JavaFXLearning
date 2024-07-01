module com.example._18_export_jar_file {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._18_export_jar_file to javafx.fxml;
    exports com.example._18_export_jar_file;
}