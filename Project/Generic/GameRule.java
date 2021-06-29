package Generic;

import java.util.Collections;

public abstract class GameRule {
    private int numberOfMaxTurns = 5;
    private int numberOfTurn = 1;

    Collection players = new Collection();
    Collection dice = new Collection();

    Iterator playerIterator ;
    Iterator diceIterator;

    Creator creator = new Creator();

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

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

    public Collection initializePlayers(int numberOfPlayers){
        players = creator.createPlayers(numberOfPlayers);
        return players;
    }

    public Collection initializeDice(int faceCount,int numberOfDice){
        dice = creator.createDice(faceCount, numberOfDice);
        return dice;
    }

    public int initializeRound(int numberOfRounds){
        numberOfMaxTurns = numberOfRounds;
        return numberOfMaxTurns;
    }

}
