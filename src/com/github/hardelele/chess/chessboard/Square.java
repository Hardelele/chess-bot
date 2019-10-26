package com.github.hardelele.chess.chessboard;


public class Square {

    Coords coords;
    String state;

    public Square() {
        this.coords = new Coords();
        this.state = "empty";
    }

    public Square(Coords coords) {
        this.coords = new Coords();
        this.coords.setLetter(coords.getLetter());
        this.coords.setNumber(coords.getNumber());
        this.state = "empty";
    }

    public Square(int number, String letter){
        this.coords = new Coords();
        this.coords.setLetter(letter);
        this.coords.setNumber(number);
        this.state = "empty";
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords.setLetter(coords.getLetter());
        this.coords.setNumber(coords.getNumber());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
