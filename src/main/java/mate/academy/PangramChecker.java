package mate.academy;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence){
        Set<Character> letters = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letters.add(c);
        }
        char[] chars = sentence.toLowerCase().toCharArray();
        for (char c : chars) {
            if (letters.contains(c)) {
                letters.remove(c);
            }
        }
        return letters.isEmpty();
    }
}
