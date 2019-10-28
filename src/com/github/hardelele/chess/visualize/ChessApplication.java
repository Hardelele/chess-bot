package com.github.hardelele.chess.visualize;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle borderOfChessboard = initializeBorderOfChessboard();

        Group root = new Group();
        Scene scene = new Scene(root,800,600);

        root.getChildren().add(borderOfChessboard);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Rectangle initializeBorderOfChessboard() {
        Rectangle borderOfChessboard = new Rectangle(200,100,400,400);
        borderOfChessboard.setFill(null);
        borderOfChessboard.setStroke(Color.BLACK);

        return borderOfChessboard;
    }

    private void printSquaresInChessboard() {

    }
}
