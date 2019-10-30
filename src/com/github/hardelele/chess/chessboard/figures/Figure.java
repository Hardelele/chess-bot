package com.github.hardelele.chess.chessboard.figures;

public interface Figure {

    void setCoordinates(int letterCoordinateNumber, int numericCoordinateNumber);
    String getCoordinatesInChessNotation();
    void setColor(String color);
    String getColor();
}
