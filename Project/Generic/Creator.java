/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Creator.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

import java.util.ArrayList;

public class Creator {

    /**
     * Method that creates a player
     * @param
     **/
    public Player createPlayer(int playerID)
    {
        Player p = new Player(playerID);
        return p;
    }

    /**
     * Method that creates players for the game
     * @param playerCount : indicates the amount of players in the game
     **/
    public Player[] createPlayers(int playerCount)
    {
        Player[] playerArr = new Player[playerCount];
        for(int i = 0; i < playerCount; i++)
        {
            //use count as player ID
            Player p = createPlayer(i); //TODO - check if createPlayer is necessary
            playerArr[i] = p;
        }

        return playerArr;
    }

    /**
     * Method that creates a die
     * @param faceCount : indicates the amount of faces in a die
     **/
    public Die createDie(int faceCount)
    {
        Die d = new Die(faceCount);
        return d;
    }

    /**
     * Method that creates dice for the game
     * @param faceCount : indicates the amount of players in the game
     **/
    public Die[] createDice(int faceCount, int dieCount)
    {
        Die[] dieArr = new Die[dieCount];
        for(int i = 0; i < dieCount; i++)
        {
            Die d = createDie(faceCount); //TODO - check if createDie is necessary
            dieArr[i] = d;
        }

        return dieArr;
    }

    //TODO - implement when game class is created
    /**
     * Method that creates a game
     **/
    /*public Game createGame()
    {
        Game g = new Game();
        return g;
    }*/

}
