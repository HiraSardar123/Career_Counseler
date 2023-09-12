package com.example.project_oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class HelloController {
    @FXML
    private Button login_button;
    @FXML
    private Button Submit;

    @FXML
    private PasswordField password_check;

    @FXML
    private Button signup_button;

    @FXML
    private TextField username_check;
    @FXML
    private Button login;

    @FXML
    private TextField name_enter;

    @FXML
    private PasswordField password_enter;
    @FXML
    private Label error;
    int counter=0;

    public Label getError() {
        return error;
    }

    public void setError(Label label, String error) {
        label.setText(error);
    }

    public Button getLogin_button() {
        return login_button;
    }

    public void setLogin_button(Button login_button) {
        this.login_button = login_button;
    }

    @FXML
    void login(ActionEvent event) throws IOException {
            Stage primaryStage = (Stage) getLogin_button().getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("login.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                Parent root = FXMLLoader.load(url);
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        }

    @FXML
    void name_check(ActionEvent event) {
            String name_got = username_check.getText();
            boolean found = false;

            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_name.txt"));
                String line;

                while ((line = reader.readLine()) != null) {
                    if (line.equals(name_got)) {
                        found = true;
                        break;
                    }
                }

                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (found) {
                counter++;
            }
    }

    @FXML
    void password_check(ActionEvent event) {
        String password_got = password_check.getText();
        boolean found = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_password.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.equals(password_got)) {
                    found = true;
                    break;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (found) {
            counter++;
        }
        checkpassword(counter);
    }
    void checkpassword(int c){
        if(c>1){

        }
        else{
            setError(new Label(),"Incorrect username or password!");
        }
    }

    @FXML
    void name_enter(ActionEvent event) {
        String name = name_enter.getText();
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_name.txt"));
            out.write(name);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void password_enter(ActionEvent event) {
        String password = password_enter.getText();
        try {
            BufferedWriter out1= new BufferedWriter(new FileWriter("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_password.txt"));
            out1.write(password);
            out1.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void signup_screen_display(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) signup_button.getScene().getWindow();
        primaryStage.close();

        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void login_screen(ActionEvent event) throws IOException {
            Stage primaryStage = (Stage) getLogin_button().getScene().getWindow();
            primaryStage.close();
            URL url = getClass().getResource("login.fxml");
            if (url == null) {
                // Handle the case where the resource file does not exist
            } else {
                Parent root = FXMLLoader.load(url);
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
    }
    @FXML
    void error_show(MouseEvent event) {

    }
    @FXML
    void Submit(ActionEvent event) {
           /* String name = name_enter.getText();
            String password = password_enter.getText();
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\hp\IdeaProjects\\Project_oop\\write_name.txt"));
                out.write(name);
                out.close();
                BufferedWriter out1= new BufferedWriter(new FileWriter("C:\\Users\\hp\\IdeaProjects\\Project_oop\\write_password.txt"));
                out1.write(password);
                out1.close();
            } catch (IOException ex) {
                ex.printStackTrace();*/
    }

}