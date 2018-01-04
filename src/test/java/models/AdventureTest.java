package models;

import org.junit.*;
import static org.junit.Assert.*;


public class AdventureTest {
    @Test
    public void Adventure_instantiatesCorrectly() {
        Adventure testAdventure = new Adventure();
        assertEquals(false, testAdventure instanceof Adventure);
    }
}