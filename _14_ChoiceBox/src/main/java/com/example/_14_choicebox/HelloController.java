package com.example._14_choicebox;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> animals;

    @FXML
    void getAnimal(MouseEvent event) {
        String animal = animals.getSelectionModel().getSelectedItem();
        System.out.println(animal);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        animals.getItems().addAll("Dog","Cat","Monkey");
    }
}