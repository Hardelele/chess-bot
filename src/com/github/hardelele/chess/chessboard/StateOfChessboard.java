package com.github.hardelele.chess.chessboard;

import com.github.hardelele.chess.chessboard.figures.Figure;
import com.github.hardelele.chess.chessboard.figures.impl.*;

import java.util.ArrayList;

public class StateOfChessboard {

    ArrayList<Figure> figuresList;

    public StateOfChessboard() {
        setFiguresAsDebutStarting();
    }

    private void setFiguresAsDebutStarting() {
        setPawnsAsDebutStarting();
        setBishopsAsDebutStarting();
        setKingsAsDebutStarting();
        setKnightsAsDebutStarting();
        setQueensAsDebutStarting();
        setRookAsDebutStarting();
    }

    private void setPawnsAsDebutStarting() {
        for (int counter = 1; counter < 9; counter++) {
            figuresList.add(new Pawn("white",2,counter));
            figuresList.add(new Pawn("black",7,counter));
        }
    }

    private void setQueensAsDebutStarting() {
        figuresList.add(new Queen("white",1,4));
        figuresList.add(new Queen("black",8,5));
    }

    private void setBishopsAsDebutStarting() {
        for (int counter = 3; counter < 9; counter+=3) {
            figuresList.add(new Bishop("white",1,counter));
            figuresList.add(new Bishop("black",8,counter));
        }
    }

    private void setKnightsAsDebutStarting() {
        for (int counter = 2; counter < 9; counter+=5) {
            figuresList.add(new Knight("white",1,counter));
            figuresList.add(new Knight("black",8,counter));
        }
    }

    private void setRookAsDebutStarting() {
        for (int counter = 1; counter < 9; counter+=7) {
            figuresList.add(new Rock("white",1,counter));
            figuresList.add(new Rock("black",8,counter));
        }
    }

    private void setKingsAsDebutStarting(){
            figuresList.add(new King("white",1,5));
            figuresList.add(new King("black",8,4));
    }
}
