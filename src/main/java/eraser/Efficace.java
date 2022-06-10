package main.java.eraser;

public class Efficace {
	// Efficacité
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
}
