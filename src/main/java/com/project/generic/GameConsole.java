/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: GameDemo.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package main.java.com.project.generic;

import main.java.com.project.bunco.BuncoTemplate;

import java.io.InputStreamReader;
import java.util.Scanner;

public class GameConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int playerCount = 0;
        int gameNumber = 0;

        do {
            System.out.println("How many players will be playing ?");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number !");
                scanner.next();
            }
            playerCount = scanner.nextInt();
        } while (playerCount <= 0 );


        do {
            System.out.println("What game will you be playing ? \n 1 - Bunco");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number !");
                scanner.next();
            }
            gameNumber = scanner.nextInt();
        } while (gameNumber <= 0 );

        //more cases can be created for all the games.
        switch (gameNumber) {
            case 1 :
                playBunco();
            default:
                System.out.println("Invalid Option. Please try again.");
        }
    }
    
    private void playBunco() {
    	new BuncoTemplate(playerCount);
    }
}
