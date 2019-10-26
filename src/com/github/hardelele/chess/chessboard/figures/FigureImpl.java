package com.github.hardelele.chess.chessboard.figures;

import com.github.hardelele.chess.chessboard.Coords;
import com.github.hardelele.chess.chessboard.Square;

import java.util.HashMap;

public abstract class FigureImpl implements Figure {

    private Coords coords;

    private HashMap<String, Square> ableMoves;

    @Override
    public Coords getCoords() {
        return coords;
    }

    @Override
    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    @Override
    public HashMap<String, Square> getAbleMoves() {
        return ableMoves;
    }

    @Override
    public void printAllAbleMoves() {
        for (Square value : ableMoves.values()) {
            System.out.println(value.getCoords().toString());
        }
    }
}
