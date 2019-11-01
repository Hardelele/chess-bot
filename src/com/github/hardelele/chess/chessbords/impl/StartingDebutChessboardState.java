package com.github.hardelele.chess.chessbords.impl;

import com.github.hardelele.chess.chessbords.StateOfChessboardImpl;

public class StartingDebutChessboardState extends StateOfChessboardImpl {

    public StartingDebutChessboardState() {
        putFigures();
    }

    private void putFigures() {
        putPawns();
        putBishops();
        putKings();
        putKnights();
        putQueens();
        putRooks();
    }

    private void putPawns() {
        for (int counter = 1; counter < 9; counter++) {
            addPawn("white",2,counter);
            addPawn("black",7,counter);
        }
    }

    private void putQueens() {
        addQueen("white",1,4);
        addQueen("black",8,5);
    }

    private void putBishops() {
        for (int counter = 3; counter < 9; counter+=3) {
            addBishop("white",1,counter);
            addBishop("black",8,counter);
        }
    }

    private void putKnights() {
        for (int counter = 2; counter < 9; counter+=5) {
            addKnight("white",1,counter);
            addKnight("black",8,counter);
        }
    }

    private void putRooks() {
        for (int counter = 1; counter < 9; counter+=7) {
            addRook("white",1,counter);
            addRook("black",8,counter);
        }
    }

    private void putKings(){
        addKing("white",1,5);
        addKing("black",8,4);
    }
}
