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


public class Engineering_kids_Controller {
    @FXML
    private ToggleGroup c1;

    @FXML
    private RadioButton c1_1;

    @FXML
    private RadioButton c1_2;

    @FXML
    private RadioButton c1_3;

    @FXML
    private RadioButton c1_4;

    @FXML
    private RadioButton c1_5;

    @FXML
    private ToggleGroup c2;

    @FXML
    private RadioButton c2_1;

    @FXML
    private RadioButton c2_2;

    @FXML
    private RadioButton c2_3;

    @FXML
    private RadioButton c2_4;

    @FXML
    private RadioButton c2_5;

    @FXML
    private ToggleGroup c3;

    @FXML
    private RadioButton c3_1;

    @FXML
    private RadioButton c3_2;

    @FXML
    private RadioButton c3_3;

    @FXML
    private RadioButton c3_4;

    @FXML
    private RadioButton c3_5;

    @FXML
    private ToggleGroup c4;

    @FXML
    private RadioButton c4_1;

    @FXML
    private RadioButton c4_2;

    @FXML
    private RadioButton c4_3;

    @FXML
    private RadioButton c4_4;

    @FXML
    private RadioButton c4_5;

    @FXML
    private ToggleGroup c5;

    @FXML
    private RadioButton c5_1;

    @FXML
    private RadioButton c5_2;

    @FXML
    private RadioButton c5_3;

    @FXML
    private RadioButton c5_4;

    @FXML
    private RadioButton c5_5;

    @FXML
    private Button next_button;

    @FXML
    private Label next_label;
    private int response=0;
    private static int engineering_response=0;

    public static int getEngineering_response() {
        return engineering_response;
    }

    public void setEngineering_response(int engineering_response) {
        this.engineering_response = engineering_response;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public Label getNext() {
        return next_label;
    }

    public void setNext(Label next) {
        this.next_label = next;
    }

    @FXML
    void c1_1(ActionEvent event) {
        if(c1_1.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+1);
        }
    }

    @FXML
    void c1_2(ActionEvent event) {
        if(c1_2.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+2);
        }
    }

    @FXML
    void c1_3(ActionEvent event) {
        if(c1_3.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+3);
        }
    }

    @FXML
    void c1_4(ActionEvent event) {
        if(c1_4.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+4);
        }
    }

    @FXML
    void c1_5(ActionEvent event) {
        if(c1_5.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+5);
        }
    }

    @FXML
    void c2_1(ActionEvent event) {
        if(c2_1.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+1);
        }
    }

    @FXML
    void c2_2(ActionEvent event) {
        if(c2_2.isSelected()){
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+2);
        }
    }

    @FXML
    void c2_3(ActionEvent event) {
        if(c2_3.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+3);
        }
    }

    @FXML
    void c2_4(ActionEvent event) {
        if(c2_4.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+4);
        }
    }

    @FXML
    void c2_5(ActionEvent event) {
        if(c2_5.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+5);
        }
    }

    @FXML
    void c3_1(ActionEvent event) {
        if(c3_1.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+1);
        }
    }

    @FXML
    void c3_2(ActionEvent event) {
        if(c3_2.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+2);
        }
    }


    @FXML
    void c3_3(ActionEvent event) {
        if(c3_3.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+3);
        }
    }

    @FXML
    void c3_4(ActionEvent event) {
        if(c3_4.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+4);
        }
    }

    @FXML
    void c3_5(ActionEvent event) {
        if(c3_5.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+5);
        }
    }

    @FXML
    void c4_1(ActionEvent event) {
        if(c4_1.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+1);
        }
    }

    @FXML
    void c4_2(ActionEvent event) {
        if(c4_2.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+2);
        }
    }

    @FXML
    void c4_3(ActionEvent event) {
        if(c4_3.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+3);
        }
    }

    @FXML
    void c4_4(ActionEvent event) {
        if(c4_4.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+4);
        }
    }

    @FXML
    void c4_5(ActionEvent event) {
        if(c4_5.isSelected()){
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+5);
        }
    }

    @FXML
    void c5_1(ActionEvent event) {
        if(c5_1.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+1);
        }
    }

    @FXML
    void c5_2(ActionEvent event) {
        if(c5_2.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+2);
        }
    }

    @FXML
    void c5_3(ActionEvent event) {
        if(c5_3.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+3);
        }
    }

    @FXML
    void c5_4(ActionEvent event) {
        if(c5_4.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+4);
        }
    }

    @FXML
    void c5_5(ActionEvent event) {
        if(c5_5.isSelected()){
             
            setResponse(getResponse()+1);
            setEngineering_response(getEngineering_response()+5);
        }
    }

    @FXML
    void next(ActionEvent event) throws IOException {
        if (getResponse() >= 5) {
            Stage primaryStage = (Stage) next_button.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("Business_kids.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new Business_kids_Controller());
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        } else {
             
            getNext().setText("Please fill all the fields.");
        }
    }
}
