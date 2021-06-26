/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Bunco.java
 Date créé: 2021-06-17
 Date dern. modif. 2021-07-
 *******************************************************/
package Bunco;

import Generic.*;

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

        //Test sum of all dice
        System.out.println("The sum of all the rolls is: "+dieCollection.getSumOfRolls());

        //Collection + iterator vibes
        Collection collection = new Collection();

        collection.addObject(new Player(1));
        collection.addObject(new Player(2));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()){
          Player player = (Player) iterator.next();
            System.out.println(player.getID());
        }

    }

}
