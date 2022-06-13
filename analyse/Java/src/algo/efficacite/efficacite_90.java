package algo.efficacite;

public class efficacite_90 {
	//supprime les espaces non consécutifs
    public static String erase(String str) {
    	/**
    	 * utilise les expressions régulières : s'il y a un caractère (n'importe lequel sauf espace, ou un debut de chaine) avant 
    	* l'espace, et après l'espace (n'importe quel caractère sauf espace, ou une fin de chaine)
    	* alors supprime l'espace 
    	* $1 et $2 permettent de ne pas supprimer les caractères avant et après l'espace en question
    	**/
    	return str.replaceAll("([^\\s]|^)\\s([^\\s]|$)","$1$2");
    }
}
