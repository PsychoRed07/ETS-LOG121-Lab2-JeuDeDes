/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: Game.java
 Date créé: 2021-06-18
 Date dern. modif. 2021-07-
 *******************************************************/
package Generic;

import java.util.Collections;
import java.util.Comparator;

public abstract class Game {
    //TODO - Change this
    Creator c = new Creator();

    private int turnNum = 1;
    Collection players = c.createPlayers(6);
    Collection dice = c.createDice(6,3);

    Iterator playersIterator = players.createIterator();
    Iterator dieIterator = dice.createIterator();

    public Game(){

    }

    public void calculateScoreRound(){
        System.out.println("-- Round " + turnNum + " --");

        while (playersIterator.hasNext()){
            Player player = (Player) playersIterator.next();
            int firstNum = ((Die) dice.getFirst()).getFaceRolled();
            int diceEqualToTurn =0 ;
            boolean isAllFaceEqual = true;
            boolean isEqualToTurnNum = false;

            System.out.print("Player "+ player.getID() + " rolled");
            while (dieIterator.hasNext()){
                Die die = (Die) dieIterator.next();
                die.rollDie();
                System.out.print(" " +die.getFaceRolled());
                // face equal to the turn +1 point (max 2 dice)
                if(die.getFaceRolled() == turnNum){
                    diceEqualToTurn += 1;
                }

                // 3 faces equal
                if(die.getFaceRolled() != firstNum){
                    isAllFaceEqual = false;
                }
            }

            System.out.println();
            //3 faces equal to turn
            if (diceEqualToTurn == dice.size()){
                player.setPlayerScore(21);
                System.out.println("Bunco ! player " + player.getID() + " has " + player.getPlayerScore() + " points");
            //3 faces equal
            }else if (isAllFaceEqual){
                player.setPlayerScore(player.getPlayerScore()+5);
                System.out.println("(all face equal) Turn number " + turnNum + " -- Added " + diceEqualToTurn + " points to player " + player.getID());
            //die equal to turn
            }else {
                player.setPlayerScore(player.getPlayerScore() + diceEqualToTurn);
                System.out.println("(dice equal to turn) Turn number " + turnNum + " -- Added " + diceEqualToTurn + " points to player " + player.getID());
            }

        }
        turnNum += 1;
    }

    public void calculateTheWinner(){
        while (playersIterator.hasNext()){
            Player player = (Player) playersIterator.next();
            players.sort();
        }

        while (playersIterator.hasNext()){
            Player player = (Player) playersIterator.next();
            System.out.println(player.getPlayerScore());
        }
    }

}
