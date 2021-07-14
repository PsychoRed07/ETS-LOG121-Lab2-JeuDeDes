/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: StrategyBunco.java
 Date créé: 2021-06-20
 Date dern. modif. 2021-07-13
 *******************************************************/
package main.java.com.project.bunco;

import main.java.com.project.generic.Die;
import main.java.com.project.generic.Game;
import main.java.com.project.generic.IStrategy;
import main.java.com.project.generic.Player;

public class StrategyBunco implements IStrategy {

    final int BUNCO_POINTS = 21;
    final int EQUAL_FACES_POINTS = 5;
    private int currentRoundScore;
    private int winnerId;

    public int getWinner() {
        return winnerId;
    }

    public void setWinner(int winner) {
        this.winnerId = winner;
    }

    public void setCurrentRoundScore(int currentRoundScore) {
        this.currentRoundScore = currentRoundScore;
    }

    public int getCurrentRoundScore() {
        return currentRoundScore;
    }

    /**
     * Calculate the score of a player for only 1 turn.
     * @param game Uses the params in game to calculate the score
     */
    @Override
    public void calculateScoreRound(Game game){
        System.out.println("\n-- Round " + game.getNumberOfTurn() + " --");

        if(game.getNumberOfMaxTurns() < game.getNumberOfTurn()){
            System.out.println("The game has ended !");
            return;
        }

        while (game.getPlayerIterator().hasNext()){

            boolean isNextPlayerTurn = false;
            Player player = (Player) game.getPlayerIterator().next();
            int diceEqualToTurn =0 ;
            boolean isAllFaceEqual = true;

            while(!isNextPlayerTurn){

                boolean hasScored = false;

                System.out.print("Player "+ player.getID() + " rolled");

                while (game.getDiceIterator().hasNext()){
                    Die die = (Die) game.getDiceIterator().next();
                    die.rollDie();
                    System.out.print(" " +die.getFaceRolled());
                    // face equal to the turn +1 point (max 2 dice)
                    if(die.getFaceRolled() == game.getNumberOfTurn()){
                        diceEqualToTurn += 1;
                    }

                    // 3 faces equal
                    if(die.getFaceRolled() != ((Die) game.getDice().getFirst()).getFaceRolled()){
                        isAllFaceEqual = false;
                    }
                }

                System.out.println();
                //3 faces equal to turn
                if (diceEqualToTurn == game.getDice().size()){
                    player.setPlayerScore(player.getPlayerScore() + 21);
                    System.out.println("--------------");
                    System.out.println("|   BUNCO!!  |");
                    System.out.println("--------------");
                    System.out.println("Added " + BUNCO_POINTS +  "points to player " + player.getID() + "\n");
                    setCurrentRoundScore(getCurrentRoundScore() + BUNCO_POINTS);
                    diceEqualToTurn = 0;
                    hasScored = true;
                    isNextPlayerTurn = true;
                    //3 faces equal
                }else if (isAllFaceEqual){
                    player.setPlayerScore(player.getPlayerScore() + 5);
                    System.out.println("----------------------");
                    System.out.println("|   ALL EQUAL FACES  |");
                    System.out.println("----------------------");
                    System.out.println("Added " + EQUAL_FACES_POINTS +  " points to player " + player.getID() + "\n");
                    setCurrentRoundScore(getCurrentRoundScore() + EQUAL_FACES_POINTS);
                    diceEqualToTurn = 0;
                    //die equal to turn
                }else {
                    player.setPlayerScore(player.getPlayerScore() + diceEqualToTurn);
                    if(diceEqualToTurn > 0){
                        hasScored = true;
                    }
                    System.out.println("Added " + diceEqualToTurn + " points to player " + player.getID() + "\n");
                    setCurrentRoundScore(getCurrentRoundScore() + diceEqualToTurn);
                    diceEqualToTurn = 0;
                }

                if(!hasScored){
                    isNextPlayerTurn = true;
                }

            }
        }
        game.setNumberOfTurn(game.getNumberOfTurn() + 1 );
    }

    /**
     * Calculate the winner of the game.
     * @param game Uses the params in game to calculate the winner
     */
    @Override
    public void calculateTheWinner(Game game){
        game.getPlayers().sortDescending();
        boolean isDraw = false;
        boolean isFirstIteration = true;

        System.out.println("\n-- Score Board --");
        while (game.getPlayerIterator().hasNext()){
            Player player = (Player) game.getPlayerIterator().next();
            if(((Player) game.getPlayers().getFirst()).getPlayerScore() == player.getPlayerScore() && !isFirstIteration){
                isDraw = true;
            }
            System.out.println("Player " + player.getID() + " has " + player.getPlayerScore() + " points !");
            isFirstIteration = false;
        }
        if(isDraw){
            System.out.println("\nThe game is a draw!");
        }else{
            System.out.println("\nThe winner is player " + ((Player) game.getPlayers().getFirst()).getID() + " with " + ((Player) game.getPlayers().getFirst()).getPlayerScore() + " points !");
            setWinner(((Player) game.getPlayers().getFirst()).getID());
        }
    }

}
