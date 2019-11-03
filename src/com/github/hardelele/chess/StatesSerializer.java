package com.github.hardelele.chess;

import com.github.hardelele.chess.chessbords.StateOfChessboard;

import java.io.*;

public class StatesSerializer {

    public void save(StateOfChessboard state, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(state);
        objectOutputStream.close();
    }

    public StateOfChessboard load(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        StateOfChessboard state = (StateOfChessboard) objectInputStream.readObject();
        objectInputStream.close();
        return state;
    }
}
