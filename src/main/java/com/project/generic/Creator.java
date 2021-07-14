/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Creator.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-13
 Description: "Fabrique" class
 *******************************************************/
package main.java.com.project.generic;

public class Creator {

    /**
     * Method that creates a collection of players for the game
     * @param playerCount : indicates the amount of players in the game
     **/
    public Collection createPlayers(int playerCount)
    {
        Collection collection = new Collection();
        for(int i = 0; i < playerCount; i++)
        {
            Player p = new Player(i+1);
            collection.addObject(p);
        }
        return collection;
    }

    /**
     * Method that creates collection of dice for the game
     * @param faceCount : indicates the amount of players in the game
     **/
    public Collection createDice(int faceCount, int dieCount)
    {
        Collection collection = new Collection();
        for(int i = 0; i < dieCount; i++)
        {
            Die d = new Die(faceCount);
            collection.addObject(d);
        }
        return collection;
    }

    /**
     * Method that creates a game
     **/
    public Game createGame()
    {
        return new Game();
    }

}
