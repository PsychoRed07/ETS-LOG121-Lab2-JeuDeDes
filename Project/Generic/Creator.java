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
 Description: "Fabrique" class
 *******************************************************/
package Generic;

public class Creator {

    /**
     * Method that creates a player
     * @param
     **/
    private Player createPlayer(int playerID)
    {
        Player p = new Player(playerID);
        return p;
    }

    /**
     * Method that creates a collection of players for the game
     * @param playerCount : indicates the amount of players in the game
     **/
    public PlayerCollection createPlayers(int playerCount)
    {
        PlayerCollection playerCollection = new PlayerCollection();
        //initialize the array with count of players
        playerCollection.playerArr = new Player[playerCount];
        for(int i = 0; i < playerCount; i++)
        {
            Player p = createPlayer(i); //TODO - check if createPlayer is necessary
            playerCollection.addPlayer(p,i);
        }
        return playerCollection;
    }

    /**
     * Method that creates a die
     * @param faceCount : indicates the amount of faces in a die
     **/
    private Die createDie(int faceCount)
    {
        Die d = new Die(faceCount);
        return d;
    }

    /**
     * Method that creates collection of dice for the game
     * @param faceCount : indicates the amount of players in the game
     **/
    public DieCollection createDice(int faceCount, int dieCount)
    {
        DieCollection dieCollection = new DieCollection();
        //initialize the array with count of dice
        dieCollection.dieArr = new Die[dieCount];
        for(int i = 0; i < dieCount; i++)
        {
            Die d = createDie(faceCount); //TODO - check if createDie is necessary
            dieCollection.addDie(d,i);
        }
        return dieCollection;
    }

    //TODO - precise method when game class is implemented
    /**
     * Method that creates a game
     **/
    public Game createGame()
    {
        Game g = new Game();
        return g;
    }

}
