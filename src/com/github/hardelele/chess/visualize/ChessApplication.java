package com.github.hardelele.chess.visualize;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ChessApplication extends Application {

    public static final ArrayList<String> letters = new ArrayList<String>() {{
        add("A");
        add("B");
        add("C");
        add("D");
        add("E");
        add("F");
        add("G");
        add("H");
    }};

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
