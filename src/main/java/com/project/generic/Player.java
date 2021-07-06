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
package main.java.com.project.generic;

public class Player implements Comparable<Player>{

    //attributes
    private int ID;
    private int turn;
    private int diceAmount;
    private int playerScore = 0;

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

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getDiceAmount() {
        return diceAmount;
    }

    public void setDiceAmount(int diceAmount) {
        if(diceAmount >= 0)
            this.diceAmount = diceAmount;
        else
            this.diceAmount = 0;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    /**
     * This method overrides the compareTo method to sort the score from biggest to lowest
     * @param p player to compare
     * @return
     * score > 0 --> second player has a higher score
     * score == 0 --> score is equal
     * score < 0 --> first player has a higher score
     */
    @Override
    public int compareTo(Player p) {
            return p.playerScore - this.playerScore ;
    }

    /**
     * This method pieces the player ID and score as a string
     * @return string of player ID and score
     */
    @Override
    public String toString() {
        return "Player{" +
                "ID=" + ID +
                ", playerScore=" + playerScore +
                '}';
    }
}
