package models;

import org.junit.*;
import static org.junit.Assert.*;


public class AdventureTest {
    @Test
    public void Adventure_instantiatesCorrectly() {
        Adventure testAdventure = new Adventure("Portland");
        assertEquals(true, testAdventure instanceof Adventure);
    }

    @Test
    public void getDestination_getsDestination_String() {
        Adventure testAdventure = new Adventure("Japan");
        assertEquals("Portland", testAdventure.getDestination());
    }
}