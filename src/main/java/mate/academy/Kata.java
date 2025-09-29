package mate.academy;

import java.util.Set;
import java.util.TreeSet;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        Set<Integer> result = new TreeSet<>();
        for (int i : first) {
            result.add(i);
        }
        for (int i : second) {
            result.add(i);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}