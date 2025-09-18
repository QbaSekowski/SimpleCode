package mate.academy;

import java.util.ArrayList;
import java.util.List;

public class CubicNumbers {
    public static String findCubicNumbers(String string) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < string.length(); i += 3) {
            int end = Math.min(i + 3, string.length());
            String part = string.substring(i, end);
            numbers.add(Integer.parseInt(part));
        }

    }
}
