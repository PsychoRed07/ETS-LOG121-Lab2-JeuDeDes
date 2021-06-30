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
package Generic;

import Bunco.BuncoTemplate;

import java.io.InputStreamReader;
import java.util.Scanner;

public class GameDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int playerCount;
        int gameNumber;

        System.out.println("How many players will be playing ?");
        playerCount = scanner.nextInt();

        System.out.println("What game will you be playing ? \n 1 - Bunco");
        gameNumber = scanner.nextInt();

        if (gameNumber == 1){
            new BuncoTemplate(playerCount);
        }else{
            System.out.println("Invalid Option.");
        }
    }
}
