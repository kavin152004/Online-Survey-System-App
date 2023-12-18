package com.example.surveys;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



import java.io.IOException;

public class HelloApplication extends Application {

    public static Scene loginscene;
    public static Scene stageforlogin;

    public static Scene signUpScene;
    public static Scene signUpScene1;
    public static Scene signUpScene2;
    public static Scene signUpScene3;
    public static Scene signUpScene4;

    public static Scene signUpScene5;
    public static Scene signUpScene6;

    public static Scene signUpScene7;

    public static Stage mystage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        FXMLLoader signupfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signup.fxml"));
        FXMLLoader mainfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("surveytypes.fxml"));
        FXMLLoader main1fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("surveytypes.fxml"));
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        FXMLLoader companyfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("companysurveys.fxml"));
        FXMLLoader applecompanyfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("applesurveys.fxml"));
        FXMLLoader metacompanyfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("meta.fxml"));
        FXMLLoader reviewsuccesfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("reviewsucces.fxml"));




        Scene scene = new Scene(fxmlLoader.load(), 632,400 );
        Scene signUpscene = new Scene(signupfxmlLoader.load(), 632, 400);
        Scene main = new Scene(mainfxmlLoader.load(), 632, 400);
        Scene main1 = new Scene(main1fxmlLoader.load(), 632, 400);
        Scene login = new Scene(loginfxmlLoader.load(), 632, 400);
        Scene company = new Scene(companyfxmlLoader.load(), 632, 400);
        Scene applecompany = new Scene(applecompanyfxmlLoader.load(), 632, 400);
        Scene metacompany = new Scene(metacompanyfxmlLoader.load(), 632, 400);
        Scene reviewsucces = new Scene(reviewsuccesfxmlLoader.load(), 632, 400);



        mystage = stage;

        signUpScene = signUpscene;
        signUpScene1 = main;
        signUpScene2 = main1;
        signUpScene3 = login;
        signUpScene4 = company;
        signUpScene5 = applecompany;
        signUpScene6 = metacompany;
        signUpScene7 = reviewsucces;




        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}