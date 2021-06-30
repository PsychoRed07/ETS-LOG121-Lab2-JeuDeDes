package main.java.com.project.generic;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    private Die d1;
    private Die d2;

    @BeforeEach
    public void doBefore(){
        d1 = new Die(6);
        d2 = new Die(6);
    }

    @Test
    void getFacesCount() {
        assertEquals(6, d1.getFacesCount());
    }

    @Test
    void setFacesCount() {
        d1.setFacesCount(4);
        assertEquals(4, d1.getFacesCount());
    }

    @Test
    void setFacesCountBelowMin() {
        d1.setFacesCount(0);
        //assert default value is 6
        assertEquals(6, d1.getFacesCount());
    }

    @Test
    void getFaceRolled() {
        d1.setFaceRolled(1);
        assertEquals(1, d1.getFaceRolled());
    }

    @Test
    void setFaceRolled() {
        d1.setFaceRolled(1);
        assertEquals(1, d1.getFaceRolled());
    }

    @Test
    void rollDie() {
        d1.rollDie();
        assertNotNull(d1.getFaceRolled());
    }

    @Test
    void compareToSmallerDie() {
        d1.setFaceRolled(4);
        d2.setFaceRolled(5);
        assertTrue(d2.compareTo(d1)<0);
    }

    @Test
    void compareToBiggerDie() {
        d1.setFaceRolled(4);
        assertTrue(d2.compareTo(d1)>0);
    }

    @Test
    void compareToSameDie() {
        assertTrue(d2.compareTo(d1)==0);
    }

    @Test
    public void compareToNullDie(){
        d1.setFaceRolled(4);
        assertThrows(IllegalArgumentException.class, () -> d1.compareTo(null));
    }

}