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

    static int playerCount = 0;
    static int gameNumber = 0;
    static Scanner scanner = new Scanner(new InputStreamReader(System.in));

    /**
     * The main, runs the application.
     * @param args
     */
    public static void main(String[] args) {
        runGame();
    }

    /**
     * runs the game.
     */
    public static void runGame(){
        String quit = "";

        while (!quit.equals("n")){
            init();

            //more cases can be created for all the games.
            switch (gameNumber) {
                case 1:
                    new BuncoTemplate(playerCount);
                    break;
                default:
                    System.out.println("Invalid Option. Please try again.");
            }

            System.out.println("\nWould you like to continue playing ? (y/n)");
            quit = scanner.next();
        }
        System.out.println("Thank you !");
    }

    /**
     * Initializes the main components for the game.
     */
    public static void init(){
        do {
            System.out.println("How many players will be playing ?");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number !");
                scanner.next();
            }
            playerCount = scanner.nextInt();
        } while (playerCount <= 0);


        do {
            System.out.println("What game will you be playing ? \n 1 - Bunco");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number !");
                scanner.next();
            }
            gameNumber = scanner.nextInt();
        } while (gameNumber <= 0);
    }

}
