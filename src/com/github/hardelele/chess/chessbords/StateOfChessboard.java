package com.github.hardelele.chess.chessbords;

import com.github.hardelele.chess.figures.Figure;

import java.util.ArrayList;

public interface StateOfChessboard {

    ArrayList<Figure> getFiguresList();
    void addPawn(String color, int letterCoordinateNumber, int numberCoordinate);
    void addQueen(String color, int letterCoordinateNumber, int numberCoordinate);
    void addKing(String color, int letterCoordinateNumber, int numberCoordinate);
    void addKnight(String color, int letterCoordinateNumber, int numberCoordinate);
    void addRook(String color, int letterCoordinateNumber, int numberCoordinate);
    void addBishop(String color, int letterCoordinateNumber, int numberCoordinate);
}
