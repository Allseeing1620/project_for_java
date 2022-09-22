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

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private AnchorPane root_paf;

    @FXML
    private Button Butt;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Application!");
    }

    @FXML
    private void loadwin(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene path = new Scene(fxmlLoader.load(),600, 400);
        Stage stage = new Stage();
        stage.setScene(path);
        stage.show();
    }

    public void setButt() {
        Butt.setOnAction(event -> {
            Butt.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("hello-view.fxml"));

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