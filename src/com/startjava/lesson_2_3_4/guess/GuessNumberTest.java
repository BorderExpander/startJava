package com.startjava.lesson_2_3_4.guess;
import java.util.Scanner;

public class GuessNumberTest {
    public static final int NUM_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers());
        String answer = "";
        do {
            game.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < NUM_PLAYERS; i++) {
            System.out.printf("Игрок %S, введите имя: ", i + 1);
            players[i] = new Player(scan.nextLine());
        }
        return players;
    }
}