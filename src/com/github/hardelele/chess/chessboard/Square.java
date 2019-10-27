package com.github.hardelele.chess.chessboard;

import com.github.hardelele.chess.chessboard.figures.Figure;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Square {

    Coords coords;
    Figure figure;

    HashMap<String,Integer> ableToMove = new HashMap<String, Integer>() {{
        put("white",0);
        put("black",0);
    }};

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

    public void calcBlackAbleToMove(BoardState boardState) {
        StringTokenizer stringTokenizer;
        String letter;
        for (int i = 1; i<=8; i++) {
            stringTokenizer = new StringTokenizer(boardState.letters);
            for (int j = 0; j<8; j++) {
                letter = stringTokenizer.nextToken();
                System.out.println(letter+i);
                boardState.squares.put(letter + i, new Square(i,letter));
            }
        }
    }
}
