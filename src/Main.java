package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {

    private static Scene LoginScene() {
        // setup grid layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        // set background image
        Image image = new Image("http://cdn.thealternativedaily.com/wp-content/uploads/2015/10/Fotolia_89777343_Subscription_Monthly_M.jpg");
        grid.setBackground(new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false,
                        true, true))));

        // setup controls
        Label loginLabel = new Label("Username:");
        loginLabel.setTextFill(Color.BLUE);
        Label passwdLabel = new Label("Password: ");
        passwdLabel.setTextFill(Color.BLUE);
        TextField userName = new TextField();
        PasswordField passwordField = new PasswordField();

        Button registerBtn = new Button("Register");
        registerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //
            }
        });

        Button submitBtn = new Button("Submit");
        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // CheckCredentials(grid, userName, passwordField);

            }
        });

        // set Grid Constraints
        GridPane.setConstraints(loginLabel, 0, 0);
        GridPane.setConstraints(passwdLabel, 0, 1);
        GridPane.setConstraints(userName,1,0,2,1);
        GridPane.setConstraints(passwordField,1,1,2,1);
        GridPane.setConstraints(submitBtn,2,2, 1,1, HPos.RIGHT, VPos.CENTER);
        GridPane.setConstraints(registerBtn, 1,2, 1,1, HPos.LEFT, VPos.CENTER);

        grid.getChildren().addAll(loginLabel, passwdLabel, userName, passwordField, submitBtn, registerBtn);

        Scene scene = new Scene(grid, 600, 300);

        return scene;

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(LoginScene());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
