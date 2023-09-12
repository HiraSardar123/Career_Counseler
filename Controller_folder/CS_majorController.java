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

public class CS_majorController {

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
    private Button next;
    @FXML
    private Label check;
    private int response=0;
    private static int score_cs=0;

    public int getResponse() {
        return response;
    }

    public static int getScore_cs() {
        return score_cs;
    }

    public void setScore_cs(int score_cs) {
        this.score_cs = score_cs;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public Label getCheck() {
        return check;
    }

    public void setCheck(Label check) {
        this.check = check;
    }

    @FXML
    void c1_1(ActionEvent event) {
        if(c1_1.isSelected()) {
            setScore_cs(getScore_cs() + 5);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c1_2(ActionEvent event) {
        if(c1_2.isSelected()) {
            setScore_cs(getScore_cs() + 4);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c1_3(ActionEvent event) {
        if(c1_3.isSelected()) {
            setScore_cs(getScore_cs() + 3);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c1_4(ActionEvent event) {
        if(c1_4.isSelected()) {
            setScore_cs(getScore_cs() + 2);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c1_5(ActionEvent event) {
        if(c1_5.isSelected()) {
            setScore_cs(getScore_cs() + 1);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c2_1(ActionEvent event) {
        if(c2_1.isSelected()) {
            setScore_cs(getScore_cs() + 5);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c2_2(ActionEvent event) {
        if(c2_2.isSelected()) {
            setScore_cs(getScore_cs() + 4);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c2_3(ActionEvent event) {
        if(c2_3.isSelected()) {
            setScore_cs(getScore_cs() + 3);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c2_4(ActionEvent event) {
        if(c2_4.isSelected()) {
            setScore_cs(getScore_cs() + 2);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c2_5(ActionEvent event) {
        if(c2_5.isSelected()) {
            setScore_cs(getScore_cs() + 1);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c3_1(ActionEvent event) {
        if(c3_1.isSelected()) {
            setScore_cs(getScore_cs() + 5);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c3_2(ActionEvent event) {
        if(c3_2.isSelected()) {
            setScore_cs(getScore_cs() + 4);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c3_3(ActionEvent event) {
        if(c3_3.isSelected()) {
            setScore_cs(getScore_cs() + 3);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c3_4(ActionEvent event) {
        if(c3_4.isSelected()) {
            setScore_cs(getScore_cs() + 2);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c3_5(ActionEvent event) {
        if(c3_5.isSelected()) {
            setScore_cs(getScore_cs() + 1);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c4_1(ActionEvent event) {
        if(c4_1.isSelected()) {
            setScore_cs(getScore_cs() + 5);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c4_2(ActionEvent event) {
        if(c4_2.isSelected()) {
            setScore_cs(getScore_cs() + 4);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c4_3(ActionEvent event) {
        if(c4_3.isSelected()) {
            setScore_cs(getScore_cs() + 3);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c4_4(ActionEvent event) {
        if(c4_4.isSelected()) {
            setScore_cs(getScore_cs() + 2);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c4_5(ActionEvent event) {
        if(c4_5.isSelected()) {
            setScore_cs(getScore_cs() + 1);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c5_1(ActionEvent event) {
        if(c5_1.isSelected()) {
            setScore_cs(getScore_cs() + 5);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c5_2(ActionEvent event) {
        if(c5_2.isSelected()) {
            setScore_cs(getScore_cs() + 4);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c5_3(ActionEvent event) {
        if(c5_3.isSelected()) {
            setScore_cs(getScore_cs() + 3);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c5_4(ActionEvent event) {
        if(c5_4.isSelected()) {
            setScore_cs(getScore_cs() + 2);
            setResponse(getResponse()+1);
        }
    }

    @FXML
    void c5_5(ActionEvent event) {
        if(c5_5.isSelected()) {
            setScore_cs(getScore_cs() + 1);
            setResponse(getResponse()+1);
        }
    }
    @FXML
    void next(ActionEvent event) throws IOException {
        if(getResponse()>=5) {
            Stage primaryStage = (Stage) next.getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("DSmajor.fxml");
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
            getCheck().setText("Please fill all the required fields.");

        }
    }
    }

