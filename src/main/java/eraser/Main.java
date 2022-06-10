package main.java.eraser;

import static org.junit.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//      System.out.println(Eraser.erase(args[1]));
    	
    	// Lie le fichier à Erase et le fichier qu'on doit obtenir après l'algo
    	long startTime = System.currentTimeMillis();
    	
    	FileReader fr = new FileReader("C:\\Users\\Etudiant\\Documents\\GitHub\\sae2-02-PattateDouce\\src\\texteE.txt");
    	
    	String texteE = "";
    	for (int i = fr.read(); i != -1; i = fr.read()) {
			texteE += (char) i;
		}
    	
    	fr.close();
    	
    	FileReader fr2 = new FileReader("C:\\Users\\Etudiant\\Documents\\GitHub\\sae2-02-PattateDouce\\src\\texteS.txt");
    	
    	String texteS = "";
    	for (int i = fr2.read(); i != -1; i = fr2.read()) {
    		texteS += (char) i;
		}
    	
    	fr2.close();
    	
    	long endTime = System.currentTimeMillis();
        System.out.println("Time taken to read file to a varible : " + (endTime - startTime) + " ms");
        
        
        // Test 15 fois l'algo
        long[] res = new long[100];
        for (int i = 0; i < res.length; i++) {
        	startTime = System.currentTimeMillis();
        	
        	String texte = Efficace.erase(texteE);
        	
            endTime = System.currentTimeMillis();
            
            System.out.println("Time taken to erase single spaces : " + (endTime - startTime) + " ms");
            
            res[i] = endTime - startTime;
            
            assertEquals(texteS, texte);
		}
        
        long sum = 0;
        for (int i = 0; i < res.length; i++) {
			sum += res[i];
		}
        System.out.println(sum / res.length);
    }
}
