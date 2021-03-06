package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    Creator creator;
    Iterator iterator;
    Collection collection;
    @BeforeEach
    void doBefore() {
        creator = new Creator();
        collection = creator.createPlayers(5);
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
    void reset() throws NoSuchFieldException, IllegalAccessException {
        final Field field = collection.getClass().getDeclaredField("pos");
        field.setAccessible(true);

        assertEquals((int) field.get(collection), 0 );

        int count = 0;
        while (iterator.hasNext()){
            count++;
            Player o = (Player) iterator.next();
            assertEquals((int) field.get(collection), count);
        }

        iterator.reset();
        assertEquals((int) field.get(collection), 0);

    }
}