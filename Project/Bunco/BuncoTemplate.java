package Bunco;

import Generic.Context;
import Generic.Creator;
import Generic.Game;

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
