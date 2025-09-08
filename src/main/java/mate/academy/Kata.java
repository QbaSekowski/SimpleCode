package mate.academy;

import java.util.LinkedList;
import java.util.List;

public class Kata {
    public static int[] digitize(long n) {
        List<Integer> listOfReversedDigits = new LinkedList<>();
        if (n == 0) {
            return new int[] {0};
        }
        while (n > 0) {
            listOfReversedDigits.add((int) (n % 10));
            n /= 10;
        }
        return listOfReversedDigits.stream().mapToInt(Integer::intValue).toArray();
    }
}
