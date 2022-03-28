package com.bridgelabz.deckofcards;

import java.util.Scanner;

public class Players {

    public static int noOfPlayers(){

        System.out.println("Choose no: of players :");
        Scanner sc = new Scanner(System.in);
        int noOfPlayer = sc.nextInt();

        if(1 < noOfPlayer && noOfPlayer < 5) {
            return noOfPlayer;
        }
        else {
            System.out.println("Invalid no: of players");
            return 0;
        }
    }
}
