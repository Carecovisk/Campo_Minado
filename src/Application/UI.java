package Application;

import CampoMinadoJogo.Game;

import java.util.Scanner;

public class UI {
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";

    static public int start() {
        System.out.println("Chose the difficulty:");
        System.out.println("Easy (10 x 10): Type E");
        System.out.println("Medium (18 x 18): Type M");
        System.out.println("Hard (24 x 24): Type H");
        System.out.print("-> ");

        Scanner scanner = new Scanner(System.in);
         char r =  scanner.nextLine().toLowerCase().charAt(0);

        switch (r) {
            case 'e':
                return 10;
            case 'm':
                return 18;
            case 'h':
                return 24;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    static public void printBoard(Game game) {
        for (int i = 0; i < game.getBoard().length; i++) {
            for (int j = 0; j < game.getBoard().length; j++) {
                System.out.print(ANSI_BLUE_BACKGROUND + " B " + ANSI_RESET);
            }
            System.out.println();
        }
    }
}
