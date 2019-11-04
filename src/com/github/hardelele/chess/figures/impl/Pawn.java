package com.github.hardelele.chess.figures.impl;

import com.github.hardelele.chess.chessbords.impl.Coordinates;
import com.github.hardelele.chess.figures.FigureImpl;

import java.util.ArrayList;

public class Pawn extends FigureImpl {

    public Pawn(int id, String color, int letterCoordinateNumber, int numberCoordinate) {
        super(id, color, letterCoordinateNumber, numberCoordinate);
    }

    @Override
    public void calculateAllMoves(ArrayList<String> movesList) {
        for (int counter = getNumericCoordinateNumber()-1; counter <= getNumericCoordinateNumber()+1; counter++) {
            tryAddMove(new Coordinates(getLetterCoordinateNumber()+1,counter));
        }
    }

    private void tryAddMove(Coordinates moveCoords) {
        // compare to enemy or friendly figure
        if(!isChessboardEnd(moveCoords)) {
            
        }
    }
}
