package algo.simplicite;

public class simplicite_84 {

    public static String erase(String str){
    	String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 32 || (str.charAt(i) == 32 && ((i != 0 && str.charAt(i-1) == 32) || (i+1 < str.length() && str.charAt(i+1) == 32)))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
