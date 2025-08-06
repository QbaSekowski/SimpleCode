package mate.academy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedLetters {

    public static String removeRepeatedLetters(String str) {
        Set<Character> setOfLetters = new LinkedHashSet<>();
        for (char letter : str.toCharArray()) {
            setOfLetters.add(letter);
        }
        return setOfLetters.toString();
    }
}
