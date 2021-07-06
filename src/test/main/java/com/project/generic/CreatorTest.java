package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CreatorTest {

    private Creator c;

    @BeforeEach
    public void doBefore() {
        //Arrange
        c = new Creator();
    }

    @Test
    void createPlayers() {
        //Arrange
        Collection collection;
        //Act
        collection = c.createPlayers(4);
        //Assert
        assertEquals(4,collection.size());
    }

    @Test
    void createNegativePlayers() {
        //Arrange
        Collection collection;
        //Act
        collection = c.createPlayers(-1);
        //Assert
        assertEquals(0,collection.size());
    }

    @Test
    void createDice() {
        //Arrange
        Collection collection;
        //Act
        collection = c.createDice(6,3);
        //Assert
        assertEquals(3,collection.size());
    }

    @Test
    void createNegativeDice() {
        //Arrange
        Collection collection;
        //Act
        collection = c.createDice(6,-5);
        //Assert
        assertEquals(0,collection.size());
    }

    @Test
    void createGame() {
        //Arrange
        Game g;
        //Act
        g = c.createGame();
        //Assert
        assertNotNull(g);
    }
}