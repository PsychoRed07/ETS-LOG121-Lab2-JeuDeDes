/******************************************************
 Cours:   LOG121
 Session: E2021
 Groupe:  01
 Projet: TP #2
 Étudiant(e)s: Ariane Ouellette, Hicham Belkaid, Megane Darnaud, Karim Ibrahim
 Professeur : Vincent Lacasse
 Nom du fichier: BuncoTemplate.java
 Date créé: 2021-06-20
 Date dern. modif. 2021-07-13
 *******************************************************/
package main.java.com.project.bunco;

import main.java.com.project.generic.Context;
import main.java.com.project.generic.Creator;
import main.java.com.project.generic.Game;

public class BuncoTemplate {

    final int NUMBER_OF_MAX_ROUNDS = 6;

    /**
     * Template used to create a bunco game with its rules.
     * @param playerNumber the number of players in a game
     */
    public BuncoTemplate (int playerNumber){
        Game game = new Creator().createGame();
        game.setPlayers(game.initializePlayers(playerNumber));
        game.setDice(game.initializeDice(6,3));
        game.setNumberOfMaxTurns(NUMBER_OF_MAX_ROUNDS);

        Context context = new Context(game);
        context.setStrategy(new StrategyBunco());

        for (int i = 0; i < game.getNumberOfMaxTurns(); i++) {
            context.executeCalculateScoreRound();
        }

        context.executeCalculateTheWinner();
    }

}
