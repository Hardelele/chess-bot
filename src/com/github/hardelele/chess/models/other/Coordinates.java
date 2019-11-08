package com.github.hardelele.chess.models.other;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Briefly description for coordinates of chessboard from wiki:
 *
 * Each square of the chessboard is identified by a unique coordinate
 * pair—a letter and a number. The vertical columns of squares, called
 * files, are labeled a through h from White's left (the queenside) to
 * right (the kingside). The horizontal rows of squares, called ranks,
 * are numbered 1 to 8 starting from White's side of the board.
 */
public class Coordinates implements Serializable {

    /**
     * Array list of letters.
     * Used to convert letter coordinates to letter coordinates numbers, and vice versa.
     */
    private static final ArrayList<String> letters = new ArrayList<String>() {{
        add("A");
        add("B");
        add("C");
        add("D");
        add("E");
        add("F");
        add("G");
        add("H");
    }};

    /**
     * Private Integer variable
     *
     * Numeric coordinate of chessboard.
     */
    private int numberCoordinate;

    /**
     * Private String variable
     *
     * Letter coordinate of chessboard.
     */
    private String letterCoordinate;

    /**
     * Constructor of class Coordinates.
     *
     * It takes two parameters:
     * 1. Used for setting letter coordinate of chessboard
     * 2. Used for setting numeric coordinate of chessboard
     *
     * This one just setting 2 coordinate-variables of class Coordinates.
     *
     * @param letterCoordinate - String symbol [A-H]
     * @param numberCoordinate - Integer symbol [1-8]
     */
    public Coordinates(String letterCoordinate, int numberCoordinate) {
        setLetterCoordinate(letterCoordinate);
        setNumberCoordinate(numberCoordinate);
    }

    /**
     * Constructor of class Coordinates.
     *
     * It takes two parameters:
     * 1. Used for setting letter coordinate of chessboard
     * 2. Used for setting numeric coordinate of chessboard
     *
     * This one convert first param (letterCoordinateNumber) into into char symbol [A-H]
     * and after just setting 2 coordinate-variables of class Coordinates.
     *
     * @param letterCoordinateNumber - Integer symbol [1-8] - converting into string symbol [A-H]
     * @param numberCoordinate - Integer symbol [1-8]
     */
    public Coordinates(int letterCoordinateNumber, int numberCoordinate) {
        setLetterCoordinateByNumber(letterCoordinateNumber);
        setNumberCoordinate(numberCoordinate);
    }

    /**
     * Constructor of class Coordinates.
     *
     * It takes one param:
     * 1. Used for setting 2 coordinates of chessboard
     *
     * This constructor use method setCoordinates() that takes string,
     * convert it into two symbols and setting into 2 coordinate-variables of class Coordinates.
     *
     * @param stringCoordinates - string type [A1-H8] (64 options)
     */
    public Coordinates(String stringCoordinates) {
        setCoordinates(stringCoordinates);
    }

    /**
     * Getter method for numeric coordinate of chessboard.
     *
     * @return Integer symbol [1-8]
     */
    public int getNumberCoordinate() {
        return numberCoordinate;
    }

    /**
     * Setter method for numeric coordinate of chessboard.
     *
     * @param numberCoordinate - Integer symbol [1-8]
     */
    public void setNumberCoordinate(int numberCoordinate) {
        this.numberCoordinate = numberCoordinate;
    }

    /**
     * Getter method for letter coordinate of chessboard.
     *
     * @return String symbol [A-H]
     */
    public String getLetterCoordinate() {
        return letterCoordinate;
    }

    /**
     * Setter method for letter coordinate of chessboard.
     *
     * @param letterCoordinate - String symbol [A-H]
     */
    public void setLetterCoordinate(String letterCoordinate) {
        this.letterCoordinate = letterCoordinate;
    }

    /**
     * Getter method for number of letter coordinate of chessboard.
     *
     * Getting index of letter coordinate from array list of letters and increment it (+1)
     *
     * @return Integer symbol [1-8]
     */
    public int getLetterCoordinateNumber() {
        return 1 + letters.indexOf(getLetterCoordinate());
    }

    /**
     * Setter method for letter coordinate of chessboard by index number.
     *
     * Used (letterCoordinateNumber - 1) for finding desired letter in array list of letters
     *
     * @param letterCoordinateNumber - Integer symbol [1-8]
     */
    public void setLetterCoordinateByNumber(int letterCoordinateNumber) {
        setLetterCoordinate(letters.get(letterCoordinateNumber - 1));
    }

    /**
     * Method toString() construct String of 2 symbols and return it.
     *
     * Use methods getter methods to take symbols and construct they in in string
     *
     * @return - string type [A1-H8] (64 options)
     */
    @Override
    public String toString() {
        return getLetterCoordinate() + getNumberCoordinate();
    }

    /**
     * Setter method for letter and numeric coordinates of chessboard.
     *
     * Getting string "stringCoordinates" and parse it into two symbols, that set as letterCoordinate and numberCoordinate.
     *
     * @param stringCoordinates - string type [A1-H8] (64 options)
     */
    public void setCoordinates(String stringCoordinates) {
        setLetterCoordinate(stringCoordinates.substring(0,1));
        setNumberCoordinate(Integer.parseInt(stringCoordinates.substring(1)));
    }

    /**
     * Static method parseCoordinates() return new Coordinates object
     *
     * @param stringCoordinates - string type [A1-H8] (64 options)
     * @return - object of this class [Coordinates]
     */
    public static Coordinates parseCoordinates(String stringCoordinates) {
        return new Coordinates(stringCoordinates);
    }
}
