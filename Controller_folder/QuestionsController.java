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

public class QuestionsController {

    @FXML
    private Button cs;

    @FXML
    private Button freelance;

    @FXML
    private Button kids;

    @FXML
    void cs(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) cs.getScene().getWindow();
        primaryStage.close();
        URL url = getClass().getResource("AImajor.fxml");
        if (url == null)
        {
            // Handle the case where the resource file does not exist
        }
        else
        {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setRoot(root); // set root before loading
            loader.setController(new AImajorController()); // replace AImajorController with the name of your controller class
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }





    @FXML
    void freelance(ActionEvent event) throws IOException{
           /* FXMLLoader loader = new FXMLLoader(getClass().getResource("ll.fxml"));
            Parent QsParent = loader.load();
            Scene QsScene = new Scene(QsParent);
            Stage QsStage = new Stage();
            QsStage.setScene(QsScene);

            // close the previous window
            Stage prevStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            prevStage.close();

            // show the login window
            QsStage.showAndWait();*/
        }


    @FXML
    void kids(ActionEvent event) throws IOException{
        Stage primaryStage = (Stage) cs.getScene().getWindow();
        primaryStage.close();
        URL url = getClass().getResource("Med_Kid_Controller.fxml");
        if (url == null)
        {
            // Handle the case where the resource file does not exist
        }
        else
        {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setRoot(root); // set root before loading
            loader.setController(new Med_kid_Controller());
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }

}
