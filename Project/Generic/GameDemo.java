package Generic;

import Bunco.BuncoTemplate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameDemo {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int playerCount = 0;
        int gameNumber = 0;

        System.out.println("How many players will be playing ?");
        playerCount = scanner.nextInt();

        System.out.println("What game will you be playing ? \n 1 - Bunco");
        gameNumber = scanner.nextInt();

        if (gameNumber == 1){
            BuncoTemplate buncoTemplate = new BuncoTemplate(playerCount, new ScoreBunco());
        }else{
            System.out.println("Invalid Option.");
        }
    }
}
