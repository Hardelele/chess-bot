package com.github.hardelele.chess.chessboard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BoardState implements Serializable {

    private final String litters = "A B C D E F G H";

    HashMap<String,Square> squares = new HashMap<>();

    {
        StringTokenizer stringTokenizer;
        String litter;
        for (int i = 0; i<8; i++) {
            stringTokenizer = new StringTokenizer(litters);
            for (int j = 0; j<8; j++) {
                litter = stringTokenizer.nextToken();
                squares.put(litter + i, new Square(i,litter));
            }
        }
    }

}
