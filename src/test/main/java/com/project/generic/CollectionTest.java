package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {

    Collection collection;

    @BeforeEach
    public void init(){
        collection = new Collection();
    }

    @Test
    public void getCollection() {
        //Arrange
        Object[] objects = new Object[3];
        objects[0] = new Player(1);
        objects[1] = new Player(2);
        objects[2] = new  Player(3);
        collection.setObjects(objects);

        //Act
        Object[] objectsNew = collection.getCollection();

        //Assert
        assertEquals(objects.length, objectsNew.length);
        assertTrue(objects[0] instanceof Player);
        assertEquals(((Player) objects[0]).getID(), ((Player) objectsNew[0]).getID());

        assertEquals(objects.length, objectsNew.length);
        assertTrue(objects[1] instanceof Player);
        assertEquals(((Player) objects[1]).getID(), ((Player) objectsNew[1]).getID());

        assertEquals(objects.length, objectsNew.length);
        assertTrue(objects[2] instanceof Player);
        assertEquals(((Player) objects[2]).getID(), ((Player) objectsNew[2]).getID());
    }

    @Test
    void setObjects() throws NoSuchFieldException, IllegalAccessException {
        //Arrange

        //Act
        collection.setObjects(new Player[] {new Player(1), new Player(2)});

        //Assert
        assertEquals(((Player)(collection.getCollection())[0]).getID(), 1);
        assertEquals(((Player)(collection.getCollection())[1]).getID(), 2);
    }

    @Test
    void getFirst() {
        //Arrange

        //Act
        collection.setObjects(new Player[] {new Player(1), new Player(2)});

        //Assert
        assertTrue(collection.getFirst() instanceof Player);
        assertEquals(((Player) collection.getFirst()).getID(), 1);
    }

    @Test
    void size() {
        //Arrange
        Object[] objects = new Object[3];
        objects[0] = new Player(1);
        objects[1] = new Player(2);
        objects[2] = new  Player(3);
        collection.setObjects(objects);

        //Act

        //Assert
        assertEquals(collection.size(), 3);
    }

    @Test
    void sort() {
        //Arrange
        Object[] objects = new Object[3];

        objects[0] = new Player(1);
        ((Player) objects[0]).setPlayerScore(1);

        objects[1] = new Player(2);
        ((Player) objects[1]).setPlayerScore(10);

        objects[2] = new  Player(3);
        ((Player) objects[2]).setPlayerScore(100);

        collection.setObjects(objects);

        //Act
        collection.sortDescending();


        //Assert
        assertEquals(((Player)(collection.getCollection())[0]).getPlayerScore(), 100);
        assertEquals(((Player)(collection.getCollection())[1]).getPlayerScore(), 10);
        assertEquals(((Player)(collection.getCollection())[2]).getPlayerScore(), 1);

    }

    @Test
    void addObject() {
        //Arrange

        //Act
        collection.addObject(new Player(1));
        collection.addObject(new Player(2));

        //Assert
        assertEquals(collection.size(), 2);
    }

    @Test
    void createIterator() {
        //Arrange

        //Act

        //Assert
        assertNotNull(collection.createIterator());
    }
}