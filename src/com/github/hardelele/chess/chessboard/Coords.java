package com.github.hardelele.chess.chessboard;

public class Coords {

    private int number;
    private String letter;

    public Coords() {
        this.number = 1;
        this.letter = "A";
    }

    public Coords(int number, String letter) {
        this.number = number;
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return letter + number;
    }
}
