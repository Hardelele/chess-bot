package com.github.hardelele.chess.chessboard.figures;

import com.github.hardelele.chess.chessboard.BoardState;
import com.github.hardelele.chess.chessboard.Coords;
import com.github.hardelele.chess.chessboard.Square;

import java.util.HashMap;

public interface Figure {

    Coords getCoords();
    void setCoords(Coords coords);
    HashMap<String, Square> getAbleMoves();
    void countAbleMoves(BoardState boardState);
    void printAllAbleMoves();
}
