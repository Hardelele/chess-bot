package com.github.hardelele.chess.figures;

public interface Figure {

    void setCoordinates(int letterCoordinateNumber, int numericCoordinateNumber);
    String getCoordinatesInChessNotation();
    void setColor(String color);
    String getColor();
    int getLetterCoordinateNumber();
    int getNumericCoordinateNumber();
}
