package com.bridgelabz.deckofcards;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Cards {

    public static void main(String[] args) {
        Cards cards = new Cards();
        int noOfPlayers = Players.noOfPlayers();
        cards.deck(noOfPlayers);
    }

    public static void deck(int noOfPlayers) {

        final String[] SUITS = {"Diamond", "Heart", "Spades", "Club"};
        final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] cardCombo = new String[4][13];
        String[][] player = new String[4][9];
        Set<String> cards = new HashSet<>();
        int k = 0, l = 0, m = 0, o = 0, num = 1;

        //CREATE CARD COMBINATION
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardCombo[i][j] = SUITS[i] + RANK[j];
            }
        }

        // Card combination for each
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 13; j++) {
//                System.out.print(cardCombo[i][j] + " ");
//                System.out.println("");
//            }
//        }

        //DISTRIBUTE 9 CARDS TO THE NO: OF PLAYERS
        while (num <= 9 * noOfPlayers) {

            Random random = new Random();
            int randomSuit = random.nextInt(4);
            int randomRank = random.nextInt(13);

            // SET AVOIDS DUPLICATION
            if (cards.add(cardCombo[randomSuit][randomRank])) {
                int option = num % noOfPlayers;
                switch (option) {
                    case 0:
                        player[option][k++] = cardCombo[randomSuit][randomRank];
                        break;
                    case 1:
                        player[option][l++] = cardCombo[randomSuit][randomRank];
                        break;
                    case 2:
                        player[option][m++] = cardCombo[randomSuit][randomRank];
                        break;
                    case 3:
                        player[option][o++] = cardCombo[randomSuit][randomRank];
                        break;
                }
                num++;
            }
        }

        for (int i = 0; i < noOfPlayers; i++) {
            System.out.print("Player " + (i + 1) + " : ");
            for (int j = 0; j < 9; j++) {
                System.out.print(player[i][j] + " ");
            }
            System.out.println();
        }
    }
}
