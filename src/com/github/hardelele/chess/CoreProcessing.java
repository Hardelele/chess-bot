package com.github.hardelele.chess;

import com.github.hardelele.chess.chessbords.StateOfChessboard;
import com.github.hardelele.chess.chessbords.impl.StartingDebutChessboardState;

public class CoreProcessing {

    StateOfChessboard mainStateOfChessboard;

    public CoreProcessing() {
        run();
    }

    public void run() {
        mainStateOfChessboard = new StartingDebutChessboardState();
        checkMove();
    }

    public void checkMove() {
        System.out.println(mainStateOfChessboard.getFiguresList().size());
    }
}
