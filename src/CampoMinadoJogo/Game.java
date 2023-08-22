package CampoMinadoJogo;

import CampoMinadoJogo.Square;

public class Game {
    private final Square[][] board;
    private Boolean isTheGameFinished;

    public Game(int m) {
        this.board = new Square[m][m];
        this.isTheGameFinished = false;
    }

    public Square[][] getBoard() {
        return board;
    }

    public Boolean getTheGameFinished() {
        return isTheGameFinished;
    }

    public void setTheGameFinished(Boolean theGameFinished) {
        isTheGameFinished = theGameFinished;
    }
}
