package com.example._28_passwordfield;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private PasswordField passField;

    @FXML
    private CheckBox showCheck;

    @FXML
    private TextField txtField;

    @FXML
    void changeVisibility(MouseEvent event) {
        if(showCheck.isSelected()){
            txtField.setText(passField.getText());
            passField.setVisible(false);
            txtField.setVisible(true);
            return;
        }
        System.out.println("Not");
        passField.setText(txtField.getText());
        txtField.setVisible(false);
        passField.setVisible(true);
    }

}