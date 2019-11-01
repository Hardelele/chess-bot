package com.github.hardelele.chess;

import com.github.hardelele.chess.figures.Figure;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ChessApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CoreProcessing coreProcessing = new CoreProcessing();

        Group root = new Group();
        Scene scene = new Scene(root,404,500);

        ArrayList<Rectangle> squares = new ArrayList<>();
        int counter = 0;
        int counterHeight = 0;
        int counterWidth = 0;
        while (true) {
            if(counterWidth>=400) {
                counterWidth = 0;
                counterHeight += 50;
                if (counterHeight>=400) {
                    break;
                }
            }

            squares.add(new Rectangle(2+counterWidth,2+counterHeight,50,50));

            if ((counterHeight/50)%2 !=0) {
                if( (counter % 2) != 0) {
                    squares.get(counter).setFill(Color.WHITE);
                } else {
                    squares.get(counter).setFill(Color.GRAY);
                }
            } else {
                if( (counter % 2) == 0) {
                    squares.get(counter).setFill(Color.WHITE);
                } else {
                    squares.get(counter).setFill(Color.GRAY);
                }
            }

            squares.get(counter).setStroke(Color.BLACK);
            root.getChildren().add(squares.get(counter));
            counterWidth += 50;
            counter++;
        }

        ArrayList<Rectangle> figures = new ArrayList<>();
        counter = 0;
        ArrayList<Figure> figuresList;
        figuresList = coreProcessing.getFiguresList();

        for (Figure figure : figuresList) {
            int numericCoordinateNumber = figure.getNumericCoordinateNumber()-1;
            int letterCoordinateNumber = figure.getLetterCoordinateNumber()-1;
            figures.add(new Rectangle(12+(numericCoordinateNumber*50),12+(letterCoordinateNumber*50),30,30));

            if (figure.getColor().equals("white")) {
                figures.get(counter).setFill(Color.GREEN);
            } else {
                figures.get(counter).setFill(Color.RED);
            }

            figures.get(counter).setStroke(Color.BLACK);
            root.getChildren().add(figures.get(counter));
            counter++;
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
