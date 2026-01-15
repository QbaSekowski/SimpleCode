package mate.academy;

public class StringSplit {
    public static String[] solution(String s) {
        String[] result;
        if (s.length() % 2 == 0) {
            result = new String[s.length() / 2];
            for (int i = 0; i < result.length; i++) {
                result[i] = s.substring(i * 2, i * 2 + 2);
            }
        } else {
            result = new String[s.length() / 2 + 1];
            for (int i = 0; i < result.length; i++) {
                if (i == result.length - 1) {
                    result[i] = s.substring(i * 2) + "_";
                } else {
                    result[i] = s.substring(i * 2, i * 2 + 2);
                }
            }
        }
        return result;
    }
}