package main.java.com.project.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getID() {
        Player p = new Player(0);
        assertEquals(0, p.getID());
    }

    @Test
    void setID() {
        Player p = new Player(0);
        p.setID(1);
        assertEquals(1, p.getID());
    }

    @Test
    void getTurn() {
        Player p = new Player(0);
        p.setTurn(1);
        assertEquals(1, p.getTurn());
    }

    @Test
    void setTurn() {
        Player p = new Player(0);
        p.setTurn(1);
        assertEquals(1, p.getTurn());
    }

    @Test
    void getDiceAmount() {
        Player p = new Player(0);
        p.setDiceAmount(1);
        assertEquals(1, p.getDiceAmount());
    }

    @Test
    void setDiceAmount() {
        Player p = new Player(0);
        p.setDiceAmount(1);
        assertEquals(1, p.getDiceAmount());
    }

    @Test
    void getPlayerScore() {
        Player p = new Player(0);
        p.setPlayerScore(10);
        assertEquals(10, p.getPlayerScore());
    }

    @Test
    void setPlayerScore() {
        Player p = new Player(0);
        p.setPlayerScore(10);
        assertEquals(10, p.getPlayerScore());
    }

    @Test
    void compareTo() {
    }
}