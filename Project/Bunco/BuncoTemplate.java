package Bunco;

import Generic.Context;
import Generic.Game;
import Generic.ScoreBunco;

public class BuncoTemplate {

    final Game game = new Game();
    final int numberOfMaxRounds = 6;

    /**
     * Template used to create a bunco game with its rules.
     * @param playerNumber the number of players in a game
     */
    public BuncoTemplate (int playerNumber){
        game.setPlayers(game.initializePlayers(playerNumber));
        game.setDice(game.initializeDice(6,3));
        game.setNumberOfMaxTurns(numberOfMaxRounds);

        Context context = new Context(game);
        context.setStrategy(new ScoreBunco());

        for (int i = 0; i < game.getNumberOfMaxTurns(); i++) {
            context.executeCalculateScoreRound();
        }

        context.executeCalculateTheWinner();
    }

}
