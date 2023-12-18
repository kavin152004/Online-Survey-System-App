package com.example.surveys;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField lusername;
    @FXML
    private TextField lpassword;

    @FXML
    private Label loginCheck;





    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");

        HelloApplication.mystage.setScene(HelloApplication.signUpScene);

    }

    @FXML
    protected void main1() {
        //welcomeText.setText("Welcome to JavaFX Application!");


        database connectNow=new database();
        Connection connect=connectNow.getConnection();

        String verifyLogin="Select count(1) from loginpage where lusername= '"+lusername.getText() + "' And lpassword='"+lpassword.getText()+"'";
        HelloApplication m = new HelloApplication();
        try{
            Statement statement=connect.createStatement();
            ResultSet queryResult=statement.executeQuery(verifyLogin);
            while(queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    loginCheck.setText("Successfully LoggedIn");

                    System.out.println(lusername.getText());
                    System.out.println(lpassword.getText());

                    HelloApplication.mystage.setScene(HelloApplication.signUpScene2);
                }
                else{
                    loginCheck.setText("Invalid username or passord.Try again!");
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
















    }
    @FXML
    protected void login() {
        //welcomeText.setText("Welcome to JavaFX Application!");




        HelloApplication.mystage.setScene(HelloApplication.signUpScene3);


    }


    @FXML
    protected void main() {
        //welcomeText.setText("Welcome to JavaFX Application!");

        HelloApplication.mystage.setScene(HelloApplication.signUpScene1);
    }
    @FXML
    protected void company() {
        //welcomeText.setText("Welcome to JavaFX Application!");

        HelloApplication.mystage.setScene(HelloApplication.signUpScene4);
    }
    @FXML
    protected void applecompany() {
        //welcomeText.setText("Welcome to JavaFX Application!");

        HelloApplication.mystage.setScene(HelloApplication.signUpScene5);
    }
    @FXML
    protected void metacompany() {
        //welcomeText.setText("Welcome to JavaFX Application!");

        HelloApplication.mystage.setScene
                (HelloApplication.signUpScene6);
    }
    @FXML
    protected void  reviewsucces() {
        //welcomeText.setText("Welcome to JavaFX Application!");

        HelloApplication.mystage.setScene(HelloApplication.signUpScene7);
    }



}