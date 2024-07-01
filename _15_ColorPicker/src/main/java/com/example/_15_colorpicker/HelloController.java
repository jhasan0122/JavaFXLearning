package com.example._15_colorpicker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Button button;

    @FXML
    private ColorPicker color;

    @FXML
    void getColor(MouseEvent event) {
        Color col = color.getValue();
        button.setTextFill(col);
    }

}