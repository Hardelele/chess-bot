package com.github.hardelele.chess.chessbords;

import com.github.hardelele.chess.figures.Figure;
import com.github.hardelele.chess.figures.impl.*;

import java.util.ArrayList;

public abstract class StateOfChessboardImpl implements StateOfChessboard {

    private ArrayList<Figure> figuresList = new ArrayList<>();

    @Override
    public ArrayList<Figure> getFiguresList() {
        return figuresList;
    }

    @Override
    public void addPawn(String color, int letterCoordinateNumber, int numberCoordinate) {
        figuresList.add(new Pawn(color,letterCoordinateNumber,numberCoordinate));
    }

    @Override
    public void addQueen(String color, int letterCoordinateNumber, int numberCoordinate) {
        figuresList.add(new Queen(color,letterCoordinateNumber,numberCoordinate));
    }

    @Override
    public void addBishop(String color, int letterCoordinateNumber, int numberCoordinate) {
        figuresList.add(new Bishop(color,letterCoordinateNumber,numberCoordinate));
    }

    @Override
    public void addKnight(String color, int letterCoordinateNumber, int numberCoordinate) {
        figuresList.add(new Knight(color,letterCoordinateNumber,numberCoordinate));
    }

    @Override
    public void addRook(String color, int letterCoordinateNumber, int numberCoordinate) {
        figuresList.add(new Rock(color,letterCoordinateNumber,numberCoordinate));
    }

    @Override
    public void addKing(String color, int letterCoordinateNumber, int numberCoordinate){
        figuresList.add(new King(color,letterCoordinateNumber,numberCoordinate));
    }
}
