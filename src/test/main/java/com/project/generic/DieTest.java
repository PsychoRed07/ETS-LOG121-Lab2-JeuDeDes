package main.java.com.project.generic;

import org.junit.Before;
import org.junit.jupiter.api.Test;


class DieTest {
    private Die d1;
    private Die d2;

    @Before
    public void doBefore(){
        d1 = new Die(6);
        d2 = new Die(6);
    }

    @Test
    void getFacesCount() {
        //d1.setFaceCount(4);
    }

    @Test
    void setFacesCount() {
    }

    @Test
    void getFaceRolled() {
    }

    @Test
    void setFaceRolled() {
    }

    @Test
    void rollDie() {
    }

    @Test
    void compareTo() {

        //assertTrue(de1.compareTo(de1)==0);
    }
}