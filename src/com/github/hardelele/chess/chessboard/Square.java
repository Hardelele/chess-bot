package com.github.hardelele.chess.chessboard;


import com.github.hardelele.chess.chessboard.figures.Figure;
import com.sun.org.glassfish.external.statistics.annotations.Reset;

public class Square {

    Coords coords;

    private int whiteFiguresAbleToMove = 0;
    private int blackFiguresAbleToMove = 0;

    Figure figure;

    {
        figure = null;
    }

    public Square() {
        this.coords = new Coords();
    }

    public Square(Coords coords) {
        this.coords = new Coords(coords.getNumber(), coords.getLetter());
    }

    public Square(int number, String letter) {
        this.coords = new Coords(number, letter);
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = new Coords(coords.getNumber(), coords.getLetter());
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void setWhiteFiguresAbleToMove(int whiteFiguresAbleToMove) {
        this.whiteFiguresAbleToMove = whiteFiguresAbleToMove;
    }

    public int getWhiteFiguresAbleToMove() {
        return whiteFiguresAbleToMove;
    }

    public int getBlackFiguresAbleToMove() {
        return blackFiguresAbleToMove;
    }

    public void setBlackFiguresAbleToMove(int blackFiguresAbleToMove) {
        this.blackFiguresAbleToMove = blackFiguresAbleToMove;
    }
}
