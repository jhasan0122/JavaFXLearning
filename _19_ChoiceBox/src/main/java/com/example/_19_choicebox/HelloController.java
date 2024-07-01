package com.example._19_choicebox;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Text text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().add("ONE");
        choiceBox.getItems().add("TWO");
        choiceBox.getItems().add("THREE");

        choiceBox.setOnAction(actionEvent -> {
            text.setText(choiceBox.getValue());
            System.out.println("Hello World");
        });

    }
}