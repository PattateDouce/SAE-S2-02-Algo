package algo.simplicite;

import java.util.ArrayList;

public class simplicite_73 {
	
	/*
	 * méthode qui permet d'enlever les espaces d'un texte sauf si il y a des espaces
	 * récursifs
	 * @param IN str : le texte en question
	 */
	public static String erase(String str) {
    	char[] tab = str.toCharArray(); //on ajoute notre texte dans un tableau de char
    	String derniereValeur = ""; //la variable qui prend la dernire valeur du texte
    	String resultat = ""; //on initialise la variable de retour
    	int taille = tab.length; //la taille du tableau de char
    	
    	for(int i = 0; i < taille-1; i++) { //tant qu'on a pas fait tout le tableau
    		
    		/*****Gestion du dernier cas (pire cas)*****/
    		if(tab[tab.length-1] == ' ' && tab[tab.length-2] == ' ' || tab[tab.length-1] != ' ') {
    		//si le dernier caractère est un espace et que celui qui le précéde l'est aussi
    		//OU si ce n'est pas un caractère (donc une lettre)
    			
    			derniereValeur = String.valueOf(tab[tab.length-1]);
    			//on l'ajoute à notre variable de toute fin
    		}
    		
    		
    		if(tab[i] != ' ') { //si le caractère en position i n'est pas un espace
    			resultat = resultat+String.valueOf(tab[i]); 
    			//on l'ajoute a notre variable de fin (on en déduis que c'est une lettre)
    		}
    		if(tab[i] == ' ') {//si le caractère en position i est un espace
    			if(tab[i+1] == ' ' || tab[i-1] == ' ') { 
    				//si le caractère qui le précède ou le suis est un espace
    				
    				resultat = resultat+String.valueOf(tab[i]);
    				//on l'ajoute a notre variable de fin
    			}
    		}
    	}
    	return resultat+derniereValeur; //on retourne le nouveau texte comme il faut en lui
    	//rajoutant le tout dernier caractère.
    	
    }
}
