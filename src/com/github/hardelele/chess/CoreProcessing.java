package com.github.hardelele.chess;

import com.github.hardelele.chess.chessbords.StateOfChessboard;
import com.github.hardelele.chess.chessbords.impl.StartingDebutChessboardState;
import com.github.hardelele.chess.figures.Figure;

import java.util.ArrayList;

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

    public ArrayList<Figure> getFiguresList() {
        return mainStateOfChessboard.getFiguresList();
    }
}
