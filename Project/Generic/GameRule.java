/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: GameRule.java
 Date créé: 2021-06-16
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

public abstract class GameRule {
    private int numberOfMaxTurns = 5;
    private int numberOfTurn = 1;

    Collection players = new Collection();
    Collection dice = new Collection();

    Iterator playerIterator ;
    Iterator diceIterator;

    final Creator creator = new Creator();

    public Iterator getPlayerIterator() {
        return players.createIterator();
    }

    public void setPlayerIterator(Iterator playerIterator) {
        this.playerIterator = playerIterator;
    }

    public Iterator getDiceIterator() {
        return dice.createIterator();
    }

    public void setDiceIterator(Iterator diceIterator) {
        this.diceIterator = diceIterator;
    }

    public int getNumberOfTurn() {
        return numberOfTurn;
    }

    public void setNumberOfTurn(int numberOfTurn) {
        this.numberOfTurn = numberOfTurn;
    }

    public int getNumberOfMaxTurns() {
        return numberOfMaxTurns;
    }

    public void setNumberOfMaxTurns(int numberOfMaxTurns) {
        this.numberOfMaxTurns = numberOfMaxTurns;
    }

    public Collection getPlayers() {
        return players;
    }

    public void setPlayers(Collection players) {
        this.players = players;
    }

    public Collection getDice() {
        return dice;
    }

    public void setDice(Collection dice) {
        this.dice = dice;
    }

    /**
     * Initialize the number of players that will be playing the game.
     * @param numberOfPlayers the number of players that will be playing
     * @return returns a collection of players.
     */
    public Collection initializePlayers(int numberOfPlayers){
        players = creator.createPlayers(numberOfPlayers);
        return players;
    }

    /**
     * Initialize the number of dice and the number of faces each dice will have in a game.
     * @param faceCount the number of faces on a die.
     * @param numberOfDice the number of die needed.
     * @return returns a collection of Die.
     */
    public Collection initializeDice(int faceCount,int numberOfDice){
        dice = creator.createDice(faceCount, numberOfDice);
        return dice;
    }

}
