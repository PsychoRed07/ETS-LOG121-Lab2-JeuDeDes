package Bunco;

import Generic.Creator;
import Generic.DieCollection;
import Generic.PlayerCollection;

public class Bunco {

    public static void main(String[] args) {

        //TODO - Remove tests
        //TEST - CREATOR
        Creator creator = new Creator();

        PlayerCollection playerCollection = creator.createPlayers(3);
        //set players scores
        playerCollection.getPlayerArr()[0].setPlayerScore(2);
        playerCollection.getPlayerArr()[1].setPlayerScore(10);
        playerCollection.getPlayerArr()[2].setPlayerScore(5);
        //sort players by score
        System.out.println("Winner is player "+playerCollection.getHighestScorePlayer().getID());

        DieCollection dieCollection = creator.createDice(6,5);
        //roll each dice
        dieCollection.getDieArr()[0].rollDie();
        dieCollection.getDieArr()[1].rollDie();
        dieCollection.getDieArr()[2].rollDie();
        dieCollection.getDieArr()[3].rollDie();
        dieCollection.getDieArr()[4].rollDie();
        //sort dice by roll
        System.out.println("Highest roll is "+dieCollection.getHighestRollDie().getFaceRolled());
    }

}
