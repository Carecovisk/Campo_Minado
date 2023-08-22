package Application;

import CampoMinadoJogo.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t Campo minado \t");
        Game game = new Game(UI.start());

        while (!game.getTheGameFinished()) {
            UI.printBoard(game);
            System.out.println("do something!");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            UI.clearScreen();
        }
    }
}