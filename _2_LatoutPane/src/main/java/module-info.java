module com.example._2_latoutpane {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._2_latoutpane to javafx.fxml;
    exports com.example._2_latoutpane;
}