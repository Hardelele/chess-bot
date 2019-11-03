package com.github.hardelele.chess.figures;

import java.io.Serializable;

public interface Figure extends Serializable {

    void setCoordinates(int letterCoordinateNumber, int numericCoordinateNumber);
    String getCoordinatesInChessNotation();
    void setColor(String color);
    String getColor();
    int getLetterCoordinateNumber();
    int getNumericCoordinateNumber();
}
