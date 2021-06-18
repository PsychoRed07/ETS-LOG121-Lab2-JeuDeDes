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

public class PlayerCollection {

    //attributes
    Player[] playerArr;

    public PlayerCollection() {
    }

    public PlayerCollection(Player[] playerCollection) {
        this.playerArr = playerCollection;
    }

    public void addPlayer(Player p, int position)
    {
            if(playerArr.length > 0)
                playerArr[position] = p;
    }

    //TODO - implement when iterator is done
    /*public PlayerIterator createIterator()
    {

    }*/
}
