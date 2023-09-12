package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PasswordController {
    @FXML
    private PasswordField password_check;
    @FXML
    private Label label;

    @FXML
    private Button signup_button;

    @FXML
    void password_check(ActionEvent event) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_password.txt"));
        String line;
        String password = password_check.getText();
        while ((line = reader.readLine()) != null) {
            if (line.trim().equals(password)) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Questions.fxml"));
                Parent qParent = loader.load();
                Scene qScene = new Scene(qParent);
                Stage qStage = new Stage();

                // set the root node
                qStage.setScene(qScene);
                qStage.initModality(Modality.APPLICATION_MODAL);
                qStage.initOwner((Stage) ((Node) event.getSource()).getScene().getWindow());

                // close the previous window
                Stage prevStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                prevStage.close();

                // show the window and wait for it to be closed
                qStage.showAndWait();

                label.setText("");
                reader.close();
                return;
            }
        }
        reader.close();
        // Password not found, set label text
        label.setText("Incorrect password!");
    }


   /* @FXML
    void password_check(ActionEvent event) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_password.txt"));
        String line;
        String password = password_check.getText();
        while ((line = reader.readLine()) != null) {
            if (line.trim().equals(password)) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Questions.fxml"));
                Parent qParent = loader.load();
                Scene qScene = new Scene(qParent);
                Stage qStage = new Stage();
                qStage.setScene(qScene);

                // close the previous window
                Stage prevStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                prevStage.close();


                qStage.showAndWait();
                label.setText("");
                reader.close();
                return;
            }
        }
        reader.close();
        // Password not found, set label text
        label.setText("Incorrect password!");
    }*/

    @FXML
    void signup_screen_display(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
            Parent SignupParent = loader.load();
            loader.setRoot(SignupParent); // set root before loading
            Scene SignupScene = new Scene(SignupParent);
            Stage SignupStage = new Stage();
            SignupStage.setScene(SignupScene);

            // close the previous window
            Stage prevStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            prevStage.close();

            // show the login window
            SignupStage.showAndWait();
        } catch (IOException e) {
            System.out.println("Error loading FXML file: " + e.getMessage());
        }
    }

    /*@FXML
    void signup_screen_display(ActionEvent event) throws IOException {
        try {
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
        } catch (IOException e) {
            System.out.println("Error loading FXML file: " + e.getMessage());
        }
    }*/

}

