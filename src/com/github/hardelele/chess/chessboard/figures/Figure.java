package com.github.hardelele.chess.chessboard.figures;

import com.github.hardelele.chess.chessboard.StateOfChessboard;
import com.github.hardelele.chess.chessboard.objects.Square;

import java.util.HashMap;

public abstract class Figure implements FigureInterface {

    private HashMap<String, Square> ableMoves;

    @Override
    public HashMap<String, Square> getAbleMoves() {
        return ableMoves;
    }
}
