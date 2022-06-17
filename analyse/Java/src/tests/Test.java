package tests;

import static org.junit.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;

import algo.efficacite.efficacite_143;
import algo.efficacite.efficacite_3;
import algo.efficacite.efficacite_90;
import algo.simplicite.simplicite_35;
import algo.simplicite.simplicite_56;
import algo.simplicite.simplicite_73;
import algo.simplicite.simplicite_84;
import algo.sobriete.sobriete_150;

public class Test {

    public static void main(String[] args) throws IOException {
//      System.out.println(Eraser.erase(args[1]));
        
        // Lie le fichier à Erase et le fichier qu'on doit obtenir après l'algo
        long startTime = System.currentTimeMillis();
        
        FileReader fr = new FileReader("C:\\Users\\Etudiant\\Documents\\GitHub\\sae2-02-PattateDouce\\analyse\\texte 100k not erased.txt");
        
        String texteE = "";
        for (int i = fr.read(); i != -1; i = fr.read()) {
            texteE += (char) i;
        }
        
        fr.close();
        
        FileReader fr2 = new FileReader("C:\\Users\\Etudiant\\Documents\\GitHub\\sae2-02-PattateDouce\\analyse\\texte 100k erased.txt");
        
        String texteS = "";
        for (int i = fr2.read(); i != -1; i = fr2.read()) {
            texteS += (char) i;
        }
        
        fr2.close();
        
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to read files to varibles : " + (endTime - startTime) + " ms");
        
        
        // Test 15 fois l'algo
        long[] res = new long[15];
        for (int i = 0; i < res.length; i++) {
            startTime = System.currentTimeMillis();
            
            String texte = simplicite_84.erase(texteE);
            
            endTime = System.currentTimeMillis();
            
            System.out.println("Time taken to erase single spaces : " + (endTime - startTime) + " ms");
            
            res[i] = endTime - startTime;
            
            assertEquals(texteS, texte);
        }
        
        long sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
        }
        System.out.println(sum / res.length + " ms");
    }
}