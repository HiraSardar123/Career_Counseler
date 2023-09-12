package com.example.project_oop;

import com.example.project_oop.AImajorController;
import com.example.project_oop.DSController;
import com.example.project_oop.GDController;
import com.example.project_oop.SEController;
import com.example.project_oop.CS_majorController;

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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Score_CsController implements Initializable,Result{


    @FXML
    private PieChart piechart;

    @FXML
    private Button AI;

    @FXML
    private Button cs;

    @FXML
    private Button ds;

    @FXML
    private Button gd;

    @FXML
    private Button se;


    @Override
    public int percentage1_calculator() {
        //import com.example.project_oop.AImajorController;
        float perc = (float) (AImajorController.getField_AI() / 25.0) * 100;
        return (int)perc;

    }

    @Override
    public int percentage2_calculator() {
        float perc = (float) (DSController.getScore_ds() / 25.0) * 100;
        return (int)perc;
    }

    @Override
    public int percentage3_calculator() {
        float perc = (float) (GDController.getScore_gd()  / 25.0) * 100;
        return (int)perc;
    }

    @Override
    public int percentage4_calculator() {
        float perc = (float) (SEController.getScore_se() / 25.0) * 100;
        return (int)perc;
    }

    @Override
    public int percentage5_calculator() {
        float perc = (float) (CS_majorController.getScore_cs() / 25.0) * 100;
        return (int)perc;
    }

    @FXML
    private Button roadmap;

    @FXML
    void roadmap(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) roadmap.getScene().getWindow();
        primaryStage.close();
        URL url = getClass().getResource("CS_major_rm.fxml");
        if (url == null) {
            // Handle the case where the resource file does not exist
        } else {
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();
            loader.setRoot(root); // set root before loading
            // loader.setController(new Arts_Roadmap_Controller()); // replace AImajorController with the name of your controller class
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pie_data= FXCollections.observableArrayList(
                new PieChart.Data("Artificial Intelligence ",percentage1_calculator()),
                new PieChart.Data("Data Science",percentage2_calculator()),
                new PieChart.Data("Game Development",percentage3_calculator()),
                new PieChart.Data("Software Engineering",percentage4_calculator()),
                new PieChart.Data("Cyber Security",percentage5_calculator()));




        pie_data.forEach( data->
                data.nameProperty().bind(
                        Bindings.concat(data.getName(), " percentage: ",data.pieValueProperty(), "%"
                        )
                )

        );
        piechart.getData().addAll(pie_data);
    }
}
