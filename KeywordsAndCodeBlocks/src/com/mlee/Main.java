package com.mlee;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;

//        if (gameover)
//            System.out.println("Yada");
//
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//        int finalScore = score + (levelCompleted * bonus);
//
//        System.out.println("Second score = " + finalScore);

        int position = calcPos(1500);
        displayHighScorePosition("Player A",position);

        position = calcPos(900);
        displayHighScorePosition("Player B",position);

        position = calcPos(400);
        displayHighScorePosition("Player C",position);

        position = calcPos(50);
        displayHighScorePosition("Player D",position);
    }

    public static void displayHighScorePosition(String playerName,int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calcPos (int playerScore) {
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500 && playerScore < 1000)
            return 2;
        else if (playerScore >= 100 && playerScore < 500)
            return 3;
        else
            return 4;
    }
}