package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

import java.io.IOException;

public class SignupController {

    @FXML
    private Button login;
    @FXML
    private Label label;

    @FXML
    private PasswordField password_enter;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @FXML
    void login_screen(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(loader.load());
        Stage loginStage = new Stage();
        loginStage.setScene(loginScene);

        // close the previous scene
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();

        loginStage.show();
    }

    @FXML
    void password_enter(ActionEvent event) {
        setPassword(password_enter.getText());

        // Get the source of the event and cast it to a Node
        Node source = (Node) event.getSource();

        // Create a new EventHandler to listen for the Enter key press event
        EventHandler<KeyEvent> enterEventHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                // Check if the key pressed is the Enter key
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    // Disable the password field or close the window
                    // depending on your use case
                    source.setDisable(true);
                    // or Stage stage = (Stage) source.getScene().getWindow();
                    // stage.close();
                }
            }
        };

        // Add the EventHandler to the password field
        password_enter.setOnKeyPressed(enterEventHandler);
        try {
            BufferedWriter out1= new BufferedWriter(new FileWriter("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_password.txt"));
            out1.write(password);
            out1.close();
            label.setText("Your response has been recorded successfully.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    }

