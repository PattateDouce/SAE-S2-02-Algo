package main.java.eraser;

public class Eraser {
	// Marche, Simplicité
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
	
	// Marche, le moins de caractères
	public static String erase2(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32 || (str.charAt(i) == 32 && ((i != 0 && str.charAt(i-1) == 32) || (i+1 < str.length() && str.charAt(i+1) == 32)))) {
				result += str.charAt(i);
			}
		}
		return result;
	}
	
	// Marche, le moins de caractères n°2
	public static String erase3(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32 && !((i != 0 && str.charAt(i-1) == 32) || (i+1 < str.length() && str.charAt(i+1) == 32))) {
				StringBuilder sb = new StringBuilder(str);
				str = sb.deleteCharAt(i).toString();
			}
		}
		return str;
	}
	
	// Marche, Efficacité
	public static String erase(String str) {
		int start = str.indexOf(" ");
		int end = str.lastIndexOf(" ");
		end = end == -1 ? -2 : end;
		for (int i = start; i <= end; i++) {
			if (str.charAt(i) == 32 && !(i != 0 && str.charAt(i-1) == 32) && !(i+1 < str.length() && str.charAt(i+1) == 32)) {
				StringBuilder sb = new StringBuilder(str);
				str = sb.deleteCharAt(i).toString();
				end --;
			}
		}
		return str;
	}
	
	// Ne marche pas
	public static String erase5(String str) {
		int spaces = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) {
				spaces ++;
			} else if (spaces == 1) {
				StringBuilder sb = new StringBuilder(str);
				str = sb.deleteCharAt(i-1).toString();
				spaces = 0;
			} else {
				spaces = 0;
			}
			if (i == str.length()-1 && spaces == 1) {
				StringBuilder sb = new StringBuilder(str);
				str = sb.deleteCharAt(i).toString();
			}
		}
		return str;
	}
}
