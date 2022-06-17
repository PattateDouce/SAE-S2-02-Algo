package tests;

import org.junit.Test;

import algo.efficacite.efficacite_143;
import algo.efficacite.efficacite_3;
import algo.efficacite.efficacite_90;
import algo.simplicite.simplicite_35;
import algo.simplicite.simplicite_56;
import algo.simplicite.simplicite_73;
import algo.simplicite.simplicite_84;
import algo.sobriete.sobriete_150;

import static org.junit.Assert.assertEquals;

public class EraserTest {
    @Test
    public void testSolutionSimple() {
        assertEquals("666,thenumberofthebeast", simplicite_56.erase("666, the number of the beast"));
        assertEquals("06   07651970", simplicite_56.erase("06   07 65 19 70 "));
        assertEquals("OK", simplicite_56.erase("OK"));
        assertEquals("Coucou  JM  B", simplicite_56.erase("Cou cou  J M  B"));
        assertEquals("", simplicite_56.erase(""));
        assertEquals("  f  ", simplicite_56.erase("  f  "));
    }
}