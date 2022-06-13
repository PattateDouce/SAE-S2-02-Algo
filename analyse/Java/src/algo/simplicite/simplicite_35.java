package algo.simplicite;

public class simplicite_35 {
	/**
	 * Méthode permettant de supprimer les espaces isolés dans un texte
	 * S'il existe des espaces consécutifs, la méthode ne supprime aucun de ces espaces
	 * Pour des textes avec beaucoup de caractères, privilégier la méthode erase du fichier 
	 * EraserEfficace.java.
	 * @param str : texte à traiter
	 * @return String : le nouveau texte modifié
	 * @see EraserEfficace
	 */
	public static String erase(String str) {
		String newStr="";
		int strLength = str.length();
		for(int i = 0; i<strLength; i++) {
			if(str.charAt(i)!=32) {
				newStr+=str.charAt(i);
			}else{
				if(i+1<strLength && i-1>=0){
					if(str.charAt(i+1) == 32 || str.charAt(i-1) == 32) {
						newStr+=str.charAt(i);
					}
				}
			}
		}
		return newStr;
	}
}
