package com.bridgelaz;

import java.util.Random;

public class Problem4DeckOfCards {
    Random random = new Random();
    String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
    String[] rank ={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    public void distributeCards(){
        int suitIndex,rankIndex;
        String[][] result = new String[9][1];
        for (int i = 0;i<result.length;i++){
            for (int j = 0;j<result[i].length;j++) {
                suitIndex = random.nextInt(4);
                rankIndex = random.nextInt(13);
                result[i][j] = suit[suitIndex]+" "+rank[rankIndex];
            }
        }
        for (int k=0,i = 0;i<result.length;i++){
            for (int j = 0;j<result[i].length;j++) {
                k++;
                System.out.print("Card "+k+" : ");
                System.out.println( result[i][j]);
            }
        }
 
   }
}
class Main{
    public static void main(String[] args) {
        Problem4DeckOfCards player1 = new Problem4DeckOfCards();
        Problem4DeckOfCards player2 = new Problem4DeckOfCards();
        Problem4DeckOfCards player3 = new Problem4DeckOfCards();
        Problem4DeckOfCards player4 = new Problem4DeckOfCards();
        System.out.println("Cards for player 1");
        player1.distributeCards();
        System.out.println("Cards for player 2");
        player2.distributeCards();
        System.out.println("Cards for player 3");
        player3.distributeCards();
        System.out.println("Cards for player 4");
        player4.distributeCards();
    }
}
