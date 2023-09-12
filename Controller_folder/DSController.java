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

public class DSController {

    @FXML
    private ToggleGroup a1;

    @FXML
    private ToggleGroup a2;

    @FXML
    private ToggleGroup a3;

    @FXML
    private ToggleGroup a4;

    @FXML
    private ToggleGroup a5;

    @FXML
    private ToggleGroup c1;

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
    private Button next;
    @FXML
    private Label label_check;
    private int responses_ds=0;
    private static int score_ds=0;

    public Label getLabel_check() {
        return label_check;
    }

    public void setLabel_check(Label label_check) {
        this.label_check = label_check;
    }

    public static int getScore_ds() {
        return score_ds;
    }

    public void setScore_ds(int score_ds) {
        this.score_ds = score_ds;
    }

    public int getResponses_ds() {
        return responses_ds;
    }

    public void setResponses_ds(int responses_ds) {
        this.responses_ds = responses_ds;
    }
    @FXML
    void d1_1(ActionEvent event) {
        if(d1_1.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+5);
        }
    }

    @FXML
    void d1_2(ActionEvent event) {
        if(d1_2.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+4);
        }
    }

    @FXML
    void d1_3(ActionEvent event) {
        if(d1_3.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+3);
        }
    }

    @FXML
    void d1_4(ActionEvent event) {
        if(d1_4.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+2);
        }
    }

    @FXML
    void d1_5(ActionEvent event) {
        if(d1_5.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+1);
        }
    }

    @FXML
    void d2_1(ActionEvent event) {
        if(d2_1.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+5);
        }
    }

    @FXML
    void d2_2(ActionEvent event) {
        if(d2_2.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+4);
        }
    }

    @FXML
    void d2_3(ActionEvent event) {
        if(d2_3.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+3);
        }
    }

    @FXML
    void d2_4(ActionEvent event) {
        if(d2_4.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+2);
        }
    }

    @FXML
    void d2_5(ActionEvent event) {
        if(d2_5.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+1);
        }
    }

    @FXML
    void d3_1(ActionEvent event) {
        if(d3_1.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+5);
        }
    }

    @FXML
    void d3_2(ActionEvent event) {
        if(d3_2.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+4);
        }
    }

    @FXML
    void d3_3(ActionEvent event) {
        if(d3_3.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+3);
        }
    }

    @FXML
    void d3_4(ActionEvent event) {
        if(d3_4.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+2);
        }
    }

    @FXML
    void d3_5(ActionEvent event) {
        if(d3_5.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+1);
        }
    }

    @FXML
    void d4_1(ActionEvent event) {
        if(d4_1.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+5);
        }
    }

    @FXML
    void d4_2(ActionEvent event) {
        if(d4_2.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+4);
        }
    }

    @FXML
    void d4_3(ActionEvent event) {
        if(d4_3.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+3);
        }
    }

    @FXML
    void d4_4(ActionEvent event) {
        if(d4_4.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+2);
        }
    }

    @FXML
    void d4_5(ActionEvent event) {
        if(d4_5.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+1);
        }
    }

    @FXML
    void d5_1(ActionEvent event) {
        if(d5_1.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+5);
        }
    }

    @FXML
    void d5_2(ActionEvent event) {
        if(d5_2.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+4);
        }
    }

    @FXML
    void d5_3(ActionEvent event) {
        if(d5_3.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+3);
        }
    }

    @FXML
    void d5_4(ActionEvent event) {
        if(d5_4.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+2);
        }
    }

    @FXML
    void d5_5(ActionEvent event) {
        if(d5_5.isSelected()){
            setResponses_ds(getResponses_ds()+1);
            setScore_ds(getScore_ds()+1);
        }
    }

    @FXML
    void next(ActionEvent event) throws IOException {
        if(getResponses_ds()>=5) {
            Stage primaryStage = (Stage) next.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("GDmajor.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new DSController()); // replace AImajorController with the name of your controller class
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        }
        else
        {
            getLabel_check().setText("Please fill all the required fields.");

        }
    }

}
