package com.github.hardelele.chess.figures;

import com.github.hardelele.chess.ChessApplication;
import com.github.hardelele.chess.chessbords.impl.Coordinates;

import java.util.ArrayList;

public abstract class FigureImpl implements Figure {

    private ArrayList<String> movesList = new ArrayList<>();

    private ArrayList<String> attacksList = new ArrayList<>();

    private Coordinates coordinates;

    private int id;

    private String color;

    public FigureImpl(int id, String color, int letterCoordinateNumber, int numberCoordinate) {
        setId(id);
        setCoordinates(letterCoordinateNumber,numberCoordinate);
        setColor(color);
    }

    protected boolean isChessboardEnd(Coordinates moveCoords) {
        boolean isTopBorder = moveCoords.getLetterCoordinateNumber() >= 8;
        boolean isBottomBorder = moveCoords.getLetterCoordinateNumber() < 0;
        boolean isRightBorder = moveCoords.getNumber() >= 8;
        boolean isLeftBorder = moveCoords.getNumber() < 0;
        return isBottomBorder||isLeftBorder||isRightBorder||isTopBorder;
    }

    @Override
    public void cleanMovesList() {
        movesList = new ArrayList<>();
    }

    @Override
    public void cleanAttackList() {
        attacksList = new ArrayList<>();
    }

    @Override
    public void addOneMove(String coords) {
        movesList.add(coords);
    }

    @Override
    public void addOneAttack(String coords) {
        attacksList.add(coords);
    }

    @Override
    public ArrayList<String> getMovesList() {
        return movesList;
    }

    @Override
    public ArrayList<String> getAttacksList() {
        return attacksList;
    }

    @Override
    public void setCoordinates(int letterCoordinateNumber, int numberCoordinate) {
        coordinates = new Coordinates(letterCoordinateNumber, numberCoordinate);
    }

    @Override
    public String getCoordinatesInChessNotation() {
        return coordinates.toString();
    }

    @Override
    public int getLetterCoordinateNumber() {
        return coordinates.getLetterCoordinateNumber();
    }

    @Override
    public int getNumericCoordinateNumber() {
        return coordinates.getNumber();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
