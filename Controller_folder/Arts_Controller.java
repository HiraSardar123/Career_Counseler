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

import java.io.IOException;
import java.net.URL;

public class Arts_Controller {

    @FXML
    private Label label_next;

    @FXML
    private Button next;

    @FXML
    private ToggleGroup p1;

    @FXML
    private RadioButton p1_1;

    @FXML
    private RadioButton p1_2;

    @FXML
    private RadioButton p1_3;

    @FXML
    private RadioButton p1_4;

    @FXML
    private RadioButton p1_5;

    @FXML
    private ToggleGroup p2;

    @FXML
    private RadioButton p2_1;

    @FXML
    private RadioButton p2_2;

    @FXML
    private RadioButton p2_3;

    @FXML
    private RadioButton p2_4;

    @FXML
    private RadioButton p2_5;

    @FXML
    private ToggleGroup p3;

    @FXML
    private RadioButton p3_1;

    @FXML
    private RadioButton p3_2;

    @FXML
    private RadioButton p3_3;

    @FXML
    private RadioButton p3_4;

    @FXML
    private RadioButton p3_5;

    @FXML
    private ToggleGroup p4;

    @FXML
    private RadioButton p4_1;

    @FXML
    private RadioButton p4_2;

    @FXML
    private RadioButton p4_3;

    @FXML
    private RadioButton p4_4;

    @FXML
    private RadioButton p4_5;

    @FXML
    private ToggleGroup p5;

    @FXML
    private RadioButton p5_1;

    @FXML
    private RadioButton p5_2;

    @FXML
    private RadioButton p5_3;

    @FXML
    private RadioButton p5_4;

    @FXML
    private RadioButton p5_5;

    private int total_responses=0;
    private static int arts_responses=0;

    public int getTotal_responses() {
        return total_responses;
    }

    public void setTotal_responses(int total_responses) {
        this.total_responses = total_responses;
    }

    public static int getArts_responses() {
        return arts_responses;
    }

    public void setArts_responses(int arts_responses) {
        this.arts_responses = arts_responses;
    }

    public Label getLabel_next() {
        return label_next;
    }

    public void setLabel_next(Label label_next) {
        this.label_next = label_next;
    }

    @FXML
    void next(ActionEvent event) throws IOException {
        if(getTotal_responses()>=5) {
            Stage primaryStage = (Stage) next.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("Engineering_kids.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                //loader.setController(new Engineering_kids_Controller()); // replace AImajorController with the name of your controller class
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        }
        else
        {
            getLabel_next().setText("Please fill all the required fields.");

        }
    }

    @FXML
    void p1_1(ActionEvent event) {
        if(p1_1.isSelected()){
            setArts_responses(getArts_responses()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p1_2(ActionEvent event) {
        if(p1_2.isSelected()){
            setArts_responses(getArts_responses()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p1_3(ActionEvent event) {
        if(p1_3.isSelected()){
            setArts_responses(getArts_responses()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p1_4(ActionEvent event) {
        if(p1_4.isSelected()){
            setArts_responses(getArts_responses()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p1_5(ActionEvent event) {
        if(p1_5.isSelected()){
            setArts_responses(getArts_responses()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p2_1(ActionEvent event) {
        if(p2_1.isSelected()){
            setArts_responses(getArts_responses()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p2_2(ActionEvent event) {
        if(p2_2.isSelected()){
            setArts_responses(getArts_responses()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p2_3(ActionEvent event) {
        if(p2_3.isSelected()){
            setArts_responses(getArts_responses()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p2_4(ActionEvent event) {
        if(p2_4.isSelected()){
            setArts_responses(getArts_responses()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p2_5(ActionEvent event) {
        if(p2_5.isSelected()){
            setArts_responses(getArts_responses()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p3_1(ActionEvent event) {
        if(p3_1.isSelected()){
            setArts_responses(getArts_responses()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p3_2(ActionEvent event) {
        if(p3_2.isSelected()){
            setArts_responses(getArts_responses()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p3_3(ActionEvent event) {
        if(p3_3.isSelected()){
            setArts_responses(getArts_responses()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p3_4(ActionEvent event) {
        if(p3_4.isSelected()){
            setArts_responses(getArts_responses()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p3_5(ActionEvent event) {
        if(p3_5.isSelected()){
            setArts_responses(getArts_responses()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p4_1(ActionEvent event) {
        if(p4_1.isSelected()){
            setArts_responses(getArts_responses()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p4_2(ActionEvent event) {
        if(p4_2.isSelected()){
            setArts_responses(getArts_responses()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p4_3(ActionEvent event) {
        if(p4_3.isSelected()){
            setArts_responses(getArts_responses()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p4_4(ActionEvent event) {
        if(p4_4.isSelected()){
            setArts_responses(getArts_responses()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p4_5(ActionEvent event) {
        if(p4_5.isSelected()){
            setArts_responses(getArts_responses()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p5_1(ActionEvent event) {
        if(p5_1.isSelected()){
            setArts_responses(getArts_responses()+1);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p5_2(ActionEvent event) {
        if(p5_2.isSelected()){
            setArts_responses(getArts_responses()+2);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p5_3(ActionEvent event) {
        if(p5_3.isSelected()){
            setArts_responses(getArts_responses()+3);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p5_4(ActionEvent event) {
        if(p5_4.isSelected()){
            setArts_responses(getArts_responses()+4);
            setTotal_responses(getTotal_responses()+1);
        }
    }

    @FXML
    void p5_5(ActionEvent event) {
        if(p5_5.isSelected()){
            setArts_responses(getArts_responses()+5);
            setTotal_responses(getTotal_responses()+1);
        }
    }

}
