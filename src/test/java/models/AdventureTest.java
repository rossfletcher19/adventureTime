package models;

import org.junit.*;
import static org.junit.Assert.*;


public class AdventureTest {
    @Test
    public void Adventure_instantiatesCorrectly() throws Exception {
        Adventure testAdventure = new Adventure("Portland");
        assertEquals(true, testAdventure instanceof Adventure);
    }

    @Test
    public void getDestination_getsDestination_String() throws Exception {
        Adventure testAdventure = new Adventure("Japan");
        assertEquals("Japan", testAdventure.getDestination());
    }
    @Test
    public void setDestination_setsDestination_String() throws Exception {
        Adventure testAdventure = new Adventure("Japan");
        testAdventure.setDestination("Tokyo");
        assertEquals("Tokyo", testAdventure.getDestination());
    }
}