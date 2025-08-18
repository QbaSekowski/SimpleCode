package mate.academy;

public class TitleToNumber {
    public static long titleToNumber(String title) {
        long result = 0;
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}
