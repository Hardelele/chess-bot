package com.github.hardelele.chess.figures;

import java.io.Serializable;
import java.util.ArrayList;

public interface Figure extends Serializable {

    void setCoordinates(int letterCoordinateNumber, int numericCoordinateNumber);
    String getCoordinatesInChessNotation();
    void setColor(String color);
    String getColor();
    int getLetterCoordinateNumber();
    int getNumericCoordinateNumber();
    void setId(int id);
    int getId();
    void calculateAllMoves(ArrayList<String> movesList);
    void addOneMove(String coords);
    void addOneAttack(String coords);
    ArrayList<String> getMovesList();
    ArrayList<String> getAttacksList();
    void cleanMovesList();
    void cleanAttackList();
}
