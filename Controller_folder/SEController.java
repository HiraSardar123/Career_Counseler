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

public class SEController {

    @FXML
    private ToggleGroup a1;

    @FXML
    private RadioButton a1_1;

    @FXML
    private RadioButton a1_2;

    @FXML
    private RadioButton a1_3;

    @FXML
    private RadioButton a1_4;

    @FXML
    private RadioButton a1_5;

    @FXML
    private ToggleGroup a2;

    @FXML
    private RadioButton a2_1;

    @FXML
    private RadioButton a2_2;

    @FXML
    private RadioButton a2_3;

    @FXML
    private RadioButton a2_4;

    @FXML
    private RadioButton a2_5;

    @FXML
    private ToggleGroup a3;

    @FXML
    private RadioButton a3_1;

    @FXML
    private RadioButton a3_2;

    @FXML
    private RadioButton a3_3;

    @FXML
    private RadioButton a3_4;

    @FXML
    private RadioButton a3_5;

    @FXML
    private ToggleGroup a4;

    @FXML
    private RadioButton a4_1;

    @FXML
    private RadioButton a4_2;

    @FXML
    private RadioButton a4_3;

    @FXML
    private RadioButton a4_4;

    @FXML
    private RadioButton a4_5;

    @FXML
    private ToggleGroup a5;

    @FXML
    private RadioButton a5_1;

    @FXML
    private RadioButton a5_2;

    @FXML
    private RadioButton a5_3;

    @FXML
    private RadioButton a5_4;

    @FXML
    private RadioButton a5_5;



    @FXML
    private Label check_response;

    @FXML
    private Button next;
    private int response_se=0;
    private static int score_se=0;

    public int getResponse_se() {
        return response_se;
    }

    public void setResponse_se(int response_se) {
        this.response_se = response_se;
    }

    public static int getScore_se() {
        return score_se;
    }

    public void setScoree_se(int score_se) {
        this.score_se = score_se;
    }

    public Label getCheck_response() {
        return check_response;
    }

    public void setCheck_response(Label check_response) {
        this.check_response = check_response;
    }

    @FXML
    void a1_1(ActionEvent event) {
    if(a1_1.isSelected()){
        setResponse_se(getResponse_se()+1);
         setScoree_se(getScore_se()+5);
    }
    }

    @FXML
    void a1_2(ActionEvent event) {
        if(a1_2.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+4);
        }
    }

    @FXML
    void a1_3(ActionEvent event) {
        if(a1_3.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+3);
        }
    }

    @FXML
    void a1_4(ActionEvent event) {
        if(a1_4.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+2);
        }
    }

    @FXML
    void a1_5(ActionEvent event) {
        if(a1_5.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+1);
        }
    }

    @FXML
    void a2_1(ActionEvent event) {
        if(a2_1.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+5);
        }
    }

    @FXML
    void a2_2(ActionEvent event) {
        if(a2_2.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+4);
        }
    }

    @FXML
    void a2_3(ActionEvent event) {
        if(a2_3.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+3);
        }
    }

    @FXML
    void a2_4(ActionEvent event) {
        if(a2_4.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+2);
        }
    }

    @FXML
    void a2_5(ActionEvent event) {
        if(a2_5.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+1);
        }
    }

    @FXML
    void a3_1(ActionEvent event) {
        if(a3_1.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+5);
        }
    }

    @FXML
    void a3_2(ActionEvent event) {
        if(a3_2.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+4);
        }
    }

    @FXML
    void a3_3(ActionEvent event) {
        if(a3_3.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+3);
        }
    }

    @FXML
    void a3_4(ActionEvent event) {
        if(a3_4.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+2);
        }
    }

    @FXML
    void a3_5(ActionEvent event) {
        if(a3_5.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+1);
        }
    }

    @FXML
    void a4_1(ActionEvent event) {
        if(a4_1.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+5);
        }
    }

    @FXML
    void a4_2(ActionEvent event) {
        if(a4_2.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+4);
        }
    }

    @FXML
    void a4_3(ActionEvent event) {
        if(a4_3.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+3);
        }
    }

    @FXML
    void a4_4(ActionEvent event) {
        if(a4_4.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+2);
        }
    }

    @FXML
    void a4_5(ActionEvent event) {
        if(a4_5.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+1);
        }
    }

    @FXML
    void a5_1(ActionEvent event) {
        if(a5_1.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+5);
        }
    }

    @FXML
    void a5_2(ActionEvent event) {
        if(a5_2.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+4);
        }
    }

    @FXML
    void a5_3(ActionEvent event) {
        if(a5_3.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+3);
        }
    }

    @FXML
    void a5_4(ActionEvent event) {
        if(a5_4.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+2);
        }
    }

    @FXML
    void a5_5(ActionEvent event) {
        if(a5_5.isSelected()){
            setResponse_se(getResponse_se()+1);
            setScoree_se(getScore_se()+1);
        }
    }

    @FXML
    void next_button(ActionEvent event) throws IOException {
        if (getResponse_se() >= 5) {
            Stage primaryStage = (Stage) next.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("Score_Cs.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                // loader.setController(new Arts_Roadmap_Controller()); // replace AImajorController with the name of your controller class.
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        }
        else{
            System.out.println("Please fill all the required fields.");
        }
    }
}

