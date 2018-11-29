package com.company;
import java.util.*;

public class CodeBreaker {
    private static List<String> allCombinations = new ArrayList<String>();
    private static final String[] letters = new String[6];
    private static String player;

    public CodeBreaker(String p) {
        player = p;
        showGame();
        getGuess();
    }

    public static void showGame() {
        System.out.println("---");
        System.out.println("Welcome to Mastermind, " + player + "!");
        System.out.println("---");
        letters[0] = "R";
        letters[1] = "G";
        letters[2] = "U";
        letters[3] = "O";
        letters[4] = "Y";
        letters[5] = "W";
        getAllCombinations();
        showAllRules();
    }

    public static void showAllRules() {
        System.out.println("Displaying Rules to the Game Mastermind:");
        System.out.println("---");
        showGameRules();
    }

    public static void showGameRules() {
        System.out.println("---");
        System.out.println("This is a Board game created by Mordecai Meirowitz.");
        System.out.println("---");
        System.out.println("There are 2 players, the Codemaker and the Codebreaker.");
        System.out.println("---");
        System.out.println("The goal of the Codemaker is create a secret code of 4 pegs with 6 colors to choose from.");
        System.out.println("---");
        System.out.println("The 6 colors are Red, Blue, Green, Orange, White, and Yellow.");
        System.out.println("---");
        System.out.println("For example, the Codemaker can have his/her secret be Red, Blue, Green, Green.");
        System.out.println("---");
        showPlayerRules();
        System.out.println("Have fun!");
    }

    public static void showPlayerRules() {
        System.out.println(player + ", you are playing as the Codebreaker.");
        System.out.println("---");
        System.out.println("And it is your goal to guess the opponents secret code as quickly as possible.");
        System.out.println("---");
        System.out.println("After you guess the secret code, the Codemaker will tell you how close your guess was to the answer.");
        System.out.println("---");
    }

    public static String getGuess() {
        System.out.println("---");
        System.out.println("What is your first guess?");
        String guess;
        Scanner getGuess = new Scanner(System.in);
        guess = getGuess.nextLine();
        if (allCombinations.contains(guess)) {
            System.out.println("That's a good guess!");
            System.out.println("---");
            System.out.println(player + " guessed " + guess + ".");
            return guess;
        } else {
            System.out.println("---");
            System.out.println("Try again please.");
            return getGuess();
        }
    }
    public static void getAllCombinations() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 6; l++) {
                        String possible = letters[i]+letters[j]+letters[k]+letters[l];
                        allCombinations.add(possible);
                    }
                }
            }
        }
    }
}
