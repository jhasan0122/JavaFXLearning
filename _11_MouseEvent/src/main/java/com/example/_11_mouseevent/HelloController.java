package com.example._11_mouseevent;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text text;

    @FXML
    void hide(MouseEvent event) {
        text.setVisible(false);
    }

}
