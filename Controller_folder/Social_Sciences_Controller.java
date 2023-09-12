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

public class Social_Sciences_Controller {

    @FXML
    private Label next;

    @FXML
    private ToggleGroup s1;

    @FXML
    private RadioButton s1_1;

    @FXML
    private RadioButton s1_2;

    @FXML
    private RadioButton s1_3;

    @FXML
    private RadioButton s1_4;

    @FXML
    private RadioButton s1_5;

    @FXML
    private ToggleGroup s2;

    @FXML
    private RadioButton s2_1;

    @FXML
    private RadioButton s2_2;

    @FXML
    private RadioButton s2_3;

    @FXML
    private RadioButton s2_4;

    @FXML
    private RadioButton s2_5;

    @FXML
    private ToggleGroup s3;

    @FXML
    private RadioButton s3_1;

    @FXML
    private RadioButton s3_2;

    @FXML
    private RadioButton s3_3;

    @FXML
    private RadioButton s3_4;

    @FXML
    private RadioButton s3_5;

    @FXML
    private ToggleGroup s4;

    @FXML
    private RadioButton s4_1;

    @FXML
    private RadioButton s4_2;

    @FXML
    private RadioButton s4_3;

    @FXML
    private RadioButton s4_4;

    @FXML
    private RadioButton s4_5;

    @FXML
    private ToggleGroup s5;

    @FXML
    private RadioButton s5_1;

    @FXML
    private RadioButton s5_2;

    @FXML
    private RadioButton s5_3;

    @FXML
    private RadioButton s5_4;

    @FXML
    private RadioButton s5_5;

    @FXML
    private Button next_button;
    private static int ss_response=0;
    private int total_response=0;

    public int getTotal_response() {
        return total_response;
    }

    public void setTotal_response(int total_response) {
        this.total_response = total_response;
    }

    public static int getSs_response() {
        return ss_response;
    }

    public void setSs_response(int ss_response) {
        this.ss_response = ss_response;
    }

    public Label getNext() {
        return next;
    }

    public void setNext(Label next) {
        this.next = next;
    }

    @FXML
    void next(ActionEvent event) throws IOException {
        if(getTotal_response()>=5){
            Stage primaryStage = (Stage) next_button.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("Result_shown_kids.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new Result_shown_kids_Controller()); // replace AImajorController with the name of your controller class
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
    }else{
            getNext().setText("Please fill all the required fields.");
        }
    }

    @FXML
    void s1_1(ActionEvent event) {
        if(s1_1.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 1);
        }
    }

    @FXML
    void s1_2(ActionEvent event) {
        if(s1_2.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 2);
        }
    }

    @FXML
    void s1_3(ActionEvent event) {
        if(s1_3.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 3);
        }
    }

    @FXML
    void s1_4(ActionEvent event) {
        if(s1_4.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 4);
        }
    }

    @FXML
    void s1_5(ActionEvent event) {
        if(s1_5.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 5);
        }
    }

    @FXML
    void s2_1(ActionEvent event) {
        if(s2_1.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 1);
        }
    }

    @FXML
    void s2_2(ActionEvent event) {
        if(s2_2.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 2);
        }
    }

    @FXML
    void s2_3(ActionEvent event) {
        if(s2_3.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 3);
        }
    }

    @FXML
    void s2_4(ActionEvent event) {
        if(s2_4.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 4);
        }
    }

    @FXML
    void s2_5(ActionEvent event) {
        if(s2_5.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 5);
        }
    }

    @FXML
    void s3_1(ActionEvent event) {
        if(s3_1.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 1);
        }
    }

    @FXML
    void s3_2(ActionEvent event) {
        if(s3_2.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 2);
        }
    }

    @FXML
    void s3_3(ActionEvent event) {
        if(s3_3.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 3);
        }
    }

    @FXML
    void s3_4(ActionEvent event) {
        if(s3_4.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 4);
        }
    }

    @FXML
    void s3_5(ActionEvent event) {
        if(s3_5.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 5);
        }
    }

    @FXML
    void s4_1(ActionEvent event) {
        if(s4_1.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 1);
        }
    }

    @FXML
    void s4_2(ActionEvent event) {
        if(s4_2.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 2);
        }
    }

    @FXML
    void s4_3(ActionEvent event) {
        if(s4_3.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 3);
        }
    }

    @FXML
    void s4_4(ActionEvent event) {
        if(s4_4.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 4);
        }
    }

    @FXML
    void s4_5(ActionEvent event) {
        if(s4_5.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 5);
        }
    }

    @FXML
    void s5_1(ActionEvent event) {
        if(s5_1.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 1);
        }
    }

    @FXML
    void s5_2(ActionEvent event) {
        if(s5_2.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 2);
        }
    }

    @FXML
    void s5_3(ActionEvent event) {
        if(s5_3.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 3);
        }
    }

    @FXML
    void s5_4(ActionEvent event) {
        if(s5_4.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 4);
        }
    }

    @FXML
    void s5_5(ActionEvent event) {
        if(s5_5.isSelected()) {
            setTotal_response(getTotal_response() + 1);
            setSs_response(getSs_response() + 5);
        }
    }

}
