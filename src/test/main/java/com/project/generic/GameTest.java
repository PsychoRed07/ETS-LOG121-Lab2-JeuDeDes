package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game;

    @BeforeEach
    public void init(){
        game = new Game();
    }

    @Test
    public void constructorInitTest(){
        assertTrue(game instanceof Game);
    }
}