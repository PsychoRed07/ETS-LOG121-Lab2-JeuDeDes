package main.java.com.project.bunco;

import main.java.com.project.generic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class StrategyBuncoTest {
    private Collection collectionDice;
    private Collection collectionPlayers;
    private Iterator iteratorDice;
    private Iterator iteratorPlayer;
    private Creator creator;
    private Game game;

    @BeforeEach
    public void doBefore(){
        //Arrange
        creator = new Creator();
        game = creator.createGame();
        game.setNumberOfMaxTurns(1);

    }

    //Cette methode teste tout les points possibles (21,5,0,etc..)
    @Test
    void calculateScoreRound(){

        //Arrange
        collectionDice = creator.createDice(6,3);
        collectionPlayers = creator.createPlayers(1);
        iteratorDice = collectionDice.createIterator();
        iteratorPlayer = collectionPlayers.createIterator();
        game.setPlayers(collectionPlayers);
        game.setDice(collectionDice);

        //Act
        Context context = new Context(game);
        context.setStrategy(new StrategyBunco());
        context.executeCalculateScoreRound();
        int roundScore = context.getCurrentRoundScore();

        //Assert
        assertEquals(roundScore,((Player)game.getPlayers().getFirst()).getPlayerScore());

    }

    @Test
    void calculateTheWinner() {

        //Arrange
        collectionPlayers = creator.createPlayers(4);
        iteratorPlayer = collectionPlayers.createIterator();
        game.setPlayers(collectionPlayers);

        while (game.getPlayerIterator().hasNext()){
            Player player = (Player) game.getPlayerIterator().next();
            player.setPlayerScore(player.getID());
        }

        //Act
        Context context = new Context(game);
        context.setStrategy(new StrategyBunco());
        context.executeCalculateTheWinner();

        //Assert
        assertEquals(4 ,context.getWinner());

    }
}