package com.example.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Hello {

    @FXML
    private Button Start_scen;


    public void setButt() {
        Start_scen.setOnAction(event -> {
            Start_scen.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("start-win.fxml"));

            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Parent path = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(path));
            stage.show();

        });
    }
}
