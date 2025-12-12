package mate.academy;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    private static int numberOfRepeatingLetters(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 1;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}