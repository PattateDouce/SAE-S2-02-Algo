package test.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import main.java.eraser.Eraser;

public class EraserTest {
    @Test
    public void testSolution() throws IOException {
    	long startTime = System.currentTimeMillis();
    	
//        assertEquals("666,thenumberofthebeast", Eraser.erase("666, the number of the beast"));
//        assertEquals("06   07651970", Eraser.erase("06   07 65 19 70 "));
//        assertEquals("OK", Eraser.erase("OK"));
//        assertEquals("Coucou  JM  B", Eraser.erase("Cou cou  J M  B"));
//        assertEquals("", Eraser.erase(""));
    	
    	FileReader fr = new FileReader("C:\\Users\\Etudiant\\Downloads\\texteSAE.txt");
    	
    	String text = "";
    	for (int i = fr.read(); i != -1; i = fr.read()) {
			text += (char) i;
		}
    	
    	System.out.println(text);
        
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken : " + (endTime - startTime) + " ms");  
    }
    
    
}