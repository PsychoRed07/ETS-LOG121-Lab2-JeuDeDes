package Bunco;

import Generic.Context;
import Generic.Game;
import Generic.IStrategy;

public class BuncoTemplate {

    Game game = new Game();
    int numberOfMaxRounds = 6;

    /**
     * Template used to create a bunco game with it's rules.
     * @param playerNumber
     * @param strategy
     */
    public BuncoTemplate (int playerNumber, IStrategy strategy){
        game.setPlayers(game.initializePlayers(playerNumber));
        game.setDice(game.initializeDice(6,3));
        game.setNumberOfMaxTurns(numberOfMaxRounds);

        Context context = new Context(game);
        context.setStrategy(strategy);

        for (int i = 0; i < game.getNumberOfMaxTurns(); i++) {
            context.executeCalculateScoreRound();
        }

        context.executeCalculateTheWinner();
    }

}
