package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Circle myCircle;
    @FXML
    private Rectangle mySquare;
    private double x;
    private double y;

    //Method for moving the circle up
    public void up(ActionEvent e) {
        System.out.println("up");
        myCircle.setCenterY(y-=20);
    }

    //Method for moving the circle down
    public void down(ActionEvent e) {
        System.out.println("down");
        myCircle.setCenterY(y+=20);
    }

    //Method for moving the circle left
    public void left(ActionEvent e) {
        System.out.println("left");
        myCircle.setCenterX(x-=20);
    }

    //Method for moving the circle right
    public void right(ActionEvent e) {
        System.out.println("right");
        myCircle.setCenterX(x+=20);
    }

    //Method for moving the square up
    public void upS(ActionEvent e) {
        System.out.println("up");
        mySquare.setY(y-=20);
    }

    //Method for moving the square down
    public void downS(ActionEvent e) {
        System.out.println("down");
        mySquare.setY(y+=20);
    }

    //Method for moving the square left
    public void leftS(ActionEvent e) {
        System.out.println("left");
        mySquare.setX(x-=20);
    }

    //Method for moving the square right
    public void rightS(ActionEvent e) {
        System.out.println("right");
        mySquare.setX(x+=20);
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToCircle(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("circle.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("file:src/main/java/com/example/demo/application.css");
        stage.setScene(scene);
    }

    public void switchToSquare(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("square.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add("file:src/main/java/com/example/demo/application.css");
        stage.setScene(scene);
    }

}