package com.github.hardelele.chess.models.chessboard;

import com.github.hardelele.chess.models.squares.Square;

import java.util.HashMap;

public abstract class StateOfChessboardImpl implements StateOfChessboard {

    private HashMap<String, Square> squares = new HashMap<>();

}
