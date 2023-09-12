package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class StartController {

    @FXML
    private Button login_button;
    @FXML
    void login(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
        Parent SignupParent = loader.load();
        Scene SignupScene = new Scene(SignupParent);
        Stage SignupStage = new Stage();
        SignupStage.setScene(SignupScene);

        // close the previous window
        Stage prevStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        prevStage.close();

        // show the login window
        SignupStage.showAndWait();
    }

}
