package mate.academy;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

    public static List<String> grabscrab(String s, List<String> words) {
        List<String> result = new ArrayList<>();

        char[] sortedInput = s.toCharArray();
        Arrays.sort(sortedInput);
        for (String word : words) {
            if (word.length() != s.length()) {
                continue;
            }

            char[] sortedWord = word.toCharArray();
            Arrays.sort(sortedWord);

            if (Arrays.equals(sortedInput, sortedWord)) {
                result.add(word);
            }
        }

        return result;
    }
}