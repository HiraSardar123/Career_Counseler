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

public class Business_kids_Controller {

    @FXML
    private ToggleGroup b1;

    @FXML
    private RadioButton b1_1;

    @FXML
    private RadioButton b1_2;

    @FXML
    private RadioButton b1_3;

    @FXML
    private RadioButton b1_4;

    @FXML
    private RadioButton b1_5;

    @FXML
    private ToggleGroup b2;

    @FXML
    private RadioButton b2_1;

    @FXML
    private RadioButton b2_2;

    @FXML
    private RadioButton b2_3;

    @FXML
    private RadioButton b2_4;

    @FXML
    private RadioButton b2_5;

    @FXML
    private ToggleGroup b3;

    @FXML
    private RadioButton b3_1;

    @FXML
    private RadioButton b3_2;

    @FXML
    private RadioButton b3_3;

    @FXML
    private RadioButton b3_4;

    @FXML
    private RadioButton b3_5;

    @FXML
    private ToggleGroup b4;

    @FXML
    private RadioButton b4_1;

    @FXML
    private RadioButton b4_2;

    @FXML
    private RadioButton b4_3;

    @FXML
    private RadioButton b4_4;

    @FXML
    private RadioButton b4_5;

    @FXML
    private ToggleGroup b5;

    @FXML
    private RadioButton b5_1;

    @FXML
    private RadioButton b5_2;

    @FXML
    private RadioButton b5_3;

    @FXML
    private RadioButton b5_4;

    @FXML
    private RadioButton b5_5;

    @FXML
    private Button next_button;

    @FXML
    private Label next_label;

    private int total_response=0;
    private static int business_response=0;

    public int getTotal_response() {
        return total_response;
    }

    public void setTotal_response(int total_response) {
        this.total_response = total_response;
    }

    public static int getBusiness_response() {
        return business_response;
    }

    public void setBusiness_response(int business_response) {
        this.business_response = business_response;
    }

    public Label getNext() {
        return next_label;
    }

    public void setNext(Label next) {
        this.next_label = next;
    }

    @FXML
    void b1_1(ActionEvent event) {
        if(b1_1.isSelected()){
            setBusiness_response(getBusiness_response()+1);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b1_2(ActionEvent event) {
        if(b1_2.isSelected()){
            setBusiness_response(getBusiness_response()+2);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b1_3(ActionEvent event) {
        if(b1_3.isSelected()){
            setBusiness_response(getBusiness_response()+3);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b1_4(ActionEvent event) {
        if(b1_4.isSelected()){
            setBusiness_response(getBusiness_response()+4);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b1_5(ActionEvent event) {
        if(b1_5.isSelected()){
            setBusiness_response(getBusiness_response()+5);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b2_1(ActionEvent event) {
        if(b2_1.isSelected()){
            setBusiness_response(getBusiness_response()+1);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b2_2(ActionEvent event) {
        if(b2_2.isSelected()){
            setBusiness_response(getBusiness_response()+2);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b2_3(ActionEvent event) {
        if(b2_3.isSelected()){
            setBusiness_response(getBusiness_response()+3);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b2_4(ActionEvent event) {
        if(b2_4.isSelected()){
            setBusiness_response(getBusiness_response()+4);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b2_5(ActionEvent event) {
        if(b2_5.isSelected()){
            setBusiness_response(getBusiness_response()+5);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b3_1(ActionEvent event) {
        if(b3_1.isSelected()){
            setBusiness_response(getBusiness_response()+1);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b3_2(ActionEvent event) {
        if(b3_2.isSelected()){
            setBusiness_response(getBusiness_response()+2);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b3_3(ActionEvent event) {
        if(b3_3.isSelected()){
            setBusiness_response(getBusiness_response()+3);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b3_4(ActionEvent event) {
        if(b3_4.isSelected()){
            setBusiness_response(getBusiness_response()+4);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b3_5(ActionEvent event) {
        if(b3_5.isSelected()){
            setBusiness_response(getBusiness_response()+5);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b4_1(ActionEvent event) {
        if(b4_1.isSelected()){
            setBusiness_response(getBusiness_response()+1);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b4_2(ActionEvent event) {
        if(b4_2.isSelected()){
            setBusiness_response(getBusiness_response()+2);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b4_3(ActionEvent event) {
        if(b4_3.isSelected()){
            setBusiness_response(getBusiness_response()+3);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b4_4(ActionEvent event) {
        if(b4_4.isSelected()){
            setBusiness_response(getBusiness_response()+4);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b4_5(ActionEvent event) {
        if(b4_5.isSelected()){
            setBusiness_response(getBusiness_response()+5);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b5_1(ActionEvent event) {
        if(b5_1.isSelected()){
            setBusiness_response(getBusiness_response()+1);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b5_2(ActionEvent event) {
        if(b5_2.isSelected()){
            setBusiness_response(getBusiness_response()+2);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b5_3(ActionEvent event) {
        if(b5_3.isSelected()){
            setBusiness_response(getBusiness_response()+3);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b5_4(ActionEvent event) {
        if(b5_4.isSelected()){
            setBusiness_response(getBusiness_response()+4);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void b5_5(ActionEvent event) {
        if(b5_5.isSelected()){
            setBusiness_response(getBusiness_response()+5);
            setTotal_response(getTotal_response()+1);
        }
    }

    @FXML
    void next(ActionEvent event) throws IOException {
        if (getTotal_response() >= 5) {
            Stage primaryStage = (Stage) next_button.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("Social_Sciences.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new Social_Sciences_Controller()); // replace AImajorController with the name of your controller class
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        } else {
            getNext().setText("Please fill all the required fields.");
        }
        }
    }
