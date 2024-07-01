package com.example._23_progressbar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Text text;

    double points = 0;


    @FXML
    void addPoints(MouseEvent event) {
        points += 0.1;
        progressBar.setProgress(points);
        text.setText(String.valueOf(Math.round(points*100.0)/100.0));
    }

    @FXML
    void subPoints(MouseEvent event) {
        points -= 0.1;
        progressBar.setProgress(points);
        text.setText(String.valueOf(Math.round(points*100.0)/100.0));
    }

}