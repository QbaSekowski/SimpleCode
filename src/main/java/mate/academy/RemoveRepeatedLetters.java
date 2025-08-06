package mate.academy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedLetters {

    public static String removeRepeatedLetters(String str) {
        Set<Character> setOfLetters = new LinkedHashSet<>();
        for (char letter : str.toCharArray()) {
            setOfLetters.add(letter);
        }
        StringBuilder sb = new StringBuilder();
        for (char letter : setOfLetters) {
            sb.append(letter);
        }
        return sb.toString();
    }
}
