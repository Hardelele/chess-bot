package com.github.hardelele.chess.chessboard.figures;

import com.github.hardelele.chess.chessboard.StateOfChessboard;
import com.github.hardelele.chess.chessboard.objects.Square;

import java.util.HashMap;

public interface FigureInterface {
    HashMap<String, Square> getAbleMoves();
    void findAbleMoves(StateOfChessboard chessboard);
}
