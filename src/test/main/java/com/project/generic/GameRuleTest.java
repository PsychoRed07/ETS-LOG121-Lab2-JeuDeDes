package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class GameRuleTest {

    GameRule game;

    @BeforeEach
    void init(){
         game = new Game();
    }

    @Test
    void getPlayerIterator() {
        //Arrange
        //Act

        //Assert
        assertNotNull(game.getPlayerIterator());
    }

    @Test
    void getDiceIterator() {
        //Arrange

        //Act

        //Assert
        assertNotNull(game.getDiceIterator());
    }

    @Test
    void getNumberOfTurn() throws NoSuchFieldException, IllegalAccessException {
        //Arrange
        final Field field = game.getClass().getSuperclass().getDeclaredField("numberOfTurn");
        field.setAccessible(true);
        field.set(game, 15);

        //Act
        final int result = game.getNumberOfTurn();

        //Assert
        assertEquals(result, 15);

    }

    @Test
    void setNumberOfTurn() throws NoSuchFieldException, IllegalAccessException {
        //Arrange

        //Act
        game.setNumberOfTurn(3);

        //Assert
        final Field field = game.getClass().getSuperclass().getDeclaredField("numberOfTurn");
        field.setAccessible(true);
        assertEquals(field.get(game), 3);
    }

    @Test
    void getNumberOfMaxTurns() throws IllegalAccessException, NoSuchFieldException {
        //Arrange
        final Field field = game.getClass().getSuperclass().getDeclaredField("numberOfMaxTurns");
        field.setAccessible(true);
        field.set(game, 15);

        //Act
        final int result = game.getNumberOfMaxTurns();

        //Assert
        assertEquals(result, 15);
    }

    @Test
    void setNumberOfMaxTurns() throws NoSuchFieldException, IllegalAccessException {
        //Arrange

        //Act
        game.setNumberOfMaxTurns(20);

        //Assert
        final Field field = game.getClass().getSuperclass().getDeclaredField("numberOfMaxTurns");
        field.setAccessible(true);
        assertEquals(field.get(game), 20);
    }

    @Test
    void getPlayers() {
        //Arrange

        //Act

        //Assert
        assertNotNull(game.getPlayers());
    }

    @Test
    void setPlayers() {
        //Arrange

        //Act

        //Assert
    }

    @Test
    void getDice() {
        //Arrange

        //Act

        //Assert
        assertNotNull(game.getDice());
    }

    @Test
    void setDice() {
        //Arrange

        //Act

        //Assert
    }

    @Test
    void initializePlayers() {
        //Arrange

        //Act
        game.initializePlayers(2);

        //Assert
        assertEquals(game.getPlayers().size(), 2);

        assertNotNull((game.getPlayers().getCollection()[0]));
        assertEquals(((Player) game.getPlayers().getCollection()[0]).getID(), 1);

        assertNotNull((game.getPlayers().getCollection()[1]));
        assertEquals(((Player) game.getPlayers().getCollection()[1]).getID(), 2);
    }

    @Test
    void initializeDice() {
        //Arrange

        //Act
        game.initializeDice(6,2);

        //Assert
        assertEquals(game.getDice().size(), 2);

        assertNotNull((game.getDice().getCollection()[0]));
        assertEquals(((Die) game.getDice().getCollection()[0]).getFacesCount(), 6);

        assertNotNull((game.getDice().getCollection()[1]));
        assertEquals(((Die) game.getDice().getCollection()[1]).getFacesCount(), 6);
    }
}