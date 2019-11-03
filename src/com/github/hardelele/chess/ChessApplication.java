package com.github.hardelele.chess;

import com.github.hardelele.chess.chessbords.impl.ClearChessboard;
import com.github.hardelele.chess.chessbords.impl.Coordinates;
import com.github.hardelele.chess.figures.Figure;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

        addSaveButton();
        addLoadButton();
        generateChessboard();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void generateChessboard() {
        drawChessboard();
        drawFigures();
        drawNotations();
    }

    private void addSaveButton() {
        Button saveButton = new Button("Save");
        saveButton.setMinWidth(80);
        saveButton.setMinHeight(30);
        saveButton.setLayoutX(350);
        saveButton.setLayoutY(460);
        saveButtonEvent(saveButton);
        root.getChildren().add(saveButton);
    }

    private void saveButtonEvent(Button saveButton) {
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Pls, Enter file name to save:");
                String fileName = scanner.nextLine();
                StatesSerializer statesSerializer = new StatesSerializer();
                try {
                    statesSerializer.save(coreProcessing.mainStateOfChessboard,fileName);
                    coreProcessing.mainStateOfChessboard = new ClearChessboard();
                    generateChessboard();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void addLoadButton() {
        Button loadButton = new Button("Load");
        loadButton.setMinWidth(80);
        loadButton.setMinHeight(30);
        loadButton.setLayoutX(350);
        loadButton.setLayoutY(500);
        loadButtonEvent(loadButton);
        root.getChildren().add(loadButton);
    }

    private void loadButtonEvent(Button loadButton) {
        loadButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Pls, Enter file name to load:");
                String fileName = scanner.nextLine();
                StatesSerializer statesSerializer = new StatesSerializer();
                try {
                    coreProcessing.mainStateOfChessboard = statesSerializer.load(fileName);
                    generateChessboard();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
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

        ArrayList<Figure> figuresList = coreProcessing.getFiguresList();

        for (Figure figure : figuresList) {
            int numericCoordinateNumber = figure.getNumericCoordinateNumber()-1;
            int letterCoordinateNumber = figure.getLetterCoordinateNumber()-1;
            drawOneFigure(figure,numericCoordinateNumber,letterCoordinateNumber);
        }
    }

    private void drawOneFigure(Figure figure, int numericCoordinateNumber, int letterCoordinateNumber) {

        Rectangle figureFX = new Rectangle(35+(numericCoordinateNumber*squareSize),35+(letterCoordinateNumber*squareSize),30,30);

        if (figure.getColor().equals("white")) {
            figureFX.setFill(Color.GREEN);
        } else {
            figureFX.setFill(Color.RED);
        }

        figureFX.setStroke(Color.BLACK);
        root.getChildren().add(figureFX);
    }
}
