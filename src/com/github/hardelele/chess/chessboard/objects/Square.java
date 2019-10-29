package com.github.hardelele.chess.chessboard.objects;

import com.github.hardelele.chess.chessboard.figures.Figure;

/*
 TODO:: Make documentation for this code.
 TODO:: Rewrite code from git.
 */

public class Square {

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

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
