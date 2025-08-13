package mate.academy;

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for (char c = 'a'; c <= 'z' && k > 0; c++) {
            for (int i = 0; i < sb.length() && k > 0; i++) {
                if (sb.charAt(i) == c) {
                    sb.deleteCharAt(i);
                    k--;
                    i--;
                }
            }
        }
        return sb.toString();
    }
}
