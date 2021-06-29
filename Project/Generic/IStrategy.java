package Generic;

public interface IStrategy {

    /**
     * Calculate the score of a player for only 1 turn.
     * @param game
     */
    void calculateScoreRound(Game game);

    /**
     * Calculate the winner of the game.S
     * @param game
     */
    void calculateTheWinner(Game game);

}
