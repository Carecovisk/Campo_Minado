package Aplication;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t Campo minado \t");
        Game game = new Game(18);
        UI.printBoard(game);
    }
}