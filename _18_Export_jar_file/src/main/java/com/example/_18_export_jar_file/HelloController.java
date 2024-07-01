package com.example._18_export_jar_file;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {

    FileChooser fileChooser = new FileChooser();

    @FXML
    private TextField newWord;

    @FXML
    private TextField oldWord;

    @FXML
    private TextArea textArea;

    @FXML
    void changewrite(MouseEvent event) {
        String prevWord = oldWord.getText();
        String newWords = newWord.getText();

        String textRead = textArea.getText();
        String newText = "";

        String[] words = textRead.split(" ");
        for(String word: words){
            if(word.equals(oldWord)){
                newText += newWords;
            }
            else{
                newText += word;
            }
        }
        textArea.setText(newText);
    }

    @FXML
    void getTextFromFile(MouseEvent event) {
        File file = fileChooser.showSaveDialog(new Stage());

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                textArea.appendText(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File("C:\\Users\\HP TECHNOLOGY\\IdeaProjects\\JavaFXLearning\\_18_Export_jar_file\\src"));
    }
}