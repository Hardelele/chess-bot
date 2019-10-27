package com.github.hardelele.chess.chessboard.figures.impl;

import com.github.hardelele.chess.chessboard.BoardState;
import com.github.hardelele.chess.chessboard.Coords;
import com.github.hardelele.chess.chessboard.Square;
import com.github.hardelele.chess.chessboard.figures.Figure;
import com.github.hardelele.chess.chessboard.figures.FigureImpl;

import java.util.HashMap;

public class KingFigure extends FigureImpl {

    private Coords coords;

    private HashMap<String, Square> ableMoves;

    @Override
    public void countAbleMoves(BoardState boardState) {

    }
}
