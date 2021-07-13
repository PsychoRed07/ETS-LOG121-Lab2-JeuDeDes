package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    Creator creator;
    Iterator iterator;

    @BeforeEach
    void doBefore() {
        creator = new Creator();
        Collection collection = creator.createPlayers(5);
        iterator = collection.createIterator();
    }

    @Test
    void hasNext() {
        int count = 0;
        while (iterator.hasNext()){
            Object o = iterator.next();
            count++;
        }
        assertEquals(count, 5);
    }

    @Test
    void next() {
        int count = 0;
        while (iterator.hasNext()){
            Player o = (Player) iterator.next();
            count++;
            assertEquals(o.getID(), count);
        }

    }

    @Test
    void reset() {

    }
}