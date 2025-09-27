package mate.academy;

import java.util.Arrays;

public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted[n - 1];
    }
}