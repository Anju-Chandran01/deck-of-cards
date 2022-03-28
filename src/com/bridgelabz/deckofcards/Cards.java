package com.bridgelabz.deckofcards;

public class Cards {

    public static void main(String[] args) {

        final String[] SUITS = {"Diamond", "Heart", "Spades", "Club"};
        final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack" , "Queen", "King", "Ace"};

        String[][] cardCombo = new String[4][13];

        // CREATE TOTAL CARD COMBINATION
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardCombo[i][j] = SUITS[i] + RANK[j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(cardCombo[i][j] + " ");
                System.out.println();
            }
        }
    }
}
