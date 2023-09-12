package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MajorsCsRm {

    @FXML
    private Button AI;

    @FXML
    private Button back;

    @FXML
    private Button cs;

    @FXML
    private Button ds;

    @FXML
    private Button gd;

    @FXML
    private Button se;


    @FXML
    void AI(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) AI.getScene().getWindow();

        URL url = getClass().getResource("AMajor_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
            System.out.println("FXML file not found");
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading

                loader.setController(new AIMajor_rm());
                Scene scene = new Scene(root);

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(primaryStage);
                stage.setOnHidden(e -> primaryStage.show());
                stage.showAndWait();
            } catch (Exception e) {
                System.out.println("Error loading FXML file or setting controller: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


    @FXML
    void cs(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) cs.getScene().getWindow();

        URL url = getClass().getResource("Cyber_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist.
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new CyberRm()); // Replace "CyberRm" with the actual controller class
                Scene scene = new Scene(root);

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(primaryStage);
                stage.setOnHidden(e -> primaryStage.show());
                stage.showAndWait();
            } catch (Exception e) {
                System.out.println("Error loading FXML file or setting controller: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


    @FXML
    void ds(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) ds.getScene().getWindow();

        URL url = getClass().getResource("DSmajor_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new DSmajorRm()); // Replace "DSmajorRm" with the actual controller class
                Scene scene = new Scene(root);

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(primaryStage);
                stage.setOnHidden(e -> primaryStage.show());
                stage.showAndWait();
            } catch (Exception e) {
                System.out.println("Error loading FXML file or setting controller: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


    @FXML
    void gd(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) gd.getScene().getWindow();

        URL url = getClass().getResource("gdmajor_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new GdmajorRm()); // Replace "GdmajorRm" with the actual controller class
                Scene scene = new Scene(root);

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(primaryStage);
                stage.setOnHidden(e -> primaryStage.show());
                stage.showAndWait();
            } catch (Exception e) {
                System.out.println("Error loading FXML file or setting controller: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


    @FXML
    void se(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) se.getScene().getWindow();

        URL url = getClass().getResource("SEmajor_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new SEmajorRm()); // Replace "SEmajorRm" with the actual controller class
                Scene scene = new Scene(root);

                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(primaryStage);
                stage.setOnHidden(e -> primaryStage.show());
                stage.showAndWait();
            } catch (Exception e) {
                System.out.println("Error loading FXML file or setting controller: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    void back(ActionEvent event)  throws IOException {
        Stage primaryStage = (Stage) back.getScene().getWindow();
        primaryStage.close();
        URL url = getClass().getResource("Score_Cs.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setRoot(root); // set root before loading
            loader.setController(new Score_CsController()); // replace AImajorController with the name of your controller class
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }

}

