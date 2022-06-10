package main.java.eraser;

public class Simple {
	// Simplicité
	public static String erase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) {
				if (i != 0 && str.charAt(i-1) == 32) {
					result += str.charAt(i);
				} else if (i+1 < str.length() && str.charAt(i+1) == 32) {
					result += str.charAt(i);
				}
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
