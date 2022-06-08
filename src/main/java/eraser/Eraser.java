package main.java.eraser;

public class Eraser {
	// Marche
	public static String erase1(String str) {
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
	
	// Marche
	public static String erase2(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32 || (str.charAt(i) == 32 && ((i != 0 && str.charAt(i-1) == 32) || (i+1 < str.length() && str.charAt(i+1) == 32)))) {
				result += str.charAt(i);
			}
		}
		return result;
	}
	
	// Marche
	public static String erase3(String str) {
		int start = str.indexOf(" ");
		int end = str.lastIndexOf(" ") == -1 ? -2 : str.lastIndexOf(" ");
		for (int i = start; i <= end; i++) {
			if (str.charAt(i) == 32) {
				if (i != 0 && str.charAt(i-1) == 32) {
				} else if (i+1 < str.length() && str.charAt(i+1) == 32) {
				} else {
					StringBuilder sb = new StringBuilder(str);
					str = sb.deleteCharAt(i).toString();
					end --;
				}
			}
		}
		return str;
	}
	
	// Marche
	public static String erase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32 && !((i != 0 && str.charAt(i-1) == 32) || (i+1 < str.length() && str.charAt(i+1) == 32))) {
				StringBuilder sb = new StringBuilder(str);
				str = sb.deleteCharAt(i).toString();
			}
		}
		return str;
	}
}
