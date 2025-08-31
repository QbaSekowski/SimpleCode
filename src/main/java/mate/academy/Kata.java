package mate.academy;

public class Kata {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("n and m should be non-negative");
        }
        int multiplier = 1;
        long sum = 0;
        while (n * multiplier < m) {
            sum += n * multiplier;
            multiplier++;
        }
        return sum;
    }
}
