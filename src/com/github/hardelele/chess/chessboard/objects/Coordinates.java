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
        setNumber(1);
        setLetter("A");
    }


    /**
     * Constructor: public Coordinates(int number, String letter)
     *
     * This one initialize variables letter and number as passed parameters - int number and String letter.
     * Used methods setNumber() and setLetter(), that do what is written in their name.
     * @param number
     * @param letter
     */
    public Coordinates(int number, String letter) {
        setNumber(number);
        setLetter(letter);
    }

    /**
     * Constructor: public Coordinates(String coords)
     *
     * This one initialize variables letter and number.
     * Taking them from the coords String, using the method setCoords(String coords).
     * @param coords string type: [A1-H8] (64 options)
     */
    public Coordinates(String coords) {
        setCoords(coords);
    }

    /**
     * Getter for numerical coordinate
     * @return integer value [1-8] (8 options)
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter for numerical coordinate
     * @param number - integer value [1-8] (8 options)
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for literal coordinate
     * @return string value [A-H] (8 options)
     */
    public String getLetter() {
        return letter;
    }

    /**
     * Setter for literal coordinate
     * @param letter - string type: [A-H] (8 options)
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * @Override method Object.toString()
     * @return string type: [A1-H8] (64 options).
     */
    @Override
    public String toString() {
        return letter + number;
    }

    /**
     * Set letter and number, using String of coords.
     * @param coords - string type: [A1-H8] (64 options)
     */
    public void setCoords(String coords) {
        setLetter(coords.substring(0,1));
        setNumber(Integer.parseInt(coords.substring(1)));
    }

    /**
     * Static method - parse coordinates from String.
     * @param coords - string type: [A1-H8] (64 options)
     * @return new object of class: Coordinates
     */
    public static Coordinates parseCoords(String coords) {
        return new Coordinates(coords);
    }
}
