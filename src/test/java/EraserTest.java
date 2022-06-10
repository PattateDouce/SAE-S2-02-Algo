package test.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.java.eraser.Simple;
import main.java.eraser.Efficace;

public class EraserTest {
    @Test
    public void testSolutionSimple() {
        assertEquals("666,thenumberofthebeast", Simple.erase("666, the number of the beast"));
        assertEquals("06   07651970", Simple.erase("06   07 65 19 70 "));
        assertEquals("OK", Simple.erase("OK"));
        assertEquals("Coucou  JM  B", Simple.erase("Cou cou  J M  B"));
        assertEquals("", Simple.erase(""));
    }
    
    @Test
    public void testSolutionEfficace() {
        assertEquals("666,thenumberofthebeast", Efficace.erase("666, the number of the beast"));
        assertEquals("06   07651970", Efficace.erase("06   07 65 19 70 "));
        assertEquals("OK", Efficace.erase("OK"));
        assertEquals("Coucou  JM  B", Efficace.erase("Cou cou  J M  B"));
        assertEquals("", Efficace.erase(""));
    }
}