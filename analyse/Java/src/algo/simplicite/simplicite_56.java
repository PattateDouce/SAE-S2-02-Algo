package algo.simplicite;

public class simplicite_56 {
    public static String erase(String str) {
        
        //// Déclarations de variables \\\\

        String finalStr = "";                   // Chaine de caractère qui sera retournée a la fin du programme
        char[] tabStr = str.toCharArray();      // Tableau contenant chaque caractère de la chaine en entrée du programme
        int taille = tabStr.length;             // Taille du tableau
        int espace = 0;                         // Compteur d'espaces


        //// Création de la chaine de caractères \\\\

        for(int i=0; i<taille; i++){                            // Cette boucle effectue autant d'itérations que la taille de la phrase donnée.
            if(tabStr[i] == ' '){
                espace += 1;                                    // Si le caractère equivaut a un espace, on incrémente le compteur d'espace.                     
                if(i+1<taille){                                 // Ce test permet de ne pas avoir d'erreur du type Index out of range.
                   if(tabStr[i+1] != ' ' && espace>1){
                       for(int y=0; y<espace; y++){   
                           finalStr += ' ';                     // Lorsqu'une suite d'espaces se termine, si il y a plus d'un seul espace, on ajoute "espace" (la variable) fois un espace.
                       }
                   }
                }
            } else {
                espace = 0;
                finalStr += tabStr[i];                          // Si le caractère présent n'est pas un espace, on met le compteur d'espace a 0 et on ajoute le caractère a la chaine finale.
            }
        }
        return finalStr;
    }
}
