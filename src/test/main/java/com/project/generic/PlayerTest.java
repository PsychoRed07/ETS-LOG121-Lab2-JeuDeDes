package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player p1;
    private Player p2;

    @BeforeEach
    public void doBefore(){
        p1 = new Player(0);
        p2 = new Player(1);
    }

    @Test
    void getID() {
        assertEquals(0, p1.getID());
    }

    @Test
    void setID() {
        p1.setID(2);
        assertEquals(2, p1.getID());
    }

    @Test
    void getTurn() {
        p1.setTurn(1);
        assertEquals(1, p1.getTurn());
    }

    @Test
    void setTurn() {
        p1.setTurn(1);
        assertEquals(1, p1.getTurn());
    }

    @Test
    void getDiceAmount() {
        p1.setDiceAmount(3);
        assertEquals(3, p1.getDiceAmount());
    }

    @Test
    void setDiceAmount() {
        p1.setDiceAmount(3);
        assertEquals(3, p1.getDiceAmount());
    }

    @Test
    void getPlayerScore() {
        p1.setPlayerScore(10);
        assertEquals(10, p1.getPlayerScore());
    }

    @Test
    void setPlayerScore() {
        p1.setPlayerScore(10);
        assertEquals(10, p1.getPlayerScore());
    }

    @Test
    void compareTo() {
    }
}