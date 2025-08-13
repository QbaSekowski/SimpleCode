package mate.academy;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ", -1);
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();
            for (int j = letters.length - 1; j >= 0; j--) {
                reversed.append(letters[j]);
            }
            if (i < words.length - 1) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
