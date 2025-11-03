package mate.academy;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static boolean validateWord(String word) {
        Map<Character, Integer> map = new HashMap<>();
        word = word.toLowerCase();
        for (char c : word.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int checker = map.values().iterator().next();
        for (int i : map.values()) {
            if (i != checker) {
                return false;
            }
        }
        return true;
    }
}