package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Setting the root node as the FXML file
        FXMLLoader root = new FXMLLoader(Main.class.getResource("circle.fxml"));

        //Creating the scene with the root node and defining the width/height
        Scene scene = new Scene(root.load(), 1920, 1080);

        //Linking the stylesheet
        scene.getStylesheets().add("file:src/main/java/com/example/demo/application.css");

        //Disabling resizing of the GUI
        stage.setResizable(false);


        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press F to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("f"));


        //Setting the title and icon of the GUI
        stage.setTitle("Move the circle!");
        stage.getIcons().add(new Image("file:src/main/resources/images/logo.png"));

        //Setting the stage with the scene
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}