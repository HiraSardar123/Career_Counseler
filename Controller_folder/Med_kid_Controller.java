package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;

public class Med_kid_Controller {

    @FXML
    private ToggleGroup d1;

    @FXML
    private RadioButton d1_1;

    @FXML
    private RadioButton d1_2;

    @FXML
    private RadioButton d1_3;

    @FXML
    private RadioButton d1_4;

    @FXML
    private RadioButton d1_5;

    @FXML
    private ToggleGroup d2;

    @FXML
    private RadioButton d2_1;

    @FXML
    private RadioButton d2_2;

    @FXML
    private RadioButton d2_3;

    @FXML
    private RadioButton d2_4;

    @FXML
    private RadioButton d2_5;

    @FXML
    private ToggleGroup d3;

    @FXML
    private RadioButton d3_1;

    @FXML
    private RadioButton d3_2;

    @FXML
    private RadioButton d3_3;

    @FXML
    private RadioButton d3_4;

    @FXML
    private RadioButton d3_5;

    @FXML
    private ToggleGroup d4;

    @FXML
    private RadioButton d4_1;

    @FXML
    private RadioButton d4_2;

    @FXML
    private RadioButton d4_3;

    @FXML
    private RadioButton d4_4;

    @FXML
    private RadioButton d4_5;

    @FXML
    private ToggleGroup d5;

    @FXML
    private RadioButton d5_1;

    @FXML
    private RadioButton d5_2;

    @FXML
    private RadioButton d5_3;

    @FXML
    private RadioButton d5_4;

    @FXML
    private RadioButton d5_5;

    @FXML
    private Button next_button;

    @FXML
    private Label nextscreen_label;

    private static int Med_Response=0;
    private int total_responses=0;

    public static int getMed_Response() {
        return Med_Response;
    }

    public void setMed_Response(int Med_Response) {
        this.Med_Response = Med_Response;
    }

    public int getTotal_responses() {
        return total_responses;
    }

    public void setTotal_responses(int total_responses) {
        this.total_responses = total_responses;
    }

    public Label getNextscreen_label() {
        return nextscreen_label;
    }

    public void setNextscreen_label(Label nextscreen_label) {
        this.nextscreen_label = nextscreen_label;
    }

    @FXML
    void d1_1(ActionEvent event) {
        if(d1_1.isSelected()){
            setMed_Response(getMed_Response()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d1_2(ActionEvent event) {
        if(d1_2.isSelected()){
            setMed_Response(getMed_Response()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d1_3(ActionEvent event) {
        if(d1_3.isSelected()){
            setMed_Response(getMed_Response()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d1_4(ActionEvent event) {
        if(d1_4.isSelected()){
            setMed_Response(getMed_Response()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d1_5(ActionEvent event) {
        if(d1_5.isSelected()){
            setMed_Response(getMed_Response()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d2_1(ActionEvent event) {
        if(d2_1.isSelected()){
            setMed_Response(getMed_Response()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d2_2(ActionEvent event) {
        if(d2_2.isSelected()){
            setMed_Response(getMed_Response()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d2_3(ActionEvent event) {
        if(d2_3.isSelected()){
            setMed_Response(getMed_Response()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d2_4(ActionEvent event) {
        if(d2_4.isSelected()){
            setMed_Response(getMed_Response()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d2_5(ActionEvent event) {
        if(d2_5.isSelected()){
            setMed_Response(getMed_Response()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d3_1(ActionEvent event) {
        if(d3_1.isSelected()){
            setMed_Response(getMed_Response()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d3_2(ActionEvent event) {
        if(d3_2.isSelected()){
            setMed_Response(getMed_Response()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }
    @FXML
    void d3_3(ActionEvent event) {
        if(d3_3.isSelected()){
            setMed_Response(getMed_Response()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d3_4(ActionEvent event) {
        if(d3_4.isSelected()){
            setMed_Response(getMed_Response()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d3_5(ActionEvent event) {
        if(d3_5.isSelected()){
            setMed_Response(getMed_Response()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d4_1(ActionEvent event) {
        if(d4_1.isSelected()){
            setMed_Response(getMed_Response()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d4_2(ActionEvent event) {
        if(d4_2.isSelected()){
            setMed_Response(getMed_Response()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d4_3(ActionEvent event) {
        if(d4_3.isSelected()){
            setMed_Response(getMed_Response()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d4_4(ActionEvent event) {
        if(d4_4.isSelected()){
            setMed_Response(getMed_Response()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d4_5(ActionEvent event) {
        if(d4_5.isSelected()){
            setMed_Response(getMed_Response()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d5_1(ActionEvent event) {
        if(d5_1.isSelected()){
            setMed_Response(getMed_Response()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d5_2(ActionEvent event) {
        if(d5_2.isSelected()){
            setMed_Response(getMed_Response()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d5_3(ActionEvent event) {
        if(d5_3.isSelected()){
            setMed_Response(getMed_Response()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d5_4(ActionEvent event) {
        if(d5_4.isSelected()){
            setMed_Response(getMed_Response()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void d5_5(ActionEvent event) {
        if(d5_5.isSelected()){
            setMed_Response(getMed_Response()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void next_button(ActionEvent event) throws IOException {
        if(getTotal_responses()>=5){
            Stage primaryStage = (Stage) next_button.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("Arts.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new Arts_Controller()); // replace AImajorController with the name of your controller class
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        }
        else{
            getNextscreen_label().setText("Please fill all the required spaces.");
        }
    }

}
