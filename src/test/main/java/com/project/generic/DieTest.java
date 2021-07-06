package main.java.com.project.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    private Die d1;
    private Die d2;

    @BeforeEach
    public void doBefore(){
        //Arrange
        d1 = new Die(6);
        d2 = new Die(6);
    }

    @Test
    void getFacesCount() {
        //Assert
        assertEquals(6, d1.getFacesCount());
    }

    @Test
    void setFacesCount() {
        //Act
        d1.setFacesCount(4);
        //Assert
        assertEquals(4, d1.getFacesCount());
    }

    @Test
    void setFacesCountBelowMin() {
        //Act
        d1.setFacesCount(0);
        //Assert
        //default value is 6
        assertEquals(6, d1.getFacesCount());
    }

    @Test
    void getFaceRolled() {
        //Act
        d1.setFaceRolled(1);
        //Assert
        assertEquals(1, d1.getFaceRolled());
    }

    @Test
    void setFaceRolled() {
        //Act
        d1.setFaceRolled(1);
        //Assert
        assertEquals(1, d1.getFaceRolled());
    }

    @Test
    void rollDie() {
        //Act
        d1.rollDie();
        assertNotNull(d1.getFaceRolled());
    }

    @Test
    void compareToSmallerDie() {
        //Act
        d1.setFaceRolled(4);
        d2.setFaceRolled(5);
        //Assert
        assertTrue(d2.compareTo(d1)<0);
    }

    @Test
    void compareToBiggerDie() {
        //Act
        d1.setFaceRolled(4);
        //Assert
        assertTrue(d2.compareTo(d1)>0);
    }

    @Test
    void compareToSameDie() {
        //Assert
        assertTrue(d2.compareTo(d1)==0);
    }

    @Test
    public void compareToNullDie(){
        //Act
        d1.setFaceRolled(4);
        //Assert
        assertThrows(NullPointerException.class, () -> d1.compareTo(null));
    }

}