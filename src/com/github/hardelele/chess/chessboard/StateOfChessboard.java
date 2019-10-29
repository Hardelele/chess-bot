package com.github.hardelele.chess.chessboard;

import com.github.hardelele.chess.chessboard.objects.Square;

import java.util.ArrayList;
import java.util.HashMap;

public class StateOfChessboard {

    private final ArrayList<String> letters = new ArrayList<String>() {{
        add("A");
        add("B");
        add("C");
        add("D");
        add("E");
        add("F");
        add("G");
        add("H");
    }};

    private HashMap<String,Square> squares = new HashMap<String, Square>();

    public StateOfChessboard() {
        initializeHashMapOfSquares();
    }

    private void initializeHashMapOfSquares() {
        for (int numberCounter = 1; numberCounter <= 8; numberCounter++) {
            for (int letterCounter = 0; letterCounter < 8; letterCounter++) {
                putOneSquareInHashMapOfSquares(letterCounter, numberCounter);
            }
        }
    }

    private void putOneSquareInHashMapOfSquares(int letterNumber, int number) {
        String cornetCoordsString = letters.get(letterNumber) + number;
        squares.put(cornetCoordsString, new Square(cornetCoordsString));
    }

    public Square getOneSquareByCoordinateFromHashMapOfSquares(String coords) {
        return squares.get(coords);
    }

    public void replaceOneSquareByCoordinateFromHashMapOfSquares(String coords, Square square) {
        squares.replace(coords,square);
    }
}
