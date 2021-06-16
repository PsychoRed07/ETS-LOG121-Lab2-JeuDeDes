/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Player.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

public class Player implements Comparable<Player> {

    //attributes
    public int ID;
    public int turn;
    public int diceAmount;
    public int playerScore;

    public Player(int ID) {
        this.ID = ID;
    }

    //getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int compareTo(Player o) {
        return 0;
    }
}
