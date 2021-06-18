/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: PlayerCollection.java
 Date créé: 2021-06-17
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

import java.util.Arrays;
import java.util.Collections;

public class PlayerCollection {

    //attributes
    Player[] playerArr;

    //getters and setters
    public Player[] getPlayerArr() {
        return playerArr;
    }

    public void setPlayerArr(Player[] playerArr) {
        this.playerArr = playerArr;
    }

    /**
     * player collection is created in creator class
     */
    public PlayerCollection() {
    }

    public PlayerCollection(Player[] playerCollection) {
        this.playerArr = playerCollection;
    }

    /**
     * Method to add a player to the collection
     * @param p: player to add
     * @param position: position where to add player
     */
    public void addPlayer(Player p, int position)
    {
            if(playerArr.length > 0)
                playerArr[position] = p;
    }

    public Player getHighestScorePlayer()
    {
        //TODO - remove print tests
        System.out.println("Before sorting: " + Arrays.toString(playerArr));
        Arrays.sort(playerArr);
        System.out.println("After sorting: " + Arrays.toString(playerArr));
        return playerArr[0];
    }


    //TODO - implement when iterator is done
    /*public PlayerIterator createIterator()
    {

    }*/
}
