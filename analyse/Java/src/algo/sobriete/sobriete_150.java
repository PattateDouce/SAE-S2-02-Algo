package algo.sobriete;

public class sobriete_150 {
	/**
	 * Méthode par création d'une chaine de caractère
	 * @param req
	 * @return
	 */
	public static String erase(String req) {
		String res = "";
		int length = req.length();
		
		if (Character.compare(req.charAt(0), ' ') == 0 && Character.compare(req.charAt(1), ' ') != 0) {
			res += "";
		} else res += req.charAt(0);
		for (int i = 1; i < length - 1; i++) {
			if (Character.compare(req.charAt(i), ' ') == 0 && Character.compare(req.charAt(i+1), ' ') != 0 && Character.compare(req.charAt(i-1), ' ') != 0) {
				res += "";
			} else {
				res += req.charAt(i);
			}
		}
		if (Character.compare(req.charAt(length - 1), ' ') == 0 && Character.compare(req.charAt(length - 2), ' ') != 0) {
			res += "";
		} else res += req.charAt(length-2);
		return res;
	}
}
 