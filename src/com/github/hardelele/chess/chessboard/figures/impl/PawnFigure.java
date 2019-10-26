package com.github.hardelele.chess.chessboard.figures.impl;

import com.github.hardelele.chess.chessboard.BoardState;
import com.github.hardelele.chess.chessboard.Coords;
import com.github.hardelele.chess.chessboard.Square;
import com.github.hardelele.chess.chessboard.figures.Figure;
import com.github.hardelele.chess.chessboard.figures.FigureImpl;

import java.util.HashMap;
import java.util.StringTokenizer;

public class PawnFigure extends FigureImpl {

    private Coords coords;

    private HashMap<String, Square> ableMoves;

    public PawnFigure() {
    }

    public PawnFigure(Coords coords) {
        this.coords = coords;
    }

    public PawnFigure(int number, String letter) {
        this.coords = new Coords(number,letter);
    }

    @Override
    public void countAbleMoves(BoardState boardState) {

        HashMap<String,Square> squares = boardState.getSquares();

        String thisLetter = this.coords.getLetter();
        int thisNumber = this.coords.getNumber();

        StringTokenizer stringTokenizer = new StringTokenizer(boardState.letters);
        String nextLetter = null;

        while (stringTokenizer.nextToken() != thisLetter) {
            nextLetter = stringTokenizer.nextToken();
            break;
        }

        Square leftFlank = null;
        Square rightFlank = null;
        Square nextSquare = squares.get(nextLetter + thisNumber);

        HashMap<String, Square> ableMoves = new HashMap<>();

        if (thisNumber!=1) {
            leftFlank = squares.get(nextLetter + (thisNumber - 1));
            if (leftFlank.getFigure() != null) {
                ableMoves.put(nextLetter + (thisNumber - 1), leftFlank);
            }
        }

        if (thisNumber!=8) {
            rightFlank = squares.get(nextLetter + (thisNumber + 1));
            if (rightFlank.getFigure() != null) {
                ableMoves.put(nextLetter + (thisNumber - 1), rightFlank);
            }
        }

        if (nextSquare.getFigure()==null) {
            ableMoves.put(nextLetter + thisNumber, rightFlank);
        }

        this.ableMoves = ableMoves;
    }
}
