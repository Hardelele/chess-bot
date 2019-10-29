package com.github.hardelele.chess.chessboard.objects;

import com.github.hardelele.chess.chessboard.figures.Figure;

/*
 TODO:: Make documentation for this code.
 TODO:: Rewrite code from git.
 */

public class Square {

    enum ableToMove {

        white(0), black(0);

        int count;

        ableToMove(int count) {
            setCount(count);
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    Coordinates coordinates;

    Figure figure;

    public Square() {
        setFigure(null);
        setCoordinates(new Coordinates());
    }

    public Square(String coords) {
        setFigure(null);
        setCoordinates(new Coordinates(coords));
    }

    public Square(int number, String letter) {
        setFigure(null);
        setCoordinates(new Coordinates(number,letter));
    }

    public Square(Coordinates coordinates) {
        setFigure(null);
        setCoordinates(coordinates);
    }

    public Square(Figure figure) {
        setFigure(figure);
        setCoordinates(new Coordinates());
    }

    public Square(int number, String letter, Figure figure) {
        setFigure(figure);
        setCoordinates(new Coordinates(number,letter));
    }

    public Square(Coordinates coordinates, Figure figure) {
        setFigure(figure);
        setCoordinates(coordinates);
    }

    public Square(String coords, Figure figure) {
        setFigure(figure);
        setCoordinates(new Coordinates(coords));
    }

    /**
     * Getter for coordinates
     * @return object of class coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Setter for coordinates
     * @param coordinates - object of class Coordinates
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Getter for figure
     * @return object of class Figure
     */
    public Figure getFigure() {
        return figure;
    }

    /**
     * Setter for figure
     * @param figure - object of class Figure
     */
    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
