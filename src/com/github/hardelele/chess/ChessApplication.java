package com.github.hardelele.chess;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChessApplication extends Application {

    final int sceneWidth = 450;
    final int sceneHeight = 600;
    final int squareSize = 50;

    Group root = new Group();
    CoreProcessing coreProcessing = new CoreProcessing();
    Scene scene = new Scene(root, sceneWidth, sceneHeight);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
