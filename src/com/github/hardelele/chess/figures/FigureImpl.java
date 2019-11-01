package com.github.hardelele.chess.figures;

import com.github.hardelele.chess.ChessApplication;

public abstract class FigureImpl implements Figure {

    int letterCoordinateNumber, numberCoordinate;

    String color;

    public FigureImpl(String color, int letterCoordinateNumber, int numberCoordinate) {
        setCoordinates(letterCoordinateNumber,numberCoordinate);
        setColor(color);
    }

    @Override
    public void setCoordinates(int letterCoordinateNumber, int numberCoordinate) {
        this.letterCoordinateNumber = letterCoordinateNumber;
        this.numberCoordinate = numberCoordinate;
    }

    @Override
    public String getCoordinatesInChessNotation() {
        String letterCoordinate = ChessApplication.letters.get(letterCoordinateNumber-1);
        return letterCoordinate + numberCoordinate;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
