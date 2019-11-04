package com.github.hardelele.chess.chessbords;

import com.github.hardelele.chess.chessbords.impl.Coordinates;
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
            int id = whiteFigures.size();
            whiteFigures.add(new Pawn(id, color,letterCoordinateNumber,numberCoordinate));
        } else {
            int id = whiteFigures.size();
            blackFigures.add(new Pawn(id, color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addQueen(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            int id = whiteFigures.size();
            whiteFigures.add(new Queen(id, color,letterCoordinateNumber,numberCoordinate));
        } else {
            int id = whiteFigures.size();
            blackFigures.add(new Queen(id, color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addBishop(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            int id = whiteFigures.size();
            whiteFigures.add(new Bishop(id, color,letterCoordinateNumber,numberCoordinate));
        } else {
            int id = whiteFigures.size();
            blackFigures.add(new Bishop(id, color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addKnight(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            int id = whiteFigures.size();
            whiteFigures.add(new Knight(id, color,letterCoordinateNumber,numberCoordinate));
        } else {
            int id = whiteFigures.size();
            blackFigures.add(new Knight(id, color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addRook(String color, int letterCoordinateNumber, int numberCoordinate) {
        if (color.equals("white")) {
            int id = whiteFigures.size();
            whiteFigures.add(new Rock(id, color,letterCoordinateNumber,numberCoordinate));
        } else {
            int id = whiteFigures.size();
            blackFigures.add(new Rock(id, color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void addKing(String color, int letterCoordinateNumber, int numberCoordinate){
        if (color.equals("white")) {
            int id = whiteFigures.size();
            whiteFigures.add(new King(id, color,letterCoordinateNumber,numberCoordinate));
        } else {
            int id = whiteFigures.size();
            blackFigures.add(new King(id, color,letterCoordinateNumber,numberCoordinate));
        }
    }

    @Override
    public void killFigure(int letterCoordinateNumber, int numberCoordinate) {

        for (Figure figure : whiteFigures) {
            if (figure.getCoordinatesInChessNotation()
                    .equals(new Coordinates(letterCoordinateNumber,numberCoordinate).toString())) {
                whiteFigures.remove(figure.getId());
            }
        }

        for (Figure figure : blackFigures) {
            if (figure.getCoordinatesInChessNotation()
                    .equals(new Coordinates(letterCoordinateNumber,numberCoordinate).toString())) {
                blackFigures.remove(figure.getId());
            }
        }
    }
}
