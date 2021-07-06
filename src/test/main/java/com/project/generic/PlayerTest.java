package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player p1;
    private Player p2;

    @BeforeEach
    public void doBefore(){
        //Arrange
        p1 = new Player(0);
        p2 = new Player(1);
    }

    @Test
    void getID() {
        //Assert
        assertEquals(0, p1.getID());
    }

    @Test
    void setID() {
        //Act
        p1.setID(2);
        //Assert
        assertEquals(2, p1.getID());
    }

    @Test
    void getTurn() {
        //Act
        p1.setTurn(1);
        //Assert
        assertEquals(1, p1.getTurn());
    }

    @Test
    void setTurn() {
        //Act
        p1.setTurn(1);
        //Assert
        assertEquals(1, p1.getTurn());
    }

    @Test
    void getDiceAmount() {
        //Act
        p1.setDiceAmount(3);
        //Assert
        assertEquals(3, p1.getDiceAmount());
    }

    @Test
    void setDiceAmount() {
        //Act
        p1.setDiceAmount(3);
        //Assert
        assertEquals(3, p1.getDiceAmount());
    }

    @Test
    void setDiceAmountBelowMin() {
        //Act
        p1.setDiceAmount(-1);
        //Assert
        //default value is 0
        assertEquals(0, p1.getDiceAmount());
    }

    @Test
    void getPlayerScore() {
        //Act
        p1.setPlayerScore(10);
        //Assert
        assertEquals(10, p1.getPlayerScore());
    }

    @Test
    void setPlayerScore() {
        //Act
        p1.setPlayerScore(10);
        //Assert
        assertEquals(10, p1.getPlayerScore());
    }

    @Test
    void compareToSmallerScore() {
        //Act
        p1.setPlayerScore(4);
        p2.setPlayerScore(5);
        //Assert
        assertTrue(p2.compareTo(p1)<0);
    }

    @Test
    void compareToBiggerScore() {
        //Act
        p1.setPlayerScore(5);
        p2.setPlayerScore(4);
        //Assert
        assertTrue(p2.compareTo(p1)>0);
    }

    @Test
    void compareToSameScore() {
        p1.setPlayerScore(5);
        p2.setPlayerScore(5);
        //Assert
        assertTrue(p2.compareTo(p1)==0);
    }

    @Test
    public void compareToNullScore(){
        //Act
        p1.setPlayerScore(5);
        //Assert
        assertThrows(NullPointerException.class, () -> p1.compareTo(null));
    }
}