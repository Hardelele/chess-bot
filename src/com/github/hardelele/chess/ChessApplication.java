package com.github.hardelele.chess;

import com.github.hardelele.chess.chessbords.impl.Coordinates;
import com.github.hardelele.chess.figures.Figure;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ChessApplication extends Application {

    Group root = new Group();
    CoreProcessing coreProcessing = new CoreProcessing();

    final int sceneWidth = 450;
    final int sceneHeight = 600;
    final int squareSize = 50;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(root, sceneWidth, sceneHeight);

        drawChessboard();
        drawFigures();
        drawNotations();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawNotations() {

        drawLetterNotations();
        drawNumberNotations();
    }

    private void drawLetterNotations() {

        for (int counter = 0; counter < 8; counter++) {
            drawOneNotation(8,52+(counter*squareSize),Coordinates.letters.get(7-counter));
            drawOneNotation(433,52+(counter*squareSize),Coordinates.letters.get(7-counter));
        }
    }

    private void drawNumberNotations() {

        for (int counter = 0; counter < 8; counter++) {
            drawOneNotation(48+(counter*squareSize),18,(counter+1)+"");
            drawOneNotation(48+(counter*squareSize),443,(counter+1)+"");
        }
    }

    private void drawOneNotation(int x, int y, String text) {

        Text notation = new Text(x, y, text);
        root.getChildren().add(notation);
    }

    private void drawChessboard() {

        for (int counterHeight = 0; counterHeight < 8; counterHeight++) {
            for (int counterWidth = 0; counterWidth < 8; counterWidth++) {
                drawOneSquare(counterHeight, counterWidth);
            }
        }
    }

    private void drawOneSquare(int counterHeight, int counterWidth) {

        Rectangle square = new Rectangle(25+counterWidth*squareSize,25+counterHeight*squareSize,squareSize,squareSize);
        setSquareColor(square, counterHeight+counterWidth);
        square.setStroke(Color.BLACK);
        root.getChildren().add(square);
    }

    private void setSquareColor(Rectangle square, int squareNumber) {

        if ((squareNumber % 2) != 0) {
            square.setFill(Color.WHITE);
        } else {
            square.setFill(Color.GRAY);
        }
    }

    private void drawFigures() {

        ArrayList<Rectangle> figures = new ArrayList<>();

        ArrayList<Figure> figuresList = coreProcessing.getFiguresList();

        int counter = 0;

        for (Figure figure : figuresList) {
            int numericCoordinateNumber = figure.getNumericCoordinateNumber()-1;
            int letterCoordinateNumber = figure.getLetterCoordinateNumber()-1;
            figures.add(new Rectangle(35+(numericCoordinateNumber*squareSize),35+(letterCoordinateNumber*squareSize),30,30));

            if (figure.getColor().equals("white")) {
                figures.get(counter).setFill(Color.GREEN);
            } else {
                figures.get(counter).setFill(Color.RED);
            }
            figures.get(counter).setStroke(Color.BLACK);
            root.getChildren().add(figures.get(counter));
            counter++;
        }
    }
}
