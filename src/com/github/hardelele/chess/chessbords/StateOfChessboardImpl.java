package com.github.hardelele.chess.chessbords;

import com.github.hardelele.chess.figures.Figure;
import com.github.hardelele.chess.figures.impl.*;

import java.util.ArrayList;

public abstract class StateOfChessboardImpl implements StateOfChessboard {

    private ArrayList<Figure> whiteFigures = new ArrayList<>();
    private ArrayList<Figure> blackFigures = new ArrayList<>();

    @Override
    public ArrayList<Figure> getFiguresList() {
        ArrayList<Figure> figuresList = new ArrayList<>();
        figuresList.addAll(whiteFigures);
        figuresList.addAll(blackFigures);
        return figuresList;
    }

    @Override
    public void addPawn(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            whiteFigures.add(new Pawn(color,letterCoordinateNumber,numberCoordinate));
        } else {
            blackFigures.add(new Pawn(color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addQueen(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            whiteFigures.add(new Queen(color,letterCoordinateNumber,numberCoordinate));
        } else {
            blackFigures.add(new Queen(color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addBishop(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            whiteFigures.add(new Bishop(color,letterCoordinateNumber,numberCoordinate));
        } else {
            blackFigures.add(new Bishop(color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addKnight(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            whiteFigures.add(new Knight(color,letterCoordinateNumber,numberCoordinate));
        } else {
            blackFigures.add(new Knight(color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addRook(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            whiteFigures.add(new Rock(color,letterCoordinateNumber,numberCoordinate));
        } else {
            blackFigures.add(new Rock(color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addKing(String color, int letterCoordinateNumber, int numberCoordinate){
        if (color.equals("white")) {
            whiteFigures.add(new King(color,letterCoordinateNumber,numberCoordinate));
        } else {
            blackFigures.add(new King(color,letterCoordinateNumber,numberCoordinate));
        }
    }
}
