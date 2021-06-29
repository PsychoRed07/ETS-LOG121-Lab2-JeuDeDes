package Generic;

public class Context {

    private IStrategy strategy;
    Game game = new Game();
    public Context(Game game){
        this.game = game;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeCalculateScoreRound(){
        strategy.calculateScoreRound(game);
    }

    public void executeCalculateTheWinner(){
        strategy.calculateTheWinner(game);
    }
}
