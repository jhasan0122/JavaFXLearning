module com.example._3_imageview {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._3_imageview to javafx.fxml;
    exports com.example._3_imageview;
}