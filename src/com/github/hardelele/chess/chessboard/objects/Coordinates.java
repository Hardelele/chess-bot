package com.github.hardelele.chess.chessboard.objects;

/**
 * Briefly description for coordinates of chessboard from wiki:
 *
 * Each square of the chessboard is identified by a unique coordinate
 * pair—a letter and a number. The vertical columns of squares, called
 * files, are labeled a through h from White's left (the queenside) to
 * right (the kingside). The horizontal rows of squares, called ranks,
 * are numbered 1 to 8 starting from White's side of the board.
 */
public class Coordinates {

    /**
     * Class Coordinates realize this description. There is two variables:
     * 'private int number' and 'private String letter'
     */
    private int number;

    private String letter;

    /**
     * public Coordinates() - default constructor. This one initialize variables
     * letter and number as the minimum possible. So number = 1, and letter = "A".
     */
    public Coordinates() {
        this.number = 1;
        this.letter = "A";
    }

    /**
     * public Coordinates(int number, String letter) - constructor with
     * params. This one initialize variables letter and number as passed
     * parameters - int number and String letter. So code is locke this
     * for number: this.number = number; and this for letter: this.letter = letter;
     */
    public Coordinates(int number, String letter) {
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
