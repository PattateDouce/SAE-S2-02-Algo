package main.java.eraser;

public class Eraser {
    public static String erase(String str, int index) {
    	// si on a atteint la fin on arrête
    	if (index == str.length()) {
    		return str;
    	} else {
	        // si c'est un espace
	        if (str.charAt(index) == 32) {
	            // on regarde si il y a un espcae avant
	            if (index != 0 && str.charAt(index-1) == 32) {
	                System.out.println("Il y au un autre espace avant.");
	            // on regarde si il y a un espcae après
	            } else if (index+1 < str.length() && str.charAt(index+1) == 32) {
	            	System.out.println("Il y au un autre espace après.");
	            // il n'y a qu'un seul espace donc on s'en débarrasse
	            } else {
	            	StringBuilder sb = new StringBuilder(str);
	            	return erase(sb.deleteCharAt(index).toString(), index+1);
	            }
	        }
	        // rien à modifier on vas ou carractère suivant
	        return erase(str, index+1);
    	}
    }
}
