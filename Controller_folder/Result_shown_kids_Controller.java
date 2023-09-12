package com.example.project_oop;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Result_shown_kids_Controller implements Initializable,Result{
    @FXML
    private PieChart piechart;
    @FXML
    private Button arts;

    @FXML
    private Button business;

    @FXML
    private Button cs;

    @FXML
    private Button medicine;

    @FXML
    private Button ssh;

    @FXML
    void arts(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) arts.getScene().getWindow();

        URL url = getClass().getResource("arts_kids.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setRoot(root); // set root before loading
            loader.setController(new Arts_roadmap_Controller());
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(primaryStage);
            stage.setOnHidden(e -> primaryStage.show());
            stage.showAndWait();
        }
    }



    @FXML
    void cs(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) cs.getScene().getWindow();

        URL url = getClass().getResource("Engineering_kids_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setController(new Engineering_kids_rm_Controller()); // replace AImajorController with the name of your controller class
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(primaryStage);
            stage.showAndWait();
        }
    }


    @FXML
    void medicine(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) medicine.getScene().getWindow();

        URL url = getClass().getResource("Med_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setController(new Med_rm_Controller()); // replace AImajorController with the name of your controller class
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(primaryStage);
            stage.setOnHidden(e -> primaryStage.show());
            stage.showAndWait();
        }
    }


    @FXML
    void ssh(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) cs.getScene().getWindow();

        URL url = getClass().getResource("Ssh_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setController(new Ssh_rm_Controller());
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(primaryStage);
            stage.setOnHidden(e -> primaryStage.show());
            stage.showAndWait();
        }
    }


    @Override
    public int percentage1_calculator() {
        float perc = (float) (Med_kid_Controller.getMed_Response() / 25.0) * 100;
        return (int)perc;
    }

    @Override
    public int percentage2_calculator() {
        float perc = (float) (Arts_Controller.getArts_responses() / 25.0) * 100;
        return (int)perc;
    }

    @Override
    public int percentage3_calculator() {
        float perc = (float) (Engineering_kids_Controller.getEngineering_response() / 25.0) * 100;
        return (int)perc;
    }

    @Override
    public int percentage4_calculator() {
        float perc = (float) (Business_kids_Controller.getBusiness_response() / 25.0) * 100;
        return (int)perc;
    }

    @Override
    public int percentage5_calculator() {
        float perc = (float) (Social_Sciences_Controller.getSs_response()/ 25.0) * 100;
        return (int)perc;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pie_data= FXCollections.observableArrayList(
                        new PieChart.Data("Medicine and Biology ",percentage1_calculator()),
                        new PieChart.Data("Arts and Design ",percentage2_calculator()),
                        new PieChart.Data("Engineering and Computer Science ",percentage3_calculator()),
                        new PieChart.Data("Business ",percentage4_calculator()),
                        new PieChart.Data("Social Sciences and Humanities ",percentage5_calculator()));






                pie_data.forEach( data->
                        data.nameProperty().bind(
                                Bindings.concat(data.getName(), "percentage: ",data.pieValueProperty(), "%"
                                )
                        )

                );
                piechart.getData().addAll(pie_data);
    }


}
