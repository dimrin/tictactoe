package com.vadimdobryn.tic_tac_toe.engine;

import java.util.Scanner;

public class TicTacToeEngine {

    private final Scanner scanner = new Scanner(System.in);

    private char turn = 'X';

    private boolean isWin = false;

    public void run() {
        char[] gameField = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        for (int i = 0; i < gameField.length; i++) {
            drawField(gameField);
            if (isWin) {
                break;
            }
        }
        System.out.println("The Game is done");
    }

    private void drawField(char[] gameField) {
        System.out.print(turn + " enter a position: ");
        int input = scanner.nextInt();

        gameField[input - 1] = turn;

        System.out.println(" " + gameField[6] + " | " + gameField[7] + " | " + gameField[8] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + gameField[3] + " | " + gameField[4] + " | " + gameField[5] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + gameField[0] + " | " + gameField[1] + " | " + gameField[2] + " ");
        winnerCheck(gameField);
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';
        }

    }

    private void winnerCheck(char[] gameField) {
        if (gameField[0] == turn && gameField[1] == turn && gameField[2] == turn
                || gameField[3] == turn && gameField[4] == turn && gameField[5] == turn
                || gameField[6] == turn && gameField[7] == turn && gameField[8] == turn
                || gameField[6] == turn && gameField[3] == turn && gameField[0] == turn
                || gameField[7] == turn && gameField[4] == turn && gameField[1] == turn
                || gameField[8] == turn && gameField[5] == turn && gameField[2] == turn
                || gameField[6] == turn && gameField[4] == turn && gameField[2] == turn
                || gameField[8] == turn && gameField[4] == turn && gameField[0] == turn) {
            System.out.println(turn + " is the WINNER");
            isWin = true;
        }
    }
}
