package com.github.hardelele.chess.chessboard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BoardState implements Serializable {

    public final String letters = "A B C D E F G H";

    HashMap<String,Square> squares = new HashMap<>();

    {
        StringTokenizer stringTokenizer;
        String letter;
        for (int i = 1; i<=8; i++) {
            stringTokenizer = new StringTokenizer(letters);
            for (int j = 0; j<8; j++) {
                letter = stringTokenizer.nextToken();
                System.out.println(letter+i);
                squares.put(letter + i, new Square(i,letter));
            }
        }
    }

    public HashMap<String, Square> getSquares() {
        return squares;
    }

    public void setSquares(HashMap<String, Square> squares) {
        this.squares = squares;
    }
}
