package mate.academy;

public class DRoot {
    public static int digital_root(int n) {
        while (n >= 10) {
            n = sumOfDigits(n);
        }
        return n;
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}