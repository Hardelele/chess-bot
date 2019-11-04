package com.github.hardelele.chess.figures;

import com.github.hardelele.chess.ChessApplication;
import com.github.hardelele.chess.chessbords.impl.Coordinates;

public abstract class FigureImpl implements Figure {

    Coordinates coordinates;

    int id;

    String color;

    public FigureImpl(int id, String color, int letterCoordinateNumber, int numberCoordinate) {
        setId(id);
        setCoordinates(letterCoordinateNumber,numberCoordinate);
        setColor(color);
    }

    @Override
    public void setCoordinates(int letterCoordinateNumber, int numberCoordinate) {
        coordinates = new Coordinates(letterCoordinateNumber, numberCoordinate);
    }

    @Override
    public String getCoordinatesInChessNotation() {
        return coordinates.toString();
    }

    @Override
    public int getLetterCoordinateNumber() {
        return coordinates.getLetterCoordinateNumber();
    }

    @Override
    public int getNumericCoordinateNumber() {
        return coordinates.getNumber();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
