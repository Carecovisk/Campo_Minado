package Aplication;

import java.util.function.BinaryOperator;

public class Game {
    private Square[][] board;

    public Game(int m) {
        this.board = new Square[m][m];
    }

    public Square[][] getBoard() {
        return board;
    }
}
