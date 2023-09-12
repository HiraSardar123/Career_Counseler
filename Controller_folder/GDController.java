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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class GDController {

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
    private RadioButton g1_1;

    @FXML
    private RadioButton g1_2;

    @FXML
    private RadioButton g1_3;

    @FXML
    private RadioButton g1_4;

    @FXML
    private RadioButton g1_5;

    @FXML
    private RadioButton g2_1;

    @FXML
    private RadioButton g2_2;

    @FXML
    private RadioButton g2_3;

    @FXML
    private RadioButton g2_4;

    @FXML
    private RadioButton g2_5;

    @FXML
    private RadioButton g3_1;

    @FXML
    private RadioButton g3_2;

    @FXML
    private RadioButton g3_3;

    @FXML
    private RadioButton g3_4;

    @FXML
    private RadioButton g3_5;

    @FXML
    private RadioButton g4_1;

    @FXML
    private RadioButton g4_2;

    @FXML
    private RadioButton g4_3;

    @FXML
    private RadioButton g4_4;

    @FXML
    private RadioButton g4_5;

    @FXML
    private RadioButton g5_1;

    @FXML
    private RadioButton g5_2;

    @FXML
    private RadioButton g5_3;

    @FXML
    private RadioButton g5_4;

    @FXML
    private RadioButton g5_5;

    @FXML
    private Label label;

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @FXML
    private Button next;
    private int response_gd=0;

    public int getResponse_gd() {
        return response_gd;
    }

    public void setResponse_gd(int response_gd) {
        this.response_gd = response_gd;
    }

    private static int score_gd=0;

    public static int getScore_gd() {
        return score_gd;
    }

    public void setScore_gd(int score_gd) {
        this.score_gd = score_gd;
    }

    @FXML
    void g1_1(ActionEvent event) {
        if(g1_1.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+5);
        }
    }

    @FXML
    void g1_2(ActionEvent event) {
        if(g1_2.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+4);
        }
    }

    @FXML
    void g1_3(ActionEvent event) {
        if(g1_3.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+3);
        }
    }

    @FXML
    void g1_4(ActionEvent event) {
        if(g1_4.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+2);
        }
    }

    @FXML
    void g1_5(ActionEvent event) {
        if(g1_5.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+1);
        }
    }

    @FXML
    void g2_1(ActionEvent event) {
        if(g2_1.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+5);
        }
    }

    @FXML
    void g2_2(ActionEvent event) {
        if(g2_2.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+4);
        }
    }

    @FXML
    void g2_3(ActionEvent event) {
        if(g2_3.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+3);
        }
    }

    @FXML
    void g2_4(ActionEvent event) {
        if(g2_4.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+2);
        }
    }

    @FXML
    void g2_5(ActionEvent event) {
        if(g2_5.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+1);
        }
    }

    @FXML
    void g3_1(ActionEvent event) {
        if(g3_1.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+5);
        }
    }

    @FXML
    void g3_2(ActionEvent event) {
        if(g3_2.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+4);
        }
    }

    @FXML
    void g3_3(ActionEvent event) {
        if(g3_3.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+3);
        }
    }

    @FXML
    void g3_4(ActionEvent event) {
        if(g3_4.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+2);
        }
    }

    @FXML
    void g3_5(ActionEvent event) {
        if(g3_5.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+1);
        }
    }

    @FXML
    void g4_1(ActionEvent event) {
        if(g4_1.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+5);
        }
    }

    @FXML
    void g4_2(ActionEvent event) {
        if(g4_2.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+4);
        }
    }

    @FXML
    void g4_3(ActionEvent event) {
        if(g4_3.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+3);
        }
    }

    @FXML
    void g4_4(ActionEvent event) {
        if(g4_4.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+2);
        }
    }

    @FXML
    void g4_5(ActionEvent event) {
        if(g4_5.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+1);
        }
    }

    @FXML
    void g5_1(ActionEvent event) {
        if(g5_1.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+5);
        }
    }

    @FXML
    void g5_2(ActionEvent event) {
        if(g5_2.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+4);
        }
    }

    @FXML
    void g5_3(ActionEvent event) {
        if(g5_3.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+3);
        }
    }

    @FXML
    void g5_4(ActionEvent event) {
        if(g5_4.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+2);
        }
    }

    @FXML
    void g5_5(ActionEvent event) {
        if(g5_5.isSelected()){
            setResponse_gd(getResponse_gd()+1);
            setScore_gd(getScore_gd()+1);
        }
    }
    @FXML
    void next(ActionEvent event) throws IOException {
        if(getResponse_gd()>=5) {
            Stage primaryStage = (Stage) next.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("SEmajor.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();
                loader.setRoot(root); // set root before loading
                loader.setController(new SEController()); // replace AImajorController with the name of your controller class
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        }
        else
        {
            getLabel().setText("Please fill all the required fields.");

        }
    }

}
